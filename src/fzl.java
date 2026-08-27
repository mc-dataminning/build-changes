import com.mojang.datafixers.util.Pair;
import java.util.List;

public class fzl implements fzq<djw> {
   private static final int b = 20;
   private static final int c = 40;
   private static final int d = 16;
   public static final String a = "flag";
   private static final String e = "pole";
   private static final String f = "bar";
   private final frd g;
   private final frd h;
   private final frd i;

   public fzl(fzr.a $$0) {
      frd $$1 = $$0.a(frc.g);
      this.g = $$1.b("flag");
      this.h = $$1.b("pole");
      this.i = $$1.b("bar");
   }

   public static frj a() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      $$1.a("flag", fri.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), frf.a);
      $$1.a("pole", fri.c().a(44, 0).a(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F), frf.a);
      $$1.a("bar", fri.c().a(0, 42).a(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F), frf.a);
      return frj.a($$0, 64, 64);
   }

   public void a(djw $$0, float $$1, etz $$2, fxq $$3, int $$4, int $$5) {
      List<Pair<il<djx>, cpb>> $$6 = $$0.b();
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
         dmz $$11 = $$0.n();
         if ($$11.b() instanceof czf) {
            $$2.a(0.5F, 0.5F, 0.5F);
            float $$12 = -dof.b($$11.c(czf.b));
            $$2.a(a.d.rotationDegrees($$12));
            this.h.k = true;
         } else {
            $$2.a(0.5F, -0.16666667F, 0.5F);
            float $$13 = -$$11.c(diw.b).p();
            $$2.a(a.d.rotationDegrees($$13));
            $$2.a(0.0F, -0.3125F, -0.4375F);
            this.h.k = false;
         }
      }

      $$2.a();
      $$2.b(0.6666667F, -0.6666667F, -0.6666667F);
      eud $$14 = gle.f.a($$3, fxy::c);
      this.h.a($$2, $$14, $$4, $$5);
      this.i.a($$2, $$14, $$4, $$5);
      ib $$15 = $$0.aC_();
      float $$16 = ((float)Math.floorMod((long)($$15.u() * 7 + $$15.v() * 9 + $$15.w() * 13) + $$9, 100L) + $$1) / 100.0F;
      this.g.e = (-0.0125F + 0.01F * aww.b((float) (Math.PI * 2) * $$16)) * (float) Math.PI;
      this.g.c = -32.0F;
      a($$2, $$3, $$4, $$5, this.g, gle.f, true, $$6);
      $$2.b();
      $$2.b();
   }

   public static void a(etz $$0, fxq $$1, int $$2, int $$3, frd $$4, glc $$5, boolean $$6, List<Pair<il<djx>, cpb>> $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, false);
   }

   public static void a(etz $$0, fxq $$1, int $$2, int $$3, frd $$4, glc $$5, boolean $$6, List<Pair<il<djx>, cpb>> $$7, boolean $$8) {
      $$4.a($$0, $$5.a($$1, fxy::c, $$8), $$2, $$3);

      for (int $$9 = 0; $$9 < 17 && $$9 < $$7.size(); $$9++) {
         Pair<il<djx>, cpb> $$10 = $$7.get($$9);
         float[] $$11 = ((cpb)$$10.getSecond()).d();
         ((il)$$10.getFirst())
            .e()
            .map($$1x -> $$6 ? fyf.a($$1x) : fyf.b($$1x))
            .ifPresent($$6x -> $$4.a($$0, $$6x.a($$1, fxy::m), $$2, $$3, $$11[0], $$11[1], $$11[2], 1.0F));
      }
   }
}
