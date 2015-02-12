// -*- C++ -*-
//===---------------------------- cmath -----------------------------------===//
//
//                     The LLVM Compiler Infrastructure
//
// This file is dual licensed under the MIT and the University of Illinois Open
// Source Licenses. See LICENSE.TXT for details.
//
//===----------------------------------------------------------------------===//

#ifndef _LIBCPP_CMATH
#define _LIBCPP_CMATH

/*
    cmath synopsis

Macros:

    HUGE_VAL
    HUGE_VALF               // C99
    HUGE_VALL               // C99
    INFINITY                // C99
    NAN                     // C99
    FP_INFINITE             // C99
    FP_NAN                  // C99
    FP_NORMAL               // C99
    FP_SUBNORMAL            // C99
    FP_ZERO                 // C99
    FP_FAST_FMA             // C99
    FP_FAST_FMAF            // C99
    FP_FAST_FMAL            // C99
    FP_ILOGB0               // C99
    FP_ILOGBNAN             // C99
    MATH_ERRNO              // C99
    MATH_ERREXCEPT          // C99
    math_errhandling        // C99

namespace std
{

Types:

    float_t                 // C99
    double_t                // C99

// C90

floating_point abs(floating_point x);

floating_point acos (arithmetic x);
float          acosf(float x);
long double    acosl(long double x);

floating_point asin (arithmetic x);
float          asinf(float x);
long double    asinl(long double x);

floating_point atan (arithmetic x);
float          atanf(float x);
long double    atanl(long double x);

floating_point atan2 (arithmetic y, arithmetic x);
float          atan2f(float y, float x);
long double    atan2l(long double y, long double x);

floating_point ceil (arithmetic x);
float          ceilf(float x);
long double    ceill(long double x);

floating_point cos (arithmetic x);
float          cosf(float x);
long double    cosl(long double x);

floating_point cosh (arithmetic x);
float          coshf(float x);
long double    coshl(long double x);

floating_point exp (arithmetic x);
float          expf(float x);
long double    expl(long double x);

floating_point fabs (arithmetic x);
float          fabsf(float x);
long double    fabsl(long double x);

floating_point floor (arithmetic x);
float          floorf(float x);
long double    floorl(long double x);

floating_point fmod (arithmetic x, arithmetic y);
float          fmodf(float x, float y);
long double    fmodl(long double x, long double y);

floating_point frexp (arithmetic value, int* exp);
float          frexpf(float value, int* exp);
long double    frexpl(long double value, int* exp);

floating_point ldexp (arithmetic value, int exp);
float          ldexpf(float value, int exp);
long double    ldexpl(long double value, int exp);

floating_point log (arithmetic x);
float          logf(float x);
long double    logl(long double x);

floating_point log10 (arithmetic x);
float          log10f(float x);
long double    log10l(long double x);

floating_point modf (floating_point value, floating_point* iptr);
float          modff(float value, float* iptr);
long double    modfl(long double value, long double* iptr);

floating_point pow (arithmetic x, arithmetic y);
float          powf(float x, float y);
long double    powl(long double x, long double y);

floating_point sin (arithmetic x);
float          sinf(float x);
long double    sinl(long double x);

floating_point sinh (arithmetic x);
float          sinhf(float x);
long double    sinhl(long double x);

floating_point sqrt (arithmetic x);
float          sqrtf(float x);
long double    sqrtl(long double x);

floating_point tan (arithmetic x);
float          tanf(float x);
long double    tanl(long double x);

floating_point tanh (arithmetic x);
float          tanhf(float x);
long double    tanhl(long double x);

//  C99

bool signbit(arithmetic x);

int fpclassify(arithmetic x);

bool isfinite(arithmetic x);
bool isinf(arithmetic x);
bool isnan(arithmetic x);
bool isnormal(arithmetic x);

bool isgreater(arithmetic x, arithmetic y);
bool isgreaterequal(arithmetic x, arithmetic y);
bool isless(arithmetic x, arithmetic y);
bool islessequal(arithmetic x, arithmetic y);
bool islessgreater(arithmetic x, arithmetic y);
bool isunordered(arithmetic x, arithmetic y);

floating_point acosh (arithmetic x);
float          acoshf(float x);
long double    acoshl(long double x);

floating_point asinh (arithmetic x);
float          asinhf(float x);
long double    asinhl(long double x);

floating_point atanh (arithmetic x);
float          atanhf(float x);
long double    atanhl(long double x);

floating_point cbrt (arithmetic x);
float          cbrtf(float x);
long double    cbrtl(long double x);

floating_point copysign (arithmetic x, arithmetic y);
float          copysignf(float x, float y);
long double    copysignl(long double x, long double y);

floating_point erf (arithmetic x);
float          erff(float x);
long double    erfl(long double x);

floating_point erfc (arithmetic x);
float          erfcf(float x);
long double    erfcl(long double x);

floating_point exp2 (arithmetic x);
float          exp2f(float x);
long double    exp2l(long double x);

floating_point expm1 (arithmetic x);
float          expm1f(float x);
long double    expm1l(long double x);

floating_point fdim (arithmetic x, arithmetic y);
float          fdimf(float x, float y);
long double    fdiml(long double x, long double y);

floating_point fma (arithmetic x, arithmetic y, arithmetic z);
float          fmaf(float x, float y, float z);
long double    fmal(long double x, long double y, long double z);

floating_point fmax (arithmetic x, arithmetic y);
float          fmaxf(float x, float y);
long double    fmaxl(long double x, long double y);

floating_point fmin (arithmetic x, arithmetic y);
float          fminf(float x, float y);
long double    fminl(long double x, long double y);

floating_point hypot (arithmetic x, arithmetic y);
float          hypotf(float x, float y);
long double    hypotl(long double x, long double y);

int ilogb (arithmetic x);
int ilogbf(float x);
int ilogbl(long double x);

floating_point lgamma (arithmetic x);
float          lgammaf(float x);
long double    lgammal(long double x);

long long llrint (arithmetic x);
long long llrintf(float x);
long long llrintl(long double x);

long long llround (arithmetic x);
long long llroundf(float x);
long long llroundl(long double x);

floating_point log1p (arithmetic x);
float          log1pf(float x);
long double    log1pl(long double x);

floating_point log2 (arithmetic x);
float          log2f(float x);
long double    log2l(long double x);

floating_point logb (arithmetic x);
float          logbf(float x);
long double    logbl(long double x);

long lrint (arithmetic x);
long lrintf(float x);
long lrintl(long double x);

long lround (arithmetic x);
long lroundf(float x);
long lroundl(long double x);

double      nan (const char* str);
float       nanf(const char* str);
long double nanl(const char* str);

floating_point nearbyint (arithmetic x);
float          nearbyintf(float x);
long double    nearbyintl(long double x);

floating_point nextafter (arithmetic x, arithmetic y);
float          nextafterf(float x, float y);
long double    nextafterl(long double x, long double y);

floating_point nexttoward (arithmetic x, long double y);
float          nexttowardf(float x, long double y);
long double    nexttowardl(long double x, long double y);

floating_point remainder (arithmetic x, arithmetic y);
float          remainderf(float x, float y);
long double    remainderl(long double x, long double y);

floating_point remquo (arithmetic x, arithmetic y, int* pquo);
float          remquof(float x, float y, int* pquo);
long double    remquol(long double x, long double y, int* pquo);

floating_point rint (arithmetic x);
float          rintf(float x);
long double    rintl(long double x);

floating_point round (arithmetic x);
float          roundf(float x);
long double    roundl(long double x);

floating_point scalbln (arithmetic x, long ex);
float          scalblnf(float x, long ex);
long double    scalblnl(long double x, long ex);

floating_point scalbn (arithmetic x, int ex);
float          scalbnf(float x, int ex);
long double    scalbnl(long double x, int ex);

floating_point tgamma (arithmetic x);
float          tgammaf(float x);
long double    tgammal(long double x);

floating_point trunc (arithmetic x);
float          truncf(float x);
long double    truncl(long double x);

}  // std

*/

