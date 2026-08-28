import com.google.common.collect.AbstractIterator;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.ArrayDeque;
import java.util.Optional;
import java.util.Queue;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.concurrent.Immutable;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;

@Immutable
public class jd extends kh {
   public static final Codec<jd> a = Codec.INT_STREAM
      .comapFlatMap($$0 -> ad.a($$0, 3).map($$0x -> new jd($$0x[0], $$0x[1], $$0x[2])), $$0 -> IntStream.of($$0.u(), $$0.v(), $$0.w()))
      .stable();
   public static final yx<ByteBuf, jd> b = new yx<ByteBuf, jd>() {
      public jd a(ByteBuf $$0) {
         return vw.b($$0);
      }

      public void a(ByteBuf $$0, jd $$1) {
         vw.a($$0, $$1);
      }
   };
   private static final Logger e = LogUtils.getLogger();
   public static final jd c = new jd(0, 0, 0);
   private static final int h = 1 + ayo.f(ayo.c(30000000));
   private static final int i = h;
   public static final int d = 64 - h - i;
   private static final long j = (1L << h) - 1L;
   private static final long k = (1L << d) - 1L;
   private static final long l = (1L << i) - 1L;
   private static final int m = 0;
   private static final int n = d;
   private static final int o = d + i;

   public jd(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public jd(kh $$0) {
      this($$0.u(), $$0.v(), $$0.w());
   }

   public static long a(long $$0, ji $$1) {
      return a($$0, $$1.j(), $$1.k(), $$1.l());
   }

   public static long a(long $$0, int $$1, int $$2, int $$3) {
      return a(a($$0) + $$1, b($$0) + $$2, c($$0) + $$3);
   }

   public static int a(long $$0) {
      return (int)($$0 << 64 - o - h >> 64 - h);
   }

   public static int b(long $$0) {
      return (int)($$0 << 64 - d >> 64 - d);
   }

   public static int c(long $$0) {
      return (int)($$0 << 64 - n - i >> 64 - i);
   }

   public static jd d(long $$0) {
      return new jd(a($$0), b($$0), c($$0));
   }

   public static jd a(double $$0, double $$1, double $$2) {
      return new jd(ayo.a($$0), ayo.a($$1), ayo.a($$2));
   }

   public static jd a(jw $$0) {
      return a($$0.a(), $$0.b(), $$0.c());
   }

   public static jd a(jd $$0, jd $$1) {
      return new jd(Math.min($$0.u(), $$1.u()), Math.min($$0.v(), $$1.v()), Math.min($$0.w(), $$1.w()));
   }

   public static jd b(jd $$0, jd $$1) {
      return new jd(Math.max($$0.u(), $$1.u()), Math.max($$0.v(), $$1.v()), Math.max($$0.w(), $$1.w()));
   }

   public long a() {
      return a(this.u(), this.v(), this.w());
   }

   public static long a(int $$0, int $$1, int $$2) {
      long $$3 = 0L;
      $$3 |= ((long)$$0 & j) << o;
      $$3 |= ((long)$$1 & k) << 0;
      return $$3 | ((long)$$2 & l) << n;
   }

   public static long e(long $$0) {
      return $$0 & -16L;
   }

   public jd b(int $$0, int $$1, int $$2) {
      return $$0 == 0 && $$1 == 0 && $$2 == 0 ? this : new jd(this.u() + $$0, this.v() + $$1, this.w() + $$2);
   }

   public exa b() {
      return exa.b(this);
   }

   public exa c() {
      return exa.c(this);
   }

   public jd a(kh $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   public jd b(kh $$0) {
      return this.b(-$$0.u(), -$$0.v(), -$$0.w());
   }

   public jd a(int $$0) {
      if ($$0 == 1) {
         return this;
      } else {
         return $$0 == 0 ? c : new jd(this.u() * $$0, this.v() * $$0, this.w() * $$0);
      }
   }

   public jd d() {
      return this.a(ji.b);
   }

   public jd b(int $$0) {
      return this.a(ji.b, $$0);
   }

   public jd e() {
      return this.a(ji.a);
   }

   public jd c(int $$0) {
      return this.a(ji.a, $$0);
   }

   public jd f() {
      return this.a(ji.c);
   }

   public jd d(int $$0) {
      return this.a(ji.c, $$0);
   }

   public jd g() {
      return this.a(ji.d);
   }

   public jd e(int $$0) {
      return this.a(ji.d, $$0);
   }

   public jd h() {
      return this.a(ji.e);
   }

   public jd f(int $$0) {
      return this.a(ji.e, $$0);
   }

   public jd i() {
      return this.a(ji.f);
   }

   public jd g(int $$0) {
      return this.a(ji.f, $$0);
   }

   public jd a(ji $$0) {
      return new jd(this.u() + $$0.j(), this.v() + $$0.k(), this.w() + $$0.l());
   }

   public jd a(ji $$0, int $$1) {
      return $$1 == 0 ? this : new jd(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
   }

   public jd a(ji.a $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         int $$2 = $$0 == ji.a.a ? $$1 : 0;
         int $$3 = $$0 == ji.a.b ? $$1 : 0;
         int $$4 = $$0 == ji.a.c ? $$1 : 0;
         return new jd(this.u() + $$2, this.v() + $$3, this.w() + $$4);
      }
   }

   public jd a(dmm $$0) {
      switch ($$0) {
         case a:
         default:
            return this;
         case b:
            return new jd(-this.w(), this.v(), this.u());
         case c:
            return new jd(-this.u(), this.v(), -this.w());
         case d:
            return new jd(this.w(), this.v(), -this.u());
      }
   }

   public jd c(kh $$0) {
      return new jd(this.v() * $$0.w() - this.w() * $$0.v(), this.w() * $$0.u() - this.u() * $$0.w(), this.u() * $$0.v() - this.v() * $$0.u());
   }

   public jd h(int $$0) {
      return new jd(this.u(), $$0, this.w());
   }

   public jd j() {
      return this;
   }

   public jd.a k() {
      return new jd.a(this.u(), this.v(), this.w());
   }

   public exa a(exa $$0) {
      return new exa(
         ayo.a($$0.c, (double)((float)this.u() + 1.0E-5F), (double)this.u() + 1.0 - 1.0E-5F),
         ayo.a($$0.d, (double)((float)this.v() + 1.0E-5F), (double)this.v() + 1.0 - 1.0E-5F),
         ayo.a($$0.e, (double)((float)this.w() + 1.0E-5F), (double)this.w() + 1.0 - 1.0E-5F)
      );
   }

   public static Iterable<jd> a(ayw $$0, int $$1, jd $$2, int $$3) {
      return a($$0, $$1, $$2.u() - $$3, $$2.v() - $$3, $$2.w() - $$3, $$2.u() + $$3, $$2.v() + $$3, $$2.w() + $$3);
   }

   @Deprecated
   public static Stream<jd> a(jd $$0) {
      return Stream.of($$0, $$0.g(), $$0.i(), $$0.g().i());
   }

   public static Iterable<jd> a(ayw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 - $$3 + 1;
      int $$10 = $$7 - $$4 + 1;
      return () -> new AbstractIterator<jd>() {
            final jd.a a = new jd.a();
            int b = $$1;

            protected jd a() {
               if (this.b <= 0) {
                  return (jd)this.endOfData();
               } else {
                  jd $$0 = this.a.d($$2 + $$0.a($$8), $$3 + $$0.a($$9), $$4 + $$0.a($$10));
                  this.b--;
                  return $$0;
               }
            }
         };
   }

   public static Iterable<jd> a(jd $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$1 + $$2 + $$3;
      int $$5 = $$0.u();
      int $$6 = $$0.v();
      int $$7 = $$0.w();
      return () -> new AbstractIterator<jd>() {
            private final jd.a h = new jd.a();
            private int i;
            private int j;
            private int k;
            private int l;
            private int m;
            private boolean n;

            protected jd a() {
               if (this.n) {
                  this.n = false;
                  this.h.r($$7 - (this.h.w() - $$7));
                  return this.h;
               } else {
                  jd $$0;
                  for ($$0 = null; $$0 == null; this.m++) {
                     if (this.m > this.k) {
                        this.l++;
                        if (this.l > this.j) {
                           this.i++;
                           if (this.i > $$4) {
                              return (jd)this.endOfData();
                           }

                           this.j = Math.min($$1, this.i);
                           this.l = -this.j;
                        }

                        this.k = Math.min($$2, this.i - Math.abs(this.l));
                        this.m = -this.k;
                     }

                     int $$1 = this.l;
                     int $$2 = this.m;
                     int $$3 = this.i - Math.abs($$1) - Math.abs($$2);
                     if ($$3 <= $$3) {
                        this.n = $$3 != 0;
                        $$0 = this.h.d($$5 + $$1, $$6 + $$2, $$7 + $$3);
                     }
                  }

                  return $$0;
               }
            }
         };
   }

   public static Optional<jd> a(jd $$0, int $$1, int $$2, Predicate<jd> $$3) {
      for (jd $$4 : a($$0, $$1, $$2, $$1)) {
         if ($$3.test($$4)) {
            return Optional.of($$4);
         }
      }

      return Optional.empty();
   }

   public static Stream<jd> b(jd $$0, int $$1, int $$2, int $$3) {
      return StreamSupport.stream(a($$0, $$1, $$2, $$3).spliterator(), false);
   }

   public static Iterable<jd> c(jd $$0, jd $$1) {
      return b(
         Math.min($$0.u(), $$1.u()),
         Math.min($$0.v(), $$1.v()),
         Math.min($$0.w(), $$1.w()),
         Math.max($$0.u(), $$1.u()),
         Math.max($$0.v(), $$1.v()),
         Math.max($$0.w(), $$1.w())
      );
   }

   public static Stream<jd> d(jd $$0, jd $$1) {
      return StreamSupport.stream(c($$0, $$1).spliterator(), false);
   }

   public static Stream<jd> a(ejh $$0) {
      return a(
         Math.min($$0.h(), $$0.k()),
         Math.min($$0.i(), $$0.l()),
         Math.min($$0.j(), $$0.m()),
         Math.max($$0.h(), $$0.k()),
         Math.max($$0.i(), $$0.l()),
         Math.max($$0.j(), $$0.m())
      );
   }

   public static Stream<jd> a(ewv $$0) {
      return a(ayo.a($$0.a), ayo.a($$0.b), ayo.a($$0.c), ayo.a($$0.d), ayo.a($$0.e), ayo.a($$0.f));
   }

   public static Stream<jd> a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return StreamSupport.stream(b($$0, $$1, $$2, $$3, $$4, $$5).spliterator(), false);
   }

   public static Iterable<jd> b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$3 - $$0 + 1;
      int $$7 = $$4 - $$1 + 1;
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 * $$7 * $$8;
      return () -> new AbstractIterator<jd>() {
            private final jd.a g = new jd.a();
            private int h;

            protected jd a() {
               if (this.h == $$9) {
                  return (jd)this.endOfData();
               } else {
                  int $$0 = this.h % $$6;
                  int $$1 = this.h / $$6;
                  int $$2 = $$1 % $$7;
                  int $$3 = $$1 / $$7;
                  this.h++;
                  return this.g.d($$0 + $$0, $$1 + $$2, $$2 + $$3);
               }
            }
         };
   }

