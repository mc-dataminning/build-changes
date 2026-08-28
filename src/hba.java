public class hba extends gzo<ckq, hgv, gia<hgv>> {
   private final gia<hgv> a = this.c();
   private final gia<hgv> j;
   private static final ali k = ali.b("textures/entity/fish/tropical_a.png");
   private static final ali l = ali.b("textures/entity/fish/tropical_b.png");

   public hba(gyi.a $$0) {
      super($$0, new gki($$0.a(gld.dG)), 0.15F);
      this.j = new gkj($$0.a(gld.dE));
      this.a(new hdg(this, $$0.f()));
   }

   public ali a(hgv $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public hgv b() {
      return new hgv();
   }

   public void a(ckq $$0, hgv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gC();
      $$1.b = $$0.gA().d();
      $$1.c = $$0.gB().d();
   }

   public void a(hgv $$0, flo $$1, gsa $$2, int $$3) {
      this.g = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.j;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(hgv $$0) {
      return $$0.b;
   }

   protected void a(hgv $$0, flo $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azo.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
