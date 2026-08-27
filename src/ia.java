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

public enum ia implements aut {
   a(0, 1, -1, "down", ia.b.b, ia.a.b, new iz(0, -1, 0)),
   b(1, 0, -1, "up", ia.b.a, ia.a.b, new iz(0, 1, 0)),
   c(2, 3, 2, "north", ia.b.b, ia.a.c, new iz(0, 0, -1)),
   d(3, 2, 0, "south", ia.b.a, ia.a.c, new iz(0, 0, 1)),
   e(4, 5, 1, "west", ia.b.b, ia.a.a, new iz(-1, 0, 0)),
   f(5, 4, 3, "east", ia.b.a, ia.a.a, new iz(1, 0, 0));

   public static final aut.a<ia> g = aut.a(ia::values);
   public static final Codec<ia> h = atg.a(g, ia::a);
   private final int i;
   private final int j;
   private final int k;
   private final String l;
   private final ia.a m;
   private final ia.b n;
   private final iz o;
   private static final ia[] p = values();
   private static final ia[] q = Arrays.stream(p).sorted(Comparator.comparingInt($$0 -> $$0.i)).toArray(ia[]::new);
   private static final ia[] r = Arrays.stream(p).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.k)).toArray(ia[]::new);

   private ia(int $$0, int $$1, int $$2, String $$3, ia.b $$4, ia.a $$5, iz $$6) {
      this.i = $$0;
      this.k = $$2;
      this.j = $$1;
      this.l = $$3;
      this.m = $$5;
      this.n = $$4;
      this.o = $$6;
   }

   public static ia[] a(blf $$0) {
      float $$1 = $$0.g(1.0F) * (float) (Math.PI / 180.0);
      float $$2 = -$$0.h(1.0F) * (float) (Math.PI / 180.0);
      float $$3 = aty.a($$1);
      float $$4 = aty.b($$1);
      float $$5 = aty.a($$2);
      float $$6 = aty.b($$2);
      boolean $$7 = $$5 > 0.0F;
      boolean $$8 = $$3 < 0.0F;
      boolean $$9 = $$6 > 0.0F;
      float $$10 = $$7 ? $$5 : -$$5;
      float $$11 = $$8 ? -$$3 : $$3;
      float $$12 = $$9 ? $$6 : -$$6;
      float $$13 = $$10 * $$4;
      float $$14 = $$12 * $$4;
      ia $$15 = $$7 ? f : e;
      ia $$16 = $$8 ? b : a;
      ia $$17 = $$9 ? d : c;
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

   private static ia[] a(ia $$0, ia $$1, ia $$2) {
      return new ia[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
   }

   public static ia a(Matrix4f $$0, ia $$1) {
      iz $$2 = $$1.q();
      Vector4f $$3 = $$0.transform(new Vector4f((float)$$2.u(), (float)$$2.v(), (float)$$2.w(), 0.0F));
      return a($$3.x(), $$3.y(), $$3.z());
   }

   public static Collection<ia> a(auf $$0) {
      return ac.b(values(), $$0);
   }

   public static Stream<ia> a() {
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

   public ia.b f() {
      return this.n;
   }

   public static ia a(blf $$0, ia.a $$1) {
      return switch ($$1) {
         case a -> f.a($$0.h(1.0F)) ? f : e;
         case c -> d.a($$0.h(1.0F)) ? d : c;
         case b -> $$0.g(1.0F) < 0.0F ? b : a;
      };
   }

   public ia g() {
      return a(this.j);
   }

   public ia a(ia.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.r() : this;
         case c -> this != c && this != d ? this.t() : this;
         case b -> this != b && this != a ? this.h() : this;
      };
   }

   public ia b(ia.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.s() : this;
         case c -> this != c && this != d ? this.u() : this;
         case b -> this != b && this != a ? this.i() : this;
      };
   }

   public ia h() {
      return switch (this) {
         case c -> f;
         case d -> e;
         case e -> c;
         case f -> d;
         default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      };
   }

   private ia r() {
      return switch (this) {
         case a -> d;
         case b -> c;
         case c -> a;
         case d -> b;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private ia s() {
      return switch (this) {
         case a -> c;
         case b -> d;
         case c -> b;
         case d -> a;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private ia t() {
      return switch (this) {
         case a -> e;
         case b -> f;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> b;
         case f -> a;
      };
   }

   private ia u() {
      return switch (this) {
         case a -> f;
         case b -> e;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> a;
         case f -> b;
      };
   }

   public ia i() {
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

   public ia.a o() {
      return this.m;
   }

   @Nullable
   public static ia a(@Nullable String $$0) {
      return g.a($$0);
   }

   public static ia a(int $$0) {
      return q[aty.a($$0 % q.length)];
   }

   public static ia b(int $$0) {
      return r[aty.a($$0 % r.length)];
   }

   @Nullable
   public static ia a(int $$0, int $$1, int $$2) {
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

   public static ia a(double $$0) {
      return b(aty.a($$0 / 90.0 + 0.5) & 3);
   }

   public static ia a(ia.a $$0, ia.b $$1) {
      return switch ($$0) {
         case a -> $$1 == ia.b.a ? f : e;
         case c -> $$1 == ia.b.a ? d : c;
         case b -> $$1 == ia.b.a ? b : a;
      };
   }

   public float p() {
      return (float)((this.k & 3) * 90);
   }

   public static ia b(auf $$0) {
      return ac.a(p, $$0);
   }

   public static ia a(double $$0, double $$1, double $$2) {
      return a((float)$$0, (float)$$1, (float)$$2);
   }

   public static ia a(float $$0, float $$1, float $$2) {
      ia $$3 = c;
      float $$4 = Float.MIN_VALUE;

      for (ia $$5 : p) {
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

   private static DataResult<ia> a(ia $$0) {
      return $$0.o().b() ? DataResult.success($$0) : DataResult.error(() -> "Expected a vertical direction");
   }

   public static ia a(ia.b $$0, ia.a $$1) {
      for (ia $$2 : p) {
         if ($$2.f() == $$0 && $$2.o() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("No such direction: " + $$0 + " " + $$1);
   }

   public iz q() {
      return this.o;
   }

   public boolean a(float $$0) {
      float $$1 = $$0 * (float) (Math.PI / 180.0);
      float $$2 = -aty.a($$1);
      float $$3 = aty.b($$1);
      return (float)this.o.u() * $$2 + (float)this.o.w() * $$3 > 0.0F;
   }

   public static enum a implements aut, Predicate<ia> {
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

      public static final ia.a[] d = values();
      public static final aut.a<ia.a> e = aut.a(ia.a::values);
      private final String f;

      a(String $$0) {
         this.f = $$0;
      }

      @Nullable
      public static ia.a a(String $$0) {
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

      public static ia.a a(auf $$0) {
         return ac.a(d, $$0);
      }

      public boolean a(@Nullable ia $$0) {
         return $$0 != null && $$0.o() == this;
      }

      public ia.c e() {
         return switch (this) {
            case a, c -> ia.c.a;
            case b -> ia.c.b;
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

      public ia.b c() {
         return this == a ? b : a;
      }
   }

   public static enum c implements Iterable<ia>, Predicate<ia> {
      a(new ia[]{ia.c, ia.f, ia.d, ia.e}, new ia.a[]{ia.a.a, ia.a.c}),
      b(new ia[]{ia.b, ia.a}, new ia.a[]{ia.a.b});

      private final ia[] c;
      private final ia.a[] d;

      private c(ia[] $$0, ia.a[] $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public ia a(auf $$0) {
         return ac.a(this.c, $$0);
      }

      public ia.a b(auf $$0) {
         return ac.a(this.d, $$0);
      }

      public boolean a(@Nullable ia $$0) {
         return $$0 != null && $$0.o().e() == this;
      }

      @Override
      public Iterator<ia> iterator() {
         return Iterators.forArray(this.c);
      }

      public Stream<ia> a() {
         return Arrays.stream(this.c);
      }

      public List<ia> c(auf $$0) {
         return ac.b(this.c, $$0);
      }
   }
}
