public class gpl extends gou<cgy, gvh, fzc> {
   private static final ale a = ale.b("textures/entity/fish/salmon.png");
   private final fzc b;
   private final fzc k;
   private final fzc l;

   public gpl(gno.a $$0) {
      super($$0, new fzc($$0.a(gap.ca)), 0.4F);
      this.b = new fzc($$0.a(gap.cb));
      this.k = new fzc($$0.a(gap.ca));
      this.l = new fzc($$0.a(gap.cc));
   }

   public void a(cgy $$0, gvh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gx();
   }

   public ale a(gvh $$0) {
      return a;
   }

   public gvh c() {
      return new gvh();
   }

   protected void a(gvh $$0, fdi $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.af) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * azf.a($$5 * 0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(gvh $$0, fdi $$1, ghl $$2, int $$3) {
      if ($$0.a == cgy.a.a) {
         this.h = this.b;
      } else if ($$0.a == cgy.a.c) {
         this.h = this.l;
      } else {
         this.h = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
