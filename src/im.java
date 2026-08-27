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
public class im extends jq {
   public static final Codec<im> a = Codec.INT_STREAM
      .comapFlatMap($$0 -> ac.a($$0, 3).map($$0x -> new im($$0x[0], $$0x[1], $$0x[2])), $$0 -> IntStream.of($$0.u(), $$0.v(), $$0.w()))
      .stable();
   public static final yq<ByteBuf, im> b = new yq<ByteBuf, im>() {
      public im a(ByteBuf $$0) {
         return vs.b($$0);
      }

      public void a(ByteBuf $$0, im $$1) {
         vs.a($$0, $$1);
      }
   };
   private static final Logger e = LogUtils.getLogger();
   public static final im c = new im(0, 0, 0);
   private static final int h = 1 + axw.f(axw.c(30000000));
   private static final int i = h;
   public static final int d = 64 - h - i;
   private static final long j = (1L << h) - 1L;
   private static final long k = (1L << d) - 1L;
   private static final long l = (1L << i) - 1L;
   private static final int m = 0;
   private static final int n = d;
   private static final int o = d + i;

   public im(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public im(jq $$0) {
      this($$0.u(), $$0.v(), $$0.w());
   }

   public static long a(long $$0, ir $$1) {
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

   public static im d(long $$0) {
      return new im(a($$0), b($$0), c($$0));
   }

   public static im a(double $$0, double $$1, double $$2) {
      return new im(axw.a($$0), axw.a($$1), axw.a($$2));
   }

   public static im a(jf $$0) {
      return a($$0.a(), $$0.b(), $$0.c());
   }

   public static im a(im $$0, im $$1) {
      return new im(Math.min($$0.u(), $$1.u()), Math.min($$0.v(), $$1.v()), Math.min($$0.w(), $$1.w()));
   }

   public static im b(im $$0, im $$1) {
      return new im(Math.max($$0.u(), $$1.u()), Math.max($$0.v(), $$1.v()), Math.max($$0.w(), $$1.w()));
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

   public im b(int $$0, int $$1, int $$2) {
      return $$0 == 0 && $$1 == 0 && $$2 == 0 ? this : new im(this.u() + $$0, this.v() + $$1, this.w() + $$2);
   }

   public etf b() {
      return etf.b(this);
   }

   public im a(jq $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   public im b(jq $$0) {
      return this.b(-$$0.u(), -$$0.v(), -$$0.w());
   }

   public im a(int $$0) {
      if ($$0 == 1) {
         return this;
      } else {
         return $$0 == 0 ? c : new im(this.u() * $$0, this.v() * $$0, this.w() * $$0);
      }
   }

   public im c() {
      return this.a(ir.b);
   }

   public im b(int $$0) {
      return this.a(ir.b, $$0);
   }

   public im d() {
      return this.a(ir.a);
   }

   public im c(int $$0) {
      return this.a(ir.a, $$0);
   }

   public im e() {
      return this.a(ir.c);
   }

   public im d(int $$0) {
      return this.a(ir.c, $$0);
   }

   public im f() {
      return this.a(ir.d);
   }

   public im e(int $$0) {
      return this.a(ir.d, $$0);
   }

   public im g() {
      return this.a(ir.e);
   }

   public im f(int $$0) {
      return this.a(ir.e, $$0);
   }

   public im h() {
      return this.a(ir.f);
   }

   public im g(int $$0) {
      return this.a(ir.f, $$0);
   }

   public im a(ir $$0) {
      return new im(this.u() + $$0.j(), this.v() + $$0.k(), this.w() + $$0.l());
   }

   public im a(ir $$0, int $$1) {
      return $$1 == 0 ? this : new im(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
   }

   public im a(ir.a $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         int $$2 = $$0 == ir.a.a ? $$1 : 0;
         int $$3 = $$0 == ir.a.b ? $$1 : 0;
         int $$4 = $$0 == ir.a.c ? $$1 : 0;
         return new im(this.u() + $$2, this.v() + $$3, this.w() + $$4);
      }
   }

   public im a(dji $$0) {
      switch ($$0) {
         case a:
         default:
            return this;
         case b:
            return new im(-this.w(), this.v(), this.u());
         case c:
            return new im(-this.u(), this.v(), -this.w());
         case d:
            return new im(this.w(), this.v(), -this.u());
      }
   }

   public im c(jq $$0) {
      return new im(this.v() * $$0.w() - this.w() * $$0.v(), this.w() * $$0.u() - this.u() * $$0.w(), this.u() * $$0.v() - this.v() * $$0.u());
   }

   public im h(int $$0) {
      return new im(this.u(), $$0, this.w());
   }

   public im i() {
      return this;
   }

   public im.a j() {
      return new im.a(this.u(), this.v(), this.w());
   }

   public static Iterable<im> a(ayd $$0, int $$1, im $$2, int $$3) {
      return a($$0, $$1, $$2.u() - $$3, $$2.v() - $$3, $$2.w() - $$3, $$2.u() + $$3, $$2.v() + $$3, $$2.w() + $$3);
   }

   @Deprecated
   public static Stream<im> a(im $$0) {
      return Stream.of($$0, $$0.f(), $$0.h(), $$0.f().h());
   }

   public static Iterable<im> a(ayd $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 - $$3 + 1;
      int $$10 = $$7 - $$4 + 1;
      return () -> new AbstractIterator<im>() {
            final im.a a = new im.a();
            int b = $$1;

            protected im a() {
               if (this.b <= 0) {
                  return (im)this.endOfData();
               } else {
                  im $$0 = this.a.d($$2 + $$0.a($$8), $$3 + $$0.a($$9), $$4 + $$0.a($$10));
                  this.b--;
                  return $$0;
               }
            }
         };
   }

   public static Iterable<im> a(im $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$1 + $$2 + $$3;
      int $$5 = $$0.u();
      int $$6 = $$0.v();
      int $$7 = $$0.w();
      return () -> new AbstractIterator<im>() {
            private final im.a h = new im.a();
            private int i;
            private int j;
            private int k;
            private int l;
            private int m;
            private boolean n;

            protected im a() {
               if (this.n) {
                  this.n = false;
                  this.h.r($$7 - (this.h.w() - $$7));
                  return this.h;
               } else {
                  im $$0;
                  for ($$0 = null; $$0 == null; this.m++) {
                     if (this.m > this.k) {
                        this.l++;
                        if (this.l > this.j) {
                           this.i++;
                           if (this.i > $$4) {
                              return (im)this.endOfData();
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

   public static Optional<im> a(im $$0, int $$1, int $$2, Predicate<im> $$3) {
      for (im $$4 : a($$0, $$1, $$2, $$1)) {
         if ($$3.test($$4)) {
            return Optional.of($$4);
         }
      }

      return Optional.empty();
   }

   public static Stream<im> b(im $$0, int $$1, int $$2, int $$3) {
      return StreamSupport.stream(a($$0, $$1, $$2, $$3).spliterator(), false);
   }

   public static Iterable<im> c(im $$0, im $$1) {
      return b(
         Math.min($$0.u(), $$1.u()),
         Math.min($$0.v(), $$1.v()),
         Math.min($$0.w(), $$1.w()),
         Math.max($$0.u(), $$1.u()),
         Math.max($$0.v(), $$1.v()),
         Math.max($$0.w(), $$1.w())
      );
   }

   public static Stream<im> d(im $$0, im $$1) {
      return StreamSupport.stream(c($$0, $$1).spliterator(), false);
   }

   public static Stream<im> a(efy $$0) {
      return a(
         Math.min($$0.h(), $$0.k()),
         Math.min($$0.i(), $$0.l()),
         Math.min($$0.j(), $$0.m()),
         Math.max($$0.h(), $$0.k()),
         Math.max($$0.i(), $$0.l()),
         Math.max($$0.j(), $$0.m())
      );
   }

   public static Stream<im> a(eta $$0) {
      return a(axw.a($$0.a), axw.a($$0.b), axw.a($$0.c), axw.a($$0.d), axw.a($$0.e), axw.a($$0.f));
   }

   public static Stream<im> a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return StreamSupport.stream(b($$0, $$1, $$2, $$3, $$4, $$5).spliterator(), false);
   }

   public static Iterable<im> b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$3 - $$0 + 1;
      int $$7 = $$4 - $$1 + 1;
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 * $$7 * $$8;
      return () -> new AbstractIterator<im>() {
            private final im.a g = new im.a();
            private int h;

            protected im a() {
               if (this.h == $$9) {
                  return (im)this.endOfData();
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

   public static Iterable<im.a> a(im $$0, int $$1, ir $$2, ir $$3) {
      Validate.validState($$2.o() != $$3.o(), "The two directions cannot be on the same axis", new Object[0]);
      return () -> new AbstractIterator<im.a>() {
            private final ir[] e = new ir[]{$$2, $$3, $$2.g(), $$3.g()};
            private final im.a f = $$0.j().c($$3);
            private final int g = 4 * $$1;
            private int h = -1;
            private int i;
            private int j;
            private int k = this.f.u();
            private int l = this.f.v();
            private int m = this.f.w();

            protected im.a a() {
               this.f.d(this.k, this.l, this.m).c(this.e[(this.h + 4) % 4]);
               this.k = this.f.u();
               this.l = this.f.v();
               this.m = this.f.w();
               if (this.j >= this.i) {
                  if (this.h >= this.g) {
                     return (im.a)this.endOfData();
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

   public static int a(im $$0, int $$1, int $$2, BiConsumer<im, Consumer<im>> $$3, Predicate<im> $$4) {
      Queue<Pair<im, Integer>> $$5 = new ArrayDeque<>();
      LongSet $$6 = new LongOpenHashSet();
      $$5.add(Pair.of($$0, 0));
      int $$7 = 0;

      while (!$$5.isEmpty()) {
         Pair<im, Integer> $$8 = $$5.poll();
         im $$9 = (im)$$8.getLeft();
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

   public static class a extends im {
      public a() {
         this(0, 0, 0);
      }

      public a(int $$0, int $$1, int $$2) {
         super($$0, $$1, $$2);
      }

      public a(double $$0, double $$1, double $$2) {
         this(axw.a($$0), axw.a($$1), axw.a($$2));
      }

      @Override
      public im b(int $$0, int $$1, int $$2) {
         return super.b($$0, $$1, $$2).i();
      }

      @Override
      public im a(int $$0) {
         return super.a($$0).i();
      }

      @Override
      public im a(ir $$0, int $$1) {
         return super.a($$0, $$1).i();
      }

      @Override
      public im a(ir.a $$0, int $$1) {
         return super.a($$0, $$1).i();
      }

      @Override
      public im a(dji $$0) {
         return super.a($$0).i();
      }

      public im.a d(int $$0, int $$1, int $$2) {
         this.p($$0);
         this.q($$1);
         this.r($$2);
         return this;
      }

      public im.a b(double $$0, double $$1, double $$2) {
         return this.d(axw.a($$0), axw.a($$1), axw.a($$2));
      }

      public im.a g(jq $$0) {
         return this.d($$0.u(), $$0.v(), $$0.w());
      }

      public im.a f(long $$0) {
         return this.d(a($$0), b($$0), c($$0));
      }

      public im.a a(ij $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.a($$1, $$2, $$3, ir.a.a), $$0.a($$1, $$2, $$3, ir.a.b), $$0.a($$1, $$2, $$3, ir.a.c));
      }

      public im.a a(jq $$0, ir $$1) {
         return this.d($$0.u() + $$1.j(), $$0.v() + $$1.k(), $$0.w() + $$1.l());
      }

      public im.a a(jq $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.u() + $$1, $$0.v() + $$2, $$0.w() + $$3);
      }

      public im.a a(jq $$0, jq $$1) {
         return this.d($$0.u() + $$1.u(), $$0.v() + $$1.v(), $$0.w() + $$1.w());
      }

      public im.a c(ir $$0) {
         return this.c($$0, 1);
      }

      public im.a c(ir $$0, int $$1) {
         return this.d(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
      }

      public im.a e(int $$0, int $$1, int $$2) {
         return this.d(this.u() + $$0, this.v() + $$1, this.w() + $$2);
      }

      public im.a h(jq $$0) {
         return this.d(this.u() + $$0.u(), this.v() + $$0.v(), this.w() + $$0.w());
      }

      public im.a a(ir.a $$0, int $$1, int $$2) {
         switch ($$0) {
            case a:
               return this.d(axw.a(this.u(), $$1, $$2), this.v(), this.w());
            case b:
               return this.d(this.u(), axw.a(this.v(), $$1, $$2), this.w());
            case c:
               return this.d(this.u(), this.v(), axw.a(this.w(), $$1, $$2));
            default:
               throw new IllegalStateException("Unable to clamp axis " + $$0);
         }
      }

      public im.a p(int $$0) {
         super.u($$0);
         return this;
      }

      public im.a q(int $$0) {
         super.t($$0);
         return this;
      }

      public im.a r(int $$0) {
         super.s($$0);
         return this;
      }

      @Override
      public im i() {
         return new im(this);
      }
   }
}
