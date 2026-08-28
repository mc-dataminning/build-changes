import org.joml.Quaternionf;

public abstract class gvh extends gws<ctu, hck> {
   public gvh(gwt.a $$0) {
      super($$0);
      this.e = 0.8F;
   }

   public void a(hck $$0, fjy $$1, gqm $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.375F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$0.a));
      float $$4 = $$0.c;
      if ($$4 > 0.0F) {
         $$1.a(a.b.rotationDegrees(azm.a($$4) * $$4 * $$0.d / 10.0F * (float)$$0.b));
      }

      if (!$$0.f && !azm.a($$0.e, 0.0F)) {
         $$1.a(new Quaternionf().setAngleAxis($$0.e * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      $$1.b(-1.0F, -1.0F, 1.0F);
      $$1.a(a.d.rotationDegrees(90.0F));
      ggk<hck> $$5 = this.a();
      $$5.a($$0);
      fkc $$6 = $$2.getBuffer(this.b());
      $$5.a($$1, $$6, $$3, hja.d);
      this.b($$0, $$1, $$2, $$3);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected void b(hck $$0, fjy $$1, gqm $$2, int $$3) {
   }

   protected abstract ggk<hck> a();

   protected abstract gqx b();

   public hck c() {
      return new hck();
   }

   public void a(ctu $$0, hck $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.l($$2);
      $$1.c = (float)$$0.H() - $$2;
      $$1.b = $$0.I();
      $$1.d = Math.max($$0.G() - $$2, 0.0F);
      $$1.e = $$0.a($$2);
      $$1.f = $$0.bl();
      $$1.g = $$0.a(0, $$2);
      $$1.h = $$0.a(1, $$2);
   }
}
