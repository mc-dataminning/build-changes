public class gpy extends gpi<cfh, fyj<cfh>> {
   private static final akt a = new akt("textures/entity/wolf/wolf_collar.png");

   public gpy(gmp<cfh, fyj<cfh>> $$0) {
      super($$0);
   }

   public void a(fbc $$0, gfg $$1, int $$2, cfh $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.r() && !$$3.cm()) {
         float[] $$10 = $$3.gJ().d();
         fbg $$11 = $$1.getBuffer(gfo.e(a));
         this.c().a($$0, $$11, $$2, gqp.d, $$10[0], $$10[1], $$10[2], 1.0F);
      }
   }
}
