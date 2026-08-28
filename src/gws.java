import javax.annotation.Nullable;

public class gws extends gyw<coc, hdh, gge> {
   public static final alr a = alr.b("textures/entity/armorstand/wood.png");
   private final gge j = this.c();
   private final gge k;

   public gws(gxv.a $$0) {
      super($$0, new ggf($$0.a(gkq.f)), 0.0F);
      this.k = new ggf($$0.a(gkq.i));
      this.a(new hby<>(this, new gge($$0.a(gkq.g)), new gge($$0.a(gkq.h)), new gge($$0.a(gkq.j)), new gge($$0.a(gkq.k)), $$0.h()));
      this.a(new hcb<>(this));
      this.a(new hcv<>(this, $$0.f(), $$0.h()));
      this.a(new hbo<>(this, $$0.f()));
   }

   public alr a(hdh $$0) {
      return a;
   }

   public hdh a() {
      return new hdh();
   }

   public void a(coc $$0, hdh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gym.a($$0, $$1, $$2, this.h);
      $$1.a = azz.i($$2, $$0.N, $$0.dL());
      $$1.c = $$0.w();
      $$1.d = $$0.p();
      $$1.j = $$0.s();
      $$1.k = $$0.u();
      $$1.m = $$0.y();
      $$1.l = $$0.x();
      $$1.n = $$0.z();
      $$1.o = $$0.A();
      $$1.p = $$0.B();
      $$1.q = $$0.C();
      $$1.b = (float)($$0.dV().ae() - $$0.bD) + $$2;
   }

   public void a(hdh $$0, fld $$1, grn $$2, int $$3) {
      this.g = $$0.d ? this.k : this.j;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(hdh $$0, fld $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(azz.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(coc $$0, double $$1) {
      return $$0.cL();
   }

   @Nullable
   protected gry a(hdh $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         alr $$4 = this.a($$0);
         if ($$2) {
            return gry.c($$4, false);
         } else {
            return $$1 ? gry.a($$4, false) : null;
         }
      }
   }
}
