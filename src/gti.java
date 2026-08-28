public class gti extends gse<cpq, gzn> {
   private static final akv a = akv.b("textures/entity/llama/spit.png");
   private final gcv b;

   public gti(gsf.a $$0) {
      super($$0);
      this.b = new gcv($$0.a(gfd.bw));
   }

   public void a(gzn $$0, ffv $$1, glz $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.b.a($$0);
      ffz $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hej.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gzn a() {
      return new gzn();
   }

   public void a(cpq $$0, gzn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j($$2);
      $$1.a = $$0.k($$2);
   }
}
