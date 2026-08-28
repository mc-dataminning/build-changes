import javax.annotation.Nullable;

public class goi extends gql<ckr, guv, fyh> {
   public static final alj a = alj.b("textures/entity/armorstand/wood.png");
   private final fyh b = this.c();
   private final fyh k;

   public goi(gpk.a $$0) {
      super($$0, new fyi($$0.a(gck.f)), 0.0F);
      this.k = new fyi($$0.a(gck.i));
      this.a(new gto<>(this, new fyh($$0.a(gck.g)), new fyh($$0.a(gck.h)), new fyh($$0.a(gck.j)), new fyh($$0.a(gck.k)), $$0.h()));
      this.a(new gtr<>(this, $$0.b()));
      this.a(new guk<>(this, $$0.f(), $$0.h()));
      this.a(new gtd<>(this, $$0.f(), $$0.b()));
   }

   public alj a(guv $$0) {
      return a;
   }

   public guv a() {
      return new guv();
   }

   public void a(ckr $$0, guv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gqb.a((bvh)$$0, (gwe)$$1, $$2);
      $$1.a = azm.i($$2, $$0.N, $$0.dL());
      $$1.c = $$0.x();
      $$1.d = $$0.q();
      $$1.e = $$0.t();
      $$1.f = $$0.v();
      $$1.h = $$0.z();
      $$1.g = $$0.y();
      $$1.i = $$0.A();
      $$1.j = $$0.B();
      $$1.k = $$0.C();
      $$1.l = $$0.D();
      $$1.b = (float)($$0.dV().ab() - $$0.bP) + $$2;
   }

   public void a(guv $$0, fer $$1, gjg $$2, int $$3) {
      this.h = $$0.d ? this.k : this.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(guv $$0, fer $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(azm.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(ckr $$0, double $$1) {
      return $$0.cL();
   }

   @Nullable
   protected gjq a(guv $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         alj $$4 = this.a($$0);
         if ($$2) {
            return gjq.c($$4, false);
         } else {
            return $$1 ? gjq.a($$4, false) : null;
         }
      }
   }
}
