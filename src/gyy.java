public class gyy extends gzy<hdb, ggj> {
   private final gfr<hdb> a;
   private final hke b;

   public gyy(gxh<hdb, ggj> $$0, gic $$1, hke $$2) {
      super($$0);
      this.a = new ggh<>($$1.a(gif.cp));
      this.b = $$2;
   }

   private boolean a(cys $$0, hkf.d $$1) {
      dhb $$2 = $$0.a(kj.D);
      if ($$2 != null && !$$2.d().isEmpty()) {
         hkf $$3 = this.b.a($$2.d().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(fiq $$0, gpd $$1, int $$2, hdb $$3, float $$4, float $$5) {
      if (!$$3.z && $$3.ay) {
         hja $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.W, hkf.d.c)) {
               $$0.a();
               if (this.a($$3.W, hkf.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               fiu $$7 = $$1.getBuffer(gpn.d($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hhp.d);
               $$0.b();
            }
         }
      }
   }
}
