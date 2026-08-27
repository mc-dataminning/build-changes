public class fyq extends fyk<cbs> {
   private final ftz a;

   public fyq(fyl.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(cbs $$0, float $$1, float $$2, epz $$3, ftf $$4, int $$5) {
      djg $$6 = $$0.u();
      if ($$6.l() == dcu.c) {
         cto $$7 = $$0.dM();
         if ($$6 != $$7.a_($$0.dm()) && $$6.l() != dcu.a) {
            $$3.a();
            hx $$8 = hx.a($$0.dr(), $$0.cH().e, $$0.dx());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(fta.b($$6)), false, auu.a(), $$6.a($$0.q()), gec.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public ahg a(cbs $$0) {
      return gek.e;
   }
}
