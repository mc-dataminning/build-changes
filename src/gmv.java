public class gmv extends gnd<ciz, fuc<ciz>> {
   private static final akk a = new akk("textures/entity/creeper/creeper_armor.png");
   private final fuc<ciz> b;

   public gmv(glc<ciz, fuc<ciz>> $$0, fxe $$1) {
      super($$0);
      this.b = new fuc<>($$1.a(fxh.I));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected akk a() {
      return a;
   }

   @Override
   protected fui<ciz> b() {
      return this.b;
   }
}
