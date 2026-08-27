public class gfx extends gfq<ckn> {
   private final ggp a;

   public gfx(gfr.a $$0) {
      super($$0);
      this.a = $$0.b();
   }

   public void a(ckn $$0, float $$1, float $$2, ewr $$3, gai $$4, int $$5) {
      $$3.a();
      $$3.a(this.c.b());
      $$3.a(a.d.rotationDegrees(180.0F));
      if ($$0.r()) {
         $$3.a(a.f.rotationDegrees(180.0F));
         $$3.a(a.d.rotationDegrees(180.0F));
         $$3.a(a.b.rotationDegrees(90.0F));
      }

      this.a.a($$0.p(), crp.h, $$5, glj.d, $$3, $$4, $$0.dM(), $$0.aj());
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajv a(ckn $$0) {
      return glr.e;
   }
}
