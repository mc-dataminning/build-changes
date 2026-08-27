import java.util.EnumSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class fuq implements fui<dgt> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fly h;
   private final fly i;
   private final fly j;
   private final fly k;
   private final fly l;
   private final fly m;
   private final fly n;
   private final gfs o = Objects.requireNonNull(fsx.c(dgu.a));
   private static final float p = 0.125F;

   public fuq(fuj.a $$0) {
      fly $$1 = $$0.a(flx.H);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fly $$2 = $$0.a(flx.I);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fme b() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      fmc $$2 = new fmc(0.2F);
      fmc $$3 = new fmc(-0.1F);
      $$1.a(
         "neck",
         fmd.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fma.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fmd $$4 = fmd.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fma.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fma.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fme.a($$0, 32, 32);
   }

   public static fme c() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      fmd $$2 = fmd.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(ia.c));
      $$1.a("back", $$2, fma.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fma.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fma.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fma.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fme.a($$0, 16, 16);
   }

   @Nullable
   private static gfs a(cmc $$0) {
      gfs $$1 = fsx.c(dgu.a($$0));
      if ($$1 == null) {
         $$1 = fsx.c(dgu.a(cmk.qI));
      }

      return $$1;
   }

   public void a(dgt $$0, float $$1, epd $$2, fsi $$3, int $$4, int $$5) {
      $$2.a();
      ia $$6 = $$0.l();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dgt.b $$7 = $$0.i;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().W() - $$0.h) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dgt.b.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (aty.b($$10) + 0.5F) * aty.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = aty.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = aty.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      eph $$15 = this.o.a($$3, fsq::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      dgt.a $$16 = $$0.m();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(fly $$0, epd $$1, fsi $$2, int $$3, int $$4, @Nullable gfs $$5) {
      if ($$5 == null) {
         $$5 = a(cmk.qI);
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, fsq::c), $$3, $$4);
      }
   }
}
