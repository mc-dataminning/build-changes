public class fzn extends fzv<caz, fho<caz>> {
   private static final agm a = new agm("textures/entity/creeper/creeper_armor.png");
   private final fho<caz> b;

   public fzn(fxx<caz, fho<caz>> $$0, fkp $$1) {
      super($$0);
      this.b = new fho<>($$1.a(fks.C));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected agm a() {
      return a;
   }

   @Override
   protected fhu<caz> b() {
      return this.b;
   }
}
