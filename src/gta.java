public class gta extends grw<gwo, gap> {
   private static final alh a = alh.b("textures/entity/wither/wither_armor.png");
   private final gap b;

   public gta(gpv<gwo, gap> $$0, gax $$1) {
      super($$0);
      this.b = new gap($$1.a(gba.da));
   }

   protected boolean a(gwo $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return azj.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected alh a() {
      return a;
   }

   protected gap b() {
      return this.b;
   }
}
