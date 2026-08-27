import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gcg implements gbz<dmr> {
   public static final gnm a = new gnm(gli.e, new ajt("entity/conduit/base"));
   public static final gnm b = new gnm(gli.e, new ajt("entity/conduit/cage"));
   public static final gnm c = new gnm(gli.e, new ajt("entity/conduit/wind"));
   public static final gnm d = new gnm(gli.e, new ajt("entity/conduit/wind_vertical"));
   public static final gnm e = new gnm(gli.e, new ajt("entity/conduit/open_eye"));
   public static final gnm f = new gnm(gli.e, new ajt("entity/conduit/closed_eye"));
   private final ftm g;
   private final ftm h;
   private final ftm i;
   private final ftm j;
   private final gby k;

   public gcg(gca.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(ftl.D);
      this.h = $$0.a(ftl.F);
      this.i = $$0.a(ftl.E);
      this.j = $$0.a(ftl.C);
   }

   public static fts b() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      $$1.a("eye", ftr.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new ftq(0.01F)), fto.a);
      return fts.a($$0, 16, 16);
   }

   public static fts c() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      $$1.a("wind", ftr.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), fto.a);
      return fts.a($$0, 64, 32);
   }

   public static fts d() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      $$1.a("shell", ftr.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), fto.a);
      return fts.a($$0, 32, 16);
   }

   public static fts e() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      $$1.a("shell", ftr.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fto.a);
      return fts.a($$0, 32, 16);
   }

   public void a(dmr $$0, float $$1, ewi $$2, fzz $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.c()) {
         float $$7 = $$0.a(0.0F);
         ewm $$8 = a.a($$3, gah::c);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.i.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = axk.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.j.a($$2, b.a($$3, gah::e), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         ewm $$13 = ($$12 == 1 ? d : c).a($$3, gah::e);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         fba $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.d() ? e : f).a($$3, gah::e), $$4, $$5);
         $$2.b();
      }
   }
}
