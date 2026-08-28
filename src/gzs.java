public class gzs extends gzy<hcq, gfw> {
   private final gfw a;
   private final gfw b;
   private final gzj c;

   public gzs(gxh<hcq, gfw> $$0, gic $$1, gzj $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gfw($$1.a(gif.bD));
      this.b = new gfw($$1.a(gif.bC));
   }

   public void a(fiq $$0, gpd $$1, int $$2, hcq $$3, float $$4, float $$5) {
      cys $$6 = $$3.c;
      dhb $$7 = $$6.a(kj.D);
      if ($$7 != null && $$7.d().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.d().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, cys.k, dha.m, $$2);
      }
   }

   private void a(fiq $$0, gpd $$1, hcq $$2, cys $$3, ald<dgz> $$4, int $$5) {
      gfw $$6 = $$2.aj ? this.b : this.a;
      $$6.a($$2);
      this.c.a(hkf.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}
