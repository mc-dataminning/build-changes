public class gwh extends gwu<gzb, gcn> {
   private final gcn a;
   private final gcn b;
   private final gwe c;

   public gwh(guc<gzb, gcn> $$0, gfa $$1, gwe $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gcn($$1.a(gfd.be));
      this.b = new gcn($$1.a(gfd.bg));
   }

   public void a(ffv $$0, glz $$1, int $$2, gzb $$3, float $$4, float $$5) {
      cwq $$6 = $$3.i;
      dev $$7 = $$6.a(kv.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gcn $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hgz.d.e, $$7.c().get(), $$8, $$6, $$0, $$1, $$2);
      }
   }
}
