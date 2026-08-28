public class gth extends gsp<cin, gzf, gct> {
   private static final alz a = alz.b("textures/entity/fish/salmon.png");
   private final gct b;
   private final gct k;
   private final gct l;

   public gth(grj.a $$0) {
      super($$0, new gct($$0.a(geg.ct)), 0.4F);
      this.b = new gct($$0.a(geg.cv));
      this.k = new gct($$0.a(geg.ct));
      this.l = new gct($$0.a(geg.cu));
   }

   public void a(cin $$0, gzf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gu();
   }

   public alz a(gzf $$0) {
      return a;
   }

   public gzf b() {
      return new gzf();
   }

   protected void a(gzf $$0, fgl $$1, float $$2, float $$3) {
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

   public void a(gzf $$0, fgl $$1, gle $$2, int $$3) {
      if ($$0.a == cin.a.a) {
         this.h = this.b;
      } else if ($$0.a == cin.a.c) {
         this.h = this.l;
      } else {
         this.h = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
