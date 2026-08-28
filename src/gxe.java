public class gxe extends gwa<haw, geq> {
   private static final aku a = aku.b("textures/entity/wither/wither_armor.png");
   private final geq b;

   public gxe(gtz<haw, geq> $$0, gey $$1) {
      super($$0);
      this.b = new geq($$1.a(gfb.dB));
   }

   protected boolean a(haw $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return ayz.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected aku a() {
      return a;
   }

   protected geq b() {
      return this.b;
   }
}
