// !WITH_NEW_INFERENCE
// !CHECK_TYPE
// NI_EXPECTED_FILE

val x get() = <!NI;DEBUG_INFO_MISSING_UNRESOLVED, TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!>x<!>

class A {
    val y get() = <!NI;DEBUG_INFO_MISSING_UNRESOLVED, TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!>y<!>

    val a get() = <!DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>b<!>
    val b get() = <!NI;DEBUG_INFO_MISSING_UNRESOLVED, TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!>a<!>

    val <!NI;IMPLICIT_NOTHING_PROPERTY_TYPE!>z1<!> get() = id(<!NI;DEBUG_INFO_MISSING_UNRESOLVED, OI;DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE, TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!>z1<!>)
    val z2 get() = l(<!NI;DEBUG_INFO_MISSING_UNRESOLVED, OI;DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE, TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!>z2<!>)

    val u get() = <!UNRESOLVED_REFERENCE!>field<!>
}

fun <E> id(x: E) = x
fun <E> l(<!UNUSED_PARAMETER!>x<!>: E): List<E> = null!!
