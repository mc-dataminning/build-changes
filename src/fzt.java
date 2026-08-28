import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fzt {
   private static final int a = 44;
   private final List<fzt.c> b;
   private final fsi c;

   fzt(List<fzt.c> $$0, fsi $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fsi a() {
      return this.c;
   }

   public void b() {
      this.b.forEach(fzt.c::a);
   }

   public static fzt.a a(int $$0) {
      return new fzt.a($$0);
   }

   public static class a {
      final int a;
      private final List<fzt.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<fzt.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void b() {
         this.e++;
      }

      public fzt.d a(wp $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         fzt.d $$3 = new fzt.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public fzt.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fzt.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public fzt a() {
         fsg $$0 = new fsg().b(this.d);
         $$0.a(fsm.a(this.a - 44), 0, 0);
         $$0.a(fsm.a(44), 0, 1);
         List<fzt.c> $$1 = new ArrayList<>();
         this.e = 0;

         for (fzt.d $$2 : this.b) {
            $$1.add($$2.a(this, $$0, 0));
         }

         $$0.a();
         fzt $$3 = new fzt($$1, $$0);
         $$3.b();
         return $$3;
      }

      public fzt.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new fzt.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(fpa<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public fpa<Boolean> b() {
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

      public fzt.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public fzt.d a(wp $$0) {
         this.d = $$0;
         return this;
      }

      fzt.c a(fzt.a $$0, fsg $$1, int $$2) {
         $$0.b();
         fqa $$3 = new fqa(this.a, flj.Q().h).c();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<fzt.b> $$4 = $$0.f;
         fpa.a<Boolean> $$5 = fpa.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            fqe $$7 = fqe.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> wo.a(this.a, $$0x.c(), this.d));
         } else {
            $$5.a($$0x -> wo.a(this.a, $$0x.c()));
         }

         fpa<Boolean> $$8 = $$5.a(0, 0, this.f, 20, wp.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               wp $$4x = this.d.f().a(n.h);
               foc $$5x = flj.Q().h;
               fpn $$6x = new fpn($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.b();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.y() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new fzt.c($$8, this.b, this.e);
      }
   }
}
