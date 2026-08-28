public class gjb extends giv<cjf> {
   private final geh a;

   public gjb(giw.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(cjf $$0, float $$1, float $$2, ezx $$3, gdn $$4, int $$5) {
      dsb $$6 = $$0.u();
      if ($$6.l() == dle.c) {
         dbx $$7 = $$0.dP();
         if ($$6 != $$7.a_($$0.dp()) && $$6.l() != dle.a) {
            $$3.a();
            iz $$8 = iz.a($$0.du(), $$0.cK().e, $$0.dA());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(gdi.b($$6)), false, azg.a(), $$6.a($$0.p()), gop.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public ale a(cjf $$0) {
      return gox.e;
   }
}
