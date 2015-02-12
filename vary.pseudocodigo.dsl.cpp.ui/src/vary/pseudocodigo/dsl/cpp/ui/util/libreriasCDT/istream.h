// -*- C++ -*-
//===--------------------------- istream ----------------------------------===//
//
//                     The LLVM Compiler Infrastructure
//
// This file is dual licensed under the MIT and the University of Illinois Open
// Source Licenses. See LICENSE.TXT for details.
//
//===----------------------------------------------------------------------===//

#ifndef _LIBCPP_ISTREAM
#define _LIBCPP_ISTREAM

/*
    istream synopsis

template <class charT, class traits = char_traits<charT> >
class basic_istream
    : virtual public basic_ios<charT,traits>
{
public:
    // types (inherited from basic_ios (27.5.4)):
    typedef charT                          char_type;
    typedef traits                         traits_type;
    typedef typename traits_type::int_type int_type;
    typedef typename traits_type::pos_type pos_type;
    typedef typename traits_type::off_type off_type;

    // 27.7.1.1.1 Constructor/destructor:
    explicit basic_istream(basic_streambuf<char_type, traits_type>* sb);
    basic_istream(basic_istream&& rhs);
    virtual ~basic_istream();

    // 27.7.1.1.2 Assign/swap:
    basic_istream& operator=(basic_istream&& rhs);
    void swap(basic_istream& rhs);

    // 27.7.1.1.3 Prefix/suffix:
    class sentry;

    // 27.7.1.2 Formatted input:
    basic_istream& operator>>(basic_istream& (*pf)(basic_istream&));
    basic_istream& operator>>(basic_ios<char_type, traits_type>&
                              (*pf)(basic_ios<char_type, traits_type>&));
    basic_istream& operator>>(ios_base& (*pf)(ios_base&));
    basic_istream& operator>>(basic_streambuf<char_type, traits_type>* sb);
    basic_istream& operator>>(bool& n);
    basic_istream& operator>>(short& n);
    basic_istream& operator>>(unsigned short& n);
    basic_istream& operator>>(int& n);
    basic_istream& operator>>(unsigned int& n);
    basic_istream& operator>>(long& n);
    basic_istream& operator>>(unsigned long& n);
    basic_istream& operator>>(long long& n);
    basic_istream& operator>>(unsigned long long& n);
    basic_istream& operator>>(float& f);
    basic_istream& operator>>(double& f);
    basic_istream& operator>>(long double& f);
    basic_istream& operator>>(void*& p);

    // 27.7.1.3 Unformatted input:
    streamsize gcount() const;
    int_type get();
    basic_istream& get(char_type& c);
    basic_istream& get(char_type* s, streamsize n);
    basic_istream& get(char_type* s, streamsize n, char_type delim);
    basic_istream& get(basic_streambuf<char_type,traits_type>& sb);
    basic_istream& get(basic_streambuf<char_type,traits_type>& sb, char_type delim);

    basic_istream& getline(char_type* s, streamsize n);
    basic_istream& getline(char_type* s, streamsize n, char_type delim);

    basic_istream& ignore(streamsize n = 1, int_type delim = traits_type::eof());
    int_type peek();
    basic_istream& read (char_type* s, streamsize n);
    streamsize readsome(char_type* s, streamsize n);

    basic_istream& putback(char_type c);
    basic_istream& unget();
    int sync();

    pos_type tellg();
    basic_istream& seekg(pos_type);
    basic_istream& seekg(off_type, ios_base::seekdir);
};

// 27.7.1.2.3 character extraction templates:
template<class charT, class traits>
  basic_istream<charT,traits>& operator>>(basic_istream<charT,traits>&, charT&);

template<class traits>
  basic_istream<char,traits>& operator>>(basic_istream<char,traits>&, unsigned char&);

template<class traits>
  basic_istream<char,traits>& operator>>(basic_istream<char,traits>&, signed char&);

template<class charT, class traits>
  basic_istream<charT,traits>& operator>>(basic_istream<charT,traits>&, charT*);

template<class traits>
  basic_istream<char,traits>& operator>>(basic_istream<char,traits>&, unsigned char*);

template<class traits>
  basic_istream<char,traits>& operator>>(basic_istream<char,traits>&, signed char*);

template <class charT, class traits>
  void
  swap(basic_istream<charT, traits>& x, basic_istream<charT, traits>& y);

typedef basic_istream<char> istream;
typedef basic_istream<wchar_t> wistream;

template <class charT, class traits = char_traits<charT> >
class basic_iostream :
    public basic_istream<charT,traits>,
    public basic_ostream<charT,traits>
{
public:
    // types:
    typedef charT                          char_type;
    typedef traits                         traits_type;
    typedef typename traits_type::int_type int_type;
    typedef typename traits_type::pos_type pos_type;
    typedef typename traits_type::off_type off_type;

    // constructor/destructor
    explicit basic_iostream(basic_streambuf<char_type, traits_type>* sb);
    basic_iostream(basic_iostream&& rhs);
    virtual ~basic_iostream();

    // assign/swap
    basic_iostream& operator=(basic_iostream&& rhs);
    void swap(basic_iostream& rhs);
};

template <class charT, class traits>
  void
  swap(basic_iostream<charT, traits>& x, basic_iostream<charT, traits>& y);

typedef basic_iostream<char> iostream;
typedef basic_iostream<wchar_t> wiostream;

template <class charT, class traits>
  basic_istream<charT,traits>&
  ws(basic_istream<charT,traits>& is);

template <class charT, class traits, class T>
  basic_istream<charT, traits>&
  operator>>(basic_istream<charT, traits>&& is, T& x);

}  // std

*/

