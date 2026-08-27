import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fwa implements fvt<dhp> {
   public static final ghe a = new ghe(gfa.e, new ahh("entity/conduit/base"));
   public static final ghe b = new ghe(gfa.e, new ahh("entity/conduit/cage"));
   public static final ghe c = new ghe(gfa.e, new ahh("entity/conduit/wind"));
   public static final ghe d = new ghe(gfa.e, new ahh("entity/conduit/wind_vertical"));
   public static final ghe e = new ghe(gfa.e, new ahh("entity/conduit/open_eye"));
   public static final ghe f = new ghe(gfa.e, new ahh("entity/conduit/closed_eye"));
   private final fnj g;
   private final fnj h;
   private final fnj i;
   private final fnj j;
   private final fvs k;

   public fwa(fvu.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(fni.z);
      this.h = $$0.a(fni.B);
      this.i = $$0.a(fni.A);
      this.j = $$0.a(fni.y);
   }

   public static fnp b() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      $$1.a("eye", fno.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new fnn(0.01F)), fnl.a);
      return fnp.a($$0, 16, 16);
   }

   public static fnp c() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      $$1.a("wind", fno.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), fnl.a);
      return fnp.a($$0, 64, 32);
   }

   public static fnp d() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      $$1.a("shell", fno.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), fnl.a);
      return fnp.a($$0, 32, 16);
   }

   public static fnp e() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      $$1.a("shell", fno.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fnl.a);
      return fnp.a($$0, 32, 16);
   }

   public void a(dhp $$0, float $$1, eqk $$2, ftt $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.d()) {
         float $$7 = $$0.a(0.0F);
         eqo $$8 = a.a($$3, fub::c);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.i.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = aup.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.j.a($$2, b.a($$3, fub::e), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         eqo $$13 = ($$12 == 1 ? d : c).a($$3, fub::e);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         evc $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.f() ? e : f).a($$3, fub::e), $$4, $$5);
         $$2.b();
      }
   }
}
