public class gsg extends gsm<gvb, fyr> {
   private final fyr a;
   private final fyr b;
   private final grx c;

   public gsg(gpv<gvb, fyr> $$0, gax $$1, grx $$2) {
      super($$0);
      this.c = $$2;
      this.a = new fyr($$1.a(gba.be));
      this.b = new fyr($$1.a(gba.bf));
   }

   public void a(fdt $$0, ghw $$1, int $$2, gvb $$3, float $$4, float $$5) {
      cvx $$6 = $$3.c;
      ddh $$7 = $$6.a(kt.D);
      if ($$7 != null && $$7.c().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.c().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, cvx.k, ddg.k, $$2);
      }
   }

   private void a(fdt $$0, ghw $$1, gvb $$2, cvx $$3, alh $$4, int $$5) {
      fyr $$6 = $$2.ae ? this.b : this.a;
      $$6.a($$2);
      this.c.a(ddf.d.f, $$4, $$6, $$3, gig::f, $$0, $$1, $$5);
   }
}
