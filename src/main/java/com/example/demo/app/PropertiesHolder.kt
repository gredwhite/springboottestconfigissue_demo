package com.example.demo.app


data class PropertiesHolder(
    val props: Array<String>,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PropertiesHolder

        if (!props.contentEquals(other.props)) return false

        return true
    }

    override fun hashCode(): Int {
        return props.contentHashCode()
    }
}