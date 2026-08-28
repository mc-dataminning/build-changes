public class hdk extends hcg<hhc, gks> {
   private static final ali a = ali.b("textures/entity/wither/wither_armor.png");
   private final gks b;

   public hdk(haf<hhc, gks> $$0, gla $$1) {
      super($$0);
      this.b = new gks($$1.a(gld.dV));
   }

   protected boolean a(hhc $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return azo.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected ali a() {
      return a;
   }

   protected gks b() {
      return this.b;
   }
}
