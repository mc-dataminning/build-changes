public class gzt extends gzb<ckw, hfv, gjc> {
   private static final alr a = alr.b("textures/entity/fish/salmon.png");
   private final gjc j;
   private final gjc k;
   private final gjc l;

   public gzt(gxv.a $$0) {
      super($$0, new gjc($$0.a(gkq.cK)), 0.4F);
      this.j = new gjc($$0.a(gkq.cM));
      this.k = new gjc($$0.a(gkq.cK));
      this.l = new gjc($$0.a(gkq.cL));
   }

   public void a(ckw $$0, hfv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gA();
   }

   public alr a(hfv $$0) {
      return a;
   }

   public hfv b() {
      return new hfv();
   }

   protected void a(hfv $$0, fld $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.an) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * azz.a($$5 * 0.6F * $$0.v);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.an) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(hfv $$0, fld $$1, grn $$2, int $$3) {
      if ($$0.a == ckw.a.a) {
         this.g = this.j;
      } else if ($$0.a == ckw.a.c) {
         this.g = this.l;
      } else {
         this.g = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
