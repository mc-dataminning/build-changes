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

public enum ih implements axg {
   a(0, 1, -1, "down", ih.b.b, ih.a.b, new jf(0, -1, 0)),
   b(1, 0, -1, "up", ih.b.a, ih.a.b, new jf(0, 1, 0)),
   c(2, 3, 2, "north", ih.b.b, ih.a.c, new jf(0, 0, -1)),
   d(3, 2, 0, "south", ih.b.a, ih.a.c, new jf(0, 0, 1)),
   e(4, 5, 1, "west", ih.b.b, ih.a.a, new jf(-1, 0, 0)),
   f(5, 4, 3, "east", ih.b.a, ih.a.a, new jf(1, 0, 0));

   public static final axg.a<ih> g = axg.a(ih::values);
   public static final Codec<ih> h = avu.a(g, ih::a);
   public static final IntFunction<ih> i = ave.a(ih::d, values(), ave.a.b);
   public static final xq<ByteBuf, ih> j = xo.a(i, ih::d);
   private final int k;
   private final int l;
   private final int m;
   private final String n;
   private final ih.a o;
   private final ih.b p;
   private final jf q;
   private static final ih[] r = values();
   private static final ih[] s = Arrays.stream(r).sorted(Comparator.comparingInt($$0 -> $$0.k)).toArray(ih[]::new);
   private static final ih[] t = Arrays.stream(r).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.m)).toArray(ih[]::new);

   private ih(int $$0, int $$1, int $$2, String $$3, ih.b $$4, ih.a $$5, jf $$6) {
      this.k = $$0;
      this.m = $$2;
      this.l = $$1;
      this.n = $$3;
      this.o = $$5;
      this.p = $$4;
      this.q = $$6;
   }

   public static ih[] a(bof $$0) {
      float $$1 = $$0.g(1.0F) * (float) (Math.PI / 180.0);
      float $$2 = -$$0.h(1.0F) * (float) (Math.PI / 180.0);
      float $$3 = awm.a($$1);
      float $$4 = awm.b($$1);
      float $$5 = awm.a($$2);
      float $$6 = awm.b($$2);
      boolean $$7 = $$5 > 0.0F;
      boolean $$8 = $$3 < 0.0F;
      boolean $$9 = $$6 > 0.0F;
      float $$10 = $$7 ? $$5 : -$$5;
      float $$11 = $$8 ? -$$3 : $$3;
      float $$12 = $$9 ? $$6 : -$$6;
      float $$13 = $$10 * $$4;
      float $$14 = $$12 * $$4;
      ih $$15 = $$7 ? f : e;
      ih $$16 = $$8 ? b : a;
      ih $$17 = $$9 ? d : c;
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

   private static ih[] a(ih $$0, ih $$1, ih $$2) {
      return new ih[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
   }

   public static ih a(Matrix4f $$0, ih $$1) {
      jf $$2 = $$1.q();
      Vector4f $$3 = $$0.transform(new Vector4f((float)$$2.u(), (float)$$2.v(), (float)$$2.w(), 0.0F));
      return a($$3.x(), $$3.y(), $$3.z());
   }

   public static Collection<ih> a(awt $$0) {
      return ac.b(values(), $$0);
   }

   public static Stream<ih> a() {
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

   public ih.b f() {
      return this.p;
   }

   public static ih a(bof $$0, ih.a $$1) {
      return switch ($$1) {
         case a -> f.a($$0.h(1.0F)) ? f : e;
         case c -> d.a($$0.h(1.0F)) ? d : c;
         case b -> $$0.g(1.0F) < 0.0F ? b : a;
      };
   }

   public ih g() {
      return a(this.l);
   }

   public ih a(ih.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.r() : this;
         case c -> this != c && this != d ? this.t() : this;
         case b -> this != b && this != a ? this.h() : this;
      };
   }

   public ih b(ih.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.s() : this;
         case c -> this != c && this != d ? this.u() : this;
         case b -> this != b && this != a ? this.i() : this;
      };
   }

   public ih h() {
      return switch (this) {
         case c -> f;
         case d -> e;
         case e -> c;
         case f -> d;
         default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      };
   }

   private ih r() {
      return switch (this) {
         case a -> d;
         case b -> c;
         case c -> a;
         case d -> b;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private ih s() {
      return switch (this) {
         case a -> c;
         case b -> d;
         case c -> b;
         case d -> a;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private ih t() {
      return switch (this) {
         case a -> e;
         case b -> f;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> b;
         case f -> a;
      };
   }

   private ih u() {
      return switch (this) {
         case a -> f;
         case b -> e;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> a;
         case f -> b;
      };
   }

   public ih i() {
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

   public ih.a o() {
      return this.o;
   }

   @Nullable
   public static ih a(@Nullable String $$0) {
      return g.a($$0);
   }

   public static ih a(int $$0) {
      return s[awm.a($$0 % s.length)];
   }

   public static ih b(int $$0) {
      return t[awm.a($$0 % t.length)];
   }

   @Nullable
   public static ih a(int $$0, int $$1, int $$2) {
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

   public static ih a(double $$0) {
      return b(awm.a($$0 / 90.0 + 0.5) & 3);
   }

   public static ih a(ih.a $$0, ih.b $$1) {
      return switch ($$0) {
         case a -> $$1 == ih.b.a ? f : e;
         case c -> $$1 == ih.b.a ? d : c;
         case b -> $$1 == ih.b.a ? b : a;
      };
   }

   public float p() {
      return (float)((this.m & 3) * 90);
   }

   public static ih b(awt $$0) {
      return ac.a(r, $$0);
   }

   public static ih a(double $$0, double $$1, double $$2) {
      return a((float)$$0, (float)$$1, (float)$$2);
   }

   public static ih a(float $$0, float $$1, float $$2) {
      ih $$3 = c;
      float $$4 = Float.MIN_VALUE;

      for (ih $$5 : r) {
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

   private static DataResult<ih> a(ih $$0) {
      return $$0.o().b() ? DataResult.success($$0) : DataResult.error(() -> "Expected a vertical direction");
   }

   public static ih a(ih.b $$0, ih.a $$1) {
      for (ih $$2 : r) {
         if ($$2.f() == $$0 && $$2.o() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("No such direction: " + $$0 + " " + $$1);
   }

   public jf q() {
      return this.q;
   }

   public boolean a(float $$0) {
      float $$1 = $$0 * (float) (Math.PI / 180.0);
      float $$2 = -awm.a($$1);
      float $$3 = awm.b($$1);
      return (float)this.q.u() * $$2 + (float)this.q.w() * $$3 > 0.0F;
   }

   public static enum a implements axg, Predicate<ih> {
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

      public static final ih.a[] d = values();
      public static final axg.a<ih.a> e = axg.a(ih.a::values);
      private final String f;

      a(String $$0) {
         this.f = $$0;
      }

      @Nullable
      public static ih.a a(String $$0) {
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

      public static ih.a a(awt $$0) {
         return ac.a(d, $$0);
      }

      public boolean a(@Nullable ih $$0) {
         return $$0 != null && $$0.o() == this;
      }

      public ih.c e() {
         return switch (this) {
            case a, c -> ih.c.a;
            case b -> ih.c.b;
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

      public ih.b c() {
         return this == a ? b : a;
      }
   }

   public static enum c implements Iterable<ih>, Predicate<ih> {
      a(new ih[]{ih.c, ih.f, ih.d, ih.e}, new ih.a[]{ih.a.a, ih.a.c}),
      b(new ih[]{ih.b, ih.a}, new ih.a[]{ih.a.b});

      private final ih[] c;
      private final ih.a[] d;

      private c(ih[] $$0, ih.a[] $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public ih a(awt $$0) {
         return ac.a(this.c, $$0);
      }

      public ih.a b(awt $$0) {
         return ac.a(this.d, $$0);
      }

      public boolean a(@Nullable ih $$0) {
         return $$0 != null && $$0.o().e() == this;
      }

      @Override
      public Iterator<ih> iterator() {
         return Iterators.forArray(this.c);
      }

      public Stream<ih> a() {
         return Arrays.stream(this.c);
      }

      public List<ih> c(awt $$0) {
         return ac.b(this.c, $$0);
      }
   }
}
