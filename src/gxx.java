public class gxx extends gxf<cjr, hdw, ghf> {
   private static final alg a = alg.b("textures/entity/fish/salmon.png");
   private final ghf j;
   private final ghf k;
   private final ghf l;

   public gxx(gvz.a $$0) {
      super($$0, new ghf($$0.a(git.cI)), 0.4F);
      this.j = new ghf($$0.a(git.cK));
      this.k = new ghf($$0.a(git.cI));
      this.l = new ghf($$0.a(git.cJ));
   }

   public void a(cjr $$0, hdw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gw();
   }

   public alg a(hdw $$0) {
      return a;
   }

   public hdw b() {
      return new hdw();
   }

   protected void a(hdw $$0, fjc $$1, float $$2, float $$3) {
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

   public void a(hdw $$0, fjc $$1, gps $$2, int $$3) {
      if ($$0.a == cjr.a.a) {
         this.g = this.j;
      } else if ($$0.a == cjr.a.c) {
         this.g = this.l;
      } else {
         this.g = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
