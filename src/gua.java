public class gua extends gqj<cpx, gzt> {
   public static final alp a = alp.b("textures/entity/projectiles/arrow.png");
   public static final alp b = alp.b("textures/entity/projectiles/tipped_arrow.png");

   public gua(grl.a $$0) {
      super($$0);
   }

   protected alp a(gzt $$0) {
      return $$0.d ? b : a;
   }

   public gzt a() {
      return new gzt();
   }

   public void a(cpx $$0, gzt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.D() > 0;
   }
}
