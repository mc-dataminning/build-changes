public class guu extends grd<cph, haq> {
   public static final akv a = akv.b("textures/entity/projectiles/arrow.png");
   public static final akv b = akv.b("textures/entity/projectiles/tipped_arrow.png");

   public guu(gsf.a $$0) {
      super($$0);
   }

   protected akv a(haq $$0) {
      return $$0.d ? b : a;
   }

   public haq a() {
      return new haq();
   }

   public void a(cph $$0, haq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.D() > 0;
   }
}
