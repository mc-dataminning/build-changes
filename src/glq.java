import javax.annotation.Nullable;

public class glq extends gnt<cjo, gsb, fvy> {
   public static final alb a = alb.b("textures/entity/armorstand/wood.png");
   private final fvy b = this.e();
   private final fvy k;

   public glq(gms.a $$0) {
      super($$0, new fvz($$0.a(gaa.d)), 0.0F);
      this.k = new fvz($$0.a(gaa.g));
      this.a(new gqv<>(this, new fvy($$0.a(gaa.e)), new fvy($$0.a(gaa.f)), new fvy($$0.a(gaa.h)), new fvy($$0.a(gaa.i)), $$0.g()));
      this.a(new gqy<>(this, $$0.b()));
      this.a(new gqo<>(this, $$0.f()));
      this.a(new gqk<>(this, $$0.f(), $$0.b()));
   }

   public alb a(gsb $$0) {
      return a;
   }

   public gsb a() {
      return new gsb();
   }

   public void a(cjo $$0, gsb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gnj.a((buf)$$0, (gtk)$$1, $$2);
      $$1.a = azc.i($$2, $$0.O, $$0.dI());
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
      $$1.b = (float)($$0.dS().aa() - $$0.bR) + $$2;
   }

   public void a(gsb $$0, fcu $$1, ggv $$2, int $$3) {
      this.h = $$0.d ? this.k : this.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gsb $$0, fcu $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(azc.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(cjo $$0, double $$1) {
      return $$0.cI();
   }

   @Nullable
   protected ghe a(gsb $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         alb $$4 = this.a($$0);
         if ($$2) {
            return ghe.c($$4, false);
         } else {
            return $$1 ? ghe.a($$4, false) : null;
         }
      }
   }
}
