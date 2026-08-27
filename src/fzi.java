public class fzi extends fzq<cau, fhj<cau>> {
   private static final agi a = new agi("textures/entity/creeper/creeper_armor.png");
   private final fhj<cau> b;

   public fzi(fxs<cau, fhj<cau>> $$0, fkk $$1) {
      super($$0);
      this.b = new fhj<>($$1.a(fkn.C));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected agi a() {
      return a;
   }

   @Override
   protected fhp<cau> b() {
      return this.b;
   }
}
