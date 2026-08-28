public class guc extends gtk<cht, hac, gdp> {
   private static final akv a = akv.b("textures/entity/fish/salmon.png");
   private final gdp b;
   private final gdp k;
   private final gdp l;

   public guc(gse.a $$0) {
      super($$0, new gdp($$0.a(gfc.cw)), 0.4F);
      this.b = new gdp($$0.a(gfc.cy));
      this.k = new gdp($$0.a(gfc.cw));
      this.l = new gdp($$0.a(gfc.cx));
   }

   public void a(cht $$0, hac $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gA();
   }

   public akv a(hac $$0) {
      return a;
   }

   public hac b() {
      return new hac();
   }

   protected void a(hac $$0, ffu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.ak) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * ayz.a($$5 * 0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(hac $$0, ffu $$1, gly $$2, int $$3) {
      if ($$0.a == cht.a.a) {
         this.h = this.b;
      } else if ($$0.a == cht.a.c) {
         this.h = this.l;
      } else {
         this.h = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
