public class gtb extends gtn<gvs, fzl> {
   private final fzl a;
   private final fzl b;
   private final gsy c;

   public gtb(gqw<gvs, fzl> $$0, gby $$1, gsy $$2) {
      super($$0);
      this.c = $$2;
      this.a = new fzl($$1.a(gcb.aR));
      this.b = new fzl($$1.a(gcb.aS));
   }

   public void a(fek $$0, gix $$1, int $$2, gvs $$3, float $$4, float $$5) {
      cwf $$6 = $$3.i;
      ddr $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         fzl $$8 = $$3.ae ? this.b : this.a;
         all $$9 = $$7.c().get();
         $$8.a($$3);
         this.c.a(ddp.d.e, $$9, $$8, $$6, gjh::f, $$0, $$1, $$2);
      }
   }
}
