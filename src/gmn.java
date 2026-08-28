public class gmn extends gmv<cjq, ftv<cjq>> {
   private static final alf a = new alf("textures/entity/creeper/creeper_armor.png");
   private final ftv<cjq> b;

   public gmn(gku<cjq, ftv<cjq>> $$0, fwx $$1) {
      super($$0);
      this.b = new ftv<>($$1.a(fxa.I));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected alf a() {
      return a;
   }

   @Override
   protected fub<cjq> b() {
      return this.b;
   }
}
