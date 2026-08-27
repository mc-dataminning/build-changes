public class gbf extends gaz<cdv> {
   private final fwn a;

   public gbf(gba.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(cdv $$0, float $$1, float $$2, esh $$3, fvt $$4, int $$5) {
      dlj $$6 = $$0.u();
      if ($$6.l() == dex.c) {
         cvr $$7 = $$0.dM();
         if ($$6 != $$7.a_($$0.dm()) && $$6.l() != dex.a) {
            $$3.a();
            hz $$8 = hz.a($$0.dr(), $$0.cH().e, $$0.dx());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(fvo.b($$6)), false, awp.a(), $$6.a($$0.q()), ggs.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public aiy a(cdv $$0) {
      return gha.e;
   }
}
