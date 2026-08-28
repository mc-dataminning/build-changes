public class gvu extends gwa<gyp, gbz> {
   private final gbz a;
   private final gbz b;
   private final gvk c;

   public gvu(gti<gyp, gbz> $$0, gef $$1, gvk $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gbz($$1.a(gei.bv));
      this.b = new gbz($$1.a(gei.bu));
   }

   public void a(fgl $$0, glg $$1, int $$2, gyp $$3, float $$4, float $$5) {
      cxg $$6 = $$3.c;
      dfl $$7 = $$6.a(ku.D);
      if ($$7 != null && $$7.c().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.c().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, cxg.j, dfk.k, $$2);
      }
   }

   private void a(fgl $$0, glg $$1, gyp $$2, cxg $$3, alp $$4, int $$5) {
      gbz $$6 = $$2.ae ? this.b : this.a;
      $$6.a($$2);
      this.c.a(dfj.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}
