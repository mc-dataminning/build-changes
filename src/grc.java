import javax.annotation.Nullable;

public class grc extends gtg<cks, gxr, gax> {
   public static final akv a = akv.b("textures/entity/armorstand/wood.png");
   private final gax b = this.c();
   private final gax k;

   public grc(gsf.a $$0) {
      super($$0, new gay($$0.a(gfd.f)), 0.0F);
      this.k = new gay($$0.a(gfd.i));
      this.a(new gwj<>(this, new gax($$0.a(gfd.g)), new gax($$0.a(gfd.h)), new gax($$0.a(gfd.j)), new gax($$0.a(gfd.k)), $$0.h()));
      this.a(new gwm<>(this));
      this.a(new gxf<>(this, $$0.f(), $$0.h()));
      this.a(new gvy<>(this, $$0.f()));
   }

   public akv a(gxr $$0) {
      return a;
   }

   public gxr a() {
      return new gxr();
   }

   public void a(cks $$0, gxr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsw.a($$0, $$1, $$2, this.i);
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

   public void a(gxr $$0, ffv $$1, glz $$2, int $$3) {
      this.h = $$0.d ? this.k : this.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gxr $$0, ffv $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(ayz.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(cks $$0, double $$1) {
      return $$0.cL();
   }

   @Nullable
   protected gmj a(gxr $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         akv $$4 = this.a($$0);
         if ($$2) {
            return gmj.c($$4, false);
         } else {
            return $$1 ? gmj.a($$4, false) : null;
         }
      }
   }
}
