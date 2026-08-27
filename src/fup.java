import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fup implements fui<dgp> {
   public static final gfs a = new gfs(gdn.e, new agt("entity/conduit/base"));
   public static final gfs b = new gfs(gdn.e, new agt("entity/conduit/cage"));
   public static final gfs c = new gfs(gdn.e, new agt("entity/conduit/wind"));
   public static final gfs d = new gfs(gdn.e, new agt("entity/conduit/wind_vertical"));
   public static final gfs e = new gfs(gdn.e, new agt("entity/conduit/open_eye"));
   public static final gfs f = new gfs(gdn.e, new agt("entity/conduit/closed_eye"));
   private final fly g;
   private final fly h;
   private final fly i;
   private final fly j;
   private final fuh k;

   public fup(fuj.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(flx.A);
      this.h = $$0.a(flx.C);
      this.i = $$0.a(flx.B);
      this.j = $$0.a(flx.z);
   }

   public static fme b() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      $$1.a("eye", fmd.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new fmc(0.01F)), fma.a);
      return fme.a($$0, 16, 16);
   }

   public static fme c() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      $$1.a("wind", fmd.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), fma.a);
      return fme.a($$0, 64, 32);
   }

   public static fme d() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      $$1.a("shell", fmd.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), fma.a);
      return fme.a($$0, 32, 16);
   }

   public static fme e() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      $$1.a("shell", fmd.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fma.a);
      return fme.a($$0, 32, 16);
   }

   public void a(dgp $$0, float $$1, epd $$2, fsi $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.d()) {
         float $$7 = $$0.a(0.0F);
         eph $$8 = a.a($$3, fsq::c);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.i.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = aty.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.j.a($$2, b.a($$3, fsq::e), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         eph $$13 = ($$12 == 1 ? d : c).a($$3, fsq::e);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         etv $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.f() ? e : f).a($$3, fsq::e), $$4, $$5);
         $$2.b();
      }
   }
}