#include <__config>
#include <math.h>
#include <type_traits>

#ifdef _LIBCPP_MSVCRT
#include "support/win32/math_win32.h"
#endif

#if !defined(_LIBCPP_HAS_NO_PRAGMA_SYSTEM_HEADER)
#pragma GCC system_header
#endif

// signbit

#ifdef signbit

template <class _A1>
_LIBCPP_ALWAYS_INLINE
bool
__libcpp_signbit(_A1 __x) _NOEXCEPT
{
    return signbit(__x);
}

#undef signbit

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename std::enable_if<std::is_arithmetic<_A1>::value, bool>::type
signbit(_A1 __x) _NOEXCEPT
{
    return __libcpp_signbit((typename std::__promote<_A1>::type)__x);
}

#endif  // signbit

// fpclassify

#ifdef fpclassify

template <class _A1>
_LIBCPP_ALWAYS_INLINE
int
__libcpp_fpclassify(_A1 __x) _NOEXCEPT
{
    return fpclassify(__x);
}

#undef fpclassify

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename std::enable_if<std::is_arithmetic<_A1>::value, int>::type
fpclassify(_A1 __x) _NOEXCEPT
{
    return __libcpp_fpclassify((typename std::__promote<_A1>::type)__x);
}

#endif  // fpclassify

// isfinite

#ifdef isfinite

template <class _A1>
_LIBCPP_ALWAYS_INLINE
bool
__libcpp_isfinite(_A1 __x) _NOEXCEPT
{
    return isfinite(__x);
}

#undef isfinite

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename std::enable_if<std::is_arithmetic<_A1>::value, bool>::type
isfinite(_A1 __x) _NOEXCEPT
{
    return __libcpp_isfinite((typename std::__promote<_A1>::type)__x);
}

#endif  // isfinite

// isinf

#ifdef isinf

template <class _A1>
_LIBCPP_ALWAYS_INLINE
bool
__libcpp_isinf(_A1 __x) _NOEXCEPT
{
    return isinf(__x);
}

#undef isinf

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename std::enable_if<std::is_arithmetic<_A1>::value, bool>::type
isinf(_A1 __x) _NOEXCEPT
{
    return __libcpp_isinf((typename std::__promote<_A1>::type)__x);
}

#endif  // isinf

// isnan

#ifdef isnan

template <class _A1>
_LIBCPP_ALWAYS_INLINE
bool
__libcpp_isnan(_A1 __x) _NOEXCEPT
{
    return isnan(__x);
}

#undef isnan

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename std::enable_if<std::is_arithmetic<_A1>::value, bool>::type
isnan(_A1 __x) _NOEXCEPT
{
    return __libcpp_isnan((typename std::__promote<_A1>::type)__x);
}

#endif  // isnan

// isnormal

#ifdef isnormal

template <class _A1>
_LIBCPP_ALWAYS_INLINE
bool
__libcpp_isnormal(_A1 __x) _NOEXCEPT
{
    return isnormal(__x);
}

#undef isnormal

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename std::enable_if<std::is_arithmetic<_A1>::value, bool>::type
isnormal(_A1 __x) _NOEXCEPT
{
    return __libcpp_isnormal((typename std::__promote<_A1>::type)__x);
}

