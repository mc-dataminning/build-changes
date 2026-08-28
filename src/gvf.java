public class gvf extends gvm<gxm, gbc> {
   private static final alz a = alz.b("textures/entity/creeper/creeper_armor.png");
   private final gbc b;

   public gvf(gtl<gxm, gbc> $$0, gei $$1) {
      super($$0);
      this.b = new gbc($$1.a(gel.ag));
   }

   protected boolean a(gxm $$0) {
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

   protected gbc b() {
      return this.b;
   }
}
