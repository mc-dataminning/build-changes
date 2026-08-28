import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fuu<T> extends fud {
   public static final BooleanSupplier a = gaf::u;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final xc c;
   private int d;
   private T f;
   private final fuu.c<T> m;
   private final Function<T, xc> n;
   private final Function<fuu<T>, xq> o;
   private final fuu.b<T> p;
   private final boolean q;
   private final fri.l<T> r;

   fuu(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      xc $$4,
      xc $$5,
      int $$6,
      T $$7,
      fuu.c<T> $$8,
      Function<T, xc> $$9,
      Function<fuu<T>, xq> $$10,
      fuu.b<T> $$11,
      fri.l<T> $$12,
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
      if (gaf.t()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = azq.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(azq.b(this.d + $$0, $$1.size()));
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
      xc $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.g();
   }

   private xc c(T $$0) {
      return (xc)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private xq d(T $$0) {
      return xb.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected xq d() {
      return this.o.apply(this);
   }

   @Override
   public void a(fyk $$0) {
      $$0.a(fyj.a, this.d());
      if (this.j) {
         T $$1 = this.b(1);
         xc $$2 = this.c($$1);
         if (this.aN_()) {
            $$0.a(fyj.d, xc.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fyj.d, xc.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public xq c() {
      return a_((xc)(this.q ? this.d(this.f) : this.B()));
   }

   public static <T> fuu.a<T> a(Function<T, xc> $$0) {
      return new fuu.a<>($$0);
   }

   public static fuu.a<Boolean> a(xc $$0, xc $$1) {
      return new fuu.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fuu.a<Boolean> e() {
      return new fuu.a<Boolean>($$0 -> $$0 ? xb.b : xb.c).a(b);
   }

   public static fuu.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, xc> c;
      private fri.l<T> d = $$0x -> null;
      private Function<fuu<T>, xq> e = fuu::c;
      private fuu.c<T> f = fuu.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, xc> $$0) {
         this.c = $$0;
      }

      public fuu.a<T> a(Collection<T> $$0) {
         return this.a(fuu.c.a($$0));
      }

      @SafeVarargs
      public final fuu.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fuu.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fuu.c.a(fuu.a, $$0, $$1));
      }

      public fuu.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fuu.c.a($$0, $$1, $$2));
      }

      public fuu.a<T> a(fuu.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fuu.a<T> a(fri.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fuu.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fuu.a<T> a(Function<fuu<T>, xq> $$0) {
         this.e = $$0;
         return this;
      }

      public fuu.a<T> a() {
         this.g = true;
         return this;
      }

      public fuu<T> a(xc $$0, fuu.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fuu<T> a(int $$0, int $$1, int $$2, int $$3, xc $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fuu<T> a(int $$0, int $$1, int $$2, int $$3, xc $$4, fuu.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            xc $$8 = this.c.apply($$7);
            xc $$9 = (xc)(this.g ? $$8 : xb.a($$4, $$8));
            return new fuu<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fuu<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fuu.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fuu.c<T>() {
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

      static <T> fuu.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fuu.c<T>() {
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
