public class hbg extends hbm<heg, ghi> {
   private final ghi a;
   private final ghi b;
   private final hax c;

   public hbg(gyv<heg, ghi> $$0, gjp $$1, hax $$2) {
      super($$0);
      this.c = $$2;
      this.a = new ghi($$1.a(gjs.bH));
      this.b = new ghi($$1.a(gjs.bG));
   }

   public void a(fkd $$0, gqr $$1, int $$2, heg $$3, float $$4, float $$5) {
      czn $$6 = $$3.c;
      dhw $$7 = $$6.a(kk.D);
      if ($$7 != null && $$7.d().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.d().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, czn.k, dhv.m, $$2);
      }
   }

   private void a(fkd $$0, gqr $$1, heg $$2, czn $$3, alf<dhu> $$4, int $$5) {
      ghi $$6 = $$2.aj ? this.b : this.a;
      $$6.a($$2);
      this.c.a(hlw.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}
