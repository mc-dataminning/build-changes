public class gaa<T extends bxe> extends gaf<T, fhi<T>> {
   private final fro a;

   public gaa(fxs<T, fhi<T>> $$0, fro $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(enw $$0, fqu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.n_()) {
         etd $$10 = etd.N();
         boolean $$11 = $$10.b($$3) && $$3.ce();
         if (!$$3.ce() || $$11) {
            dhi $$12 = $$3.w().a();
            int $$13 = fwy.c($$3, 0.0F);
            gdv $$14 = this.a.a($$12);
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

   private void a(enw $$0, fqu $$1, int $$2, boolean $$3, dhi $$4, int $$5, gdv $$6) {
      if ($$3) {
         this.a.b().a($$0.c(), $$1.getBuffer(frc.q(gbt.e)), $$4, $$6, 0.0F, 0.0F, 0.0F, $$2, $$5);
      } else {
         this.a.a($$4, $$0, $$1, $$2, $$5);
      }
   }
}
