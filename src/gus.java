public class gus extends grb<cpf, hao> {
   public static final akv a = akv.b("textures/entity/projectiles/arrow.png");
   public static final akv b = akv.b("textures/entity/projectiles/tipped_arrow.png");

   public gus(gsd.a $$0) {
      super($$0);
   }

   protected akv a(hao $$0) {
      return $$0.d ? b : a;
   }

   public hao a() {
      return new hao();
   }

   public void a(cpf $$0, hao $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.D() > 0;
   }
}
