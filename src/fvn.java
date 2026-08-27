import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fvn implements fvg<dhg> {
   public static final ggp a = new ggp(gel.e, new ahg("entity/conduit/base"));
   public static final ggp b = new ggp(gel.e, new ahg("entity/conduit/cage"));
   public static final ggp c = new ggp(gel.e, new ahg("entity/conduit/wind"));
   public static final ggp d = new ggp(gel.e, new ahg("entity/conduit/wind_vertical"));
   public static final ggp e = new ggp(gel.e, new ahg("entity/conduit/open_eye"));
   public static final ggp f = new ggp(gel.e, new ahg("entity/conduit/closed_eye"));
   private final fmw g;
   private final fmw h;
   private final fmw i;
   private final fmw j;
   private final fvf k;

   public fvn(fvh.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(fmv.A);
      this.h = $$0.a(fmv.C);
      this.i = $$0.a(fmv.B);
      this.j = $$0.a(fmv.z);
   }

   public static fnc b() {
      fne $$0 = new fne();
      fnf $$1 = $$0.a();
      $$1.a("eye", fnb.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new fna(0.01F)), fmy.a);
      return fnc.a($$0, 16, 16);
   }

   public static fnc c() {
      fne $$0 = new fne();
      fnf $$1 = $$0.a();
      $$1.a("wind", fnb.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), fmy.a);
      return fnc.a($$0, 64, 32);
   }

   public static fnc d() {
      fne $$0 = new fne();
      fnf $$1 = $$0.a();
      $$1.a("shell", fnb.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), fmy.a);
      return fnc.a($$0, 32, 16);
   }

   public static fnc e() {
      fne $$0 = new fne();
      fnf $$1 = $$0.a();
      $$1.a("shell", fnb.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fmy.a);
      return fnc.a($$0, 32, 16);
   }

   public void a(dhg $$0, float $$1, eqa $$2, ftg $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.d()) {
         float $$7 = $$0.a(0.0F);
         eqe $$8 = a.a($$3, fto::c);
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
         this.j.a($$2, b.a($$3, fto::e), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         eqe $$13 = ($$12 == 1 ? d : c).a($$3, fto::e);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         eus $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.f() ? e : f).a($$3, fto::e), $$4, $$5);
         $$2.b();
      }
   }
}
