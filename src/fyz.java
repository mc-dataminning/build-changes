import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fyz {
   private static final int a = 44;
   private final List<fyz.c> b;

   fyz(List<fyz.c> $$0) {
      this.b = $$0;
   }

   public void a() {
      this.b.forEach(fyz.c::a);
   }

   public static fyz.a a(int $$0) {
      return new fyz.a($$0);
   }

   public static class a {
      final int a;
      private final List<fyz.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<fyz.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void a() {
         this.e++;
      }

      public fyz.d a(xv $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         fyz.d $$3 = new fyz.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public fyz.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fyz.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public fyz a(Consumer<frp> $$0) {
         frm $$1 = new frm().b(this.d);
         $$1.a(frs.a(this.a - 44), 0, 0);
         $$1.a(frs.a(44), 0, 1);
         List<fyz.c> $$2 = new ArrayList<>();
         this.e = 0;

         for (fyz.d $$3 : this.b) {
            $$2.add($$3.a(this, $$1, 0));
         }

         $$1.a();
         $$0.accept($$1);
         fyz $$4 = new fyz($$2);
         $$4.a();
         return $$4;
      }

      public fyz.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new fyz.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(fof<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public fof<Boolean> b() {
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
      private final xv a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private xv d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(xv $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public fyz.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public fyz.d a(xv $$0) {
         this.d = $$0;
         return this;
      }

      fyz.c a(fyz.a $$0, frm $$1, int $$2) {
         $$0.a();
         fpg $$3 = new fpg(this.a, flz.Q().h).c();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<fyz.b> $$4 = $$0.f;
         fof.a<Boolean> $$5 = fof.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            fpk $$7 = fpk.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> xu.a(this.a, $$0x.c(), this.d));
         } else {
            $$5.a($$0x -> xu.a(this.a, $$0x.c()));
         }

         fof<Boolean> $$8 = $$5.a(0, 0, this.f, 20, xv.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               xv $$4x = this.d.f().a(n.h);
               fnj $$5x = flz.Q().h;
               fot $$6x = new fot($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.a();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.w() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new fyz.c($$8, this.b, this.e);
      }
   }
}
