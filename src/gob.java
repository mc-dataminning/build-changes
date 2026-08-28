public class gob extends gnl<cgk, fwt<cgk>> {
   private static final alf a = new alf("textures/entity/wolf/wolf_collar.png");

   public gob(gkv<cgk, fwt<cgk>> $$0) {
      super($$0);
   }

   public void a(faa $$0, gdq $$1, int $$2, cgk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.s() && !$$3.ch()) {
         float[] $$10 = $$3.gB().d();
         fae $$11 = $$1.getBuffer(gdy.e(a));
         this.c().a($$0, $$11, $$2, gos.d, $$10[0], $$10[1], $$10[2], 1.0F);
      }
   }
}
