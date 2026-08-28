public class gju extends gks<cfb, fuq<cfb>> {
   private static final akk a = new akk("textures/entity/fox/fox.png");
   private static final akk i = new akk("textures/entity/fox/fox_sleep.png");
   private static final akk j = new akk("textures/entity/fox/snow_fox.png");
   private static final akk k = new akk("textures/entity/fox/snow_fox_sleep.png");

   public gju(gjm.a $$0) {
      super($$0, new fuq<>($$0.a(fxn.ad)), 0.4F);
      this.a(new gnl(this, $$0.d()));
   }

   protected void a(cfb $$0, fam $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gu() || $$0.go()) {
         float $$6 = -ayg.i($$4, $$0.P, $$0.dI());
         $$1.a(a.b.rotationDegrees($$6));
      }
   }

   public akk a(cfb $$0) {
      if ($$0.u() == cfb.v.a) {
         return $$0.fI() ? i : a;
      } else {
         return $$0.fI() ? k : j;
      }
   }
}
