public class gfa extends gfe<cai, fna<cai>> {
   private final fvi a;

   public gfa(gco<cai, fna<cai>> $$0, fvi $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(esa $$0, fvm $$1, int $$2, cai $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      coz $$10 = $$3.c(bnv.a);
      if ($$3.A() && !$$3.gy()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gm()) {
            $$11 -= 0.2F * awh.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * awh.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, cow.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
