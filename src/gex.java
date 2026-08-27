public class gex extends gde<cfw, fpu<cfw>> {
   private static final ajc a = new ajc("textures/entity/witch.png");

   public gex(gby.a $$0) {
      super($$0, new fpu<>($$0.a(fqe.bQ)), 0.5F);
      this.a(new ggw<>(this, $$0.d()));
   }

   public void a(cfw $$0, float $$1, float $$2, etd $$3, fwq $$4, int $$5) {
      this.f.b(!$$0.eR().b());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajc a(cfw $$0) {
      return a;
   }

   protected void a(cfw $$0, etd $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }
}
