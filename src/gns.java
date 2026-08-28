public class gns extends goa<cjn, fuy<cjn>> {
   private static final akq a = akq.b("textures/entity/creeper/creeper_armor.png");
   private final fuy<cjn> b;

   public gns(glz<cjn, fuy<cjn>> $$0, fya $$1) {
      super($$0);
      this.b = new fuy<>($$1.a(fyd.J));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected akq a() {
      return a;
   }

   @Override
   protected fve<cjn> b() {
      return this.b;
   }
}
