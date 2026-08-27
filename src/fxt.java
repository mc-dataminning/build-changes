import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fxt implements fxm<djf> {
   public static final gix a = new gix(ggt.e, new aiy("entity/conduit/base"));
   public static final gix b = new gix(ggt.e, new aiy("entity/conduit/cage"));
   public static final gix c = new gix(ggt.e, new aiy("entity/conduit/wind"));
   public static final gix d = new gix(ggt.e, new aiy("entity/conduit/wind_vertical"));
   public static final gix e = new gix(ggt.e, new aiy("entity/conduit/open_eye"));
   public static final gix f = new gix(ggt.e, new aiy("entity/conduit/closed_eye"));
   private final fpc g;
   private final fpc h;
   private final fpc i;
   private final fpc j;
   private final fxl k;

   public fxt(fxn.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(fpb.z);
      this.h = $$0.a(fpb.B);
      this.i = $$0.a(fpb.A);
      this.j = $$0.a(fpb.y);
   }

   public static fpi b() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      $$1.a("eye", fph.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new fpg(0.01F)), fpe.a);
      return fpi.a($$0, 16, 16);
   }

   public static fpi c() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      $$1.a("wind", fph.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), fpe.a);
      return fpi.a($$0, 64, 32);
   }

   public static fpi d() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      $$1.a("shell", fph.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), fpe.a);
      return fpi.a($$0, 32, 16);
   }

   public static fpi e() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      $$1.a("shell", fph.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fpe.a);
      return fpi.a($$0, 32, 16);
   }

   public void a(djf $$0, float $$1, esa $$2, fvm $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.d()) {
         float $$7 = $$0.a(0.0F);
         ese $$8 = a.a($$3, fvu::c);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.i.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = awh.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.j.a($$2, b.a($$3, fvu::e), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         ese $$13 = ($$12 == 1 ? d : c).a($$3, fvu::e);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         ews $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.f() ? e : f).a($$3, fvu::e), $$4, $$5);
         $$2.b();
      }
   }
}
