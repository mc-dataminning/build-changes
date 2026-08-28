public class gub extends gsp<cis, gzt, gbf<gzt>> {
   private final gbf<gzt> a = this.c();
   private final gbf<gzt> b;
   private static final alz k = alz.b("textures/entity/fish/tropical_a.png");
   private static final alz l = alz.b("textures/entity/fish/tropical_b.png");

   public gub(grj.a $$0) {
      super($$0, new gdm($$0.a(geg.dj)), 0.15F);
      this.b = new gdn($$0.a(geg.dh));
      this.a(new gwh(this, $$0.f()));
   }

   public alz a(gzt $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public gzt b() {
      return new gzt();
   }

   public void a(cis $$0, gzt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gw();
      $$1.b = $$0.gu().d();
      $$1.c = $$0.gv().d();
   }

   public void a(gzt $$0, fgl $$1, gle $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.b;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(gzt $$0) {
      return $$0.b;
   }

   protected void a(gzt $$0, fgl $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * bae.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
