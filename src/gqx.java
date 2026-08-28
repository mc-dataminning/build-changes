public class gqx extends gqg<chq, gwu, gao> {
   private static final all a = all.b("textures/entity/fish/salmon.png");
   private final gao b;
   private final gao k;
   private final gao l;

   public gqx(gpa.a $$0) {
      super($$0, new gao($$0.a(gcb.ca)), 0.4F);
      this.b = new gao($$0.a(gcb.cb));
      this.k = new gao($$0.a(gcb.ca));
      this.l = new gao($$0.a(gcb.cc));
   }

   public void a(chq $$0, gwu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gE();
   }

   public all a(gwu $$0) {
      return a;
   }

   public gwu c() {
      return new gwu();
   }

   protected void a(gwu $$0, fek $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.af) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * azn.a($$5 * 0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(gwu $$0, fek $$1, gix $$2, int $$3) {
      if ($$0.a == chq.a.a) {
         this.h = this.b;
      } else if ($$0.a == chq.a.c) {
         this.h = this.l;
      } else {
         this.h = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
