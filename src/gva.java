public class gva extends gvh<gxh, gax> {
   private static final alz a = alz.b("textures/entity/creeper/creeper_armor.png");
   private final gax b;

   public gva(gtg<gxh, gax> $$0, ged $$1) {
      super($$0);
      this.b = new gax($$1.a(geg.ag));
   }

   protected boolean a(gxh $$0) {
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

   protected gax b() {
      return this.b;
   }
}
