public class gjd extends gkb<cfn, fua<cfn>> {
   private static final ale a = new ale("textures/entity/fox/fox.png");
   private static final ale i = new ale("textures/entity/fox/fox_sleep.png");
   private static final ale j = new ale("textures/entity/fox/snow_fox.png");
   private static final ale k = new ale("textures/entity/fox/snow_fox_sleep.png");

   public gjd(giv.a $$0) {
      super($$0, new fua<>($$0.a(fwx.ad)), 0.4F);
      this.a(new gmu(this, $$0.d()));
   }

   protected void a(cfn $$0, ezw $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gw() || $$0.gq()) {
         float $$6 = -ayx.i($$4, $$0.P, $$0.dH());
         $$1.a(a.b.rotationDegrees($$6));
      }
   }

   public ale a(cfn $$0) {
      if ($$0.u() == cfn.v.a) {
         return $$0.fL() ? i : a;
      } else {
         return $$0.fL() ? k : j;
      }
   }
}
