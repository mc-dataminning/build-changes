public class ham extends hbm<her, ghv> {
   private final ghd<her> a;
   private final hlv b;

   public ham(gyv<her, ghv> $$0, gjp $$1, hlv $$2) {
      super($$0);
      this.a = new ght<>($$1.a(gjs.ct));
      this.b = $$2;
   }

   private boolean a(czn $$0, hlw.d $$1) {
      dhw $$2 = $$0.a(kk.D);
      if ($$2 != null && !$$2.d().isEmpty()) {
         hlw $$3 = this.b.a($$2.d().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(fkd $$0, gqr $$1, int $$2, her $$3, float $$4, float $$5) {
      if (!$$3.z && $$3.ay) {
         hks $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.W, hlw.d.c)) {
               $$0.a();
               if (this.a($$3.W, hlw.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               fkh $$7 = $$1.getBuffer(grc.d($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hjg.d);
               $$0.b();
            }
         }
      }
   }
}
