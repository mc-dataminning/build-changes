import javax.annotation.Nullable;

public class gmm extends gop<cjw, gsx, fwm> {
   public static final ale a = ale.b("textures/entity/armorstand/wood.png");
   private final fwm b = this.e();
   private final fwm k;

   public gmm(gno.a $$0) {
      super($$0, new fwn($$0.a(gap.d)), 0.0F);
      this.k = new fwn($$0.a(gap.g));
      this.a(new grr<>(this, new fwm($$0.a(gap.e)), new fwm($$0.a(gap.f)), new fwm($$0.a(gap.h)), new fwm($$0.a(gap.i)), $$0.g()));
      this.a(new gru<>(this, $$0.b()));
      this.a(new grk<>(this, $$0.f()));
      this.a(new grg<>(this, $$0.f(), $$0.b()));
   }

   public ale a(gsx $$0) {
      return a;
   }

   public gsx a() {
      return new gsx();
   }

   public void a(cjw $$0, gsx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gof.a((bun)$$0, (gug)$$1, $$2);
      $$1.a = azf.i($$2, $$0.O, $$0.dI());
      $$1.c = $$0.A();
      $$1.d = $$0.t();
      $$1.e = $$0.w();
      $$1.f = $$0.y();
      $$1.h = $$0.C();
      $$1.g = $$0.B();
      $$1.i = $$0.D();
      $$1.j = $$0.E();
      $$1.k = $$0.F();
      $$1.l = $$0.G();
      $$1.b = (float)($$0.dS().aa() - $$0.bQ) + $$2;
   }

   public void a(gsx $$0, fdi $$1, ghl $$2, int $$3) {
      this.h = $$0.d ? this.k : this.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gsx $$0, fdi $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(azf.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(cjw $$0, double $$1) {
      return $$0.cI();
   }

   @Nullable
   protected ghv a(gsx $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ale $$4 = this.a($$0);
         if ($$2) {
            return ghv.c($$4, false);
         } else {
            return $$1 ? ghv.a($$4, false) : null;
         }
      }
   }
}
