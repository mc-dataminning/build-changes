public class gzn extends gvw<crx, hfj> {
   public static final alg a = alg.b("textures/entity/projectiles/arrow.png");
   public static final alg g = alg.b("textures/entity/projectiles/tipped_arrow.png");

   public gzn(gwy.a $$0) {
      super($$0);
   }

   protected alg a(hfj $$0) {
      return $$0.d ? g : a;
   }

   public hfj a() {
      return new hfj();
   }

   public void a(crx $$0, hfj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.y() > 0;
   }
}
