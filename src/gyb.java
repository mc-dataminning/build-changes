public class gyb extends gwx<csg, heh> {
   private static final alg a = alg.b("textures/entity/llama/spit.png");
   private final ghj g;

   public gyb(gwy.a $$0) {
      super($$0);
      this.g = new ghj($$0.a(gjs.bI));
   }

   public void a(heh $$0, fkd $$1, gqr $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.g.a($$0);
      fkh $$4 = $$2.getBuffer(this.g.a(a));
      this.g.a($$1, $$4, $$3, hjg.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public heh a() {
      return new heh();
   }

   public void a(csg $$0, heh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.l($$2);
   }
}
