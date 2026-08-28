public class haz extends gxi<csk, hgv> {
   public static final alk a = alk.b("textures/entity/projectiles/arrow.png");
   public static final alk g = alk.b("textures/entity/projectiles/tipped_arrow.png");

   public haz(gyk.a $$0) {
      super($$0);
   }

   protected alk a(hgv $$0) {
      return $$0.d ? g : a;
   }

   public hgv a() {
      return new hgv();
   }

   public void a(csk $$0, hgv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.y() > 0;
   }
}
