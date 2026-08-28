import javax.annotation.Nullable;

public class grb extends gtf<ckr, gxq, gaw> {
   public static final akv a = akv.b("textures/entity/armorstand/wood.png");
   private final gaw b = this.c();
   private final gaw k;

   public grb(gse.a $$0) {
      super($$0, new gax($$0.a(gfc.f)), 0.0F);
      this.k = new gax($$0.a(gfc.i));
      this.a(new gwi<>(this, new gaw($$0.a(gfc.g)), new gaw($$0.a(gfc.h)), new gaw($$0.a(gfc.j)), new gaw($$0.a(gfc.k)), $$0.h()));
      this.a(new gwl<>(this));
      this.a(new gxe<>(this, $$0.f(), $$0.h()));
      this.a(new gvx<>(this, $$0.f()));
   }

   public akv a(gxq $$0) {
      return a;
   }

   public gxq a() {
      return new gxq();
   }

   public void a(ckr $$0, gxq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsv.a($$0, $$1, $$2, this.i);
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

   public void a(gxq $$0, ffu $$1, gly $$2, int $$3) {
      this.h = $$0.d ? this.k : this.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gxq $$0, ffu $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(ayz.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(ckr $$0, double $$1) {
      return $$0.cL();
   }

   @Nullable
   protected gmi a(gxq $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         akv $$4 = this.a($$0);
         if ($$2) {
            return gmi.c($$4, false);
         } else {
            return $$1 ? gmi.a($$4, false) : null;
         }
      }
   }
}
