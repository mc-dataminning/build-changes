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

public enum jl implements baf {
   a(0, 1, -1, "down", jl.b.b, jl.a.b, new kk(0, -1, 0)),
   b(1, 0, -1, "up", jl.b.a, jl.a.b, new kk(0, 1, 0)),
   c(2, 3, 2, "north", jl.b.b, jl.a.c, new kk(0, 0, -1)),
   d(3, 2, 0, "south", jl.b.a, jl.a.c, new kk(0, 0, 1)),
   e(4, 5, 1, "west", jl.b.b, jl.a.a, new kk(-1, 0, 0)),
   f(5, 4, 3, "east", jl.b.a, jl.a.a, new kk(1, 0, 0));

   public static final baf.a<jl> g = baf.a(jl::values);
   public static final Codec<jl> h = g.validate(jl::b);
   public static final IntFunction<jl> i = aya.a(jl::d, values(), aya.a.b);
   public static final zf<ByteBuf, jl> j = zd.a(i, jl::d);
   private final int k;
   private final int l;
   private final int m;
   private final String n;
   private final jl.a o;
   private final jl.b p;
   private final kk q;
   private final ezh r;
   private static final jl[] s = values();
   private static final jl[] t = Arrays.stream(s).sorted(Comparator.comparingInt($$0 -> $$0.k)).toArray(jl[]::new);
   private static final jl[] u = Arrays.stream(s).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.m)).toArray(jl[]::new);

   private jl(final int $$0, final int $$1, final int $$2, final String $$3, final jl.b $$4, final jl.a $$5, final kk $$6) {
      this.k = $$0;
      this.m = $$2;
      this.l = $$1;
      this.n = $$3;
      this.o = $$5;
      this.p = $$4;
      this.q = $$6;
      this.r = ezh.a($$6);
   }

   public static jl[] a(btz $$0) {
      float $$1 = $$0.h(1.0F) * (float) (Math.PI / 180.0);
      float $$2 = -$$0.i(1.0F) * (float) (Math.PI / 180.0);
      float $$3 = azj.a($$1);
      float $$4 = azj.b($$1);
      float $$5 = azj.a($$2);
      float $$6 = azj.b($$2);
      boolean $$7 = $$5 > 0.0F;
      boolean $$8 = $$3 < 0.0F;
      boolean $$9 = $$6 > 0.0F;
      float $$10 = $$7 ? $$5 : -$$5;
      float $$11 = $$8 ? -$$3 : $$3;
      float $$12 = $$9 ? $$6 : -$$6;
      float $$13 = $$10 * $$4;
      float $$14 = $$12 * $$4;
      jl $$15 = $$7 ? f : e;
      jl $$16 = $$8 ? b : a;
      jl $$17 = $$9 ? d : c;
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

   private static jl[] a(jl $$0, jl $$1, jl $$2) {
      return new jl[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
   }

   public static jl a(Matrix4f $$0, jl $$1) {
      kk $$2 = $$1.q();
      Vector4f $$3 = $$0.transform(new Vector4f((float)$$2.u(), (float)$$2.v(), (float)$$2.w(), 0.0F));
      return a($$3.x(), $$3.y(), $$3.z());
   }

   public static Collection<jl> a(azr $$0) {
      return ad.b(values(), $$0);
   }

   public static Stream<jl> a() {
      return Stream.of(s);
   }

   public static float a(jl $$0) {
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

   public jl.b f() {
      return this.p;
   }

   public static jl a(btz $$0, jl.a $$1) {
      return switch ($$1) {
         case a -> f.a($$0.i(1.0F)) ? f : e;
         case b -> $$0.h(1.0F) < 0.0F ? b : a;
         case c -> d.a($$0.i(1.0F)) ? d : c;
      };
   }

   public jl g() {
      return a(this.l);
   }

   public jl a(jl.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.s() : this;
         case b -> this != b && this != a ? this.h() : this;
         case c -> this != c && this != d ? this.u() : this;
      };
   }

   public jl b(jl.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.t() : this;
         case b -> this != b && this != a ? this.i() : this;
         case c -> this != c && this != d ? this.v() : this;
      };
   }

   public jl h() {
      return switch (this) {
         case c -> f;
         case d -> e;
         case e -> c;
         case f -> d;
         default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      };
   }

   private jl s() {
      return switch (this) {
         case a -> d;
         case b -> c;
         case c -> a;
         case d -> b;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private jl t() {
      return switch (this) {
         case a -> c;
         case b -> d;
         case c -> b;
         case d -> a;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private jl u() {
      return switch (this) {
         case a -> e;
         case b -> f;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> b;
         case f -> a;
      };
   }

   private jl v() {
      return switch (this) {
         case a -> f;
         case b -> e;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> a;
         case f -> b;
      };
   }

   public jl i() {
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

   public jl.a o() {
      return this.o;
   }

   @Nullable
   public static jl a(@Nullable String $$0) {
      return g.a($$0);
   }

   public static jl a(int $$0) {
      return t[azj.a($$0 % t.length)];
   }

   public static jl b(int $$0) {
      return u[azj.a($$0 % u.length)];
   }

   public static jl a(double $$0) {
      return b(azj.a($$0 / 90.0 + 0.5) & 3);
   }

   public static jl a(jl.a $$0, jl.b $$1) {
      return switch ($$0) {
         case a -> $$1 == jl.b.a ? f : e;
         case b -> $$1 == jl.b.a ? b : a;
         case c -> $$1 == jl.b.a ? d : c;
      };
   }

   public float p() {
      return (float)((this.m & 3) * 90);
   }

   public static jl b(azr $$0) {
      return ad.a(s, $$0);
   }

   public static jl a(double $$0, double $$1, double $$2) {
      return a((float)$$0, (float)$$1, (float)$$2);
   }

   public static jl a(float $$0, float $$1, float $$2) {
      jl $$3 = c;
      float $$4 = Float.MIN_VALUE;

      for (jl $$5 : s) {
         float $$6 = $$0 * (float)$$5.q.u() + $$1 * (float)$$5.q.v() + $$2 * (float)$$5.q.w();
         if ($$6 > $$4) {
            $$4 = $$6;
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static jl a(ezh $$0) {
      return a($$0.d, $$0.e, $$0.f);
   }

   @Nullable
   @Contract("_,_,_,!null->!null;_,_,_,_->_")
   public static jl a(int $$0, int $$1, int $$2, @Nullable jl $$3) {
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
   public static jl a(kk $$0, @Nullable jl $$1) {
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

   private static DataResult<jl> b(jl $$0) {
      return $$0.o().b() ? DataResult.success($$0) : DataResult.error(() -> "Expected a vertical direction");
   }

   public static jl a(jl.b $$0, jl.a $$1) {
      for (jl $$2 : s) {
         if ($$2.f() == $$0 && $$2.o() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("No such direction: " + $$0 + " " + $$1);
   }

   public kk q() {
      return this.q;
   }

   public ezh r() {
      return this.r;
   }

   public boolean a(float $$0) {
      float $$1 = $$0 * (float) (Math.PI / 180.0);
      float $$2 = -azj.a($$1);
      float $$3 = azj.b($$1);
      return (float)this.q.u() * $$2 + (float)this.q.w() * $$3 > 0.0F;
   }

   public static enum a implements baf, Predicate<jl> {
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

      public static final jl.a[] d = values();
      public static final baf.a<jl.a> e = baf.a(jl.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Nullable
      public static jl.a a(String $$0) {
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

      public static jl.a a(azr $$0) {
         return ad.a(d, $$0);
      }

      public boolean a(@Nullable jl $$0) {
         return $$0 != null && $$0.o() == this;
      }

      public jl.c e() {
         return switch (this) {
            case a, c -> jl.c.a;
            case b -> jl.c.b;
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

      public jl.b c() {
         return this == a ? b : a;
      }
   }

   public static enum c implements Iterable<jl>, Predicate<jl> {
      a(new jl[]{jl.c, jl.f, jl.d, jl.e}, new jl.a[]{jl.a.a, jl.a.c}),
      b(new jl[]{jl.b, jl.a}, new jl.a[]{jl.a.b});

      private final jl[] c;
      private final jl.a[] d;

      private c(final jl[] $$0, final jl.a[] $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public jl a(azr $$0) {
         return ad.a(this.c, $$0);
      }

      public jl.a b(azr $$0) {
         return ad.a(this.d, $$0);
      }

      public boolean a(@Nullable jl $$0) {
         return $$0 != null && $$0.o().e() == this;
      }

      @Override
      public Iterator<jl> iterator() {
         return Iterators.forArray(this.c);
      }

      public Stream<jl> a() {
         return Arrays.stream(this.c);
      }

      public List<jl> c(azr $$0) {
         return ad.b(this.c, $$0);
      }

      public int b() {
         return this.c.length;
      }
   }
}
