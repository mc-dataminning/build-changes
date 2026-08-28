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

public enum jk implements bab {
   a(0, 1, -1, "down", jk.b.b, jk.a.b, new kj(0, -1, 0)),
   b(1, 0, -1, "up", jk.b.a, jk.a.b, new kj(0, 1, 0)),
   c(2, 3, 2, "north", jk.b.b, jk.a.c, new kj(0, 0, -1)),
   d(3, 2, 0, "south", jk.b.a, jk.a.c, new kj(0, 0, 1)),
   e(4, 5, 1, "west", jk.b.b, jk.a.a, new kj(-1, 0, 0)),
   f(5, 4, 3, "east", jk.b.a, jk.a.a, new kj(1, 0, 0));

   public static final bab.a<jk> g = bab.a(jk::values);
   public static final Codec<jk> h = g.validate(jk::b);
   public static final IntFunction<jk> i = axw.a(jk::d, values(), axw.a.b);
   public static final zc<ByteBuf, jk> j = za.a(i, jk::d);
   private final int k;
   private final int l;
   private final int m;
   private final String n;
   private final jk.a o;
   private final jk.b p;
   private final kj q;
   private final eyw r;
   private static final jk[] s = values();
   private static final jk[] t = Arrays.stream(s).sorted(Comparator.comparingInt($$0 -> $$0.k)).toArray(jk[]::new);
   private static final jk[] u = Arrays.stream(s).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.m)).toArray(jk[]::new);

   private jk(final int $$0, final int $$1, final int $$2, final String $$3, final jk.b $$4, final jk.a $$5, final kj $$6) {
      this.k = $$0;
      this.m = $$2;
      this.l = $$1;
      this.n = $$3;
      this.o = $$5;
      this.p = $$4;
      this.q = $$6;
      this.r = eyw.a($$6);
   }

   public static jk[] a(btr $$0) {
      float $$1 = $$0.h(1.0F) * (float) (Math.PI / 180.0);
      float $$2 = -$$0.i(1.0F) * (float) (Math.PI / 180.0);
      float $$3 = azf.a($$1);
      float $$4 = azf.b($$1);
      float $$5 = azf.a($$2);
      float $$6 = azf.b($$2);
      boolean $$7 = $$5 > 0.0F;
      boolean $$8 = $$3 < 0.0F;
      boolean $$9 = $$6 > 0.0F;
      float $$10 = $$7 ? $$5 : -$$5;
      float $$11 = $$8 ? -$$3 : $$3;
      float $$12 = $$9 ? $$6 : -$$6;
      float $$13 = $$10 * $$4;
      float $$14 = $$12 * $$4;
      jk $$15 = $$7 ? f : e;
      jk $$16 = $$8 ? b : a;
      jk $$17 = $$9 ? d : c;
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

   private static jk[] a(jk $$0, jk $$1, jk $$2) {
      return new jk[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
   }

   public static jk a(Matrix4f $$0, jk $$1) {
      kj $$2 = $$1.q();
      Vector4f $$3 = $$0.transform(new Vector4f((float)$$2.u(), (float)$$2.v(), (float)$$2.w(), 0.0F));
      return a($$3.x(), $$3.y(), $$3.z());
   }

   public static Collection<jk> a(azn $$0) {
      return ad.b(values(), $$0);
   }

   public static Stream<jk> a() {
      return Stream.of(s);
   }

   public static float a(jk $$0) {
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

   public jk.b f() {
      return this.p;
   }

   public static jk a(btr $$0, jk.a $$1) {
      return switch ($$1) {
         case a -> f.a($$0.i(1.0F)) ? f : e;
         case b -> $$0.h(1.0F) < 0.0F ? b : a;
         case c -> d.a($$0.i(1.0F)) ? d : c;
      };
   }

   public jk g() {
      return a(this.l);
   }

   public jk a(jk.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.s() : this;
         case b -> this != b && this != a ? this.h() : this;
         case c -> this != c && this != d ? this.u() : this;
      };
   }

   public jk b(jk.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.t() : this;
         case b -> this != b && this != a ? this.i() : this;
         case c -> this != c && this != d ? this.v() : this;
      };
   }

   public jk h() {
      return switch (this) {
         case c -> f;
         case d -> e;
         case e -> c;
         case f -> d;
         default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      };
   }

   private jk s() {
      return switch (this) {
         case a -> d;
         case b -> c;
         case c -> a;
         case d -> b;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private jk t() {
      return switch (this) {
         case a -> c;
         case b -> d;
         case c -> b;
         case d -> a;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private jk u() {
      return switch (this) {
         case a -> e;
         case b -> f;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> b;
         case f -> a;
      };
   }

   private jk v() {
      return switch (this) {
         case a -> f;
         case b -> e;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> a;
         case f -> b;
      };
   }

   public jk i() {
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

   public jk.a o() {
      return this.o;
   }

   @Nullable
   public static jk a(@Nullable String $$0) {
      return g.a($$0);
   }

   public static jk a(int $$0) {
      return t[azf.a($$0 % t.length)];
   }

   public static jk b(int $$0) {
      return u[azf.a($$0 % u.length)];
   }

   public static jk a(double $$0) {
      return b(azf.a($$0 / 90.0 + 0.5) & 3);
   }

   public static jk a(jk.a $$0, jk.b $$1) {
      return switch ($$0) {
         case a -> $$1 == jk.b.a ? f : e;
         case b -> $$1 == jk.b.a ? b : a;
         case c -> $$1 == jk.b.a ? d : c;
      };
   }

   public float p() {
      return (float)((this.m & 3) * 90);
   }

   public static jk b(azn $$0) {
      return ad.a(s, $$0);
   }

   public static jk a(double $$0, double $$1, double $$2) {
      return a((float)$$0, (float)$$1, (float)$$2);
   }

   public static jk a(float $$0, float $$1, float $$2) {
      jk $$3 = c;
      float $$4 = Float.MIN_VALUE;

      for (jk $$5 : s) {
         float $$6 = $$0 * (float)$$5.q.u() + $$1 * (float)$$5.q.v() + $$2 * (float)$$5.q.w();
         if ($$6 > $$4) {
            $$4 = $$6;
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static jk a(eyw $$0) {
      return a($$0.d, $$0.e, $$0.f);
   }

   @Nullable
   @Contract("_,_,_,!null->!null;_,_,_,_->_")
   public static jk a(int $$0, int $$1, int $$2, @Nullable jk $$3) {
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
   public static jk a(kj $$0, @Nullable jk $$1) {
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

   private static DataResult<jk> b(jk $$0) {
      return $$0.o().b() ? DataResult.success($$0) : DataResult.error(() -> "Expected a vertical direction");
   }

   public static jk a(jk.b $$0, jk.a $$1) {
      for (jk $$2 : s) {
         if ($$2.f() == $$0 && $$2.o() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("No such direction: " + $$0 + " " + $$1);
   }

   public kj q() {
      return this.q;
   }

   public eyw r() {
      return this.r;
   }

   public boolean a(float $$0) {
      float $$1 = $$0 * (float) (Math.PI / 180.0);
      float $$2 = -azf.a($$1);
      float $$3 = azf.b($$1);
      return (float)this.q.u() * $$2 + (float)this.q.w() * $$3 > 0.0F;
   }

   public static enum a implements bab, Predicate<jk> {
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

      public static final jk.a[] d = values();
      public static final bab.a<jk.a> e = bab.a(jk.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Nullable
      public static jk.a a(String $$0) {
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

      public static jk.a a(azn $$0) {
         return ad.a(d, $$0);
      }

      public boolean a(@Nullable jk $$0) {
         return $$0 != null && $$0.o() == this;
      }

      public jk.c e() {
         return switch (this) {
            case a, c -> jk.c.a;
            case b -> jk.c.b;
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

      public jk.b c() {
         return this == a ? b : a;
      }
   }

   public static enum c implements Iterable<jk>, Predicate<jk> {
      a(new jk[]{jk.c, jk.f, jk.d, jk.e}, new jk.a[]{jk.a.a, jk.a.c}),
      b(new jk[]{jk.b, jk.a}, new jk.a[]{jk.a.b});

      private final jk[] c;
      private final jk.a[] d;

      private c(final jk[] $$0, final jk.a[] $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public jk a(azn $$0) {
         return ad.a(this.c, $$0);
      }

      public jk.a b(azn $$0) {
         return ad.a(this.d, $$0);
      }

      public boolean a(@Nullable jk $$0) {
         return $$0 != null && $$0.o().e() == this;
      }

      @Override
      public Iterator<jk> iterator() {
         return Iterators.forArray(this.c);
      }

      public Stream<jk> a() {
         return Arrays.stream(this.c);
      }

      public List<jk> c(azn $$0) {
         return ad.b(this.c, $$0);
      }

      public int b() {
         return this.c.length;
      }
   }
}
