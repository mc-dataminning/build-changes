public class gvp extends gwq<gzt, gdd> {
   private final gcl<gzt> a;
   private final hgq b;

   public gvp(gty<gzt, gdd> $$0, gew $$1, hgq $$2) {
      super($$0);
      this.a = new gdb<>($$1.a(gez.cf));
      this.b = $$2;
   }

   private boolean a(cwn $$0, hgr.d $$1) {
      des $$2 = $$0.a(kv.D);
      if ($$2 != null && !$$2.c().isEmpty()) {
         hgr $$3 = this.b.a($$2.c().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(ffs $$0, glv $$1, int $$2, gzt $$3, float $$4, float $$5) {
      if (!$$3.z && $$3.ay) {
         hfo $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.W, hgr.d.c)) {
               $$0.a();
               if (this.a($$3.W, hgr.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               ffw $$7 = $$1.getBuffer(gmf.d($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hec.d);
               $$0.b();
            }
         }
      }
   }
}
