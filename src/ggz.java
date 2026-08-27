public class ggz extends ggj<cbp, fpw<cbp>> {
   private static final ajc a = new ajc("textures/entity/wolf/wolf_collar.png");

   public ggz(gdt<cbp, fpw<cbp>> $$0) {
      super($$0);
   }

   public void a(etd $$0, fwq $$1, int $$2, cbp $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.u() && !$$3.cb()) {
         float[] $$10 = $$3.gu().d();
         eth $$11 = $$1.getBuffer(fwy.e(a));
         this.c().a($$0, $$11, $$2, ghq.d, $$10[0], $$10[1], $$10[2], 1.0F);
      }
   }
}
