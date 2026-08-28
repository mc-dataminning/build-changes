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
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.concurrent.Immutable;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;

@Immutable
public class iv extends ka {
   public static final Codec<iv> a = Codec.INT_STREAM
      .comapFlatMap($$0 -> ag.a($$0, 3).map($$0x -> new iv($$0x[0], $$0x[1], $$0x[2])), $$0 -> IntStream.of($$0.u(), $$0.v(), $$0.w()))
      .stable();
   public static final yw<ByteBuf, iv> b = new yw<ByteBuf, iv>() {
      public iv a(ByteBuf $$0) {
         return vu.c($$0);
      }

      public void a(ByteBuf $$0, iv $$1) {
         vu.a($$0, $$1);
      }
   };
   private static final Logger j = LogUtils.getLogger();
   public static final iv c = new iv(0, 0, 0);
   public static final int d = 1 + azm.f(azm.c(30000000));
   public static final int e = 64 - 2 * d;
   private static final long k = (1L << d) - 1L;
   private static final long l = (1L << e) - 1L;
   private static final long m = (1L << d) - 1L;
   private static final int n = 0;
   private static final int o = e;
   private static final int p = e + d;
   public static final int f = (1 << d) / 2 - 1;

   public iv(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public iv(ka $$0) {
      this($$0.u(), $$0.v(), $$0.w());
   }

   public static long a(long $$0, jb $$1) {
      return a($$0, $$1.j(), $$1.k(), $$1.l());
   }

   public static long a(long $$0, int $$1, int $$2, int $$3) {
      return a(a($$0) + $$1, b($$0) + $$2, c($$0) + $$3);
   }

   public static int a(long $$0) {
      return (int)($$0 << 64 - p - d >> 64 - d);
   }

   public static int b(long $$0) {
      return (int)($$0 << 64 - e >> 64 - e);
   }

   public static int c(long $$0) {
      return (int)($$0 << 64 - o - d >> 64 - d);
   }

   public static iv d(long $$0) {
      return new iv(a($$0), b($$0), c($$0));
   }

   public static iv a(double $$0, double $$1, double $$2) {
      return new iv(azm.a($$0), azm.a($$1), azm.a($$2));
   }

   public static iv a(jp $$0) {
      return a($$0.a(), $$0.b(), $$0.c());
   }

   public static iv a(iv $$0, iv $$1) {
      return new iv(Math.min($$0.u(), $$1.u()), Math.min($$0.v(), $$1.v()), Math.min($$0.w(), $$1.w()));
   }

   public static iv b(iv $$0, iv $$1) {
      return new iv(Math.max($$0.u(), $$1.u()), Math.max($$0.v(), $$1.v()), Math.max($$0.w(), $$1.w()));
   }

   public long a() {
      return a(this.u(), this.v(), this.w());
   }

   public static long a(int $$0, int $$1, int $$2) {
      long $$3 = 0L;
      $$3 |= ((long)$$0 & k) << p;
      $$3 |= ((long)$$1 & l) << 0;
      return $$3 | ((long)$$2 & m) << o;
   }

   public static long e(long $$0) {
      return $$0 & -16L;
   }

   public iv b(int $$0, int $$1, int $$2) {
      return $$0 == 0 && $$1 == 0 && $$2 == 0 ? this : new iv(this.u() + $$0, this.v() + $$1, this.w() + $$2);
   }

   public ffc b() {
      return ffc.b(this);
   }

   public ffc c() {
      return ffc.c(this);
   }

   public iv a(ka $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   public iv b(ka $$0) {
      return this.b(-$$0.u(), -$$0.v(), -$$0.w());
   }

   public iv a(int $$0) {
      if ($$0 == 1) {
         return this;
      } else {
         return $$0 == 0 ? c : new iv(this.u() * $$0, this.v() * $$0, this.w() * $$0);
      }
   }

   public iv d() {
      return this.a(jb.b);
   }

   public iv b(int $$0) {
      return this.a(jb.b, $$0);
   }

   public iv e() {
      return this.a(jb.a);
   }

   public iv c(int $$0) {
      return this.a(jb.a, $$0);
   }

   public iv f() {
      return this.a(jb.c);
   }

   public iv d(int $$0) {
      return this.a(jb.c, $$0);
   }

   public iv g() {
      return this.a(jb.d);
   }

   public iv e(int $$0) {
      return this.a(jb.d, $$0);
   }

   public iv h() {
      return this.a(jb.e);
   }

   public iv f(int $$0) {
      return this.a(jb.e, $$0);
   }

   public iv i() {
      return this.a(jb.f);
   }

   public iv g(int $$0) {
      return this.a(jb.f, $$0);
   }

   public iv a(jb $$0) {
      return new iv(this.u() + $$0.j(), this.v() + $$0.k(), this.w() + $$0.l());
   }

   public iv a(jb $$0, int $$1) {
      return $$1 == 0 ? this : new iv(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
   }

   public iv a(jb.a $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         int $$2 = $$0 == jb.a.a ? $$1 : 0;
         int $$3 = $$0 == jb.a.b ? $$1 : 0;
         int $$4 = $$0 == jb.a.c ? $$1 : 0;
         return new iv(this.u() + $$2, this.v() + $$3, this.w() + $$4);
      }
   }

   public iv a(dtl $$0) {
      switch ($$0) {
         case a:
         default:
            return this;
         case b:
            return new iv(-this.w(), this.v(), this.u());
         case c:
            return new iv(-this.u(), this.v(), -this.w());
         case d:
            return new iv(this.w(), this.v(), -this.u());
      }
   }

   public iv c(ka $$0) {
      return new iv(this.v() * $$0.w() - this.w() * $$0.v(), this.w() * $$0.u() - this.u() * $$0.w(), this.u() * $$0.v() - this.v() * $$0.u());
   }

   public iv h(int $$0) {
      return new iv(this.u(), $$0, this.w());
   }

   public iv j() {
      return this;
   }

   public iv.a k() {
      return new iv.a(this.u(), this.v(), this.w());
   }

   public ffc a(ffc $$0) {
      return new ffc(
         azm.a($$0.d, (double)((float)this.u() + 1.0E-5F), (double)this.u() + 1.0 - 1.0E-5F),
         azm.a($$0.e, (double)((float)this.v() + 1.0E-5F), (double)this.v() + 1.0 - 1.0E-5F),
         azm.a($$0.f, (double)((float)this.w() + 1.0E-5F), (double)this.w() + 1.0 - 1.0E-5F)
      );
   }

   public static Iterable<iv> a(azv $$0, int $$1, iv $$2, int $$3) {
      return a($$0, $$1, $$2.u() - $$3, $$2.v() - $$3, $$2.w() - $$3, $$2.u() + $$3, $$2.v() + $$3, $$2.w() + $$3);
   }

   @Deprecated
   public static Stream<iv> a(iv $$0) {
      return Stream.of($$0, $$0.g(), $$0.i(), $$0.g().i());
   }

   public static Iterable<iv> a(azv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 - $$3 + 1;
      int $$10 = $$7 - $$4 + 1;
      return () -> new AbstractIterator<iv>() {
            final iv.a a = new iv.a();
            int b = $$1;

            protected iv a() {
               if (this.b <= 0) {
                  return (iv)this.endOfData();
               } else {
                  iv $$0 = this.a.d($$2 + $$0.a($$8), $$3 + $$0.a($$9), $$4 + $$0.a($$10));
                  this.b--;
                  return $$0;
               }
            }
         };
   }

   public static Iterable<iv> a(iv $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$1 + $$2 + $$3;
      int $$5 = $$0.u();
      int $$6 = $$0.v();
      int $$7 = $$0.w();
      return () -> new AbstractIterator<iv>() {
            private final iv.a h = new iv.a();
            private int i;
            private int j;
            private int k;
            private int l;
            private int m;
            private boolean n;

            protected iv a() {
               if (this.n) {
                  this.n = false;
                  this.h.r($$7 - (this.h.w() - $$7));
                  return this.h;
               } else {
                  iv $$0;
                  for ($$0 = null; $$0 == null; this.m++) {
                     if (this.m > this.k) {
                        this.l++;
                        if (this.l > this.j) {
                           this.i++;
                           if (this.i > $$4) {
                              return (iv)this.endOfData();
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

   public static Optional<iv> a(iv $$0, int $$1, int $$2, Predicate<iv> $$3) {
      for (iv $$4 : a($$0, $$1, $$2, $$1)) {
         if ($$3.test($$4)) {
            return Optional.of($$4);
         }
      }

      return Optional.empty();
   }

   public static Stream<iv> b(iv $$0, int $$1, int $$2, int $$3) {
      return StreamSupport.stream(a($$0, $$1, $$2, $$3).spliterator(), false);
   }

   public static Iterable<iv> a(fex $$0) {
      iv $$1 = a($$0.a, $$0.b, $$0.c);
      iv $$2 = a($$0.d, $$0.e, $$0.f);
      return c($$1, $$2);
   }

   public static Iterable<iv> c(iv $$0, iv $$1) {
      return b(
         Math.min($$0.u(), $$1.u()),
         Math.min($$0.v(), $$1.v()),
         Math.min($$0.w(), $$1.w()),
         Math.max($$0.u(), $$1.u()),
         Math.max($$0.v(), $$1.v()),
         Math.max($$0.w(), $$1.w())
      );
   }

   public static Stream<iv> d(iv $$0, iv $$1) {
      return StreamSupport.stream(c($$0, $$1).spliterator(), false);
   }

   public static Stream<iv> a(erf $$0) {
      return a(
         Math.min($$0.h(), $$0.k()),
         Math.min($$0.i(), $$0.l()),
         Math.min($$0.j(), $$0.m()),
         Math.max($$0.h(), $$0.k()),
         Math.max($$0.i(), $$0.l()),
         Math.max($$0.j(), $$0.m())
      );
   }

   public static Stream<iv> b(fex $$0) {
      return a(azm.a($$0.a), azm.a($$0.b), azm.a($$0.c), azm.a($$0.d), azm.a($$0.e), azm.a($$0.f));
   }

   public static Stream<iv> a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return StreamSupport.stream(b($$0, $$1, $$2, $$3, $$4, $$5).spliterator(), false);
   }

   public static Iterable<iv> b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$3 - $$0 + 1;
      int $$7 = $$4 - $$1 + 1;
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 * $$7 * $$8;
      return () -> new AbstractIterator<iv>() {
            private final iv.a g = new iv.a();
            private int h;

            protected iv a() {
               if (this.h == $$9) {
                  return (iv)this.endOfData();
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

   public static Iterable<iv.a> a(iv $$0, int $$1, jb $$2, jb $$3) {
      Validate.validState($$2.o() != $$3.o(), "The two directions cannot be on the same axis", new Object[0]);
      return () -> new AbstractIterator<iv.a>() {
            private final jb[] e = new jb[]{$$2, $$3, $$2.g(), $$3.g()};
            private final iv.a f = $$0.k().c($$3);
            private final int g = 4 * $$1;
            private int h = -1;
            private int i;
            private int j;
            private int k = this.f.u();
            private int l = this.f.v();
            private int m = this.f.w();

            protected iv.a a() {
               this.f.d(this.k, this.l, this.m).c(this.e[(this.h + 4) % 4]);
               this.k = this.f.u();
               this.l = this.f.v();
               this.m = this.f.w();
               if (this.j >= this.i) {
                  if (this.h >= this.g) {
                     return (iv.a)this.endOfData();
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

   public static int a(iv $$0, int $$1, int $$2, BiConsumer<iv, Consumer<iv>> $$3, Function<iv, iv.b> $$4) {
      Queue<Pair<iv, Integer>> $$5 = new ArrayDeque<>();
      LongSet $$6 = new LongOpenHashSet();
      $$5.add(Pair.of($$0, 0));
      int $$7 = 0;

      while (!$$5.isEmpty()) {
         Pair<iv, Integer> $$8 = $$5.poll();
         iv $$9 = (iv)$$8.getLeft();
         int $$10 = (Integer)$$8.getRight();
         long $$11 = $$9.a();
         if ($$6.add($$11)) {
            iv.b $$12 = $$4.apply($$9);
            if ($$12 != iv.b.b) {
               if ($$12 == iv.b.c) {
                  break;
               }

               if (++$$7 >= $$2) {
                  return $$7;
               }

               if ($$10 < $$1) {
                  $$3.accept($$9, $$2x -> $$5.add(Pair.of($$2x, $$10 + 1)));
               }
            }
         }
      }

      return $$7;
   }

   public static class a extends iv {
      public a() {
         this(0, 0, 0);
      }

      public a(int $$0, int $$1, int $$2) {
         super($$0, $$1, $$2);
      }

      public a(double $$0, double $$1, double $$2) {
         this(azm.a($$0), azm.a($$1), azm.a($$2));
      }

      @Override
      public iv b(int $$0, int $$1, int $$2) {
         return super.b($$0, $$1, $$2).j();
      }

      @Override
      public iv a(int $$0) {
         return super.a($$0).j();
      }

      @Override
      public iv a(jb $$0, int $$1) {
         return super.a($$0, $$1).j();
      }

      @Override
      public iv a(jb.a $$0, int $$1) {
         return super.a($$0, $$1).j();
      }

      @Override
      public iv a(dtl $$0) {
         return super.a($$0).j();
      }

      public iv.a d(int $$0, int $$1, int $$2) {
         this.p($$0);
         this.q($$1);
         this.r($$2);
         return this;
      }

      public iv.a b(double $$0, double $$1, double $$2) {
         return this.d(azm.a($$0), azm.a($$1), azm.a($$2));
      }

      public iv.a g(ka $$0) {
         return this.d($$0.u(), $$0.v(), $$0.w());
      }

      public iv.a f(long $$0) {
         return this.d(a($$0), b($$0), c($$0));
      }

      public iv.a a(is $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.a($$1, $$2, $$3, jb.a.a), $$0.a($$1, $$2, $$3, jb.a.b), $$0.a($$1, $$2, $$3, jb.a.c));
      }

      public iv.a a(ka $$0, jb $$1) {
         return this.d($$0.u() + $$1.j(), $$0.v() + $$1.k(), $$0.w() + $$1.l());
      }

      public iv.a a(ka $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.u() + $$1, $$0.v() + $$2, $$0.w() + $$3);
      }

      public iv.a a(ka $$0, ka $$1) {
         return this.d($$0.u() + $$1.u(), $$0.v() + $$1.v(), $$0.w() + $$1.w());
      }

      public iv.a c(jb $$0) {
         return this.c($$0, 1);
      }

      public iv.a c(jb $$0, int $$1) {
         return this.d(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
      }

      public iv.a e(int $$0, int $$1, int $$2) {
         return this.d(this.u() + $$0, this.v() + $$1, this.w() + $$2);
      }

      public iv.a h(ka $$0) {
         return this.d(this.u() + $$0.u(), this.v() + $$0.v(), this.w() + $$0.w());
      }

      public iv.a a(jb.a $$0, int $$1, int $$2) {
         switch ($$0) {
            case a:
               return this.d(azm.a(this.u(), $$1, $$2), this.v(), this.w());
            case b:
               return this.d(this.u(), azm.a(this.v(), $$1, $$2), this.w());
            case c:
               return this.d(this.u(), this.v(), azm.a(this.w(), $$1, $$2));
            default:
               throw new IllegalStateException("Unable to clamp axis " + $$0);
         }
      }

      public iv.a p(int $$0) {
         super.u($$0);
         return this;
      }

      public iv.a q(int $$0) {
         super.t($$0);
         return this;
      }

      public iv.a r(int $$0) {
         super.s($$0);
         return this;
      }

      @Override
      public iv j() {
         return new iv(this);
      }
   }

   public static enum b {
      a,
      b,
      c;
   }
}
