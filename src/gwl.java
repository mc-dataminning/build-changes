public class gwl extends gwr<gzj, gcs> {
   private final gcs a;
   private final gcs b;
   private final gwb c;

   public gwl(gtz<gzj, gcs> $$0, gey $$1, gwb $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gcs($$1.a(gfb.bv));
      this.b = new gcs($$1.a(gfb.bu));
   }

   public void a(ffu $$0, glx $$1, int $$2, gzj $$3, float $$4, float $$5) {
      cwp $$6 = $$3.c;
      deu $$7 = $$6.a(kv.D);
      if ($$7 != null && $$7.c().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.c().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, cwp.j, det.l, $$2);
      }
   }

   private void a(ffu $$0, glx $$1, gzj $$2, cwp $$3, akt<des> $$4, int $$5) {
      gcs $$6 = $$2.aj ? this.b : this.a;
      $$6.a($$2);
      this.c.a(hgq.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}
