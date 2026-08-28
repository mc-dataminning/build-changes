public class gww extends gwr<hah, gea> {
   private final gnb a;

   public gww(gtz<hah, gea> $$0, gnb $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(ffu $$0, glx $$1, int $$2, hah $$3, float $$4, float $$5) {
      if ($$3.a) {
         if (!$$3.z || $$3.ao) {
            $$0.a();
            this.d().b().a($$0);
            float $$6 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            dwx $$7 = djo.er.m();
            hgl $$8 = this.a.a($$7);
            int $$9 = gtd.a($$3, 0.0F);
            $$0.a(-0.5F, -0.5F, -0.5F);
            ffy $$10 = $$3.ao && $$3.z ? $$1.getBuffer(gmh.s(hei.d)) : $$1.getBuffer(glq.c($$7));
            this.a.b().a($$0.c(), $$10, $$7, $$8, 0.0F, 0.0F, 0.0F, $$2, $$9);
            $$0.b();
         }
      }
   }
}
