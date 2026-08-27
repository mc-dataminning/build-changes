import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fxd implements asp {
   private static final dlo[] a = Arrays.stream(cpb.values())
      .sorted(Comparator.comparingInt(cpb::a))
      .map($$0 -> new dlo($$0, ib.c, dac.kP.o()))
      .toArray(dlo[]::new);
   private static final dlo b = new dlo(ib.c, dac.kP.o());
   private final dkn c = new dkn(ib.c, dac.cv.o());
   private final dkn d = new dly(ib.c, dac.gV.o());
   private final dlb e = new dlb(ib.c, dac.fG.o());
   private final djw f = new djw(ib.c, dac.iJ.o());
   private final dkc g = new dkc(ib.c, dac.bn.o());
   private final dks h = new dks(ib.c, dac.mX.o());
   private final dkw i = new dkw(ib.c, dac.tp.o());
   private fpu j;
   private fqi k;
   private Map<dhb.a, fqa> l;
   private final fzp m;
   private final fqz n;

   public fxd(fzp $$0, fqz $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(aso $$0) {
      this.j = new fpu(this.n.a(frc.bf));
      this.k = new fqi(this.n.a(frc.bE));
      this.l = gaf.a(this.n);
   }

   public void a(cqk $$0, cqh $$1, etz $$2, fxq $$3, int $$4, int $$5) {
      cqf $$6 = $$0.d();
      if ($$6 instanceof cof) {
         daa $$7 = ((cof)$$6).d();
         if ($$7 instanceof cyw $$8) {
            ta $$9 = $$0.w();
            GameProfile $$10 = $$9 != null ? dlr.b($$9) : null;
            fqa $$11 = this.l.get($$8.b());
            fxy $$12 = gaf.a($$8.b(), $$10);
            gaf.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dmz $$13 = $$7.o();
            dkg $$14;
            if ($$7 instanceof cyr) {
               this.f.a($$0, ((cyr)$$7).b());
               $$14 = this.f;
            } else if ($$7 instanceof czt) {
               this.g.a(((czt)$$7).b());
               $$14 = this.g;
            } else if ($$13.a(dac.mX)) {
               $$14 = this.h;
            } else if ($$13.a(dac.cv)) {
               $$14 = this.c;
            } else if ($$13.a(dac.fG)) {
               $$14 = this.e;
            } else if ($$13.a(dac.gV)) {
               $$14 = this.d;
            } else if ($$13.a(dac.tp)) {
               this.i.b($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof dgy)) {
                  return;
               }

               cpb $$21 = dgy.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cqn.vp)) {
            boolean $$25 = cof.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            glc $$26 = $$25 ? gle.g : gle.h;
            eud $$27 = $$26.c().a(gdw.c($$3, this.j.a($$26.a()), true, $$0.C()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<il<djx>, cpb>> $$28 = djw.a(crh.d($$0), djw.a($$0));
               fzl.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.C());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cqn.vM)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            eud $$29 = gdw.c($$3, this.k.a(fqi.a), false, $$0.C());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
