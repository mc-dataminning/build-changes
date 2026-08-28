public class gie extends gke<cla, ftk<cla>> {
   private static final alf a = new alf("textures/entity/breeze/breeze.png");

   public gie(giy.a $$0) {
      super($$0, new ftk<>($$0.a(fxa.s)), 0.5F);
      this.a(new gmj(this));
      this.a(new gmi(this));
   }

   public void a(cla $$0, float $$1, float $$2, ezz $$3, gdp $$4, int $$5) {
      ftk<cla> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public alf a(cla $$0) {
      return a;
   }

   public static ftk<cla> a(ftk<cla> $$0, fxb... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fxb $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
