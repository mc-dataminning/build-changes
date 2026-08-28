public class gvt extends gwu<gzx, gdh> {
   private final gcp<gzx> a;
   private final hgy b;

   public gvt(guc<gzx, gdh> $$0, gfa $$1, hgy $$2) {
      super($$0);
      this.a = new gdf<>($$1.a(gfd.cf));
      this.b = $$2;
   }

   private boolean a(cwq $$0, hgz.d $$1) {
      dev $$2 = $$0.a(kv.D);
      if ($$2 != null && !$$2.c().isEmpty()) {
         hgz $$3 = this.b.a($$2.c().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(ffv $$0, glz $$1, int $$2, gzx $$3, float $$4, float $$5) {
      if (!$$3.z && $$3.ay) {
         hfv $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.W, hgz.d.c)) {
               $$0.a();
               if (this.a($$3.W, hgz.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               ffz $$7 = $$1.getBuffer(gmj.d($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hej.d);
               $$0.b();
            }
         }
      }
   }
}
