public class gex extends ggx<cic, fqe<cic>> {
   private static final ajv a = new ajv("textures/entity/breeze/breeze.png");

   public gex(gfr.a $$0) {
      super($$0, new fqe<>($$0.a(ftu.s)), 0.5F);
      this.a(new gjb(this));
      this.a(new gja(this));
   }

   public void a(cic $$0, float $$1, float $$2, ewr $$3, gai $$4, int $$5) {
      fqe<cic> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajv a(cic $$0) {
      return a;
   }

   public static fqe<cic> a(fqe<cic> $$0, ftv... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (ftv $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
