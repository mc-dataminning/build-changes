public class gzi extends gvr<cru, hfd> {
   public static final alg a = alg.b("textures/entity/projectiles/arrow.png");
   public static final alg g = alg.b("textures/entity/projectiles/tipped_arrow.png");

   public gzi(gwt.a $$0) {
      super($$0);
   }

   protected alg a(hfd $$0) {
      return $$0.d ? g : a;
   }

   public hfd a() {
      return new hfd();
   }

   public void a(cru $$0, hfd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.y() > 0;
   }
}
