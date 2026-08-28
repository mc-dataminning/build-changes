public class git extends gkd<cjt, fty<cjt>> {
   private static final alf a = new alf("textures/entity/enderman/enderman.png");
   private final azh i = azh.a();

   public git(gix.a $$0) {
      super($$0, new fty<>($$0.a(fwz.X)), 0.5F);
      this.a(new gmt<>(this));
      this.a(new gmk(this, $$0.c()));
   }

   public void a(cjt $$0, float $$1, float $$2, ezy $$3, gdo $$4, int $$5) {
      dsc $$6 = $$0.gq();
      fty<cjt> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gr();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public evr a(cjt $$0, float $$1) {
      if ($$0.gr()) {
         double $$2 = 0.02 * (double)$$0.ee();
         return new evr(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public alf a(cjt $$0) {
      return a;
   }
}
