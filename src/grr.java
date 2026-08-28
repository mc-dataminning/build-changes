public class grr extends gqg<chv, gxi, fza<gxi>> {
   private final fza<gxi> a = this.e();
   private final fza<gxi> b;
   private static final all k = all.b("textures/entity/fish/tropical_a.png");
   private static final all l = all.b("textures/entity/fish/tropical_b.png");

   public grr(gpa.a $$0) {
      super($$0, new gbh($$0.a(gcb.cO)), 0.15F);
      this.b = new gbi($$0.a(gcb.cM));
      this.a(new gtw(this, $$0.f()));
   }

   public all a(gxi $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public gxi c() {
      return new gxi();
   }

   public void a(chv $$0, gxi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gG();
      $$1.b = $$0.gE().d();
      $$1.c = $$0.gF().d();
   }

   public void a(gxi $$0, fek $$1, gix $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.b;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(gxi $$0) {
      return $$0.b;
   }

   protected void a(gxi $$0, fek $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azn.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
