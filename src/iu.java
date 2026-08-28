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
public class iu extends jz {
   public static final Codec<iu> a = Codec.INT_STREAM
      .comapFlatMap($$0 -> af.a($$0, 3).map($$0x -> new iu($$0x[0], $$0x[1], $$0x[2])), $$0 -> IntStream.of($$0.u(), $$0.v(), $$0.w()))
      .stable();
   public static final yw<ByteBuf, iu> b = new yw<ByteBuf, iu>() {
      public iu a(ByteBuf $$0) {
         return vu.b($$0);
      }

      public void a(ByteBuf $$0, iu $$1) {
         vu.a($$0, $$1);
      }
   };
   private static final Logger j = LogUtils.getLogger();
   public static final iu c = new iu(0, 0, 0);
   public static final int d = 1 + azm.f(azm.c(30000000));
   public static final int e = 64 - 2 * d;
   private static final long k = (1L << d) - 1L;
   private static final long l = (1L << e) - 1L;
   private static final long m = (1L << d) - 1L;
   private static final int n = 0;
   private static final int o = e;
   private static final int p = e + d;
   public static final int f = (1 << d) / 2 - 1;

   public iu(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public iu(jz $$0) {
      this($$0.u(), $$0.v(), $$0.w());
   }

   public static long a(long $$0, ja $$1) {
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

   public static iu d(long $$0) {
      return new iu(a($$0), b($$0), c($$0));
   }

   public static iu a(double $$0, double $$1, double $$2) {
      return new iu(azm.a($$0), azm.a($$1), azm.a($$2));
   }

   public static iu a(jo $$0) {
      return a($$0.a(), $$0.b(), $$0.c());
   }

   public static iu a(iu $$0, iu $$1) {
      return new iu(Math.min($$0.u(), $$1.u()), Math.min($$0.v(), $$1.v()), Math.min($$0.w(), $$1.w()));
   }

   public static iu b(iu $$0, iu $$1) {
      return new iu(Math.max($$0.u(), $$1.u()), Math.max($$0.v(), $$1.v()), Math.max($$0.w(), $$1.w()));
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

   public iu b(int $$0, int $$1, int $$2) {
      return $$0 == 0 && $$1 == 0 && $$2 == 0 ? this : new iu(this.u() + $$0, this.v() + $$1, this.w() + $$2);
   }

   public feq b() {
      return feq.b(this);
   }

   public feq c() {
      return feq.c(this);
   }

   public iu a(jz $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   public iu b(jz $$0) {
      return this.b(-$$0.u(), -$$0.v(), -$$0.w());
   }

   public iu a(int $$0) {
      if ($$0 == 1) {
         return this;
      } else {
         return $$0 == 0 ? c : new iu(this.u() * $$0, this.v() * $$0, this.w() * $$0);
      }
   }

   public iu d() {
      return this.a(ja.b);
   }

   public iu b(int $$0) {
      return this.a(ja.b, $$0);
   }

   public iu e() {
      return this.a(ja.a);
   }

   public iu c(int $$0) {
      return this.a(ja.a, $$0);
   }

   public iu f() {
      return this.a(ja.c);
   }

   public iu d(int $$0) {
      return this.a(ja.c, $$0);
   }

   public iu g() {
      return this.a(ja.d);
   }

   public iu e(int $$0) {
      return this.a(ja.d, $$0);
   }

   public iu h() {
      return this.a(ja.e);
   }

   public iu f(int $$0) {
      return this.a(ja.e, $$0);
   }

   public iu i() {
      return this.a(ja.f);
   }

   public iu g(int $$0) {
      return this.a(ja.f, $$0);
   }

   public iu a(ja $$0) {
      return new iu(this.u() + $$0.j(), this.v() + $$0.k(), this.w() + $$0.l());
   }

   public iu a(ja $$0, int $$1) {
      return $$1 == 0 ? this : new iu(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
   }

   public iu a(ja.a $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         int $$2 = $$0 == ja.a.a ? $$1 : 0;
         int $$3 = $$0 == ja.a.b ? $$1 : 0;
         int $$4 = $$0 == ja.a.c ? $$1 : 0;
         return new iu(this.u() + $$2, this.v() + $$3, this.w() + $$4);
      }
   }

   public iu a(dsz $$0) {
      switch ($$0) {
         case a:
         default:
            return this;
         case b:
            return new iu(-this.w(), this.v(), this.u());
         case c:
            return new iu(-this.u(), this.v(), -this.w());
         case d:
            return new iu(this.w(), this.v(), -this.u());
      }
   }

   public iu c(jz $$0) {
      return new iu(this.v() * $$0.w() - this.w() * $$0.v(), this.w() * $$0.u() - this.u() * $$0.w(), this.u() * $$0.v() - this.v() * $$0.u());
   }

   public iu h(int $$0) {
      return new iu(this.u(), $$0, this.w());
   }

   public iu j() {
      return this;
   }

   public iu.a k() {
      return new iu.a(this.u(), this.v(), this.w());
   }

   public feq a(feq $$0) {
      return new feq(
         azm.a($$0.d, (double)((float)this.u() + 1.0E-5F), (double)this.u() + 1.0 - 1.0E-5F),
         azm.a($$0.e, (double)((float)this.v() + 1.0E-5F), (double)this.v() + 1.0 - 1.0E-5F),
         azm.a($$0.f, (double)((float)this.w() + 1.0E-5F), (double)this.w() + 1.0 - 1.0E-5F)
      );
   }

   public static Iterable<iu> a(azv $$0, int $$1, iu $$2, int $$3) {
      return a($$0, $$1, $$2.u() - $$3, $$2.v() - $$3, $$2.w() - $$3, $$2.u() + $$3, $$2.v() + $$3, $$2.w() + $$3);
   }

   @Deprecated
   public static Stream<iu> a(iu $$0) {
      return Stream.of($$0, $$0.g(), $$0.i(), $$0.g().i());
   }

   public static Iterable<iu> a(azv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 - $$3 + 1;
      int $$10 = $$7 - $$4 + 1;
      return () -> new AbstractIterator<iu>() {
            final iu.a a = new iu.a();
            int b = $$1;

            protected iu a() {
               if (this.b <= 0) {
                  return (iu)this.endOfData();
               } else {
                  iu $$0 = this.a.d($$2 + $$0.a($$8), $$3 + $$0.a($$9), $$4 + $$0.a($$10));
                  this.b--;
                  return $$0;
               }
            }
         };
   }

   public static Iterable<iu> a(iu $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$1 + $$2 + $$3;
      int $$5 = $$0.u();
      int $$6 = $$0.v();
      int $$7 = $$0.w();
      return () -> new AbstractIterator<iu>() {
            private final iu.a h = new iu.a();
            private int i;
            private int j;
            private int k;
            private int l;
            private int m;
            private boolean n;

            protected iu a() {
               if (this.n) {
                  this.n = false;
                  this.h.r($$7 - (this.h.w() - $$7));
                  return this.h;
               } else {
                  iu $$0;
                  for ($$0 = null; $$0 == null; this.m++) {
                     if (this.m > this.k) {
                        this.l++;
                        if (this.l > this.j) {
                           this.i++;
                           if (this.i > $$4) {
                              return (iu)this.endOfData();
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

   public static Optional<iu> a(iu $$0, int $$1, int $$2, Predicate<iu> $$3) {
      for (iu $$4 : a($$0, $$1, $$2, $$1)) {
         if ($$3.test($$4)) {
            return Optional.of($$4);
         }
      }

      return Optional.empty();
   }

   public static Stream<iu> b(iu $$0, int $$1, int $$2, int $$3) {
      return StreamSupport.stream(a($$0, $$1, $$2, $$3).spliterator(), false);
   }

   public static Iterable<iu> a(fel $$0) {
      iu $$1 = a($$0.a, $$0.b, $$0.c);
      iu $$2 = a($$0.d, $$0.e, $$0.f);
      return c($$1, $$2);
   }

   public static Iterable<iu> c(iu $$0, iu $$1) {
      return b(
         Math.min($$0.u(), $$1.u()),
         Math.min($$0.v(), $$1.v()),
         Math.min($$0.w(), $$1.w()),
         Math.max($$0.u(), $$1.u()),
         Math.max($$0.v(), $$1.v()),
         Math.max($$0.w(), $$1.w())
      );
   }

   public static Stream<iu> d(iu $$0, iu $$1) {
      return StreamSupport.stream(c($$0, $$1).spliterator(), false);
   }

   public static Stream<iu> a(eqt $$0) {
      return a(
         Math.min($$0.h(), $$0.k()),
         Math.min($$0.i(), $$0.l()),
         Math.min($$0.j(), $$0.m()),
         Math.max($$0.h(), $$0.k()),
         Math.max($$0.i(), $$0.l()),
         Math.max($$0.j(), $$0.m())
      );
   }

   public static Stream<iu> b(fel $$0) {
      return a(azm.a($$0.a), azm.a($$0.b), azm.a($$0.c), azm.a($$0.d), azm.a($$0.e), azm.a($$0.f));
   }

   public static Stream<iu> a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return StreamSupport.stream(b($$0, $$1, $$2, $$3, $$4, $$5).spliterator(), false);
   }

   public static Iterable<iu> b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$3 - $$0 + 1;
      int $$7 = $$4 - $$1 + 1;
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 * $$7 * $$8;
      return () -> new AbstractIterator<iu>() {
            private final iu.a g = new iu.a();
            private int h;

            protected iu a() {
               if (this.h == $$9) {
                  return (iu)this.endOfData();
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

   public static Iterable<iu.a> a(iu $$0, int $$1, ja $$2, ja $$3) {
      Validate.validState($$2.o() != $$3.o(), "The two directions cannot be on the same axis", new Object[0]);
      return () -> new AbstractIterator<iu.a>() {
            private final ja[] e = new ja[]{$$2, $$3, $$2.g(), $$3.g()};
            private final iu.a f = $$0.k().c($$3);
            private final int g = 4 * $$1;
            private int h = -1;
            private int i;
            private int j;
            private int k = this.f.u();
            private int l = this.f.v();
            private int m = this.f.w();

            protected iu.a a() {
               this.f.d(this.k, this.l, this.m).c(this.e[(this.h + 4) % 4]);
               this.k = this.f.u();
               this.l = this.f.v();
               this.m = this.f.w();
               if (this.j >= this.i) {
                  if (this.h >= this.g) {
                     return (iu.a)this.endOfData();
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

   public static int a(iu $$0, int $$1, int $$2, BiConsumer<iu, Consumer<iu>> $$3, Function<iu, iu.b> $$4) {
      Queue<Pair<iu, Integer>> $$5 = new ArrayDeque<>();
      LongSet $$6 = new LongOpenHashSet();
      $$5.add(Pair.of($$0, 0));
      int $$7 = 0;

      while (!$$5.isEmpty()) {
         Pair<iu, Integer> $$8 = $$5.poll();
         iu $$9 = (iu)$$8.getLeft();
         int $$10 = (Integer)$$8.getRight();
         long $$11 = $$9.a();
         if ($$6.add($$11)) {
            iu.b $$12 = $$4.apply($$9);
            if ($$12 != iu.b.b) {
               if ($$12 == iu.b.c) {
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

   public static class a extends iu {
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
      public iu b(int $$0, int $$1, int $$2) {
         return super.b($$0, $$1, $$2).j();
      }

      @Override
      public iu a(int $$0) {
         return super.a($$0).j();
      }

      @Override
      public iu a(ja $$0, int $$1) {
         return super.a($$0, $$1).j();
      }

      @Override
      public iu a(ja.a $$0, int $$1) {
         return super.a($$0, $$1).j();
      }

      @Override
      public iu a(dsz $$0) {
         return super.a($$0).j();
      }

      public iu.a d(int $$0, int $$1, int $$2) {
         this.p($$0);
         this.q($$1);
         this.r($$2);
         return this;
      }

      public iu.a b(double $$0, double $$1, double $$2) {
         return this.d(azm.a($$0), azm.a($$1), azm.a($$2));
      }

      public iu.a g(jz $$0) {
         return this.d($$0.u(), $$0.v(), $$0.w());
      }

      public iu.a f(long $$0) {
         return this.d(a($$0), b($$0), c($$0));
      }

      public iu.a a(ir $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.a($$1, $$2, $$3, ja.a.a), $$0.a($$1, $$2, $$3, ja.a.b), $$0.a($$1, $$2, $$3, ja.a.c));
      }

      public iu.a a(jz $$0, ja $$1) {
         return this.d($$0.u() + $$1.j(), $$0.v() + $$1.k(), $$0.w() + $$1.l());
      }

      public iu.a a(jz $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.u() + $$1, $$0.v() + $$2, $$0.w() + $$3);
      }

      public iu.a a(jz $$0, jz $$1) {
         return this.d($$0.u() + $$1.u(), $$0.v() + $$1.v(), $$0.w() + $$1.w());
      }

      public iu.a c(ja $$0) {
         return this.c($$0, 1);
      }

      public iu.a c(ja $$0, int $$1) {
         return this.d(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
      }

      public iu.a e(int $$0, int $$1, int $$2) {
         return this.d(this.u() + $$0, this.v() + $$1, this.w() + $$2);
      }

      public iu.a h(jz $$0) {
         return this.d(this.u() + $$0.u(), this.v() + $$0.v(), this.w() + $$0.w());
      }

      public iu.a a(ja.a $$0, int $$1, int $$2) {
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

      public iu.a p(int $$0) {
         super.u($$0);
         return this;
      }

      public iu.a q(int $$0) {
         super.t($$0);
         return this;
      }

      public iu.a r(int $$0) {
         super.s($$0);
         return this;
      }

      @Override
      public iu j() {
         return new iu(this);
      }
   }

   public static enum b {
      a,
      b,
      c;
   }
}
