public class had extends gzq<ckl, hgf, gic<her>> {
   private static final alk a = alk.b("textures/entity/fish/pufferfish.png");
   private final gic<her> j;
   private final gic<her> k;
   private final gic<her> l = this.c();

   public had(gyk.a $$0) {
      super($$0, new gjk($$0.a(glf.cE)), 0.2F);
      this.k = new gjl($$0.a(glf.cF));
      this.j = new gjm($$0.a(glf.cG));
   }

   public alk a(hgf $$0) {
      return a;
   }

   public hgf b() {
      return new hgf();
   }

   protected float b(hgf $$0) {
      return 0.1F + 0.1F * (float)$$0.a;
   }

   public void a(hgf $$0, flq $$1, gsc $$2, int $$3) {
      this.g = switch ($$0.a) {
         case 0 -> this.j;
         case 1 -> this.k;
         default -> this.l;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(ckl $$0, hgf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.x();
   }

   protected void a(hgf $$0, flq $$1, float $$2, float $$3) {
      $$1.a(0.0F, azq.b($$0.u * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
