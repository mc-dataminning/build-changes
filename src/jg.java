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
public class jg extends kk {
   public static final Codec<jg> a = Codec.INT_STREAM
      .comapFlatMap($$0 -> ad.a($$0, 3).map($$0x -> new jg($$0x[0], $$0x[1], $$0x[2])), $$0 -> IntStream.of($$0.u(), $$0.v(), $$0.w()))
      .stable();
   public static final zf<ByteBuf, jg> b = new zf<ByteBuf, jg>() {
      public jg a(ByteBuf $$0) {
         return we.b($$0);
      }

      public void a(ByteBuf $$0, jg $$1) {
         we.a($$0, $$1);
      }
   };
   private static final Logger e = LogUtils.getLogger();
   public static final jg c = new jg(0, 0, 0);
   private static final int h = 1 + azj.f(azj.c(30000000));
   private static final int i = h;
   public static final int d = 64 - h - i;
   private static final long j = (1L << h) - 1L;
   private static final long k = (1L << d) - 1L;
   private static final long l = (1L << i) - 1L;
   private static final int m = 0;
   private static final int n = d;
   private static final int o = d + i;

   public jg(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public jg(kk $$0) {
      this($$0.u(), $$0.v(), $$0.w());
   }

   public static long a(long $$0, jl $$1) {
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

   public static jg d(long $$0) {
      return new jg(a($$0), b($$0), c($$0));
   }

   public static jg a(double $$0, double $$1, double $$2) {
      return new jg(azj.a($$0), azj.a($$1), azj.a($$2));
   }

   public static jg a(jz $$0) {
      return a($$0.a(), $$0.b(), $$0.c());
   }

   public static jg a(jg $$0, jg $$1) {
      return new jg(Math.min($$0.u(), $$1.u()), Math.min($$0.v(), $$1.v()), Math.min($$0.w(), $$1.w()));
   }

   public static jg b(jg $$0, jg $$1) {
      return new jg(Math.max($$0.u(), $$1.u()), Math.max($$0.v(), $$1.v()), Math.max($$0.w(), $$1.w()));
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

   public jg b(int $$0, int $$1, int $$2) {
      return $$0 == 0 && $$1 == 0 && $$2 == 0 ? this : new jg(this.u() + $$0, this.v() + $$1, this.w() + $$2);
   }

   public ezh b() {
      return ezh.b(this);
   }

   public ezh c() {
      return ezh.c(this);
   }

   public jg a(kk $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   public jg b(kk $$0) {
      return this.b(-$$0.u(), -$$0.v(), -$$0.w());
   }

   public jg a(int $$0) {
      if ($$0 == 1) {
         return this;
      } else {
         return $$0 == 0 ? c : new jg(this.u() * $$0, this.v() * $$0, this.w() * $$0);
      }
   }

   public jg d() {
      return this.a(jl.b);
   }

   public jg b(int $$0) {
      return this.a(jl.b, $$0);
   }

   public jg e() {
      return this.a(jl.a);
   }

   public jg c(int $$0) {
      return this.a(jl.a, $$0);
   }

   public jg f() {
      return this.a(jl.c);
   }

   public jg d(int $$0) {
      return this.a(jl.c, $$0);
   }

   public jg g() {
      return this.a(jl.d);
   }

   public jg e(int $$0) {
      return this.a(jl.d, $$0);
   }

   public jg h() {
      return this.a(jl.e);
   }

   public jg f(int $$0) {
      return this.a(jl.e, $$0);
   }

   public jg i() {
      return this.a(jl.f);
   }

   public jg g(int $$0) {
      return this.a(jl.f, $$0);
   }

   public jg a(jl $$0) {
      return new jg(this.u() + $$0.j(), this.v() + $$0.k(), this.w() + $$0.l());
   }

   public jg a(jl $$0, int $$1) {
      return $$1 == 0 ? this : new jg(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
   }

   public jg a(jl.a $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         int $$2 = $$0 == jl.a.a ? $$1 : 0;
         int $$3 = $$0 == jl.a.b ? $$1 : 0;
         int $$4 = $$0 == jl.a.c ? $$1 : 0;
         return new jg(this.u() + $$2, this.v() + $$3, this.w() + $$4);
      }
   }

   public jg a(dol $$0) {
      switch ($$0) {
         case a:
         default:
            return this;
         case b:
            return new jg(-this.w(), this.v(), this.u());
         case c:
            return new jg(-this.u(), this.v(), -this.w());
         case d:
            return new jg(this.w(), this.v(), -this.u());
      }
   }

   public jg c(kk $$0) {
      return new jg(this.v() * $$0.w() - this.w() * $$0.v(), this.w() * $$0.u() - this.u() * $$0.w(), this.u() * $$0.v() - this.v() * $$0.u());
   }

   public jg h(int $$0) {
      return new jg(this.u(), $$0, this.w());
   }

   public jg j() {
      return this;
   }

   public jg.a k() {
      return new jg.a(this.u(), this.v(), this.w());
   }

   public ezh a(ezh $$0) {
      return new ezh(
         azj.a($$0.d, (double)((float)this.u() + 1.0E-5F), (double)this.u() + 1.0 - 1.0E-5F),
         azj.a($$0.e, (double)((float)this.v() + 1.0E-5F), (double)this.v() + 1.0 - 1.0E-5F),
         azj.a($$0.f, (double)((float)this.w() + 1.0E-5F), (double)this.w() + 1.0 - 1.0E-5F)
      );
   }

   public static Iterable<jg> a(azr $$0, int $$1, jg $$2, int $$3) {
      return a($$0, $$1, $$2.u() - $$3, $$2.v() - $$3, $$2.w() - $$3, $$2.u() + $$3, $$2.v() + $$3, $$2.w() + $$3);
   }

   @Deprecated
   public static Stream<jg> a(jg $$0) {
      return Stream.of($$0, $$0.g(), $$0.i(), $$0.g().i());
   }

   public static Iterable<jg> a(azr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 - $$3 + 1;
      int $$10 = $$7 - $$4 + 1;
      return () -> new AbstractIterator<jg>() {
            final jg.a a = new jg.a();
            int b = $$1;

            protected jg a() {
               if (this.b <= 0) {
                  return (jg)this.endOfData();
               } else {
                  jg $$0 = this.a.d($$2 + $$0.a($$8), $$3 + $$0.a($$9), $$4 + $$0.a($$10));
                  this.b--;
                  return $$0;
               }
            }
         };
   }

   public static Iterable<jg> a(jg $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$1 + $$2 + $$3;
      int $$5 = $$0.u();
      int $$6 = $$0.v();
      int $$7 = $$0.w();
      return () -> new AbstractIterator<jg>() {
            private final jg.a h = new jg.a();
            private int i;
            private int j;
            private int k;
            private int l;
            private int m;
            private boolean n;

            protected jg a() {
               if (this.n) {
                  this.n = false;
                  this.h.r($$7 - (this.h.w() - $$7));
                  return this.h;
               } else {
                  jg $$0;
                  for ($$0 = null; $$0 == null; this.m++) {
                     if (this.m > this.k) {
                        this.l++;
                        if (this.l > this.j) {
                           this.i++;
                           if (this.i > $$4) {
                              return (jg)this.endOfData();
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

   public static Optional<jg> a(jg $$0, int $$1, int $$2, Predicate<jg> $$3) {
      for (jg $$4 : a($$0, $$1, $$2, $$1)) {
         if ($$3.test($$4)) {
            return Optional.of($$4);
         }
      }

      return Optional.empty();
   }

   public static Stream<jg> b(jg $$0, int $$1, int $$2, int $$3) {
      return StreamSupport.stream(a($$0, $$1, $$2, $$3).spliterator(), false);
   }

   public static Iterable<jg> a(ezc $$0) {
      jg $$1 = a($$0.a, $$0.b, $$0.c);
      jg $$2 = a($$0.d, $$0.e, $$0.f);
      return c($$1, $$2);
   }

   public static Iterable<jg> c(jg $$0, jg $$1) {
      return b(
         Math.min($$0.u(), $$1.u()),
         Math.min($$0.v(), $$1.v()),
         Math.min($$0.w(), $$1.w()),
         Math.max($$0.u(), $$1.u()),
         Math.max($$0.v(), $$1.v()),
         Math.max($$0.w(), $$1.w())
      );
   }

   public static Stream<jg> d(jg $$0, jg $$1) {
      return StreamSupport.stream(c($$0, $$1).spliterator(), false);
   }

   public static Stream<jg> a(elj $$0) {
      return a(
         Math.min($$0.h(), $$0.k()),
         Math.min($$0.i(), $$0.l()),
         Math.min($$0.j(), $$0.m()),
         Math.max($$0.h(), $$0.k()),
         Math.max($$0.i(), $$0.l()),
         Math.max($$0.j(), $$0.m())
      );
   }

   public static Stream<jg> b(ezc $$0) {
      return a(azj.a($$0.a), azj.a($$0.b), azj.a($$0.c), azj.a($$0.d), azj.a($$0.e), azj.a($$0.f));
   }

   public static Stream<jg> a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return StreamSupport.stream(b($$0, $$1, $$2, $$3, $$4, $$5).spliterator(), false);
   }

   public static Iterable<jg> b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$3 - $$0 + 1;
      int $$7 = $$4 - $$1 + 1;
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 * $$7 * $$8;
      return () -> new AbstractIterator<jg>() {
            private final jg.a g = new jg.a();
            private int h;

            protected jg a() {
               if (this.h == $$9) {
                  return (jg)this.endOfData();
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

   public static Iterable<jg.a> a(jg $$0, int $$1, jl $$2, jl $$3) {
      Validate.validState($$2.o() != $$3.o(), "The two directions cannot be on the same axis", new Object[0]);
      return () -> new AbstractIterator<jg.a>() {
            private final jl[] e = new jl[]{$$2, $$3, $$2.g(), $$3.g()};
            private final jg.a f = $$0.k().c($$3);
            private final int g = 4 * $$1;
            private int h = -1;
            private int i;
            private int j;
            private int k = this.f.u();
            private int l = this.f.v();
            private int m = this.f.w();

            protected jg.a a() {
               this.f.d(this.k, this.l, this.m).c(this.e[(this.h + 4) % 4]);
               this.k = this.f.u();
               this.l = this.f.v();
               this.m = this.f.w();
               if (this.j >= this.i) {
                  if (this.h >= this.g) {
                     return (jg.a)this.endOfData();
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

   public static int a(jg $$0, int $$1, int $$2, BiConsumer<jg, Consumer<jg>> $$3, Predicate<jg> $$4) {
      Queue<Pair<jg, Integer>> $$5 = new ArrayDeque<>();
      LongSet $$6 = new LongOpenHashSet();
      $$5.add(Pair.of($$0, 0));
      int $$7 = 0;

      while (!$$5.isEmpty()) {
         Pair<jg, Integer> $$8 = $$5.poll();
         jg $$9 = (jg)$$8.getLeft();
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

   public static class a extends jg {
      public a() {
         this(0, 0, 0);
      }

      public a(int $$0, int $$1, int $$2) {
         super($$0, $$1, $$2);
      }

      public a(double $$0, double $$1, double $$2) {
         this(azj.a($$0), azj.a($$1), azj.a($$2));
      }

      @Override
      public jg b(int $$0, int $$1, int $$2) {
         return super.b($$0, $$1, $$2).j();
      }

      @Override
      public jg a(int $$0) {
         return super.a($$0).j();
      }

      @Override
      public jg a(jl $$0, int $$1) {
         return super.a($$0, $$1).j();
      }

      @Override
      public jg a(jl.a $$0, int $$1) {
         return super.a($$0, $$1).j();
      }

      @Override
      public jg a(dol $$0) {
         return super.a($$0).j();
      }

      public jg.a d(int $$0, int $$1, int $$2) {
         this.p($$0);
         this.q($$1);
         this.r($$2);
         return this;
      }

      public jg.a b(double $$0, double $$1, double $$2) {
         return this.d(azj.a($$0), azj.a($$1), azj.a($$2));
      }

      public jg.a g(kk $$0) {
         return this.d($$0.u(), $$0.v(), $$0.w());
      }

      public jg.a f(long $$0) {
         return this.d(a($$0), b($$0), c($$0));
      }

      public jg.a a(jd $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.a($$1, $$2, $$3, jl.a.a), $$0.a($$1, $$2, $$3, jl.a.b), $$0.a($$1, $$2, $$3, jl.a.c));
      }

      public jg.a a(kk $$0, jl $$1) {
         return this.d($$0.u() + $$1.j(), $$0.v() + $$1.k(), $$0.w() + $$1.l());
      }

      public jg.a a(kk $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.u() + $$1, $$0.v() + $$2, $$0.w() + $$3);
      }

      public jg.a a(kk $$0, kk $$1) {
         return this.d($$0.u() + $$1.u(), $$0.v() + $$1.v(), $$0.w() + $$1.w());
      }

      public jg.a c(jl $$0) {
         return this.c($$0, 1);
      }

      public jg.a c(jl $$0, int $$1) {
         return this.d(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
      }

      public jg.a e(int $$0, int $$1, int $$2) {
         return this.d(this.u() + $$0, this.v() + $$1, this.w() + $$2);
      }

      public jg.a h(kk $$0) {
         return this.d(this.u() + $$0.u(), this.v() + $$0.v(), this.w() + $$0.w());
      }

      public jg.a a(jl.a $$0, int $$1, int $$2) {
         switch ($$0) {
            case a:
               return this.d(azj.a(this.u(), $$1, $$2), this.v(), this.w());
            case b:
               return this.d(this.u(), azj.a(this.v(), $$1, $$2), this.w());
            case c:
               return this.d(this.u(), this.v(), azj.a(this.w(), $$1, $$2));
            default:
               throw new IllegalStateException("Unable to clamp axis " + $$0);
         }
      }

      public jg.a p(int $$0) {
         super.u($$0);
         return this;
      }

      public jg.a q(int $$0) {
         super.t($$0);
         return this;
      }

      public jg.a r(int $$0) {
         super.s($$0);
         return this;
      }

      @Override
      public jg j() {
         return new jg(this);
      }
   }
}
