public class gan implements fzs<dmj> {
   private final gdz a;
   private final axd b = axd.a();

   public gan(fzt.a $$0) {
      this.a = $$0.d();
   }

   public void a(dmj $$0, float $$1, eub $$2, fxs $$3, int $$4, int $$5) {
      if (dmj.a.a($$0.c())) {
         cxb $$6 = $$0.i();
         if ($$6 != null) {
            cqm $$7 = $$0.c().a();
            if (!$$7.b()) {
               this.b.b((long)gdx.a($$7));
               dmk $$8 = $$0.d();
               a($$1, $$6, $$2, $$3, $$4, $$7, this.a, $$8.b(), $$8.a(), this.b);
            }
         }
      }
   }

   public static void a(float $$0, cxb $$1, eub $$2, fxs $$3, int $$4, cqm $$5, gdz $$6, float $$7, float $$8, axd $$9) {
      $$2.a();
      $$2.a(0.5F, 0.4F, 0.5F);
      $$2.a(a.d.rotationDegrees(aww.j($$0, $$7, $$8)));
      gdx.a($$6, $$2, $$3, $$4, $$5, $$9, $$1);
      $$2.b();
   }
}
