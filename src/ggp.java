public class ggp extends ggx<cfm, fny<cfm>> {
   private static final ajh a = new ajh("textures/entity/creeper/creeper_armor.png");
   private final fny<cfm> b;

   public ggp(gew<cfm, fny<cfm>> $$0, frb $$1) {
      super($$0);
      this.b = new fny<>($$1.a(fre.I));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected ajh a() {
      return a;
   }

   @Override
   protected foe<cfm> b() {
      return this.b;
   }
}
