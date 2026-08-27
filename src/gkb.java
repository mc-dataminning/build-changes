public class gkb extends gkj<chd, frl<chd>> {
   private static final akf a = new akf("textures/entity/creeper/creeper_armor.png");
   private final frl<chd> b;

   public gkb(gii<chd, frl<chd>> $$0, fun $$1) {
      super($$0);
      this.b = new frl<>($$1.a(fuq.I));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected akf a() {
      return a;
   }

   @Override
   protected frr<chd> b() {
      return this.b;
   }
}
