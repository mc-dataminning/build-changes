public class gqy extends gnj<cow, gwq> {
   public static final ali a = ali.b("textures/entity/projectiles/arrow.png");
   public static final ali b = ali.b("textures/entity/projectiles/tipped_arrow.png");

   public gqy(gok.a $$0) {
      super($$0);
   }

   protected ali a(gwq $$0) {
      return $$0.d ? b : a;
   }

   public gwq a() {
      return new gwq();
   }

   public void a(cow $$0, gwq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.D() > 0;
   }
}
