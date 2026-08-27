public class gic extends ghm<cch, fqw<cch>> {
   private static final ajh a = new ajh("textures/entity/wolf/wolf_collar.png");

   public gic(gew<cch, fqw<cch>> $$0) {
      super($$0);
   }

   public void a(eub $$0, fxs $$1, int $$2, cch $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.r() && !$$3.ce()) {
         float[] $$10 = $$3.gw().d();
         euf $$11 = $$1.getBuffer(fya.e(a));
         this.c().a($$0, $$11, $$2, git.d, $$10[0], $$10[1], $$10[2], 1.0F);
      }
   }
}
