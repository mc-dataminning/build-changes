public class gxt extends gyt<hbw, gfg> {
   private final geo<hbw> a;
   private final hix b;

   public gxt(gwc<hbw, gfg> $$0, ggz $$1, hix $$2) {
      super($$0);
      this.a = new gfe<>($$1.a(ghc.cp));
      this.b = $$2;
   }

   private boolean a(cxy $$0, hiy.d $$1) {
      dgc $$2 = $$0.a(kx.E);
      if ($$2 != null && !$$2.d().isEmpty()) {
         hiy $$3 = this.b.a($$2.d().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(fho $$0, gny $$1, int $$2, hbw $$3, float $$4, float $$5) {
      if (!$$3.z && $$3.ay) {
         hhu $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.W, hiy.d.c)) {
               $$0.a();
               if (this.a($$3.W, hiy.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               fhs $$7 = $$1.getBuffer(goi.d($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hgi.d);
               $$0.b();
            }
         }
      }
   }
}
