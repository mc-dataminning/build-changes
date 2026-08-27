public class gct extends gde<cay, fnt<cay>> {
   private static final ajc a = new ajc("textures/entity/iron_golem/iron_golem.png");

   public gct(gby.a $$0) {
      super($$0, new fnt<>($$0.a(fqe.ar)), 0.7F);
      this.a(new gga(this));
      this.a(new ggb(this, $$0.c()));
   }

   public ajc a(cay $$0) {
      return a;
   }

   protected void a(cay $$0, etd $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!((double)$$0.aR.a() < 0.01)) {
         float $$6 = 13.0F;
         float $$7 = $$0.aR.c($$4) + 6.0F;
         float $$8 = (Math.abs($$7 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$8));
      }
   }
}
