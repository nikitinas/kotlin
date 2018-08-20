// TODO: muted automatically, investigate should it be ran for JS_IR or not
// IGNORE_BACKEND: JS_IR

// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME


fun box(): String {
    val list1 = ArrayList<Int>()
    val range1 = (3 downTo 5).reversed()
    for (i in range1) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>()) {
        return "Wrong elements for (3 downTo 5).reversed(): $list1"
    }

    val list2 = ArrayList<Int>()
    val range2 = (3.toByte() downTo 5.toByte()).reversed()
    for (i in range2) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Int>()) {
        return "Wrong elements for (3.toByte() downTo 5.toByte()).reversed(): $list2"
    }

    val list3 = ArrayList<Int>()
    val range3 = (3.toShort() downTo 5.toShort()).reversed()
    for (i in range3) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<Int>()) {
        return "Wrong elements for (3.toShort() downTo 5.toShort()).reversed(): $list3"
    }

    val list4 = ArrayList<Long>()
    val range4 = (3.toLong() downTo 5.toLong()).reversed()
    for (i in range4) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<Long>()) {
        return "Wrong elements for (3.toLong() downTo 5.toLong()).reversed(): $list4"
    }

    val list5 = ArrayList<Char>()
    val range5 = ('a' downTo 'c').reversed()
    for (i in range5) {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<Char>()) {
        return "Wrong elements for ('a' downTo 'c').reversed(): $list5"
    }

    return "OK"
}
