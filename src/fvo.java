import com.mojang.datafixers.util.Pair;
import java.util.List;

public class fvo implements fvt<dgt> {
   private static final int b = 20;
   private static final int c = 40;
   private static final int d = 16;
   public static final String a = "flag";
   private static final String e = "pole";
   private static final String f = "bar";
   private final fnj g;
   private final fnj h;
   private final fnj i;

   public fvo(fvu.a $$0) {
      fnj $$1 = $$0.a(fni.g);
      this.g = $$1.b("flag");
      this.h = $$1.b("pole");
      this.i = $$1.b("bar");
   }

   public static fnp a() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      $$1.a("flag", fno.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), fnl.a);
      $$1.a("pole", fno.c().a(44, 0).a(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F), fnl.a);
      $$1.a("bar", fno.c().a(0, 42).a(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F), fnl.a);
      return fnp.a($$0, 64, 64);
   }

   public void a(dgt $$0, float $$1, eqk $$2, ftt $$3, int $$4, int $$5) {
      List<Pair<ih<dgu>, clv>> $$6 = $$0.c();
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
         djp $$11 = $$0.r();
         if ($$11.b() instanceof cwd) {
            $$2.a(0.5F, 0.5F, 0.5F);
            float $$12 = -dkv.b($$11.c(cwd.b));
            $$2.a(a.d.rotationDegrees($$12));
            this.h.k = true;
         } else {
            $$2.a(0.5F, -0.16666667F, 0.5F);
            float $$13 = -$$11.c(dft.b).p();
            $$2.a(a.d.rotationDegrees($$13));
            $$2.a(0.0F, -0.3125F, -0.4375F);
            this.h.k = false;
         }
      }

      $$2.a();
      $$2.b(0.6666667F, -0.6666667F, -0.6666667F);
      eqo $$14 = ghg.f.a($$3, fub::c);
      this.h.a($$2, $$14, $$4, $$5);
      this.i.a($$2, $$14, $$4, $$5);
      hx $$15 = $$0.aE_();
      float $$16 = ((float)Math.floorMod((long)($$15.u() * 7 + $$15.v() * 9 + $$15.w() * 13) + $$9, 100L) + $$1) / 100.0F;
      this.g.e = (-0.0125F + 0.01F * aup.b((float) (Math.PI * 2) * $$16)) * (float) Math.PI;
      this.g.c = -32.0F;
      a($$2, $$3, $$4, $$5, this.g, ghg.f, true, $$6);
      $$2.b();
      $$2.b();
   }

   public static void a(eqk $$0, ftt $$1, int $$2, int $$3, fnj $$4, ghe $$5, boolean $$6, List<Pair<ih<dgu>, clv>> $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, false);
   }

   public static void a(eqk $$0, ftt $$1, int $$2, int $$3, fnj $$4, ghe $$5, boolean $$6, List<Pair<ih<dgu>, clv>> $$7, boolean $$8) {
      $$4.a($$0, $$5.a($$1, fub::c, $$8), $$2, $$3);

      for (int $$9 = 0; $$9 < 17 && $$9 < $$7.size(); $$9++) {
         Pair<ih<dgu>, clv> $$10 = $$7.get($$9);
         float[] $$11 = ((clv)$$10.getSecond()).d();
         ((ih)$$10.getFirst())
            .e()
            .map($$1x -> $$6 ? fui.a($$1x) : fui.b($$1x))
            .ifPresent($$6x -> $$4.a($$0, $$6x.a($$1, fub::m), $$2, $$3, $$11[0], $$11[1], $$11[2], 1.0F));
      }
   }
}
