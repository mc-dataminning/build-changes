public class gia extends ggx<ces, fqv<ces>> {
   private static final ajh a = new ajh("textures/entity/wither/wither_armor.png");
   private final fqv<ces> b;

   public gia(gew<ces, fqv<ces>> $$0, frb $$1) {
      super($$0);
      this.b = new fqv<>($$1.a(fre.bW));
   }

   @Override
   protected float a(float $$0) {
      return aww.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected ajh a() {
      return a;
   }

   @Override
   protected foe<ces> b() {
      return this.b;
   }
}
