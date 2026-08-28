import javax.annotation.Nullable;

public class gql extends gsp<clp, gwz, gah> {
   public static final alz a = alz.b("textures/entity/armorstand/wood.png");
   private final gah b = this.c();
   private final gah k;

   public gql(gro.a $$0) {
      super($$0, new gai($$0.a(gel.f)), 0.0F);
      this.k = new gai($$0.a(gel.i));
      this.a(new gvs<>(this, new gah($$0.a(gel.g)), new gah($$0.a(gel.h)), new gah($$0.a(gel.j)), new gah($$0.a(gel.k)), $$0.h()));
      this.a(new gvv<>(this, $$0.b()));
      this.a(new gwo<>(this, $$0.f(), $$0.h()));
      this.a(new gvh<>(this, $$0.f(), $$0.b()));
   }

   public alz a(gwz $$0) {
      return a;
   }

   public gwz a() {
      return new gwz();
   }

   public void a(clp $$0, gwz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsf.a((bwf)$$0, (gyj)$$1, $$2);
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

   public void a(gwz $$0, fgq $$1, glj $$2, int $$3) {
      this.h = $$0.d ? this.k : this.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gwz $$0, fgq $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(bae.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(clp $$0, double $$1) {
      return $$0.cL();
   }

   @Nullable
   protected glt a(gwz $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         alz $$4 = this.a($$0);
         if ($$2) {
            return glt.c($$4, false);
         } else {
            return $$1 ? glt.a($$4, false) : null;
         }
      }
   }
}
