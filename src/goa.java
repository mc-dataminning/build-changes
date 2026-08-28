public class goa extends gnk<cgj, fws<cgj>> {
   private static final alf a = new alf("textures/entity/wolf/wolf_collar.png");

   public goa(gku<cgj, fws<cgj>> $$0) {
      super($$0);
   }

   public void a(ezz $$0, gdp $$1, int $$2, cgj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.s() && !$$3.ch()) {
         float[] $$10 = $$3.gB().d();
         fad $$11 = $$1.getBuffer(gdx.e(a));
         this.c().a($$0, $$11, $$2, gor.d, $$10[0], $$10[1], $$10[2], 1.0F);
      }
   }
}
