public class gjt extends gjn<ciu> {
   private final gez a;

   public gjt(gjo.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(ciu $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5) {
      dsl $$6 = $$0.t();
      if ($$6.l() == dlo.c) {
         dcg $$7 = $$0.dR();
         if ($$6 != $$7.a_($$0.dr()) && $$6.l() != dlo.a) {
            $$3.a();
            ja $$8 = ja.a($$0.dw(), $$0.cM().e, $$0.dC());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(gea.b($$6)), false, ayo.a(), $$6.a($$0.p()), gph.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public akk a(ciu $$0) {
      return gpp.e;
   }
}
