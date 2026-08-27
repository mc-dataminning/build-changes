import com.google.common.collect.Iterators;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector4f;

public enum ie implements axc {
   a(0, 1, -1, "down", ie.b.b, ie.a.b, new jd(0, -1, 0)),
   b(1, 0, -1, "up", ie.b.a, ie.a.b, new jd(0, 1, 0)),
   c(2, 3, 2, "north", ie.b.b, ie.a.c, new jd(0, 0, -1)),
   d(3, 2, 0, "south", ie.b.a, ie.a.c, new jd(0, 0, 1)),
   e(4, 5, 1, "west", ie.b.b, ie.a.a, new jd(-1, 0, 0)),
   f(5, 4, 3, "east", ie.b.a, ie.a.a, new jd(1, 0, 0));

   public static final axc.a<ie> g = axc.a(ie::values);
   public static final Codec<ie> h = avp.a(g, ie::a);
   public static final IntFunction<ie> i = auz.a(ie::d, values(), auz.a.b);
   public static final xo<ByteBuf, ie> j = xm.a(i, ie::d);
   private final int k;
   private final int l;
   private final int m;
   private final String n;
   private final ie.a o;
   private final ie.b p;
   private final jd q;
   private static final ie[] r = values();
   private static final ie[] s = Arrays.stream(r).sorted(Comparator.comparingInt($$0 -> $$0.k)).toArray(ie[]::new);
   private static final ie[] t = Arrays.stream(r).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.m)).toArray(ie[]::new);

   private ie(int $$0, int $$1, int $$2, String $$3, ie.b $$4, ie.a $$5, jd $$6) {
      this.k = $$0;
      this.m = $$2;
      this.l = $$1;
      this.n = $$3;
      this.o = $$5;
      this.p = $$4;
      this.q = $$6;
   }

   public static ie[] a(bno $$0) {
      float $$1 = $$0.g(1.0F) * (float) (Math.PI / 180.0);
      float $$2 = -$$0.h(1.0F) * (float) (Math.PI / 180.0);
      float $$3 = awh.a($$1);
      float $$4 = awh.b($$1);
      float $$5 = awh.a($$2);
      float $$6 = awh.b($$2);
      boolean $$7 = $$5 > 0.0F;
      boolean $$8 = $$3 < 0.0F;
      boolean $$9 = $$6 > 0.0F;
      float $$10 = $$7 ? $$5 : -$$5;
      float $$11 = $$8 ? -$$3 : $$3;
      float $$12 = $$9 ? $$6 : -$$6;
      float $$13 = $$10 * $$4;
      float $$14 = $$12 * $$4;
      ie $$15 = $$7 ? f : e;
      ie $$16 = $$8 ? b : a;
      ie $$17 = $$9 ? d : c;
      if ($$10 > $$12) {
         if ($$11 > $$13) {
            return a($$16, $$15, $$17);
         } else {
            return $$14 > $$11 ? a($$15, $$17, $$16) : a($$15, $$16, $$17);
         }
      } else if ($$11 > $$14) {
         return a($$16, $$17, $$15);
      } else {
         return $$13 > $$11 ? a($$17, $$15, $$16) : a($$17, $$16, $$15);
      }
   }

   private static ie[] a(ie $$0, ie $$1, ie $$2) {
      return new ie[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
   }

   public static ie a(Matrix4f $$0, ie $$1) {
      jd $$2 = $$1.q();
      Vector4f $$3 = $$0.transform(new Vector4f((float)$$2.u(), (float)$$2.v(), (float)$$2.w(), 0.0F));
      return a($$3.x(), $$3.y(), $$3.z());
   }

   public static Collection<ie> a(awo $$0) {
      return ac.b(values(), $$0);
   }

   public static Stream<ie> a() {
      return Stream.of(r);
   }

   public Quaternionf b() {
      return switch (this) {
         case a -> new Quaternionf().rotationX((float) Math.PI);
         case b -> new Quaternionf();
         case c -> new Quaternionf().rotationXYZ((float) (Math.PI / 2), 0.0F, (float) Math.PI);
         case d -> new Quaternionf().rotationX((float) (Math.PI / 2));
         case e -> new Quaternionf().rotationXYZ((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2));
         case f -> new Quaternionf().rotationXYZ((float) (Math.PI / 2), 0.0F, (float) (-Math.PI / 2));
      };
   }

   public int d() {
      return this.k;
   }

   public int e() {
      return this.m;
   }

   public ie.b f() {
      return this.p;
   }

   public static ie a(bno $$0, ie.a $$1) {
      return switch ($$1) {
         case a -> f.a($$0.h(1.0F)) ? f : e;
         case c -> d.a($$0.h(1.0F)) ? d : c;
         case b -> $$0.g(1.0F) < 0.0F ? b : a;
      };
   }

   public ie g() {
      return a(this.l);
   }

   public ie a(ie.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.r() : this;
         case c -> this != c && this != d ? this.t() : this;
         case b -> this != b && this != a ? this.h() : this;
      };
   }

   public ie b(ie.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.s() : this;
         case c -> this != c && this != d ? this.u() : this;
         case b -> this != b && this != a ? this.i() : this;
      };
   }

   public ie h() {
      return switch (this) {
         case c -> f;
         case d -> e;
         case e -> c;
         case f -> d;
         default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      };
   }

   private ie r() {
      return switch (this) {
         case a -> d;
         case b -> c;
         case c -> a;
         case d -> b;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private ie s() {
      return switch (this) {
         case a -> c;
         case b -> d;
         case c -> b;
         case d -> a;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private ie t() {
      return switch (this) {
         case a -> e;
         case b -> f;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> b;
         case f -> a;
      };
   }

   private ie u() {
      return switch (this) {
         case a -> f;
         case b -> e;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> a;
         case f -> b;
      };
   }

   public ie i() {
      return switch (this) {
         case c -> e;
         case d -> f;
         case e -> d;
         case f -> c;
         default -> throw new IllegalStateException("Unable to get CCW facing of " + this);
      };
   }

   public int j() {
      return this.q.u();
   }

   public int k() {
      return this.q.v();
   }

   public int l() {
      return this.q.w();
   }

   public Vector3f m() {
      return new Vector3f((float)this.j(), (float)this.k(), (float)this.l());
   }

   public String n() {
      return this.n;
   }

   public ie.a o() {
      return this.o;
   }

   @Nullable
   public static ie a(@Nullable String $$0) {
      return g.a($$0);
   }

   public static ie a(int $$0) {
      return s[awh.a($$0 % s.length)];
   }

   public static ie b(int $$0) {
      return t[awh.a($$0 % t.length)];
   }

   @Nullable
   public static ie a(int $$0, int $$1, int $$2) {
      if ($$0 == 0) {
         if ($$1 == 0) {
            if ($$2 > 0) {
               return d;
            }

            if ($$2 < 0) {
               return c;
            }
         } else if ($$2 == 0) {
            if ($$1 > 0) {
               return b;
            }

            return a;
         }
      } else if ($$1 == 0 && $$2 == 0) {
         if ($$0 > 0) {
            return f;
         }

         return e;
      }

      return null;
   }

   public static ie a(double $$0) {
      return b(awh.a($$0 / 90.0 + 0.5) & 3);
   }

   public static ie a(ie.a $$0, ie.b $$1) {
      return switch ($$0) {
         case a -> $$1 == ie.b.a ? f : e;
         case c -> $$1 == ie.b.a ? d : c;
         case b -> $$1 == ie.b.a ? b : a;
      };
   }

   public float p() {
      return (float)((this.m & 3) * 90);
   }

   public static ie b(awo $$0) {
      return ac.a(r, $$0);
   }

   public static ie a(double $$0, double $$1, double $$2) {
      return a((float)$$0, (float)$$1, (float)$$2);
   }

   public static ie a(float $$0, float $$1, float $$2) {
      ie $$3 = c;
      float $$4 = Float.MIN_VALUE;

      for (ie $$5 : r) {
         float $$6 = $$0 * (float)$$5.q.u() + $$1 * (float)$$5.q.v() + $$2 * (float)$$5.q.w();
         if ($$6 > $$4) {
            $$4 = $$6;
            $$3 = $$5;
         }
      }

      return $$3;
   }

   @Override
   public String toString() {
      return this.n;
   }

   @Override
   public String c() {
      return this.n;
   }

   private static DataResult<ie> a(ie $$0) {
      return $$0.o().b() ? DataResult.success($$0) : DataResult.error(() -> "Expected a vertical direction");
   }

   public static ie a(ie.b $$0, ie.a $$1) {
      for (ie $$2 : r) {
         if ($$2.f() == $$0 && $$2.o() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("No such direction: " + $$0 + " " + $$1);
   }

   public jd q() {
      return this.q;
   }

   public boolean a(float $$0) {
      float $$1 = $$0 * (float) (Math.PI / 180.0);
      float $$2 = -awh.a($$1);
      float $$3 = awh.b($$1);
      return (float)this.q.u() * $$2 + (float)this.q.w() * $$3 > 0.0F;
   }

   public static enum a implements axc, Predicate<ie> {
      a("x") {
         @Override
         public int a(int $$0, int $$1, int $$2) {
            return $$0;
         }

         @Override
         public double a(double $$0, double $$1, double $$2) {
            return $$0;
         }
      },
      b("y") {
         @Override
         public int a(int $$0, int $$1, int $$2) {
            return $$1;
         }

         @Override
         public double a(double $$0, double $$1, double $$2) {
            return $$1;
         }
      },
      c("z") {
         @Override
         public int a(int $$0, int $$1, int $$2) {
            return $$2;
         }

         @Override
         public double a(double $$0, double $$1, double $$2) {
            return $$2;
         }
      };

      public static final ie.a[] d = values();
      public static final axc.a<ie.a> e = axc.a(ie.a::values);
      private final String f;

      a(String $$0) {
         this.f = $$0;
      }

      @Nullable
      public static ie.a a(String $$0) {
         return e.a($$0);
      }

      public String a() {
         return this.f;
      }

      public boolean b() {
         return this == b;
      }

      public boolean d() {
         return this == a || this == c;
      }

      @Override
      public String toString() {
         return this.f;
      }

      public static ie.a a(awo $$0) {
         return ac.a(d, $$0);
      }

      public boolean a(@Nullable ie $$0) {
         return $$0 != null && $$0.o() == this;
      }

      public ie.c e() {
         return switch (this) {
            case a, c -> ie.c.a;
            case b -> ie.c.b;
         };
      }

      @Override
      public String c() {
         return this.f;
      }

      public abstract int a(int var1, int var2, int var3);

      public abstract double a(double var1, double var3, double var5);
   }

   public static enum b {
      a(1, "Towards positive"),
      b(-1, "Towards negative");

      private final int c;
      private final String d;

      private b(int $$0, String $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public int a() {
         return this.c;
      }

      public String b() {
         return this.d;
      }

      @Override
      public String toString() {
         return this.d;
      }

      public ie.b c() {
         return this == a ? b : a;
      }
   }

   public static enum c implements Iterable<ie>, Predicate<ie> {
      a(new ie[]{ie.c, ie.f, ie.d, ie.e}, new ie.a[]{ie.a.a, ie.a.c}),
      b(new ie[]{ie.b, ie.a}, new ie.a[]{ie.a.b});

      private final ie[] c;
      private final ie.a[] d;

      private c(ie[] $$0, ie.a[] $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public ie a(awo $$0) {
         return ac.a(this.c, $$0);
      }

      public ie.a b(awo $$0) {
         return ac.a(this.d, $$0);
      }

      public boolean a(@Nullable ie $$0) {
         return $$0 != null && $$0.o().e() == this;
      }

      @Override
      public Iterator<ie> iterator() {
         return Iterators.forArray(this.c);
      }

      public Stream<ie> a() {
         return Arrays.stream(this.c);
      }

      public List<ie> c(awo $$0) {
         return ac.b(this.c, $$0);
      }
   }
}
