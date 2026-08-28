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

public enum je implements azu {
   a(0, 1, -1, "down", je.b.b, je.a.b, new kd(0, -1, 0)),
   b(1, 0, -1, "up", je.b.a, je.a.b, new kd(0, 1, 0)),
   c(2, 3, 2, "north", je.b.b, je.a.c, new kd(0, 0, -1)),
   d(3, 2, 0, "south", je.b.a, je.a.c, new kd(0, 0, 1)),
   e(4, 5, 1, "west", je.b.b, je.a.a, new kd(-1, 0, 0)),
   f(5, 4, 3, "east", je.b.a, je.a.a, new kd(1, 0, 0));

   public static final azu.a<je> g = azu.a(je::values);
   public static final Codec<je> h = g.validate(je::a);
   public static final IntFunction<je> i = axp.a(je::d, values(), axp.a.b);
   public static final zn<ByteBuf, je> j = zl.a(i, je::d);
   private final int k;
   private final int l;
   private final int m;
   private final String n;
   private final je.a o;
   private final je.b p;
   private final kd q;
   private static final je[] r = values();
   private static final je[] s = Arrays.stream(r).sorted(Comparator.comparingInt($$0 -> $$0.k)).toArray(je[]::new);
   private static final je[] t = Arrays.stream(r).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.m)).toArray(je[]::new);

   private je(final int $$0, final int $$1, final int $$2, final String $$3, final je.b $$4, final je.a $$5, final kd $$6) {
      this.k = $$0;
      this.m = $$2;
      this.l = $$1;
      this.n = $$3;
      this.o = $$5;
      this.p = $$4;
      this.q = $$6;
   }

   public static je[] a(bsw $$0) {
      float $$1 = $$0.g(1.0F) * (float) (Math.PI / 180.0);
      float $$2 = -$$0.h(1.0F) * (float) (Math.PI / 180.0);
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
      je $$15 = $$7 ? f : e;
      je $$16 = $$8 ? b : a;
      je $$17 = $$9 ? d : c;
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

   private static je[] a(je $$0, je $$1, je $$2) {
      return new je[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
   }

   public static je a(Matrix4f $$0, je $$1) {
      kd $$2 = $$1.q();
      Vector4f $$3 = $$0.transform(new Vector4f((float)$$2.u(), (float)$$2.v(), (float)$$2.w(), 0.0F));
      return a($$3.x(), $$3.y(), $$3.z());
   }

   public static Collection<je> a(azh $$0) {
      return ac.b(values(), $$0);
   }

   public static Stream<je> a() {
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

   public je.b f() {
      return this.p;
   }

   public static je a(bsw $$0, je.a $$1) {
      return switch ($$1) {
         case a -> f.a($$0.h(1.0F)) ? f : e;
         case b -> $$0.g(1.0F) < 0.0F ? b : a;
         case c -> d.a($$0.h(1.0F)) ? d : c;
      };
   }

   public je g() {
      return a(this.l);
   }

   public je a(je.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.r() : this;
         case b -> this != b && this != a ? this.h() : this;
         case c -> this != c && this != d ? this.t() : this;
      };
   }

   public je b(je.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.s() : this;
         case b -> this != b && this != a ? this.i() : this;
         case c -> this != c && this != d ? this.u() : this;
      };
   }

   public je h() {
      return switch (this) {
         case c -> f;
         case d -> e;
         case e -> c;
         case f -> d;
         default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      };
   }

   private je r() {
      return switch (this) {
         case a -> d;
         case b -> c;
         case c -> a;
         case d -> b;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private je s() {
      return switch (this) {
         case a -> c;
         case b -> d;
         case c -> b;
         case d -> a;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private je t() {
      return switch (this) {
         case a -> e;
         case b -> f;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> b;
         case f -> a;
      };
   }

   private je u() {
      return switch (this) {
         case a -> f;
         case b -> e;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> a;
         case f -> b;
      };
   }

   public je i() {
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

   public je.a o() {
      return this.o;
   }

   @Nullable
   public static je a(@Nullable String $$0) {
      return g.a($$0);
   }

   public static je a(int $$0) {
      return s[ayz.a($$0 % s.length)];
   }

   public static je b(int $$0) {
      return t[ayz.a($$0 % t.length)];
   }

   @Nullable
   public static je a(int $$0, int $$1, int $$2) {
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

   public static je a(double $$0) {
      return b(ayz.a($$0 / 90.0 + 0.5) & 3);
   }

   public static je a(je.a $$0, je.b $$1) {
      return switch ($$0) {
         case a -> $$1 == je.b.a ? f : e;
         case b -> $$1 == je.b.a ? b : a;
         case c -> $$1 == je.b.a ? d : c;
      };
   }

   public float p() {
      return (float)((this.m & 3) * 90);
   }

   public static je b(azh $$0) {
      return ac.a(r, $$0);
   }

   public static je a(double $$0, double $$1, double $$2) {
      return a((float)$$0, (float)$$1, (float)$$2);
   }

   public static je a(float $$0, float $$1, float $$2) {
      je $$3 = c;
      float $$4 = Float.MIN_VALUE;

      for (je $$5 : r) {
         float $$6 = $$0 * (float)$$5.q.u() + $$1 * (float)$$5.q.v() + $$2 * (float)$$5.q.w();
         if ($$6 > $$4) {
            $$4 = $$6;
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static je a(evt $$0) {
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

   private static DataResult<je> a(je $$0) {
      return $$0.o().b() ? DataResult.success($$0) : DataResult.error(() -> "Expected a vertical direction");
   }

   public static je a(je.b $$0, je.a $$1) {
      for (je $$2 : r) {
         if ($$2.f() == $$0 && $$2.o() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("No such direction: " + $$0 + " " + $$1);
   }

   public kd q() {
      return this.q;
   }

   public boolean a(float $$0) {
      float $$1 = $$0 * (float) (Math.PI / 180.0);
      float $$2 = -ayz.a($$1);
      float $$3 = ayz.b($$1);
      return (float)this.q.u() * $$2 + (float)this.q.w() * $$3 > 0.0F;
   }

   public static enum a implements azu, Predicate<je> {
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

      public static final je.a[] d = values();
      public static final azu.a<je.a> e = azu.a(je.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Nullable
      public static je.a a(String $$0) {
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

      public static je.a a(azh $$0) {
         return ac.a(d, $$0);
      }

      public boolean a(@Nullable je $$0) {
         return $$0 != null && $$0.o() == this;
      }

      public je.c e() {
         return switch (this) {
            case a, c -> je.c.a;
            case b -> je.c.b;
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

      public je.b c() {
         return this == a ? b : a;
      }
   }

   public static enum c implements Iterable<je>, Predicate<je> {
      a(new je[]{je.c, je.f, je.d, je.e}, new je.a[]{je.a.a, je.a.c}),
      b(new je[]{je.b, je.a}, new je.a[]{je.a.b});

      private final je[] c;
      private final je.a[] d;

      private c(final je[] $$0, final je.a[] $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public je a(azh $$0) {
         return ac.a(this.c, $$0);
      }

      public je.a b(azh $$0) {
         return ac.a(this.d, $$0);
      }

      public boolean a(@Nullable je $$0) {
         return $$0 != null && $$0.o().e() == this;
      }

      @Override
      public Iterator<je> iterator() {
         return Iterators.forArray(this.c);
      }

      public Stream<je> a() {
         return Arrays.stream(this.c);
      }

      public List<je> c(azh $$0) {
         return ac.b(this.c, $$0);
      }

      public int b() {
         return this.c.length;
      }
   }
}
