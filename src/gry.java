import java.util.EnumSet;
import java.util.Optional;

public class gry implements grp<dxf> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final gig h;
   private final gig i;
   private final gig j;
   private final gig k;
   private final gig l;
   private final gig m;
   private final gig n;
   private static final float o = 0.125F;

   public gry(grq.a $$0) {
      this($$0.f());
   }

   public gry(gic $$0) {
      gig $$1 = $$0.a(gif.ar);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      gig $$2 = $$0.a(gif.as);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static gim b() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      gik $$2 = new gik(0.2F);
      gik $$3 = new gik(-0.1F);
      $$1.a(
         "neck",
         gil.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         gii.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      gil $$4 = gil.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, gii.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, gii.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return gim.a($$0, 32, 32);
   }

   public static gim c() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      gil $$2 = gil.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(ja.c));
      $$1.a("back", $$2, gii.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, gii.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, gii.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, gii.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return gim.a($$0, 16, 16);
   }

   private static hkg a(Optional<cyo> $$0) {
      if ($$0.isPresent()) {
         hkg $$1 = gpy.a(dxh.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gpy.A;
   }

   public void a(dxf $$0, float $$1, fiq $$2, gpd $$3, int $$4, int $$5) {
      $$2.a();
      ja $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dxf.a $$7 = $$0.h;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().ae() - $$0.g) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dxf.a.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (azk.b($$10) + 0.5F) * azk.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = azk.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = azk.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      this.b($$2, $$3, $$4, $$5, $$0.s());
      $$2.b();
   }

   public void a(fiq $$0, gpd $$1, int $$2, int $$3, dxv $$4) {
      this.b($$0, $$1, $$2, $$3, $$4);
   }

   private void b(fiq $$0, gpd $$1, int $$2, int $$3, dxv $$4) {
      fiu $$5 = gpy.z.a($$1, gpn::d);
      this.h.a($$0, $$5, $$2, $$3);
      this.m.a($$0, $$5, $$2, $$3);
      this.n.a($$0, $$5, $$2, $$3);
      this.a(this.i, $$0, $$1, $$2, $$3, a($$4.e()));
      this.a(this.j, $$0, $$1, $$2, $$3, a($$4.b()));
      this.a(this.k, $$0, $$1, $$2, $$3, a($$4.c()));
      this.a(this.l, $$0, $$1, $$2, $$3, a($$4.d()));
   }

   private void a(gig $$0, fiq $$1, gpd $$2, int $$3, int $$4, hkg $$5) {
      $$0.a($$1, $$5.a($$2, gpn::d), $$3, $$4);
   }
}
