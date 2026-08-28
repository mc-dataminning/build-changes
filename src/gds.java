import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gds implements atx {
   private static final dra[] a = Arrays.stream(csw.values())
      .sorted(Comparator.comparingInt(csw::a))
      .map($$0 -> new dra($$0, ja.c, dfk.kP.o()))
      .toArray(dra[]::new);
   private static final dra b = new dra(ja.c, dfk.kP.o());
   private final dpx c = new dpx(ja.c, dfk.cv.o());
   private final dpx d = new drk(ja.c, dfk.gV.o());
   private final dqm e = new dqm(ja.c, dfk.fG.o());
   private final dpf f = new dpf(ja.c, dfk.iJ.o());
   private final dpm g = new dpm(ja.c, dfk.bn.o());
   private final dqc h = new dqc(ja.c, dfk.mX.o());
   private final dqg i = new dqg(ja.c, dfk.tp.o());
   private fwh j;
   private fwv k;
   private Map<dmk.a, fwn> l;
   private final gge m;
   private final fxm n;

   public gds(gge $$0, fxm $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(atw $$0) {
      this.j = new fwh(this.n.a(fxp.bj));
      this.k = new fwv(this.n.a(fxp.bI));
      this.l = ggu.a(this.n);
   }

   public void a(cud $$0, cua $$1, fao $$2, gef $$3, int $$4, int $$5) {
      cty $$6 = $$0.g();
      if ($$6 instanceof csc) {
         dfi $$7 = ((csc)$$6).d();
         if ($$7 instanceof dee $$8) {
            cxe $$9 = $$0.a(kn.V);
            if ($$9 != null && !$$9.b()) {
               $$0.c(kn.V);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(kn.V, $$1x), ffw.Q());
               $$9 = null;
            }

            fwn $$10 = this.l.get($$8.b());
            gen $$11 = ggu.a($$8.b(), $$9);
            ggu.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dsl $$12 = $$7.o();
            dpq $$13;
            if ($$7 instanceof ddz) {
               this.f.a($$0, ((ddz)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof dfb) {
               this.g.a(((dfb)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dfk.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dfk.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dfk.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dfk.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dfk.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dmh)) {
                  return;
               }

               csw $$20 = dmh.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cug.vs)) {
            dph $$24 = $$0.a(kn.X, dph.a);
            csw $$25 = $$0.a(kn.Y);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gru $$27 = $$26 ? grw.g : grw.h;
            fas $$28 = $$27.c().a(gkm.c($$3, this.j.a($$27.a()), true, $$0.x()));
            this.j.c().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$26) {
               gga.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, csw.a), $$24, $$0.x());
            } else {
               this.j.b().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cug.vS)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fas $$29 = gkm.c($$3, this.k.a(fwv.a), false, $$0.x());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
