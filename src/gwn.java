public class gwn extends gvj<crl, hcr> {
   private static final ale a = ale.b("textures/entity/llama/spit.png");
   private final gfx g;

   public gwn(gvk.a $$0) {
      super($$0);
      this.g = new gfx($$0.a(gif.bE));
   }

   public void a(hcr $$0, fiq $$1, gpd $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.g.a($$0);
      fiu $$4 = $$2.getBuffer(this.g.a(a));
      this.g.a($$1, $$4, $$3, hhp.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hcr a() {
      return new hcr();
   }

   public void a(crl $$0, hcr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.l($$2);
   }
}
