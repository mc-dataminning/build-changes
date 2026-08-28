public class gsl extends gsx<gvc, fyv> {
   private final fyv a;
   private final fyv b;
   private final gsi c;

   public gsl(gqg<gvc, fyv> $$0, gbi $$1, gsi $$2) {
      super($$0);
      this.c = $$2;
      this.a = new fyv($$1.a(gbl.aR));
      this.b = new fyv($$1.a(gbl.aS));
   }

   public void a(feb $$0, gih $$1, int $$2, gvc $$3, float $$4, float $$5) {
      cwb $$6 = $$3.i;
      ddn $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         fyv $$8 = $$3.ae ? this.b : this.a;
         ali $$9 = $$7.c().get();
         $$8.a($$3);
         this.c.a(ddl.d.e, $$9, $$8, $$6, gir::f, $$0, $$1, $$2);
      }
   }
}
