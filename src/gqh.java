public class gqh extends gpq<chm, gwe, fzy> {
   private static final ali a = ali.b("textures/entity/fish/salmon.png");
   private final fzy b;
   private final fzy k;
   private final fzy l;

   public gqh(gok.a $$0) {
      super($$0, new fzy($$0.a(gbl.ca)), 0.4F);
      this.b = new fzy($$0.a(gbl.cb));
      this.k = new fzy($$0.a(gbl.ca));
      this.l = new fzy($$0.a(gbl.cc));
   }

   public void a(chm $$0, gwe $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gD();
   }

   public ali a(gwe $$0) {
      return a;
   }

   public gwe c() {
      return new gwe();
   }

   protected void a(gwe $$0, feb $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.af) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * azk.a($$5 * 0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(gwe $$0, feb $$1, gih $$2, int $$3) {
      if ($$0.a == chm.a.a) {
         this.h = this.b;
      } else if ($$0.a == chm.a.c) {
         this.h = this.l;
      } else {
         this.h = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
