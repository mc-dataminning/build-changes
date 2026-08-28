public class gtz extends gth<chr, gzz, gdm> {
   private static final aku a = aku.b("textures/entity/fish/salmon.png");
   private final gdm b;
   private final gdm k;
   private final gdm l;

   public gtz(gsb.a $$0) {
      super($$0, new gdm($$0.a(gez.cw)), 0.4F);
      this.b = new gdm($$0.a(gez.cy));
      this.k = new gdm($$0.a(gez.cw));
      this.l = new gdm($$0.a(gez.cx));
   }

   public void a(chr $$0, gzz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gx();
   }

   public aku a(gzz $$0) {
      return a;
   }

   public gzz b() {
      return new gzz();
   }

   protected void a(gzz $$0, ffs $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.ak) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * ayy.a($$5 * 0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(gzz $$0, ffs $$1, glv $$2, int $$3) {
      if ($$0.a == chr.a.a) {
         this.h = this.b;
      } else if ($$0.a == chr.a.c) {
         this.h = this.l;
      } else {
         this.h = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
