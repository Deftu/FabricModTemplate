plugins {
    id("xyz.deftu.gradle.multiversion-root")
}

preprocess {
    val fabric11903 = createNode("1.19.3-fabric", 11903, "yarn")
    val fabric11902 = createNode("1.19.2-fabric", 11902, "yarn")
    val fabric11802 = createNode("1.18.2-fabric", 11802, "yarn")

    fabric11903.link(fabric11902)
    fabric11902.link(fabric11802)
}
