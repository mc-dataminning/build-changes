public class gpg extends glr<cny, gux> {
   public static final alb a = alb.b("textures/entity/projectiles/arrow.png");
   public static final alb b = alb.b("textures/entity/projectiles/tipped_arrow.png");

   public gpg(gms.a $$0) {
      super($$0);
   }

   public alb a(gux $$0) {
      return $$0.d ? b : a;
   }

   public gux a() {
      return new gux();
   }

   public void a(cny $$0, gux $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.D() > 0;
   }
}
