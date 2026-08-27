public class gkh extends gje<cfr, ftc<cfr>> {
   private static final ajt a = new ajt("textures/entity/wither/wither_armor.png");
   private final ftc<cfr> b;

   public gkh(ghd<cfr, ftc<cfr>> $$0, fti $$1) {
      super($$0);
      this.b = new ftc<>($$1.a(ftl.bW));
   }

   @Override
   protected float a(float $$0) {
      return axk.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected ajt a() {
      return a;
   }

   @Override
   protected fqm<cfr> b() {
      return this.b;
   }
}
