import javax.annotation.Nullable;

public class gqm extends gsq<clp, gxa, gai> {
   public static final alz a = alz.b("textures/entity/armorstand/wood.png");
   private final gai b = this.c();
   private final gai k;

   public gqm(grp.a $$0) {
      super($$0, new gaj($$0.a(gem.f)), 0.0F);
      this.k = new gaj($$0.a(gem.i));
      this.a(new gvt<>(this, new gai($$0.a(gem.g)), new gai($$0.a(gem.h)), new gai($$0.a(gem.j)), new gai($$0.a(gem.k)), $$0.h()));
      this.a(new gvw<>(this, $$0.b()));
      this.a(new gwp<>(this, $$0.f(), $$0.h()));
      this.a(new gvi<>(this, $$0.f(), $$0.b()));
   }

   public alz a(gxa $$0) {
      return a;
   }

   public gxa a() {
      return new gxa();
   }

   public void a(clp $$0, gxa $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsg.a((bwf)$$0, (gyk)$$1, $$2);
      $$1.a = bae.i($$2, $$0.N, $$0.dM());
      $$1.c = $$0.x();
      $$1.d = $$0.p();
      $$1.e = $$0.t();
      $$1.f = $$0.u();
      $$1.h = $$0.z();
      $$1.g = $$0.y();
      $$1.i = $$0.A();
      $$1.j = $$0.B();
      $$1.k = $$0.C();
      $$1.l = $$0.D();
      $$1.b = (float)($$0.dW().ac() - $$0.bQ) + $$2;
   }

   public void a(gxa $$0, fgr $$1, glk $$2, int $$3) {
      this.h = $$0.d ? this.k : this.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gxa $$0, fgr $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(bae.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(clp $$0, double $$1) {
      return $$0.cL();
   }

   @Nullable
   protected glu a(gxa $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         alz $$4 = this.a($$0);
         if ($$2) {
            return glu.c($$4, false);
         } else {
            return $$1 ? glu.a($$4, false) : null;
         }
      }
   }
}
