public class goi extends gns<cfr, fwz<cfr>> {
   private static final akk a = new akk("textures/entity/wolf/wolf_collar.png");

   public goi(glc<cfr, fwz<cfr>> $$0) {
      super($$0);
   }

   public void a(fag $$0, gdx $$1, int $$2, cfr $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.s() && !$$3.ch()) {
         float[] $$10 = $$3.gy().d();
         fak $$11 = $$1.getBuffer(gef.e(a));
         this.c().a($$0, $$11, $$2, goz.d, $$10[0], $$10[1], $$10[2], 1.0F);
      }
   }
}