   public static Iterable<jd.a> a(jd $$0, int $$1, ji $$2, ji $$3) {
      Validate.validState($$2.o() != $$3.o(), "The two directions cannot be on the same axis", new Object[0]);
      return () -> new AbstractIterator<jd.a>() {
            private final ji[] e = new ji[]{$$2, $$3, $$2.g(), $$3.g()};
            private final jd.a f = $$0.k().c($$3);
            private final int g = 4 * $$1;
            private int h = -1;
            private int i;
            private int j;
            private int k = this.f.u();
            private int l = this.f.v();
            private int m = this.f.w();

            protected jd.a a() {
               this.f.d(this.k, this.l, this.m).c(this.e[(this.h + 4) % 4]);
               this.k = this.f.u();
               this.l = this.f.v();
               this.m = this.f.w();
               if (this.j >= this.i) {
                  if (this.h >= this.g) {
                     return (jd.a)this.endOfData();
                  }

                  this.h++;
                  this.j = 0;
                  this.i = this.h / 2 + 1;
               }

               this.j++;
               return this.f;
            }
         };
   }

   public static int a(jd $$0, int $$1, int $$2, BiConsumer<jd, Consumer<jd>> $$3, Predicate<jd> $$4) {
      Queue<Pair<jd, Integer>> $$5 = new ArrayDeque<>();
      LongSet $$6 = new LongOpenHashSet();
      $$5.add(Pair.of($$0, 0));
      int $$7 = 0;

      while (!$$5.isEmpty()) {
         Pair<jd, Integer> $$8 = $$5.poll();
         jd $$9 = (jd)$$8.getLeft();
         int $$10 = (Integer)$$8.getRight();
         long $$11 = $$9.a();
         if ($$6.add($$11) && $$4.test($$9)) {
            if (++$$7 >= $$2) {
               return $$7;
            }

            if ($$10 < $$1) {
               $$3.accept($$9, $$2x -> $$5.add(Pair.of($$2x, $$10 + 1)));
            }
         }
      }

      return $$7;
   }

