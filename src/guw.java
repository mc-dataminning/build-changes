public class guw extends guj<cik, hax, gda<gzj>> {
   private static final aku a = aku.b("textures/entity/fish/pufferfish.png");
   private final gda<gzj> b;
   private final gda<gzj> k;
   private final gda<gzj> l = this.c();

   public guw(gtd.a $$0) {
      super($$0, new geh($$0.a(ggb.cs)), 0.2F);
      this.k = new gei($$0.a(ggb.ct));
      this.b = new gej($$0.a(ggb.cu));
   }

   public aku a(hax $$0) {
      return a;
   }

   public hax b() {
      return new hax();
   }

   protected float b(hax $$0) {
      return 0.1F + 0.1F * (float)$$0.a;
   }

   public void a(hax $$0, fgr $$1, gmx $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.b;
         case 1 -> this.k;
         default -> this.l;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(cik $$0, hax $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.x();
   }

   protected void a(hax $$0, fgr $$1, float $$2, float $$3) {
      $$1.a(0.0F, ayz.b($$0.u * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
