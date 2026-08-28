import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ghe implements ggx<dqt> {
   public static final gso a = new gso(gqi.e, akr.b("entity/conduit/base"));
   public static final gso b = new gso(gqi.e, akr.b("entity/conduit/cage"));
   public static final gso c = new gso(gqi.e, akr.b("entity/conduit/wind"));
   public static final gso d = new gso(gqi.e, akr.b("entity/conduit/wind_vertical"));
   public static final gso e = new gso(gqi.e, akr.b("entity/conduit/open_eye"));
   public static final gso f = new gso(gqi.e, akr.b("entity/conduit/closed_eye"));
   private final fyi g;
   private final fyi h;
   private final fyi i;
   private final fyi j;
   private final ggw k;

   public ghe(ggy.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(fyh.E);
      this.h = $$0.a(fyh.G);
      this.i = $$0.a(fyh.F);
      this.j = $$0.a(fyh.D);
   }

   public static fyo b() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      $$1.a("eye", fyn.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new fym(0.01F)), fyk.a);
      return fyo.a($$0, 16, 16);
   }

   public static fyo c() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      $$1.a("wind", fyn.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), fyk.a);
      return fyo.a($$0, 64, 32);
   }

   public static fyo d() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      $$1.a("shell", fyn.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), fyk.a);
      return fyo.a($$0, 32, 16);
   }

   public static fyo e() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      $$1.a("shell", fyn.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fyk.a);
      return fyo.a($$0, 32, 16);
   }

   public void a(dqt $$0, float $$1, fbg $$2, gex $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.c()) {
         float $$7 = $$0.a(0.0F);
         fbk $$8 = a.a($$3, gff::c);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.i.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = ayo.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.j.a($$2, b.a($$3, gff::e), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         fbk $$13 = ($$12 == 1 ? d : c).a($$3, gff::e);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         ffw $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.d() ? e : f).a($$3, gff::e), $$4, $$5);
         $$2.b();
      }
   }
}
