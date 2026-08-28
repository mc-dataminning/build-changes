public class gny extends gmv<ciw, fwr<ciw>> {
   private static final alf a = new alf("textures/entity/wither/wither_armor.png");
   private final fwr<ciw> b;

   public gny(gku<ciw, fwr<ciw>> $$0, fwx $$1) {
      super($$0);
      this.b = new fwr<>($$1.a(fxa.bW));
   }

   @Override
   protected float a(float $$0) {
      return ayz.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected alf a() {
      return a;
   }

   @Override
   protected fub<ciw> b() {
      return this.b;
   }
}
