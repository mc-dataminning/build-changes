public class ghu implements ggz<dsk> {
   private final glh a;
   private final ayw b = ayw.a();

   public ghu(gha.a $$0) {
      this.a = $$0.d();
   }

   public void a(dsk $$0, float $$1, fbi $$2, gez $$3, int $$4, int $$5) {
      if (dsk.a.a($$0.c())) {
         dcw $$6 = $$0.i();
         if ($$6 != null) {
            cuq $$7 = $$0.c().a();
            if (!$$7.e()) {
               this.b.b((long)glf.a($$7));
               dsl $$8 = $$0.d();
               a($$1, $$6, $$2, $$3, $$4, $$7, this.a, $$8.b(), $$8.a(), this.b);
            }
         }
      }
   }

   public static void a(float $$0, dcw $$1, fbi $$2, gez $$3, int $$4, cuq $$5, glh $$6, float $$7, float $$8, ayw $$9) {
      $$2.a();
      $$2.a(0.5F, 0.4F, 0.5F);
      $$2.a(a.d.rotationDegrees(ayo.j($$0, $$7, $$8)));
      glf.a($$6, $$2, $$3, $$4, $$5, $$9, $$1);
      $$2.b();
   }
}
