public class gnb extends gnj<cjc, fui<cjc>> {
   private static final akk a = new akk("textures/entity/creeper/creeper_armor.png");
   private final fui<cjc> b;

   public gnb(gli<cjc, fui<cjc>> $$0, fxk $$1) {
      super($$0);
      this.b = new fui<>($$1.a(fxn.I));
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
   protected fuo<cjc> b() {
      return this.b;
   }
}
