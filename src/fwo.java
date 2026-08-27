public class fwo extends fww<bza, fes<bza>> {
   private static final aez a = new aez("textures/entity/creeper/creeper_armor.png");
   private final fes<bza> b;

   public fwo(fuy<bza, fes<bza>> $$0, fht $$1) {
      super($$0);
      this.b = new fes<>($$1.a(fhw.C));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected aez a() {
      return a;
   }

   @Override
   protected fey<bza> b() {
      return this.b;
   }
}
