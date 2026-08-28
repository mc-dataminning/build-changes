import org.joml.Quaternionf;

public abstract class gqc extends grn<crt, gxf> {
   public gqc(gro.a $$0) {
      super($$0);
      this.f = 0.8F;
   }

   public void a(gxf $$0, fgq $$1, glj $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.375F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$0.a));
      float $$4 = $$0.c;
      if ($$4 > 0.0F) {
         $$1.a(a.b.rotationDegrees(bae.a($$4) * $$4 * $$0.d / 10.0F * (float)$$0.b));
      }

      if (!bae.a($$0.e, 0.0F)) {
         $$1.a(new Quaternionf().setAngleAxis($$0.e * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      $$1.b(-1.0F, -1.0F, 1.0F);
      $$1.a(a.d.rotationDegrees(90.0F));
      gbk<gxf> $$5 = this.a();
      $$5.a($$0);
      fgu $$6 = $$2.getBuffer(this.b());
      $$5.a($$1, $$6, $$3, hba.d);
      this.b($$0, $$1, $$2, $$3);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected void b(gxf $$0, fgq $$1, glj $$2, int $$3) {
   }

   protected abstract gbk<gxf> a();

   protected abstract glt b();

   public gxf c() {
      return new gxf();
   }

   public void a(crt $$0, gxf $$1, float $$2) {
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
