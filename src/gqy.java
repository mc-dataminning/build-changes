import javax.annotation.Nullable;

public class gqy extends gtc<ckp, gxn, gat> {
   public static final aku a = aku.b("textures/entity/armorstand/wood.png");
   private final gat b = this.c();
   private final gat k;

   public gqy(gsb.a $$0) {
      super($$0, new gau($$0.a(gez.f)), 0.0F);
      this.k = new gau($$0.a(gez.i));
      this.a(new gwf<>(this, new gat($$0.a(gez.g)), new gat($$0.a(gez.h)), new gat($$0.a(gez.j)), new gat($$0.a(gez.k)), $$0.h()));
      this.a(new gwi<>(this));
      this.a(new gxb<>(this, $$0.f(), $$0.h()));
      this.a(new gvu<>(this, $$0.f()));
   }

   public aku a(gxn $$0) {
      return a;
   }

   public gxn a() {
      return new gxn();
   }

   public void a(ckp $$0, gxn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gss.a($$0, $$1, $$2, this.i);
      $$1.a = ayy.i($$2, $$0.N, $$0.dM());
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

   public void a(gxn $$0, ffs $$1, glv $$2, int $$3) {
      this.h = $$0.d ? this.k : this.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gxn $$0, ffs $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(ayy.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(ckp $$0, double $$1) {
      return $$0.cL();
   }

   @Nullable
   protected gmf a(gxn $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         aku $$4 = this.a($$0);
         if ($$2) {
            return gmf.c($$4, false);
         } else {
            return $$1 ? gmf.a($$4, false) : null;
         }
      }
   }
}
