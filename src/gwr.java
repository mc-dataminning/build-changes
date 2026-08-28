public class gwr extends gxs<hav, gef> {
   private final gdn<hav> a;
   private final hhw b;

   public gwr(gva<hav, gef> $$0, gfy $$1, hhw $$2) {
      super($$0);
      this.a = new ged<>($$1.a(ggb.ch));
      this.b = $$2;
   }

   private boolean a(cxh $$0, hhx.d $$1) {
      dfm $$2 = $$0.a(kv.E);
      if ($$2 != null && !$$2.c().isEmpty()) {
         hhx $$3 = this.b.a($$2.c().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(fgr $$0, gmx $$1, int $$2, hav $$3, float $$4, float $$5) {
      if (!$$3.z && $$3.ay) {
         hgt $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.W, hhx.d.c)) {
               $$0.a();
               if (this.a($$3.W, hhx.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               fgv $$7 = $$1.getBuffer(gnh.d($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hfh.d);
               $$0.b();
            }
         }
      }
   }
}
