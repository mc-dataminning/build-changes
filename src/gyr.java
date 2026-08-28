public class gyr extends gxz<cka, heq, ghz> {
   private static final alg a = alg.b("textures/entity/fish/salmon.png");
   private final ghz j;
   private final ghz k;
   private final ghz l;

   public gyr(gwt.a $$0) {
      super($$0, new ghz($$0.a(gjn.cK)), 0.4F);
      this.j = new ghz($$0.a(gjn.cM));
      this.k = new ghz($$0.a(gjn.cK));
      this.l = new ghz($$0.a(gjn.cL));
   }

   public void a(cka $$0, heq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gz();
   }

   public alg a(heq $$0) {
      return a;
   }

   public heq b() {
      return new heq();
   }

   protected void a(heq $$0, fjy $$1, float $$2, float $$3) {
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

   public void a(heq $$0, fjy $$1, gqm $$2, int $$3) {
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
