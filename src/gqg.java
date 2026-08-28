import javax.annotation.Nullable;

public class gqg extends gsk<cll, gwu, gac> {
   public static final alz a = alz.b("textures/entity/armorstand/wood.png");
   private final gac b = this.c();
   private final gac k;

   public gqg(grj.a $$0) {
      super($$0, new gad($$0.a(geg.f)), 0.0F);
      this.k = new gad($$0.a(geg.i));
      this.a(new gvn<>(this, new gac($$0.a(geg.g)), new gac($$0.a(geg.h)), new gac($$0.a(geg.j)), new gac($$0.a(geg.k)), $$0.h()));
      this.a(new gvq<>(this, $$0.b()));
      this.a(new gwj<>(this, $$0.f(), $$0.h()));
      this.a(new gvc<>(this, $$0.f(), $$0.b()));
   }

   public alz a(gwu $$0) {
      return a;
   }

   public gwu a() {
      return new gwu();
   }

   public void a(cll $$0, gwu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsa.a((bwb)$$0, (gye)$$1, $$2);
      $$1.a = bae.i($$2, $$0.N, $$0.dL());
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
      $$1.b = (float)($$0.dV().ac() - $$0.bQ) + $$2;
   }

   public void a(gwu $$0, fgl $$1, gle $$2, int $$3) {
      this.h = $$0.d ? this.k : this.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gwu $$0, fgl $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(bae.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(cll $$0, double $$1) {
      return $$0.cL();
   }

   @Nullable
   protected glo a(gwu $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         alz $$4 = this.a($$0);
         if ($$2) {
            return glo.c($$4, false);
         } else {
            return $$1 ? glo.a($$4, false) : null;
         }
      }
   }
}
