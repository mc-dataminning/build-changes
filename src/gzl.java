public class gzl extends gyh<csr, hfr> {
   private static final ali a = ali.b("textures/entity/llama/spit.png");
   private final giu g;

   public gzl(gyi.a $$0) {
      super($$0);
      this.g = new giu($$0.a(gld.bI));
   }

   public void a(hfr $$0, flo $$1, gsa $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.g.a($$0);
      flr $$4 = $$2.getBuffer(this.g.a(a));
      this.g.a($$1, $$4, $$3, hkq.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hfr a() {
      return new hfr();
   }

   public void a(csr $$0, hfr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.l($$2);
   }
}
