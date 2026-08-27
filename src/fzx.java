import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fzx implements fzq<dks> {
   public static final glc a = new glc(giy.e, new ajh("entity/conduit/base"));
   public static final glc b = new glc(giy.e, new ajh("entity/conduit/cage"));
   public static final glc c = new glc(giy.e, new ajh("entity/conduit/wind"));
   public static final glc d = new glc(giy.e, new ajh("entity/conduit/wind_vertical"));
   public static final glc e = new glc(giy.e, new ajh("entity/conduit/open_eye"));
   public static final glc f = new glc(giy.e, new ajh("entity/conduit/closed_eye"));
   private final frd g;
   private final frd h;
   private final frd i;
   private final frd j;
   private final fzp k;

   public fzx(fzr.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(frc.z);
      this.h = $$0.a(frc.B);
      this.i = $$0.a(frc.A);
      this.j = $$0.a(frc.y);
   }

   public static frj b() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      $$1.a("eye", fri.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new frh(0.01F)), frf.a);
      return frj.a($$0, 16, 16);
   }

   public static frj c() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      $$1.a("wind", fri.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), frf.a);
      return frj.a($$0, 64, 32);
   }

   public static frj d() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      $$1.a("shell", fri.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), frf.a);
      return frj.a($$0, 32, 16);
   }

   public static frj e() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      $$1.a("shell", fri.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), frf.a);
      return frj.a($$0, 32, 16);
   }

   public void a(dks $$0, float $$1, etz $$2, fxq $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.c()) {
         float $$7 = $$0.a(0.0F);
         eud $$8 = a.a($$3, fxy::c);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.i.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = aww.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.j.a($$2, b.a($$3, fxy::e), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         eud $$13 = ($$12 == 1 ? d : c).a($$3, fxy::e);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         eyr $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.d() ? e : f).a($$3, fxy::e), $$4, $$5);
         $$2.b();
      }
   }
}
