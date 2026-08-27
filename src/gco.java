public class gco extends gcw<cci, fkd<cci>> {
   private static final ahh a = new ahh("textures/entity/creeper/creeper_armor.png");
   private final fkd<cci> b;

   public gco(gav<cci, fkd<cci>> $$0, fnf $$1) {
      super($$0);
      this.b = new fkd<>($$1.a(fni.E));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected ahh a() {
      return a;
   }

   @Override
   protected fkj<cci> b() {
      return this.b;
   }
}
