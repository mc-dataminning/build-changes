public class gat extends fzq<cab, fke<cab>> {
   private static final agi a = new agi("textures/entity/wither/wither_armor.png");
   private final fke<cab> b;

   public gat(fxs<cab, fke<cab>> $$0, fkk $$1) {
      super($$0);
      this.b = new fke<>($$1.a(fkn.bP));
   }

   @Override
   protected float a(float $$0) {
      return atm.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected agi a() {
      return a;
   }

   @Override
   protected fhp<cab> b() {
      return this.b;
   }
}
