public class gxg extends gwc<hay, ger> {
   private static final akv a = akv.b("textures/entity/wither/wither_armor.png");
   private final ger b;

   public gxg(gub<hay, ger> $$0, gez $$1) {
      super($$0);
      this.b = new ger($$1.a(gfc.dB));
   }

   protected boolean a(hay $$0) {
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

   protected ger b() {
      return this.b;
   }
}
