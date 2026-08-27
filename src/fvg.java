import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fvg implements fuz<dha> {
   public static final ggj a = new ggj(gee.e, new ahd("entity/conduit/base"));
   public static final ggj b = new ggj(gee.e, new ahd("entity/conduit/cage"));
   public static final ggj c = new ggj(gee.e, new ahd("entity/conduit/wind"));
   public static final ggj d = new ggj(gee.e, new ahd("entity/conduit/wind_vertical"));
   public static final ggj e = new ggj(gee.e, new ahd("entity/conduit/open_eye"));
   public static final ggj f = new ggj(gee.e, new ahd("entity/conduit/closed_eye"));
   private final fmp g;
   private final fmp h;
   private final fmp i;
   private final fmp j;
   private final fuy k;

   public fvg(fva.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(fmo.A);
      this.h = $$0.a(fmo.C);
      this.i = $$0.a(fmo.B);
      this.j = $$0.a(fmo.z);
   }

   public static fmv b() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      $$1.a("eye", fmu.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new fmt(0.01F)), fmr.a);
      return fmv.a($$0, 16, 16);
   }

   public static fmv c() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      $$1.a("wind", fmu.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), fmr.a);
      return fmv.a($$0, 64, 32);
   }

   public static fmv d() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      $$1.a("shell", fmu.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), fmr.a);
      return fmv.a($$0, 32, 16);
   }

   public static fmv e() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      $$1.a("shell", fmu.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fmr.a);
      return fmv.a($$0, 32, 16);
   }

   public void a(dha $$0, float $$1, ept $$2, fsz $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.d()) {
         float $$7 = $$0.a(0.0F);
         epx $$8 = a.a($$3, fth::c);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.i.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = aui.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.j.a($$2, b.a($$3, fth::e), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         epx $$13 = ($$12 == 1 ? d : c).a($$3, fth::e);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         eul $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.f() ? e : f).a($$3, fth::e), $$4, $$5);
         $$2.b();
      }
   }
}
