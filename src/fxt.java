import java.util.EnumSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class fxt implements fxl<djj> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fpc h;
   private final fpc i;
   private final fpc j;
   private final fpc k;
   private final fpc l;
   private final fpc m;
   private final fpc n;
   private final giw o = Objects.requireNonNull(fwa.c(djk.a));
   private static final float p = 0.125F;

   public fxt(fxm.a $$0) {
      fpc $$1 = $$0.a(fpb.G);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fpc $$2 = $$0.a(fpb.H);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fpi b() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      fpg $$2 = new fpg(0.2F);
      fpg $$3 = new fpg(-0.1F);
      $$1.a(
         "neck",
         fph.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fpe.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fph $$4 = fph.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fpe.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fpe.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fpi.a($$0, 32, 32);
   }

   public static fpi c() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      fph $$2 = fph.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(ie.c));
      $$1.a("back", $$2, fpe.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fpe.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fpe.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fpe.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fpi.a($$0, 16, 16);
   }

   @Nullable
   private static giw a(cou $$0) {
      giw $$1 = fwa.c(djk.a($$0));
      if ($$1 == null) {
         $$1 = fwa.c(djk.a(cpc.qK));
      }

      return $$1;
   }

   public void a(djj $$0, float $$1, esa $$2, fvl $$3, int $$4, int $$5) {
      $$2.a();
      ie $$6 = $$0.l();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      djj.b $$7 = $$0.i;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().X() - $$0.h) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == djj.b.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (awh.b($$10) + 0.5F) * awh.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = awh.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = awh.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      ese $$15 = this.o.a($$3, fvt::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      djj.a $$16 = $$0.m();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(fpc $$0, esa $$1, fvl $$2, int $$3, int $$4, @Nullable giw $$5) {
      if ($$5 == null) {
         $$5 = a(cpc.qK);
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, fvt::c), $$3, $$4);
      }
   }
}
