import com.mojang.datafixers.util.Pair;
import java.util.List;

public class fzn implements fzs<djy> {
   private static final int b = 20;
   private static final int c = 40;
   private static final int d = 16;
   public static final String a = "flag";
   private static final String e = "pole";
   private static final String f = "bar";
   private final frf g;
   private final frf h;
   private final frf i;

   public fzn(fzt.a $$0) {
      frf $$1 = $$0.a(fre.g);
      this.g = $$1.b("flag");
      this.h = $$1.b("pole");
      this.i = $$1.b("bar");
   }

   public static frl a() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      $$1.a("flag", frk.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), frh.a);
      $$1.a("pole", frk.c().a(44, 0).a(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F), frh.a);
      $$1.a("bar", frk.c().a(0, 42).a(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F), frh.a);
      return frl.a($$0, 64, 64);
   }

   public void a(djy $$0, float $$1, eub $$2, fxs $$3, int $$4, int $$5) {
      List<Pair<il<djz>, cpd>> $$6 = $$0.b();
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
         dnb $$11 = $$0.n();
         if ($$11.b() instanceof czh) {
            $$2.a(0.5F, 0.5F, 0.5F);
            float $$12 = -doh.b($$11.c(czh.b));
            $$2.a(a.d.rotationDegrees($$12));
            this.h.k = true;
         } else {
            $$2.a(0.5F, -0.16666667F, 0.5F);
            float $$13 = -$$11.c(diy.b).p();
            $$2.a(a.d.rotationDegrees($$13));
            $$2.a(0.0F, -0.3125F, -0.4375F);
            this.h.k = false;
         }
      }

      $$2.a();
      $$2.b(0.6666667F, -0.6666667F, -0.6666667F);
      euf $$14 = glh.f.a($$3, fya::c);
      this.h.a($$2, $$14, $$4, $$5);
      this.i.a($$2, $$14, $$4, $$5);
      ib $$15 = $$0.aC_();
      float $$16 = ((float)Math.floorMod((long)($$15.u() * 7 + $$15.v() * 9 + $$15.w() * 13) + $$9, 100L) + $$1) / 100.0F;
      this.g.e = (-0.0125F + 0.01F * aww.b((float) (Math.PI * 2) * $$16)) * (float) Math.PI;
      this.g.c = -32.0F;
      a($$2, $$3, $$4, $$5, this.g, glh.f, true, $$6);
      $$2.b();
      $$2.b();
   }

   public static void a(eub $$0, fxs $$1, int $$2, int $$3, frf $$4, glf $$5, boolean $$6, List<Pair<il<djz>, cpd>> $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, false);
   }

   public static void a(eub $$0, fxs $$1, int $$2, int $$3, frf $$4, glf $$5, boolean $$6, List<Pair<il<djz>, cpd>> $$7, boolean $$8) {
      $$4.a($$0, $$5.a($$1, fya::c, $$8), $$2, $$3);

      for (int $$9 = 0; $$9 < 17 && $$9 < $$7.size(); $$9++) {
         Pair<il<djz>, cpd> $$10 = $$7.get($$9);
         float[] $$11 = ((cpd)$$10.getSecond()).d();
         ((il)$$10.getFirst())
            .e()
            .map($$1x -> $$6 ? fyh.a($$1x) : fyh.b($$1x))
            .ifPresent($$6x -> $$4.a($$0, $$6x.a($$1, fya::m), $$2, $$3, $$11[0], $$11[1], $$11[2], 1.0F));
      }
   }
}
