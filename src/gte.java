public class gte extends gsa<cpn, gzj> {
   private static final aku a = aku.b("textures/entity/llama/spit.png");
   private final gcr b;

   public gte(gsb.a $$0) {
      super($$0);
      this.b = new gcr($$0.a(gez.bw));
   }

   public void a(gzj $$0, ffs $$1, glv $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.b.a($$0);
      ffw $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hec.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gzj a() {
      return new gzj();
   }

   public void a(cpn $$0, gzj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j($$2);
      $$1.a = $$0.k($$2);
   }
}
