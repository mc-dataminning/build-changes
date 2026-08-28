public class gve extends gwf<gzg, gcr> {
   private final gbz<gzg> a;
   private final hds b;

   public gve(gtn<gzg, gcr> $$0, gek $$1, hds $$2) {
      super($$0);
      this.a = new gcp<>($$1.a(gen.cc));
      this.b = $$2;
   }

   private boolean a(cxp $$0, dfs.d $$1) {
      dfu $$2 = $$0.a(ku.D);
      if ($$2 != null && !$$2.c().isEmpty()) {
         dfs $$3 = this.b.a($$2.c().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(fgs $$0, gll $$1, int $$2, gzg $$3, float $$4, float $$5) {
      if (!$$3.u && $$3.aw) {
         hcm $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.Q, dfs.d.c)) {
               $$0.a();
               if (this.a($$3.Q, dfs.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               fgw $$7 = $$1.getBuffer(glv.d($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hbc.d);
               $$0.b();
            }
         }
      }
   }
}
