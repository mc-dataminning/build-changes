public class gwn extends gvj<hac, gdx> {
   private static final alp a = alp.b("textures/entity/wither/wither_armor.png");
   private final gdx b;

   public gwn(gti<hac, gdx> $$0, gef $$1) {
      super($$0);
      this.b = new gdx($$1.a(gei.dB));
   }

   protected boolean a(hac $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return azu.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected alp a() {
      return a;
   }

   protected gdx b() {
      return this.b;
   }
}
