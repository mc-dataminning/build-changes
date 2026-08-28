public class gtl extends gsh<gwz, gba> {
   private static final ali a = ali.b("textures/entity/wither/wither_armor.png");
   private final gba b;

   public gtl(gqg<gwz, gba> $$0, gbi $$1) {
      super($$0);
      this.b = new gba($$1.a(gbl.da));
   }

   protected boolean a(gwz $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return azk.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected ali a() {
      return a;
   }

   protected gba b() {
      return this.b;
   }
}
