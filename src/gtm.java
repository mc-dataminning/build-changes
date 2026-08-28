public class gtm extends gsu<cir, gzk, gcy> {
   private static final alz a = alz.b("textures/entity/fish/salmon.png");
   private final gcy b;
   private final gcy k;
   private final gcy l;

   public gtm(gro.a $$0) {
      super($$0, new gcy($$0.a(gel.ct)), 0.4F);
      this.b = new gcy($$0.a(gel.cv));
      this.k = new gcy($$0.a(gel.ct));
      this.l = new gcy($$0.a(gel.cu));
   }

   public void a(cir $$0, gzk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gu();
   }

   public alz a(gzk $$0) {
      return a;
   }

   public gzk b() {
      return new gzk();
   }

   protected void a(gzk $$0, fgq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.af) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * bae.a($$5 * 0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(gzk $$0, fgq $$1, glj $$2, int $$3) {
      if ($$0.a == cir.a.a) {
         this.h = this.b;
      } else if ($$0.a == cir.a.c) {
         this.h = this.l;
      } else {
         this.h = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
