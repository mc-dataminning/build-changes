import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class gfn {
   private static final int a = 44;
   private final List<gfn.c> b;
   private final fya c;

   gfn(List<gfn.c> $$0, fya $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fya a() {
      return this.c;
   }

   public void b() {
      this.b.forEach(gfn.c::a);
   }

   public static gfn.a a(int $$0) {
      return new gfn.a($$0);
   }

   public static class a {
      final int a;
      private final List<gfn.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<gfn.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void b() {
         this.e++;
      }

      public gfn.d a(xa $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         gfn.d $$3 = new gfn.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public gfn.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public gfn.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public gfn a() {
         fxy $$0 = new fxy().b(this.d);
         $$0.a(fye.a(this.a - 44), 0, 0);
         $$0.a(fye.a(44), 0, 1);
         List<gfn.c> $$1 = new ArrayList<>();
         this.e = 0;

         for (gfn.d $$2 : this.b) {
            $$1.add($$2.a(this, $$0, 0));
         }

         $$0.a();
         gfn $$3 = new gfn($$1, $$0);
         $$3.b();
         return $$3;
      }

      public gfn.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new gfn.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(fus<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public fus<Boolean> b() {
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
      private final xa a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private xa d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(xa $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public gfn.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public gfn.d a(xa $$0) {
         this.d = $$0;
         return this;
      }

      gfn.c a(gfn.a $$0, fxy $$1, int $$2) {
         $$0.b();
         fvs $$3 = new fvs(this.a, frd.Q().h).c();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<gfn.b> $$4 = $$0.f;
         fus.a<Boolean> $$5 = fus.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            fvw $$7 = fvw.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> wz.a(this.a, $$0x.c(), this.d));
         } else {
            $$5.a($$0x -> wz.a(this.a, $$0x.c()));
         }

         fus<Boolean> $$8 = $$5.a(0, 0, this.f, 20, xa.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               xa $$4x = this.d.f().a(o.h);
               ftv $$5x = frd.Q().h;
               fvf $$6x = new fvf($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.b();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.y() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new gfn.c($$8, this.b, this.e);
      }
   }
}
