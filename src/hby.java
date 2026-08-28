public class hby extends hcy<hgd, gji> {
   private final giq<hgd> a;
   private final hnh b;

   public hby(hah<hgd, gji> $$0, glc $$1, hnh $$2) {
      super($$0);
      this.a = new gjg<>($$1.a(glf.ct));
      this.b = $$2;
   }

   private boolean a(daa $$0, hni.d $$1) {
      dij $$2 = $$0.a(kl.D);
      if ($$2 != null && !$$2.d().isEmpty()) {
         hni $$3 = this.b.a($$2.d().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(flq $$0, gsc $$1, int $$2, hgd $$3, float $$4, float $$5) {
      if (!$$3.z && $$3.ay) {
         hme $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.W, hni.d.c)) {
               $$0.a();
               if (this.a($$3.W, hni.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               flt $$7 = $$1.getBuffer(gsn.d($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hks.d);
               $$0.b();
            }
         }
      }
   }
}
