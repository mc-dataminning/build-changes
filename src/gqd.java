public class gqd extends gpq<chk, gwa, fyk<gun>> {
   private static final ali a = ali.b("textures/entity/fish/pufferfish.png");
   private final fyk<gun> b;
   private final fyk<gun> k;
   private final fyk<gun> l = this.e();

   public gqd(gok.a $$0) {
      super($$0, new fzr($$0.a(gbl.bU)), 0.2F);
      this.k = new fzs($$0.a(gbl.bV));
      this.b = new fzt($$0.a(gbl.bW));
   }

   public ali a(gwa $$0) {
      return a;
   }

   public gwa c() {
      return new gwa();
   }

   public void a(gwa $$0, feb $$1, gih $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.b;
         case 1 -> this.k;
         default -> this.l;
      };
      this.f = 0.1F + 0.1F * (float)$$0.a;
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(chk $$0, gwa $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gw();
   }

   protected void a(gwa $$0, feb $$1, float $$2, float $$3) {
      $$1.a(0.0F, azk.b($$0.p * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
