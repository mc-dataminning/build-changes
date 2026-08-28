import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class gec {
   private static final int a = 44;
   private final List<gec.c> b;
   private final fwp c;

   gec(List<gec.c> $$0, fwp $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fwp a() {
      return this.c;
   }

   public void b() {
      this.b.forEach(gec.c::a);
   }

   public static gec.a a(int $$0) {
      return new gec.a($$0);
   }

   public static class a {
      final int a;
      private final List<gec.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<gec.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void b() {
         this.e++;
      }

      public gec.d a(wy $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         gec.d $$3 = new gec.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public gec.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public gec.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public gec a() {
         fwn $$0 = new fwn().b(this.d);
         $$0.a(fwt.a(this.a - 44), 0, 0);
         $$0.a(fwt.a(44), 0, 1);
         List<gec.c> $$1 = new ArrayList<>();
         this.e = 0;

         for (gec.d $$2 : this.b) {
            $$1.add($$2.a(this, $$0, 0));
         }

         $$0.a();
         gec $$3 = new gec($$1, $$0);
         $$3.b();
         return $$3;
      }

      public gec.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new gec.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(fth<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public fth<Boolean> b() {
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

      public gec.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public gec.d a(wy $$0) {
         this.d = $$0;
         return this;
      }

      gec.c a(gec.a $$0, fwn $$1, int $$2) {
         $$0.b();
         fuh $$3 = new fuh(this.a, fpt.Q().h).c();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<gec.b> $$4 = $$0.f;
         fth.a<Boolean> $$5 = fth.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            ful $$7 = ful.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> wx.a(this.a, $$0x.c(), this.d));
         } else {
            $$5.a($$0x -> wx.a(this.a, $$0x.c()));
         }

         fth<Boolean> $$8 = $$5.a(0, 0, this.f, 20, wy.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               wy $$4x = this.d.f().a(o.h);
               fsk $$5x = fpt.Q().h;
               ftu $$6x = new ftu($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.b();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.y() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new gec.c($$8, this.b, this.e);
      }
   }
}
