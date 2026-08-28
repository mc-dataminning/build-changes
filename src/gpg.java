public class gpg extends gop<cgv, gvc, fyy> {
   private static final alc a = alc.b("textures/entity/fish/salmon.png");
   private final fyy b;
   private final fyy k;
   private final fyy l;

   public gpg(gnj.a $$0) {
      super($$0, new fyy($$0.a(gak.ca)), 0.4F);
      this.b = new fyy($$0.a(gak.cb));
      this.k = new fyy($$0.a(gak.ca));
      this.l = new fyy($$0.a(gak.cc));
   }

   public void a(cgv $$0, gvc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gy();
   }

   public alc a(gvc $$0) {
      return a;
   }

   public gvc c() {
      return new gvc();
   }

   protected void a(gvc $$0, fde $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.af) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * azd.a($$5 * 0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$6));
      $$1.a(0.0F, 0.0F, -0.4F);
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(gvc $$0, fde $$1, ghg $$2, int $$3) {
      if ($$0.a == cgv.a.a) {
         this.h = this.b;
      } else if ($$0.a == cgv.a.c) {
         this.h = this.l;
      } else {
         this.h = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
