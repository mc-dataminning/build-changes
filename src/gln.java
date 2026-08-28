public class gln implements gks<dur> {
   private final gpi a;
   private final azs b = azs.a();

   public gln(gkt.a $$0) {
      this.a = $$0.d();
   }

   public void a(dur $$0, float $$1, feb $$2, gih $$3, int $$4, int $$5) {
      if (dur.a.a($$0.c())) {
         dfb $$6 = $$0.i();
         if ($$6 != null) {
            cwb $$7 = $$0.c().a();
            if (!$$7.f()) {
               this.b.b((long)gpg.a($$7));
               dus $$8 = $$0.d();
               a($$1, $$6, $$2, $$3, $$4, $$7, this.a, $$8.b(), $$8.a(), this.b);
            }
         }
      }
   }

   public static void a(float $$0, dfb $$1, feb $$2, gih $$3, int $$4, cwb $$5, gpi $$6, float $$7, float $$8, azs $$9) {
      $$2.a();
      $$2.a(0.5F, 0.4F, 0.5F);
      $$2.a(a.d.rotationDegrees(azk.i($$0, $$7, $$8)));
      gpg.a($$6, $$2, $$3, $$4, $$5, $$9, $$1);
      $$2.b();
   }
}
