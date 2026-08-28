public class gjl extends gjf<ciq> {
   private final ger a;

   public gjl(gjg.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(ciq $$0, float $$1, float $$2, fag $$3, gdx $$4, int $$5) {
      dsh $$6 = $$0.u();
      if ($$6.l() == dll.c) {
         dcd $$7 = $$0.dP();
         if ($$6 != $$7.a_($$0.dp()) && $$6.l() != dll.a) {
            $$3.a();
            ja $$8 = ja.a($$0.du(), $$0.cK().e, $$0.dA());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(gds.b($$6)), false, aym.a(), $$6.a($$0.p()), goz.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public akk a(ciq $$0) {
      return gph.e;
   }
}
