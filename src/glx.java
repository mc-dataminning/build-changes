public class glx extends gkd<ckt, fwp<ckt>> {
   private static final alf a = new alf("textures/entity/witch.png");

   public glx(gix.a $$0) {
      super($$0, new fwp<>($$0.a(fwz.bU)), 0.5F);
      this.a(new gnw<>(this, $$0.d()));
   }

   public void a(ckt $$0, float $$1, float $$2, ezy $$3, gdo $$4, int $$5) {
      this.f.b(!$$0.eX().e());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public alf a(ckt $$0) {
      return a;
   }

   protected void a(ckt $$0, ezy $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }
}
