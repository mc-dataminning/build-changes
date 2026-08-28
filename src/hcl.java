public class hcl extends hcy<hfa, gig> {
   public hcl(hah<hfa, gig> $$0) {
      super($$0);
   }

   public void a(flq $$0, gsc $$1, int $$2, hfa $$3, float $$4, float $$5) {
      hhu $$6 = $$3.i;
      if (!$$6.c()) {
         boolean $$7 = $$3.d;
         boolean $$8 = $$3.aj;
         $$0.a();
         $$0.a(this.d().b.b / 16.0F, this.d().b.c / 16.0F, this.d().b.d / 16.0F);
         if ($$8) {
            float $$9 = 0.75F;
            $$0.b(0.75F, 0.75F, 0.75F);
         }

         $$0.a(a.f.rotation($$3.a));
         $$0.a(a.d.rotationDegrees($$4));
         $$0.a(a.b.rotationDegrees($$5));
         if ($$3.aj) {
            if ($$7) {
               $$0.a(0.4F, 0.26F, 0.15F);
            } else {
               $$0.a(0.06F, 0.26F, -0.5F);
            }
         } else if ($$7) {
            $$0.a(0.46F, 0.26F, 0.22F);
         } else {
            $$0.a(0.06F, 0.27F, -0.5F);
         }

         $$0.a(a.b.rotationDegrees(90.0F));
         if ($$7) {
            $$0.a(a.f.rotationDegrees(90.0F));
         }

         $$6.a($$0, $$1, $$2, hks.d);
         $$0.b();
      }
   }
}
