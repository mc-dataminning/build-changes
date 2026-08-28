public class gpw extends gpf<chh, gvt, fzn> {
   private static final alh a = alh.b("textures/entity/fish/salmon.png");
   private final fzn b;
   private final fzn k;
   private final fzn l;

   public gpw(gnz.a $$0) {
      super($$0, new fzn($$0.a(gba.ca)), 0.4F);
      this.b = new fzn($$0.a(gba.cb));
      this.k = new fzn($$0.a(gba.ca));
      this.l = new fzn($$0.a(gba.cc));
   }

   public void a(chh $$0, gvt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gE();
   }

   public alh a(gvt $$0) {
      return a;
   }

   public gvt c() {
      return new gvt();
   }

   protected void a(gvt $$0, fdt $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.af) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * azj.a($$5 * 0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(gvt $$0, fdt $$1, ghw $$2, int $$3) {
      if ($$0.a == chh.a.a) {
         this.h = this.b;
      } else if ($$0.a == chh.a.c) {
         this.h = this.l;
      } else {
         this.h = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
