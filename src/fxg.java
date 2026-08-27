import com.mojang.datafixers.util.Pair;
import java.util.List;

public class fxg implements fxl<dij> {
   private static final int b = 20;
   private static final int c = 40;
   private static final int d = 16;
   public static final String a = "flag";
   private static final String e = "pole";
   private static final String f = "bar";
   private final fpc g;
   private final fpc h;
   private final fpc i;

   public fxg(fxm.a $$0) {
      fpc $$1 = $$0.a(fpb.g);
      this.g = $$1.b("flag");
      this.h = $$1.b("pole");
      this.i = $$1.b("bar");
   }

   public static fpi a() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      $$1.a("flag", fph.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), fpe.a);
      $$1.a("pole", fph.c().a(44, 0).a(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F), fpe.a);
      $$1.a("bar", fph.c().a(0, 42).a(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F), fpe.a);
      return fpi.a($$0, 64, 64);
   }

   public void a(dij $$0, float $$1, esa $$2, fvl $$3, int $$4, int $$5) {
      List<Pair<ij<dik>, cnn>> $$6 = $$0.c();
      float $$7 = 0.6666667F;
      boolean $$8 = $$0.i() == null;
      $$2.a();
      long $$9;
      if ($$8) {
         $$9 = 0L;
         $$2.a(0.5F, 0.5F, 0.5F);
         this.h.k = true;
      } else {
         $$9 = $$0.i().X();
         dlf $$11 = $$0.r();
         if ($$11.b() instanceof cxt) {
            $$2.a(0.5F, 0.5F, 0.5F);
            float $$12 = -dml.b($$11.c(cxt.b));
            $$2.a(a.d.rotationDegrees($$12));
            this.h.k = true;
         } else {
            $$2.a(0.5F, -0.16666667F, 0.5F);
            float $$13 = -$$11.c(dhj.b).p();
            $$2.a(a.d.rotationDegrees($$13));
            $$2.a(0.0F, -0.3125F, -0.4375F);
            this.h.k = false;
         }
      }

      $$2.a();
      $$2.b(0.6666667F, -0.6666667F, -0.6666667F);
      ese $$14 = giy.f.a($$3, fvt::c);
      this.h.a($$2, $$14, $$4, $$5);
      this.i.a($$2, $$14, $$4, $$5);
      hz $$15 = $$0.aE_();
      float $$16 = ((float)Math.floorMod((long)($$15.u() * 7 + $$15.v() * 9 + $$15.w() * 13) + $$9, 100L) + $$1) / 100.0F;
      this.g.e = (-0.0125F + 0.01F * awh.b((float) (Math.PI * 2) * $$16)) * (float) Math.PI;
      this.g.c = -32.0F;
      a($$2, $$3, $$4, $$5, this.g, giy.f, true, $$6);
      $$2.b();
      $$2.b();
   }

   public static void a(esa $$0, fvl $$1, int $$2, int $$3, fpc $$4, giw $$5, boolean $$6, List<Pair<ij<dik>, cnn>> $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, false);
   }

   public static void a(esa $$0, fvl $$1, int $$2, int $$3, fpc $$4, giw $$5, boolean $$6, List<Pair<ij<dik>, cnn>> $$7, boolean $$8) {
      $$4.a($$0, $$5.a($$1, fvt::c, $$8), $$2, $$3);

      for (int $$9 = 0; $$9 < 17 && $$9 < $$7.size(); $$9++) {
         Pair<ij<dik>, cnn> $$10 = $$7.get($$9);
         float[] $$11 = ((cnn)$$10.getSecond()).d();
         ((ij)$$10.getFirst())
            .e()
            .map($$1x -> $$6 ? fwa.a($$1x) : fwa.b($$1x))
            .ifPresent($$6x -> $$4.a($$0, $$6x.a($$1, fvt::m), $$2, $$3, $$11[0], $$11[1], $$11[2], 1.0F));
      }
   }
}
