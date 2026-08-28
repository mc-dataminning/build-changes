public class gml extends gmt<cjo, ftt<cjo>> {
   private static final ale a = new ale("textures/entity/creeper/creeper_armor.png");
   private final ftt<cjo> b;

   public gml(gks<cjo, ftt<cjo>> $$0, fwv $$1) {
      super($$0);
      this.b = new ftt<>($$1.a(fwy.I));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected ale a() {
      return a;
   }

   @Override
   protected ftz<cjo> b() {
      return this.b;
   }
}
