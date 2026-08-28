public class gyw extends gye<cka, hew, gie> {
   private static final alg a = alg.b("textures/entity/fish/salmon.png");
   private final gie j;
   private final gie k;
   private final gie l;

   public gyw(gwy.a $$0) {
      super($$0, new gie($$0.a(gjs.cK)), 0.4F);
      this.j = new gie($$0.a(gjs.cM));
      this.k = new gie($$0.a(gjs.cK));
      this.l = new gie($$0.a(gjs.cL));
   }

   public void a(cka $$0, hew $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gz();
   }

   public alg a(hew $$0) {
      return a;
   }

   public hew b() {
      return new hew();
   }

   protected void a(hew $$0, fkd $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.ak) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * azm.a($$5 * 0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(hew $$0, fkd $$1, gqr $$2, int $$3) {
      if ($$0.a == cka.a.a) {
         this.g = this.j;
      } else if ($$0.a == cka.a.c) {
         this.g = this.l;
      } else {
         this.g = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
