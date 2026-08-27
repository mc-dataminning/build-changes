import com.google.common.collect.AbstractIterator;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
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
public class hv extends iz {
   public static final Codec<hv> a = Codec.INT_STREAM
      .comapFlatMap($$0 -> ac.a($$0, 3).map($$0x -> new hv($$0x[0], $$0x[1], $$0x[2])), $$0 -> IntStream.of($$0.u(), $$0.v(), $$0.w()))
      .stable();
   private static final Logger d = LogUtils.getLogger();
   public static final hv b = new hv(0, 0, 0);
   private static final int e = 1 + aty.f(aty.c(30000000));
   private static final int h = e;
   public static final int c = 64 - e - h;
   private static final long i = (1L << e) - 1L;
   private static final long j = (1L << c) - 1L;
   private static final long k = (1L << h) - 1L;
   private static final int l = 0;
   private static final int m = c;
   private static final int n = c + h;

   public hv(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public hv(iz $$0) {
      this($$0.u(), $$0.v(), $$0.w());
   }

   public static long a(long $$0, ia $$1) {
      return a($$0, $$1.j(), $$1.k(), $$1.l());
   }

   public static long a(long $$0, int $$1, int $$2, int $$3) {
      return a(a($$0) + $$1, b($$0) + $$2, c($$0) + $$3);
   }

   public static int a(long $$0) {
      return (int)($$0 << 64 - n - e >> 64 - e);
   }

   public static int b(long $$0) {
      return (int)($$0 << 64 - c >> 64 - c);
   }

   public static int c(long $$0) {
      return (int)($$0 << 64 - m - h >> 64 - h);
   }

   public static hv d(long $$0) {
      return new hv(a($$0), b($$0), c($$0));
   }

   public static hv a(double $$0, double $$1, double $$2) {
      return new hv(aty.a($$0), aty.a($$1), aty.a($$2));
   }

   public static hv a(ip $$0) {
      return a($$0.a(), $$0.b(), $$0.c());
   }

   public long a() {
      return a(this.u(), this.v(), this.w());
   }

   public static long a(int $$0, int $$1, int $$2) {
      long $$3 = 0L;
      $$3 |= ((long)$$0 & i) << n;
      $$3 |= ((long)$$1 & j) << 0;
      return $$3 | ((long)$$2 & k) << m;
   }

   public static long e(long $$0) {
      return $$0 & -16L;
   }

   public hv b(int $$0, int $$1, int $$2) {
      return $$0 == 0 && $$1 == 0 && $$2 == 0 ? this : new hv(this.u() + $$0, this.v() + $$1, this.w() + $$2);
   }

   public elb b() {
      return elb.b(this);
   }

   public hv a(iz $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   public hv b(iz $$0) {
      return this.b(-$$0.u(), -$$0.v(), -$$0.w());
   }

   public hv a(int $$0) {
      if ($$0 == 1) {
         return this;
      } else {
         return $$0 == 0 ? b : new hv(this.u() * $$0, this.v() * $$0, this.w() * $$0);
      }
   }

   public hv c() {
      return this.a(ia.b);
   }

   public hv b(int $$0) {
      return this.a(ia.b, $$0);
   }

   public hv d() {
      return this.a(ia.a);
   }

   public hv c(int $$0) {
      return this.a(ia.a, $$0);
   }

   public hv e() {
      return this.a(ia.c);
   }

   public hv d(int $$0) {
      return this.a(ia.c, $$0);
   }

   public hv f() {
      return this.a(ia.d);
   }

   public hv e(int $$0) {
      return this.a(ia.d, $$0);
   }

   public hv g() {
      return this.a(ia.e);
   }

   public hv f(int $$0) {
      return this.a(ia.e, $$0);
   }

   public hv h() {
      return this.a(ia.f);
   }

   public hv g(int $$0) {
      return this.a(ia.f, $$0);
   }

   public hv a(ia $$0) {
      return new hv(this.u() + $$0.j(), this.v() + $$0.k(), this.w() + $$0.l());
   }

   public hv a(ia $$0, int $$1) {
      return $$1 == 0 ? this : new hv(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
   }

   public hv a(ia.a $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         int $$2 = $$0 == ia.a.a ? $$1 : 0;
         int $$3 = $$0 == ia.a.b ? $$1 : 0;
         int $$4 = $$0 == ia.a.c ? $$1 : 0;
         return new hv(this.u() + $$2, this.v() + $$3, this.w() + $$4);
      }
   }

   public hv a(dcl $$0) {
      switch ($$0) {
         case a:
         default:
            return this;
         case b:
            return new hv(-this.w(), this.v(), this.u());
         case c:
            return new hv(-this.u(), this.v(), -this.w());
         case d:
            return new hv(this.w(), this.v(), -this.u());
      }
   }

   public hv c(iz $$0) {
      return new hv(this.v() * $$0.w() - this.w() * $$0.v(), this.w() * $$0.u() - this.u() * $$0.w(), this.u() * $$0.v() - this.v() * $$0.u());
   }

   public hv h(int $$0) {
      return new hv(this.u(), $$0, this.w());
   }

   public hv i() {
      return this;
   }

   public hv.a j() {
      return new hv.a(this.u(), this.v(), this.w());
   }

   public static Iterable<hv> a(auf $$0, int $$1, hv $$2, int $$3) {
      return a($$0, $$1, $$2.u() - $$3, $$2.v() - $$3, $$2.w() - $$3, $$2.u() + $$3, $$2.v() + $$3, $$2.w() + $$3);
   }

   @Deprecated
   public static Stream<hv> a(hv $$0) {
      return Stream.of($$0, $$0.f(), $$0.h(), $$0.f().h());
   }

   public static Iterable<hv> a(auf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 - $$3 + 1;
      int $$10 = $$7 - $$4 + 1;
      return () -> new AbstractIterator<hv>() {
            final hv.a a = new hv.a();
            int b = $$1;

            protected hv a() {
               if (this.b <= 0) {
                  return (hv)this.endOfData();
               } else {
                  hv $$0 = this.a.d($$2 + $$0.a($$8), $$3 + $$0.a($$9), $$4 + $$0.a($$10));
                  this.b--;
                  return $$0;
               }
            }
         };
   }

   public static Iterable<hv> a(hv $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$1 + $$2 + $$3;
      int $$5 = $$0.u();
      int $$6 = $$0.v();
      int $$7 = $$0.w();
      return () -> new AbstractIterator<hv>() {
            private final hv.a h = new hv.a();
            private int i;
            private int j;
            private int k;
            private int l;
            private int m;
            private boolean n;

            protected hv a() {
               if (this.n) {
                  this.n = false;
                  this.h.r($$7 - (this.h.w() - $$7));
                  return this.h;
               } else {
                  hv $$0;
                  for ($$0 = null; $$0 == null; this.m++) {
                     if (this.m > this.k) {
                        this.l++;
                        if (this.l > this.j) {
                           this.i++;
                           if (this.i > $$4) {
                              return (hv)this.endOfData();
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

   public static Optional<hv> a(hv $$0, int $$1, int $$2, Predicate<hv> $$3) {
      for (hv $$4 : a($$0, $$1, $$2, $$1)) {
         if ($$3.test($$4)) {
            return Optional.of($$4);
         }
      }

      return Optional.empty();
   }

   public static Stream<hv> b(hv $$0, int $$1, int $$2, int $$3) {
      return StreamSupport.stream(a($$0, $$1, $$2, $$3).spliterator(), false);
   }

   public static Iterable<hv> a(hv $$0, hv $$1) {
      return b(
         Math.min($$0.u(), $$1.u()),
         Math.min($$0.v(), $$1.v()),
         Math.min($$0.w(), $$1.w()),
         Math.max($$0.u(), $$1.u()),
         Math.max($$0.v(), $$1.v()),
         Math.max($$0.w(), $$1.w())
      );
   }

   public static Stream<hv> b(hv $$0, hv $$1) {
      return StreamSupport.stream(a($$0, $$1).spliterator(), false);
   }

   public static Stream<hv> a(dyg $$0) {
      return a(
         Math.min($$0.h(), $$0.k()),
         Math.min($$0.i(), $$0.l()),
         Math.min($$0.j(), $$0.m()),
         Math.max($$0.h(), $$0.k()),
         Math.max($$0.i(), $$0.l()),
         Math.max($$0.j(), $$0.m())
      );
   }

   public static Stream<hv> a(ekw $$0) {
      return a(aty.a($$0.a), aty.a($$0.b), aty.a($$0.c), aty.a($$0.d), aty.a($$0.e), aty.a($$0.f));
   }

   public static Stream<hv> a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return StreamSupport.stream(b($$0, $$1, $$2, $$3, $$4, $$5).spliterator(), false);
   }

   public static Iterable<hv> b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$3 - $$0 + 1;
      int $$7 = $$4 - $$1 + 1;
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 * $$7 * $$8;
      return () -> new AbstractIterator<hv>() {
            private final hv.a g = new hv.a();
            private int h;

            protected hv a() {
               if (this.h == $$9) {
                  return (hv)this.endOfData();
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

   public static Iterable<hv.a> a(hv $$0, int $$1, ia $$2, ia $$3) {
      Validate.validState($$2.o() != $$3.o(), "The two directions cannot be on the same axis", new Object[0]);
      return () -> new AbstractIterator<hv.a>() {
            private final ia[] e = new ia[]{$$2, $$3, $$2.g(), $$3.g()};
            private final hv.a f = $$0.j().c($$3);
            private final int g = 4 * $$1;
            private int h = -1;
            private int i;
            private int j;
            private int k = this.f.u();
            private int l = this.f.v();
            private int m = this.f.w();

            protected hv.a a() {
               this.f.d(this.k, this.l, this.m).c(this.e[(this.h + 4) % 4]);
               this.k = this.f.u();
               this.l = this.f.v();
               this.m = this.f.w();
               if (this.j >= this.i) {
                  if (this.h >= this.g) {
                     return (hv.a)this.endOfData();
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

   public static int a(hv $$0, int $$1, int $$2, BiConsumer<hv, Consumer<hv>> $$3, Predicate<hv> $$4) {
      Queue<Pair<hv, Integer>> $$5 = new ArrayDeque<>();
      LongSet $$6 = new LongOpenHashSet();
      $$5.add(Pair.of($$0, 0));
      int $$7 = 0;

      while (!$$5.isEmpty()) {
         Pair<hv, Integer> $$8 = $$5.poll();
         hv $$9 = (hv)$$8.getLeft();
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

   public static class a extends hv {
      public a() {
         this(0, 0, 0);
      }

      public a(int $$0, int $$1, int $$2) {
         super($$0, $$1, $$2);
      }

      public a(double $$0, double $$1, double $$2) {
         this(aty.a($$0), aty.a($$1), aty.a($$2));
      }

      @Override
      public hv b(int $$0, int $$1, int $$2) {
         return super.b($$0, $$1, $$2).i();
      }

      @Override
      public hv a(int $$0) {
         return super.a($$0).i();
      }

      @Override
      public hv a(ia $$0, int $$1) {
         return super.a($$0, $$1).i();
      }

      @Override
      public hv a(ia.a $$0, int $$1) {
         return super.a($$0, $$1).i();
      }

      @Override
      public hv a(dcl $$0) {
         return super.a($$0).i();
      }

      public hv.a d(int $$0, int $$1, int $$2) {
         this.p($$0);
         this.q($$1);
         this.r($$2);
         return this;
      }

      public hv.a b(double $$0, double $$1, double $$2) {
         return this.d(aty.a($$0), aty.a($$1), aty.a($$2));
      }

      public hv.a g(iz $$0) {
         return this.d($$0.u(), $$0.v(), $$0.w());
      }

      public hv.a f(long $$0) {
         return this.d(a($$0), b($$0), c($$0));
      }

      public hv.a a(ht $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.a($$1, $$2, $$3, ia.a.a), $$0.a($$1, $$2, $$3, ia.a.b), $$0.a($$1, $$2, $$3, ia.a.c));
      }

      public hv.a a(iz $$0, ia $$1) {
         return this.d($$0.u() + $$1.j(), $$0.v() + $$1.k(), $$0.w() + $$1.l());
      }

      public hv.a a(iz $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.u() + $$1, $$0.v() + $$2, $$0.w() + $$3);
      }

      public hv.a a(iz $$0, iz $$1) {
         return this.d($$0.u() + $$1.u(), $$0.v() + $$1.v(), $$0.w() + $$1.w());
      }

      public hv.a c(ia $$0) {
         return this.c($$0, 1);
      }

      public hv.a c(ia $$0, int $$1) {
         return this.d(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
      }

      public hv.a e(int $$0, int $$1, int $$2) {
         return this.d(this.u() + $$0, this.v() + $$1, this.w() + $$2);
      }

      public hv.a h(iz $$0) {
         return this.d(this.u() + $$0.u(), this.v() + $$0.v(), this.w() + $$0.w());
      }

      public hv.a a(ia.a $$0, int $$1, int $$2) {
         switch ($$0) {
            case a:
               return this.d(aty.a(this.u(), $$1, $$2), this.v(), this.w());
            case b:
               return this.d(this.u(), aty.a(this.v(), $$1, $$2), this.w());
            case c:
               return this.d(this.u(), this.v(), aty.a(this.w(), $$1, $$2));
            default:
               throw new IllegalStateException("Unable to clamp axis " + $$0);
         }
      }

      public hv.a p(int $$0) {
         super.u($$0);
         return this;
      }

      public hv.a q(int $$0) {
         super.t($$0);
         return this;
      }

      public hv.a r(int $$0) {
         super.s($$0);
         return this;
      }

      @Override
      public hv i() {
         return new hv(this);
      }
   }
}
