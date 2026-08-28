public class gvz extends gwf<gyu, gce> {
   private final gce a;
   private final gce b;
   private final gvp c;

   public gvz(gtn<gyu, gce> $$0, gek $$1, gvp $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gce($$1.a(gen.bs));
      this.b = new gce($$1.a(gen.br));
   }

   public void a(fgs $$0, gll $$1, int $$2, gyu $$3, float $$4, float $$5) {
      cxp $$6 = $$3.c;
      dfu $$7 = $$6.a(ku.D);
      if ($$7 != null && $$7.c().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.c().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, cxp.j, dft.k, $$2);
      }
   }

   private void a(fgs $$0, gll $$1, gyu $$2, cxp $$3, alz $$4, int $$5) {
      gce $$6 = $$2.ae ? this.b : this.a;
      $$6.a($$2);
      this.c.a(dfs.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}
