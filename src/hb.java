import com.google.common.collect.Iterators;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector4f;

public enum hb implements asf {
   a(0, 1, -1, "down", hb.b.b, hb.a.b, new ia(0, -1, 0)),
   b(1, 0, -1, "up", hb.b.a, hb.a.b, new ia(0, 1, 0)),
   c(2, 3, 2, "north", hb.b.b, hb.a.c, new ia(0, 0, -1)),
   d(3, 2, 0, "south", hb.b.a, hb.a.c, new ia(0, 0, 1)),
   e(4, 5, 1, "west", hb.b.b, hb.a.a, new ia(-1, 0, 0)),
   f(5, 4, 3, "east", hb.b.a, hb.a.a, new ia(1, 0, 0));

   public static final asf.a<hb> g = asf.a(hb::values);
   public static final Codec<hb> h = aqw.a(g, hb::a);
   private final int i;
   private final int j;
   private final int k;
   private final String l;
   private final hb.a m;
   private final hb.b n;
   private final ia o;
   private static final hb[] p = values();
   private static final hb[] q = Arrays.stream(p).sorted(Comparator.comparingInt($$0 -> $$0.i)).toArray(hb[]::new);
   private static final hb[] r = Arrays.stream(p).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.k)).toArray(hb[]::new);

   private hb(int $$0, int $$1, int $$2, String $$3, hb.b $$4, hb.a $$5, ia $$6) {
      this.i = $$0;
      this.k = $$2;
      this.j = $$1;
      this.l = $$3;
      this.m = $$5;
      this.n = $$4;
      this.o = $$6;
   }

   public static hb[] a(big $$0) {
      float $$1 = $$0.g(1.0F) * (float) (Math.PI / 180.0);
      float $$2 = -$$0.h(1.0F) * (float) (Math.PI / 180.0);
      float $$3 = aro.a($$1);
      float $$4 = aro.b($$1);
      float $$5 = aro.a($$2);
      float $$6 = aro.b($$2);
      boolean $$7 = $$5 > 0.0F;
      boolean $$8 = $$3 < 0.0F;
      boolean $$9 = $$6 > 0.0F;
      float $$10 = $$7 ? $$5 : -$$5;
      float $$11 = $$8 ? -$$3 : $$3;
      float $$12 = $$9 ? $$6 : -$$6;
      float $$13 = $$10 * $$4;
      float $$14 = $$12 * $$4;
      hb $$15 = $$7 ? f : e;
      hb $$16 = $$8 ? b : a;
      hb $$17 = $$9 ? d : c;
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

   private static hb[] a(hb $$0, hb $$1, hb $$2) {
      return new hb[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
   }

   public static hb a(Matrix4f $$0, hb $$1) {
      ia $$2 = $$1.q();
      Vector4f $$3 = $$0.transform(new Vector4f((float)$$2.u(), (float)$$2.v(), (float)$$2.w(), 0.0F));
      return a($$3.x(), $$3.y(), $$3.z());
   }

   public static Collection<hb> a(art $$0) {
      return ac.b(values(), $$0);
   }

   public static Stream<hb> a() {
      return Stream.of(p);
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
      return this.i;
   }

   public int e() {
      return this.k;
   }

   public hb.b f() {
      return this.n;
   }

   public static hb a(big $$0, hb.a $$1) {
      return switch ($$1) {
         case a -> f.a($$0.h(1.0F)) ? f : e;
         case c -> d.a($$0.h(1.0F)) ? d : c;
         case b -> $$0.g(1.0F) < 0.0F ? b : a;
      };
   }

   public hb g() {
      return a(this.j);
   }

   public hb a(hb.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.r() : this;
         case c -> this != c && this != d ? this.t() : this;
         case b -> this != b && this != a ? this.h() : this;
      };
   }

   public hb b(hb.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.s() : this;
         case c -> this != c && this != d ? this.u() : this;
         case b -> this != b && this != a ? this.i() : this;
      };
   }

   public hb h() {
      return switch (this) {
         case c -> f;
         case d -> e;
         case e -> c;
         case f -> d;
         default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      };
   }

   private hb r() {
      return switch (this) {
         case a -> d;
         case b -> c;
         case c -> a;
         case d -> b;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private hb s() {
      return switch (this) {
         case a -> c;
         case b -> d;
         case c -> b;
         case d -> a;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private hb t() {
      return switch (this) {
         case a -> e;
         case b -> f;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> b;
         case f -> a;
      };
   }

   private hb u() {
      return switch (this) {
         case a -> f;
         case b -> e;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> a;
         case f -> b;
      };
   }

   public hb i() {
      return switch (this) {
         case c -> e;
         case d -> f;
         case e -> d;
         case f -> c;
         default -> throw new IllegalStateException("Unable to get CCW facing of " + this);
      };
   }

   public int j() {
      return this.o.u();
   }

   public int k() {
      return this.o.v();
   }

   public int l() {
      return this.o.w();
   }

   public Vector3f m() {
      return new Vector3f((float)this.j(), (float)this.k(), (float)this.l());
   }

   public String n() {
      return this.l;
   }

   public hb.a o() {
      return this.m;
   }

   @Nullable
   public static hb a(@Nullable String $$0) {
      return g.a($$0);
   }

   public static hb a(int $$0) {
      return q[aro.a($$0 % q.length)];
   }

   public static hb b(int $$0) {
      return r[aro.a($$0 % r.length)];
   }

   @Nullable
   public static hb a(int $$0, int $$1, int $$2) {
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

   public static hb a(double $$0) {
      return b(aro.a($$0 / 90.0 + 0.5) & 3);
   }

   public static hb a(hb.a $$0, hb.b $$1) {
      return switch ($$0) {
         case a -> $$1 == hb.b.a ? f : e;
         case c -> $$1 == hb.b.a ? d : c;
         case b -> $$1 == hb.b.a ? b : a;
      };
   }

   public float p() {
      return (float)((this.k & 3) * 90);
   }

   public static hb b(art $$0) {
      return ac.a(p, $$0);
   }

   public static hb a(double $$0, double $$1, double $$2) {
      return a((float)$$0, (float)$$1, (float)$$2);
   }

   public static hb a(float $$0, float $$1, float $$2) {
      hb $$3 = c;
      float $$4 = Float.MIN_VALUE;

      for (hb $$5 : p) {
         float $$6 = $$0 * (float)$$5.o.u() + $$1 * (float)$$5.o.v() + $$2 * (float)$$5.o.w();
         if ($$6 > $$4) {
            $$4 = $$6;
            $$3 = $$5;
         }
      }

      return $$3;
   }

   @Override
   public String toString() {
      return this.l;
   }

   @Override
   public String c() {
      return this.l;
   }

   private static DataResult<hb> a(hb $$0) {
      return $$0.o().b() ? DataResult.success($$0) : DataResult.error(() -> "Expected a vertical direction");
   }

   public static hb a(hb.b $$0, hb.a $$1) {
      for (hb $$2 : p) {
         if ($$2.f() == $$0 && $$2.o() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("No such direction: " + $$0 + " " + $$1);
   }

   public ia q() {
      return this.o;
   }

   public boolean a(float $$0) {
      float $$1 = $$0 * (float) (Math.PI / 180.0);
      float $$2 = -aro.a($$1);
      float $$3 = aro.b($$1);
      return (float)this.o.u() * $$2 + (float)this.o.w() * $$3 > 0.0F;
   }

   public static enum a implements asf, Predicate<hb> {
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

      public static final hb.a[] d = values();
      public static final asf.a<hb.a> e = asf.a(hb.a::values);
      private final String f;

      a(String $$0) {
         this.f = $$0;
      }

      @Nullable
      public static hb.a a(String $$0) {
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

      public static hb.a a(art $$0) {
         return ac.a(d, $$0);
      }

      public boolean a(@Nullable hb $$0) {
         return $$0 != null && $$0.o() == this;
      }

      public hb.c e() {
         return switch (this) {
            case a, c -> hb.c.a;
            case b -> hb.c.b;
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

      public hb.b c() {
         return this == a ? b : a;
      }
   }

   public static enum c implements Iterable<hb>, Predicate<hb> {
      a(new hb[]{hb.c, hb.f, hb.d, hb.e}, new hb.a[]{hb.a.a, hb.a.c}),
      b(new hb[]{hb.b, hb.a}, new hb.a[]{hb.a.b});

      private final hb[] c;
      private final hb.a[] d;

      private c(hb[] $$0, hb.a[] $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public hb a(art $$0) {
         return ac.a(this.c, $$0);
      }

      public hb.a b(art $$0) {
         return ac.a(this.d, $$0);
      }

      public boolean a(@Nullable hb $$0) {
         return $$0 != null && $$0.o().e() == this;
      }

      @Override
      public Iterator<hb> iterator() {
         return Iterators.forArray(this.c);
      }

      public Stream<hb> a() {
         return Arrays.stream(this.c);
      }

      public List<hb> c(art $$0) {
         return ac.b(this.c, $$0);
      }
   }
}
