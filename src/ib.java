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

public enum ib implements auk {
   a(0, 1, -1, "down", ib.b.b, ib.a.b, new ja(0, -1, 0)),
   b(1, 0, -1, "up", ib.b.a, ib.a.b, new ja(0, 1, 0)),
   c(2, 3, 2, "north", ib.b.b, ib.a.c, new ja(0, 0, -1)),
   d(3, 2, 0, "south", ib.b.a, ib.a.c, new ja(0, 0, 1)),
   e(4, 5, 1, "west", ib.b.b, ib.a.a, new ja(-1, 0, 0)),
   f(5, 4, 3, "east", ib.b.a, ib.a.a, new ja(1, 0, 0));

   public static final auk.a<ib> g = auk.a(ib::values);
   public static final Codec<ib> h = asy.a(g, ib::a);
   private final int i;
   private final int j;
   private final int k;
   private final String l;
   private final ib.a m;
   private final ib.b n;
   private final ja o;
   private static final ib[] p = values();
   private static final ib[] q = Arrays.stream(p).sorted(Comparator.comparingInt($$0 -> $$0.i)).toArray(ib[]::new);
   private static final ib[] r = Arrays.stream(p).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.k)).toArray(ib[]::new);

   private ib(int $$0, int $$1, int $$2, String $$3, ib.b $$4, ib.a $$5, ja $$6) {
      this.i = $$0;
      this.k = $$2;
      this.j = $$1;
      this.l = $$3;
      this.m = $$5;
      this.n = $$4;
      this.o = $$6;
   }

   public static ib[] a(bkv $$0) {
      float $$1 = $$0.g(1.0F) * (float) (Math.PI / 180.0);
      float $$2 = -$$0.h(1.0F) * (float) (Math.PI / 180.0);
      float $$3 = atq.a($$1);
      float $$4 = atq.b($$1);
      float $$5 = atq.a($$2);
      float $$6 = atq.b($$2);
      boolean $$7 = $$5 > 0.0F;
      boolean $$8 = $$3 < 0.0F;
      boolean $$9 = $$6 > 0.0F;
      float $$10 = $$7 ? $$5 : -$$5;
      float $$11 = $$8 ? -$$3 : $$3;
      float $$12 = $$9 ? $$6 : -$$6;
      float $$13 = $$10 * $$4;
      float $$14 = $$12 * $$4;
      ib $$15 = $$7 ? f : e;
      ib $$16 = $$8 ? b : a;
      ib $$17 = $$9 ? d : c;
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

   private static ib[] a(ib $$0, ib $$1, ib $$2) {
      return new ib[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
   }

   public static ib a(Matrix4f $$0, ib $$1) {
      ja $$2 = $$1.q();
      Vector4f $$3 = $$0.transform(new Vector4f((float)$$2.u(), (float)$$2.v(), (float)$$2.w(), 0.0F));
      return a($$3.x(), $$3.y(), $$3.z());
   }

   public static Collection<ib> a(atw $$0) {
      return ac.b(values(), $$0);
   }

   public static Stream<ib> a() {
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

   public ib.b f() {
      return this.n;
   }

   public static ib a(bkv $$0, ib.a $$1) {
      return switch ($$1) {
         case a -> f.a($$0.h(1.0F)) ? f : e;
         case c -> d.a($$0.h(1.0F)) ? d : c;
         case b -> $$0.g(1.0F) < 0.0F ? b : a;
      };
   }

   public ib g() {
      return a(this.j);
   }

   public ib a(ib.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.r() : this;
         case c -> this != c && this != d ? this.t() : this;
         case b -> this != b && this != a ? this.h() : this;
      };
   }

   public ib b(ib.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.s() : this;
         case c -> this != c && this != d ? this.u() : this;
         case b -> this != b && this != a ? this.i() : this;
      };
   }

   public ib h() {
      return switch (this) {
         case c -> f;
         case d -> e;
         case e -> c;
         case f -> d;
         default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      };
   }

   private ib r() {
      return switch (this) {
         case a -> d;
         case b -> c;
         case c -> a;
         case d -> b;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private ib s() {
      return switch (this) {
         case a -> c;
         case b -> d;
         case c -> b;
         case d -> a;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private ib t() {
      return switch (this) {
         case a -> e;
         case b -> f;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> b;
         case f -> a;
      };
   }

   private ib u() {
      return switch (this) {
         case a -> f;
         case b -> e;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> a;
         case f -> b;
      };
   }

   public ib i() {
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

   public ib.a o() {
      return this.m;
   }

   @Nullable
   public static ib a(@Nullable String $$0) {
      return g.a($$0);
   }

   public static ib a(int $$0) {
      return q[atq.a($$0 % q.length)];
   }

   public static ib b(int $$0) {
      return r[atq.a($$0 % r.length)];
   }

   @Nullable
   public static ib a(int $$0, int $$1, int $$2) {
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

   public static ib a(double $$0) {
      return b(atq.a($$0 / 90.0 + 0.5) & 3);
   }

   public static ib a(ib.a $$0, ib.b $$1) {
      return switch ($$0) {
         case a -> $$1 == ib.b.a ? f : e;
         case c -> $$1 == ib.b.a ? d : c;
         case b -> $$1 == ib.b.a ? b : a;
      };
   }

   public float p() {
      return (float)((this.k & 3) * 90);
   }

   public static ib b(atw $$0) {
      return ac.a(p, $$0);
   }

   public static ib a(double $$0, double $$1, double $$2) {
      return a((float)$$0, (float)$$1, (float)$$2);
   }

   public static ib a(float $$0, float $$1, float $$2) {
      ib $$3 = c;
      float $$4 = Float.MIN_VALUE;

      for (ib $$5 : p) {
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

   private static DataResult<ib> a(ib $$0) {
      return $$0.o().b() ? DataResult.success($$0) : DataResult.error(() -> "Expected a vertical direction");
   }

   public static ib a(ib.b $$0, ib.a $$1) {
      for (ib $$2 : p) {
         if ($$2.f() == $$0 && $$2.o() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("No such direction: " + $$0 + " " + $$1);
   }

   public ja q() {
      return this.o;
   }

   public boolean a(float $$0) {
      float $$1 = $$0 * (float) (Math.PI / 180.0);
      float $$2 = -atq.a($$1);
      float $$3 = atq.b($$1);
      return (float)this.o.u() * $$2 + (float)this.o.w() * $$3 > 0.0F;
   }

   public static enum a implements auk, Predicate<ib> {
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

      public static final ib.a[] d = values();
      public static final auk.a<ib.a> e = auk.a(ib.a::values);
      private final String f;

      a(String $$0) {
         this.f = $$0;
      }

      @Nullable
      public static ib.a a(String $$0) {
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

      public static ib.a a(atw $$0) {
         return ac.a(d, $$0);
      }

      public boolean a(@Nullable ib $$0) {
         return $$0 != null && $$0.o() == this;
      }

      public ib.c e() {
         return switch (this) {
            case a, c -> ib.c.a;
            case b -> ib.c.b;
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

      public ib.b c() {
         return this == a ? b : a;
      }
   }

   public static enum c implements Iterable<ib>, Predicate<ib> {
      a(new ib[]{ib.c, ib.f, ib.d, ib.e}, new ib.a[]{ib.a.a, ib.a.c}),
      b(new ib[]{ib.b, ib.a}, new ib.a[]{ib.a.b});

      private final ib[] c;
      private final ib.a[] d;

      private c(ib[] $$0, ib.a[] $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public ib a(atw $$0) {
         return ac.a(this.c, $$0);
      }

      public ib.a b(atw $$0) {
         return ac.a(this.d, $$0);
      }

      public boolean a(@Nullable ib $$0) {
         return $$0 != null && $$0.o().e() == this;
      }

      @Override
      public Iterator<ib> iterator() {
         return Iterators.forArray(this.c);
      }

      public Stream<ib> a() {
         return Arrays.stream(this.c);
      }

      public List<ib> c(atw $$0) {
         return ac.b(this.c, $$0);
      }
   }
}
