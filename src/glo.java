public class glo extends gky<cdw, fui<cdw>> {
   private static final akf a = new akf("textures/entity/wolf/wolf_collar.png");

   public glo(gii<cdw, fui<cdw>> $$0) {
      super($$0);
   }

   public void a(exn $$0, gbe $$1, int $$2, cdw $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.r() && !$$3.cf()) {
         float[] $$10 = $$3.gA().d();
         exr $$11 = $$1.getBuffer(gbm.e(a));
         this.c().a($$0, $$11, $$2, gmf.d, $$10[0], $$10[1], $$10[2], 1.0F);
      }
   }
}
