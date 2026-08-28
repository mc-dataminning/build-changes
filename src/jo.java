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

public enum jo implements bag {
   a(0, 1, -1, "down", jo.b.b, jo.a.b, new kn(0, -1, 0)),
   b(1, 0, -1, "up", jo.b.a, jo.a.b, new kn(0, 1, 0)),
   c(2, 3, 2, "north", jo.b.b, jo.a.c, new kn(0, 0, -1)),
   d(3, 2, 0, "south", jo.b.a, jo.a.c, new kn(0, 0, 1)),
   e(4, 5, 1, "west", jo.b.b, jo.a.a, new kn(-1, 0, 0)),
   f(5, 4, 3, "east", jo.b.a, jo.a.a, new kn(1, 0, 0));

   public static final bag.a<jo> g = bag.a(jo::values);
   public static final Codec<jo> h = g.validate(jo::b);
   public static final IntFunction<jo> i = aya.a(jo::d, values(), aya.a.b);
   public static final yt<ByteBuf, jo> j = yr.a(i, jo::d);
   private final int k;
   private final int l;
   private final int m;
   private final String n;
   private final jo.a o;
   private final jo.b p;
   private final kn q;
   private final fcu r;
   private static final jo[] s = values();
   private static final jo[] t = Arrays.stream(s).sorted(Comparator.comparingInt($$0 -> $$0.k)).toArray(jo[]::new);
   private static final jo[] u = Arrays.stream(s).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.m)).toArray(jo[]::new);

   private jo(final int $$0, final int $$1, final int $$2, final String $$3, final jo.b $$4, final jo.a $$5, final kn $$6) {
      this.k = $$0;
      this.m = $$2;
      this.l = $$1;
      this.n = $$3;
      this.o = $$5;
      this.p = $$4;
      this.q = $$6;
      this.r = fcu.a($$6);
   }

   public static jo[] a(bvs $$0) {
      float $$1 = $$0.i(1.0F) * (float) (Math.PI / 180.0);
      float $$2 = -$$0.j(1.0F) * (float) (Math.PI / 180.0);
      float $$3 = azk.a($$1);
      float $$4 = azk.b($$1);
      float $$5 = azk.a($$2);
      float $$6 = azk.b($$2);
      boolean $$7 = $$5 > 0.0F;
      boolean $$8 = $$3 < 0.0F;
      boolean $$9 = $$6 > 0.0F;
      float $$10 = $$7 ? $$5 : -$$5;
      float $$11 = $$8 ? -$$3 : $$3;
      float $$12 = $$9 ? $$6 : -$$6;
      float $$13 = $$10 * $$4;
      float $$14 = $$12 * $$4;
      jo $$15 = $$7 ? f : e;
      jo $$16 = $$8 ? b : a;
      jo $$17 = $$9 ? d : c;
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

   private static jo[] a(jo $$0, jo $$1, jo $$2) {
      return new jo[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
   }

   public static jo a(Matrix4f $$0, jo $$1) {
      kn $$2 = $$1.q();
      Vector4f $$3 = $$0.transform(new Vector4f((float)$$2.u(), (float)$$2.v(), (float)$$2.w(), 0.0F));
      return a($$3.x(), $$3.y(), $$3.z());
   }

   public static Collection<jo> a(azs $$0) {
      return af.b(values(), $$0);
   }

   public static Stream<jo> a() {
      return Stream.of(s);
   }

   public static float a(jo $$0) {
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

   public jo.b f() {
      return this.p;
   }

   public static jo a(bvs $$0, jo.a $$1) {
      return switch ($$1) {
         case a -> f.a($$0.j(1.0F)) ? f : e;
         case b -> $$0.i(1.0F) < 0.0F ? b : a;
         case c -> d.a($$0.j(1.0F)) ? d : c;
      };
   }

   public jo g() {
      return a(this.l);
   }

   public jo a(jo.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.s() : this;
         case b -> this != b && this != a ? this.h() : this;
         case c -> this != c && this != d ? this.u() : this;
      };
   }

   public jo b(jo.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.t() : this;
         case b -> this != b && this != a ? this.i() : this;
         case c -> this != c && this != d ? this.v() : this;
      };
   }

   public jo h() {
      return switch (this) {
         case c -> f;
         case d -> e;
         case e -> c;
         case f -> d;
         default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      };
   }

   private jo s() {
      return switch (this) {
         case a -> d;
         case b -> c;
         case c -> a;
         case d -> b;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private jo t() {
      return switch (this) {
         case a -> c;
         case b -> d;
         case c -> b;
         case d -> a;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private jo u() {
      return switch (this) {
         case a -> e;
         case b -> f;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> b;
         case f -> a;
      };
   }

   private jo v() {
      return switch (this) {
         case a -> f;
         case b -> e;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> a;
         case f -> b;
      };
   }

   public jo i() {
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

   public jo.a o() {
      return this.o;
   }

   @Nullable
   public static jo a(@Nullable String $$0) {
      return g.a($$0);
   }

   public static jo a(int $$0) {
      return t[azk.a($$0 % t.length)];
   }

   public static jo b(int $$0) {
      return u[azk.a($$0 % u.length)];
   }

   public static jo a(double $$0) {
      return b(azk.a($$0 / 90.0 + 0.5) & 3);
   }

   public static jo a(jo.a $$0, jo.b $$1) {
      return switch ($$0) {
         case a -> $$1 == jo.b.a ? f : e;
         case b -> $$1 == jo.b.a ? b : a;
         case c -> $$1 == jo.b.a ? d : c;
      };
   }

   public float p() {
      return (float)((this.m & 3) * 90);
   }

   public static jo b(azs $$0) {
      return af.a(s, $$0);
   }

   public static jo a(double $$0, double $$1, double $$2) {
      return a((float)$$0, (float)$$1, (float)$$2);
   }

   public static jo a(float $$0, float $$1, float $$2) {
      jo $$3 = c;
      float $$4 = Float.MIN_VALUE;

      for (jo $$5 : s) {
         float $$6 = $$0 * (float)$$5.q.u() + $$1 * (float)$$5.q.v() + $$2 * (float)$$5.q.w();
         if ($$6 > $$4) {
            $$4 = $$6;
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static jo a(fcu $$0) {
      return a($$0.d, $$0.e, $$0.f);
   }

   @Nullable
   @Contract("_,_,_,!null->!null;_,_,_,_->_")
   public static jo a(int $$0, int $$1, int $$2, @Nullable jo $$3) {
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
   public static jo a(kn $$0, @Nullable jo $$1) {
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

   private static DataResult<jo> b(jo $$0) {
      return $$0.o().b() ? DataResult.success($$0) : DataResult.error(() -> "Expected a vertical direction");
   }

   public static jo a(jo.b $$0, jo.a $$1) {
      for (jo $$2 : s) {
         if ($$2.f() == $$0 && $$2.o() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("No such direction: " + $$0 + " " + $$1);
   }

   public kn q() {
      return this.q;
   }

   public fcu r() {
      return this.r;
   }

   public boolean a(float $$0) {
      float $$1 = $$0 * (float) (Math.PI / 180.0);
      float $$2 = -azk.a($$1);
      float $$3 = azk.b($$1);
      return (float)this.q.u() * $$2 + (float)this.q.w() * $$3 > 0.0F;
   }

   public static enum a implements bag, Predicate<jo> {
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
         public jo e() {
            return jo.f;
         }

         @Override
         public jo f() {
            return jo.e;
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
         public jo e() {
            return jo.b;
         }

         @Override
         public jo f() {
            return jo.a;
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
         public jo e() {
            return jo.d;
         }

         @Override
         public jo f() {
            return jo.c;
         }
      };

      public static final jo.a[] d = values();
      public static final bag.a<jo.a> e = bag.a(jo.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Nullable
      public static jo.a a(String $$0) {
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

      public abstract jo e();

      public abstract jo f();

      public jo[] g() {
         return new jo[]{this.e(), this.f()};
      }

      @Override
      public String toString() {
         return this.f;
      }

      public static jo.a a(azs $$0) {
         return af.a(d, $$0);
      }

      public boolean a(@Nullable jo $$0) {
         return $$0 != null && $$0.o() == this;
      }

      public jo.c h() {
         return switch (this) {
            case a, c -> jo.c.a;
            case b -> jo.c.b;
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

      public jo.b c() {
         return this == a ? b : a;
      }
   }

   public static enum c implements Iterable<jo>, Predicate<jo> {
      a(new jo[]{jo.c, jo.f, jo.d, jo.e}, new jo.a[]{jo.a.a, jo.a.c}),
      b(new jo[]{jo.b, jo.a}, new jo.a[]{jo.a.b});

      private final jo[] c;
      private final jo.a[] d;

      private c(final jo[] $$0, final jo.a[] $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public jo a(azs $$0) {
         return af.a(this.c, $$0);
      }

      public jo.a b(azs $$0) {
         return af.a(this.d, $$0);
      }

      public boolean a(@Nullable jo $$0) {
         return $$0 != null && $$0.o().h() == this;
      }

      @Override
      public Iterator<jo> iterator() {
         return Iterators.forArray(this.c);
      }

      public Stream<jo> a() {
         return Arrays.stream(this.c);
      }

      public List<jo> c(azs $$0) {
         return af.b(this.c, $$0);
      }

      public int b() {
         return this.c.length;
      }
   }
}
