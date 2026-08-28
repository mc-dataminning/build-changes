import java.util.EnumSet;
import java.util.Optional;

public class gjk implements gjc<dru> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final gab h;
   private final gab i;
   private final gab j;
   private final gab k;
   private final gab l;
   private final gab m;
   private final gab n;
   private static final float o = 0.125F;

   public gjk(gjd.a $$0) {
      gab $$1 = $$0.a(gaa.Z);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      gab $$2 = $$0.a(gaa.aa);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gaf $$2 = new gaf(0.2F);
      gaf $$3 = new gaf(-0.1F);
      $$1.a(
         "neck",
         gag.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         gad.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      gag $$4 = gag.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, gad.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, gad.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return gah.a($$0, 32, 32);
   }

   public static gah c() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gag $$2 = gag.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(jj.c));
      $$1.a("back", $$2, gad.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, gad.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, gad.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, gad.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return gah.a($$0, 16, 16);
   }

   private static gyq a(Optional<cvg> $$0) {
      if ($$0.isPresent()) {
         gyq $$1 = ghm.a(drw.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return ghm.q;
   }

   public void a(dru $$0, float $$1, fcu $$2, ggv $$3, int $$4, int $$5) {
      $$2.a();
      jj $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dru.a $$7 = $$0.h;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().aa() - $$0.g) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dru.a.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (azc.b($$10) + 0.5F) * azc.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = azc.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = azc.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      fcy $$15 = ghm.p.a($$3, ghe::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      dsk $$16 = $$0.t();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(gab $$0, fcu $$1, ggv $$2, int $$3, int $$4, gyq $$5) {
      $$0.a($$1, $$5.a($$2, ghe::c), $$3, $$4);
   }
}
