public class glu extends gkf<cmm, fwn<cmm>> {
   private static final alf a = new alf("textures/entity/villager/villager.png");

   public glu(giz.a $$0) {
      super($$0, new fwn<>($$0.a(fxb.bP)), 0.5F);
      this.a(new gmq<>(this, $$0.f(), $$0.d()));
      this.a(new gnw<>(this, $$0.e(), "villager"));
      this.a(new gmp<>(this, $$0.d()));
   }

   public alf a(cmm $$0) {
      return a;
   }

   protected void a(cmm $$0, faa $$1, float $$2) {
      float $$3 = 0.9375F * $$0.ed();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cmm $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }
}
