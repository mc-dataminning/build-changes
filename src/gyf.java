public class gyf extends gxn<cjv, hee, ghn> {
   private static final alg a = alg.b("textures/entity/fish/salmon.png");
   private final ghn j;
   private final ghn k;
   private final ghn l;

   public gyf(gwh.a $$0) {
      super($$0, new ghn($$0.a(gjb.cK)), 0.4F);
      this.j = new ghn($$0.a(gjb.cM));
      this.k = new ghn($$0.a(gjb.cK));
      this.l = new ghn($$0.a(gjb.cL));
   }

   public void a(cjv $$0, hee $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gx();
   }

   public alg a(hee $$0) {
      return a;
   }

   public hee b() {
      return new hee();
   }

   protected void a(hee $$0, fjj $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.ak) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * azm.a($$5 * 0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(hee $$0, fjj $$1, gqa $$2, int $$3) {
      if ($$0.a == cjv.a.a) {
         this.g = this.j;
      } else if ($$0.a == cjv.a.c) {
         this.g = this.l;
      } else {
         this.g = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
