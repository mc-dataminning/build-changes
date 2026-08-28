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
public class iz extends kd {
   public static final Codec<iz> a = Codec.INT_STREAM
      .comapFlatMap($$0 -> ac.a($$0, 3).map($$0x -> new iz($$0x[0], $$0x[1], $$0x[2])), $$0 -> IntStream.of($$0.u(), $$0.v(), $$0.w()))
      .stable();
   public static final zm<ByteBuf, iz> b = new zm<ByteBuf, iz>() {
      public iz a(ByteBuf $$0) {
         return wl.b($$0);
      }

      public void a(ByteBuf $$0, iz $$1) {
         wl.a($$0, $$1);
      }
   };
   private static final Logger e = LogUtils.getLogger();
   public static final iz c = new iz(0, 0, 0);
   private static final int h = 1 + ayy.f(ayy.c(30000000));
   private static final int i = h;
   public static final int d = 64 - h - i;
   private static final long j = (1L << h) - 1L;
   private static final long k = (1L << d) - 1L;
   private static final long l = (1L << i) - 1L;
   private static final int m = 0;
   private static final int n = d;
   private static final int o = d + i;

   public iz(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public iz(kd $$0) {
      this($$0.u(), $$0.v(), $$0.w());
   }

   public static long a(long $$0, je $$1) {
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

   public static iz d(long $$0) {
      return new iz(a($$0), b($$0), c($$0));
   }

   public static iz a(double $$0, double $$1, double $$2) {
      return new iz(ayy.a($$0), ayy.a($$1), ayy.a($$2));
   }

   public static iz a(js $$0) {
      return a($$0.a(), $$0.b(), $$0.c());
   }

   public static iz a(iz $$0, iz $$1) {
      return new iz(Math.min($$0.u(), $$1.u()), Math.min($$0.v(), $$1.v()), Math.min($$0.w(), $$1.w()));
   }

   public static iz b(iz $$0, iz $$1) {
      return new iz(Math.max($$0.u(), $$1.u()), Math.max($$0.v(), $$1.v()), Math.max($$0.w(), $$1.w()));
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

   public iz b(int $$0, int $$1, int $$2) {
      return $$0 == 0 && $$1 == 0 && $$2 == 0 ? this : new iz(this.u() + $$0, this.v() + $$1, this.w() + $$2);
   }

   public evq b() {
      return evq.b(this);
   }

   public iz a(kd $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   public iz b(kd $$0) {
      return this.b(-$$0.u(), -$$0.v(), -$$0.w());
   }

   public iz a(int $$0) {
      if ($$0 == 1) {
         return this;
      } else {
         return $$0 == 0 ? c : new iz(this.u() * $$0, this.v() * $$0, this.w() * $$0);
      }
   }

   public iz c() {
      return this.a(je.b);
   }

   public iz b(int $$0) {
      return this.a(je.b, $$0);
   }

   public iz d() {
      return this.a(je.a);
   }

   public iz c(int $$0) {
      return this.a(je.a, $$0);
   }

   public iz e() {
      return this.a(je.c);
   }

   public iz d(int $$0) {
      return this.a(je.c, $$0);
   }

   public iz f() {
      return this.a(je.d);
   }

   public iz e(int $$0) {
      return this.a(je.d, $$0);
   }

   public iz g() {
      return this.a(je.e);
   }

   public iz f(int $$0) {
      return this.a(je.e, $$0);
   }

   public iz h() {
      return this.a(je.f);
   }

   public iz g(int $$0) {
      return this.a(je.f, $$0);
   }

   public iz a(je $$0) {
      return new iz(this.u() + $$0.j(), this.v() + $$0.k(), this.w() + $$0.l());
   }

   public iz a(je $$0, int $$1) {
      return $$1 == 0 ? this : new iz(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
   }

   public iz a(je.a $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         int $$2 = $$0 == je.a.a ? $$1 : 0;
         int $$3 = $$0 == je.a.b ? $$1 : 0;
         int $$4 = $$0 == je.a.c ? $$1 : 0;
         return new iz(this.u() + $$2, this.v() + $$3, this.w() + $$4);
      }
   }

   public iz a(dll $$0) {
      switch ($$0) {
         case a:
         default:
            return this;
         case b:
            return new iz(-this.w(), this.v(), this.u());
         case c:
            return new iz(-this.u(), this.v(), -this.w());
         case d:
            return new iz(this.w(), this.v(), -this.u());
      }
   }

   public iz c(kd $$0) {
      return new iz(this.v() * $$0.w() - this.w() * $$0.v(), this.w() * $$0.u() - this.u() * $$0.w(), this.u() * $$0.v() - this.v() * $$0.u());
   }

   public iz h(int $$0) {
      return new iz(this.u(), $$0, this.w());
   }

   public iz i() {
      return this;
   }

   public iz.a j() {
      return new iz.a(this.u(), this.v(), this.w());
   }

   public static Iterable<iz> a(azg $$0, int $$1, iz $$2, int $$3) {
      return a($$0, $$1, $$2.u() - $$3, $$2.v() - $$3, $$2.w() - $$3, $$2.u() + $$3, $$2.v() + $$3, $$2.w() + $$3);
   }

   @Deprecated
   public static Stream<iz> a(iz $$0) {
      return Stream.of($$0, $$0.f(), $$0.h(), $$0.f().h());
   }

   public static Iterable<iz> a(azg $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 - $$3 + 1;
      int $$10 = $$7 - $$4 + 1;
      return () -> new AbstractIterator<iz>() {
            final iz.a a = new iz.a();
            int b = $$1;

            protected iz a() {
               if (this.b <= 0) {
                  return (iz)this.endOfData();
               } else {
                  iz $$0 = this.a.d($$2 + $$0.a($$8), $$3 + $$0.a($$9), $$4 + $$0.a($$10));
                  this.b--;
                  return $$0;
               }
            }
         };
   }

   public static Iterable<iz> a(iz $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$1 + $$2 + $$3;
      int $$5 = $$0.u();
      int $$6 = $$0.v();
      int $$7 = $$0.w();
      return () -> new AbstractIterator<iz>() {
            private final iz.a h = new iz.a();
            private int i;
            private int j;
            private int k;
            private int l;
            private int m;
            private boolean n;

            protected iz a() {
               if (this.n) {
                  this.n = false;
                  this.h.r($$7 - (this.h.w() - $$7));
                  return this.h;
               } else {
                  iz $$0;
                  for ($$0 = null; $$0 == null; this.m++) {
                     if (this.m > this.k) {
                        this.l++;
                        if (this.l > this.j) {
                           this.i++;
                           if (this.i > $$4) {
                              return (iz)this.endOfData();
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

   public static Optional<iz> a(iz $$0, int $$1, int $$2, Predicate<iz> $$3) {
      for (iz $$4 : a($$0, $$1, $$2, $$1)) {
         if ($$3.test($$4)) {
            return Optional.of($$4);
         }
      }

      return Optional.empty();
   }

   public static Stream<iz> b(iz $$0, int $$1, int $$2, int $$3) {
      return StreamSupport.stream(a($$0, $$1, $$2, $$3).spliterator(), false);
   }

   public static Iterable<iz> c(iz $$0, iz $$1) {
      return b(
         Math.min($$0.u(), $$1.u()),
         Math.min($$0.v(), $$1.v()),
         Math.min($$0.w(), $$1.w()),
         Math.max($$0.u(), $$1.u()),
         Math.max($$0.v(), $$1.v()),
         Math.max($$0.w(), $$1.w())
      );
   }

   public static Stream<iz> d(iz $$0, iz $$1) {
      return StreamSupport.stream(c($$0, $$1).spliterator(), false);
   }

   public static Stream<iz> a(eib $$0) {
      return a(
         Math.min($$0.h(), $$0.k()),
         Math.min($$0.i(), $$0.l()),
         Math.min($$0.j(), $$0.m()),
         Math.max($$0.h(), $$0.k()),
         Math.max($$0.i(), $$0.l()),
         Math.max($$0.j(), $$0.m())
      );
   }

   public static Stream<iz> a(evl $$0) {
      return a(ayy.a($$0.a), ayy.a($$0.b), ayy.a($$0.c), ayy.a($$0.d), ayy.a($$0.e), ayy.a($$0.f));
   }

   public static Stream<iz> a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return StreamSupport.stream(b($$0, $$1, $$2, $$3, $$4, $$5).spliterator(), false);
   }

   public static Iterable<iz> b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$3 - $$0 + 1;
      int $$7 = $$4 - $$1 + 1;
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 * $$7 * $$8;
      return () -> new AbstractIterator<iz>() {
            private final iz.a g = new iz.a();
            private int h;

            protected iz a() {
               if (this.h == $$9) {
                  return (iz)this.endOfData();
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

   public static Iterable<iz.a> a(iz $$0, int $$1, je $$2, je $$3) {
      Validate.validState($$2.o() != $$3.o(), "The two directions cannot be on the same axis", new Object[0]);
      return () -> new AbstractIterator<iz.a>() {
            private final je[] e = new je[]{$$2, $$3, $$2.g(), $$3.g()};
            private final iz.a f = $$0.j().c($$3);
            private final int g = 4 * $$1;
            private int h = -1;
            private int i;
            private int j;
            private int k = this.f.u();
            private int l = this.f.v();
            private int m = this.f.w();

            protected iz.a a() {
               this.f.d(this.k, this.l, this.m).c(this.e[(this.h + 4) % 4]);
               this.k = this.f.u();
               this.l = this.f.v();
               this.m = this.f.w();
               if (this.j >= this.i) {
                  if (this.h >= this.g) {
                     return (iz.a)this.endOfData();
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

   public static int a(iz $$0, int $$1, int $$2, BiConsumer<iz, Consumer<iz>> $$3, Predicate<iz> $$4) {
      Queue<Pair<iz, Integer>> $$5 = new ArrayDeque<>();
      LongSet $$6 = new LongOpenHashSet();
      $$5.add(Pair.of($$0, 0));
      int $$7 = 0;

      while (!$$5.isEmpty()) {
         Pair<iz, Integer> $$8 = $$5.poll();
         iz $$9 = (iz)$$8.getLeft();
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

   public static class a extends iz {
      public a() {
         this(0, 0, 0);
      }

      public a(int $$0, int $$1, int $$2) {
         super($$0, $$1, $$2);
      }

      public a(double $$0, double $$1, double $$2) {
         this(ayy.a($$0), ayy.a($$1), ayy.a($$2));
      }

      @Override
      public iz b(int $$0, int $$1, int $$2) {
         return super.b($$0, $$1, $$2).i();
      }

      @Override
      public iz a(int $$0) {
         return super.a($$0).i();
      }

      @Override
      public iz a(je $$0, int $$1) {
         return super.a($$0, $$1).i();
      }

      @Override
      public iz a(je.a $$0, int $$1) {
         return super.a($$0, $$1).i();
      }

      @Override
      public iz a(dll $$0) {
         return super.a($$0).i();
      }

      public iz.a d(int $$0, int $$1, int $$2) {
         this.p($$0);
         this.q($$1);
         this.r($$2);
         return this;
      }

      public iz.a b(double $$0, double $$1, double $$2) {
         return this.d(ayy.a($$0), ayy.a($$1), ayy.a($$2));
      }

      public iz.a g(kd $$0) {
         return this.d($$0.u(), $$0.v(), $$0.w());
      }

      public iz.a f(long $$0) {
         return this.d(a($$0), b($$0), c($$0));
      }

      public iz.a a(iw $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.a($$1, $$2, $$3, je.a.a), $$0.a($$1, $$2, $$3, je.a.b), $$0.a($$1, $$2, $$3, je.a.c));
      }

      public iz.a a(kd $$0, je $$1) {
         return this.d($$0.u() + $$1.j(), $$0.v() + $$1.k(), $$0.w() + $$1.l());
      }

      public iz.a a(kd $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.u() + $$1, $$0.v() + $$2, $$0.w() + $$3);
      }

      public iz.a a(kd $$0, kd $$1) {
         return this.d($$0.u() + $$1.u(), $$0.v() + $$1.v(), $$0.w() + $$1.w());
      }

      public iz.a c(je $$0) {
         return this.c($$0, 1);
      }

      public iz.a c(je $$0, int $$1) {
         return this.d(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
      }

      public iz.a e(int $$0, int $$1, int $$2) {
         return this.d(this.u() + $$0, this.v() + $$1, this.w() + $$2);
      }

      public iz.a h(kd $$0) {
         return this.d(this.u() + $$0.u(), this.v() + $$0.v(), this.w() + $$0.w());
      }

      public iz.a a(je.a $$0, int $$1, int $$2) {
         switch ($$0) {
            case a:
               return this.d(ayy.a(this.u(), $$1, $$2), this.v(), this.w());
            case b:
               return this.d(this.u(), ayy.a(this.v(), $$1, $$2), this.w());
            case c:
               return this.d(this.u(), this.v(), ayy.a(this.w(), $$1, $$2));
            default:
               throw new IllegalStateException("Unable to clamp axis " + $$0);
         }
      }

      public iz.a p(int $$0) {
         super.u($$0);
         return this;
      }

      public iz.a q(int $$0) {
         super.t($$0);
         return this;
      }

      public iz.a r(int $$0) {
         super.s($$0);
         return this;
      }

      @Override
      public iz i() {
         return new iz(this);
      }
   }
}