#include <__config>
#include <ostream>

#include <__undef_min_max>

#if !defined(_LIBCPP_HAS_NO_PRAGMA_SYSTEM_HEADER)
#pragma GCC system_header
#endif

_LIBCPP_BEGIN_NAMESPACE_STD

template <class _CharT, class _Traits>
class _LIBCPP_TYPE_VIS_ONLY basic_istream
    : virtual public basic_ios<_CharT, _Traits>
{
    streamsize __gc_;
public:
    // types (inherited from basic_ios (27.5.4)):
    typedef _CharT                         char_type;
    typedef _Traits                        traits_type;
    typedef typename traits_type::int_type int_type;
    typedef typename traits_type::pos_type pos_type;
    typedef typename traits_type::off_type off_type;

    // 27.7.1.1.1 Constructor/destructor:
    explicit basic_istream(basic_streambuf<char_type, traits_type>* __sb);
    virtual ~basic_istream();
protected:
#ifndef _LIBCPP_HAS_NO_RVALUE_REFERENCES
    _LIBCPP_INLINE_VISIBILITY
    basic_istream(basic_istream&& __rhs);
#endif

    // 27.7.1.1.2 Assign/swap:
#ifndef _LIBCPP_HAS_NO_RVALUE_REFERENCES
    _LIBCPP_INLINE_VISIBILITY
    basic_istream& operator=(basic_istream&& __rhs);
#endif
    void swap(basic_istream& __rhs);
public:

    // 27.7.1.1.3 Prefix/suffix:
    class _LIBCPP_TYPE_VIS_ONLY sentry;

    // 27.7.1.2 Formatted input:
    basic_istream& operator>>(basic_istream& (*__pf)(basic_istream&));
    basic_istream& operator>>(basic_ios<char_type, traits_type>&
                              (*__pf)(basic_ios<char_type, traits_type>&));
    basic_istream& operator>>(ios_base& (*__pf)(ios_base&));
    basic_istream& operator>>(basic_streambuf<char_type, traits_type>* __sb);
    basic_istream& operator>>(bool& __n);
    basic_istream& operator>>(short& __n);
    basic_istream& operator>>(unsigned short& __n);
    basic_istream& operator>>(int& __n);
    basic_istream& operator>>(unsigned int& __n);
    basic_istream& operator>>(long& __n);
    basic_istream& operator>>(unsigned long& __n);
    basic_istream& operator>>(long long& __n);
    basic_istream& operator>>(unsigned long long& __n);
    basic_istream& operator>>(float& __f);
    basic_istream& operator>>(double& __f);
    basic_istream& operator>>(long double& __f);
    basic_istream& operator>>(void*& __p);

    // 27.7.1.3 Unformatted input:
    _LIBCPP_INLINE_VISIBILITY
    streamsize gcount() const {return __gc_;}
    int_type get();
    basic_istream& get(char_type& __c);
    basic_istream& get(char_type* __s, streamsize __n);
    basic_istream& get(char_type* __s, streamsize __n, char_type __dlm);
    basic_istream& get(basic_streambuf<char_type, traits_type>& __sb);
    basic_istream& get(basic_streambuf<char_type, traits_type>& __sb, char_type __dlm);

    basic_istream& getline(char_type* __s, streamsize __n);
    basic_istream& getline(char_type* __s, streamsize __n, char_type __dlm);

    basic_istream& ignore(streamsize __n = 1, int_type __dlm = traits_type::eof());
    int_type peek();
    basic_istream& read (char_type* __s, streamsize __n);
    streamsize readsome(char_type* __s, streamsize __n);

    basic_istream& putback(char_type __c);
    basic_istream& unget();
    int sync();

    pos_type tellg();
    basic_istream& seekg(pos_type __pos);
    basic_istream& seekg(off_type __off, ios_base::seekdir __dir);
};

template <class _CharT, class _Traits>
class _LIBCPP_TYPE_VIS_ONLY basic_istream<_CharT, _Traits>::sentry
{
    bool __ok_;

    sentry(const sentry&); // = delete;
    sentry& operator=(const sentry&); // = delete;

public:
    explicit sentry(basic_istream<_CharT, _Traits>& __is, bool __noskipws = false);
//    ~sentry() = default;

    _LIBCPP_INLINE_VISIBILITY
        _LIBCPP_EXPLICIT
        operator bool() const {return __ok_;}
};

