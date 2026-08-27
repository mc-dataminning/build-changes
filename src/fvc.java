import com.mojang.datafixers.util.Pair;
import java.util.List;

public class fvc implements fvh<dgl> {
   private static final int b = 20;
   private static final int c = 40;
   private static final int d = 16;
   public static final String a = "flag";
   private static final String e = "pole";
   private static final String f = "bar";
   private final fmx g;
   private final fmx h;
   private final fmx i;

   public fvc(fvi.a $$0) {
      fmx $$1 = $$0.a(fmw.f);
      this.g = $$1.b("flag");
      this.h = $$1.b("pole");
      this.i = $$1.b("bar");
   }

   public static fnd a() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      $$1.a("flag", fnc.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), fmz.a);
      $$1.a("pole", fnc.c().a(44, 0).a(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F), fmz.a);
      $$1.a("bar", fnc.c().a(0, 42).a(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F), fmz.a);
      return fnd.a($$0, 64, 64);
   }

   public void a(dgl $$0, float $$1, eqb $$2, fth $$3, int $$4, int $$5) {
      List<Pair<ih<dgm>, clm>> $$6 = $$0.c();
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
         djh $$11 = $$0.r();
         if ($$11.b() instanceof cvv) {
            $$2.a(0.5F, 0.5F, 0.5F);
            float $$12 = -dkn.b($$11.c(cvv.b));
            $$2.a(a.d.rotationDegrees($$12));
            this.h.k = true;
         } else {
            $$2.a(0.5F, -0.16666667F, 0.5F);
            float $$13 = -$$11.c(dfl.b).p();
            $$2.a(a.d.rotationDegrees($$13));
            $$2.a(0.0F, -0.3125F, -0.4375F);
            this.h.k = false;
         }
      }

      $$2.a();
      $$2.b(0.6666667F, -0.6666667F, -0.6666667F);
      eqf $$14 = ggs.f.a($$3, ftp::c);
      this.h.a($$2, $$14, $$4, $$5);
      this.i.a($$2, $$14, $$4, $$5);
      hx $$15 = $$0.aB_();
      float $$16 = ((float)Math.floorMod((long)($$15.u() * 7 + $$15.v() * 9 + $$15.w() * 13) + $$9, 100L) + $$1) / 100.0F;
      this.g.e = (-0.0125F + 0.01F * auo.b((float) (Math.PI * 2) * $$16)) * (float) Math.PI;
      this.g.c = -32.0F;
      a($$2, $$3, $$4, $$5, this.g, ggs.f, true, $$6);
      $$2.b();
      $$2.b();
   }

   public static void a(eqb $$0, fth $$1, int $$2, int $$3, fmx $$4, ggq $$5, boolean $$6, List<Pair<ih<dgm>, clm>> $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, false);
   }

   public static void a(eqb $$0, fth $$1, int $$2, int $$3, fmx $$4, ggq $$5, boolean $$6, List<Pair<ih<dgm>, clm>> $$7, boolean $$8) {
      $$4.a($$0, $$5.a($$1, ftp::c, $$8), $$2, $$3);

      for (int $$9 = 0; $$9 < 17 && $$9 < $$7.size(); $$9++) {
         Pair<ih<dgm>, clm> $$10 = $$7.get($$9);
         float[] $$11 = ((clm)$$10.getSecond()).d();
         ((ih)$$10.getFirst())
            .e()
            .map($$1x -> $$6 ? ftw.a($$1x) : ftw.b($$1x))
            .ifPresent($$6x -> $$4.a($$0, $$6x.a($$1, ftp::m), $$2, $$3, $$11[0], $$11[1], $$11[2], 1.0F));
      }
   }
}
