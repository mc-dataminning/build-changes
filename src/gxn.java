public class gxn extends gxs<hao, gcq> {
   private final gob a;

   public gxn(gva<hao, gcq> $$0, gob $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fgr $$0, gmx $$1, int $$2, hao $$3, float $$4, float $$5) {
      if (!$$3.aj) {
         boolean $$6 = $$3.ao && $$3.z;
         if (!$$3.z || $$6) {
            dxq $$7 = $$3.a.a();
            int $$8 = gue.a($$3, 0.0F);
            hhr $$9 = this.a.a($$7);
            $$0.a();
            $$0.a(0.2F, -0.35F, 0.5F);
            $$0.a(a.d.rotationDegrees(-48.0F));
            $$0.b(-1.0F, -1.0F, 1.0F);
            $$0.a(-0.5F, -0.5F, -0.5F);
            this.a($$0, $$1, $$2, $$6, $$7, $$8, $$9);
            $$0.b();
            $$0.a();
            $$0.a(0.2F, -0.35F, 0.5F);
            $$0.a(a.d.rotationDegrees(42.0F));
            $$0.a(0.1F, 0.0F, -0.6F);
            $$0.a(a.d.rotationDegrees(-48.0F));
            $$0.b(-1.0F, -1.0F, 1.0F);
            $$0.a(-0.5F, -0.5F, -0.5F);
            this.a($$0, $$1, $$2, $$6, $$7, $$8, $$9);
            $$0.b();
            $$0.a();
            this.d().b().a($$0);
            $$0.a(0.0F, -0.7F, -0.2F);
            $$0.a(a.d.rotationDegrees(-78.0F));
            $$0.b(-1.0F, -1.0F, 1.0F);
            $$0.a(-0.5F, -0.5F, -0.5F);
            this.a($$0, $$1, $$2, $$6, $$7, $$8, $$9);
            $$0.b();
         }
      }
   }

   private void a(fgr $$0, gmx $$1, int $$2, boolean $$3, dxq $$4, int $$5, hhr $$6) {
      if ($$3) {
         this.a.b().a($$0.c(), $$1.getBuffer(gnh.s(hfq.d)), $$4, $$6, 0.0F, 0.0F, 0.0F, $$2, $$5);
      } else {
         this.a.a($$4, $$0, $$1, $$2, $$5);
      }
   }
}
