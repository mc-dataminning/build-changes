import javax.annotation.Nullable;

public class guw extends gxa<cms, hbk, gei> {
   public static final alg a = alg.b("textures/entity/armorstand/wood.png");
   private final gei j = this.c();
   private final gei k;

   public guw(gvz.a $$0) {
      super($$0, new gej($$0.a(git.f)), 0.0F);
      this.k = new gej($$0.a(git.i));
      this.a(new hac<>(this, new gei($$0.a(git.g)), new gei($$0.a(git.h)), new gei($$0.a(git.j)), new gei($$0.a(git.k)), $$0.h()));
      this.a(new haf<>(this));
      this.a(new hay<>(this, $$0.f(), $$0.h()));
      this.a(new gzs<>(this, $$0.f()));
   }

   public alg a(hbk $$0) {
      return a;
   }

   public hbk a() {
      return new hbk();
   }

   public void a(cms $$0, hbk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gwq.a($$0, $$1, $$2, this.h);
      $$1.a = azm.i($$2, $$0.N, $$0.dL());
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
      $$1.b = (float)($$0.dV().ae() - $$0.bC) + $$2;
   }

   public void a(hbk $$0, fjc $$1, gps $$2, int $$3) {
      this.g = $$0.d ? this.k : this.j;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(hbk $$0, fjc $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(azm.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(cms $$0, double $$1) {
      return $$0.cL();
   }

   @Nullable
   protected gqc a(hbk $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         alg $$4 = this.a($$0);
         if ($$2) {
            return gqc.c($$4, false);
         } else {
            return $$1 ? gqc.a($$4, false) : null;
         }
      }
   }
}
