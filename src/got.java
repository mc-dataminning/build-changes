import java.util.EnumSet;
import java.util.Optional;

public class got implements gol<dur> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final gfe h;
   private final gfe i;
   private final gfe j;
   private final gfe k;
   private final gfe l;
   private final gfe m;
   private final gfe n;
   private static final float o = 0.125F;

   public got(gom.a $$0) {
      this($$0.f());
   }

   public got(gfa $$0) {
      gfe $$1 = $$0.a(gfd.an);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      gfe $$2 = $$0.a(gfd.ao);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static gfk b() {
      gfm $$0 = new gfm();
      gfo $$1 = $$0.a();
      gfi $$2 = new gfi(0.2F);
      gfi $$3 = new gfi(-0.1F);
      $$1.a(
         "neck",
         gfj.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         gfg.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      gfj $$4 = gfj.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, gfg.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, gfg.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return gfk.a($$0, 32, 32);
   }

   public static gfk c() {
      gfm $$0 = new gfm();
      gfo $$1 = $$0.a();
      gfj $$2 = gfj.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(jn.c));
      $$1.a("back", $$2, gfg.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, gfg.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, gfg.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, gfg.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return gfk.a($$0, 16, 16);
   }

   private static hha a(Optional<cwm> $$0) {
      if ($$0.isPresent()) {
         hha $$1 = gmu.a(dut.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gmu.q;
   }

   public void a(dur $$0, float $$1, ffv $$2, glz $$3, int $$4, int $$5) {
      $$2.a();
      jn $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dur.a $$7 = $$0.h;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().ad() - $$0.g) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dur.a.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (ayz.b($$10) + 0.5F) * ayz.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = ayz.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = ayz.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      this.b($$2, $$3, $$4, $$5, $$0.s());
      $$2.b();
   }

   public void a(ffv $$0, glz $$1, int $$2, int $$3, dvh $$4) {
      this.b($$0, $$1, $$2, $$3, $$4);
   }

   private void b(ffv $$0, glz $$1, int $$2, int $$3, dvh $$4) {
      ffz $$5 = gmu.p.a($$1, gmj::d);
      this.h.a($$0, $$5, $$2, $$3);
      this.m.a($$0, $$5, $$2, $$3);
      this.n.a($$0, $$5, $$2, $$3);
      this.a(this.i, $$0, $$1, $$2, $$3, a($$4.e()));
      this.a(this.j, $$0, $$1, $$2, $$3, a($$4.b()));
      this.a(this.k, $$0, $$1, $$2, $$3, a($$4.c()));
      this.a(this.l, $$0, $$1, $$2, $$3, a($$4.d()));
   }

   private void a(gfe $$0, ffv $$1, glz $$2, int $$3, int $$4, hha $$5) {
      $$0.a($$1, $$5.a($$2, gmj::d), $$3, $$4);
   }
}
