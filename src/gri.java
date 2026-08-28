public class gri extends gqq<cht, gxf, gax> {
   private static final alj a = alj.b("textures/entity/fish/salmon.png");
   private final gax b;
   private final gax k;
   private final gax l;

   public gri(gpk.a $$0) {
      super($$0, new gax($$0.a(gck.cq)), 0.4F);
      this.b = new gax($$0.a(gck.cs));
      this.k = new gax($$0.a(gck.cq));
      this.l = new gax($$0.a(gck.cr));
   }

   public void a(cht $$0, gxf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gv();
   }

   public alj a(gxf $$0) {
      return a;
   }

   public gxf b() {
      return new gxf();
   }

   protected void a(gxf $$0, fer $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.af) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * azm.a($$5 * 0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(gxf $$0, fer $$1, gjg $$2, int $$3) {
      if ($$0.a == cht.a.a) {
         this.h = this.b;
      } else if ($$0.a == cht.a.c) {
         this.h = this.l;
      } else {
         this.h = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
