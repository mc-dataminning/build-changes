public class ghp extends giz<ciu, fsu<ciu>> {
   private static final akn a = new akn("textures/entity/enderman/enderman.png");
   private final aym i = aym.a();

   public ghp(ght.a $$0) {
      super($$0, new fsu<>($$0.a(fvv.X)), 0.5F);
      this.a(new glp<>(this));
      this.a(new glg(this, $$0.c()));
   }

   public void a(ciu $$0, float $$1, float $$2, eyu $$3, gck $$4, int $$5) {
      drd $$6 = $$0.gp();
      fsu<ciu> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gq();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public eum a(ciu $$0, float $$1) {
      if ($$0.gq()) {
         double $$2 = 0.02 * (double)$$0.ee();
         return new eum(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public akn a(ciu $$0) {
      return a;
   }
}
