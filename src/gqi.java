import javax.annotation.Nullable;

public class gqi extends gsm<clh, gww, gac> {
   public static final alp a = alp.b("textures/entity/armorstand/wood.png");
   private final gac b = this.c();
   private final gac k;

   public gqi(grl.a $$0) {
      super($$0, new gad($$0.a(gei.f)), 0.0F);
      this.k = new gad($$0.a(gei.i));
      this.a(new gvp<>(this, new gac($$0.a(gei.g)), new gac($$0.a(gei.h)), new gac($$0.a(gei.j)), new gac($$0.a(gei.k)), $$0.h()));
      this.a(new gvs<>(this, $$0.b()));
      this.a(new gwl<>(this, $$0.f(), $$0.h()));
      this.a(new gve<>(this, $$0.f(), $$0.b()));
   }

   public alp a(gww $$0) {
      return a;
   }

   public gww a() {
      return new gww();
   }

   public void a(clh $$0, gww $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsc.a((bvx)$$0, (gyg)$$1, $$2);
      $$1.a = azu.i($$2, $$0.N, $$0.dM());
      $$1.c = $$0.x();
      $$1.d = $$0.p();
      $$1.e = $$0.t();
      $$1.f = $$0.u();
      $$1.h = $$0.z();
      $$1.g = $$0.y();
      $$1.i = $$0.A();
      $$1.j = $$0.B();
      $$1.k = $$0.C();
      $$1.l = $$0.D();
      $$1.b = (float)($$0.dW().ad() - $$0.bQ) + $$2;
   }

   public void a(gww $$0, fgl $$1, glg $$2, int $$3) {
      this.h = $$0.d ? this.k : this.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gww $$0, fgl $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(azu.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(clh $$0, double $$1) {
      return $$0.cL();
   }

   @Nullable
   protected glq a(gww $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         alp $$4 = this.a($$0);
         if ($$2) {
            return glq.c($$4, false);
         } else {
            return $$1 ? glq.a($$4, false) : null;
         }
      }
   }
}
