public class gop extends gny<cgq, gul, fyo> {
   private static final alb a = alb.b("textures/entity/fish/salmon.png");
   private final fyo b;
   private final fyo k;
   private final fyo l;

   public gop(gms.a $$0) {
      super($$0, new fyo($$0.a(gaa.bZ)), 0.4F);
      this.b = new fyo($$0.a(gaa.ca));
      this.k = new fyo($$0.a(gaa.bZ));
      this.l = new fyo($$0.a(gaa.cb));
   }

   public void a(cgq $$0, gul $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gx();
   }

   public alb a(gul $$0) {
      return a;
   }

   public gul c() {
      return new gul();
   }

   protected void a(gul $$0, fcu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.af) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * azc.a($$5 * 0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$6));
      $$1.a(0.0F, 0.0F, -0.4F);
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(gul $$0, fcu $$1, ggv $$2, int $$3) {
      if ($$0.a == cgq.a.a) {
         this.h = this.b;
      } else if ($$0.a == cgq.a.c) {
         this.h = this.l;
      } else {
         this.h = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
