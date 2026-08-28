public class hbj extends hcj<hfq, git> {
   private final gib<hfq> a;
   private final hmv b;

   public hbj(gzs<hfq, git> $$0, gkn $$1, hmv $$2) {
      super($$0);
      this.a = new gir<>($$1.a(gkq.ct));
      this.b = $$2;
   }

   private boolean a(dak $$0, hmw.d $$1) {
      dit $$2 = $$0.a(kl.D);
      if ($$2 != null && !$$2.d().isEmpty()) {
         hmw $$3 = this.b.a($$2.d().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(fld $$0, grn $$1, int $$2, hfq $$3, float $$4, float $$5) {
      if (!$$3.A && $$3.aB) {
         hls $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.Z, hmw.d.c)) {
               $$0.a();
               if (this.a($$3.Z, hmw.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               flg $$7 = $$1.getBuffer(gry.d($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hkg.d);
               $$0.b();
            }
         }
      }
   }
}
