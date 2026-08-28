public class gsr extends gsx<gvm, fzc> {
   private final fzc a;
   private final fzc b;
   private final gsi c;

   public gsr(gqg<gvm, fzc> $$0, gbi $$1, gsi $$2) {
      super($$0);
      this.c = $$2;
      this.a = new fzc($$1.a(gbl.be));
      this.b = new fzc($$1.a(gbl.bf));
   }

   public void a(feb $$0, gih $$1, int $$2, gvm $$3, float $$4, float $$5) {
      cwb $$6 = $$3.c;
      ddn $$7 = $$6.a(ku.D);
      if ($$7 != null && $$7.c().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.c().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, cwb.k, ddm.k, $$2);
      }
   }

   private void a(feb $$0, gih $$1, gvm $$2, cwb $$3, ali $$4, int $$5) {
      fzc $$6 = $$2.ae ? this.b : this.a;
      $$6.a($$2);
      this.c.a(ddl.d.f, $$4, $$6, $$3, gir::f, $$0, $$1, $$5);
   }
}
