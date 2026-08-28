public class gvt extends gwa<gyb, gbs> {
   private static final aku a = aku.b("textures/entity/creeper/creeper_armor.png");
   private final gbs b;

   public gvt(gtz<gyb, gbs> $$0, gey $$1) {
      super($$0);
      this.b = new gbs($$1.a(gfb.aj));
   }

   protected boolean a(gyb $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected aku a() {
      return a;
   }

   protected gbs b() {
      return this.b;
   }
}
