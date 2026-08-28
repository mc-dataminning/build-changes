public class gth extends gtn<gwc, fzs> {
   private final fzs a;
   private final fzs b;
   private final gsy c;

   public gth(gqw<gwc, fzs> $$0, gby $$1, gsy $$2) {
      super($$0);
      this.c = $$2;
      this.a = new fzs($$1.a(gcb.be));
      this.b = new fzs($$1.a(gcb.bf));
   }

   public void a(fek $$0, gix $$1, int $$2, gwc $$3, float $$4, float $$5) {
      cwf $$6 = $$3.c;
      ddr $$7 = $$6.a(ku.D);
      if ($$7 != null && $$7.c().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.c().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, cwf.k, ddq.k, $$2);
      }
   }

   private void a(fek $$0, gix $$1, gwc $$2, cwf $$3, all $$4, int $$5) {
      fzs $$6 = $$2.ae ? this.b : this.a;
      $$6.a($$2);
      this.c.a(ddp.d.f, $$4, $$6, $$3, gjh::f, $$0, $$1, $$5);
   }
}
