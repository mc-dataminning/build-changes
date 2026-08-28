import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lc {
   Logger a = LogUtils.getLogger();
   lc b = ($$0, $$1) -> $$1;

   cwp dispense(kz var1, cwp var2);

   static void a() {
      dls.a(cwt.pb);
      dls.a(cwt.wq);
      dls.a(cwt.wp);
      dls.a(cwt.ry);
      dls.a(cwt.rj);
      dls.a(cwt.uU);
      dls.a(cwt.wo);
      dls.a(cwt.wr);
      dls.a(cwt.vt);
      dls.a(cwt.uV);
      dls.a(cwt.uW);
      lb $$0 = new lb() {
         @Override
         public cwp a(kz $$0, cwp $$1) {
            jn $$2 = $$0.d().c(dls.b);
            bur<?> $$3 = ((cxy)$$1.h()).g($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), buq.o, $$2 != jn.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cwp.j;
            }

            $$1.h(1);
            $$0.b().a(null, ebt.t, $$0.c());
            return $$1;
         }
      };

      for (cxy $$1 : cxy.b()) {
         dls.a($$1, $$0);
      }

      dls.a(cwt.vF, new lb() {
         @Override
         public cwp a(kz $$0, cwp $$1) {
            jn $$2 = $$0.d().c(dls.b);
            ji $$3 = $$0.c().a($$2);
            arc $$4 = $$0.b();
            Consumer<ckq> $$5 = bur.a($$1x -> $$1x.v($$2.p()), $$4, $$1, null);
            ckq $$6 = bur.f.a($$4, $$5, $$3, buq.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dls.a(cwt.on, new lf() {
         @Override
         public cwp a(kz $$0, cwp $$1) {
            ji $$2 = $$0.c().a($$0.d().c(dls.b));
            List<bvg> $$3 = $$0.b().a(bvg.class, new fav($$2), $$0x -> !($$0x instanceof bvw $$1x) ? false : !$$1x.j() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bvw)$$3.get(0)).a($$1.a(1), awb.e);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dls.a(cwt.fb, new lf() {
         @Override
         public cwp a(kz $$0, cwp $$1) {
            ji $$2 = $$0.c().a($$0.d().c(dls.b));

            for (cja $$4 : $$0.b().a(cja.class, new fav($$2), $$0x -> $$0x.bL() && !$$0x.t())) {
               if ($$4.gG() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dls.a(cwt.ox, new la(bur.aH));
      dls.a(cwt.oz, new la(bur.bp));
      dls.a(cwt.oB, new la(bur.m));
      dls.a(cwt.oD, new la(bur.au));
      dls.a(cwt.oJ, new la(bur.G));
      dls.a(cwt.oF, new la(bur.a));
      dls.a(cwt.oH, new la(bur.w));
      dls.a(cwt.oN, new la(bur.aB));
      dls.a(cwt.oL, new la(bur.aM));
      dls.a(cwt.oP, new la(bur.j));
      dls.a(cwt.oy, new la(bur.aI));
      dls.a(cwt.oA, new la(bur.bq));
      dls.a(cwt.oC, new la(bur.n));
      dls.a(cwt.oE, new la(bur.av));
      dls.a(cwt.oK, new la(bur.H));
      dls.a(cwt.oG, new la(bur.b));
      dls.a(cwt.oI, new la(bur.x));
      dls.a(cwt.oO, new la(bur.aC));
      dls.a(cwt.oM, new la(bur.aN));
      dls.a(cwt.oQ, new la(bur.i));
      lc $$2 = new lb() {
         private final lb c = new lb();

         @Override
         public cwp a(kz $$0, cwp $$1) {
            cvk $$2 = (cvk)$$1.h();
            ji $$3 = $$0.c().a($$0.d().c(dls.b));
            dgi $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cwp(cwt.rf));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dls.a(cwt.rh, $$2);
      dls.a(cwt.rg, $$2);
      dls.a(cwt.ri, $$2);
      dls.a(cwt.rn, $$2);
      dls.a(cwt.ro, $$2);
      dls.a(cwt.rm, $$2);
      dls.a(cwt.rp, $$2);
      dls.a(cwt.rq, $$2);
      dls.a(cwt.rr, $$2);
      dls.a(cwt.rf, new lb() {
         @Override
         public cwp a(kz $$0, cwp $$1) {
            dgj $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dls.b));
            dwx $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dju $$6) {
               cwp $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, ebt.y, $$3);
                  cwl $$8 = $$7.h();
                  return this.a($$0, $$1, new cwp($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dls.a(cwt.oX, new lf() {
         @Override
         protected cwp a(kz $$0, cwp $$1) {
            arc $$2 = $$0.b();
            this.a(true);
            jn $$3 = $$0.d().c(dls.b);
            ji $$4 = $$0.c().a($$3);
            dwx $$5 = $$2.a_($$4);
            if (diz.a($$2, $$4, $$3)) {
               $$2.b($$4, diz.a($$2, $$4));
               $$2.a(null, ebt.i, $$4);
            } else if (dkb.i($$5) || dkc.h($$5) || dkd.h($$5)) {
               $$2.b($$4, $$5.b(dxn.v, Boolean.valueOf(true)));
               $$2.a(null, ebt.c, $$4);
            } else if ($$5.b() instanceof dsa) {
               dsa.a($$2, $$4);
               $$2.a($$4, false);
            } else {
               this.a(false);
            }

            if (this.b()) {
               $$1.a(1, $$2, null, $$0x -> {
               });
            }

            return $$1;
         }
      });
      dls.a(cwt.sv, new lf() {
         @Override
         protected cwp a(kz $$0, cwp $$1) {
            this.a(true);
            dgi $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dls.b));
            if (!cux.a($$1, $$2, $$3) && !cux.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dls.a(djo.cr, new lb() {
         @Override
         protected cwp a(kz $$0, cwp $$1) {
            dgi $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dls.b));
            clc $$4 = new clc($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dB(), $$4.dD(), $$4.dH(), awa.An, awb.e, 1.0F, 1.0F);
            $$2.a(null, ebt.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dls.a(cwt.vl, new lf() {
         @Override
         protected cwp a(kz $$0, cwp $$1) {
            dgi $$2 = $$0.b();
            jn $$3 = $$0.d().c(dls.b);
            ji $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dtk.b($$2, $$4, $$1)) {
               $$2.a($$4, djo.hd.m().b(dqt.e, Integer.valueOf(dyc.a($$3))), 3);
               $$2.a(null, ebt.i, $$4);
               dtz $$5 = $$2.c_($$4);
               if ($$5 instanceof dvo) {
                  dtk.a($$2, $$4, (dvo)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ld.b($$0, $$1));
            }

            return $$1;
         }
      });
      dls.a(djo.er, new lf() {
         @Override
         protected cwp a(kz $$0, cwp $$1) {
            dgi $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dls.b));
            dkh $$4 = (dkh)djo.er;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, ebt.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ld.b($$0, $$1));
            }

            return $$1;
         }
      });
      dls.a(djo.lr.j(), new li());

      for (cvm $$3 : cvm.values()) {
         dls.a(dqq.a($$3).j(), new li());
      }

      dls.a(cwt.th.j(), new lf() {
         private cwp b(kz $$0, cwp $$1, cwp $$2) {
            $$0.b().a(null, ebt.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cwp a(kz $$0, cwp $$1) {
            this.a(false);
            arc $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dls.b));
            dwx $$4 = $$2.a_($$3);
            if ($$4.a(awp.aJ, $$0x -> $$0x.b(djg.c) && $$0x.b() instanceof djg) && $$4.c(djg.c) >= 5) {
               ((djg)$$4.b()).a($$2, $$4, $$3, null, dtw.b.b);
               this.a(true);
               return this.b($$0, $$1, new cwp(cwt.xD));
            } else if ($$2.b_($$3).a(awv.a)) {
               this.a(true);
               return this.b($$0, $$1, cyo.a(cwt.ti, cyp.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dls.a(cwt.fJ, new lf() {
         @Override
         public cwp a(kz $$0, cwp $$1) {
            jn $$2 = $$0.d().c(dls.b);
            ji $$3 = $$0.c().a($$2);
            dgi $$4 = $$0.b();
            dwx $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(djo.pN)) {
               if ($$5.c(dpz.d) != 4) {
                  dpz.a(null, $$4, $$3, $$5);
                  $$1.h(1);
               } else {
                  this.a(false);
               }

               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dls.a(cwt.sS.j(), new lh());
      dls.a(cwt.yv.j(), new lf() {
         @Override
         protected cwp a(kz $$0, cwp $$1) {
            arc $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dls.b));
            List<cig> $$4 = $$2.a(cig.class, new fav($$3), bup.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cig $$5 : $$4) {
                  if ($$5.gt()) {
                     $$1.a(16, $$2, null, $$0x -> {
                     });
                     return $$1;
                  }
               }

               this.a(false);
               return $$1;
            }
         }
      });
      dls.a(cwt.xA, new lf() {
         @Override
         public cwp a(kz $$0, cwp $$1) {
            ji $$2 = $$0.c().a($$0.d().c(dls.b));
            dgi $$3 = $$0.b();
            dwx $$4 = $$3.a_($$2);
            Optional<dwx> $$5 = cwg.a($$4);
            if ($$5.isPresent()) {
               $$3.b($$2, $$5.get());
               $$3.c(3003, $$2, 0);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dls.a(cwt.ti, new lb() {
         private final lb c = new lb();

         @Override
         public cwp a(kz $$0, cwp $$1) {
            cyo $$2 = $$1.a(kv.Q, cyo.a);
            if (!$$2.a(cyp.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arc $$3 = $$0.b();
               ji $$4 = $$0.c();
               ji $$5 = $$0.c().a($$0.d().c(dls.b));
               if (!$$3.a_($$5).a(awp.cl)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lt.ao, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awa.cB, awb.e, 1.0F, 1.0F);
                  $$3.a(null, ebt.z, $$4);
                  $$3.b($$5, djo.tk.m());
                  return this.a($$0, $$1, new cwp(cwt.th));
               }
            }
         }
      });
      dls.a(cwt.oo, new le(bur.aE));
      dls.a(cwt.op, new le(bur.y));
      dls.a(cwt.oq, new le(bur.ad));
      dls.a(cwt.or, new le(bur.bx));
      dls.a(cwt.os, new le(bur.al));
      dls.a(cwt.vM, new le(bur.B));
   }
}
