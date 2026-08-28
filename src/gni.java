import javax.annotation.Nullable;

public class gni extends gpl<ckk, gtu, fxi> {
   public static final ali a = ali.b("textures/entity/armorstand/wood.png");
   private final fxi b = this.e();
   private final fxi k;

   public gni(gok.a $$0) {
      super($$0, new fxj($$0.a(gbl.d)), 0.0F);
      this.k = new fxj($$0.a(gbl.g));
      this.a(new gsn<>(this, new fxi($$0.a(gbl.e)), new fxi($$0.a(gbl.f)), new fxi($$0.a(gbl.h)), new fxi($$0.a(gbl.i)), $$0.h()));
      this.a(new gsq<>(this, $$0.b()));
      this.a(new gtj<>(this, $$0.f(), $$0.h()));
      this.a(new gsc<>(this, $$0.f(), $$0.b()));
   }

   public ali a(gtu $$0) {
      return a;
   }

   public gtu a() {
      return new gtu();
   }

   public void a(ckk $$0, gtu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gpb.a((bva)$$0, (gvd)$$1, $$2);
      $$1.a = azk.i($$2, $$0.O, $$0.dN());
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
      $$1.b = (float)($$0.dX().aa() - $$0.bQ) + $$2;
   }

   public void a(gtu $$0, feb $$1, gih $$2, int $$3) {
      this.h = $$0.d ? this.k : this.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gtu $$0, feb $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(azk.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(ckk $$0, double $$1) {
      return $$0.cM();
   }

   @Nullable
   protected gir a(gtu $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ali $$4 = this.a($$0);
         if ($$2) {
            return gir.c($$4, false);
         } else {
            return $$1 ? gir.a($$4, false) : null;
         }
      }
   }
}
