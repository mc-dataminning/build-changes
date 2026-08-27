import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fvm implements fvf<dhg> {
   public static final ggo a = new ggo(gek.e, new ahg("entity/conduit/base"));
   public static final ggo b = new ggo(gek.e, new ahg("entity/conduit/cage"));
   public static final ggo c = new ggo(gek.e, new ahg("entity/conduit/wind"));
   public static final ggo d = new ggo(gek.e, new ahg("entity/conduit/wind_vertical"));
   public static final ggo e = new ggo(gek.e, new ahg("entity/conduit/open_eye"));
   public static final ggo f = new ggo(gek.e, new ahg("entity/conduit/closed_eye"));
   private final fmv g;
   private final fmv h;
   private final fmv i;
   private final fmv j;
   private final fve k;

   public fvm(fvg.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(fmu.A);
      this.h = $$0.a(fmu.C);
      this.i = $$0.a(fmu.B);
      this.j = $$0.a(fmu.z);
   }

   public static fnb b() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      $$1.a("eye", fna.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new fmz(0.01F)), fmx.a);
      return fnb.a($$0, 16, 16);
   }

   public static fnb c() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      $$1.a("wind", fna.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), fmx.a);
      return fnb.a($$0, 64, 32);
   }

   public static fnb d() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      $$1.a("shell", fna.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), fmx.a);
      return fnb.a($$0, 32, 16);
   }

   public static fnb e() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      $$1.a("shell", fna.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fmx.a);
      return fnb.a($$0, 32, 16);
   }

   public void a(dhg $$0, float $$1, epz $$2, ftf $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.d()) {
         float $$7 = $$0.a(0.0F);
         eqd $$8 = a.a($$3, ftn::c);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.i.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = aun.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.j.a($$2, b.a($$3, ftn::e), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         eqd $$13 = ($$12 == 1 ? d : c).a($$3, ftn::e);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         eur $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.f() ? e : f).a($$3, ftn::e), $$4, $$5);
         $$2.b();
      }
   }
}
