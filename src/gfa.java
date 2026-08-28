import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class gfa {
   private static final int a = 44;
   private final List<gfa.c> b;
   private final fxn c;

   gfa(List<gfa.c> $$0, fxn $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fxn a() {
      return this.c;
   }

   public void b() {
      this.b.forEach(gfa.c::a);
   }

   public static gfa.a a(int $$0) {
      return new gfa.a($$0);
   }

   public static class a {
      final int a;
      private final List<gfa.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<gfa.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void b() {
         this.e++;
      }

      public gfa.d a(xg $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         gfa.d $$3 = new gfa.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public gfa.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public gfa.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public gfa a() {
         fxl $$0 = new fxl().b(this.d);
         $$0.a(fxr.a(this.a - 44), 0, 0);
         $$0.a(fxr.a(44), 0, 1);
         List<gfa.c> $$1 = new ArrayList<>();
         this.e = 0;

         for (gfa.d $$2 : this.b) {
            $$1.add($$2.a(this, $$0, 0));
         }

         $$0.a();
         gfa $$3 = new gfa($$1, $$0);
         $$3.b();
         return $$3;
      }

      public gfa.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new gfa.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(fuf<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public fuf<Boolean> b() {
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
      private final xg a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private xg d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(xg $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public gfa.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public gfa.d a(xg $$0) {
         this.d = $$0;
         return this;
      }

      gfa.c a(gfa.a $$0, fxl $$1, int $$2) {
         $$0.b();
         fvf $$3 = new fvf(this.a, fqq.Q().h).c();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<gfa.b> $$4 = $$0.f;
         fuf.a<Boolean> $$5 = fuf.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            fvj $$7 = fvj.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> xf.a(this.a, $$0x.c(), this.d));
         } else {
            $$5.a($$0x -> xf.a(this.a, $$0x.c()));
         }

         fuf<Boolean> $$8 = $$5.a(0, 0, this.f, 20, xg.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               xg $$4x = this.d.f().a(o.h);
               fti $$5x = fqq.Q().h;
               fus $$6x = new fus($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.b();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.y() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new gfa.c($$8, this.b, this.e);
      }
   }
}
