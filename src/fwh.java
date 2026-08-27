public class fwh extends fxd<cbc, fht<cbc>> {
   private static final agi a = new agi("textures/entity/ghast/ghast.png");
   private static final agi i = new agi("textures/entity/ghast/ghast_shooting.png");

   public fwh(fvx.a $$0) {
      super($$0, new fht<>($$0.a(fkn.aa)), 1.5F);
   }

   public agi a(cbc $$0) {
      return $$0.u() ? i : a;
   }

   protected void a(cbc $$0, enw $$1, float $$2) {
      float $$3 = 1.0F;
      float $$4 = 4.5F;
      float $$5 = 4.5F;
      $$1.b(4.5F, 4.5F, 4.5F);
   }
}
