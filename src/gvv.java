public class gvv extends guj<cis, hbq, gda<hbq>> {
   private final gda<hbq> a = this.c();
   private final gda<hbq> b;
   private static final aku k = aku.b("textures/entity/fish/tropical_a.png");
   private static final aku l = aku.b("textures/entity/fish/tropical_b.png");

   public gvv(gtd.a $$0) {
      super($$0, new gfh($$0.a(ggb.dq)), 0.15F);
      this.b = new gfi($$0.a(ggb.do));
      this.a(new gyb(this, $$0.f()));
   }

   public aku a(hbq $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public hbq b() {
      return new hbq();
   }

   public void a(cis $$0, hbq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gA();
      $$1.b = $$0.gy().d();
      $$1.c = $$0.gz().d();
   }

   public void a(hbq $$0, fgr $$1, gmx $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.b;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(hbq $$0) {
      return $$0.b;
   }

   protected void a(hbq $$0, fgr $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * ayz.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
