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
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public enum jb implements bam {
   a(0, 1, -1, "down", jb.b.b, jb.a.b, new ka(0, -1, 0)),
   b(1, 0, -1, "up", jb.b.a, jb.a.b, new ka(0, 1, 0)),
   c(2, 3, 2, "north", jb.b.b, jb.a.c, new ka(0, 0, -1)),
   d(3, 2, 0, "south", jb.b.a, jb.a.c, new ka(0, 0, 1)),
   e(4, 5, 1, "west", jb.b.b, jb.a.a, new ka(-1, 0, 0)),
   f(5, 4, 3, "east", jb.b.a, jb.a.a, new ka(1, 0, 0));

   public static final bam.a<jb> g = bam.a(jb::values);
   public static final Codec<jb> h = g.validate(jb::b);
   public static final IntFunction<jb> i = aye.a(jb::d, values(), aye.a.b);
   public static final yy<ByteBuf, jb> j = yw.a(i, jb::d);
   @Deprecated
   public static final Codec<jb> k = Codec.BYTE.xmap(jb::a, $$0 -> (byte)$$0.d());
   @Deprecated
   public static final Codec<jb> l = Codec.BYTE.xmap(jb::b, $$0 -> (byte)$$0.e());
   private final int m;
   private final int n;
   private final int o;
   private final String p;
   private final jb.a q;
   private final jb.b r;
   private final ka s;
   private final ffq t;
   private final Vector3fc u;
   private static final jb[] v = values();
   private static final jb[] w = Arrays.stream(v).sorted(Comparator.comparingInt($$0 -> $$0.m)).toArray(jb[]::new);
   private static final jb[] x = Arrays.stream(v).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.o)).toArray(jb[]::new);

   private jb(final int $$0, final int $$1, final int $$2, final String $$3, final jb.b $$4, final jb.a $$5, final ka $$6) {
      this.m = $$0;
      this.o = $$2;
      this.n = $$1;
      this.p = $$3;
      this.q = $$5;
      this.r = $$4;
      this.s = $$6;
      this.t = ffq.a($$6);
      this.u = new Vector3f((float)$$6.u(), (float)$$6.v(), (float)$$6.w());
   }

   public static jb[] a(bwt $$0) {
      float $$1 = $$0.i(1.0F) * (float) (Math.PI / 180.0);
      float $$2 = -$$0.j(1.0F) * (float) (Math.PI / 180.0);
      float $$3 = azo.a($$1);
      float $$4 = azo.b($$1);
      float $$5 = azo.a($$2);
      float $$6 = azo.b($$2);
      boolean $$7 = $$5 > 0.0F;
      boolean $$8 = $$3 < 0.0F;
      boolean $$9 = $$6 > 0.0F;
      float $$10 = $$7 ? $$5 : -$$5;
      float $$11 = $$8 ? -$$3 : $$3;
      float $$12 = $$9 ? $$6 : -$$6;
      float $$13 = $$10 * $$4;
      float $$14 = $$12 * $$4;
      jb $$15 = $$7 ? f : e;
      jb $$16 = $$8 ? b : a;
      jb $$17 = $$9 ? d : c;
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

   private static jb[] a(jb $$0, jb $$1, jb $$2) {
      return new jb[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
   }

   public static jb a(Matrix4fc $$0, jb $$1) {
      Vector3f $$2 = $$0.transformDirection($$1.u, new Vector3f());
      return a($$2.x(), $$2.y(), $$2.z());
   }

   public static Collection<jb> a(azx $$0) {
      return ag.b(values(), $$0);
   }

   public static Stream<jb> a() {
      return Stream.of(v);
   }

   public static float a(jb $$0) {
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
      return this.m;
   }

   public int e() {
      return this.o;
   }

   public jb.b f() {
      return this.r;
   }

   public static jb a(bwt $$0, jb.a $$1) {
      return switch ($$1) {
         case a -> f.a($$0.j(1.0F)) ? f : e;
         case b -> $$0.i(1.0F) < 0.0F ? b : a;
         case c -> d.a($$0.j(1.0F)) ? d : c;
      };
   }

   public jb g() {
      return a(this.n);
   }

   public jb a(jb.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.t() : this;
         case b -> this != b && this != a ? this.h() : this;
         case c -> this != c && this != d ? this.v() : this;
      };
   }

   public jb b(jb.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.u() : this;
         case b -> this != b && this != a ? this.i() : this;
         case c -> this != c && this != d ? this.w() : this;
      };
   }

   public jb h() {
      return switch (this) {
         case c -> f;
         case d -> e;
         case e -> c;
         case f -> d;
         default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      };
   }

   private jb t() {
      return switch (this) {
         case a -> d;
         case b -> c;
         case c -> a;
         case d -> b;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private jb u() {
      return switch (this) {
         case a -> c;
         case b -> d;
         case c -> b;
         case d -> a;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private jb v() {
      return switch (this) {
         case a -> e;
         case b -> f;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> b;
         case f -> a;
      };
   }

   private jb w() {
      return switch (this) {
         case a -> f;
         case b -> e;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> a;
         case f -> b;
      };
   }

   public jb i() {
      return switch (this) {
         case c -> e;
         case d -> f;
         case e -> d;
         case f -> c;
         default -> throw new IllegalStateException("Unable to get CCW facing of " + this);
      };
   }

   public int j() {
      return this.s.u();
   }

   public int k() {
      return this.s.v();
   }

   public int l() {
      return this.s.w();
   }

   public Vector3f m() {
      return new Vector3f(this.u);
   }

   public String n() {
      return this.p;
   }

   public jb.a o() {
      return this.q;
   }

   @Nullable
   public static jb a(@Nullable String $$0) {
      return g.a($$0);
   }

   public static jb a(int $$0) {
      return w[azo.a($$0 % w.length)];
   }

   public static jb b(int $$0) {
      return x[azo.a($$0 % x.length)];
   }

   public static jb a(double $$0) {
      return b(azo.a($$0 / 90.0 + 0.5) & 3);
   }

   public static jb a(jb.a $$0, jb.b $$1) {
      return switch ($$0) {
         case a -> $$1 == jb.b.a ? f : e;
         case b -> $$1 == jb.b.a ? b : a;
         case c -> $$1 == jb.b.a ? d : c;
      };
   }

   public float p() {
      return (float)((this.o & 3) * 90);
   }

   public static jb b(azx $$0) {
      return ag.a(v, $$0);
   }

   public static jb a(double $$0, double $$1, double $$2) {
      return a((float)$$0, (float)$$1, (float)$$2);
   }

   public static jb a(float $$0, float $$1, float $$2) {
      jb $$3 = c;
      float $$4 = Float.MIN_VALUE;

      for (jb $$5 : v) {
         float $$6 = $$0 * (float)$$5.s.u() + $$1 * (float)$$5.s.v() + $$2 * (float)$$5.s.w();
         if ($$6 > $$4) {
            $$4 = $$6;
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static jb a(ffq $$0) {
      return a($$0.d, $$0.e, $$0.f);
   }

   @Nullable
   @Contract("_,_,_,!null->!null;_,_,_,_->_")
   public static jb a(int $$0, int $$1, int $$2, @Nullable jb $$3) {
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
   public static jb a(ka $$0, @Nullable jb $$1) {
      return a($$0.u(), $$0.v(), $$0.w(), $$1);
   }

   @Override
   public String toString() {
      return this.p;
   }

   @Override
   public String c() {
      return this.p;
   }

   private static DataResult<jb> b(jb $$0) {
      return $$0.o().b() ? DataResult.success($$0) : DataResult.error(() -> "Expected a vertical direction");
   }

   public static jb a(jb.b $$0, jb.a $$1) {
      for (jb $$2 : v) {
         if ($$2.f() == $$0 && $$2.o() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("No such direction: " + $$0 + " " + $$1);
   }

   public ka q() {
      return this.s;
   }

   public ffq r() {
      return this.t;
   }

   public Vector3fc s() {
      return this.u;
   }

   public boolean a(float $$0) {
      float $$1 = $$0 * (float) (Math.PI / 180.0);
      float $$2 = -azo.a($$1);
      float $$3 = azo.b($$1);
      return (float)this.s.u() * $$2 + (float)this.s.w() * $$3 > 0.0F;
   }

   public static enum a implements bam, Predicate<jb> {
      a("x") {
         @Override
         public int a(int $$0, int $$1, int $$2) {
            return $$0;
         }

         @Override
         public boolean a(boolean $$0, boolean $$1, boolean $$2) {
            return $$0;
         }

         @Override
         public double a(double $$0, double $$1, double $$2) {
            return $$0;
         }

         @Override
         public jb e() {
            return jb.f;
         }

         @Override
         public jb f() {
            return jb.e;
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
         public boolean a(boolean $$0, boolean $$1, boolean $$2) {
            return $$1;
         }

         @Override
         public jb e() {
            return jb.b;
         }

         @Override
         public jb f() {
            return jb.a;
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
         public boolean a(boolean $$0, boolean $$1, boolean $$2) {
            return $$2;
         }

         @Override
         public jb e() {
            return jb.d;
         }

         @Override
         public jb f() {
            return jb.c;
         }
      };

      public static final jb.a[] d = values();
      public static final bam.a<jb.a> e = bam.a(jb.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Nullable
      public static jb.a a(String $$0) {
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

      public abstract jb e();

      public abstract jb f();

      public jb[] g() {
         return new jb[]{this.e(), this.f()};
      }

      @Override
      public String toString() {
         return this.f;
      }

      public static jb.a a(azx $$0) {
         return ag.a(d, $$0);
      }

      public boolean a(@Nullable jb $$0) {
         return $$0 != null && $$0.o() == this;
      }

      public jb.c h() {
         return switch (this) {
            case a, c -> jb.c.a;
            case b -> jb.c.b;
         };
      }

      @Override
      public String c() {
         return this.f;
      }

      public abstract int a(int var1, int var2, int var3);

      public abstract double a(double var1, double var3, double var5);

      public abstract boolean a(boolean var1, boolean var2, boolean var3);
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

      public jb.b c() {
         return this == a ? b : a;
      }
   }

   public static enum c implements Iterable<jb>, Predicate<jb> {
      a(new jb[]{jb.c, jb.f, jb.d, jb.e}, new jb.a[]{jb.a.a, jb.a.c}),
      b(new jb[]{jb.b, jb.a}, new jb.a[]{jb.a.b});

      private final jb[] c;
      private final jb.a[] d;

      private c(final jb[] $$0, final jb.a[] $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public jb a(azx $$0) {
         return ag.a(this.c, $$0);
      }

      public jb.a b(azx $$0) {
         return ag.a(this.d, $$0);
      }

      public boolean a(@Nullable jb $$0) {
         return $$0 != null && $$0.o().h() == this;
      }

      @Override
      public Iterator<jb> iterator() {
         return Iterators.forArray(this.c);
      }

      public Stream<jb> a() {
         return Arrays.stream(this.c);
      }

      public List<jb> c(azx $$0) {
         return ag.b(this.c, $$0);
      }

      public int b() {
         return this.c.length;
      }
   }
}
