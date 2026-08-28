import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fzq {
   private static final int a = 44;
   private final List<fzq.c> b;
   private final fsf c;

   fzq(List<fzq.c> $$0, fsf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fsf a() {
      return this.c;
   }

   public void b() {
      this.b.forEach(fzq.c::a);
   }

   public static fzq.a a(int $$0) {
      return new fzq.a($$0);
   }

   public static class a {
      final int a;
      private final List<fzq.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<fzq.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void b() {
         this.e++;
      }

      public fzq.d a(wo $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         fzq.d $$3 = new fzq.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public fzq.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fzq.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public fzq a() {
         fsd $$0 = new fsd().b(this.d);
         $$0.a(fsj.a(this.a - 44), 0, 0);
         $$0.a(fsj.a(44), 0, 1);
         List<fzq.c> $$1 = new ArrayList<>();
         this.e = 0;

         for (fzq.d $$2 : this.b) {
            $$1.add($$2.a(this, $$0, 0));
         }

         $$0.a();
         fzq $$3 = new fzq($$1, $$0);
         $$3.b();
         return $$3;
      }

      public fzq.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new fzq.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(fox<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public fox<Boolean> b() {
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
      private final wo a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private wo d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(wo $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public fzq.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public fzq.d a(wo $$0) {
         this.d = $$0;
         return this;
      }

      fzq.c a(fzq.a $$0, fsd $$1, int $$2) {
         $$0.b();
         fpx $$3 = new fpx(this.a, flh.Q().h).c();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<fzq.b> $$4 = $$0.f;
         fox.a<Boolean> $$5 = fox.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            fqb $$7 = fqb.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> wn.a(this.a, $$0x.c(), this.d));
         } else {
            $$5.a($$0x -> wn.a(this.a, $$0x.c()));
         }

         fox<Boolean> $$8 = $$5.a(0, 0, this.f, 20, wo.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               wo $$4x = this.d.f().a(n.h);
               fnz $$5x = flh.Q().h;
               fpk $$6x = new fpk($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.b();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.y() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new fzq.c($$8, this.b, this.e);
      }
   }
}
