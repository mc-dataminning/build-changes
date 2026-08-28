public class hal extends gzi<hec, ghu> {
   private static final ale a = ale.b("textures/entity/wither/wither_armor.png");
   private final ghu b;

   public hal(gxh<hec, ghu> $$0, gic $$1) {
      super($$0);
      this.b = new ghu($$1.a(gif.dN));
   }

   protected boolean a(hec $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return azk.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected ale a() {
      return a;
   }

   protected ghu b() {
      return this.b;
   }
}
