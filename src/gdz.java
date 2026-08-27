public class gdz extends gcw<cbp, fmz<cbp>> {
   private static final ahh a = new ahh("textures/entity/wither/wither_armor.png");
   private final fmz<cbp> b;

   public gdz(gav<cbp, fmz<cbp>> $$0, fnf $$1) {
      super($$0);
      this.b = new fmz<>($$1.a(fni.bS));
   }

   @Override
   protected float a(float $$0) {
      return aup.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected ahh a() {
      return a;
   }

   @Override
   protected fkj<cbp> b() {
      return this.b;
   }
}
