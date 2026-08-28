import javax.annotation.Nullable;

public class gvq extends gxu<cnd, hce, gfb> {
   public static final alg a = alg.b("textures/entity/armorstand/wood.png");
   private final gfb j = this.c();
   private final gfb k;

   public gvq(gwt.a $$0) {
      super($$0, new gfc($$0.a(gjn.f)), 0.0F);
      this.k = new gfc($$0.a(gjn.i));
      this.a(new haw<>(this, new gfb($$0.a(gjn.g)), new gfb($$0.a(gjn.h)), new gfb($$0.a(gjn.j)), new gfb($$0.a(gjn.k)), $$0.h()));
      this.a(new haz<>(this));
      this.a(new hbs<>(this, $$0.f(), $$0.h()));
      this.a(new ham<>(this, $$0.f()));
   }

   public alg a(hce $$0) {
      return a;
   }

   public hce a() {
      return new hce();
   }

   public void a(cnd $$0, hce $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gxk.a($$0, $$1, $$2, this.h);
      $$1.a = azm.i($$2, $$0.N, $$0.dK());
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
      $$1.b = (float)($$0.dU().ae() - $$0.bD) + $$2;
   }

   public void a(hce $$0, fjy $$1, gqm $$2, int $$3) {
      this.g = $$0.d ? this.k : this.j;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(hce $$0, fjy $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(azm.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(cnd $$0, double $$1) {
      return $$0.cK();
   }

   @Nullable
   protected gqx a(hce $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         alg $$4 = this.a($$0);
         if ($$2) {
            return gqx.c($$4, false);
         } else {
            return $$1 ? gqx.a($$4, false) : null;
         }
      }
   }
}
