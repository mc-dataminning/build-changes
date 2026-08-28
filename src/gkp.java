import java.util.EnumSet;
import java.util.Optional;

public class gkp implements gkh<dsw> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final gbb h;
   private final gbb i;
   private final gbb j;
   private final gbb k;
   private final gbb l;
   private final gbb m;
   private final gbb n;
   private static final float o = 0.125F;

   public gkp(gki.a $$0) {
      gbb $$1 = $$0.a(gba.Z);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      gbb $$2 = $$0.a(gba.aa);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static gbh b() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      gbf $$2 = new gbf(0.2F);
      gbf $$3 = new gbf(-0.1F);
      $$1.a(
         "neck",
         gbg.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         gbd.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      gbg $$4 = gbg.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, gbd.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, gbd.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return gbh.a($$0, 32, 32);
   }

   public static gbh c() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      gbg $$2 = gbg.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(jl.c));
      $$1.a("back", $$2, gbd.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, gbd.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, gbd.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, gbd.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return gbh.a($$0, 16, 16);
   }

   private static hab a(Optional<cvt> $$0) {
      if ($$0.isPresent()) {
         hab $$1 = gir.a(dsy.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gir.q;
   }

   public void a(dsw $$0, float $$1, fdt $$2, ghw $$3, int $$4, int $$5) {
      $$2.a();
      jl $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dsw.a $$7 = $$0.h;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().aa() - $$0.g) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dsw.a.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (azj.b($$10) + 0.5F) * azj.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = azj.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = azj.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      fdx $$15 = gir.p.a($$3, gig::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      dtm $$16 = $$0.t();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(gbb $$0, fdt $$1, ghw $$2, int $$3, int $$4, hab $$5) {
      $$0.a($$1, $$5.a($$2, gig::c), $$3, $$4);
   }
}
