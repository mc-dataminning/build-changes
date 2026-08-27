public class fye implements fxt<djz> {
   private final flq a;

   public fye(fxu.a $$0) {
      this.a = new flq($$0.a(fpi.n));
   }

   public void a(djz $$0, float $$1, esh $$2, fvt $$3, int $$4, int $$5) {
      dlj $$6 = $$0.r();
      if ($$6.c(ddc.d)) {
         $$2.a();
         $$2.a(0.5F, 1.0625F, 0.5F);
         float $$7 = $$6.c(ddc.b).h().p();
         $$2.a(a.d.rotationDegrees(-$$7));
         $$2.a(a.f.rotationDegrees(67.5F));
         $$2.a(0.0F, -0.125F, 0.0F);
         this.a.a(0.0F, 0.1F, 0.9F, 1.2F);
         esl $$8 = fyc.a.a($$3, fwb::c);
         this.a.b($$2, $$8, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
         $$2.b();
      }
   }
}
