public class gff implements gek<dqj> {
   private final gir a;
   private final ayk b = ayk.a();

   public gff(gel.a $$0) {
      this.a = $$0.d();
   }

   public void a(dqj $$0, float $$1, eys $$2, gck $$3, int $$4, int $$5) {
      if (dqj.a.a($$0.c())) {
         dax $$6 = $$0.i();
         if ($$6 != null) {
            cto $$7 = $$0.c().a();
            if (!$$7.e()) {
               this.b.b((long)gip.a($$7));
               dqk $$8 = $$0.d();
               a($$1, $$6, $$2, $$3, $$4, $$7, this.a, $$8.b(), $$8.a(), this.b);
            }
         }
      }
   }

   public static void a(float $$0, dax $$1, eys $$2, gck $$3, int $$4, cto $$5, gir $$6, float $$7, float $$8, ayk $$9) {
      $$2.a();
      $$2.a(0.5F, 0.4F, 0.5F);
      $$2.a(a.d.rotationDegrees(ayd.j($$0, $$7, $$8)));
      gip.a($$6, $$2, $$3, $$4, $$5, $$9, $$1);
      $$2.b();
   }
}
