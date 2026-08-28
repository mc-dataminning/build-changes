public class gyo extends gux<cri, hej> {
   public static final alg a = alg.b("textures/entity/projectiles/arrow.png");
   public static final alg g = alg.b("textures/entity/projectiles/tipped_arrow.png");

   public gyo(gvz.a $$0) {
      super($$0);
   }

   protected alg a(hej $$0) {
      return $$0.d ? g : a;
   }

   public hej a() {
      return new hej();
   }

   public void a(cri $$0, hej $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.y() > 0;
   }
}
