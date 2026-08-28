import javax.annotation.Nullable;

public class guh extends gwl<cmm, hav, gdw> {
   public static final ale a = ale.b("textures/entity/armorstand/wood.png");
   private final gdw j = this.c();
   private final gdw k;

   public guh(gvk.a $$0) {
      super($$0, new gdx($$0.a(gif.f)), 0.0F);
      this.k = new gdx($$0.a(gif.i));
      this.a(new gzn<>(this, new gdw($$0.a(gif.g)), new gdw($$0.a(gif.h)), new gdw($$0.a(gif.j)), new gdw($$0.a(gif.k)), $$0.h()));
      this.a(new gzq<>(this));
      this.a(new haj<>(this, $$0.f(), $$0.h()));
      this.a(new gzd<>(this, $$0.f()));
   }

   public ale a(hav $$0) {
      return a;
   }

   public hav a() {
      return new hav();
   }

   public void a(cmm $$0, hav $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gwb.a($$0, $$1, $$2, this.h);
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
      $$1.b = (float)($$0.dV().ae() - $$0.bC) + $$2;
   }

   public void a(hav $$0, fiq $$1, gpd $$2, int $$3) {
      this.g = $$0.d ? this.k : this.j;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(hav $$0, fiq $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(azk.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(cmm $$0, double $$1) {
      return $$0.cL();
   }

   @Nullable
   protected gpn a(hav $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ale $$4 = this.a($$0);
         if ($$2) {
            return gpn.c($$4, false);
         } else {
            return $$1 ? gpn.a($$4, false) : null;
         }
      }
   }
}
