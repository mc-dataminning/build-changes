public class fvc extends fui<cao, fgy<cao>> {
   private static final agg a = new agg("textures/entity/zombie/drowned.png");

   public fvc(fvk.a $$0) {
      super($$0, new fgy<>($$0.a(fka.L)), new fgy<>($$0.a(fka.M)), new fgy<>($$0.a(fka.N)));
      this.a(new fza<>(this, $$0.f()));
   }

   @Override
   public agg a(cbt $$0) {
      return a;
   }

   protected void a(cao $$0, enk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.a($$4);
      if ($$5 > 0.0F) {
         float $$6 = -10.0F - $$0.dD();
         float $$7 = ati.i($$5, 0.0F, $$6);
         $$1.a(a.b.rotationDegrees($$7), 0.0F, $$0.dg() / 2.0F, 0.0F);
      }
   }
}
