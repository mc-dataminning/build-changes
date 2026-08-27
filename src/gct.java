public class gct<T extends byl> extends gcy<T, fjq<T>> {
   private final fub a;

   public gct(gai<T, fjq<T>> $$0, fub $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(eqb $$0, fth $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.o_()) {
         evi $$10 = evi.O();
         boolean $$11 = $$10.b($$3) && $$3.ce();
         if (!$$3.ce() || $$11) {
            djh $$12 = $$3.w().a();
            int $$13 = fzo.c($$3, 0.0F);
            ggn $$14 = this.a.a($$12);
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

   private void a(eqb $$0, fth $$1, int $$2, boolean $$3, djh $$4, int $$5, ggn $$6) {
      if ($$3) {
         this.a.b().a($$0.c(), $$1.getBuffer(ftp.r(gem.e)), $$4, $$6, 0.0F, 0.0F, 0.0F, $$2, $$5);
      } else {
         this.a.a($$4, $$0, $$1, $$2, $$5);
      }
   }
}