#endif  // isnormal

// isgreater

#ifdef isgreater

template <class _A1, class _A2>
_LIBCPP_ALWAYS_INLINE
bool
__libcpp_isgreater(_A1 __x, _A2 __y) _NOEXCEPT
{
    return isgreater(__x, __y);
}

#undef isgreater

template <class _A1, class _A2>
inline _LIBCPP_INLINE_VISIBILITY
typename std::enable_if
<
    std::is_arithmetic<_A1>::value &&
    std::is_arithmetic<_A2>::value,
    bool
>::type
isgreater(_A1 __x, _A2 __y) _NOEXCEPT
{
    typedef typename std::__promote<_A1, _A2>::type type;
    return __libcpp_isgreater((type)__x, (type)__y);
}

#endif  // isgreater

// isgreaterequal

#ifdef isgreaterequal

template <class _A1, class _A2>
_LIBCPP_ALWAYS_INLINE
bool
__libcpp_isgreaterequal(_A1 __x, _A2 __y) _NOEXCEPT
{
    return isgreaterequal(__x, __y);
}

#undef isgreaterequal

template <class _A1, class _A2>
inline _LIBCPP_INLINE_VISIBILITY
typename std::enable_if
<
    std::is_arithmetic<_A1>::value &&
    std::is_arithmetic<_A2>::value,
    bool
>::type
isgreaterequal(_A1 __x, _A2 __y) _NOEXCEPT
{
    typedef typename std::__promote<_A1, _A2>::type type;
    return __libcpp_isgreaterequal((type)__x, (type)__y);
}

#endif  // isgreaterequal

// isless

#ifdef isless

template <class _A1, class _A2>
_LIBCPP_ALWAYS_INLINE
bool
__libcpp_isless(_A1 __x, _A2 __y) _NOEXCEPT
{
    return isless(__x, __y);
}

#undef isless

template <class _A1, class _A2>
inline _LIBCPP_INLINE_VISIBILITY
typename std::enable_if
<
    std::is_arithmetic<_A1>::value &&
    std::is_arithmetic<_A2>::value,
    bool
>::type
isless(_A1 __x, _A2 __y) _NOEXCEPT
{
    typedef typename std::__promote<_A1, _A2>::type type;
    return __libcpp_isless((type)__x, (type)__y);
}

#endif  // isless

// islessequal

#ifdef islessequal

template <class _A1, class _A2>
_LIBCPP_ALWAYS_INLINE
bool
__libcpp_islessequal(_A1 __x, _A2 __y) _NOEXCEPT
{
    return islessequal(__x, __y);
}

#undef islessequal

template <class _A1, class _A2>
inline _LIBCPP_INLINE_VISIBILITY
typename std::enable_if
<
    std::is_arithmetic<_A1>::value &&
    std::is_arithmetic<_A2>::value,
    bool
>::type
islessequal(_A1 __x, _A2 __y) _NOEXCEPT
{
    typedef typename std::__promote<_A1, _A2>::type type;
    return __libcpp_islessequal((type)__x, (type)__y);
}

#endif  // islessequal

// islessgreater

#ifdef islessgreater

template <class _A1, class _A2>
_LIBCPP_ALWAYS_INLINE
bool
__libcpp_islessgreater(_A1 __x, _A2 __y) _NOEXCEPT
{
    return islessgreater(__x, __y);
}

#undef islessgreater

template <class _A1, class _A2>
inline _LIBCPP_INLINE_VISIBILITY
typename std::enable_if
<
    std::is_arithmetic<_A1>::value &&
    std::is_arithmetic<_A2>::value,
    bool
>::type
islessgreater(_A1 __x, _A2 __y) _NOEXCEPT
{
    typedef typename std::__promote<_A1, _A2>::type type;
    return __libcpp_islessgreater((type)__x, (type)__y);
}

#endif  // islessgreater

// isunordered

#ifdef isunordered

template <class _A1, class _A2>
_LIBCPP_ALWAYS_INLINE
bool
__libcpp_isunordered(_A1 __x, _A2 __y) _NOEXCEPT
{
    return isunordered(__x, __y);
}

#undef isunordered

template <class _A1, class _A2>
inline _LIBCPP_INLINE_VISIBILITY
typename std::enable_if
<
    std::is_arithmetic<_A1>::value &&
    std::is_arithmetic<_A2>::value,
    bool
>::type
isunordered(_A1 __x, _A2 __y) _NOEXCEPT
{
    typedef typename std::__promote<_A1, _A2>::type type;
    return __libcpp_isunordered((type)__x, (type)__y);
}

#endif  // isunordered

_LIBCPP_BEGIN_NAMESPACE_STD

using ::signbit;
using ::fpclassify;
using ::isfinite;
using ::isinf;
using ::isnan;
using ::isnormal;
using ::isgreater;
using ::isgreaterequal;
using ::isless;
using ::islessequal;
using ::islessgreater;
using ::isunordered;
using ::isunordered;

using ::float_t;
using ::double_t;

// abs

#if !defined(_AIX)
inline _LIBCPP_INLINE_VISIBILITY
float
abs(float __x) _NOEXCEPT {return fabsf(__x);}

inline _LIBCPP_INLINE_VISIBILITY
double
abs(double __x) _NOEXCEPT {return fabs(__x);}

inline _LIBCPP_INLINE_VISIBILITY
long double
abs(long double __x) _NOEXCEPT {return fabsl(__x);}
#endif // !defined(_AIX)

#ifndef __sun__

// acos

