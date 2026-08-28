public class hai extends gzq<ckn, hgi, gjr> {
   private static final alk a = alk.b("textures/entity/fish/salmon.png");
   private final gjr j;
   private final gjr k;
   private final gjr l;

   public hai(gyk.a $$0) {
      super($$0, new gjr($$0.a(glf.cK)), 0.4F);
      this.j = new gjr($$0.a(glf.cM));
      this.k = new gjr($$0.a(glf.cK));
      this.l = new gjr($$0.a(glf.cL));
   }

   public void a(ckn $$0, hgi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gA();
   }

   public alk a(hgi $$0) {
      return a;
   }

   public hgi b() {
      return new hgi();
   }

   protected void a(hgi $$0, flq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.ak) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * azq.a($$5 * 0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(hgi $$0, flq $$1, gsc $$2, int $$3) {
      if ($$0.a == ckn.a.a) {
         this.g = this.j;
      } else if ($$0.a == ckn.a.c) {
         this.g = this.l;
      } else {
         this.g = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
