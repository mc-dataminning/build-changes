import javax.annotation.Nullable;

public class gny extends gqb<cko, guk, fxy> {
   public static final all a = all.b("textures/entity/armorstand/wood.png");
   private final fxy b = this.e();
   private final fxy k;

   public gny(gpa.a $$0) {
      super($$0, new fxz($$0.a(gcb.d)), 0.0F);
      this.k = new fxz($$0.a(gcb.g));
      this.a(new gtd<>(this, new fxy($$0.a(gcb.e)), new fxy($$0.a(gcb.f)), new fxy($$0.a(gcb.h)), new fxy($$0.a(gcb.i)), $$0.h()));
      this.a(new gtg<>(this, $$0.b()));
      this.a(new gtz<>(this, $$0.f(), $$0.h()));
      this.a(new gss<>(this, $$0.f(), $$0.b()));
   }

   public all a(guk $$0) {
      return a;
   }

   public guk a() {
      return new guk();
   }

   public void a(cko $$0, guk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gpr.a((bve)$$0, (gvt)$$1, $$2);
      $$1.a = azn.i($$2, $$0.O, $$0.dO());
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
      $$1.b = (float)($$0.dY().aa() - $$0.bQ) + $$2;
   }

   public void a(guk $$0, fek $$1, gix $$2, int $$3) {
      this.h = $$0.d ? this.k : this.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(guk $$0, fek $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(azn.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(cko $$0, double $$1) {
      return $$0.cN();
   }

   @Nullable
   protected gjh a(guk $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         all $$4 = this.a($$0);
         if ($$2) {
            return gjh.c($$4, false);
         } else {
            return $$1 ? gjh.a($$4, false) : null;
         }
      }
   }
}
