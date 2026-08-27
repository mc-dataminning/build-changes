public class fyw extends gag<ccm, fkh<ccm>> {
   private static final ahh a = new ahh("textures/entity/enderman/enderman.png");
   private final auw i = auw.a();

   public fyw(fza.a $$0) {
      super($$0, new fkh<>($$0.a(fni.T)), 0.5F);
      this.a(new gcv<>(this));
      this.a(new gcm(this, $$0.c()));
   }

   public void a(ccm $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5) {
      djp $$6 = $$0.gf();
      fkh<ccm> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gg();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public emc a(ccm $$0, float $$1) {
      if ($$0.gg()) {
         double $$2 = 0.02 * (double)$$0.dZ();
         return new emc(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public ahh a(ccm $$0) {
      return a;
   }
}
