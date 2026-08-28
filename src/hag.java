public class hag extends gzo<ckl, hgg, gjp> {
   private static final ali a = ali.b("textures/entity/fish/salmon.png");
   private final gjp j;
   private final gjp k;
   private final gjp l;

   public hag(gyi.a $$0) {
      super($$0, new gjp($$0.a(gld.cK)), 0.4F);
      this.j = new gjp($$0.a(gld.cM));
      this.k = new gjp($$0.a(gld.cK));
      this.l = new gjp($$0.a(gld.cL));
   }

   public void a(ckl $$0, hgg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gA();
   }

   public ali a(hgg $$0) {
      return a;
   }

   public hgg b() {
      return new hgg();
   }

   protected void a(hgg $$0, flo $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.ak) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * azo.a($$5 * 0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(hgg $$0, flo $$1, gsa $$2, int $$3) {
      if ($$0.a == ckl.a.a) {
         this.g = this.j;
      } else if ($$0.a == ckl.a.c) {
         this.g = this.l;
      } else {
         this.g = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