   public static class a extends jd {
      public a() {
         this(0, 0, 0);
      }

      public a(int $$0, int $$1, int $$2) {
         super($$0, $$1, $$2);
      }

      public a(double $$0, double $$1, double $$2) {
         this(ayo.a($$0), ayo.a($$1), ayo.a($$2));
      }

      @Override
      public jd b(int $$0, int $$1, int $$2) {
         return super.b($$0, $$1, $$2).j();
      }

      @Override
      public jd a(int $$0) {
         return super.a($$0).j();
      }

      @Override
      public jd a(ji $$0, int $$1) {
         return super.a($$0, $$1).j();
      }

      @Override
      public jd a(ji.a $$0, int $$1) {
         return super.a($$0, $$1).j();
      }

      @Override
      public jd a(dmm $$0) {
         return super.a($$0).j();
      }

      public jd.a d(int $$0, int $$1, int $$2) {
         this.p($$0);
         this.q($$1);
         this.r($$2);
         return this;
      }

      public jd.a b(double $$0, double $$1, double $$2) {
         return this.d(ayo.a($$0), ayo.a($$1), ayo.a($$2));
      }

      public jd.a g(kh $$0) {
         return this.d($$0.u(), $$0.v(), $$0.w());
      }

      public jd.a f(long $$0) {
         return this.d(a($$0), b($$0), c($$0));
      }

