public class gfw extends gfq<cgj> {
   private final gbc a;

   public gfw(gfr.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(cgj $$0, float $$1, float $$2, ewr $$3, gai $$4, int $$5) {
      dpi $$6 = $$0.u();
      if ($$6.l() == dim.c) {
         czg $$7 = $$0.dM();
         if ($$6 != $$7.a_($$0.dm()) && $$6.l() != dim.a) {
            $$3.a();
            id $$8 = id.a($$0.dr(), $$0.cH().e, $$0.dx());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(gad.b($$6)), false, axt.a(), $$6.a($$0.p()), glj.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public ajv a(cgj $$0) {
      return glr.e;
   }
}
