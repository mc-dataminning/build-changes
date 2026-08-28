import java.util.EnumSet;
import java.util.Optional;

public class gsn implements gse<dxp> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final giu h;
   private final giu i;
   private final giu j;
   private final giu k;
   private final giu l;
   private final giu m;
   private final giu n;
   private static final float o = 0.125F;

   public gsn(gsf.a $$0) {
      this($$0.f());
   }

   public gsn(giq $$0) {
      giu $$1 = $$0.a(git.at);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      giu $$2 = $$0.a(git.au);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static gja b() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      giy $$2 = new giy(0.2F);
      giy $$3 = new giy(-0.1F);
      $$1.a(
         "neck",
         giz.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         giw.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      giz $$4 = giz.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, giw.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, giw.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return gja.a($$0, 32, 32);
   }

   public static gja c() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      giz $$2 = giz.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(ja.c));
      $$1.a("back", $$2, giw.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, giw.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, giw.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, giw.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return gja.a($$0, 16, 16);
   }

   private static hkw a(Optional<cyu> $$0) {
      if ($$0.isPresent()) {
         hkw $$1 = gqn.a(dxr.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gqn.A;
   }

   public void a(dxp $$0, float $$1, fjc $$2, gps $$3, int $$4, int $$5, fei $$6) {
      $$2.a();
      ja $$7 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$7.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dxp.a $$8 = $$0.h;
      if ($$8 != null && $$0.i() != null) {
         float $$9 = ((float)($$0.i().ae() - $$0.g) + $$1) / (float)$$8.c;
         if ($$9 >= 0.0F && $$9 <= 1.0F) {
            if ($$8 == dxp.a.a) {
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

   public void a(fjc $$0, gps $$1, int $$2, int $$3, dyf $$4) {
      this.b($$0, $$1, $$2, $$3, $$4);
   }

   private void b(fjc $$0, gps $$1, int $$2, int $$3, dyf $$4) {
      fjg $$5 = gqn.z.a($$1, gqc::d);
      this.h.a($$0, $$5, $$2, $$3);
      this.m.a($$0, $$5, $$2, $$3);
      this.n.a($$0, $$5, $$2, $$3);
      this.a(this.i, $$0, $$1, $$2, $$3, a($$4.e()));
      this.a(this.j, $$0, $$1, $$2, $$3, a($$4.b()));
      this.a(this.k, $$0, $$1, $$2, $$3, a($$4.c()));
      this.a(this.l, $$0, $$1, $$2, $$3, a($$4.d()));
   }

   private void a(giu $$0, fjc $$1, gps $$2, int $$3, int $$4, hkw $$5) {
      $$0.a($$1, $$5.a($$2, gqc::d), $$3, $$4);
   }
}
