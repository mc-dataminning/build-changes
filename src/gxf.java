public class gxf extends gwb<hax, geq> {
   private static final akv a = akv.b("textures/entity/wither/wither_armor.png");
   private final geq b;

   public gxf(gua<hax, geq> $$0, gey $$1) {
      super($$0);
      this.b = new geq($$1.a(gfb.dB));
   }

   protected boolean a(hax $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return ayz.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected akv a() {
      return a;
   }

   protected geq b() {
      return this.b;
   }
}
