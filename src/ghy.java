public class ghy extends gjy<cku, fte<cku>> {
   private static final alb a = new alb("textures/entity/breeze/breeze.png");

   public ghy(gis.a $$0) {
      super($$0, new fte<>($$0.a(fwu.s)), 0.5F);
      this.a(new gmd(this));
      this.a(new gmc(this));
   }

   public void a(cku $$0, float $$1, float $$2, ezt $$3, gdj $$4, int $$5) {
      fte<cku> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public alb a(cku $$0) {
      return a;
   }

   public static fte<cku> a(fte<cku> $$0, fwv... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fwv $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
