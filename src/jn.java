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
import org.jetbrains.annotations.Contract;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector4f;

public enum jn implements azv {
   a(0, 1, -1, "down", jn.b.b, jn.a.b, new km(0, -1, 0)),
   b(1, 0, -1, "up", jn.b.a, jn.a.b, new km(0, 1, 0)),
   c(2, 3, 2, "north", jn.b.b, jn.a.c, new km(0, 0, -1)),
   d(3, 2, 0, "south", jn.b.a, jn.a.c, new km(0, 0, 1)),
   e(4, 5, 1, "west", jn.b.b, jn.a.a, new km(-1, 0, 0)),
   f(5, 4, 3, "east", jn.b.a, jn.a.a, new km(1, 0, 0));

   public static final azv.a<jn> g = azv.a(jn::values);
   public static final Codec<jn> h = g.validate(jn::b);
   public static final IntFunction<jn> i = axq.a(jn::d, values(), axq.a.b);
   public static final yn<ByteBuf, jn> j = yl.a(i, jn::d);
   private final int k;
   private final int l;
   private final int m;
   private final String n;
   private final jn.a o;
   private final jn.b p;
   private final km q;
   private final faz r;
   private static final jn[] s = values();
   private static final jn[] t = Arrays.stream(s).sorted(Comparator.comparingInt($$0 -> $$0.k)).toArray(jn[]::new);
   private static final jn[] u = Arrays.stream(s).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.m)).toArray(jn[]::new);

   private jn(final int $$0, final int $$1, final int $$2, final String $$3, final jn.b $$4, final jn.a $$5, final km $$6) {
      this.k = $$0;
      this.m = $$2;
      this.l = $$1;
      this.n = $$3;
      this.o = $$5;
      this.p = $$4;
      this.q = $$6;
      this.r = faz.a($$6);
   }

   public static jn[] a(buk $$0) {
      float $$1 = $$0.h(1.0F) * (float) (Math.PI / 180.0);
      float $$2 = -$$0.i(1.0F) * (float) (Math.PI / 180.0);
      float $$3 = ayz.a($$1);
      float $$4 = ayz.b($$1);
      float $$5 = ayz.a($$2);
      float $$6 = ayz.b($$2);
      boolean $$7 = $$5 > 0.0F;
      boolean $$8 = $$3 < 0.0F;
      boolean $$9 = $$6 > 0.0F;
      float $$10 = $$7 ? $$5 : -$$5;
      float $$11 = $$8 ? -$$3 : $$3;
      float $$12 = $$9 ? $$6 : -$$6;
      float $$13 = $$10 * $$4;
      float $$14 = $$12 * $$4;
      jn $$15 = $$7 ? f : e;
      jn $$16 = $$8 ? b : a;
      jn $$17 = $$9 ? d : c;
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

   private static jn[] a(jn $$0, jn $$1, jn $$2) {
      return new jn[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
   }

   public static jn a(Matrix4f $$0, jn $$1) {
      km $$2 = $$1.q();
      Vector4f $$3 = $$0.transform(new Vector4f((float)$$2.u(), (float)$$2.v(), (float)$$2.w(), 0.0F));
      return a($$3.x(), $$3.y(), $$3.z());
   }

   public static Collection<jn> a(azh $$0) {
      return af.b(values(), $$0);
   }

   public static Stream<jn> a() {
      return Stream.of(s);
   }

   public static float a(jn $$0) {
      return switch ($$0) {
         case c -> 180.0F;
         case d -> 0.0F;
         case e -> 90.0F;
         case f -> -90.0F;
         default -> throw new IllegalStateException("No y-Rot for vertical axis: " + $$0);
      };
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

   public jn.b f() {
      return this.p;
   }

   public static jn a(buk $$0, jn.a $$1) {
      return switch ($$1) {
         case a -> f.a($$0.i(1.0F)) ? f : e;
         case b -> $$0.h(1.0F) < 0.0F ? b : a;
         case c -> d.a($$0.i(1.0F)) ? d : c;
      };
   }

   public jn g() {
      return a(this.l);
   }

   public jn a(jn.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.s() : this;
         case b -> this != b && this != a ? this.h() : this;
         case c -> this != c && this != d ? this.u() : this;
      };
   }

   public jn b(jn.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.t() : this;
         case b -> this != b && this != a ? this.i() : this;
         case c -> this != c && this != d ? this.v() : this;
      };
   }

   public jn h() {
      return switch (this) {
         case c -> f;
         case d -> e;
         case e -> c;
         case f -> d;
         default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      };
   }

   private jn s() {
      return switch (this) {
         case a -> d;
         case b -> c;
         case c -> a;
         case d -> b;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private jn t() {
      return switch (this) {
         case a -> c;
         case b -> d;
         case c -> b;
         case d -> a;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private jn u() {
      return switch (this) {
         case a -> e;
         case b -> f;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> b;
         case f -> a;
      };
   }

   private jn v() {
      return switch (this) {
         case a -> f;
         case b -> e;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> a;
         case f -> b;
      };
   }

   public jn i() {
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

   public jn.a o() {
      return this.o;
   }

   @Nullable
   public static jn a(@Nullable String $$0) {
      return g.a($$0);
   }

   public static jn a(int $$0) {
      return t[ayz.a($$0 % t.length)];
   }

   public static jn b(int $$0) {
      return u[ayz.a($$0 % u.length)];
   }

   public static jn a(double $$0) {
      return b(ayz.a($$0 / 90.0 + 0.5) & 3);
   }

   public static jn a(jn.a $$0, jn.b $$1) {
      return switch ($$0) {
         case a -> $$1 == jn.b.a ? f : e;
         case b -> $$1 == jn.b.a ? b : a;
         case c -> $$1 == jn.b.a ? d : c;
      };
   }

   public float p() {
      return (float)((this.m & 3) * 90);
   }

   public static jn b(azh $$0) {
      return af.a(s, $$0);
   }

   public static jn a(double $$0, double $$1, double $$2) {
      return a((float)$$0, (float)$$1, (float)$$2);
   }

   public static jn a(float $$0, float $$1, float $$2) {
      jn $$3 = c;
      float $$4 = Float.MIN_VALUE;

      for (jn $$5 : s) {
         float $$6 = $$0 * (float)$$5.q.u() + $$1 * (float)$$5.q.v() + $$2 * (float)$$5.q.w();
         if ($$6 > $$4) {
            $$4 = $$6;
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static jn a(faz $$0) {
      return a($$0.d, $$0.e, $$0.f);
   }

   @Nullable
   @Contract("_,_,_,!null->!null;_,_,_,_->_")
   public static jn a(int $$0, int $$1, int $$2, @Nullable jn $$3) {
      int $$4 = Math.abs($$0);
      int $$5 = Math.abs($$1);
      int $$6 = Math.abs($$2);
      if ($$4 > $$6 && $$4 > $$5) {
         return $$0 < 0 ? e : f;
      } else if ($$6 > $$4 && $$6 > $$5) {
         return $$2 < 0 ? c : d;
      } else if ($$5 > $$4 && $$5 > $$6) {
         return $$1 < 0 ? a : b;
      } else {
         return $$3;
      }
   }

   @Nullable
   @Contract("_,!null->!null;_,_->_")
   public static jn a(km $$0, @Nullable jn $$1) {
      return a($$0.u(), $$0.v(), $$0.w(), $$1);
   }

   @Override
   public String toString() {
      return this.n;
   }

   @Override
   public String c() {
      return this.n;
   }

   private static DataResult<jn> b(jn $$0) {
      return $$0.o().b() ? DataResult.success($$0) : DataResult.error(() -> "Expected a vertical direction");
   }

   public static jn a(jn.b $$0, jn.a $$1) {
      for (jn $$2 : s) {
         if ($$2.f() == $$0 && $$2.o() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("No such direction: " + $$0 + " " + $$1);
   }

   public km q() {
      return this.q;
   }

   public faz r() {
      return this.r;
   }

   public boolean a(float $$0) {
      float $$1 = $$0 * (float) (Math.PI / 180.0);
      float $$2 = -ayz.a($$1);
      float $$3 = ayz.b($$1);
      return (float)this.q.u() * $$2 + (float)this.q.w() * $$3 > 0.0F;
   }

   public static enum a implements azv, Predicate<jn> {
      a("x") {
         @Override
         public int a(int $$0, int $$1, int $$2) {
            return $$0;
         }

         @Override
         public double a(double $$0, double $$1, double $$2) {
            return $$0;
         }

         @Override
         public jn e() {
            return jn.f;
         }

         @Override
         public jn f() {
            return jn.e;
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

         @Override
         public jn e() {
            return jn.b;
         }

         @Override
         public jn f() {
            return jn.a;
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

         @Override
         public jn e() {
            return jn.d;
         }

         @Override
         public jn f() {
            return jn.c;
         }
      };

      public static final jn.a[] d = values();
      public static final azv.a<jn.a> e = azv.a(jn.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Nullable
      public static jn.a a(String $$0) {
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

      public abstract jn e();

      public abstract jn f();

      public jn[] g() {
         return new jn[]{this.e(), this.f()};
      }

      @Override
      public String toString() {
         return this.f;
      }

      public static jn.a a(azh $$0) {
         return af.a(d, $$0);
      }

      public boolean a(@Nullable jn $$0) {
         return $$0 != null && $$0.o() == this;
      }

      public jn.c h() {
         return switch (this) {
            case a, c -> jn.c.a;
            case b -> jn.c.b;
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

      private b(final int $$0, final String $$1) {
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

      public jn.b c() {
         return this == a ? b : a;
      }
   }

   public static enum c implements Iterable<jn>, Predicate<jn> {
      a(new jn[]{jn.c, jn.f, jn.d, jn.e}, new jn.a[]{jn.a.a, jn.a.c}),
      b(new jn[]{jn.b, jn.a}, new jn.a[]{jn.a.b});

      private final jn[] c;
      private final jn.a[] d;

      private c(final jn[] $$0, final jn.a[] $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public jn a(azh $$0) {
         return af.a(this.c, $$0);
      }

      public jn.a b(azh $$0) {
         return af.a(this.d, $$0);
      }

      public boolean a(@Nullable jn $$0) {
         return $$0 != null && $$0.o().h() == this;
      }

      @Override
      public Iterator<jn> iterator() {
         return Iterators.forArray(this.c);
      }

      public Stream<jn> a() {
         return Arrays.stream(this.c);
      }

      public List<jn> c(azh $$0) {
         return af.b(this.c, $$0);
      }

      public int b() {
         return this.c.length;
      }
   }
}
