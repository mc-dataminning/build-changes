public class hbz extends hcg<hei, ghs> {
   private static final ali a = ali.b("textures/entity/creeper/creeper_armor.png");
   private final ghs b;

   public hbz(haf<hei, ghs> $$0, gla $$1) {
      super($$0);
      this.b = new ghs($$1.a(gld.ar));
   }

   protected boolean a(hei $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected ali a() {
      return a;
   }

   protected ghs b() {
      return this.b;
   }
}
