import javax.annotation.Nullable;

public class gmx extends gpa<ckf, gtj, fwx> {
   public static final alh a = alh.b("textures/entity/armorstand/wood.png");
   private final fwx b = this.e();
   private final fwx k;

   public gmx(gnz.a $$0) {
      super($$0, new fwy($$0.a(gba.d)), 0.0F);
      this.k = new fwy($$0.a(gba.g));
      this.a(new gsc<>(this, new fwx($$0.a(gba.e)), new fwx($$0.a(gba.f)), new fwx($$0.a(gba.h)), new fwx($$0.a(gba.i)), $$0.h()));
      this.a(new gsf<>(this, $$0.b()));
      this.a(new gsy<>(this, $$0.f(), $$0.h()));
      this.a(new grr<>(this, $$0.f(), $$0.b()));
   }

   public alh a(gtj $$0) {
      return a;
   }

   public gtj a() {
      return new gtj();
   }

   public void a(ckf $$0, gtj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      goq.a((buv)$$0, (gus)$$1, $$2);
      $$1.a = azj.i($$2, $$0.O, $$0.dN());
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

   public void a(gtj $$0, fdt $$1, ghw $$2, int $$3) {
      this.h = $$0.d ? this.k : this.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gtj $$0, fdt $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(azj.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(ckf $$0, double $$1) {
      return $$0.cM();
   }

   @Nullable
   protected gig a(gtj $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         alh $$4 = this.a($$0);
         if ($$2) {
            return gig.c($$4, false);
         } else {
            return $$1 ? gig.a($$4, false) : null;
         }
      }
   }
}
