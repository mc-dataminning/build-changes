public class gan extends fyu<ccp, fln<ccp>> {
   private static final agt a = new agt("textures/entity/witch.png");

   public gan(fxo.a $$0) {
      super($$0, new fln<>($$0.a(flx.bR)), 0.5F);
      this.a(new gcm<>(this, $$0.d()));
   }

   public void a(ccp $$0, float $$1, float $$2, epd $$3, fsi $$4, int $$5) {
      this.f.b(!$$0.eT().b());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agt a(ccp $$0) {
      return a;
   }

   protected void a(ccp $$0, epd $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }
}
