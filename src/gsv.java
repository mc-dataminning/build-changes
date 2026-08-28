import java.util.EnumSet;
import java.util.Optional;

public class gsv implements gsm<dxx> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final gjc h;
   private final gjc i;
   private final gjc j;
   private final gjc k;
   private final gjc l;
   private final gjc m;
   private final gjc n;
   private static final float o = 0.125F;

   public gsv(gsn.a $$0) {
      this($$0.f());
   }

   public gsv(giy $$0) {
      gjc $$1 = $$0.a(gjb.av);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      gjc $$2 = $$0.a(gjb.aw);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static gji b() {
      gjk $$0 = new gjk();
      gjm $$1 = $$0.a();
      gjg $$2 = new gjg(0.2F);
      gjg $$3 = new gjg(-0.1F);
      $$1.a(
         "neck",
         gjh.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         gje.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      gjh $$4 = gjh.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, gje.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, gje.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return gji.a($$0, 32, 32);
   }

   public static gji c() {
      gjk $$0 = new gjk();
      gjm $$1 = $$0.a();
      gjh $$2 = gjh.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(ja.c));
      $$1.a("back", $$2, gje.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, gje.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, gje.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, gje.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return gji.a($$0, 16, 16);
   }

   private static hle a(Optional<cyz> $$0) {
      if ($$0.isPresent()) {
         hle $$1 = gqv.a(dxz.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gqv.A;
   }

   public void a(dxx $$0, float $$1, fjj $$2, gqa $$3, int $$4, int $$5, feq $$6) {
      $$2.a();
      ja $$7 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$7.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dxx.a $$8 = $$0.h;
      if ($$8 != null && $$0.i() != null) {
         float $$9 = ((float)($$0.i().ae() - $$0.g) + $$1) / (float)$$8.c;
         if ($$9 >= 0.0F && $$9 <= 1.0F) {
            if ($$8 == dxx.a.a) {
               float $$10 = 0.015625F;
               float $$11 = $$9 * (float) (Math.PI * 2);
               float $$12 = -1.5F * (azm.b($$11) + 0.5F) * azm.a($$11 / 2.0F);
               $$2.a(a.b.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$13 = azm.a($$11);
               $$2.a(a.f.rotation($$13 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$14 = azm.a(-$$9 * 3.0F * (float) Math.PI) * 0.125F;
               float $$15 = 1.0F - $$9;
               $$2.a(a.d.rotation($$14 * $$15), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      this.b($$2, $$3, $$4, $$5, $$0.s());
      $$2.b();
   }

   public void a(fjj $$0, gqa $$1, int $$2, int $$3, dyn $$4) {
      this.b($$0, $$1, $$2, $$3, $$4);
   }

   private void b(fjj $$0, gqa $$1, int $$2, int $$3, dyn $$4) {
      fjn $$5 = gqv.z.a($$1, gqk::d);
      this.h.a($$0, $$5, $$2, $$3);
      this.m.a($$0, $$5, $$2, $$3);
      this.n.a($$0, $$5, $$2, $$3);
      this.a(this.i, $$0, $$1, $$2, $$3, a($$4.e()));
      this.a(this.j, $$0, $$1, $$2, $$3, a($$4.b()));
      this.a(this.k, $$0, $$1, $$2, $$3, a($$4.c()));
      this.a(this.l, $$0, $$1, $$2, $$3, a($$4.d()));
   }

   private void a(gjc $$0, fjj $$1, gqa $$2, int $$3, int $$4, hle $$5) {
      $$0.a($$1, $$5.a($$2, gqk::d), $$3, $$4);
   }
}
