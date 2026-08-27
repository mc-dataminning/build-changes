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
public class ht extends iw {
   public static final Codec<ht> a = Codec.INT_STREAM
      .comapFlatMap($$0 -> ac.a($$0, 3).map($$0x -> new ht($$0x[0], $$0x[1], $$0x[2])), $$0 -> IntStream.of($$0.u(), $$0.v(), $$0.w()))
      .stable();
   private static final Logger d = LogUtils.getLogger();
   public static final ht b = new ht(0, 0, 0);
   private static final int e = 1 + ati.f(ati.c(30000000));
   private static final int h = e;
   public static final int c = 64 - e - h;
   private static final long i = (1L << e) - 1L;
   private static final long j = (1L << c) - 1L;
   private static final long k = (1L << h) - 1L;
   private static final int l = 0;
   private static final int m = c;
   private static final int n = c + h;

   public ht(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public ht(iw $$0) {
      this($$0.u(), $$0.v(), $$0.w());
   }

   public static long a(long $$0, hx $$1) {
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

   public static ht d(long $$0) {
      return new ht(a($$0), b($$0), c($$0));
   }

   public static ht a(double $$0, double $$1, double $$2) {
      return new ht(ati.a($$0), ati.a($$1), ati.a($$2));
   }

   public static ht a(im $$0) {
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

   public ht b(int $$0, int $$1, int $$2) {
      return $$0 == 0 && $$1 == 0 && $$2 == 0 ? this : new ht(this.u() + $$0, this.v() + $$1, this.w() + $$2);
   }

   public eji b() {
      return eji.b(this);
   }

   public ht a(iw $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   public ht b(iw $$0) {
      return this.b(-$$0.u(), -$$0.v(), -$$0.w());
   }

   public ht a(int $$0) {
      if ($$0 == 1) {
         return this;
      } else {
         return $$0 == 0 ? b : new ht(this.u() * $$0, this.v() * $$0, this.w() * $$0);
      }
   }

   public ht c() {
      return this.a(hx.b);
   }

   public ht b(int $$0) {
      return this.a(hx.b, $$0);
   }

   public ht d() {
      return this.a(hx.a);
   }

   public ht c(int $$0) {
      return this.a(hx.a, $$0);
   }

   public ht e() {
      return this.a(hx.c);
   }

   public ht d(int $$0) {
      return this.a(hx.c, $$0);
   }

   public ht f() {
      return this.a(hx.d);
   }

   public ht e(int $$0) {
      return this.a(hx.d, $$0);
   }

   public ht g() {
      return this.a(hx.e);
   }

   public ht f(int $$0) {
      return this.a(hx.e, $$0);
   }

   public ht h() {
      return this.a(hx.f);
   }

   public ht g(int $$0) {
      return this.a(hx.f, $$0);
   }

   public ht a(hx $$0) {
      return new ht(this.u() + $$0.j(), this.v() + $$0.k(), this.w() + $$0.l());
   }

   public ht a(hx $$0, int $$1) {
      return $$1 == 0 ? this : new ht(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
   }

   public ht a(hx.a $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         int $$2 = $$0 == hx.a.a ? $$1 : 0;
         int $$3 = $$0 == hx.a.b ? $$1 : 0;
         int $$4 = $$0 == hx.a.c ? $$1 : 0;
         return new ht(this.u() + $$2, this.v() + $$3, this.w() + $$4);
      }
   }

   public ht a(dbf $$0) {
      switch ($$0) {
         case a:
         default:
            return this;
         case b:
            return new ht(-this.w(), this.v(), this.u());
         case c:
            return new ht(-this.u(), this.v(), -this.w());
         case d:
            return new ht(this.w(), this.v(), -this.u());
      }
   }

   public ht c(iw $$0) {
      return new ht(this.v() * $$0.w() - this.w() * $$0.v(), this.w() * $$0.u() - this.u() * $$0.w(), this.u() * $$0.v() - this.v() * $$0.u());
   }

   public ht h(int $$0) {
      return new ht(this.u(), $$0, this.w());
   }

   public ht i() {
      return this;
   }

   public ht.a j() {
      return new ht.a(this.u(), this.v(), this.w());
   }

   public static Iterable<ht> a(ato $$0, int $$1, ht $$2, int $$3) {
      return a($$0, $$1, $$2.u() - $$3, $$2.v() - $$3, $$2.w() - $$3, $$2.u() + $$3, $$2.v() + $$3, $$2.w() + $$3);
   }

   @Deprecated
   public static Stream<ht> a(ht $$0) {
      return Stream.of($$0, $$0.f(), $$0.h(), $$0.f().h());
   }

   public static Iterable<ht> a(ato $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 - $$3 + 1;
      int $$10 = $$7 - $$4 + 1;
      return () -> new AbstractIterator<ht>() {
            final ht.a a = new ht.a();
            int b = $$1;

            protected ht a() {
               if (this.b <= 0) {
                  return (ht)this.endOfData();
               } else {
                  ht $$0 = this.a.d($$2 + $$0.a($$8), $$3 + $$0.a($$9), $$4 + $$0.a($$10));
                  this.b--;
                  return $$0;
               }
            }
         };
   }

   public static Iterable<ht> a(ht $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$1 + $$2 + $$3;
      int $$5 = $$0.u();
      int $$6 = $$0.v();
      int $$7 = $$0.w();
      return () -> new AbstractIterator<ht>() {
            private final ht.a h = new ht.a();
            private int i;
            private int j;
            private int k;
            private int l;
            private int m;
            private boolean n;

            protected ht a() {
               if (this.n) {
                  this.n = false;
                  this.h.r($$7 - (this.h.w() - $$7));
                  return this.h;
               } else {
                  ht $$0;
                  for ($$0 = null; $$0 == null; this.m++) {
                     if (this.m > this.k) {
                        this.l++;
                        if (this.l > this.j) {
                           this.i++;
                           if (this.i > $$4) {
                              return (ht)this.endOfData();
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

   public static Optional<ht> a(ht $$0, int $$1, int $$2, Predicate<ht> $$3) {
      for (ht $$4 : a($$0, $$1, $$2, $$1)) {
         if ($$3.test($$4)) {
            return Optional.of($$4);
         }
      }

      return Optional.empty();
   }

   public static Stream<ht> b(ht $$0, int $$1, int $$2, int $$3) {
      return StreamSupport.stream(a($$0, $$1, $$2, $$3).spliterator(), false);
   }

   public static Iterable<ht> a(ht $$0, ht $$1) {
      return b(
         Math.min($$0.u(), $$1.u()),
         Math.min($$0.v(), $$1.v()),
         Math.min($$0.w(), $$1.w()),
         Math.max($$0.u(), $$1.u()),
         Math.max($$0.v(), $$1.v()),
         Math.max($$0.w(), $$1.w())
      );
   }

   public static Stream<ht> b(ht $$0, ht $$1) {
      return StreamSupport.stream(a($$0, $$1).spliterator(), false);
   }

   public static Stream<ht> a(dwn $$0) {
      return a(
         Math.min($$0.g(), $$0.j()),
         Math.min($$0.h(), $$0.k()),
         Math.min($$0.i(), $$0.l()),
         Math.max($$0.g(), $$0.j()),
         Math.max($$0.h(), $$0.k()),
         Math.max($$0.i(), $$0.l())
      );
   }

   public static Stream<ht> a(ejd $$0) {
      return a(ati.a($$0.a), ati.a($$0.b), ati.a($$0.c), ati.a($$0.d), ati.a($$0.e), ati.a($$0.f));
   }

   public static Stream<ht> a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return StreamSupport.stream(b($$0, $$1, $$2, $$3, $$4, $$5).spliterator(), false);
   }

   public static Iterable<ht> b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$3 - $$0 + 1;
      int $$7 = $$4 - $$1 + 1;
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 * $$7 * $$8;
      return () -> new AbstractIterator<ht>() {
            private final ht.a g = new ht.a();
            private int h;

            protected ht a() {
               if (this.h == $$9) {
                  return (ht)this.endOfData();
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

   public static Iterable<ht.a> a(ht $$0, int $$1, hx $$2, hx $$3) {
      Validate.validState($$2.o() != $$3.o(), "The two directions cannot be on the same axis", new Object[0]);
      return () -> new AbstractIterator<ht.a>() {
            private final hx[] e = new hx[]{$$2, $$3, $$2.g(), $$3.g()};
            private final ht.a f = $$0.j().c($$3);
            private final int g = 4 * $$1;
            private int h = -1;
            private int i;
            private int j;
            private int k = this.f.u();
            private int l = this.f.v();
            private int m = this.f.w();

            protected ht.a a() {
               this.f.d(this.k, this.l, this.m).c(this.e[(this.h + 4) % 4]);
               this.k = this.f.u();
               this.l = this.f.v();
               this.m = this.f.w();
               if (this.j >= this.i) {
                  if (this.h >= this.g) {
                     return (ht.a)this.endOfData();
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

   public static int a(ht $$0, int $$1, int $$2, BiConsumer<ht, Consumer<ht>> $$3, Predicate<ht> $$4) {
      Queue<Pair<ht, Integer>> $$5 = new ArrayDeque<>();
      LongSet $$6 = new LongOpenHashSet();
      $$5.add(Pair.of($$0, 0));
      int $$7 = 0;

      while (!$$5.isEmpty()) {
         Pair<ht, Integer> $$8 = $$5.poll();
         ht $$9 = (ht)$$8.getLeft();
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

   public static class a extends ht {
      public a() {
         this(0, 0, 0);
      }

      public a(int $$0, int $$1, int $$2) {
         super($$0, $$1, $$2);
      }

      public a(double $$0, double $$1, double $$2) {
         this(ati.a($$0), ati.a($$1), ati.a($$2));
      }

      @Override
      public ht b(int $$0, int $$1, int $$2) {
         return super.b($$0, $$1, $$2).i();
      }

      @Override
      public ht a(int $$0) {
         return super.a($$0).i();
      }

      @Override
      public ht a(hx $$0, int $$1) {
         return super.a($$0, $$1).i();
      }

      @Override
      public ht a(hx.a $$0, int $$1) {
         return super.a($$0, $$1).i();
      }

      @Override
      public ht a(dbf $$0) {
         return super.a($$0).i();
      }

      public ht.a d(int $$0, int $$1, int $$2) {
         this.p($$0);
         this.q($$1);
         this.r($$2);
         return this;
      }

      public ht.a b(double $$0, double $$1, double $$2) {
         return this.d(ati.a($$0), ati.a($$1), ati.a($$2));
      }

      public ht.a g(iw $$0) {
         return this.d($$0.u(), $$0.v(), $$0.w());
      }

      public ht.a f(long $$0) {
         return this.d(a($$0), b($$0), c($$0));
      }

      public ht.a a(hr $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.a($$1, $$2, $$3, hx.a.a), $$0.a($$1, $$2, $$3, hx.a.b), $$0.a($$1, $$2, $$3, hx.a.c));
      }

      public ht.a a(iw $$0, hx $$1) {
         return this.d($$0.u() + $$1.j(), $$0.v() + $$1.k(), $$0.w() + $$1.l());
      }

      public ht.a a(iw $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.u() + $$1, $$0.v() + $$2, $$0.w() + $$3);
      }

      public ht.a a(iw $$0, iw $$1) {
         return this.d($$0.u() + $$1.u(), $$0.v() + $$1.v(), $$0.w() + $$1.w());
      }

      public ht.a c(hx $$0) {
         return this.c($$0, 1);
      }

      public ht.a c(hx $$0, int $$1) {
         return this.d(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
      }

      public ht.a e(int $$0, int $$1, int $$2) {
         return this.d(this.u() + $$0, this.v() + $$1, this.w() + $$2);
      }

      public ht.a h(iw $$0) {
         return this.d(this.u() + $$0.u(), this.v() + $$0.v(), this.w() + $$0.w());
      }

      public ht.a a(hx.a $$0, int $$1, int $$2) {
         switch ($$0) {
            case a:
               return this.d(ati.a(this.u(), $$1, $$2), this.v(), this.w());
            case b:
               return this.d(this.u(), ati.a(this.v(), $$1, $$2), this.w());
            case c:
               return this.d(this.u(), this.v(), ati.a(this.w(), $$1, $$2));
            default:
               throw new IllegalStateException("Unable to clamp axis " + $$0);
         }
      }

      public ht.a p(int $$0) {
         super.u($$0);
         return this;
      }

      public ht.a q(int $$0) {
         super.t($$0);
         return this;
      }

      public ht.a r(int $$0) {
         super.s($$0);
         return this;
      }

      @Override
      public ht i() {
         return new ht(this);
      }
   }
}
