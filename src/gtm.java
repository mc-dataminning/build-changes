public class gtm extends gty<gwd, fzu> {
   private final fzu a;
   private final fzu b;
   private final gtj c;

   public gtm(grh<gwd, fzu> $$0, gch $$1, gtj $$2) {
      super($$0);
      this.c = $$2;
      this.a = new fzu($$1.a(gck.ba));
      this.b = new fzu($$1.a(gck.bc));
   }

   public void a(fer $$0, gjg $$1, int $$2, gwd $$3, float $$4, float $$5) {
      cwm $$6 = $$3.i;
      ddy $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         fzu $$8 = $$3.ae ? this.b : this.a;
         alj $$9 = $$7.c().get();
         $$8.a($$3);
         this.c.a(ddw.d.e, $$9, $$8, $$6, gjq::f, $$0, $$1, $$2);
      }
   }
}
