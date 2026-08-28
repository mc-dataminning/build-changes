public class gvh extends gvo<gxo, gbe> {
   private static final alz a = alz.b("textures/entity/creeper/creeper_armor.png");
   private final gbe b;

   public gvh(gtn<gxo, gbe> $$0, gek $$1) {
      super($$0);
      this.b = new gbe($$1.a(gen.ag));
   }

   protected boolean a(gxo $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected alz a() {
      return a;
   }

   protected gbe b() {
      return this.b;
   }
}
