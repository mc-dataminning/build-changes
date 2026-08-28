public class gpp extends gny<cni, gvd, fzl> {
   private static final alb a = alb.b("textures/entity/wandering_trader.png");

   public gpp(gms.a $$0) {
      super($$0, new fzl($$0.a(gaa.cV)), 0.5F);
      this.a(new gqk<>(this, $$0.f(), $$0.b()));
      this.a(new gqj<>(this, $$0.b()));
   }

   public alb a(gvd $$0) {
      return a;
   }

   protected void a(gvd $$0, fcu $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   public gvd c() {
      return new gvd();
   }

   public void a(cni $$0, gvd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q() > 0;
   }
}
