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

public enum iw implements azg {
   a(0, 1, -1, "down", iw.b.b, iw.a.b, new jv(0, -1, 0)),
   b(1, 0, -1, "up", iw.b.a, iw.a.b, new jv(0, 1, 0)),
   c(2, 3, 2, "north", iw.b.b, iw.a.c, new jv(0, 0, -1)),
   d(3, 2, 0, "south", iw.b.a, iw.a.c, new jv(0, 0, 1)),
   e(4, 5, 1, "west", iw.b.b, iw.a.a, new jv(-1, 0, 0)),
   f(5, 4, 3, "east", iw.b.a, iw.a.a, new jv(1, 0, 0));

   public static final azg.a<iw> g = azg.a(iw::values);
   public static final Codec<iw> h = axu.b(g, iw::a);
   public static final IntFunction<iw> i = axd.a(iw::d, values(), axd.a.b);
   public static final zc<ByteBuf, iw> j = za.a(i, iw::d);
   private final int k;
   private final int l;
   private final int m;
   private final String n;
   private final iw.a o;
   private final iw.b p;
   private final jv q;
   private static final iw[] r = values();
   private static final iw[] s = Arrays.stream(r).sorted(Comparator.comparingInt($$0 -> $$0.k)).toArray(iw[]::new);
   private static final iw[] t = Arrays.stream(r).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.m)).toArray(iw[]::new);

   private iw(int $$0, int $$1, int $$2, String $$3, iw.b $$4, iw.a $$5, jv $$6) {
      this.k = $$0;
      this.m = $$2;
      this.l = $$1;
      this.n = $$3;
      this.o = $$5;
      this.p = $$4;
      this.q = $$6;
   }

   public static iw[] a(brv $$0) {
      float $$1 = $$0.g(1.0F) * (float) (Math.PI / 180.0);
      float $$2 = -$$0.h(1.0F) * (float) (Math.PI / 180.0);
      float $$3 = aym.a($$1);
      float $$4 = aym.b($$1);
      float $$5 = aym.a($$2);
      float $$6 = aym.b($$2);
      boolean $$7 = $$5 > 0.0F;
      boolean $$8 = $$3 < 0.0F;
      boolean $$9 = $$6 > 0.0F;
      float $$10 = $$7 ? $$5 : -$$5;
      float $$11 = $$8 ? -$$3 : $$3;
      float $$12 = $$9 ? $$6 : -$$6;
      float $$13 = $$10 * $$4;
      float $$14 = $$12 * $$4;
      iw $$15 = $$7 ? f : e;
      iw $$16 = $$8 ? b : a;
      iw $$17 = $$9 ? d : c;
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

   private static iw[] a(iw $$0, iw $$1, iw $$2) {
      return new iw[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
   }

   public static iw a(Matrix4f $$0, iw $$1) {
      jv $$2 = $$1.q();
      Vector4f $$3 = $$0.transform(new Vector4f((float)$$2.u(), (float)$$2.v(), (float)$$2.w(), 0.0F));
      return a($$3.x(), $$3.y(), $$3.z());
   }

   public static Collection<iw> a(ayt $$0) {
      return ad.b(values(), $$0);
   }

   public static Stream<iw> a() {
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

   public iw.b f() {
      return this.p;
   }

   public static iw a(brv $$0, iw.a $$1) {
      return switch ($$1) {
         case a -> f.a($$0.h(1.0F)) ? f : e;
         case c -> d.a($$0.h(1.0F)) ? d : c;
         case b -> $$0.g(1.0F) < 0.0F ? b : a;
      };
   }

   public iw g() {
      return a(this.l);
   }

   public iw a(iw.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.r() : this;
         case c -> this != c && this != d ? this.t() : this;
         case b -> this != b && this != a ? this.h() : this;
      };
   }

   public iw b(iw.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.s() : this;
         case c -> this != c && this != d ? this.u() : this;
         case b -> this != b && this != a ? this.i() : this;
      };
   }

   public iw h() {
      return switch (this) {
         case c -> f;
         case d -> e;
         case e -> c;
         case f -> d;
         default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      };
   }

   private iw r() {
      return switch (this) {
         case a -> d;
         case b -> c;
         case c -> a;
         case d -> b;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private iw s() {
      return switch (this) {
         case a -> c;
         case b -> d;
         case c -> b;
         case d -> a;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private iw t() {
      return switch (this) {
         case a -> e;
         case b -> f;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> b;
         case f -> a;
      };
   }

   private iw u() {
      return switch (this) {
         case a -> f;
         case b -> e;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> a;
         case f -> b;
      };
   }

   public iw i() {
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

   public iw.a o() {
      return this.o;
   }

   @Nullable
   public static iw a(@Nullable String $$0) {
      return g.a($$0);
   }

   public static iw a(int $$0) {
      return s[aym.a($$0 % s.length)];
   }

   public static iw b(int $$0) {
      return t[aym.a($$0 % t.length)];
   }

   @Nullable
   public static iw a(int $$0, int $$1, int $$2) {
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

   public static iw a(double $$0) {
      return b(aym.a($$0 / 90.0 + 0.5) & 3);
   }

   public static iw a(iw.a $$0, iw.b $$1) {
      return switch ($$0) {
         case a -> $$1 == iw.b.a ? f : e;
         case c -> $$1 == iw.b.a ? d : c;
         case b -> $$1 == iw.b.a ? b : a;
      };
   }

   public float p() {
      return (float)((this.m & 3) * 90);
   }

   public static iw b(ayt $$0) {
      return ad.a(r, $$0);
   }

   public static iw a(double $$0, double $$1, double $$2) {
      return a((float)$$0, (float)$$1, (float)$$2);
   }

   public static iw a(float $$0, float $$1, float $$2) {
      iw $$3 = c;
      float $$4 = Float.MIN_VALUE;

      for (iw $$5 : r) {
         float $$6 = $$0 * (float)$$5.q.u() + $$1 * (float)$$5.q.v() + $$2 * (float)$$5.q.w();
         if ($$6 > $$4) {
            $$4 = $$6;
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static iw a(ewu $$0) {
      return a($$0.c, $$0.d, $$0.e);
   }

   @Override
   public String toString() {
      return this.n;
   }

   @Override
   public String c() {
      return this.n;
   }

   private static DataResult<iw> a(iw $$0) {
      return $$0.o().b() ? DataResult.success($$0) : DataResult.error(() -> "Expected a vertical direction");
   }

   public static iw a(iw.b $$0, iw.a $$1) {
      for (iw $$2 : r) {
         if ($$2.f() == $$0 && $$2.o() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("No such direction: " + $$0 + " " + $$1);
   }

   public jv q() {
      return this.q;
   }

   public boolean a(float $$0) {
      float $$1 = $$0 * (float) (Math.PI / 180.0);
      float $$2 = -aym.a($$1);
      float $$3 = aym.b($$1);
      return (float)this.q.u() * $$2 + (float)this.q.w() * $$3 > 0.0F;
   }

   public static enum a implements azg, Predicate<iw> {
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

      public static final iw.a[] d = values();
      public static final azg.a<iw.a> e = azg.a(iw.a::values);
      private final String f;

      a(String $$0) {
         this.f = $$0;
      }

      @Nullable
      public static iw.a a(String $$0) {
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

      public static iw.a a(ayt $$0) {
         return ad.a(d, $$0);
      }

      public boolean a(@Nullable iw $$0) {
         return $$0 != null && $$0.o() == this;
      }

      public iw.c e() {
         return switch (this) {
            case a, c -> iw.c.a;
            case b -> iw.c.b;
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

      public iw.b c() {
         return this == a ? b : a;
      }
   }

   public static enum c implements Iterable<iw>, Predicate<iw> {
      a(new iw[]{iw.c, iw.f, iw.d, iw.e}, new iw.a[]{iw.a.a, iw.a.c}),
      b(new iw[]{iw.b, iw.a}, new iw.a[]{iw.a.b});

      private final iw[] c;
      private final iw.a[] d;

      private c(iw[] $$0, iw.a[] $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public iw a(ayt $$0) {
         return ad.a(this.c, $$0);
      }

      public iw.a b(ayt $$0) {
         return ad.a(this.d, $$0);
      }

      public boolean a(@Nullable iw $$0) {
         return $$0 != null && $$0.o().e() == this;
      }

      @Override
      public Iterator<iw> iterator() {
         return Iterators.forArray(this.c);
      }

      public Stream<iw> a() {
         return Arrays.stream(this.c);
      }

      public List<iw> c(ayt $$0) {
         return ad.b(this.c, $$0);
      }

      public int b() {
         return this.c.length;
      }
   }
}
