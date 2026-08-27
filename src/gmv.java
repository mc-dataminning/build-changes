public class gmv extends gmf<cfh, fvn<cfh>> {
   private static final akm a = new akm("textures/entity/wolf/wolf_collar.png");

   public gmv(gjp<cfh, fvn<cfh>> $$0) {
      super($$0);
   }

   public void a(eys $$0, gck $$1, int $$2, cfh $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.s() && !$$3.ch()) {
         float[] $$10 = $$3.gA().d();
         eyw $$11 = $$1.getBuffer(gcs.e(a));
         this.c().a($$0, $$11, $$2, gnm.d, $$10[0], $$10[1], $$10[2], 1.0F);
      }
   }
}
