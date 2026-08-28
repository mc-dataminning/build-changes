public class gvq extends gwr<gzu, gdf> {
   private final gcn<gzu> a;
   private final hgp b;

   public gvq(gtz<gzu, gdf> $$0, gey $$1, hgp $$2) {
      super($$0);
      this.a = new gdd<>($$1.a(gfb.cf));
      this.b = $$2;
   }

   private boolean a(cwp $$0, hgq.d $$1) {
      deu $$2 = $$0.a(kv.D);
      if ($$2 != null && !$$2.c().isEmpty()) {
         hgq $$3 = this.b.a($$2.c().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(ffu $$0, glx $$1, int $$2, gzu $$3, float $$4, float $$5) {
      if (!$$3.z && $$3.ay) {
         hfk $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.W, hgq.d.c)) {
               $$0.a();
               if (this.a($$3.W, hgq.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               ffy $$7 = $$1.getBuffer(gmh.d($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hea.d);
               $$0.b();
            }
         }
      }
   }
}