using ::acos;
using ::acosf;

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       acos(float __x) _NOEXCEPT       {return acosf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double acos(long double __x) _NOEXCEPT {return acosl(__x);}
#endif

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
acos(_A1 __x) _NOEXCEPT {return acos((double)__x);}

// asin

using ::asin;
using ::asinf;

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       asin(float __x) _NOEXCEPT       {return asinf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double asin(long double __x) _NOEXCEPT {return asinl(__x);}
#endif

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
asin(_A1 __x) _NOEXCEPT {return asin((double)__x);}

// atan

using ::atan;
using ::atanf;

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       atan(float __x) _NOEXCEPT       {return atanf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double atan(long double __x) _NOEXCEPT {return atanl(__x);}
#endif

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
atan(_A1 __x) _NOEXCEPT {return atan((double)__x);}

// atan2

using ::atan2;
using ::atan2f;

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       atan2(float __y, float __x) _NOEXCEPT             {return atan2f(__y, __x);}
inline _LIBCPP_INLINE_VISIBILITY long double atan2(long double __y, long double __x) _NOEXCEPT {return atan2l(__y, __x);}
#endif

template <class _A1, class _A2>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if
<
    is_arithmetic<_A1>::value &&
    is_arithmetic<_A2>::value,
    typename __promote<_A1, _A2>::type
>::type
atan2(_A1 __y, _A2 __x) _NOEXCEPT
{
    typedef typename __promote<_A1, _A2>::type __result_type;
    static_assert((!(is_same<_A1, __result_type>::value &&
                      is_same<_A2, __result_type>::value)), "");
    return atan2((__result_type)__y, (__result_type)__x);
}

// ceil

using ::ceil;
using ::ceilf;

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       ceil(float __x) _NOEXCEPT       {return ceilf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double ceil(long double __x) _NOEXCEPT {return ceill(__x);}
#endif

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
ceil(_A1 __x) _NOEXCEPT {return ceil((double)__x);}

// cos

using ::cos;
using ::cosf;

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       cos(float __x) _NOEXCEPT       {return cosf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double cos(long double __x) _NOEXCEPT {return cosl(__x);}
#endif

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
cos(_A1 __x) _NOEXCEPT {return cos((double)__x);}

// cosh

using ::cosh;
using ::coshf;

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       cosh(float __x) _NOEXCEPT       {return coshf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double cosh(long double __x) _NOEXCEPT {return coshl(__x);}
#endif

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
cosh(_A1 __x) _NOEXCEPT {return cosh((double)__x);}

#endif // __sun__
// exp

using ::exp;
using ::expf;

#ifndef __sun__

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       exp(float __x) _NOEXCEPT       {return expf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double exp(long double __x) _NOEXCEPT {return expl(__x);}
#endif


template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
exp(_A1 __x) _NOEXCEPT {return exp((double)__x);}

// fabs

using ::fabs;
using ::fabsf;

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       fabs(float __x) _NOEXCEPT       {return fabsf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double fabs(long double __x) _NOEXCEPT {return fabsl(__x);}
#endif

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
fabs(_A1 __x) _NOEXCEPT {return fabs((double)__x);}

// floor

using ::floor;
using ::floorf;

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       floor(float __x) _NOEXCEPT       {return floorf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double floor(long double __x) _NOEXCEPT {return floorl(__x);}
#endif

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
floor(_A1 __x) _NOEXCEPT {return floor((double)__x);}

// fmod

#endif //__sun__
using ::fmod;
using ::fmodf;
#ifndef __sun__

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       fmod(float __x, float __y) _NOEXCEPT             {return fmodf(__x, __y);}
inline _LIBCPP_INLINE_VISIBILITY long double fmod(long double __x, long double __y) _NOEXCEPT {return fmodl(__x, __y);}
#endif

template <class _A1, class _A2>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if
<
    is_arithmetic<_A1>::value &&
    is_arithmetic<_A2>::value,
    typename __promote<_A1, _A2>::type
>::type
fmod(_A1 __x, _A2 __y) _NOEXCEPT
{
    typedef typename __promote<_A1, _A2>::type __result_type;
    static_assert((!(is_same<_A1, __result_type>::value &&
                      is_same<_A2, __result_type>::value)), "");
    return fmod((__result_type)__x, (__result_type)__y);
}


// frexp

using ::frexp;
using ::frexpf;

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       frexp(float __x, int* __e) _NOEXCEPT       {return frexpf(__x, __e);}
inline _LIBCPP_INLINE_VISIBILITY long double frexp(long double __x, int* __e) _NOEXCEPT {return frexpl(__x, __e);}
#endif

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
frexp(_A1 __x, int* __e) _NOEXCEPT {return frexp((double)__x, __e);}

// ldexp

using ::ldexp;
using ::ldexpf;

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       ldexp(float __x, int __e) _NOEXCEPT       {return ldexpf(__x, __e);}
inline _LIBCPP_INLINE_VISIBILITY long double ldexp(long double __x, int __e) _NOEXCEPT {return ldexpl(__x, __e);}
#endif

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
ldexp(_A1 __x, int __e) _NOEXCEPT {return ldexp((double)__x, __e);}

// log

#endif // __sun__
using ::log;
using ::logf;
#ifndef __sun__

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       log(float __x) _NOEXCEPT       {return logf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double log(long double __x) _NOEXCEPT {return logl(__x);}
#endif

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
log(_A1 __x) _NOEXCEPT {return log((double)__x);}


// log10

using ::log10;
using ::log10f;

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       log10(float __x) _NOEXCEPT       {return log10f(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double log10(long double __x) _NOEXCEPT {return log10l(__x);}
#endif

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
log10(_A1 __x) _NOEXCEPT {return log10((double)__x);}

// modf

using ::modf;
using ::modff;

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       modf(float __x, float* __y) _NOEXCEPT             {return modff(__x, __y);}
inline _LIBCPP_INLINE_VISIBILITY long double modf(long double __x, long double* __y) _NOEXCEPT {return modfl(__x, __y);}
#endif

// pow

#endif // __sun__ 
using ::pow;
using ::powf;

#ifndef __sun__

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       pow(float __x, float __y) _NOEXCEPT             {return powf(__x, __y);}
inline _LIBCPP_INLINE_VISIBILITY long double pow(long double __x, long double __y) _NOEXCEPT {return powl(__x, __y);}
#endif

template <class _A1, class _A2>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if
<
    is_arithmetic<_A1>::value &&
    is_arithmetic<_A2>::value,
    typename __promote<_A1, _A2>::type
>::type
pow(_A1 __x, _A2 __y) _NOEXCEPT
{
    typedef typename __promote<_A1, _A2>::type __result_type;
    static_assert((!(is_same<_A1, __result_type>::value &&
                      is_same<_A2, __result_type>::value)), "");
    return pow((__result_type)__x, (__result_type)__y);
}


// sin

using ::sin;
using ::sinf;

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       sin(float __x) _NOEXCEPT       {return sinf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double sin(long double __x) _NOEXCEPT {return sinl(__x);}
#endif

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
sin(_A1 __x) _NOEXCEPT {return sin((double)__x);}

// sinh

using ::sinh;
using ::sinhf;

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       sinh(float __x) _NOEXCEPT       {return sinhf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double sinh(long double __x) _NOEXCEPT {return sinhl(__x);}
#endif

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
sinh(_A1 __x) _NOEXCEPT {return sinh((double)__x);}

// sqrt

#endif // __sun__
using ::sqrt;
using ::sqrtf;


#if !(defined(_LIBCPP_MSVCRT) || defined(__sun__) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       sqrt(float __x) _NOEXCEPT       {return sqrtf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double sqrt(long double __x) _NOEXCEPT {return sqrtl(__x);}
#endif

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
sqrt(_A1 __x) _NOEXCEPT {return sqrt((double)__x);}

// tan

using ::tan;
using ::tanf;
#ifndef __sun__

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       tan(float __x) _NOEXCEPT       {return tanf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double tan(long double __x) _NOEXCEPT {return tanl(__x);}
#endif

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
tan(_A1 __x) _NOEXCEPT {return tan((double)__x);}

// tanh

using ::tanh;
using ::tanhf;

#if !(defined(_LIBCPP_MSVCRT) || defined(_AIX))
inline _LIBCPP_INLINE_VISIBILITY float       tanh(float __x) _NOEXCEPT       {return tanhf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double tanh(long double __x) _NOEXCEPT {return tanhl(__x);}
#endif

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
tanh(_A1 __x) _NOEXCEPT {return tanh((double)__x);}

// acosh

#ifndef _LIBCPP_MSVCRT
using ::acosh;
using ::acoshf;

inline _LIBCPP_INLINE_VISIBILITY float       acosh(float __x) _NOEXCEPT       {return acoshf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double acosh(long double __x) _NOEXCEPT {return acoshl(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
acosh(_A1 __x) _NOEXCEPT {return acosh((double)__x);}
#endif

// asinh

#ifndef _LIBCPP_MSVCRT
using ::asinh;
using ::asinhf;

inline _LIBCPP_INLINE_VISIBILITY float       asinh(float __x) _NOEXCEPT       {return asinhf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double asinh(long double __x) _NOEXCEPT {return asinhl(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
asinh(_A1 __x) _NOEXCEPT {return asinh((double)__x);}
#endif

// atanh

#ifndef _LIBCPP_MSVCRT
using ::atanh;
using ::atanhf;

inline _LIBCPP_INLINE_VISIBILITY float       atanh(float __x) _NOEXCEPT       {return atanhf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double atanh(long double __x) _NOEXCEPT {return atanhl(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
atanh(_A1 __x) _NOEXCEPT {return atanh((double)__x);}
#endif

// cbrt

#ifndef _LIBCPP_MSVCRT
using ::cbrt;
using ::cbrtf;

inline _LIBCPP_INLINE_VISIBILITY float       cbrt(float __x) _NOEXCEPT       {return cbrtf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double cbrt(long double __x) _NOEXCEPT {return cbrtl(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
cbrt(_A1 __x) _NOEXCEPT {return cbrt((double)__x);}
#endif

// copysign

using ::copysign;
using ::copysignf;

inline _LIBCPP_INLINE_VISIBILITY float       copysign(float __x, float __y) _NOEXCEPT             {return copysignf(__x, __y);}
inline _LIBCPP_INLINE_VISIBILITY long double copysign(long double __x, long double __y) _NOEXCEPT {return copysignl(__x, __y);}

template <class _A1, class _A2>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if
<
    is_arithmetic<_A1>::value &&
    is_arithmetic<_A2>::value,
    typename __promote<_A1, _A2>::type
>::type
copysign(_A1 __x, _A2 __y) _NOEXCEPT
{
    typedef typename __promote<_A1, _A2>::type __result_type;
    static_assert((!(is_same<_A1, __result_type>::value &&
                      is_same<_A2, __result_type>::value)), "");
    return copysign((__result_type)__x, (__result_type)__y);
}

#ifndef _LIBCPP_MSVCRT

// erf

using ::erf;
using ::erff;

inline _LIBCPP_INLINE_VISIBILITY float       erf(float __x) _NOEXCEPT       {return erff(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double erf(long double __x) _NOEXCEPT {return erfl(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
erf(_A1 __x) _NOEXCEPT {return erf((double)__x);}

// erfc

using ::erfc;
using ::erfcf;

inline _LIBCPP_INLINE_VISIBILITY float       erfc(float __x) _NOEXCEPT       {return erfcf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double erfc(long double __x) _NOEXCEPT {return erfcl(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
erfc(_A1 __x) _NOEXCEPT {return erfc((double)__x);}

// exp2

using ::exp2;
using ::exp2f;

inline _LIBCPP_INLINE_VISIBILITY float       exp2(float __x) _NOEXCEPT       {return exp2f(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double exp2(long double __x) _NOEXCEPT {return exp2l(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
exp2(_A1 __x) _NOEXCEPT {return exp2((double)__x);}

// expm1

using ::expm1;
using ::expm1f;

inline _LIBCPP_INLINE_VISIBILITY float       expm1(float __x) _NOEXCEPT       {return expm1f(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double expm1(long double __x) _NOEXCEPT {return expm1l(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
expm1(_A1 __x) _NOEXCEPT {return expm1((double)__x);}

// fdim

using ::fdim;
using ::fdimf;

inline _LIBCPP_INLINE_VISIBILITY float       fdim(float __x, float __y) _NOEXCEPT             {return fdimf(__x, __y);}
inline _LIBCPP_INLINE_VISIBILITY long double fdim(long double __x, long double __y) _NOEXCEPT {return fdiml(__x, __y);}

template <class _A1, class _A2>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if
<
    is_arithmetic<_A1>::value &&
    is_arithmetic<_A2>::value,
    typename __promote<_A1, _A2>::type
>::type
fdim(_A1 __x, _A2 __y) _NOEXCEPT
{
    typedef typename __promote<_A1, _A2>::type __result_type;
    static_assert((!(is_same<_A1, __result_type>::value &&
                      is_same<_A2, __result_type>::value)), "");
    return fdim((__result_type)__x, (__result_type)__y);
}

// fma

inline _LIBCPP_INLINE_VISIBILITY float fmaf(float __x, float __y, float __z) _NOEXCEPT {return (float)((double)__x*__y + __z);}
#ifndef FP_FAST_FMAF
#define FP_FAST_FMAF
#endif

using ::fma;

inline _LIBCPP_INLINE_VISIBILITY float       fma(float __x, float __y, float __z) _NOEXCEPT                   {return fmaf(__x, __y, __z);}
inline _LIBCPP_INLINE_VISIBILITY long double fma(long double __x, long double __y, long double __z) _NOEXCEPT {return fmal(__x, __y, __z);}

template <class _A1, class _A2, class _A3>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if
<
    is_arithmetic<_A1>::value &&
    is_arithmetic<_A2>::value &&
    is_arithmetic<_A3>::value,
    typename __promote<_A1, _A2, _A3>::type
>::type
fma(_A1 __x, _A2 __y, _A3 __z) _NOEXCEPT
{
    typedef typename __promote<_A1, _A2, _A3>::type __result_type;
    static_assert((!(is_same<_A1, __result_type>::value &&
                      is_same<_A2, __result_type>::value &&
                      is_same<_A3, __result_type>::value)), "");
    return fma((__result_type)__x, (__result_type)__y, (__result_type)__z);
}

// fmax

using ::fmax;
using ::fmaxf;

inline _LIBCPP_INLINE_VISIBILITY float       fmax(float __x, float __y) _NOEXCEPT             {return fmaxf(__x, __y);}
inline _LIBCPP_INLINE_VISIBILITY long double fmax(long double __x, long double __y) _NOEXCEPT {return fmaxl(__x, __y);}

template <class _A1, class _A2>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if
<
    is_arithmetic<_A1>::value &&
    is_arithmetic<_A2>::value,
    typename __promote<_A1, _A2>::type
>::type
fmax(_A1 __x, _A2 __y) _NOEXCEPT
{
    typedef typename __promote<_A1, _A2>::type __result_type;
    static_assert((!(is_same<_A1, __result_type>::value &&
                      is_same<_A2, __result_type>::value)), "");
    return fmax((__result_type)__x, (__result_type)__y);
}

// fmin

using ::fmin;
using ::fminf;

inline _LIBCPP_INLINE_VISIBILITY float       fmin(float __x, float __y) _NOEXCEPT             {return fminf(__x, __y);}
inline _LIBCPP_INLINE_VISIBILITY long double fmin(long double __x, long double __y) _NOEXCEPT {return fminl(__x, __y);}

template <class _A1, class _A2>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if
<
    is_arithmetic<_A1>::value &&
    is_arithmetic<_A2>::value,
    typename __promote<_A1, _A2>::type
>::type
fmin(_A1 __x, _A2 __y) _NOEXCEPT
{
    typedef typename __promote<_A1, _A2>::type __result_type;
    static_assert((!(is_same<_A1, __result_type>::value &&
                      is_same<_A2, __result_type>::value)), "");
    return fmin((__result_type)__x, (__result_type)__y);
}

// hypot

using ::hypot;
using ::hypotf;

inline _LIBCPP_INLINE_VISIBILITY float       hypot(float __x, float __y) _NOEXCEPT             {return hypotf(__x, __y);}
inline _LIBCPP_INLINE_VISIBILITY long double hypot(long double __x, long double __y) _NOEXCEPT {return hypotl(__x, __y);}

template <class _A1, class _A2>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if
<
    is_arithmetic<_A1>::value &&
    is_arithmetic<_A2>::value,
    typename __promote<_A1, _A2>::type
>::type
hypot(_A1 __x, _A2 __y) _NOEXCEPT
{
    typedef typename __promote<_A1, _A2>::type __result_type;
    static_assert((!(is_same<_A1, __result_type>::value &&
                      is_same<_A2, __result_type>::value)), "");
    return hypot((__result_type)__x, (__result_type)__y);
}

// ilogb

using ::ilogb;
using ::ilogbf;

inline _LIBCPP_INLINE_VISIBILITY int ilogb(float __x) _NOEXCEPT       {return ilogbf(__x);}
inline _LIBCPP_INLINE_VISIBILITY int ilogb(long double __x) _NOEXCEPT {return ilogbl(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, int>::type
ilogb(_A1 __x) _NOEXCEPT {return ilogb((double)__x);}

// lgamma

using ::lgamma;
using ::lgammaf;

inline _LIBCPP_INLINE_VISIBILITY float       lgamma(float __x) _NOEXCEPT       {return lgammaf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double lgamma(long double __x) _NOEXCEPT {return lgammal(__x);}


template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
lgamma(_A1 __x) _NOEXCEPT {return lgamma((double)__x);}


// llrint

using ::llrint;
using ::llrintf;

inline _LIBCPP_INLINE_VISIBILITY long long llrint(float __x) _NOEXCEPT       {return llrintf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long long llrint(long double __x) _NOEXCEPT {return llrintl(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, long long>::type
llrint(_A1 __x) _NOEXCEPT {return llrint((double)__x);}

// llround

using ::llround;
using ::llroundf;

inline _LIBCPP_INLINE_VISIBILITY long long llround(float __x) _NOEXCEPT       {return llroundf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long long llround(long double __x) _NOEXCEPT {return llroundl(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, long long>::type
llround(_A1 __x) _NOEXCEPT {return llround((double)__x);}

// log1p

using ::log1p;
using ::log1pf;

inline _LIBCPP_INLINE_VISIBILITY float       log1p(float __x) _NOEXCEPT       {return log1pf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double log1p(long double __x) _NOEXCEPT {return log1pl(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
log1p(_A1 __x) _NOEXCEPT {return log1p((double)__x);}

// log2

using ::log2;
using ::log2f;

inline _LIBCPP_INLINE_VISIBILITY float       log2(float __x) _NOEXCEPT       {return log2f(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double log2(long double __x) _NOEXCEPT {return log2l(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
log2(_A1 __x) _NOEXCEPT {return log2((double)__x);}

// logb

using ::logb;
using ::logbf;

inline _LIBCPP_INLINE_VISIBILITY float       logb(float __x) _NOEXCEPT       {return logbf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double logb(long double __x) _NOEXCEPT {return logbl(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
logb(_A1 __x) _NOEXCEPT {return logb((double)__x);}

// lrint

using ::lrint;
using ::lrintf;

inline _LIBCPP_INLINE_VISIBILITY long lrint(float __x) _NOEXCEPT       {return lrintf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long lrint(long double __x) _NOEXCEPT {return lrintl(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, long>::type
lrint(_A1 __x) _NOEXCEPT {return lrint((double)__x);}

// lround

using ::lround;
using ::lroundf;

inline _LIBCPP_INLINE_VISIBILITY long lround(float __x) _NOEXCEPT       {return lroundf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long lround(long double __x) _NOEXCEPT {return lroundl(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, long>::type
lround(_A1 __x) _NOEXCEPT {return lround((double)__x);}

#endif // _LIBCPP_MSVCRT
#endif // __sun__

// nan

#ifndef _LIBCPP_MSVCRT
using ::nan;
using ::nanf;
#endif // _LIBCPP_MSVCRT

#ifndef __sun__
#ifndef _LIBCPP_MSVCRT

// nearbyint

using ::nearbyint;
using ::nearbyintf;

inline _LIBCPP_INLINE_VISIBILITY float       nearbyint(float __x) _NOEXCEPT       {return nearbyintf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double nearbyint(long double __x) _NOEXCEPT {return nearbyintl(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
nearbyint(_A1 __x) _NOEXCEPT {return nearbyint((double)__x);}

// nextafter

using ::nextafter;
using ::nextafterf;

inline _LIBCPP_INLINE_VISIBILITY float       nextafter(float __x, float __y) _NOEXCEPT             {return nextafterf(__x, __y);}
inline _LIBCPP_INLINE_VISIBILITY long double nextafter(long double __x, long double __y) _NOEXCEPT {return nextafterl(__x, __y);}

template <class _A1, class _A2>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if
<
    is_arithmetic<_A1>::value &&
    is_arithmetic<_A2>::value,
    typename __promote<_A1, _A2>::type
>::type
nextafter(_A1 __x, _A2 __y) _NOEXCEPT
{
    typedef typename __promote<_A1, _A2>::type __result_type;
    static_assert((!(is_same<_A1, __result_type>::value &&
                      is_same<_A2, __result_type>::value)), "");
    return nextafter((__result_type)__x, (__result_type)__y);
}

// nexttoward

using ::nexttoward;
using ::nexttowardf;

inline _LIBCPP_INLINE_VISIBILITY float       nexttoward(float __x, long double __y) _NOEXCEPT       {return nexttowardf(__x, __y);}
inline _LIBCPP_INLINE_VISIBILITY long double nexttoward(long double __x, long double __y) _NOEXCEPT {return nexttowardl(__x, __y);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
nexttoward(_A1 __x, long double __y) _NOEXCEPT {return nexttoward((double)__x, __y);}

// remainder

using ::remainder;
using ::remainderf;

inline _LIBCPP_INLINE_VISIBILITY float       remainder(float __x, float __y) _NOEXCEPT             {return remainderf(__x, __y);}
inline _LIBCPP_INLINE_VISIBILITY long double remainder(long double __x, long double __y) _NOEXCEPT {return remainderl(__x, __y);}

template <class _A1, class _A2>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if
<
    is_arithmetic<_A1>::value &&
    is_arithmetic<_A2>::value,
    typename __promote<_A1, _A2>::type
>::type
remainder(_A1 __x, _A2 __y) _NOEXCEPT
{
    typedef typename __promote<_A1, _A2>::type __result_type;
    static_assert((!(is_same<_A1, __result_type>::value &&
                      is_same<_A2, __result_type>::value)), "");
    return remainder((__result_type)__x, (__result_type)__y);
}

// remquo

using ::remquo;
using ::remquof;

inline _LIBCPP_INLINE_VISIBILITY float       remquo(float __x, float __y, int* __z) _NOEXCEPT             {return remquof(__x, __y, __z);}
inline _LIBCPP_INLINE_VISIBILITY long double remquo(long double __x, long double __y, int* __z) _NOEXCEPT {return remquol(__x, __y, __z);}

template <class _A1, class _A2>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if
<
    is_arithmetic<_A1>::value &&
    is_arithmetic<_A2>::value,
    typename __promote<_A1, _A2>::type
>::type
remquo(_A1 __x, _A2 __y, int* __z) _NOEXCEPT
{
    typedef typename __promote<_A1, _A2>::type __result_type;
    static_assert((!(is_same<_A1, __result_type>::value &&
                      is_same<_A2, __result_type>::value)), "");
    return remquo((__result_type)__x, (__result_type)__y, __z);
}

// rint

using ::rint;
using ::rintf;

inline _LIBCPP_INLINE_VISIBILITY float       rint(float __x) _NOEXCEPT       {return rintf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double rint(long double __x) _NOEXCEPT {return rintl(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
rint(_A1 __x) _NOEXCEPT {return rint((double)__x);}

// round

using ::round;
using ::roundf;

inline _LIBCPP_INLINE_VISIBILITY float       round(float __x) _NOEXCEPT       {return roundf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double round(long double __x) _NOEXCEPT {return roundl(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
round(_A1 __x) _NOEXCEPT {return round((double)__x);}

// scalbln

using ::scalbln;
using ::scalblnf;

inline _LIBCPP_INLINE_VISIBILITY float       scalbln(float __x, long __y) _NOEXCEPT       {return scalblnf(__x, __y);}
inline _LIBCPP_INLINE_VISIBILITY long double scalbln(long double __x, long __y) _NOEXCEPT {return scalblnl(__x, __y);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
scalbln(_A1 __x, long __y) _NOEXCEPT {return scalbln((double)__x, __y);}

// scalbn

using ::scalbn;
using ::scalbnf;

inline _LIBCPP_INLINE_VISIBILITY float       scalbn(float __x, int __y) _NOEXCEPT       {return scalbnf(__x, __y);}
inline _LIBCPP_INLINE_VISIBILITY long double scalbn(long double __x, int __y) _NOEXCEPT {return scalbnl(__x, __y);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
scalbn(_A1 __x, int __y) _NOEXCEPT {return scalbn((double)__x, __y);}

// tgamma

using ::tgamma;
using ::tgammaf;

inline _LIBCPP_INLINE_VISIBILITY float       tgamma(float __x) _NOEXCEPT       {return tgammaf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double tgamma(long double __x) _NOEXCEPT {return tgammal(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
tgamma(_A1 __x) _NOEXCEPT {return tgamma((double)__x);}

// trunc

using ::trunc;
using ::truncf;

inline _LIBCPP_INLINE_VISIBILITY float       trunc(float __x) _NOEXCEPT       {return truncf(__x);}
inline _LIBCPP_INLINE_VISIBILITY long double trunc(long double __x) _NOEXCEPT {return truncl(__x);}

template <class _A1>
inline _LIBCPP_INLINE_VISIBILITY
typename enable_if<is_integral<_A1>::value, double>::type
trunc(_A1 __x) _NOEXCEPT {return trunc((double)__x);}

#endif // !_LIBCPP_MSVCRT

using ::acosl;
using ::asinl;
using ::atanl;
using ::atan2l;
using ::ceill;
using ::cosl;
using ::coshl;
using ::expl;
using ::fabsl;
using ::floorl;
using ::fmodl;
using ::frexpl;
using ::ldexpl;
using ::logl;
using ::log10l;
using ::modfl;
using ::powl;
using ::sinl;
using ::sinhl;
using ::sqrtl;
using ::tanl;
#ifndef _LIBCPP_MSVCRT
using ::tanhl;
using ::acoshl;
using ::asinhl;
using ::atanhl;
using ::cbrtl;
#endif  // !_LIBCPP_MSVCRT
using ::copysignl;
#ifndef _LIBCPP_MSVCRT
using ::erfl;
using ::erfcl;
using ::exp2l;
using ::expm1l;
using ::fdiml;
using ::fmal;
using ::fmaxl;
using ::fminl;
using ::hypotl;
using ::ilogbl;
using ::lgammal;
using ::llrintl;
using ::llroundl;
using ::log1pl;
using ::log2l;
using ::logbl;
using ::lrintl;
using ::lroundl;
using ::nanl;
using ::nearbyintl;
using ::nextafterl;
using ::nexttowardl;
using ::remainderl;
using ::remquol;
using ::rintl;
using ::roundl;
using ::scalblnl;
using ::scalbnl;
using ::tgammal;
using ::truncl;
#endif // !_LIBCPP_MSVCRT

#else 
using ::lgamma;
using ::lgammaf;
#endif // __sun__
_LIBCPP_END_NAMESPACE_STD

#endif  // _LIBCPP_CMATH
