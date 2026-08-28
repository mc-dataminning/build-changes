public class gvn extends gwa<gyf, gbs> {
   private final gbs a;
   private final gbs b;
   private final gvk c;

   public gvn(gti<gyf, gbs> $$0, gef $$1, gvk $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gbs($$1.a(gei.be));
      this.b = new gbs($$1.a(gei.bg));
   }

   public void a(fgl $$0, glg $$1, int $$2, gyf $$3, float $$4, float $$5) {
      cxg $$6 = $$3.i;
      dfl $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gbs $$8 = $$3.ae ? this.b : this.a;
         alp $$9 = $$7.c().get();
         $$8.a($$3);
         this.c.a(dfj.d.e, $$9, $$8, $$6, $$0, $$1, $$2);
      }
   }
}
