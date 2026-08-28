public class gol extends gny<cgo, guh, fxa<gsu>> {
   private static final alb a = alb.b("textures/entity/fish/pufferfish.png");
   private final fxa<gsu> b;
   private final fxa<gsu> k;
   private final fxa<gsu> l = this.e();

   public gol(gms.a $$0) {
      super($$0, new fyh($$0.a(gaa.bT)), 0.2F);
      this.k = new fyi($$0.a(gaa.bU));
      this.b = new fyj($$0.a(gaa.bV));
   }

   public alb a(guh $$0) {
      return a;
   }

   public guh c() {
      return new guh();
   }

   public void a(guh $$0, fcu $$1, ggv $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.b;
         case 1 -> this.k;
         default -> this.l;
      };
      this.f = 0.1F + 0.1F * (float)$$0.a;
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(cgo $$0, guh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gq();
   }

   protected void a(guh $$0, fcu $$1, float $$2, float $$3) {
      $$1.a(0.0F, azc.b($$0.p * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
