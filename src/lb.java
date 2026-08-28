import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lb {
   Logger a = LogUtils.getLogger();
   lb b = ($$0, $$1) -> $$1;

   cxp dispense(ky var1, cxp var2);

   static void a() {
      dmt.a(cxt.oS);
      dmt.a(cxt.wg);
      dmt.a(cxt.wf);
      dmt.a(cxt.rp);
      dmt.a(cxt.ra);
      dmt.a(cxt.uL);
      dmt.a(cxt.we);
      dmt.a(cxt.wh);
      dmt.a(cxt.vk);
      dmt.a(cxt.uM);
      dmt.a(cxt.uN);
      la $$0 = new la() {
         @Override
         public cxp a(ky $$0, cxp $$1) {
            jm $$2 = $$0.d().c(dmt.b);
            bvr<?> $$3 = ((cyy)$$1.h()).g($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bvq.o, $$2 != jm.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cxp.j;
            }

            $$1.h(1);
            $$0.b().a(null, ecr.t, $$0.c());
            return $$1;
         }
      };

      for (cyy $$1 : cyy.b()) {
         dmt.a($$1, $$0);
      }

      dmt.a(cxt.vv, new la() {
         @Override
         public cxp a(ky $$0, cxp $$1) {
            jm $$2 = $$0.d().c(dmt.b);
            jh $$3 = $$0.c().a($$2);
            ash $$4 = $$0.b();
            Consumer<clq> $$5 = bvr.a($$1x -> $$1x.v($$2.p()), $$4, $$1, null);
            clq $$6 = bvr.f.a($$4, $$5, $$3, bvq.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dmt.a(cxt.oe, new le() {
         @Override
         public cxp a(ky $$0, cxp $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dmt.b));
            List<bwg> $$3 = $$0.b().a(bwg.class, new fbt($$2), $$0x -> !($$0x instanceof bww $$1x) ? false : !$$1x.j() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bww)$$3.get(0)).a($$1.a(1), axg.e);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dmt.a(cxt.eZ, new le() {
         @Override
         public cxp a(ky $$0, cxp $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dmt.b));

            for (cka $$4 : $$0.b().a(cka.class, new fbt($$2), $$0x -> $$0x.bL() && !$$0x.t())) {
               if ($$4.gF() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dmt.a(cxt.oo, new kz(bvr.aH));
      dmt.a(cxt.oq, new kz(bvr.bp));
      dmt.a(cxt.os, new kz(bvr.m));
      dmt.a(cxt.ou, new kz(bvr.au));
      dmt.a(cxt.oA, new kz(bvr.G));
      dmt.a(cxt.ow, new kz(bvr.a));
      dmt.a(cxt.oy, new kz(bvr.w));
      dmt.a(cxt.oE, new kz(bvr.aB));
      dmt.a(cxt.oC, new kz(bvr.aM));
      dmt.a(cxt.oG, new kz(bvr.j));
      dmt.a(cxt.op, new kz(bvr.aI));
      dmt.a(cxt.or, new kz(bvr.bq));
      dmt.a(cxt.ot, new kz(bvr.n));
      dmt.a(cxt.ov, new kz(bvr.av));
      dmt.a(cxt.oB, new kz(bvr.H));
      dmt.a(cxt.ox, new kz(bvr.b));
      dmt.a(cxt.oz, new kz(bvr.x));
      dmt.a(cxt.oF, new kz(bvr.aC));
      dmt.a(cxt.oD, new kz(bvr.aN));
      dmt.a(cxt.oH, new kz(bvr.i));
      lb $$2 = new la() {
         private final la c = new la();

         @Override
         public cxp a(ky $$0, cxp $$1) {
            cwk $$2 = (cwk)$$1.h();
            jh $$3 = $$0.c().a($$0.d().c(dmt.b));
            dhi $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cxp(cxt.qW));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dmt.a(cxt.qY, $$2);
      dmt.a(cxt.qX, $$2);
      dmt.a(cxt.qZ, $$2);
      dmt.a(cxt.re, $$2);
      dmt.a(cxt.rf, $$2);
      dmt.a(cxt.rd, $$2);
      dmt.a(cxt.rg, $$2);
      dmt.a(cxt.rh, $$2);
      dmt.a(cxt.ri, $$2);
      dmt.a(cxt.qW, new la() {
         @Override
         public cxp a(ky $$0, cxp $$1) {
            dhj $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dmt.b));
            dxv $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dku $$6) {
               cxp $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, ecr.y, $$3);
                  cxl $$8 = $$7.h();
                  return this.a($$0, $$1, new cxp($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dmt.a(cxt.oO, new le() {
         @Override
         protected cxp a(ky $$0, cxp $$1) {
            ash $$2 = $$0.b();
            this.a(true);
            jm $$3 = $$0.d().c(dmt.b);
            jh $$4 = $$0.c().a($$3);
            dxv $$5 = $$2.a_($$4);
            if (djz.a($$2, $$4, $$3)) {
               $$2.b($$4, djz.a($$2, $$4));
               $$2.a(null, ecr.i, $$4);
            } else if (dlb.i($$5) || dlc.h($$5) || dld.h($$5)) {
               $$2.b($$4, $$5.b(dyl.r, Boolean.valueOf(true)));
               $$2.a(null, ecr.c, $$4);
            } else if ($$5.b() instanceof dsy) {
               dsy.a($$2, $$4);
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
      dmt.a(cxt.sm, new le() {
         @Override
         protected cxp a(ky $$0, cxp $$1) {
            this.a(true);
            dhi $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dmt.b));
            if (!cvx.a($$1, $$2, $$3) && !cvx.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dmt.a(dko.cr, new la() {
         @Override
         protected cxp a(ky $$0, cxp $$1) {
            dhi $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dmt.b));
            cmc $$4 = new cmc($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dB(), $$4.dD(), $$4.dH(), axf.zX, axg.e, 1.0F, 1.0F);
            $$2.a(null, ecr.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dmt.a(cxt.vc, new le() {
         @Override
         protected cxp a(ky $$0, cxp $$1) {
            dhi $$2 = $$0.b();
            jm $$3 = $$0.d().c(dmt.b);
            jh $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dui.b($$2, $$4, $$1)) {
               $$2.a($$4, dko.gW.m().b(drr.e, Integer.valueOf(dza.a($$3))), 3);
               $$2.a(null, ecr.i, $$4);
               dux $$5 = $$2.c_($$4);
               if ($$5 instanceof dwm) {
                  dui.a($$2, $$4, (dwm)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lc.b($$0, $$1));
            }

            return $$1;
         }
      });
      dmt.a(dko.er, new le() {
         @Override
         protected cxp a(ky $$0, cxp $$1) {
            dhi $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dmt.b));
            dlh $$4 = (dlh)dko.er;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, ecr.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lc.b($$0, $$1));
            }

            return $$1;
         }
      });
      dmt.a(dko.lk.j(), new lh());

      for (cwm $$3 : cwm.values()) {
         dmt.a(dro.a($$3).j(), new lh());
      }

      dmt.a(cxt.sY.j(), new le() {
         private cxp b(ky $$0, cxp $$1, cxp $$2) {
            $$0.b().a(null, ecr.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cxp a(ky $$0, cxp $$1) {
            this.a(false);
            ash $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dmt.b));
            dxv $$4 = $$2.a_($$3);
            if ($$4.a(axu.aJ, $$0x -> $$0x.b(dkg.c) && $$0x.b() instanceof dkg) && $$4.c(dkg.c) >= 5) {
               ((dkg)$$4.b()).a($$2, $$4, $$3, null, duu.b.b);
               this.a(true);
               return this.b($$0, $$1, new cxp(cxt.xt));
            } else if ($$2.b_($$3).a(aya.a)) {
               this.a(true);
               return this.b($$0, $$1, czo.a(cxt.sZ, czp.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dmt.a(cxt.fH, new le() {
         @Override
         public cxp a(ky $$0, cxp $$1) {
            jm $$2 = $$0.d().c(dmt.b);
            jh $$3 = $$0.c().a($$2);
            dhi $$4 = $$0.b();
            dxv $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dko.pG)) {
               if ($$5.c(dqx.d) != 4) {
                  dqx.a(null, $$4, $$3, $$5);
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
      dmt.a(cxt.sJ.j(), new lg());
      dmt.a(cxt.yl.j(), new le() {
         @Override
         protected cxp a(ky $$0, cxp $$1) {
            ash $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dmt.b));
            List<cjg> $$4 = $$2.a(cjg.class, new fbt($$3), bvp.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cjg $$5 : $$4) {
                  if ($$5.gs()) {
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
      dmt.a(cxt.xq, new le() {
         @Override
         public cxp a(ky $$0, cxp $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dmt.b));
            dhi $$3 = $$0.b();
            dxv $$4 = $$3.a_($$2);
            Optional<dxv> $$5 = cxg.a($$4);
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
      dmt.a(cxt.sZ, new la() {
         private final la c = new la();

         @Override
         public cxp a(ky $$0, cxp $$1) {
            czo $$2 = $$1.a(ku.Q, czo.a);
            if (!$$2.a(czp.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               ash $$3 = $$0.b();
               jh $$4 = $$0.c();
               jh $$5 = $$0.c().a($$0.d().c(dmt.b));
               if (!$$3.a_($$5).a(axu.cl)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(ls.an, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, axf.cB, axg.e, 1.0F, 1.0F);
                  $$3.a(null, ecr.z, $$4);
                  $$3.b($$5, dko.td.m());
                  return this.a($$0, $$1, new cxp(cxt.sY));
               }
            }
         }
      });
      dmt.a(cxt.of, new ld(bvr.aE));
      dmt.a(cxt.og, new ld(bvr.y));
      dmt.a(cxt.oh, new ld(bvr.ad));
      dmt.a(cxt.oi, new ld(bvr.bx));
      dmt.a(cxt.oj, new ld(bvr.al));
      dmt.a(cxt.vC, new ld(bvr.B));
   }
}
