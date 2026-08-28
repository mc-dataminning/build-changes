import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class gde {
   private static final int a = 44;
   private final List<gde.c> b;
   private final fvr c;

   gde(List<gde.c> $$0, fvr $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fvr a() {
      return this.c;
   }

   public void b() {
      this.b.forEach(gde.c::a);
   }

   public static gde.a a(int $$0) {
      return new gde.a($$0);
   }

   public static class a {
      final int a;
      private final List<gde.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<gde.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void b() {
         this.e++;
      }

      public gde.d a(wy $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         gde.d $$3 = new gde.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public gde.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public gde.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public gde a() {
         fvp $$0 = new fvp().b(this.d);
         $$0.a(fvv.a(this.a - 44), 0, 0);
         $$0.a(fvv.a(44), 0, 1);
         List<gde.c> $$1 = new ArrayList<>();
         this.e = 0;

         for (gde.d $$2 : this.b) {
            $$1.add($$2.a(this, $$0, 0));
         }

         $$0.a();
         gde $$3 = new gde($$1, $$0);
         $$3.b();
         return $$3;
      }

      public gde.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new gde.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(fsj<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public fsj<Boolean> b() {
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
      private final wy a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private wy d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(wy $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public gde.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public gde.d a(wy $$0) {
         this.d = $$0;
         return this;
      }

      gde.c a(gde.a $$0, fvp $$1, int $$2) {
         $$0.b();
         ftj $$3 = new ftj(this.a, fos.Q().h).c();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<gde.b> $$4 = $$0.f;
         fsj.a<Boolean> $$5 = fsj.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            ftn $$7 = ftn.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> wx.a(this.a, $$0x.c(), this.d));
         } else {
            $$5.a($$0x -> wx.a(this.a, $$0x.c()));
         }

         fsj<Boolean> $$8 = $$5.a(0, 0, this.f, 20, wy.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               wy $$4x = this.d.f().a(n.h);
               frm $$5x = fos.Q().h;
               fsw $$6x = new fsw($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.b();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.y() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new gde.c($$8, this.b, this.e);
      }
   }
}
