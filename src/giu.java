public class giu extends gke<cju, ftz<cju>> {
   private static final alf a = new alf("textures/entity/enderman/enderman.png");
   private final azh i = azh.a();

   public giu(giy.a $$0) {
      super($$0, new ftz<>($$0.a(fxa.X)), 0.5F);
      this.a(new gmu<>(this));
      this.a(new gml(this, $$0.c()));
   }

   public void a(cju $$0, float $$1, float $$2, ezz $$3, gdp $$4, int $$5) {
      dsd $$6 = $$0.gq();
      ftz<cju> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gr();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public evs a(cju $$0, float $$1) {
      if ($$0.gr()) {
         double $$2 = 0.02 * (double)$$0.ee();
         return new evs(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public alf a(cju $$0) {
      return a;
   }
}
