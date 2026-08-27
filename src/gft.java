public class gft extends gfd<caw, fot<caw>> {
   private static final aiy a = new aiy("textures/entity/wolf/wolf_collar.png");

   public gft(gcn<caw, fot<caw>> $$0) {
      super($$0);
   }

   public void a(esa $$0, fvl $$1, int $$2, caw $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.u() && !$$3.ce()) {
         float[] $$10 = $$3.gp().d();
         ese $$11 = $$1.getBuffer(fvt.e(a));
         this.c().a($$0, $$11, $$2, ggk.d, $$10[0], $$10[1], $$10[2], 1.0F);
      }
   }
}
