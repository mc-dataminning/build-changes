import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fwg {
   private static final int a = 44;
   private final List<fwg.c> b;

   fwg(List<fwg.c> $$0) {
      this.b = $$0;
   }

   public void a() {
      this.b.forEach(fwg.c::a);
   }

   public static fwg.a a(int $$0) {
      return new fwg.a($$0);
   }

   public static class a {
      final int a;
      private final List<fwg.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<fwg.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void a() {
         this.e++;
      }

      public fwg.d a(xi $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         fwg.d $$3 = new fwg.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public fwg.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fwg.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public fwg a(Consumer<foy> $$0) {
         fov $$1 = new fov().b(this.d);
         $$1.a(fpb.a(this.a - 44), 0, 0);
         $$1.a(fpb.a(44), 0, 1);
         List<fwg.c> $$2 = new ArrayList<>();
         this.e = 0;

         for (fwg.d $$3 : this.b) {
            $$2.add($$3.a(this, $$1, 0));
         }

         $$1.a();
         $$0.accept($$1);
         fwg $$4 = new fwg($$2);
         $$4.a();
         return $$4;
      }

      public fwg.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new fwg.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(flo<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public flo<Boolean> b() {
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
      private final xi a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private xi d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(xi $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public fwg.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public fwg.d a(xi $$0) {
         this.d = $$0;
         return this;
      }

      fwg.c a(fwg.a $$0, fov $$1, int $$2) {
         $$0.a();
         fmo $$3 = new fmo(this.a, fji.Q().h).c();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<fwg.b> $$4 = $$0.f;
         flo.a<Boolean> $$5 = flo.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            fms $$7 = fms.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> xh.a(this.a, $$0x.c(), this.d));
         } else {
            $$5.a($$0x -> xh.a(this.a, $$0x.c()));
         }

         flo<Boolean> $$8 = $$5.a(0, 0, this.f, 20, xi.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               xi $$4x = this.d.f().a(n.h);
               fks $$5x = fji.Q().h;
               fmb $$6x = new fmb($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.a();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.w() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new fwg.c($$8, this.b, this.e);
      }
   }
}
