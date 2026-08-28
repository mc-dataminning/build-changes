public class gtj extends gsr<cij, gzh, gcv> {
   private static final alp a = alp.b("textures/entity/fish/salmon.png");
   private final gcv b;
   private final gcv k;
   private final gcv l;

   public gtj(grl.a $$0) {
      super($$0, new gcv($$0.a(gei.cw)), 0.4F);
      this.b = new gcv($$0.a(gei.cy));
      this.k = new gcv($$0.a(gei.cw));
      this.l = new gcv($$0.a(gei.cx));
   }

   public void a(cij $$0, gzh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gw();
   }

   public alp a(gzh $$0) {
      return a;
   }

   public gzh b() {
      return new gzh();
   }

   protected void a(gzh $$0, fgl $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.af) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * azu.a($$5 * 0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(gzh $$0, fgl $$1, glg $$2, int $$3) {
      if ($$0.a == cij.a.a) {
         this.h = this.b;
      } else if ($$0.a == cij.a.c) {
         this.h = this.l;
      } else {
         this.h = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
