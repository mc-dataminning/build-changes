public class gya extends gxn<cjt, heb, gfy<hcn>> {
   private static final alg a = alg.b("textures/entity/fish/pufferfish.png");
   private final gfy<hcn> j;
   private final gfy<hcn> k;
   private final gfy<hcn> l = this.c();

   public gya(gwh.a $$0) {
      super($$0, new ghg($$0.a(gjb.cE)), 0.2F);
      this.k = new ghh($$0.a(gjb.cF));
      this.j = new ghi($$0.a(gjb.cG));
   }

   public alg a(heb $$0) {
      return a;
   }

   public heb b() {
      return new heb();
   }

   protected float b(heb $$0) {
      return 0.1F + 0.1F * (float)$$0.a;
   }

   public void a(heb $$0, fjj $$1, gqa $$2, int $$3) {
      this.g = switch ($$0.a) {
         case 0 -> this.j;
         case 1 -> this.k;
         default -> this.l;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(cjt $$0, heb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.x();
   }

   protected void a(heb $$0, fjj $$1, float $$2, float $$3) {
      $$1.a(0.0F, azm.b($$0.u * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
