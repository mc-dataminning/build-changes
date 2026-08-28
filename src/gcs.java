import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class gcs {
   private static final int a = 44;
   private final List<gcs.c> b;
   private final fvf c;

   gcs(List<gcs.c> $$0, fvf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fvf a() {
      return this.c;
   }

   public void b() {
      this.b.forEach(gcs.c::a);
   }

   public static gcs.a a(int $$0) {
      return new gcs.a($$0);
   }

   public static class a {
      final int a;
      private final List<gcs.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<gcs.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void b() {
         this.e++;
      }

      public gcs.d a(ww $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         gcs.d $$3 = new gcs.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public gcs.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public gcs.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public gcs a() {
         fvd $$0 = new fvd().b(this.d);
         $$0.a(fvj.a(this.a - 44), 0, 0);
         $$0.a(fvj.a(44), 0, 1);
         List<gcs.c> $$1 = new ArrayList<>();
         this.e = 0;

         for (gcs.d $$2 : this.b) {
            $$1.add($$2.a(this, $$0, 0));
         }

         $$0.a();
         gcs $$3 = new gcs($$1, $$0);
         $$3.b();
         return $$3;
      }

      public gcs.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new gcs.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(frx<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public frx<Boolean> b() {
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
      private final ww a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private ww d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(ww $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public gcs.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public gcs.d a(ww $$0) {
         this.d = $$0;
         return this;
      }

      gcs.c a(gcs.a $$0, fvd $$1, int $$2) {
         $$0.b();
         fsx $$3 = new fsx(this.a, fof.Q().h).c();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<gcs.b> $$4 = $$0.f;
         frx.a<Boolean> $$5 = frx.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            ftb $$7 = ftb.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> wv.a(this.a, $$0x.c(), this.d));
         } else {
            $$5.a($$0x -> wv.a(this.a, $$0x.c()));
         }

         frx<Boolean> $$8 = $$5.a(0, 0, this.f, 20, ww.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               ww $$4x = this.d.f().a(n.h);
               fra $$5x = fof.Q().h;
               fsk $$6x = new fsk($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.b();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.y() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new gcs.c($$8, this.b, this.e);
      }
   }
}
