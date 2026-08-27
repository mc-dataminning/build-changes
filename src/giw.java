public class giw extends gje<cgl, fqg<cgl>> {
   private static final ajt a = new ajt("textures/entity/creeper/creeper_armor.png");
   private final fqg<cgl> b;

   public giw(ghd<cgl, fqg<cgl>> $$0, fti $$1) {
      super($$0);
      this.b = new fqg<>($$1.a(ftl.I));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected ajt a() {
      return a;
   }

   @Override
   protected fqm<cgl> b() {
      return this.b;
   }
}
