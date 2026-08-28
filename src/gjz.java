import java.util.EnumSet;
import java.util.Optional;

public class gjz implements gjr<dsi> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final gal h;
   private final gal i;
   private final gal j;
   private final gal k;
   private final gal l;
   private final gal m;
   private final gal n;
   private static final float o = 0.125F;

   public gjz(gjs.a $$0) {
      gal $$1 = $$0.a(gak.Z);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      gal $$2 = $$0.a(gak.aa);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      gap $$2 = new gap(0.2F);
      gap $$3 = new gap(-0.1F);
      $$1.a(
         "neck",
         gaq.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         gan.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      gaq $$4 = gaq.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, gan.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, gan.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return gar.a($$0, 32, 32);
   }

   public static gar c() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      gaq $$2 = gaq.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(jj.c));
      $$1.a("back", $$2, gan.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, gan.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, gan.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, gan.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return gar.a($$0, 16, 16);
   }

   private static gzh a(Optional<cvk> $$0) {
      if ($$0.isPresent()) {
         gzh $$1 = gib.a(dsk.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gib.q;
   }

   public void a(dsi $$0, float $$1, fde $$2, ghg $$3, int $$4, int $$5) {
      $$2.a();
      jj $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dsi.a $$7 = $$0.h;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().aa() - $$0.g) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dsi.a.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (azd.b($$10) + 0.5F) * azd.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = azd.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = azd.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      fdi $$15 = gib.p.a($$3, ghq::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      dsy $$16 = $$0.t();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(gal $$0, fde $$1, ghg $$2, int $$3, int $$4, gzh $$5) {
      $$0.a($$1, $$5.a($$2, ghq::c), $$3, $$4);
   }
}