      public jd.a a(ja $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.a($$1, $$2, $$3, ji.a.a), $$0.a($$1, $$2, $$3, ji.a.b), $$0.a($$1, $$2, $$3, ji.a.c));
      }

      public jd.a a(kh $$0, ji $$1) {
         return this.d($$0.u() + $$1.j(), $$0.v() + $$1.k(), $$0.w() + $$1.l());
      }

      public jd.a a(kh $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.u() + $$1, $$0.v() + $$2, $$0.w() + $$3);
      }

      public jd.a a(kh $$0, kh $$1) {
         return this.d($$0.u() + $$1.u(), $$0.v() + $$1.v(), $$0.w() + $$1.w());
      }

      public jd.a c(ji $$0) {
         return this.c($$0, 1);
      }

      public jd.a c(ji $$0, int $$1) {
         return this.d(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
      }

      public jd.a e(int $$0, int $$1, int $$2) {
         return this.d(this.u() + $$0, this.v() + $$1, this.w() + $$2);
      }

      public jd.a h(kh $$0) {
         return this.d(this.u() + $$0.u(), this.v() + $$0.v(), this.w() + $$0.w());
      }

      public jd.a a(ji.a $$0, int $$1, int $$2) {
         switch ($$0) {
            case a:
               return this.d(ayo.a(this.u(), $$1, $$2), this.v(), this.w());
            case b:
               return this.d(this.u(), ayo.a(this.v(), $$1, $$2), this.w());
            case c:
               return this.d(this.u(), this.v(), ayo.a(this.w(), $$1, $$2));
            default:
               throw new IllegalStateException("Unable to clamp axis " + $$0);
         }
      }

      public jd.a p(int $$0) {
         super.u($$0);
         return this;
      }

      public jd.a q(int $$0) {
         super.t($$0);
         return this;
      }

      public jd.a r(int $$0) {
         super.s($$0);
         return this;
      }

      @Override
      public jd j() {
         return new jd(this);
      }
   }
}
