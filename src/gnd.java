public class gnd extends gnl<cjd, fuk<cjd>> {
   private static final akk a = new akk("textures/entity/creeper/creeper_armor.png");
   private final fuk<cjd> b;

   public gnd(glk<cjd, fuk<cjd>> $$0, fxm $$1) {
      super($$0);
      this.b = new fuk<>($$1.a(fxp.I));
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
   protected fuq<cjd> b() {
      return this.b;
   }
}
