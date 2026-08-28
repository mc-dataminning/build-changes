public class gwk extends gsz<cla, hch, gga> {
   private static final ald a = ald.b("textures/entity/sniffer/sniffer.png");

   public gwk(guf.a $$0) {
      super($$0, new gga($$0.a(ghc.dc)), new gga($$0.a(ghc.dd)), 1.1F);
   }

   public ald a(hch $$0) {
      return a;
   }

   public hch b() {
      return new hch();
   }

   public void a(cla $$0, hch $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
      $$1.b.a($$0.bI);
      $$1.c.a($$0.bG);
      $$1.d.a($$0.bJ);
      $$1.e.a($$0.bE);
      $$1.f.a($$0.bF);
   }

   protected fcp a(cla $$0) {
      return super.a($$0).g(0.6F);
   }
}
