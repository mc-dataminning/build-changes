import javax.annotation.Nullable;

public class gxf extends gzj<cnr, hdu, ggr> {
   public static final ali a = ali.b("textures/entity/armorstand/wood.png");
   private final ggr j = this.c();
   private final ggr k;

   public gxf(gyi.a $$0) {
      super($$0, new ggs($$0.a(gld.f)), 0.0F);
      this.k = new ggs($$0.a(gld.i));
      this.a(new hcl<>(this, new ggr($$0.a(gld.g)), new ggr($$0.a(gld.h)), new ggr($$0.a(gld.j)), new ggr($$0.a(gld.k)), $$0.h()));
      this.a(new hco<>(this));
      this.a(new hdi<>(this, $$0.f(), $$0.h()));
      this.a(new hcb<>(this, $$0.f()));
   }

   public ali a(hdu $$0) {
      return a;
   }

   public hdu a() {
      return new hdu();
   }

   public void a(cnr $$0, hdu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyz.a($$0, $$1, $$2, this.h);
      $$1.a = azo.i($$2, $$0.N, $$0.dL());
      $$1.c = $$0.t();
      $$1.d = $$0.m();
      $$1.j = $$0.n();
      $$1.k = $$0.q();
      $$1.m = $$0.x();
      $$1.l = $$0.u();
      $$1.n = $$0.y();
      $$1.o = $$0.z();
      $$1.p = $$0.A();
      $$1.q = $$0.B();
      $$1.b = (float)($$0.dV().ae() - $$0.bD) + $$2;
   }

   public void a(hdu $$0, flo $$1, gsa $$2, int $$3) {
      this.g = $$0.d ? this.k : this.j;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(hdu $$0, flo $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(azo.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(cnr $$0, double $$1) {
      return $$0.cL();
   }

   @Nullable
   protected gsl a(hdu $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ali $$4 = this.a($$0);
         if ($$2) {
            return gsl.c($$4, false);
         } else {
            return $$1 ? gsl.a($$4, false) : null;
         }
      }
   }
}
