public class gom implements gnr<dww> {
   private final gsj a;
   private final bac b = bac.a();

   public gom(gns.a $$0) {
      this.a = $$0.d();
   }

   public void a(dww $$0, float $$1, fgl $$2, glg $$3, int $$4, int $$5) {
      if (dww.a.a($$0.c())) {
         dgz $$6 = $$0.i();
         if ($$6 != null) {
            cxg $$7 = $$0.c().a();
            if (!$$7.f()) {
               this.b.b((long)gsh.a($$7));
               dwx $$8 = $$0.d();
               a($$1, $$6, $$2, $$3, $$4, $$7, this.a, $$8.b(), $$8.a(), this.b);
            }
         }
      }
   }

   public static void a(float $$0, dgz $$1, fgl $$2, glg $$3, int $$4, cxg $$5, gsj $$6, float $$7, float $$8, bac $$9) {
      $$2.a();
      $$2.a(0.5F, 0.4F, 0.5F);
      $$2.a(a.d.rotationDegrees(azu.i($$0, $$7, $$8)));
      gsh.a($$6, $$2, $$3, $$4, $$5, $$9, $$1);
      $$2.b();
   }
}
