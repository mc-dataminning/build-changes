public class gks extends gkc<cdl, ftm<cdl>> {
   private static final ajv a = new ajv("textures/entity/wolf/wolf_collar.png");

   public gks(ghm<cdl, ftm<cdl>> $$0) {
      super($$0);
   }

   public void a(ewr $$0, gai $$1, int $$2, cdl $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.r() && !$$3.ce()) {
         float[] $$10 = $$3.gy().d();
         ewv $$11 = $$1.getBuffer(gaq.e(a));
         this.c().a($$0, $$11, $$2, glj.d, $$10[0], $$10[1], $$10[2], 1.0F);
      }
   }
}
