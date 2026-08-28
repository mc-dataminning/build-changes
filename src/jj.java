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

public enum jj implements azy {
   a(0, 1, -1, "down", jj.b.b, jj.a.b, new ki(0, -1, 0)),
   b(1, 0, -1, "up", jj.b.a, jj.a.b, new ki(0, 1, 0)),
   c(2, 3, 2, "north", jj.b.b, jj.a.c, new ki(0, 0, -1)),
   d(3, 2, 0, "south", jj.b.a, jj.a.c, new ki(0, 0, 1)),
   e(4, 5, 1, "west", jj.b.b, jj.a.a, new ki(-1, 0, 0)),
   f(5, 4, 3, "east", jj.b.a, jj.a.a, new ki(1, 0, 0));

   public static final azy.a<jj> g = azy.a(jj::values);
   public static final Codec<jj> h = g.validate(jj::b);
   public static final IntFunction<jj> i = axt.a(jj::d, values(), axt.a.b);
   public static final zb<ByteBuf, jj> j = yz.a(i, jj::d);
   private final int k;
   private final int l;
   private final int m;
   private final String n;
   private final jj.a o;
   private final jj.b p;
   private final ki q;
   private final eye r;
   private static final jj[] s = values();
   private static final jj[] t = Arrays.stream(s).sorted(Comparator.comparingInt($$0 -> $$0.k)).toArray(jj[]::new);
   private static final jj[] u = Arrays.stream(s).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.m)).toArray(jj[]::new);

   private jj(final int $$0, final int $$1, final int $$2, final String $$3, final jj.b $$4, final jj.a $$5, final ki $$6) {
      this.k = $$0;
      this.m = $$2;
      this.l = $$1;
      this.n = $$3;
      this.o = $$5;
      this.p = $$4;
      this.q = $$6;
      this.r = eye.a($$6);
   }

   public static jj[] a(btj $$0) {
      float $$1 = $$0.h(1.0F) * (float) (Math.PI / 180.0);
      float $$2 = -$$0.i(1.0F) * (float) (Math.PI / 180.0);
      float $$3 = azc.a($$1);
      float $$4 = azc.b($$1);
      float $$5 = azc.a($$2);
      float $$6 = azc.b($$2);
      boolean $$7 = $$5 > 0.0F;
      boolean $$8 = $$3 < 0.0F;
      boolean $$9 = $$6 > 0.0F;
      float $$10 = $$7 ? $$5 : -$$5;
      float $$11 = $$8 ? -$$3 : $$3;
      float $$12 = $$9 ? $$6 : -$$6;
      float $$13 = $$10 * $$4;
      float $$14 = $$12 * $$4;
      jj $$15 = $$7 ? f : e;
      jj $$16 = $$8 ? b : a;
      jj $$17 = $$9 ? d : c;
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

   private static jj[] a(jj $$0, jj $$1, jj $$2) {
      return new jj[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
   }

   public static jj a(Matrix4f $$0, jj $$1) {
      ki $$2 = $$1.q();
      Vector4f $$3 = $$0.transform(new Vector4f((float)$$2.u(), (float)$$2.v(), (float)$$2.w(), 0.0F));
      return a($$3.x(), $$3.y(), $$3.z());
   }

   public static Collection<jj> a(azk $$0) {
      return ad.b(values(), $$0);
   }

   public static Stream<jj> a() {
      return Stream.of(s);
   }

   public static float a(jj $$0) {
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

   public jj.b f() {
      return this.p;
   }

   public static jj a(btj $$0, jj.a $$1) {
      return switch ($$1) {
         case a -> f.a($$0.i(1.0F)) ? f : e;
         case b -> $$0.h(1.0F) < 0.0F ? b : a;
         case c -> d.a($$0.i(1.0F)) ? d : c;
      };
   }

   public jj g() {
      return a(this.l);
   }

   public jj a(jj.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.s() : this;
         case b -> this != b && this != a ? this.h() : this;
         case c -> this != c && this != d ? this.u() : this;
      };
   }

   public jj b(jj.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.t() : this;
         case b -> this != b && this != a ? this.i() : this;
         case c -> this != c && this != d ? this.v() : this;
      };
   }

   public jj h() {
      return switch (this) {
         case c -> f;
         case d -> e;
         case e -> c;
         case f -> d;
         default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      };
   }

   private jj s() {
      return switch (this) {
         case a -> d;
         case b -> c;
         case c -> a;
         case d -> b;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private jj t() {
      return switch (this) {
         case a -> c;
         case b -> d;
         case c -> b;
         case d -> a;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private jj u() {
      return switch (this) {
         case a -> e;
         case b -> f;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> b;
         case f -> a;
      };
   }

   private jj v() {
      return switch (this) {
         case a -> f;
         case b -> e;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> a;
         case f -> b;
      };
   }

   public jj i() {
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

   public jj.a o() {
      return this.o;
   }

   @Nullable
   public static jj a(@Nullable String $$0) {
      return g.a($$0);
   }

   public static jj a(int $$0) {
      return t[azc.a($$0 % t.length)];
   }

   public static jj b(int $$0) {
      return u[azc.a($$0 % u.length)];
   }

   public static jj a(double $$0) {
      return b(azc.a($$0 / 90.0 + 0.5) & 3);
   }

   public static jj a(jj.a $$0, jj.b $$1) {
      return switch ($$0) {
         case a -> $$1 == jj.b.a ? f : e;
         case b -> $$1 == jj.b.a ? b : a;
         case c -> $$1 == jj.b.a ? d : c;
      };
   }

   public float p() {
      return (float)((this.m & 3) * 90);
   }

   public static jj b(azk $$0) {
      return ad.a(s, $$0);
   }

   public static jj a(double $$0, double $$1, double $$2) {
      return a((float)$$0, (float)$$1, (float)$$2);
   }

   public static jj a(float $$0, float $$1, float $$2) {
      jj $$3 = c;
      float $$4 = Float.MIN_VALUE;

      for (jj $$5 : s) {
         float $$6 = $$0 * (float)$$5.q.u() + $$1 * (float)$$5.q.v() + $$2 * (float)$$5.q.w();
         if ($$6 > $$4) {
            $$4 = $$6;
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static jj a(eye $$0) {
      return a($$0.d, $$0.e, $$0.f);
   }

   @Nullable
   @Contract("_,_,_,!null->!null;_,_,_,_->_")
   public static jj a(int $$0, int $$1, int $$2, @Nullable jj $$3) {
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
   public static jj a(ki $$0, @Nullable jj $$1) {
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

   private static DataResult<jj> b(jj $$0) {
      return $$0.o().b() ? DataResult.success($$0) : DataResult.error(() -> "Expected a vertical direction");
   }

   public static jj a(jj.b $$0, jj.a $$1) {
      for (jj $$2 : s) {
         if ($$2.f() == $$0 && $$2.o() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("No such direction: " + $$0 + " " + $$1);
   }

   public ki q() {
      return this.q;
   }

   public eye r() {
      return this.r;
   }

   public boolean a(float $$0) {
      float $$1 = $$0 * (float) (Math.PI / 180.0);
      float $$2 = -azc.a($$1);
      float $$3 = azc.b($$1);
      return (float)this.q.u() * $$2 + (float)this.q.w() * $$3 > 0.0F;
   }

   public static enum a implements azy, Predicate<jj> {
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

      public static final jj.a[] d = values();
      public static final azy.a<jj.a> e = azy.a(jj.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Nullable
      public static jj.a a(String $$0) {
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

      public static jj.a a(azk $$0) {
         return ad.a(d, $$0);
      }

      public boolean a(@Nullable jj $$0) {
         return $$0 != null && $$0.o() == this;
      }

      public jj.c e() {
         return switch (this) {
            case a, c -> jj.c.a;
            case b -> jj.c.b;
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

      public jj.b c() {
         return this == a ? b : a;
      }
   }

   public static enum c implements Iterable<jj>, Predicate<jj> {
      a(new jj[]{jj.c, jj.f, jj.d, jj.e}, new jj.a[]{jj.a.a, jj.a.c}),
      b(new jj[]{jj.b, jj.a}, new jj.a[]{jj.a.b});

      private final jj[] c;
      private final jj.a[] d;

      private c(final jj[] $$0, final jj.a[] $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public jj a(azk $$0) {
         return ad.a(this.c, $$0);
      }

      public jj.a b(azk $$0) {
         return ad.a(this.d, $$0);
      }

      public boolean a(@Nullable jj $$0) {
         return $$0 != null && $$0.o().e() == this;
      }

      @Override
      public Iterator<jj> iterator() {
         return Iterators.forArray(this.c);
      }

      public Stream<jj> a() {
         return Arrays.stream(this.c);
      }

      public List<jj> c(azk $$0) {
         return ad.b(this.c, $$0);
      }

      public int b() {
         return this.c.length;
      }
   }
}
