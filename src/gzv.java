public class gzv extends hav<hdz, ghe> {
   private final ggm<hdz> a;
   private final hlc b;

   public gzv(gye<hdz, ghe> $$0, giy $$1, hlc $$2) {
      super($$0);
      this.a = new ghc<>($$1.a(gjb.ct));
      this.b = $$2;
   }

   private boolean a(czd $$0, hld.d $$1) {
      dhm $$2 = $$0.a(kj.D);
      if ($$2 != null && !$$2.d().isEmpty()) {
         hld $$3 = this.b.a($$2.d().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(fjj $$0, gqa $$1, int $$2, hdz $$3, float $$4, float $$5) {
      if (!$$3.z && $$3.ay) {
         hjy $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.W, hld.d.c)) {
               $$0.a();
               if (this.a($$3.W, hld.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               fjn $$7 = $$1.getBuffer(gqk.d($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hin.d);
               $$0.b();
            }
         }
      }
   }
}
