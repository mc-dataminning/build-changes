public class fwl<T extends bte & cjv> extends fvd<T> {
   public fwl(fxq $$0) {
      super($$0);
   }

   public static fxw e() {
      fxy $$0 = fvd.a(fxu.a, 0.0F);
      fxz $$1 = $$0.a();
      a($$1);
      return fxw.a($$0, 64, 32);
   }

   protected static void a(fxz $$0) {
      $$0.a("right_arm", fxv.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxs.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", fxv.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxs.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", fxv.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxs.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", fxv.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxs.a(2.0F, 12.0F, 0.0F));
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fvd.a.a;
      this.r = fvd.a.a;
      cud $$4 = $$0.b(bqg.a);
      if ($$4.a(cug.ov) && $$0.ge()) {
         if ($$0.fs() == bsw.b) {
            this.s = fvd.a.d;
         } else {
            this.r = fvd.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cud $$6 = $$0.eV();
      if ($$0.ge() && ($$6.e() || !$$6.a(cug.ov))) {
         float $$7 = ayg.a(this.c * (float) Math.PI);
         float $$8 = ayg.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         ftn.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bsw $$0, fao $$1) {
      float $$2 = $$0 == bsw.b ? 1.0F : -1.0F;
      fxq $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
