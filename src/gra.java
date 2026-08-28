import javax.annotation.Nullable;

public class gra extends gte<ckq, gxp, gav> {
   public static final akv a = akv.b("textures/entity/armorstand/wood.png");
   private final gav b = this.c();
   private final gav k;

   public gra(gsd.a $$0) {
      super($$0, new gaw($$0.a(gfb.f)), 0.0F);
      this.k = new gaw($$0.a(gfb.i));
      this.a(new gwh<>(this, new gav($$0.a(gfb.g)), new gav($$0.a(gfb.h)), new gav($$0.a(gfb.j)), new gav($$0.a(gfb.k)), $$0.h()));
      this.a(new gwk<>(this));
      this.a(new gxd<>(this, $$0.f(), $$0.h()));
      this.a(new gvw<>(this, $$0.f()));
   }

   public akv a(gxp $$0) {
      return a;
   }

   public gxp a() {
      return new gxp();
   }

   public void a(ckq $$0, gxp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsu.a($$0, $$1, $$2, this.i);
      $$1.a = ayz.i($$2, $$0.N, $$0.dL());
      $$1.c = $$0.x();
      $$1.d = $$0.p();
      $$1.j = $$0.t();
      $$1.k = $$0.u();
      $$1.m = $$0.z();
      $$1.l = $$0.y();
      $$1.n = $$0.A();
      $$1.o = $$0.B();
      $$1.p = $$0.C();
      $$1.q = $$0.D();
      $$1.b = (float)($$0.dV().ad() - $$0.bP) + $$2;
   }

   public void a(gxp $$0, fft $$1, glx $$2, int $$3) {
      this.h = $$0.d ? this.k : this.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gxp $$0, fft $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(ayz.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(ckq $$0, double $$1) {
      return $$0.cL();
   }

   @Nullable
   protected gmh a(gxp $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         akv $$4 = this.a($$0);
         if ($$2) {
            return gmh.c($$4, false);
         } else {
            return $$1 ? gmh.a($$4, false) : null;
         }
      }
   }
}
