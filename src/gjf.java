public class gjf extends gkd<cfp, fuc<cfp>> {
   private static final alf a = new alf("textures/entity/fox/fox.png");
   private static final alf i = new alf("textures/entity/fox/fox_sleep.png");
   private static final alf j = new alf("textures/entity/fox/snow_fox.png");
   private static final alf k = new alf("textures/entity/fox/snow_fox_sleep.png");

   public gjf(gix.a $$0) {
      super($$0, new fuc<>($$0.a(fwz.ad)), 0.4F);
      this.a(new gmw(this, $$0.d()));
   }

   protected void a(cfp $$0, ezy $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gw() || $$0.gq()) {
         float $$6 = -ayz.i($$4, $$0.P, $$0.dH());
         $$1.a(a.b.rotationDegrees($$6));
      }
   }

   public alf a(cfp $$0) {
      if ($$0.u() == cfp.v.a) {
         return $$0.fL() ? i : a;
      } else {
         return $$0.fL() ? k : j;
      }
   }
}
