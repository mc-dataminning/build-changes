public class gny extends gni<cgh, fwq<cgh>> {
   private static final ale a = new ale("textures/entity/wolf/wolf_collar.png");

   public gny(gks<cgh, fwq<cgh>> $$0) {
      super($$0);
   }

   public void a(ezx $$0, gdn $$1, int $$2, cgh $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.s() && !$$3.ch()) {
         float[] $$10 = $$3.gB().d();
         fab $$11 = $$1.getBuffer(gdv.e(a));
         this.c().a($$0, $$11, $$2, gop.d, $$10[0], $$10[1], $$10[2], 1.0F);
      }
   }
}
