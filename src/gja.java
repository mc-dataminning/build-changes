public class gja extends giu<cje> {
   private final geg a;

   public gja(giv.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(cje $$0, float $$1, float $$2, ezw $$3, gdm $$4, int $$5) {
      dsa $$6 = $$0.u();
      if ($$6.l() == dld.c) {
         dbw $$7 = $$0.dP();
         if ($$6 != $$7.a_($$0.dp()) && $$6.l() != dld.a) {
            $$3.a();
            iz $$8 = iz.a($$0.du(), $$0.cK().e, $$0.dA());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(gdh.b($$6)), false, azf.a(), $$6.a($$0.p()), goo.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public ale a(cje $$0) {
      return gow.e;
   }
}
