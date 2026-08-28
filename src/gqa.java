public class gqa extends gop<cha, gvq, fxk<gvq>> {
   private final fxk<gvq> a = this.e();
   private final fxk<gvq> b;
   private static final alc k = alc.b("textures/entity/fish/tropical_a.png");
   private static final alc l = alc.b("textures/entity/fish/tropical_b.png");

   public gqa(gnj.a $$0) {
      super($$0, new fzq($$0.a(gak.cO)), 0.15F);
      this.b = new fzr($$0.a(gak.cM));
      this.a(new gsf(this, $$0.f()));
   }

   public alc a(gvq $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public gvq c() {
      return new gvq();
   }

   public void a(cha $$0, gvq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gA();
      $$1.b = $$0.gy().d();
      $$1.c = $$0.gz().d();
   }

   public void a(gvq $$0, fde $$1, ghg $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.b;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(gvq $$0) {
      return $$0.b;
   }

   protected void a(gvq $$0, fde $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azd.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
