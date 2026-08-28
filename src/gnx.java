public class gnx extends gnh<cgg, fwp<cgg>> {
   private static final ale a = new ale("textures/entity/wolf/wolf_collar.png");

   public gnx(gkr<cgg, fwp<cgg>> $$0) {
      super($$0);
   }

   public void a(ezw $$0, gdm $$1, int $$2, cgg $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.s() && !$$3.ch()) {
         float[] $$10 = $$3.gB().d();
         faa $$11 = $$1.getBuffer(gdu.e(a));
         this.c().a($$0, $$11, $$2, goo.d, $$10[0], $$10[1], $$10[2], 1.0F);
      }
   }
}
