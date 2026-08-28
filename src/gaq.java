import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class gaq {
   private static final int a = 44;
   private final List<gaq.c> b;
   private final ftf c;

   gaq(List<gaq.c> $$0, ftf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ftf a() {
      return this.c;
   }

   public void b() {
      this.b.forEach(gaq.c::a);
   }

   public static gaq.a a(int $$0) {
      return new gaq.a($$0);
   }

   public static class a {
      final int a;
      private final List<gaq.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<gaq.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void b() {
         this.e++;
      }

      public gaq.d a(wp $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         gaq.d $$3 = new gaq.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public gaq.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public gaq.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public gaq a() {
         ftd $$0 = new ftd().b(this.d);
         $$0.a(ftj.a(this.a - 44), 0, 0);
         $$0.a(ftj.a(44), 0, 1);
         List<gaq.c> $$1 = new ArrayList<>();
         this.e = 0;

         for (gaq.d $$2 : this.b) {
            $$1.add($$2.a(this, $$0, 0));
         }

         $$0.a();
         gaq $$3 = new gaq($$1, $$0);
         $$3.b();
         return $$3;
      }

      public gaq.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new gaq.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(fpx<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public fpx<Boolean> b() {
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

      public gaq.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public gaq.d a(wp $$0) {
         this.d = $$0;
         return this;
      }

      gaq.c a(gaq.a $$0, ftd $$1, int $$2) {
         $$0.b();
         fqx $$3 = new fqx(this.a, fmg.Q().h).c();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<gaq.b> $$4 = $$0.f;
         fpx.a<Boolean> $$5 = fpx.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            frb $$7 = frb.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> wo.a(this.a, $$0x.c(), this.d));
         } else {
            $$5.a($$0x -> wo.a(this.a, $$0x.c()));
         }

         fpx<Boolean> $$8 = $$5.a(0, 0, this.f, 20, wp.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               wp $$4x = this.d.f().a(n.h);
               fpa $$5x = fmg.Q().h;
               fqk $$6x = new fqk($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.b();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.y() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new gaq.c($$8, this.b, this.e);
      }
   }
}