template <class _CharT, class _Traits>
basic_istream<_CharT, _Traits>::sentry::sentry(basic_istream<_CharT, _Traits>& __is,
                                               bool __noskipws)
    : __ok_(false)
{
    if (__is.good())
    {
        if (__is.tie())
            __is.tie()->flush();
        if (!__noskipws && (__is.flags() & ios_base::skipws))
        {
            typedef istreambuf_iterator<_CharT, _Traits> _Ip;
            const ctype<_CharT>& __ct = use_facet<ctype<_CharT> >(__is.getloc());
            _Ip __i(__is);
            _Ip __eof;
            for (; __i != __eof; ++__i)
                if (!__ct.is(__ct.space, *__i))
                    break;
            if (__i == __eof)
                __is.setstate(ios_base::failbit | ios_base::eofbit);
        }
        __ok_ = __is.good();
    }
    else
        __is.setstate(ios_base::failbit);
}

template <class _CharT, class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
basic_istream<_CharT, _Traits>::basic_istream(basic_streambuf<char_type, traits_type>* __sb)
    : __gc_(0)
{
    this->init(__sb);
}

#ifndef _LIBCPP_HAS_NO_RVALUE_REFERENCES

template <class _CharT, class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
basic_istream<_CharT, _Traits>::basic_istream(basic_istream&& __rhs)
    : __gc_(__rhs.__gc_)
{
    __rhs.__gc_ = 0;
    this->move(__rhs);
}

template <class _CharT, class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::operator=(basic_istream&& __rhs)
{
    swap(__rhs);
    return *this;
}

#endif  // _LIBCPP_HAS_NO_RVALUE_REFERENCES

template <class _CharT, class _Traits>
basic_istream<_CharT, _Traits>::~basic_istream()
{
}

template <class _CharT, class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
void
basic_istream<_CharT, _Traits>::swap(basic_istream& __rhs)
{
    _VSTD::swap(__gc_, __rhs.__gc_);
    basic_ios<char_type, traits_type>::swap(__rhs);
}

