public class gua extends gti<chs, haa, gdo> {
   private static final aku a = aku.b("textures/entity/fish/salmon.png");
   private final gdo b;
   private final gdo k;
   private final gdo l;

   public gua(gsc.a $$0) {
      super($$0, new gdo($$0.a(gfb.cw)), 0.4F);
      this.b = new gdo($$0.a(gfb.cy));
      this.k = new gdo($$0.a(gfb.cw));
      this.l = new gdo($$0.a(gfb.cx));
   }

   public void a(chs $$0, haa $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gx();
   }

   public aku a(haa $$0) {
      return a;
   }

   public haa b() {
      return new haa();
   }

   protected void a(haa $$0, ffu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.ak) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * ayz.a($$5 * 0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(haa $$0, ffu $$1, glx $$2, int $$3) {
      if ($$0.a == chs.a.a) {
         this.h = this.b;
      } else if ($$0.a == chs.a.c) {
         this.h = this.l;
      } else {
         this.h = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
