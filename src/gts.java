public class gts extends gty<gwn, gab> {
   private final gab a;
   private final gab b;
   private final gtj c;

   public gts(grh<gwn, gab> $$0, gch $$1, gtj $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gab($$1.a(gck.br));
      this.b = new gab($$1.a(gck.bq));
   }

   public void a(fer $$0, gjg $$1, int $$2, gwn $$3, float $$4, float $$5) {
      cwm $$6 = $$3.c;
      ddy $$7 = $$6.a(ku.D);
      if ($$7 != null && $$7.c().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.c().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, cwm.k, ddx.k, $$2);
      }
   }

   private void a(fer $$0, gjg $$1, gwn $$2, cwm $$3, alj $$4, int $$5) {
      gab $$6 = $$2.ae ? this.b : this.a;
      $$6.a($$2);
      this.c.a(ddw.d.f, $$4, $$6, $$3, gjq::f, $$0, $$1, $$5);
   }
}
