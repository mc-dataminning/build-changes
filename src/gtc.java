import javax.annotation.Nullable;

public class gtc extends gvg<cmc, gzq, gct> {
   public static final ald a = ald.b("textures/entity/armorstand/wood.png");
   private final gct j = this.c();
   private final gct k;

   public gtc(guf.a $$0) {
      super($$0, new gcu($$0.a(ghc.f)), 0.0F);
      this.k = new gcu($$0.a(ghc.i));
      this.a(new gyi<>(this, new gct($$0.a(ghc.g)), new gct($$0.a(ghc.h)), new gct($$0.a(ghc.j)), new gct($$0.a(ghc.k)), $$0.h()));
      this.a(new gyl<>(this));
      this.a(new gze<>(this, $$0.f(), $$0.h()));
      this.a(new gxy<>(this, $$0.f()));
   }

   public ald a(gzq $$0) {
      return a;
   }

   public gzq a() {
      return new gzq();
   }

   public void a(cmc $$0, gzq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      guw.a($$0, $$1, $$2, this.h);
      $$1.a = azk.i($$2, $$0.N, $$0.dL());
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
      $$1.b = (float)($$0.dV().ae() - $$0.bB) + $$2;
   }

   public void a(gzq $$0, fho $$1, gny $$2, int $$3) {
      this.g = $$0.d ? this.k : this.j;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gzq $$0, fho $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(azk.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(cmc $$0, double $$1) {
      return $$0.cL();
   }

   @Nullable
   protected goi a(gzq $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ald $$4 = this.a($$0);
         if ($$2) {
            return goi.c($$4, false);
         } else {
            return $$1 ? goi.a($$4, false) : null;
         }
      }
   }
}
