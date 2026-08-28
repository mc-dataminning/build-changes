public class gym extends gxz<cjy, hen, ggk<hcz>> {
   private static final alg a = alg.b("textures/entity/fish/pufferfish.png");
   private final ggk<hcz> j;
   private final ggk<hcz> k;
   private final ggk<hcz> l = this.c();

   public gym(gwt.a $$0) {
      super($$0, new ghs($$0.a(gjn.cE)), 0.2F);
      this.k = new ght($$0.a(gjn.cF));
      this.j = new ghu($$0.a(gjn.cG));
   }

   public alg a(hen $$0) {
      return a;
   }

   public hen b() {
      return new hen();
   }

   protected float b(hen $$0) {
      return 0.1F + 0.1F * (float)$$0.a;
   }

   public void a(hen $$0, fjy $$1, gqm $$2, int $$3) {
      this.g = switch ($$0.a) {
         case 0 -> this.j;
         case 1 -> this.k;
         default -> this.l;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(cjy $$0, hen $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.x();
   }

   protected void a(hen $$0, fjy $$1, float $$2, float $$3) {
      $$1.a(0.0F, azm.b($$0.u * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
