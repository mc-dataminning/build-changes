public class gzn extends gyj<cst, hft> {
   private static final alk a = alk.b("textures/entity/llama/spit.png");
   private final giw g;

   public gzn(gyk.a $$0) {
      super($$0);
      this.g = new giw($$0.a(glf.bI));
   }

   public void a(hft $$0, flq $$1, gsc $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.g.a($$0);
      flt $$4 = $$2.getBuffer(this.g.a(a));
      this.g.a($$1, $$4, $$3, hks.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hft a() {
      return new hft();
   }

   public void a(cst $$0, hft $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.l($$2);
   }
}
