public class fvz extends fwh<byn, fei<byn>> {
   private static final aer a = new aer("textures/entity/creeper/creeper_armor.png");
   private final fei<byn> b;

   public fvz(fuj<byn, fei<byn>> $$0, fhj $$1) {
      super($$0);
      this.b = new fei<>($$1.a(fhm.C));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected aer a() {
      return a;
   }

   @Override
   protected feo<byn> b() {
      return this.b;
   }
}
