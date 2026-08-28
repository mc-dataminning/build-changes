public class gxd extends gvz<hav, geo> {
   private static final aku a = aku.b("textures/entity/wither/wither_armor.png");
   private final geo b;

   public gxd(gty<hav, geo> $$0, gew $$1) {
      super($$0);
      this.b = new geo($$1.a(gez.dB));
   }

   protected boolean a(hav $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return ayy.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected aku a() {
      return a;
   }

   protected geo b() {
      return this.b;
   }
}
