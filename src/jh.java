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
public class jh extends kl {
   public static final Codec<jh> a = Codec.INT_STREAM
      .comapFlatMap($$0 -> ae.a($$0, 3).map($$0x -> new jh($$0x[0], $$0x[1], $$0x[2])), $$0 -> IntStream.of($$0.u(), $$0.v(), $$0.w()))
      .stable();
   public static final zt<ByteBuf, jh> b = new zt<ByteBuf, jh>() {
      public jh a(ByteBuf $$0) {
         return ws.b($$0);
      }

      public void a(ByteBuf $$0, jh $$1) {
         ws.a($$0, $$1);
      }
   };
   private static final Logger e = LogUtils.getLogger();
   public static final jh c = new jh(0, 0, 0);
   private static final int h = 1 + bae.f(bae.c(30000000));
   private static final int i = h;
   public static final int d = 64 - h - i;
   private static final long j = (1L << h) - 1L;
   private static final long k = (1L << d) - 1L;
   private static final long l = (1L << i) - 1L;
   private static final int m = 0;
   private static final int n = d;
   private static final int o = d + i;

   public jh(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public jh(kl $$0) {
      this($$0.u(), $$0.v(), $$0.w());
   }

   public static long a(long $$0, jm $$1) {
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

   public static jh d(long $$0) {
      return new jh(a($$0), b($$0), c($$0));
   }

   public static jh a(double $$0, double $$1, double $$2) {
      return new jh(bae.a($$0), bae.a($$1), bae.a($$2));
   }

   public static jh a(ka $$0) {
      return a($$0.a(), $$0.b(), $$0.c());
   }

   public static jh a(jh $$0, jh $$1) {
      return new jh(Math.min($$0.u(), $$1.u()), Math.min($$0.v(), $$1.v()), Math.min($$0.w(), $$1.w()));
   }

   public static jh b(jh $$0, jh $$1) {
      return new jh(Math.max($$0.u(), $$1.u()), Math.max($$0.v(), $$1.v()), Math.max($$0.w(), $$1.w()));
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

   public jh b(int $$0, int $$1, int $$2) {
      return $$0 == 0 && $$1 == 0 && $$2 == 0 ? this : new jh(this.u() + $$0, this.v() + $$1, this.w() + $$2);
   }

   public fbs b() {
      return fbs.b(this);
   }

   public fbs c() {
      return fbs.c(this);
   }

   public jh a(kl $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   public jh b(kl $$0) {
      return this.b(-$$0.u(), -$$0.v(), -$$0.w());
   }

   public jh a(int $$0) {
      if ($$0 == 1) {
         return this;
      } else {
         return $$0 == 0 ? c : new jh(this.u() * $$0, this.v() * $$0, this.w() * $$0);
      }
   }

   public jh d() {
      return this.a(jm.b);
   }

   public jh b(int $$0) {
      return this.a(jm.b, $$0);
   }

   public jh e() {
      return this.a(jm.a);
   }

   public jh c(int $$0) {
      return this.a(jm.a, $$0);
   }

   public jh f() {
      return this.a(jm.c);
   }

   public jh d(int $$0) {
      return this.a(jm.c, $$0);
   }

   public jh g() {
      return this.a(jm.d);
   }

   public jh e(int $$0) {
      return this.a(jm.d, $$0);
   }

   public jh h() {
      return this.a(jm.e);
   }

   public jh f(int $$0) {
      return this.a(jm.e, $$0);
   }

   public jh i() {
      return this.a(jm.f);
   }

   public jh g(int $$0) {
      return this.a(jm.f, $$0);
   }

   public jh a(jm $$0) {
      return new jh(this.u() + $$0.j(), this.v() + $$0.k(), this.w() + $$0.l());
   }

   public jh a(jm $$0, int $$1) {
      return $$1 == 0 ? this : new jh(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
   }

   public jh a(jm.a $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         int $$2 = $$0 == jm.a.a ? $$1 : 0;
         int $$3 = $$0 == jm.a.b ? $$1 : 0;
         int $$4 = $$0 == jm.a.c ? $$1 : 0;
         return new jh(this.u() + $$2, this.v() + $$3, this.w() + $$4);
      }
   }

   public jh a(dqu $$0) {
      switch ($$0) {
         case a:
         default:
            return this;
         case b:
            return new jh(-this.w(), this.v(), this.u());
         case c:
            return new jh(-this.u(), this.v(), -this.w());
         case d:
            return new jh(this.w(), this.v(), -this.u());
      }
   }

   public jh c(kl $$0) {
      return new jh(this.v() * $$0.w() - this.w() * $$0.v(), this.w() * $$0.u() - this.u() * $$0.w(), this.u() * $$0.v() - this.v() * $$0.u());
   }

   public jh h(int $$0) {
      return new jh(this.u(), $$0, this.w());
   }

   public jh j() {
      return this;
   }

   public jh.a k() {
      return new jh.a(this.u(), this.v(), this.w());
   }

   public fbs a(fbs $$0) {
      return new fbs(
         bae.a($$0.d, (double)((float)this.u() + 1.0E-5F), (double)this.u() + 1.0 - 1.0E-5F),
         bae.a($$0.e, (double)((float)this.v() + 1.0E-5F), (double)this.v() + 1.0 - 1.0E-5F),
         bae.a($$0.f, (double)((float)this.w() + 1.0E-5F), (double)this.w() + 1.0 - 1.0E-5F)
      );
   }

   public static Iterable<jh> a(bam $$0, int $$1, jh $$2, int $$3) {
      return a($$0, $$1, $$2.u() - $$3, $$2.v() - $$3, $$2.w() - $$3, $$2.u() + $$3, $$2.v() + $$3, $$2.w() + $$3);
   }

   @Deprecated
   public static Stream<jh> a(jh $$0) {
      return Stream.of($$0, $$0.g(), $$0.i(), $$0.g().i());
   }

   public static Iterable<jh> a(bam $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 - $$3 + 1;
      int $$10 = $$7 - $$4 + 1;
      return () -> new AbstractIterator<jh>() {
            final jh.a a = new jh.a();
            int b = $$1;

            protected jh a() {
               if (this.b <= 0) {
                  return (jh)this.endOfData();
               } else {
                  jh $$0 = this.a.d($$2 + $$0.a($$8), $$3 + $$0.a($$9), $$4 + $$0.a($$10));
                  this.b--;
                  return $$0;
               }
            }
         };
   }

   public static Iterable<jh> a(jh $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$1 + $$2 + $$3;
      int $$5 = $$0.u();
      int $$6 = $$0.v();
      int $$7 = $$0.w();
      return () -> new AbstractIterator<jh>() {
            private final jh.a h = new jh.a();
            private int i;
            private int j;
            private int k;
            private int l;
            private int m;
            private boolean n;

            protected jh a() {
               if (this.n) {
                  this.n = false;
                  this.h.r($$7 - (this.h.w() - $$7));
                  return this.h;
               } else {
                  jh $$0;
                  for ($$0 = null; $$0 == null; this.m++) {
                     if (this.m > this.k) {
                        this.l++;
                        if (this.l > this.j) {
                           this.i++;
                           if (this.i > $$4) {
                              return (jh)this.endOfData();
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

   public static Optional<jh> a(jh $$0, int $$1, int $$2, Predicate<jh> $$3) {
      for (jh $$4 : a($$0, $$1, $$2, $$1)) {
         if ($$3.test($$4)) {
            return Optional.of($$4);
         }
      }

      return Optional.empty();
   }

   public static Stream<jh> b(jh $$0, int $$1, int $$2, int $$3) {
      return StreamSupport.stream(a($$0, $$1, $$2, $$3).spliterator(), false);
   }

   public static Iterable<jh> a(fbn $$0) {
      jh $$1 = a($$0.a, $$0.b, $$0.c);
      jh $$2 = a($$0.d, $$0.e, $$0.f);
      return c($$1, $$2);
   }

   public static Iterable<jh> c(jh $$0, jh $$1) {
      return b(
         Math.min($$0.u(), $$1.u()),
         Math.min($$0.v(), $$1.v()),
         Math.min($$0.w(), $$1.w()),
         Math.max($$0.u(), $$1.u()),
         Math.max($$0.v(), $$1.v()),
         Math.max($$0.w(), $$1.w())
      );
   }

   public static Stream<jh> d(jh $$0, jh $$1) {
      return StreamSupport.stream(c($$0, $$1).spliterator(), false);
   }

   public static Stream<jh> a(enu $$0) {
      return a(
         Math.min($$0.h(), $$0.k()),
         Math.min($$0.i(), $$0.l()),
         Math.min($$0.j(), $$0.m()),
         Math.max($$0.h(), $$0.k()),
         Math.max($$0.i(), $$0.l()),
         Math.max($$0.j(), $$0.m())
      );
   }

   public static Stream<jh> b(fbn $$0) {
      return a(bae.a($$0.a), bae.a($$0.b), bae.a($$0.c), bae.a($$0.d), bae.a($$0.e), bae.a($$0.f));
   }

   public static Stream<jh> a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return StreamSupport.stream(b($$0, $$1, $$2, $$3, $$4, $$5).spliterator(), false);
   }

   public static Iterable<jh> b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$3 - $$0 + 1;
      int $$7 = $$4 - $$1 + 1;
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 * $$7 * $$8;
      return () -> new AbstractIterator<jh>() {
            private final jh.a g = new jh.a();
            private int h;

            protected jh a() {
               if (this.h == $$9) {
                  return (jh)this.endOfData();
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

   public static Iterable<jh.a> a(jh $$0, int $$1, jm $$2, jm $$3) {
      Validate.validState($$2.o() != $$3.o(), "The two directions cannot be on the same axis", new Object[0]);
      return () -> new AbstractIterator<jh.a>() {
            private final jm[] e = new jm[]{$$2, $$3, $$2.g(), $$3.g()};
            private final jh.a f = $$0.k().c($$3);
            private final int g = 4 * $$1;
            private int h = -1;
            private int i;
            private int j;
            private int k = this.f.u();
            private int l = this.f.v();
            private int m = this.f.w();

            protected jh.a a() {
               this.f.d(this.k, this.l, this.m).c(this.e[(this.h + 4) % 4]);
               this.k = this.f.u();
               this.l = this.f.v();
               this.m = this.f.w();
               if (this.j >= this.i) {
                  if (this.h >= this.g) {
                     return (jh.a)this.endOfData();
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

   public static int a(jh $$0, int $$1, int $$2, BiConsumer<jh, Consumer<jh>> $$3, Predicate<jh> $$4) {
      Queue<Pair<jh, Integer>> $$5 = new ArrayDeque<>();
      LongSet $$6 = new LongOpenHashSet();
      $$5.add(Pair.of($$0, 0));
      int $$7 = 0;

      while (!$$5.isEmpty()) {
         Pair<jh, Integer> $$8 = $$5.poll();
         jh $$9 = (jh)$$8.getLeft();
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

   public static class a extends jh {
      public a() {
         this(0, 0, 0);
      }

      public a(int $$0, int $$1, int $$2) {
         super($$0, $$1, $$2);
      }

      public a(double $$0, double $$1, double $$2) {
         this(bae.a($$0), bae.a($$1), bae.a($$2));
      }

      @Override
      public jh b(int $$0, int $$1, int $$2) {
         return super.b($$0, $$1, $$2).j();
      }

      @Override
      public jh a(int $$0) {
         return super.a($$0).j();
      }

      @Override
      public jh a(jm $$0, int $$1) {
         return super.a($$0, $$1).j();
      }

      @Override
      public jh a(jm.a $$0, int $$1) {
         return super.a($$0, $$1).j();
      }

      @Override
      public jh a(dqu $$0) {
         return super.a($$0).j();
      }

      public jh.a d(int $$0, int $$1, int $$2) {
         this.p($$0);
         this.q($$1);
         this.r($$2);
         return this;
      }

      public jh.a b(double $$0, double $$1, double $$2) {
         return this.d(bae.a($$0), bae.a($$1), bae.a($$2));
      }

      public jh.a g(kl $$0) {
         return this.d($$0.u(), $$0.v(), $$0.w());
      }

      public jh.a f(long $$0) {
         return this.d(a($$0), b($$0), c($$0));
      }

      public jh.a a(je $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.a($$1, $$2, $$3, jm.a.a), $$0.a($$1, $$2, $$3, jm.a.b), $$0.a($$1, $$2, $$3, jm.a.c));
      }

      public jh.a a(kl $$0, jm $$1) {
         return this.d($$0.u() + $$1.j(), $$0.v() + $$1.k(), $$0.w() + $$1.l());
      }

      public jh.a a(kl $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.u() + $$1, $$0.v() + $$2, $$0.w() + $$3);
      }

      public jh.a a(kl $$0, kl $$1) {
         return this.d($$0.u() + $$1.u(), $$0.v() + $$1.v(), $$0.w() + $$1.w());
      }

      public jh.a c(jm $$0) {
         return this.c($$0, 1);
      }

      public jh.a c(jm $$0, int $$1) {
         return this.d(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
      }

      public jh.a e(int $$0, int $$1, int $$2) {
         return this.d(this.u() + $$0, this.v() + $$1, this.w() + $$2);
      }

      public jh.a h(kl $$0) {
         return this.d(this.u() + $$0.u(), this.v() + $$0.v(), this.w() + $$0.w());
      }

      public jh.a a(jm.a $$0, int $$1, int $$2) {
         switch ($$0) {
            case a:
               return this.d(bae.a(this.u(), $$1, $$2), this.v(), this.w());
            case b:
               return this.d(this.u(), bae.a(this.v(), $$1, $$2), this.w());
            case c:
               return this.d(this.u(), this.v(), bae.a(this.w(), $$1, $$2));
            default:
               throw new IllegalStateException("Unable to clamp axis " + $$0);
         }
      }

      public jh.a p(int $$0) {
         super.u($$0);
         return this;
      }

      public jh.a q(int $$0) {
         super.t($$0);
         return this;
      }

      public jh.a r(int $$0) {
         super.s($$0);
         return this;
      }

      @Override
      public jh j() {
         return new jh(this);
      }
   }
}
