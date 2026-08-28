public class gqn extends gmy<cor, gwf> {
   public static final alh a = alh.b("textures/entity/projectiles/arrow.png");
   public static final alh b = alh.b("textures/entity/projectiles/tipped_arrow.png");

   public gqn(gnz.a $$0) {
      super($$0);
   }

   protected alh a(gwf $$0) {
      return $$0.d ? b : a;
   }

   public gwf a() {
      return new gwf();
   }

   public void a(cor $$0, gwf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.E() > 0;
   }
}
