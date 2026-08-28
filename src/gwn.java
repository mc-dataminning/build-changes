public class gwn extends gwt<gzl, gct> {
   private final gct a;
   private final gct b;
   private final gwd c;

   public gwn(gub<gzl, gct> $$0, gez $$1, gwd $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gct($$1.a(gfc.bv));
      this.b = new gct($$1.a(gfc.bu));
   }

   public void a(ffu $$0, gly $$1, int $$2, gzl $$3, float $$4, float $$5) {
      cwp $$6 = $$3.c;
      deu $$7 = $$6.a(kv.D);
      if ($$7 != null && $$7.c().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.c().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, cwp.j, det.l, $$2);
      }
   }

   private void a(ffu $$0, gly $$1, gzl $$2, cwp $$3, aku<des> $$4, int $$5) {
      gct $$6 = $$2.aj ? this.b : this.a;
      $$6.a($$2);
      this.c.a(hgy.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}
