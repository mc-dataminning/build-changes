public class gvs extends gwf<gyk, gbx> {
   private final gbx a;
   private final gbx b;
   private final gvp c;

   public gvs(gtn<gyk, gbx> $$0, gek $$1, gvp $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gbx($$1.a(gen.bb));
      this.b = new gbx($$1.a(gen.bd));
   }

   public void a(fgs $$0, gll $$1, int $$2, gyk $$3, float $$4, float $$5) {
      cxp $$6 = $$3.i;
      dfu $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gbx $$8 = $$3.ae ? this.b : this.a;
         alz $$9 = $$7.c().get();
         $$8.a($$3);
         this.c.a(dfs.d.e, $$9, $$8, $$6, $$0, $$1, $$2);
      }
   }
}
