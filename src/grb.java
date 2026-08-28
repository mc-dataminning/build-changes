public class grb extends gpq<chr, gws, fyk<gws>> {
   private final fyk<gws> a = this.e();
   private final fyk<gws> b;
   private static final ali k = ali.b("textures/entity/fish/tropical_a.png");
   private static final ali l = ali.b("textures/entity/fish/tropical_b.png");

   public grb(gok.a $$0) {
      super($$0, new gar($$0.a(gbl.cO)), 0.15F);
      this.b = new gas($$0.a(gbl.cM));
      this.a(new gtg(this, $$0.f()));
   }

   public ali a(gws $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public gws c() {
      return new gws();
   }

   public void a(chr $$0, gws $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gF();
      $$1.b = $$0.gD().d();
      $$1.c = $$0.gE().d();
   }

   public void a(gws $$0, feb $$1, gih $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.b;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(gws $$0) {
      return $$0.b;
   }

   protected void a(gws $$0, feb $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azk.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
