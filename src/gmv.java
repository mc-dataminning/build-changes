public class gmv extends gmf<cfj, fvn<cfj>> {
   private static final akn a = new akn("textures/entity/wolf/wolf_collar.png");

   public gmv(gjp<cfj, fvn<cfj>> $$0) {
      super($$0);
   }

   public void a(eyu $$0, gck $$1, int $$2, cfj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.s() && !$$3.ch()) {
         float[] $$10 = $$3.gA().d();
         eyy $$11 = $$1.getBuffer(gcs.e(a));
         this.c().a($$0, $$11, $$2, gnm.d, $$10[0], $$10[1], $$10[2], 1.0F);
      }
   }
}
