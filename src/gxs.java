public class gxs extends gxf<cjp, hdt, gfq<hcf>> {
   private static final alg a = alg.b("textures/entity/fish/pufferfish.png");
   private final gfq<hcf> j;
   private final gfq<hcf> k;
   private final gfq<hcf> l = this.c();

   public gxs(gvz.a $$0) {
      super($$0, new ggy($$0.a(git.cC)), 0.2F);
      this.k = new ggz($$0.a(git.cD));
      this.j = new gha($$0.a(git.cE));
   }

   public alg a(hdt $$0) {
      return a;
   }

   public hdt b() {
      return new hdt();
   }

   protected float b(hdt $$0) {
      return 0.1F + 0.1F * (float)$$0.a;
   }

   public void a(hdt $$0, fjc $$1, gps $$2, int $$3) {
      this.g = switch ($$0.a) {
         case 0 -> this.j;
         case 1 -> this.k;
         default -> this.l;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(cjp $$0, hdt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.x();
   }

   protected void a(hdt $$0, fjc $$1, float $$2, float $$3) {
      $$1.a(0.0F, azm.b($$0.u * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
