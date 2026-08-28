public class gtb extends gti<gvh, fzb> {
   private static final alj a = alj.b("textures/entity/creeper/creeper_armor.png");
   private final fzb b;

   public gtb(grh<gvh, fzb> $$0, gch $$1) {
      super($$0);
      this.b = new fzb($$1.a(gck.af));
   }

   protected boolean a(gvh $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected alj a() {
      return a;
   }

   protected fzb b() {
      return this.b;
   }
}
