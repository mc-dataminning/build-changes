public class goq extends goa<cfv, fxh<cfv>> {
   private static final akk a = new akk("textures/entity/wolf/wolf_collar.png");

   public goq(glk<cfv, fxh<cfv>> $$0) {
      super($$0);
   }

   public void a(fao $$0, gef $$1, int $$2, cfv $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.s() && !$$3.cj()) {
         float[] $$10 = $$3.gy().d();
         fas $$11 = $$1.getBuffer(gen.e(a));
         this.c().a($$0, $$11, $$2, gph.d, $$10[0], $$10[1], $$10[2], 1.0F);
      }
   }
}
