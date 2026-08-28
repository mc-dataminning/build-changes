public class hak extends gwt<cst, hgj> {
   public static final alr a = alr.b("textures/entity/projectiles/arrow.png");
   public static final alr g = alr.b("textures/entity/projectiles/tipped_arrow.png");

   public hak(gxv.a $$0) {
      super($$0);
   }

   protected alr a(hgj $$0) {
      return $$0.d ? g : a;
   }

   public hgj a() {
      return new hgj();
   }

   public void a(cst $$0, hgj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.y() > 0;
   }
}
