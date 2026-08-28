import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fvw {
   private static final int a = 44;
   private final List<fvw.c> b;

   fvw(List<fvw.c> $$0) {
      this.b = $$0;
   }

   public void a() {
      this.b.forEach(fvw.c::a);
   }

   public static fvw.a a(int $$0) {
      return new fvw.a($$0);
   }

   public static class a {
      final int a;
      private final List<fvw.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<fvw.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void a() {
         this.e++;
      }

      public fvw.d a(xh $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         fvw.d $$3 = new fvw.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public fvw.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fvw.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public fvw a(Consumer<fop> $$0) {
         fom $$1 = new fom().b(this.d);
         $$1.a(fot.a(this.a - 44), 0, 0);
         $$1.a(fot.a(44), 0, 1);
         List<fvw.c> $$2 = new ArrayList<>();
         this.e = 0;

         for (fvw.d $$3 : this.b) {
            $$2.add($$3.a(this, $$1, 0));
         }

         $$1.a();
         $$0.accept($$1);
         fvw $$4 = new fvw($$2);
         $$4.a();
         return $$4;
      }

      public fvw.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new fvw.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(flg<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public flg<Boolean> b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }

      @Nullable
      public BooleanSupplier d() {
         return this.c;
      }
   }

   public static class d {
      private final xh a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private xh d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(xh $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public fvw.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public fvw.d a(xh $$0) {
         this.d = $$0;
         return this;
      }

      fvw.c a(fvw.a $$0, fom $$1, int $$2) {
         $$0.a();
         fmg $$3 = new fmg(this.a, fja.Q().h).c();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<fvw.b> $$4 = $$0.f;
         flg.a<Boolean> $$5 = flg.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            fmk $$7 = fmk.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> xg.a(this.a, $$0x.c(), this.d));
         } else {
            $$5.a($$0x -> xg.a(this.a, $$0x.c()));
         }

         flg<Boolean> $$8 = $$5.a(0, 0, this.f, 20, xh.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               xh $$4x = this.d.f().a(n.h);
               fkk $$5x = fja.Q().h;
               flt $$6x = new flt($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.a();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.w() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new fvw.c($$8, this.b, this.e);
      }
   }
}
