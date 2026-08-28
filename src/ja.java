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

public enum ja implements bak {
   a(0, 1, -1, "down", ja.b.b, ja.a.b, new jz(0, -1, 0)),
   b(1, 0, -1, "up", ja.b.a, ja.a.b, new jz(0, 1, 0)),
   c(2, 3, 2, "north", ja.b.b, ja.a.c, new jz(0, 0, -1)),
   d(3, 2, 0, "south", ja.b.a, ja.a.c, new jz(0, 0, 1)),
   e(4, 5, 1, "west", ja.b.b, ja.a.a, new jz(-1, 0, 0)),
   f(5, 4, 3, "east", ja.b.a, ja.a.a, new jz(1, 0, 0));

   public static final bak.a<ja> g = bak.a(ja::values);
   public static final Codec<ja> h = g.validate(ja::b);
   public static final IntFunction<ja> i = ayc.a(ja::d, values(), ayc.a.b);
   public static final yw<ByteBuf, ja> j = yu.a(i, ja::d);
   private final int k;
   private final int l;
   private final int m;
   private final String n;
   private final ja.a o;
   private final ja.b p;
   private final jz q;
   private final fei r;
   private static final ja[] s = values();
   private static final ja[] t = Arrays.stream(s).sorted(Comparator.comparingInt($$0 -> $$0.k)).toArray(ja[]::new);
   private static final ja[] u = Arrays.stream(s).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.m)).toArray(ja[]::new);

   private ja(final int $$0, final int $$1, final int $$2, final String $$3, final ja.b $$4, final ja.a $$5, final jz $$6) {
      this.k = $$0;
      this.m = $$2;
      this.l = $$1;
      this.n = $$3;
      this.o = $$5;
      this.p = $$4;
      this.q = $$6;
      this.r = fei.a($$6);
   }

   public static ja[] a(bwd $$0) {
      float $$1 = $$0.i(1.0F) * (float) (Math.PI / 180.0);
      float $$2 = -$$0.j(1.0F) * (float) (Math.PI / 180.0);
      float $$3 = azm.a($$1);
      float $$4 = azm.b($$1);
      float $$5 = azm.a($$2);
      float $$6 = azm.b($$2);
      boolean $$7 = $$5 > 0.0F;
      boolean $$8 = $$3 < 0.0F;
      boolean $$9 = $$6 > 0.0F;
      float $$10 = $$7 ? $$5 : -$$5;
      float $$11 = $$8 ? -$$3 : $$3;
      float $$12 = $$9 ? $$6 : -$$6;
      float $$13 = $$10 * $$4;
      float $$14 = $$12 * $$4;
      ja $$15 = $$7 ? f : e;
      ja $$16 = $$8 ? b : a;
      ja $$17 = $$9 ? d : c;
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

   private static ja[] a(ja $$0, ja $$1, ja $$2) {
      return new ja[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
   }

   public static ja a(Matrix4f $$0, ja $$1) {
      jz $$2 = $$1.q();
      Vector4f $$3 = $$0.transform(new Vector4f((float)$$2.u(), (float)$$2.v(), (float)$$2.w(), 0.0F));
      return a($$3.x(), $$3.y(), $$3.z());
   }

   public static Collection<ja> a(azv $$0) {
      return af.b(values(), $$0);
   }

   public static Stream<ja> a() {
      return Stream.of(s);
   }

   public static float a(ja $$0) {
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

   public ja.b f() {
      return this.p;
   }

   public static ja a(bwd $$0, ja.a $$1) {
      return switch ($$1) {
         case a -> f.a($$0.j(1.0F)) ? f : e;
         case b -> $$0.i(1.0F) < 0.0F ? b : a;
         case c -> d.a($$0.j(1.0F)) ? d : c;
      };
   }

   public ja g() {
      return a(this.l);
   }

   public ja a(ja.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.s() : this;
         case b -> this != b && this != a ? this.h() : this;
         case c -> this != c && this != d ? this.u() : this;
      };
   }

   public ja b(ja.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.t() : this;
         case b -> this != b && this != a ? this.i() : this;
         case c -> this != c && this != d ? this.v() : this;
      };
   }

   public ja h() {
      return switch (this) {
         case c -> f;
         case d -> e;
         case e -> c;
         case f -> d;
         default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      };
   }

   private ja s() {
      return switch (this) {
         case a -> d;
         case b -> c;
         case c -> a;
         case d -> b;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private ja t() {
      return switch (this) {
         case a -> c;
         case b -> d;
         case c -> b;
         case d -> a;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private ja u() {
      return switch (this) {
         case a -> e;
         case b -> f;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> b;
         case f -> a;
      };
   }

   private ja v() {
      return switch (this) {
         case a -> f;
         case b -> e;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> a;
         case f -> b;
      };
   }

   public ja i() {
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

   public ja.a o() {
      return this.o;
   }

   @Nullable
   public static ja a(@Nullable String $$0) {
      return g.a($$0);
   }

   public static ja a(int $$0) {
      return t[azm.a($$0 % t.length)];
   }

   public static ja b(int $$0) {
      return u[azm.a($$0 % u.length)];
   }

   public static ja a(double $$0) {
      return b(azm.a($$0 / 90.0 + 0.5) & 3);
   }

   public static ja a(ja.a $$0, ja.b $$1) {
      return switch ($$0) {
         case a -> $$1 == ja.b.a ? f : e;
         case b -> $$1 == ja.b.a ? b : a;
         case c -> $$1 == ja.b.a ? d : c;
      };
   }

   public float p() {
      return (float)((this.m & 3) * 90);
   }

   public static ja b(azv $$0) {
      return af.a(s, $$0);
   }

   public static ja a(double $$0, double $$1, double $$2) {
      return a((float)$$0, (float)$$1, (float)$$2);
   }

   public static ja a(float $$0, float $$1, float $$2) {
      ja $$3 = c;
      float $$4 = Float.MIN_VALUE;

      for (ja $$5 : s) {
         float $$6 = $$0 * (float)$$5.q.u() + $$1 * (float)$$5.q.v() + $$2 * (float)$$5.q.w();
         if ($$6 > $$4) {
            $$4 = $$6;
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static ja a(fei $$0) {
      return a($$0.d, $$0.e, $$0.f);
   }

   @Nullable
   @Contract("_,_,_,!null->!null;_,_,_,_->_")
   public static ja a(int $$0, int $$1, int $$2, @Nullable ja $$3) {
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
   public static ja a(jz $$0, @Nullable ja $$1) {
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

   private static DataResult<ja> b(ja $$0) {
      return $$0.o().b() ? DataResult.success($$0) : DataResult.error(() -> "Expected a vertical direction");
   }

   public static ja a(ja.b $$0, ja.a $$1) {
      for (ja $$2 : s) {
         if ($$2.f() == $$0 && $$2.o() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("No such direction: " + $$0 + " " + $$1);
   }

   public jz q() {
      return this.q;
   }

   public fei r() {
      return this.r;
   }

   public boolean a(float $$0) {
      float $$1 = $$0 * (float) (Math.PI / 180.0);
      float $$2 = -azm.a($$1);
      float $$3 = azm.b($$1);
      return (float)this.q.u() * $$2 + (float)this.q.w() * $$3 > 0.0F;
   }

   public static enum a implements bak, Predicate<ja> {
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
         public ja e() {
            return ja.f;
         }

         @Override
         public ja f() {
            return ja.e;
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
         public ja e() {
            return ja.b;
         }

         @Override
         public ja f() {
            return ja.a;
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
         public ja e() {
            return ja.d;
         }

         @Override
         public ja f() {
            return ja.c;
         }
      };

      public static final ja.a[] d = values();
      public static final bak.a<ja.a> e = bak.a(ja.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Nullable
      public static ja.a a(String $$0) {
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

      public abstract ja e();

      public abstract ja f();

      public ja[] g() {
         return new ja[]{this.e(), this.f()};
      }

      @Override
      public String toString() {
         return this.f;
      }

      public static ja.a a(azv $$0) {
         return af.a(d, $$0);
      }

      public boolean a(@Nullable ja $$0) {
         return $$0 != null && $$0.o() == this;
      }

      public ja.c h() {
         return switch (this) {
            case a, c -> ja.c.a;
            case b -> ja.c.b;
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

      public ja.b c() {
         return this == a ? b : a;
      }
   }

   public static enum c implements Iterable<ja>, Predicate<ja> {
      a(new ja[]{ja.c, ja.f, ja.d, ja.e}, new ja.a[]{ja.a.a, ja.a.c}),
      b(new ja[]{ja.b, ja.a}, new ja.a[]{ja.a.b});

      private final ja[] c;
      private final ja.a[] d;

      private c(final ja[] $$0, final ja.a[] $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public ja a(azv $$0) {
         return af.a(this.c, $$0);
      }

      public ja.a b(azv $$0) {
         return af.a(this.d, $$0);
      }

      public boolean a(@Nullable ja $$0) {
         return $$0 != null && $$0.o().h() == this;
      }

      @Override
      public Iterator<ja> iterator() {
         return Iterators.forArray(this.c);
      }

      public Stream<ja> a() {
         return Arrays.stream(this.c);
      }

      public List<ja> c(azv $$0) {
         return af.b(this.c, $$0);
      }

      public int b() {
         return this.c.length;
      }
   }
}
