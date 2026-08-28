public class gwo extends gwu<gzm, gcu> {
   private final gcu a;
   private final gcu b;
   private final gwe c;

   public gwo(guc<gzm, gcu> $$0, gfa $$1, gwe $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gcu($$1.a(gfd.bv));
      this.b = new gcu($$1.a(gfd.bu));
   }

   public void a(ffv $$0, glz $$1, int $$2, gzm $$3, float $$4, float $$5) {
      cwq $$6 = $$3.c;
      dev $$7 = $$6.a(kv.D);
      if ($$7 != null && $$7.c().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.c().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, cwq.j, deu.l, $$2);
      }
   }

   private void a(ffv $$0, glz $$1, gzm $$2, cwq $$3, aku<det> $$4, int $$5) {
      gcu $$6 = $$2.aj ? this.b : this.a;
      $$6.a($$2);
      this.c.a(hgz.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}
