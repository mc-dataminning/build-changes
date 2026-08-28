public class gto extends gsw<cis, gzm, gda> {
   private static final alz a = alz.b("textures/entity/fish/salmon.png");
   private final gda b;
   private final gda k;
   private final gda l;

   public gto(grq.a $$0) {
      super($$0, new gda($$0.a(gen.ct)), 0.4F);
      this.b = new gda($$0.a(gen.cv));
      this.k = new gda($$0.a(gen.ct));
      this.l = new gda($$0.a(gen.cu));
   }

   public void a(cis $$0, gzm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gw();
   }

   public alz a(gzm $$0) {
      return a;
   }

   public gzm b() {
      return new gzm();
   }

   protected void a(gzm $$0, fgs $$1, float $$2, float $$3) {
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

   public void a(gzm $$0, fgs $$1, gll $$2, int $$3) {
      if ($$0.a == cis.a.a) {
         this.h = this.b;
      } else if ($$0.a == cis.a.c) {
         this.h = this.l;
      } else {
         this.h = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
