public class gxp extends gue<clk, hdm, ghd> {
   private static final ale a = ale.b("textures/entity/sniffer/sniffer.png");

   public gxp(gvk.a $$0) {
      super($$0, new ghd($$0.a(gif.dc)), new ghd($$0.a(gif.dd)), 1.1F);
   }

   public ale a(hdm $$0) {
      return a;
   }

   public hdm b() {
      return new hdm();
   }

   public void a(clk $$0, hdm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
      $$1.b.a($$0.bJ);
      $$1.c.a($$0.bH);
      $$1.d.a($$0.bK);
      $$1.e.a($$0.bF);
      $$1.f.a($$0.bG);
   }

   protected fdr a(clk $$0) {
      return super.a($$0).g(0.6F);
   }
}
