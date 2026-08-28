import java.util.EnumSet;
import java.util.Optional;

public class gke implements gjw<dsl> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final gaq h;
   private final gaq i;
   private final gaq j;
   private final gaq k;
   private final gaq l;
   private final gaq m;
   private final gaq n;
   private static final float o = 0.125F;

   public gke(gjx.a $$0) {
      gaq $$1 = $$0.a(gap.Z);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      gaq $$2 = $$0.a(gap.aa);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static gaw b() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      gau $$2 = new gau(0.2F);
      gau $$3 = new gau(-0.1F);
      $$1.a(
         "neck",
         gav.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         gas.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      gav $$4 = gav.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, gas.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, gas.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return gaw.a($$0, 32, 32);
   }

   public static gaw c() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      gav $$2 = gav.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(jk.c));
      $$1.a("back", $$2, gas.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, gas.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, gas.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, gas.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return gaw.a($$0, 16, 16);
   }

   private static gzm a(Optional<cvn> $$0) {
      if ($$0.isPresent()) {
         gzm $$1 = gig.a(dsn.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gig.q;
   }

   public void a(dsl $$0, float $$1, fdi $$2, ghl $$3, int $$4, int $$5) {
      $$2.a();
      jk $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dsl.a $$7 = $$0.h;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().aa() - $$0.g) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dsl.a.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (azf.b($$10) + 0.5F) * azf.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = azf.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = azf.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      fdm $$15 = gig.p.a($$3, ghv::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      dtb $$16 = $$0.t();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(gaq $$0, fdi $$1, ghl $$2, int $$3, int $$4, gzm $$5) {
      $$0.a($$1, $$5.a($$2, ghv::c), $$3, $$4);
   }
}
