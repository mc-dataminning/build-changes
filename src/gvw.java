public class gvw extends gwd<gye, gbu> {
   private static final akv a = akv.b("textures/entity/creeper/creeper_armor.png");
   private final gbu b;

   public gvw(guc<gye, gbu> $$0, gfa $$1) {
      super($$0);
      this.b = new gbu($$1.a(gfd.aj));
   }

   protected boolean a(gye $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected akv a() {
      return a;
   }

   protected gbu b() {
      return this.b;
   }
}
