public class glx extends gll<ckf, gsi> {
   private static final alb a = alb.b("textures/entity/skeleton/bogged.png");
   private static final alb b = alb.b("textures/entity/skeleton/bogged_overlay.png");

   public glx(gms.a $$0) {
      super($$0, gaa.x, gaa.y, new fwj($$0.a(gaa.w)));
      this.a(new gri<>(this, $$0.f(), gaa.z, b));
   }

   public alb a(gsi $$0) {
      return a;
   }

   public gsi a() {
      return new gsi();
   }

   public void a(ckf $$0, gsi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gs();
   }
}
