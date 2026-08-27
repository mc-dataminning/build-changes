public class fzk extends fzs {
   private static final ayd a = ayd.a();
   private final fzn b;

   fzk(fvm $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fzn $$7) {
      super($$0, $$1, $$2, $$3, 0.5 - a.j(), $$5, 0.5 - a.j());
      this.B = 0.96F;
      this.u = -0.1F;
      this.C = true;
      this.b = $$7;
      this.k *= 0.2F;
      if ($$4 == 0.0 && $$6 == 0.0) {
         this.j *= 0.1F;
         this.l *= 0.1F;
      }

      this.D *= 0.75F;
      this.t = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.n = false;
      this.b($$7);
      if (this.g()) {
         this.e(0.0F);
      }
   }

   @Override
   public fyw b() {
      return fyw.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
      if (this.g()) {
         this.e(0.0F);
      } else {
         this.e(axw.i(0.05F, this.y, 1.0F));
      }
   }

   private boolean g() {
      fcu $$0 = fcu.Q();
      gag $$1 = $$0.s;
      return $$1 != null && $$1.bv().c(this.g, this.h, this.i) <= 9.0 && $$0.m.aA().a() && $$1.gy();
   }

   public static class a implements fyv<kz> {
      private final fzn a;

      public a(fzn $$0) {
         this.a = $$0;
      }

      public fys a(kz $$0, fvm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fzk($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class b implements fyv<ko> {
      private final fzn a;

      public b(fzn $$0) {
         this.a = $$0;
      }

      public fys a(ko $$0, fvm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fys $$8 = new fzk($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.a($$0.b(), $$0.c(), $$0.d());
         $$8.e($$0.e());
         return $$8;
      }
   }

   public static class c implements fyv<kz> {
      private final fzn a;

      public c(fzn $$0) {
         this.a = $$0;
      }

      public fys a(kz $$0, fvm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fzk($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class d implements fyv<kz> {
      private final fzn a;

      public d(fzn $$0) {
         this.a = $$0;
      }

      public fys a(kz $$0, fvm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fzk $$8 = new fzk($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         float $$9 = $$1.z.i() * 0.5F + 0.35F;
         $$8.a(1.0F * $$9, 0.0F * $$9, 1.0F * $$9);
         return $$8;
      }
   }
}
