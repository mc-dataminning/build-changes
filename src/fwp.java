public class fwp extends fzb {
   private static final agi a = new agi("textures/entity/zombie/husk.png");

   public fwp(fvx.a $$0) {
      super($$0, fkn.al, fkn.am, fkn.an);
   }

   protected void a(ccb $$0, enw $$1, float $$2) {
      float $$3 = 1.0625F;
      $$1.b(1.0625F, 1.0625F, 1.0625F);
      super.a($$0, $$1, $$2);
   }

   @Override
   public agi a(ccb $$0) {
      return a;
   }
}
