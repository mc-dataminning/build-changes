public class gpr extends gmr<coz, gsu> {
   private static final alb a = alb.b("textures/entity/projectiles/wind_charge.png");
   private final fzn b;

   public gpr(gms.a $$0) {
      super($$0);
      this.b = new fzn($$0.a(gaa.cW));
   }

   @Override
   public void a(gsu $$0, fcu $$1, ggv $$2, int $$3) {
      fcy $$4 = $$2.getBuffer(ghe.a(a, this.a($$0.p) % 1.0F, 0.0F));
      this.b.a($$0);
      this.b.a($$1, $$4, $$3, gwb.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public alb a(gsu $$0) {
      return a;
   }

   @Override
   public gsu b() {
      return new gsu();
   }
}
