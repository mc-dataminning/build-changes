import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fus<T> extends fub {
   public static final BooleanSupplier a = gad::u;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final xa c;
   private int d;
   private T f;
   private final fus.c<T> m;
   private final Function<T, xa> n;
   private final Function<fus<T>, xo> o;
   private final fus.b<T> p;
   private final boolean q;
   private final frg.l<T> r;

   fus(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      xa $$4,
      xa $$5,
      int $$6,
      T $$7,
      fus.c<T> $$8,
      Function<T, xa> $$9,
      Function<fus<T>, xo> $$10,
      fus.b<T> $$11,
      frg.l<T> $$12,
      boolean $$13
   ) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.f = $$7;
      this.m = $$8;
      this.n = $$9;
      this.o = $$10;
      this.p = $$11;
      this.q = $$13;
      this.r = $$12;
      this.g();
   }

   private void g() {
      this.a(this.r.apply(this.f));
   }

   @Override
   public void b() {
      if (gad.t()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = azo.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(azo.b(this.d + $$0, $$1.size()));
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if ($$3 > 0.0) {
         this.a(-1);
      } else if ($$3 < 0.0) {
         this.a(1);
      }

      return true;
   }

   public void a(T $$0) {
      List<T> $$1 = this.m.a();
      int $$2 = $$1.indexOf($$0);
      if ($$2 != -1) {
         this.d = $$2;
      }

      this.b($$0);
   }

   private void b(T $$0) {
      xa $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.g();
   }

   private xa c(T $$0) {
      return (xa)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private xo d(T $$0) {
      return wz.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected xo d() {
      return this.o.apply(this);
   }

   @Override
   public void a(fyi $$0) {
      $$0.a(fyh.a, this.d());
      if (this.j) {
         T $$1 = this.b(1);
         xa $$2 = this.c($$1);
         if (this.aN_()) {
            $$0.a(fyh.d, xa.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fyh.d, xa.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public xo c() {
      return a_((xa)(this.q ? this.d(this.f) : this.B()));
   }

   public static <T> fus.a<T> a(Function<T, xa> $$0) {
      return new fus.a<>($$0);
   }

   public static fus.a<Boolean> a(xa $$0, xa $$1) {
      return new fus.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fus.a<Boolean> e() {
      return new fus.a<Boolean>($$0 -> $$0 ? wz.b : wz.c).a(b);
   }

   public static fus.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, xa> c;
      private frg.l<T> d = $$0x -> null;
      private Function<fus<T>, xo> e = fus::c;
      private fus.c<T> f = fus.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, xa> $$0) {
         this.c = $$0;
      }

      public fus.a<T> a(Collection<T> $$0) {
         return this.a(fus.c.a($$0));
      }

      @SafeVarargs
      public final fus.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fus.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fus.c.a(fus.a, $$0, $$1));
      }

      public fus.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fus.c.a($$0, $$1, $$2));
      }

      public fus.a<T> a(fus.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fus.a<T> a(frg.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fus.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fus.a<T> a(Function<fus<T>, xo> $$0) {
         this.e = $$0;
         return this;
      }

      public fus.a<T> a() {
         this.g = true;
         return this;
      }

      public fus<T> a(xa $$0, fus.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fus<T> a(int $$0, int $$1, int $$2, int $$3, xa $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fus<T> a(int $$0, int $$1, int $$2, int $$3, xa $$4, fus.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            xa $$8 = this.c.apply($$7);
            xa $$9 = (xa)(this.g ? $$8 : wz.a($$4, $$8));
            return new fus<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fus<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fus.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fus.c<T>() {
            @Override
            public List<T> a() {
               return $$1;
            }

            @Override
            public List<T> b() {
               return $$1;
            }
         };
      }

      static <T> fus.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fus.c<T>() {
            @Override
            public List<T> a() {
               return $$0.getAsBoolean() ? $$4 : $$3;
            }

            @Override
            public List<T> b() {
               return $$3;
            }
         };
      }
   }
}
