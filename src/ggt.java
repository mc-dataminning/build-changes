public class ggt extends gid<cid, frz<cid>> {
   private static final akh a = new akh("textures/entity/enderman/enderman.png");
   private final ayg i = ayg.a();

   public ggt(ggx.a $$0) {
      super($$0, new frz<>($$0.a(fva.X)), 0.5F);
      this.a(new gks<>(this));
      this.a(new gkj(this, $$0.c()));
   }

   public void a(cid $$0, float $$1, float $$2, exx $$3, gbo $$4, int $$5) {
      dqh $$6 = $$0.gp();
      frz<cid> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gq();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public etp a(cid $$0, float $$1) {
      if ($$0.gq()) {
         double $$2 = 0.02 * (double)$$0.ec();
         return new etp(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public akh a(cid $$0) {
      return a;
   }
}
