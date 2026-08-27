import java.util.EnumSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class fvp implements fvh<dhl> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fmx h;
   private final fmx i;
   private final fmx j;
   private final fmx k;
   private final fmx l;
   private final fmx m;
   private final fmx n;
   private final ggq o = Objects.requireNonNull(ftw.c(dhm.a));
   private static final float p = 0.125F;

   public fvp(fvi.a $$0) {
      fmx $$1 = $$0.a(fmw.H);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fmx $$2 = $$0.a(fmw.I);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fnd b() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      fnb $$2 = new fnb(0.2F);
      fnb $$3 = new fnb(-0.1F);
      $$1.a(
         "neck",
         fnc.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fmz.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fnc $$4 = fnc.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fmz.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fmz.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fnd.a($$0, 32, 32);
   }

   public static fnd c() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      fnc $$2 = fnc.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(ic.c));
      $$1.a("back", $$2, fmz.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fmz.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fmz.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fmz.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fnd.a($$0, 16, 16);
   }

   @Nullable
   private static ggq a(cmt $$0) {
      ggq $$1 = ftw.c(dhm.a($$0));
      if ($$1 == null) {
         $$1 = ftw.c(dhm.a(cnb.qI));
      }

      return $$1;
   }

   public void a(dhl $$0, float $$1, eqb $$2, fth $$3, int $$4, int $$5) {
      $$2.a();
      ic $$6 = $$0.l();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dhl.b $$7 = $$0.i;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().X() - $$0.h) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dhl.b.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (auo.b($$10) + 0.5F) * auo.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = auo.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = auo.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      eqf $$15 = this.o.a($$3, ftp::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      dhl.a $$16 = $$0.m();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(fmx $$0, eqb $$1, fth $$2, int $$3, int $$4, @Nullable ggq $$5) {
      if ($$5 == null) {
         $$5 = a(cnb.qI);
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, ftp::c), $$3, $$4);
      }
   }
}
