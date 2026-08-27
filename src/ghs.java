public class ghs extends gid<ceb, fsq<ceb>> {
   private static final akh a = new akh("textures/entity/iron_golem/iron_golem.png");

   public ghs(ggx.a $$0) {
      super($$0, new fsq<>($$0.a(fva.av)), 0.7F);
      this.a(new gkz(this));
      this.a(new gla(this, $$0.c()));
   }

   public akh a(ceb $$0) {
      return a;
   }

   protected void a(ceb $$0, exx $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!((double)$$0.aV.a() < 0.01)) {
         float $$6 = 13.0F;
         float $$7 = $$0.aV.c($$4) + 6.0F;
         float $$8 = (Math.abs($$7 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$8));
      }
   }
}
