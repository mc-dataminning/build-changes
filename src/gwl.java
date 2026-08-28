public class gwl extends gvh<haa, gdv> {
   private static final alz a = alz.b("textures/entity/wither/wither_armor.png");
   private final gdv b;

   public gwl(gtg<haa, gdv> $$0, ged $$1) {
      super($$0);
      this.b = new gdv($$1.a(geg.dv));
   }

   protected boolean a(haa $$0) {
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

   protected gdv b() {
      return this.b;
   }
}
