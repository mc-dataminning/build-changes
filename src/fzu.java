import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fzu {
   private static final int a = 44;
   private final List<fzu.c> b;
   private final fsj c;

   fzu(List<fzu.c> $$0, fsj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fsj a() {
      return this.c;
   }

   public void b() {
      this.b.forEach(fzu.c::a);
   }

   public static fzu.a a(int $$0) {
      return new fzu.a($$0);
   }

   public static class a {
      final int a;
      private final List<fzu.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<fzu.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void b() {
         this.e++;
      }

      public fzu.d a(wp $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         fzu.d $$3 = new fzu.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public fzu.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fzu.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public fzu a() {
         fsh $$0 = new fsh().b(this.d);
         $$0.a(fsn.a(this.a - 44), 0, 0);
         $$0.a(fsn.a(44), 0, 1);
         List<fzu.c> $$1 = new ArrayList<>();
         this.e = 0;

         for (fzu.d $$2 : this.b) {
            $$1.add($$2.a(this, $$0, 0));
         }

         $$0.a();
         fzu $$3 = new fzu($$1, $$0);
         $$3.b();
         return $$3;
      }

      public fzu.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new fzu.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(fpb<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public fpb<Boolean> b() {
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
      private final wp a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private wp d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(wp $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public fzu.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public fzu.d a(wp $$0) {
         this.d = $$0;
         return this;
      }

      fzu.c a(fzu.a $$0, fsh $$1, int $$2) {
         $$0.b();
         fqb $$3 = new fqb(this.a, flk.Q().h).c();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<fzu.b> $$4 = $$0.f;
         fpb.a<Boolean> $$5 = fpb.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            fqf $$7 = fqf.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> wo.a(this.a, $$0x.c(), this.d));
         } else {
            $$5.a($$0x -> wo.a(this.a, $$0x.c()));
         }

         fpb<Boolean> $$8 = $$5.a(0, 0, this.f, 20, wp.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               wp $$4x = this.d.f().a(n.h);
               fod $$5x = flk.Q().h;
               fpo $$6x = new fpo($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.b();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.y() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new fzu.c($$8, this.b, this.e);
      }
   }
}
