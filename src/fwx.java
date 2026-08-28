public class fwx<T extends bsd> extends fwt<T> {
   private boolean b;

   public fwx(fxi $$0) {
      super($$0);
   }

   public static fxo c() {
      fxq $$0 = fwt.b();
      fxr $$1 = $$0.a();
      fxr $$2 = $$1.a("head", fxn.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), fxk.a);
      fxr $$3 = $$2.a("hat", fxn.c().a(0, 64).a(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F), fxk.a(-5.0F, -10.03125F, -5.0F));
      fxr $$4 = $$3.a("hat2", fxn.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F), fxk.a(1.75F, -4.0F, 2.0F, -0.05235988F, 0.0F, 0.02617994F));
      fxr $$5 = $$4.a("hat3", fxn.c().a(0, 87).a(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), fxk.a(1.75F, -4.0F, 2.0F, -0.10471976F, 0.0F, 0.05235988F));
      $$5.a(
         "hat4", fxn.c().a(0, 95).a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new fxm(0.25F)), fxk.a(1.75F, -2.0F, 2.0F, (float) (-Math.PI / 15), 0.0F, 0.10471976F)
      );
      fxr $$6 = $$2.a("nose");
      $$6.a("mole", fxn.c().a(0, 0).a(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, new fxm(-0.25F)), fxk.a(0.0F, -2.0F, 0.0F));
      return fxo.a($$0, 64, 128);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a.a(0.0F, -2.0F, 0.0F);
      float $$6 = 0.01F * (float)($$0.al() % 10);
      this.a.e = aye.a((float)$$0.ai * $$6) * 4.5F * (float) (Math.PI / 180.0);
      this.a.f = 0.0F;
      this.a.g = aye.b((float)$$0.ai * $$6) * 2.5F * (float) (Math.PI / 180.0);
      if (this.b) {
         this.a.a(0.0F, 1.0F, -1.5F);
         this.a.e = -0.9F;
      }
   }

   public fxi e() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }
}
