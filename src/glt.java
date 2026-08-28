public class glt extends gke<cml, fwm<cml>> {
   private static final alf a = new alf("textures/entity/villager/villager.png");

   public glt(giy.a $$0) {
      super($$0, new fwm<>($$0.a(fxa.bP)), 0.5F);
      this.a(new gmp<>(this, $$0.f(), $$0.d()));
      this.a(new gnv<>(this, $$0.e(), "villager"));
      this.a(new gmo<>(this, $$0.d()));
   }

   public alf a(cml $$0) {
      return a;
   }

   protected void a(cml $$0, ezz $$1, float $$2) {
      float $$3 = 0.9375F * $$0.ed();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cml $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }
}
