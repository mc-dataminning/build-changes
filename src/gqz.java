import javax.annotation.Nullable;

public class gqz extends gtd<ckq, gxo, gav> {
   public static final aku a = aku.b("textures/entity/armorstand/wood.png");
   private final gav b = this.c();
   private final gav k;

   public gqz(gsc.a $$0) {
      super($$0, new gaw($$0.a(gfb.f)), 0.0F);
      this.k = new gaw($$0.a(gfb.i));
      this.a(new gwg<>(this, new gav($$0.a(gfb.g)), new gav($$0.a(gfb.h)), new gav($$0.a(gfb.j)), new gav($$0.a(gfb.k)), $$0.h()));
      this.a(new gwj<>(this));
      this.a(new gxc<>(this, $$0.f(), $$0.h()));
      this.a(new gvv<>(this, $$0.f()));
   }

   public aku a(gxo $$0) {
      return a;
   }

   public gxo a() {
      return new gxo();
   }

   public void a(ckq $$0, gxo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gst.a($$0, $$1, $$2, this.i);
      $$1.a = ayz.i($$2, $$0.N, $$0.dM());
      $$1.c = $$0.x();
      $$1.d = $$0.p();
      $$1.j = $$0.t();
      $$1.k = $$0.u();
      $$1.m = $$0.z();
      $$1.l = $$0.y();
      $$1.n = $$0.A();
      $$1.o = $$0.B();
      $$1.p = $$0.C();
      $$1.q = $$0.D();
      $$1.b = (float)($$0.dW().ad() - $$0.bP) + $$2;
   }

   public void a(gxo $$0, ffu $$1, glx $$2, int $$3) {
      this.h = $$0.d ? this.k : this.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gxo $$0, ffu $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(ayz.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(ckq $$0, double $$1) {
      return $$0.cL();
   }

   @Nullable
   protected gmh a(gxo $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         aku $$4 = this.a($$0);
         if ($$2) {
            return gmh.c($$4, false);
         } else {
            return $$1 ? gmh.a($$4, false) : null;
         }
      }
   }
}
