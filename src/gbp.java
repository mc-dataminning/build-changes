import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class gbp {
   private static final int a = 44;
   private final List<gbp.c> b;
   private final fuc c;

   gbp(List<gbp.c> $$0, fuc $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fuc a() {
      return this.c;
   }

   public void b() {
      this.b.forEach(gbp.c::a);
   }

   public static gbp.a a(int $$0) {
      return new gbp.a($$0);
   }

   public static class a {
      final int a;
      private final List<gbp.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<gbp.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void b() {
         this.e++;
      }

      public gbp.d a(wv $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         gbp.d $$3 = new gbp.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public gbp.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public gbp.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public gbp a() {
         fua $$0 = new fua().b(this.d);
         $$0.a(fug.a(this.a - 44), 0, 0);
         $$0.a(fug.a(44), 0, 1);
         List<gbp.c> $$1 = new ArrayList<>();
         this.e = 0;

         for (gbp.d $$2 : this.b) {
            $$1.add($$2.a(this, $$0, 0));
         }

         $$0.a();
         gbp $$3 = new gbp($$1, $$0);
         $$3.b();
         return $$3;
      }

      public gbp.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new gbp.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(fqu<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public fqu<Boolean> b() {
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
      private final wv a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private wv d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(wv $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public gbp.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public gbp.d a(wv $$0) {
         this.d = $$0;
         return this;
      }

      gbp.c a(gbp.a $$0, fua $$1, int $$2) {
         $$0.b();
         fru $$3 = new fru(this.a, fnd.Q().h).c();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<gbp.b> $$4 = $$0.f;
         fqu.a<Boolean> $$5 = fqu.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            fry $$7 = fry.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> wu.a(this.a, $$0x.c(), this.d));
         } else {
            $$5.a($$0x -> wu.a(this.a, $$0x.c()));
         }

         fqu<Boolean> $$8 = $$5.a(0, 0, this.f, 20, wv.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               wv $$4x = this.d.f().a(n.h);
               fpx $$5x = fnd.Q().h;
               frh $$6x = new frh($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.b();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.y() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new gbp.c($$8, this.b, this.e);
      }
   }
}