template <class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::operator>>(unsigned short& __n)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __s(*this);
        if (__s)
        {
            typedef istreambuf_iterator<char_type, traits_type> _Ip;
            typedef num_get<char_type, _Ip> _Fp;
            ios_base::iostate __err = ios_base::goodbit;
            use_facet<_Fp>(this->getloc()).get(_Ip(*this), _Ip(), *this, __err, __n);
            this->setstate(__err);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template <class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::operator>>(unsigned int& __n)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __s(*this);
        if (__s)
        {
            typedef istreambuf_iterator<char_type, traits_type> _Ip;
            typedef num_get<char_type, _Ip> _Fp;
            ios_base::iostate __err = ios_base::goodbit;
            use_facet<_Fp>(this->getloc()).get(_Ip(*this), _Ip(), *this, __err, __n);
            this->setstate(__err);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template <class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::operator>>(long& __n)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __s(*this);
        if (__s)
        {
            typedef istreambuf_iterator<char_type, traits_type> _Ip;
            typedef num_get<char_type, _Ip> _Fp;
            ios_base::iostate __err = ios_base::goodbit;
            use_facet<_Fp>(this->getloc()).get(_Ip(*this), _Ip(), *this, __err, __n);
            this->setstate(__err);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template <class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::operator>>(unsigned long& __n)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __s(*this);
        if (__s)
        {
            typedef istreambuf_iterator<char_type, traits_type> _Ip;
            typedef num_get<char_type, _Ip> _Fp;
            ios_base::iostate __err = ios_base::goodbit;
            use_facet<_Fp>(this->getloc()).get(_Ip(*this), _Ip(), *this, __err, __n);
            this->setstate(__err);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template <class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::operator>>(long long& __n)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __s(*this);
        if (__s)
        {
            typedef istreambuf_iterator<char_type, traits_type> _Ip;
            typedef num_get<char_type, _Ip> _Fp;
            ios_base::iostate __err = ios_base::goodbit;
            use_facet<_Fp>(this->getloc()).get(_Ip(*this), _Ip(), *this, __err, __n);
            this->setstate(__err);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template <class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::operator>>(unsigned long long& __n)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __s(*this);
        if (__s)
        {
            typedef istreambuf_iterator<char_type, traits_type> _Ip;
            typedef num_get<char_type, _Ip> _Fp;
            ios_base::iostate __err = ios_base::goodbit;
            use_facet<_Fp>(this->getloc()).get(_Ip(*this), _Ip(), *this, __err, __n);
            this->setstate(__err);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template <class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::operator>>(float& __n)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __s(*this);
        if (__s)
        {
            typedef istreambuf_iterator<char_type, traits_type> _Ip;
            typedef num_get<char_type, _Ip> _Fp;
            ios_base::iostate __err = ios_base::goodbit;
            use_facet<_Fp>(this->getloc()).get(_Ip(*this), _Ip(), *this, __err, __n);
            this->setstate(__err);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template <class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::operator>>(double& __n)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __s(*this);
        if (__s)
        {
            typedef istreambuf_iterator<char_type, traits_type> _Ip;
            typedef num_get<char_type, _Ip> _Fp;
            ios_base::iostate __err = ios_base::goodbit;
            use_facet<_Fp>(this->getloc()).get(_Ip(*this), _Ip(), *this, __err, __n);
            this->setstate(__err);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template <class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::operator>>(long double& __n)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __s(*this);
        if (__s)
        {
            typedef istreambuf_iterator<char_type, traits_type> _Ip;
            typedef num_get<char_type, _Ip> _Fp;
            ios_base::iostate __err = ios_base::goodbit;
            use_facet<_Fp>(this->getloc()).get(_Ip(*this), _Ip(), *this, __err, __n);
            this->setstate(__err);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template <class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::operator>>(bool& __n)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __s(*this);
        if (__s)
        {
            typedef istreambuf_iterator<char_type, traits_type> _Ip;
            typedef num_get<char_type, _Ip> _Fp;
            ios_base::iostate __err = ios_base::goodbit;
            use_facet<_Fp>(this->getloc()).get(_Ip(*this), _Ip(), *this, __err, __n);
            this->setstate(__err);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template <class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::operator>>(void*& __n)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __s(*this);
        if (__s)
        {
            typedef istreambuf_iterator<char_type, traits_type> _Ip;
            typedef num_get<char_type, _Ip> _Fp;
            ios_base::iostate __err = ios_base::goodbit;
            use_facet<_Fp>(this->getloc()).get(_Ip(*this), _Ip(), *this, __err, __n);
            this->setstate(__err);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template <class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::operator>>(short& __n)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __s(*this);
        if (__s)
        {
            typedef istreambuf_iterator<char_type, traits_type> _Ip;
            typedef num_get<char_type, _Ip> _Fp;
            ios_base::iostate __err = ios_base::goodbit;
            long __temp;
            use_facet<_Fp>(this->getloc()).get(_Ip(*this), _Ip(), *this, __err, __temp);
            if (__temp < numeric_limits<short>::min())
            {
                __err |= ios_base::failbit;
                __n = numeric_limits<short>::min();
            }
            else if (__temp > numeric_limits<short>::max())
            {
                __err |= ios_base::failbit;
                __n = numeric_limits<short>::max();
            }
            else
                __n = static_cast<short>(__temp);
            this->setstate(__err);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template <class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::operator>>(int& __n)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __s(*this);
        if (__s)
        {
            typedef istreambuf_iterator<char_type, traits_type> _Ip;
            typedef num_get<char_type, _Ip> _Fp;
            ios_base::iostate __err = ios_base::goodbit;
            long __temp;
            use_facet<_Fp>(this->getloc()).get(_Ip(*this), _Ip(), *this, __err, __temp);
            if (__temp < numeric_limits<int>::min())
            {
                __err |= ios_base::failbit;
                __n = numeric_limits<int>::min();
            }
            else if (__temp > numeric_limits<int>::max())
            {
                __err |= ios_base::failbit;
                __n = numeric_limits<int>::max();
            }
            else
                __n = static_cast<int>(__temp);
            this->setstate(__err);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template <class _CharT, class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::operator>>(basic_istream& (*__pf)(basic_istream&))
{
    return __pf(*this);
}

template <class _CharT, class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::operator>>(basic_ios<char_type, traits_type>&
                                           (*__pf)(basic_ios<char_type, traits_type>&))
{
    __pf(*this);
    return *this;
}

template <class _CharT, class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::operator>>(ios_base& (*__pf)(ios_base&))
{
    __pf(*this);
    return *this;
}

template<class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
operator>>(basic_istream<_CharT, _Traits>& __is, _CharT* __s)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        typename basic_istream<_CharT, _Traits>::sentry __sen(__is);
        if (__sen)
        {
            streamsize __n = __is.width();
            if (__n <= 0)
                __n = numeric_limits<streamsize>::max() / sizeof(_CharT) - 1;
            streamsize __c = 0;
            const ctype<_CharT>& __ct = use_facet<ctype<_CharT> >(__is.getloc());
            ios_base::iostate __err = ios_base::goodbit;
            while (__c < __n-1)
            {
                typename _Traits::int_type __i = __is.rdbuf()->sgetc();
                if (_Traits::eq_int_type(__i, _Traits::eof()))
                {
                   __err |= ios_base::eofbit;
                   break;
                }
                _CharT __ch = _Traits::to_char_type(__i);
                if (__ct.is(__ct.space, __ch))
                    break;
                *__s++ = __ch;
                ++__c;
                 __is.rdbuf()->sbumpc();
            }
            *__s = _CharT();
            __is.width(0);
            if (__c == 0)
               __err |= ios_base::failbit;
            __is.setstate(__err);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        __is.__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return __is;
}

template<class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
basic_istream<char, _Traits>&
operator>>(basic_istream<char, _Traits>& __is, unsigned char* __s)
{
    return __is >> (char*)__s;
}

template<class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
basic_istream<char, _Traits>&
operator>>(basic_istream<char, _Traits>& __is, signed char* __s)
{
    return __is >> (char*)__s;
}

template<class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
operator>>(basic_istream<_CharT, _Traits>& __is, _CharT& __c)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        typename basic_istream<_CharT, _Traits>::sentry __sen(__is);
        if (__sen)
        {
            typename _Traits::int_type __i = __is.rdbuf()->sbumpc();
            if (_Traits::eq_int_type(__i, _Traits::eof()))
                __is.setstate(ios_base::eofbit | ios_base::failbit);
            else
                __c = _Traits::to_char_type(__i);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        __is.__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return __is;
}

template<class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
basic_istream<char, _Traits>&
operator>>(basic_istream<char, _Traits>& __is, unsigned char& __c)
{
    return __is >> (char&)__c;
}

template<class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
basic_istream<char, _Traits>&
operator>>(basic_istream<char, _Traits>& __is, signed char& __c)
{
    return __is >> (char&)__c;
}

template<class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::operator>>(basic_streambuf<char_type, traits_type>* __sb)
{
    __gc_ = 0;
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __s(*this, true);
        if (__s)
        {
            if (__sb)
            {
#ifndef _LIBCPP_NO_EXCEPTIONS
                try
                {
#endif  // _LIBCPP_NO_EXCEPTIONS
                    ios_base::iostate __err = ios_base::goodbit;
                    while (true)
                    {
                        typename traits_type::int_type __i = this->rdbuf()->sgetc();
                        if (traits_type::eq_int_type(__i, _Traits::eof()))
                        {
                           __err |= ios_base::eofbit;
                           break;
                        }
                        if (traits_type::eq_int_type(
                                __sb->sputc(traits_type::to_char_type(__i)),
                                traits_type::eof()))
                            break;
                        ++__gc_;
                        this->rdbuf()->sbumpc();
                    }
                    if (__gc_ == 0)
                       __err |= ios_base::failbit;
                    this->setstate(__err);
#ifndef _LIBCPP_NO_EXCEPTIONS
                }
                catch (...)
                {
                    if (__gc_ == 0)
                        this->__set_failbit_and_consider_rethrow();
                }
#endif  // _LIBCPP_NO_EXCEPTIONS
            }
            else
                this->setstate(ios_base::failbit);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template<class _CharT, class _Traits>
typename basic_istream<_CharT, _Traits>::int_type
basic_istream<_CharT, _Traits>::get()
{
    __gc_ = 0;
    int_type __r = traits_type::eof();
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __s(*this, true);
        if (__s)
        {
            __r = this->rdbuf()->sbumpc();
            if (traits_type::eq_int_type(__r, traits_type::eof()))
               this->setstate(ios_base::failbit | ios_base::eofbit);
            else
                __gc_ = 1;
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return __r;
}

template<class _CharT, class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::get(char_type& __c)
{
    int_type __ch = get();
    if (__ch != traits_type::eof())
        __c = traits_type::to_char_type(__ch);
    return *this;
}

template<class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::get(char_type* __s, streamsize __n, char_type __dlm)
{
    __gc_ = 0;
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __sen(*this, true);
        if (__sen)
        {
            if (__n > 0)
            {
                ios_base::iostate __err = ios_base::goodbit;
                while (__gc_ < __n-1)
                {
                    int_type __i = this->rdbuf()->sgetc();
                    if (traits_type::eq_int_type(__i, traits_type::eof()))
                    {
                       __err |= ios_base::eofbit;
                       break;
                    }
                    char_type __ch = traits_type::to_char_type(__i);
                    if (traits_type::eq(__ch, __dlm))
                        break;
                    *__s++ = __ch;
                    ++__gc_;
                     this->rdbuf()->sbumpc();
                }
                *__s = char_type();
                if (__gc_ == 0)
                   __err |= ios_base::failbit;
                this->setstate(__err);
            }
            else
                this->setstate(ios_base::failbit);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template<class _CharT, class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::get(char_type* __s, streamsize __n)
{
    return get(__s, __n, this->widen('\n'));
}

template<class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::get(basic_streambuf<char_type, traits_type>& __sb,
                                    char_type __dlm)
{
    __gc_ = 0;
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __sen(*this, true);
        if (__sen)
        {
            ios_base::iostate __err = ios_base::goodbit;
#ifndef _LIBCPP_NO_EXCEPTIONS
            try
            {
#endif  // _LIBCPP_NO_EXCEPTIONS
                while (true)
                {
                    typename traits_type::int_type __i = this->rdbuf()->sgetc();
                    if (traits_type::eq_int_type(__i, traits_type::eof()))
                    {
                       __err |= ios_base::eofbit;
                       break;
                    }
                    char_type __ch = traits_type::to_char_type(__i);
                    if (traits_type::eq(__ch, __dlm))
                        break;
                    if (traits_type::eq_int_type(__sb.sputc(__ch), traits_type::eof()))
                        break;
                    ++__gc_;
                    this->rdbuf()->sbumpc();
                }
#ifndef _LIBCPP_NO_EXCEPTIONS
            }
            catch (...)
            {
            }
#endif  // _LIBCPP_NO_EXCEPTIONS
            if (__gc_ == 0)
               __err |= ios_base::failbit;
            this->setstate(__err);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template<class _CharT, class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::get(basic_streambuf<char_type, traits_type>& __sb)
{
    return get(__sb, this->widen('\n'));
}

template<class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::getline(char_type* __s, streamsize __n, char_type __dlm)
{
    __gc_ = 0;
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __sen(*this, true);
        if (__sen)
        {
            ios_base::iostate __err = ios_base::goodbit;
            while (true)
            {
                typename traits_type::int_type __i = this->rdbuf()->sgetc();
                if (traits_type::eq_int_type(__i, traits_type::eof()))
                {
                   __err |= ios_base::eofbit;
                   break;
                }
                char_type __ch = traits_type::to_char_type(__i);
                if (traits_type::eq(__ch, __dlm))
                {
                    this->rdbuf()->sbumpc();
                    ++__gc_;
                    break;
                }
                if (__gc_ >= __n-1)
                {
                    __err |= ios_base::failbit;
                    break;
                }
                *__s++ = __ch;
                this->rdbuf()->sbumpc();
                ++__gc_;
            }
            if (__n > 0)
                *__s = char_type();
            if (__gc_ == 0)
               __err |= ios_base::failbit;
            this->setstate(__err);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template<class _CharT, class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::getline(char_type* __s, streamsize __n)
{
    return getline(__s, __n, this->widen('\n'));
}

template<class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::ignore(streamsize __n, int_type __dlm)
{
    __gc_ = 0;
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __sen(*this, true);
        if (__sen)
        {
            ios_base::iostate __err = ios_base::goodbit;
            if (__n == numeric_limits<streamsize>::max())
            {
                while (true)
                {
                    typename traits_type::int_type __i = this->rdbuf()->sbumpc();
                    if (traits_type::eq_int_type(__i, traits_type::eof()))
                    {
                       __err |= ios_base::eofbit;
                       break;
                    }
                    ++__gc_;
                    if (traits_type::eq_int_type(__i, __dlm))
                        break;
                }
            }
            else
            {
                while (__gc_ < __n)
                {
                    typename traits_type::int_type __i = this->rdbuf()->sbumpc();
                    if (traits_type::eq_int_type(__i, traits_type::eof()))
                    {
                       __err |= ios_base::eofbit;
                       break;
                    }
                    ++__gc_;
                    if (traits_type::eq_int_type(__i, __dlm))
                        break;
                }
            }
            this->setstate(__err);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template<class _CharT, class _Traits>
typename basic_istream<_CharT, _Traits>::int_type
basic_istream<_CharT, _Traits>::peek()
{
    __gc_ = 0;
    int_type __r = traits_type::eof();
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __sen(*this, true);
        if (__sen)
        {
            __r = this->rdbuf()->sgetc();
            if (traits_type::eq_int_type(__r, traits_type::eof()))
                this->setstate(ios_base::eofbit);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return __r;
}

template<class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::read(char_type* __s, streamsize __n)
{
    __gc_ = 0;
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __sen(*this, true);
        if (__sen)
        {
            __gc_ = this->rdbuf()->sgetn(__s, __n);
            if (__gc_ != __n)
                this->setstate(ios_base::failbit | ios_base::eofbit);
        }
        else
            this->setstate(ios_base::failbit);
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template<class _CharT, class _Traits>
streamsize
basic_istream<_CharT, _Traits>::readsome(char_type* __s, streamsize __n)
{
    __gc_ = 0;
    streamsize __c = this->rdbuf()->in_avail();
    switch (__c)
    {
    case -1:
        this->setstate(ios_base::eofbit);
        break;
    case 0:
        break;
    default:
        read(__s, _VSTD::min(__c, __n));
        break;
    }
    return __gc_;
}

template<class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::putback(char_type __c)
{
    __gc_ = 0;
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        this->clear(this->rdstate() & ~ios_base::eofbit);
        sentry __sen(*this, true);
        if (__sen)
        {
            if (this->rdbuf() == 0 || this->rdbuf()->sputbackc(__c) == traits_type::eof())
                this->setstate(ios_base::badbit);
        }
        else
            this->setstate(ios_base::failbit);
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template<class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::unget()
{
    __gc_ = 0;
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        this->clear(this->rdstate() & ~ios_base::eofbit);
        sentry __sen(*this, true);
        if (__sen)
        {
            if (this->rdbuf() == 0 || this->rdbuf()->sungetc() == traits_type::eof())
                this->setstate(ios_base::badbit);
        }
        else
            this->setstate(ios_base::failbit);
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template<class _CharT, class _Traits>
int
basic_istream<_CharT, _Traits>::sync()
{
    int __r = 0;
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __sen(*this, true);
        if (__sen)
        {
            if (this->rdbuf() == 0)
                return -1;
            if (this->rdbuf()->pubsync() == -1)
            {
                this->setstate(ios_base::badbit);
                return -1;
            }
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return __r;
}

template<class _CharT, class _Traits>
typename basic_istream<_CharT, _Traits>::pos_type
basic_istream<_CharT, _Traits>::tellg()
{
    pos_type __r(-1);
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __sen(*this, true);
        if (__sen)
            __r = this->rdbuf()->pubseekoff(0, ios_base::cur, ios_base::in);
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return __r;
}

template<class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::seekg(pos_type __pos)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        this->clear(this->rdstate() & ~ios_base::eofbit);
        sentry __sen(*this, true);
        if (__sen)
        {
            if (this->rdbuf()->pubseekpos(__pos, ios_base::in) == pos_type(-1))
                this->setstate(ios_base::failbit);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template<class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
basic_istream<_CharT, _Traits>::seekg(off_type __off, ios_base::seekdir __dir)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        sentry __sen(*this, true);
        if (__sen)
        {
            if (this->rdbuf()->pubseekoff(__off, __dir, ios_base::in) == pos_type(-1))
                this->setstate(ios_base::failbit);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        this->__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return *this;
}

template <class _CharT, class _Traits>
basic_istream<_CharT, _Traits>&
ws(basic_istream<_CharT, _Traits>& __is)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        typename basic_istream<_CharT, _Traits>::sentry __sen(__is, true);
        if (__sen)
        {
            const ctype<_CharT>& __ct = use_facet<ctype<_CharT> >(__is.getloc());
            while (true)
            {
                typename _Traits::int_type __i = __is.rdbuf()->sgetc();
                if (_Traits::eq_int_type(__i, _Traits::eof()))
                {
                   __is.setstate(ios_base::eofbit);
                   break;
                }
                if (!__ct.is(__ct.space, _Traits::to_char_type(__i)))
                    break;
                __is.rdbuf()->sbumpc();
            }
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        __is.__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return __is;
}

#ifndef _LIBCPP_HAS_NO_RVALUE_REFERENCES

template <class _CharT, class _Traits, class _Tp>
inline _LIBCPP_INLINE_VISIBILITY
basic_istream<_CharT, _Traits>&
operator>>(basic_istream<_CharT, _Traits>&& __is, _Tp& __x)
{
    __is >> __x;
    return __is;
}

#endif  // _LIBCPP_HAS_NO_RVALUE_REFERENCES

template <class _CharT, class _Traits>
class _LIBCPP_TYPE_VIS_ONLY basic_iostream
    : public basic_istream<_CharT, _Traits>,
      public basic_ostream<_CharT, _Traits>
{
public:
    // types:
    typedef _CharT                         char_type;
    typedef _Traits                        traits_type;
    typedef typename traits_type::int_type int_type;
    typedef typename traits_type::pos_type pos_type;
    typedef typename traits_type::off_type off_type;

    // constructor/destructor
    explicit basic_iostream(basic_streambuf<char_type, traits_type>* __sb);
    virtual ~basic_iostream();
protected:
#ifndef _LIBCPP_HAS_NO_RVALUE_REFERENCES
    _LIBCPP_INLINE_VISIBILITY
    basic_iostream(basic_iostream&& __rhs);
#endif

    // assign/swap
#ifndef _LIBCPP_HAS_NO_RVALUE_REFERENCES
    _LIBCPP_INLINE_VISIBILITY
    basic_iostream& operator=(basic_iostream&& __rhs);
#endif
    void swap(basic_iostream& __rhs);
public:
};

template <class _CharT, class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
basic_iostream<_CharT, _Traits>::basic_iostream(basic_streambuf<char_type, traits_type>* __sb)
    : basic_istream<_CharT, _Traits>(__sb)
{
}

#ifndef _LIBCPP_HAS_NO_RVALUE_REFERENCES

template <class _CharT, class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
basic_iostream<_CharT, _Traits>::basic_iostream(basic_iostream&& __rhs)
    : basic_istream<_CharT, _Traits>(_VSTD::move(__rhs))
{
}

template <class _CharT, class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
basic_iostream<_CharT, _Traits>&
basic_iostream<_CharT, _Traits>::operator=(basic_iostream&& __rhs)
{
    swap(__rhs);
    return *this;
}

#endif  // _LIBCPP_HAS_NO_RVALUE_REFERENCES

template <class _CharT, class _Traits>
basic_iostream<_CharT, _Traits>::~basic_iostream()
{
}

template <class _CharT, class _Traits>
inline _LIBCPP_INLINE_VISIBILITY
void
basic_iostream<_CharT, _Traits>::swap(basic_iostream& __rhs)
{
    basic_istream<char_type, traits_type>::swap(__rhs);
}

template<class _CharT, class _Traits, class _Allocator>
basic_istream<_CharT, _Traits>&
operator>>(basic_istream<_CharT, _Traits>& __is,
           basic_string<_CharT, _Traits, _Allocator>& __str)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        typename basic_istream<_CharT, _Traits>::sentry __sen(__is);
        if (__sen)
        {
            __str.clear();
            streamsize __n = __is.width();
            if (__n <= 0)
                __n = __str.max_size();
            if (__n <= 0)
                __n = numeric_limits<streamsize>::max();
            streamsize __c = 0;
            const ctype<_CharT>& __ct = use_facet<ctype<_CharT> >(__is.getloc());
            ios_base::iostate __err = ios_base::goodbit;
            while (__c < __n)
            {
                typename _Traits::int_type __i = __is.rdbuf()->sgetc();
                if (_Traits::eq_int_type(__i, _Traits::eof()))
                {
                   __err |= ios_base::eofbit;
                   break;
                }
                _CharT __ch = _Traits::to_char_type(__i);
                if (__ct.is(__ct.space, __ch))
                    break;
                __str.push_back(__ch);
                ++__c;
                 __is.rdbuf()->sbumpc();
            }
            __is.width(0);
            if (__c == 0)
               __err |= ios_base::failbit;
            __is.setstate(__err);
        }
        else
            __is.setstate(ios_base::failbit);
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        __is.__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return __is;
}

template<class _CharT, class _Traits, class _Allocator>
basic_istream<_CharT, _Traits>&
getline(basic_istream<_CharT, _Traits>& __is,
        basic_string<_CharT, _Traits, _Allocator>& __str, _CharT __dlm)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        typename basic_istream<_CharT, _Traits>::sentry __sen(__is, true);
        if (__sen)
        {
            __str.clear();
            ios_base::iostate __err = ios_base::goodbit;
            streamsize __extr = 0;
            while (true)
            {
                typename _Traits::int_type __i = __is.rdbuf()->sbumpc();
                if (_Traits::eq_int_type(__i, _Traits::eof()))
                {
                   __err |= ios_base::eofbit;
                   break;
                }
                ++__extr;
                _CharT __ch = _Traits::to_char_type(__i);
                if (_Traits::eq(__ch, __dlm))
                    break;
                __str.push_back(__ch);
                if (__str.size() == __str.max_size())
                {
                    __err |= ios_base::failbit;
                    break;
                }
            }
            if (__extr == 0)
               __err |= ios_base::failbit;
            __is.setstate(__err);
        }
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        __is.__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return __is;
}

template<class _CharT, class _Traits, class _Allocator>
inline _LIBCPP_INLINE_VISIBILITY
basic_istream<_CharT, _Traits>&
getline(basic_istream<_CharT, _Traits>& __is,
        basic_string<_CharT, _Traits, _Allocator>& __str)
{
    return getline(__is, __str, __is.widen('\n'));
}

#ifndef _LIBCPP_HAS_NO_RVALUE_REFERENCES

template<class _CharT, class _Traits, class _Allocator>
inline _LIBCPP_INLINE_VISIBILITY
basic_istream<_CharT, _Traits>&
getline(basic_istream<_CharT, _Traits>&& __is,
        basic_string<_CharT, _Traits, _Allocator>& __str, _CharT __dlm)
{
    return getline(__is, __str, __dlm);
}

template<class _CharT, class _Traits, class _Allocator>
inline _LIBCPP_INLINE_VISIBILITY
basic_istream<_CharT, _Traits>&
getline(basic_istream<_CharT, _Traits>&& __is,
        basic_string<_CharT, _Traits, _Allocator>& __str)
{
    return getline(__is, __str, __is.widen('\n'));
}

#endif  // _LIBCPP_HAS_NO_RVALUE_REFERENCES

template <class _CharT, class _Traits, size_t _Size>
basic_istream<_CharT, _Traits>&
operator>>(basic_istream<_CharT, _Traits>& __is, bitset<_Size>& __x)
{
#ifndef _LIBCPP_NO_EXCEPTIONS
    try
    {
#endif  // _LIBCPP_NO_EXCEPTIONS
        typename basic_istream<_CharT, _Traits>::sentry __sen(__is);
        if (__sen)
        {
            basic_string<_CharT, _Traits> __str;
            const ctype<_CharT>& __ct = use_facet<ctype<_CharT> >(__is.getloc());
            streamsize __c = 0;
            ios_base::iostate __err = ios_base::goodbit;
            _CharT __zero = __ct.widen('0');
            _CharT __one = __ct.widen('1');
            while (__c < _Size)
            {
                typename _Traits::int_type __i = __is.rdbuf()->sgetc();
                if (_Traits::eq_int_type(__i, _Traits::eof()))
                {
                   __err |= ios_base::eofbit;
                   break;
                }
                _CharT __ch = _Traits::to_char_type(__i);
                if (!_Traits::eq(__ch, __zero) && !_Traits::eq(__ch, __one))
                    break;
                __str.push_back(__ch);
                ++__c;
                 __is.rdbuf()->sbumpc();
            }
            __x = bitset<_Size>(__str);
            if (__c == 0)
               __err |= ios_base::failbit;
            __is.setstate(__err);
        }
        else
            __is.setstate(ios_base::failbit);
#ifndef _LIBCPP_NO_EXCEPTIONS
    }
    catch (...)
    {
        __is.__set_badbit_and_consider_rethrow();
    }
#endif  // _LIBCPP_NO_EXCEPTIONS
    return __is;
}

_LIBCPP_EXTERN_TEMPLATE(class _LIBCPP_TYPE_VIS basic_istream<char>)
_LIBCPP_EXTERN_TEMPLATE(class _LIBCPP_TYPE_VIS basic_istream<wchar_t>)
_LIBCPP_EXTERN_TEMPLATE(class _LIBCPP_TYPE_VIS basic_iostream<char>)

_LIBCPP_END_NAMESPACE_STD

#endif  // _LIBCPP_ISTREAM
