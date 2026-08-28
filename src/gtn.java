public class gtn extends gsv<cir, gzl, gcz> {
   private static final alz a = alz.b("textures/entity/fish/salmon.png");
   private final gcz b;
   private final gcz k;
   private final gcz l;

   public gtn(grp.a $$0) {
      super($$0, new gcz($$0.a(gem.ct)), 0.4F);
      this.b = new gcz($$0.a(gem.cv));
      this.k = new gcz($$0.a(gem.ct));
      this.l = new gcz($$0.a(gem.cu));
   }

   public void a(cir $$0, gzl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gw();
   }

   public alz a(gzl $$0) {
      return a;
   }

   public gzl b() {
      return new gzl();
   }

   protected void a(gzl $$0, fgr $$1, float $$2, float $$3) {
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

   public void a(gzl $$0, fgr $$1, glk $$2, int $$3) {
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
