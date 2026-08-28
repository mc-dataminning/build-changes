public class gwr extends gvn<hag, geb> {
   private static final alz a = alz.b("textures/entity/wither/wither_armor.png");
   private final geb b;

   public gwr(gtm<hag, geb> $$0, gej $$1) {
      super($$0);
      this.b = new geb($$1.a(gem.dv));
   }

   protected boolean a(hag $$0) {
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

   protected geb b() {
      return this.b;
   }
}
