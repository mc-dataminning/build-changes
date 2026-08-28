public class hba extends hav<hel, ghz> {
   private final gre a;

   public hba(gye<hel, ghz> $$0, gre $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fjj $$0, gqa $$1, int $$2, hel $$3, float $$4, float $$5) {
      if ($$3.a) {
         if (!$$3.z || $$3.ao) {
            $$0.a();
            this.d().b().a($$0);
            float $$6 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            eah $$7 = dmh.ev.m();
            hkx $$8 = this.a.a($$7);
            int $$9 = gxi.a($$3, 0.0F);
            $$0.a(-0.5F, -0.5F, -0.5F);
            fjn $$10 = $$3.ao && $$3.z ? $$1.getBuffer(gqk.s(hiw.d)) : $$1.getBuffer(gps.c($$7));
            this.a.b().a($$0.c(), $$10, $$7, $$8, 0.0F, 0.0F, 0.0F, $$2, $$9);
            $$0.b();
         }
      }
   }
}
