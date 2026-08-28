public class hah extends han<hdg, ggj> {
   private final ggj a;
   private final ggj b;
   private final gzy c;

   public hah(gxw<hdg, ggj> $$0, giq $$1, gzy $$2) {
      super($$0);
      this.c = $$2;
      this.a = new ggj($$1.a(git.bF));
      this.b = new ggj($$1.a(git.bE));
   }

   public void a(fjc $$0, gps $$1, int $$2, hdg $$3, float $$4, float $$5) {
      cyy $$6 = $$3.c;
      dhh $$7 = $$6.a(kj.D);
      if ($$7 != null && $$7.d().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.d().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, cyy.k, dhg.m, $$2);
      }
   }

   private void a(fjc $$0, gps $$1, hdg $$2, cyy $$3, alf<dhf> $$4, int $$5) {
      ggj $$6 = $$2.aj ? this.b : this.a;
      $$6.a($$2);
      this.c.a(hkv.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}
