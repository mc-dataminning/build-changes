import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class gfp {
   private static final int a = 44;
   private final List<gfp.c> b;
   private final fyc c;

   gfp(List<gfp.c> $$0, fyc $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fyc a() {
      return this.c;
   }

   public void b() {
      this.b.forEach(gfp.c::a);
   }

   public static gfp.a a(int $$0) {
      return new gfp.a($$0);
   }

   public static class a {
      final int a;
      private final List<gfp.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<gfp.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void b() {
         this.e++;
      }

      public gfp.d a(xc $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         gfp.d $$3 = new gfp.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public gfp.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public gfp.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public gfp a() {
         fya $$0 = new fya().b(this.d);
         $$0.a(fyg.a(this.a - 44), 0, 0);
         $$0.a(fyg.a(44), 0, 1);
         List<gfp.c> $$1 = new ArrayList<>();
         this.e = 0;

         for (gfp.d $$2 : this.b) {
            $$1.add($$2.a(this, $$0, 0));
         }

         $$0.a();
         gfp $$3 = new gfp($$1, $$0);
         $$3.b();
         return $$3;
      }

      public gfp.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new gfp.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(fuu<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public fuu<Boolean> b() {
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
      private final xc a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private xc d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(xc $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public gfp.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public gfp.d a(xc $$0) {
         this.d = $$0;
         return this;
      }

      gfp.c a(gfp.a $$0, fya $$1, int $$2) {
         $$0.b();
         fvu $$3 = new fvu(this.a, frf.Q().h).c();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<gfp.b> $$4 = $$0.f;
         fuu.a<Boolean> $$5 = fuu.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            fvy $$7 = fvy.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> xb.a(this.a, $$0x.c(), this.d));
         } else {
            $$5.a($$0x -> xb.a(this.a, $$0x.c()));
         }

         fuu<Boolean> $$8 = $$5.a(0, 0, this.f, 20, xc.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               xc $$4x = this.d.f().a(o.h);
               ftx $$5x = frf.Q().h;
               fvh $$6x = new fvh($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.b();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.y() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new gfp.c($$8, this.b, this.e);
      }
   }
}
