public class gnt extends glz<cju, fyh<cju>> {
   private static final akt a = new akt("textures/entity/witch.png");

   public gnt(gkq.a $$0) {
      super($$0, new fyh<>($$0.a(fyr.ca)), 0.5F);
      this.a(new gpv<>(this, $$0.d()));
   }

   public void a(cju $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      this.h.b(!$$0.fg().d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akt a(cju $$0) {
      return a;
   }

   protected void a(cju $$0, fbc $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }
}
