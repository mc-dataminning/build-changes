import javax.annotation.Nullable;

public class gve extends gxi<cmw, hbs, gep> {
   public static final alg a = alg.b("textures/entity/armorstand/wood.png");
   private final gep j = this.c();
   private final gep k;

   public gve(gwh.a $$0) {
      super($$0, new geq($$0.a(gjb.f)), 0.0F);
      this.k = new geq($$0.a(gjb.i));
      this.a(new hak<>(this, new gep($$0.a(gjb.g)), new gep($$0.a(gjb.h)), new gep($$0.a(gjb.j)), new gep($$0.a(gjb.k)), $$0.h()));
      this.a(new han<>(this));
      this.a(new hbg<>(this, $$0.f(), $$0.h()));
      this.a(new haa<>(this, $$0.f()));
   }

   public alg a(hbs $$0) {
      return a;
   }

   public hbs a() {
      return new hbs();
   }

   public void a(cmw $$0, hbs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gwy.a($$0, $$1, $$2, this.h);
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
      $$1.b = (float)($$0.dV().ae() - $$0.bD) + $$2;
   }

   public void a(hbs $$0, fjj $$1, gqa $$2, int $$3) {
      this.g = $$0.d ? this.k : this.j;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(hbs $$0, fjj $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(azm.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(cmw $$0, double $$1) {
      return $$0.cL();
   }

   @Nullable
   protected gqk a(hbs $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         alg $$4 = this.a($$0);
         if ($$2) {
            return gqk.c($$4, false);
         } else {
            return $$1 ? gqk.a($$4, false) : null;
         }
      }
   }
}
