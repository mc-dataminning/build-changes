public class gyw extends gvf<crn, her> {
   public static final alg a = alg.b("textures/entity/projectiles/arrow.png");
   public static final alg g = alg.b("textures/entity/projectiles/tipped_arrow.png");

   public gyw(gwh.a $$0) {
      super($$0);
   }

   protected alg a(her $$0) {
      return $$0.d ? g : a;
   }

   public her a() {
      return new her();
   }

   public void a(crn $$0, her $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.y() > 0;
   }
}
