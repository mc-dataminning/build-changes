public class han extends gzb<clb, hgl, ghn<hgl>> {
   private final ghn<hgl> a = this.c();
   private final ghn<hgl> j;
   private static final alr k = alr.b("textures/entity/fish/tropical_a.png");
   private static final alr l = alr.b("textures/entity/fish/tropical_b.png");

   public han(gxv.a $$0) {
      super($$0, new gjv($$0.a(gkq.dG)), 0.15F);
      this.j = new gjw($$0.a(gkq.dE));
      this.a(new hct(this, $$0.f()));
   }

   public alr a(hgl $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public hgl b() {
      return new hgl();
   }

   public void a(clb $$0, hgl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gF();
      $$1.b = $$0.gD().d();
      $$1.c = $$0.gE().d();
   }

   public void a(hgl $$0, fld $$1, grn $$2, int $$3) {
      this.g = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.j;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(hgl $$0) {
      return $$0.b;
   }

   protected void a(hgl $$0, fld $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azz.a(0.6F * $$0.v);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.an) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
