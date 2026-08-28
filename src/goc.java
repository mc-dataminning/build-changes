import java.util.EnumSet;
import java.util.Optional;

public class goc implements gnu<dvn> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final gem h;
   private final gem i;
   private final gem j;
   private final gem k;
   private final gem l;
   private final gem m;
   private final gem n;
   private static final float o = 0.125F;

   public goc(gnv.a $$0) {
      gem $$1 = $$0.a(gel.ak);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      gem $$2 = $$0.a(gel.al);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static ges b() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      geq $$2 = new geq(0.2F);
      geq $$3 = new geq(-0.1F);
      $$1.a(
         "neck",
         ger.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         geo.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      ger $$4 = ger.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, geo.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, geo.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return ges.a($$0, 32, 32);
   }

   public static ges c() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      ger $$2 = ger.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(jm.c));
      $$1.a("back", $$2, geo.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, geo.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, geo.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, geo.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return ges.a($$0, 16, 16);
   }

   private static hds a(Optional<cxk> $$0) {
      if ($$0.isPresent()) {
         hds $$1 = gme.a(dvp.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gme.q;
   }

   public void a(dvn $$0, float $$1, fgq $$2, glj $$3, int $$4, int $$5) {
      $$2.a();
      jm $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dvn.a $$7 = $$0.h;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().ac() - $$0.g) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dvn.a.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (bae.b($$10) + 0.5F) * bae.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = bae.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = bae.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      fgu $$15 = gme.p.a($$3, glt::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      dwd $$16 = $$0.t();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(gem $$0, fgq $$1, glj $$2, int $$3, int $$4, hds $$5) {
      $$0.a($$1, $$5.a($$2, glt::c), $$3, $$4);
   }
}
