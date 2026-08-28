import javax.annotation.Nullable;

public class gsa extends gue<cll, gyp, gbu> {
   public static final aku a = aku.b("textures/entity/armorstand/wood.png");
   private final gbu b = this.c();
   private final gbu k;

   public gsa(gtd.a $$0) {
      super($$0, new gbv($$0.a(ggb.f)), 0.0F);
      this.k = new gbv($$0.a(ggb.i));
      this.a(new gxh<>(this, new gbu($$0.a(ggb.g)), new gbu($$0.a(ggb.h)), new gbu($$0.a(ggb.j)), new gbu($$0.a(ggb.k)), $$0.h()));
      this.a(new gxk<>(this));
      this.a(new gyd<>(this, $$0.f(), $$0.h()));
      this.a(new gww<>(this, $$0.f()));
   }

   public aku a(gyp $$0) {
      return a;
   }

   public gyp a() {
      return new gyp();
   }

   public void a(cll $$0, gyp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gtu.a($$0, $$1, $$2, this.i);
      $$1.a = ayz.i($$2, $$0.N, $$0.dK());
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
      $$1.b = (float)($$0.dU().ae() - $$0.bC) + $$2;
   }

   public void a(gyp $$0, fgr $$1, gmx $$2, int $$3) {
      this.h = $$0.d ? this.k : this.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gyp $$0, fgr $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(ayz.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(cll $$0, double $$1) {
      return $$0.cK();
   }

   @Nullable
   protected gnh a(gyp $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         aku $$4 = this.a($$0);
         if ($$2) {
            return gnh.c($$4, false);
         } else {
            return $$1 ? gnh.a($$4, false) : null;
         }
      }
   }
}
