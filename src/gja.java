public class gja extends gjy<cfk, ftx<cfk>> {
   private static final alb a = new alb("textures/entity/fox/fox.png");
   private static final alb i = new alb("textures/entity/fox/fox_sleep.png");
   private static final alb j = new alb("textures/entity/fox/snow_fox.png");
   private static final alb k = new alb("textures/entity/fox/snow_fox_sleep.png");

   public gja(gis.a $$0) {
      super($$0, new ftx<>($$0.a(fwu.ad)), 0.4F);
      this.a(new gmr(this, $$0.d()));
   }

   protected void a(cfk $$0, ezt $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gw() || $$0.gq()) {
         float $$6 = -ayu.i($$4, $$0.P, $$0.dH());
         $$1.a(a.b.rotationDegrees($$6));
      }
   }

   public alb a(cfk $$0) {
      if ($$0.u() == cfk.v.a) {
         return $$0.fL() ? i : a;
      } else {
         return $$0.fL() ? k : j;
      }
   }
}
