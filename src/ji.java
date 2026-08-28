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

public enum ji implements azj {
   a(0, 1, -1, "down", ji.b.b, ji.a.b, new kh(0, -1, 0)),
   b(1, 0, -1, "up", ji.b.a, ji.a.b, new kh(0, 1, 0)),
   c(2, 3, 2, "north", ji.b.b, ji.a.c, new kh(0, 0, -1)),
   d(3, 2, 0, "south", ji.b.a, ji.a.c, new kh(0, 0, 1)),
   e(4, 5, 1, "west", ji.b.b, ji.a.a, new kh(-1, 0, 0)),
   f(5, 4, 3, "east", ji.b.a, ji.a.a, new kh(1, 0, 0));

   public static final azj.a<ji> g = azj.a(ji::values);
   public static final Codec<ji> h = g.validate(ji::a);
   public static final IntFunction<ji> i = axd.a(ji::d, values(), axd.a.b);
   public static final yw<ByteBuf, ji> j = yu.a(i, ji::d);
   private final int k;
   private final int l;
   private final int m;
   private final String n;
   private final ji.a o;
   private final ji.b p;
   private final kh q;
   private static final ji[] r = values();
   private static final ji[] s = Arrays.stream(r).sorted(Comparator.comparingInt($$0 -> $$0.k)).toArray(ji[]::new);
   private static final ji[] t = Arrays.stream(r).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.m)).toArray(ji[]::new);

   private ji(final int $$0, final int $$1, final int $$2, final String $$3, final ji.b $$4, final ji.a $$5, final kh $$6) {
      this.k = $$0;
      this.m = $$2;
      this.l = $$1;
      this.n = $$3;
      this.o = $$5;
      this.p = $$4;
      this.q = $$6;
   }

   public static ji[] a(bsq $$0) {
      float $$1 = $$0.h(1.0F) * (float) (Math.PI / 180.0);
      float $$2 = -$$0.i(1.0F) * (float) (Math.PI / 180.0);
      float $$3 = ayn.a($$1);
      float $$4 = ayn.b($$1);
      float $$5 = ayn.a($$2);
      float $$6 = ayn.b($$2);
      boolean $$7 = $$5 > 0.0F;
      boolean $$8 = $$3 < 0.0F;
      boolean $$9 = $$6 > 0.0F;
      float $$10 = $$7 ? $$5 : -$$5;
      float $$11 = $$8 ? -$$3 : $$3;
      float $$12 = $$9 ? $$6 : -$$6;
      float $$13 = $$10 * $$4;
      float $$14 = $$12 * $$4;
      ji $$15 = $$7 ? f : e;
      ji $$16 = $$8 ? b : a;
      ji $$17 = $$9 ? d : c;
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

   private static ji[] a(ji $$0, ji $$1, ji $$2) {
      return new ji[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
   }

   public static ji a(Matrix4f $$0, ji $$1) {
      kh $$2 = $$1.q();
      Vector4f $$3 = $$0.transform(new Vector4f((float)$$2.u(), (float)$$2.v(), (float)$$2.w(), 0.0F));
      return a($$3.x(), $$3.y(), $$3.z());
   }

   public static Collection<ji> a(ayv $$0) {
      return ad.b(values(), $$0);
   }

   public static Stream<ji> a() {
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

   public ji.b f() {
      return this.p;
   }

   public static ji a(bsq $$0, ji.a $$1) {
      return switch ($$1) {
         case a -> f.a($$0.i(1.0F)) ? f : e;
         case b -> $$0.h(1.0F) < 0.0F ? b : a;
         case c -> d.a($$0.i(1.0F)) ? d : c;
      };
   }

   public ji g() {
      return a(this.l);
   }

   public ji a(ji.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.r() : this;
         case b -> this != b && this != a ? this.h() : this;
         case c -> this != c && this != d ? this.t() : this;
      };
   }

   public ji b(ji.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.s() : this;
         case b -> this != b && this != a ? this.i() : this;
         case c -> this != c && this != d ? this.u() : this;
      };
   }

   public ji h() {
      return switch (this) {
         case c -> f;
         case d -> e;
         case e -> c;
         case f -> d;
         default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      };
   }

   private ji r() {
      return switch (this) {
         case a -> d;
         case b -> c;
         case c -> a;
         case d -> b;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private ji s() {
      return switch (this) {
         case a -> c;
         case b -> d;
         case c -> b;
         case d -> a;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private ji t() {
      return switch (this) {
         case a -> e;
         case b -> f;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> b;
         case f -> a;
      };
   }

   private ji u() {
      return switch (this) {
         case a -> f;
         case b -> e;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> a;
         case f -> b;
      };
   }

   public ji i() {
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

   public ji.a o() {
      return this.o;
   }

   @Nullable
   public static ji a(@Nullable String $$0) {
      return g.a($$0);
   }

   public static ji a(int $$0) {
      return s[ayn.a($$0 % s.length)];
   }

   public static ji b(int $$0) {
      return t[ayn.a($$0 % t.length)];
   }

   @Nullable
   public static ji a(int $$0, int $$1, int $$2) {
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

   public static ji a(double $$0) {
      return b(ayn.a($$0 / 90.0 + 0.5) & 3);
   }

   public static ji a(ji.a $$0, ji.b $$1) {
      return switch ($$0) {
         case a -> $$1 == ji.b.a ? f : e;
         case b -> $$1 == ji.b.a ? b : a;
         case c -> $$1 == ji.b.a ? d : c;
      };
   }

   public float p() {
      return (float)((this.m & 3) * 90);
   }

   public static ji b(ayv $$0) {
      return ad.a(r, $$0);
   }

   public static ji a(double $$0, double $$1, double $$2) {
      return a((float)$$0, (float)$$1, (float)$$2);
   }

   public static ji a(float $$0, float $$1, float $$2) {
      ji $$3 = c;
      float $$4 = Float.MIN_VALUE;

      for (ji $$5 : r) {
         float $$6 = $$0 * (float)$$5.q.u() + $$1 * (float)$$5.q.v() + $$2 * (float)$$5.q.w();
         if ($$6 > $$4) {
            $$4 = $$6;
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static ji a(eww $$0) {
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

   private static DataResult<ji> a(ji $$0) {
      return $$0.o().b() ? DataResult.success($$0) : DataResult.error(() -> "Expected a vertical direction");
   }

   public static ji a(ji.b $$0, ji.a $$1) {
      for (ji $$2 : r) {
         if ($$2.f() == $$0 && $$2.o() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("No such direction: " + $$0 + " " + $$1);
   }

   public kh q() {
      return this.q;
   }

   public boolean a(float $$0) {
      float $$1 = $$0 * (float) (Math.PI / 180.0);
      float $$2 = -ayn.a($$1);
      float $$3 = ayn.b($$1);
      return (float)this.q.u() * $$2 + (float)this.q.w() * $$3 > 0.0F;
   }

   public static enum a implements azj, Predicate<ji> {
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

      public static final ji.a[] d = values();
      public static final azj.a<ji.a> e = azj.a(ji.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Nullable
      public static ji.a a(String $$0) {
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

      public static ji.a a(ayv $$0) {
         return ad.a(d, $$0);
      }

      public boolean a(@Nullable ji $$0) {
         return $$0 != null && $$0.o() == this;
      }

      public ji.c e() {
         return switch (this) {
            case a, c -> ji.c.a;
            case b -> ji.c.b;
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

      public ji.b c() {
         return this == a ? b : a;
      }
   }

   public static enum c implements Iterable<ji>, Predicate<ji> {
      a(new ji[]{ji.c, ji.f, ji.d, ji.e}, new ji.a[]{ji.a.a, ji.a.c}),
      b(new ji[]{ji.b, ji.a}, new ji.a[]{ji.a.b});

      private final ji[] c;
      private final ji.a[] d;

      private c(final ji[] $$0, final ji.a[] $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public ji a(ayv $$0) {
         return ad.a(this.c, $$0);
      }

      public ji.a b(ayv $$0) {
         return ad.a(this.d, $$0);
      }

      public boolean a(@Nullable ji $$0) {
         return $$0 != null && $$0.o().e() == this;
      }

      @Override
      public Iterator<ji> iterator() {
         return Iterators.forArray(this.c);
      }

      public Stream<ji> a() {
         return Arrays.stream(this.c);
      }

      public List<ji> c(ayv $$0) {
         return ad.b(this.c, $$0);
      }

      public int b() {
         return this.c.length;
      }
   }
}
