public class fxz<T extends bsr> extends fxv<T> {
   private boolean b;

   public fxz(fyk $$0) {
      super($$0);
   }

   public static fyq c() {
      fys $$0 = fxv.b();
      fyt $$1 = $$0.a();
      fyt $$2 = $$1.a("head", fyp.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), fym.a);
      fyt $$3 = $$2.a("hat", fyp.c().a(0, 64).a(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F), fym.a(-5.0F, -10.03125F, -5.0F));
      fyt $$4 = $$3.a("hat2", fyp.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F), fym.a(1.75F, -4.0F, 2.0F, -0.05235988F, 0.0F, 0.02617994F));
      fyt $$5 = $$4.a("hat3", fyp.c().a(0, 87).a(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), fym.a(1.75F, -4.0F, 2.0F, -0.10471976F, 0.0F, 0.05235988F));
      $$5.a(
         "hat4", fyp.c().a(0, 95).a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new fyo(0.25F)), fym.a(1.75F, -2.0F, 2.0F, (float) (-Math.PI / 15), 0.0F, 0.10471976F)
      );
      fyt $$6 = $$2.a("nose");
      $$6.a("mole", fyp.c().a(0, 0).a(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, new fyo(-0.25F)), fym.a(0.0F, -2.0F, 0.0F));
      return fyq.a($$0, 64, 128);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a.a(0.0F, -2.0F, 0.0F);
      float $$6 = 0.01F * (float)($$0.an() % 10);
      this.a.e = ayo.a((float)$$0.ai * $$6) * 4.5F * (float) (Math.PI / 180.0);
      this.a.f = 0.0F;
      this.a.g = ayo.b((float)$$0.ai * $$6) * 2.5F * (float) (Math.PI / 180.0);
      if (this.b) {
         this.a.a(0.0F, 1.0F, -1.5F);
         this.a.e = -0.9F;
      }
   }

   public fyk e() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }
}
