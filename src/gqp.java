import org.joml.Quaternionf;

public abstract class gqp extends gsa<cqs, gxt> {
   public gqp(gsb.a $$0) {
      super($$0);
      this.f = 0.8F;
   }

   public void a(gxt $$0, ffs $$1, glv $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.375F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$0.a));
      float $$4 = $$0.c;
      if ($$4 > 0.0F) {
         $$1.a(a.b.rotationDegrees(ayy.a($$4) * $$4 * $$0.d / 10.0F * (float)$$0.b));
      }

      if (!ayy.a($$0.e, 0.0F)) {
         $$1.a(new Quaternionf().setAngleAxis($$0.e * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      $$1.b(-1.0F, -1.0F, 1.0F);
      $$1.a(a.d.rotationDegrees(90.0F));
      gby<gxt> $$5 = this.a();
      $$5.a($$0);
      ffw $$6 = $$2.getBuffer(this.b());
      $$5.a($$1, $$6, $$3, hec.d);
      this.b($$0, $$1, $$2, $$3);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected void b(gxt $$0, ffs $$1, glv $$2, int $$3) {
   }

   protected abstract gby<gxt> a();

   protected abstract gmf b();

   public gxt c() {
      return new gxt();
   }

   public void a(cqs $$0, gxt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.k($$2);
      $$1.c = (float)$$0.N() - $$2;
      $$1.b = $$0.O();
      $$1.d = Math.max($$0.L() - $$2, 0.0F);
      $$1.e = $$0.a($$2);
      $$1.f = $$0.bo();
      $$1.g = $$0.a(0, $$2);
      $$1.h = $$0.a(1, $$2);
   }
}
