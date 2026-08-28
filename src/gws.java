public class gws extends gvo<hah, gec> {
   private static final alz a = alz.b("textures/entity/wither/wither_armor.png");
   private final gec b;

   public gws(gtn<hah, gec> $$0, gek $$1) {
      super($$0);
      this.b = new gec($$1.a(gen.dv));
   }

   protected boolean a(hah $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return bae.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected alz a() {
      return a;
   }

   protected gec b() {
      return this.b;
   }
}
