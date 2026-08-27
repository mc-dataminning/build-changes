public class gld<T extends cec> extends gli<T, fru<T>> {
   private final gci a;

   public gld(gis<T, fru<T>> $$0, gci $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(exx $$0, gbo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.p_()) {
         fde $$10 = fde.Q();
         boolean $$11 = $$10.b($$3) && $$3.cf();
         if (!$$3.cf() || $$11) {
            dqh $$12 = $$3.u().a();
            int $$13 = ghy.c($$3, 0.0F);
            goz $$14 = this.a.a($$12);
            $$0.a();
            $$0.a(0.2F, -0.35F, 0.5F);
            $$0.a(a.d.rotationDegrees(-48.0F));
            $$0.b(-1.0F, -1.0F, 1.0F);
            $$0.a(-0.5F, -0.5F, -0.5F);
            this.a($$0, $$1, $$2, $$11, $$12, $$13, $$14);
            $$0.b();
            $$0.a();
            $$0.a(0.2F, -0.35F, 0.5F);
            $$0.a(a.d.rotationDegrees(42.0F));
            $$0.a(0.1F, 0.0F, -0.6F);
            $$0.a(a.d.rotationDegrees(-48.0F));
            $$0.b(-1.0F, -1.0F, 1.0F);
            $$0.a(-0.5F, -0.5F, -0.5F);
            this.a($$0, $$1, $$2, $$11, $$12, $$13, $$14);
            $$0.b();
            $$0.a();
            this.c().d().a($$0);
            $$0.a(0.0F, -0.7F, -0.2F);
            $$0.a(a.d.rotationDegrees(-78.0F));
            $$0.b(-1.0F, -1.0F, 1.0F);
            $$0.a(-0.5F, -0.5F, -0.5F);
            this.a($$0, $$1, $$2, $$11, $$12, $$13, $$14);
            $$0.b();
         }
      }
   }

   private void a(exx $$0, gbo $$1, int $$2, boolean $$3, dqh $$4, int $$5, goz $$6) {
      if ($$3) {
         this.a.b().a($$0.c(), $$1.getBuffer(gbw.r(gmx.e)), $$4, $$6, 0.0F, 0.0F, 0.0F, $$2, $$5);
      } else {
         this.a.a($$4, $$0, $$1, $$2, $$5);
      }
   }
}
