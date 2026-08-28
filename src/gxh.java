import javax.annotation.Nullable;

public class gxh extends gzl<cnt, hdw, ggt> {
   public static final alk a = alk.b("textures/entity/armorstand/wood.png");
   private final ggt j = this.c();
   private final ggt k;

   public gxh(gyk.a $$0) {
      super($$0, new ggu($$0.a(glf.f)), 0.0F);
      this.k = new ggu($$0.a(glf.i));
      this.a(new hcn<>(this, new ggt($$0.a(glf.g)), new ggt($$0.a(glf.h)), new ggt($$0.a(glf.j)), new ggt($$0.a(glf.k)), $$0.h()));
      this.a(new hcq<>(this));
      this.a(new hdk<>(this, $$0.f(), $$0.h()));
      this.a(new hcd<>(this, $$0.f()));
   }

   public alk a(hdw $$0) {
      return a;
   }

   public hdw a() {
      return new hdw();
   }

   public void a(cnt $$0, hdw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gzb.a($$0, $$1, $$2, this.h);
      $$1.a = azq.i($$2, $$0.N, $$0.dL());
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
      $$1.b = (float)($$0.dV().ae() - $$0.bD) + $$2;
   }

   public void a(hdw $$0, flq $$1, gsc $$2, int $$3) {
      this.g = $$0.d ? this.k : this.j;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(hdw $$0, flq $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(azq.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(cnt $$0, double $$1) {
      return $$0.cL();
   }

   @Nullable
   protected gsn a(hdw $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         alk $$4 = this.a($$0);
         if ($$2) {
            return gsn.c($$4, false);
         } else {
            return $$1 ? gsn.a($$4, false) : null;
         }
      }
   }
}
