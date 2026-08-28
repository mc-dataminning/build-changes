import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lb {
   Logger a = LogUtils.getLogger();
   lb b = ($$0, $$1) -> $$1;

   cxo dispense(ky var1, cxo var2);

   static void a() {
      dms.a(cxs.oS);
      dms.a(cxs.wg);
      dms.a(cxs.wf);
      dms.a(cxs.rp);
      dms.a(cxs.ra);
      dms.a(cxs.uL);
      dms.a(cxs.we);
      dms.a(cxs.wh);
      dms.a(cxs.vk);
      dms.a(cxs.uM);
      dms.a(cxs.uN);
      la $$0 = new la() {
         @Override
         public cxo a(ky $$0, cxo $$1) {
            jm $$2 = $$0.d().c(dms.b);
            bvq<?> $$3 = ((cyx)$$1.h()).g($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bvp.o, $$2 != jm.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cxo.j;
            }

            $$1.h(1);
            $$0.b().a(null, ecq.t, $$0.c());
            return $$1;
         }
      };

      for (cyx $$1 : cyx.b()) {
         dms.a($$1, $$0);
      }

      dms.a(cxs.vv, new la() {
         @Override
         public cxo a(ky $$0, cxo $$1) {
            jm $$2 = $$0.d().c(dms.b);
            jh $$3 = $$0.c().a($$2);
            ash $$4 = $$0.b();
            Consumer<clp> $$5 = bvq.a($$1x -> $$1x.v($$2.p()), $$4, $$1, null);
            clp $$6 = bvq.f.a($$4, $$5, $$3, bvp.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dms.a(cxs.oe, new le() {
         @Override
         public cxo a(ky $$0, cxo $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dms.b));
            List<bwf> $$3 = $$0.b().a(bwf.class, new fbs($$2), $$0x -> !($$0x instanceof bwv $$1x) ? false : !$$1x.j() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bwv)$$3.get(0)).a($$1.a(1), axg.e);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dms.a(cxs.eZ, new le() {
         @Override
         public cxo a(ky $$0, cxo $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dms.b));

            for (cjz $$4 : $$0.b().a(cjz.class, new fbs($$2), $$0x -> $$0x.bL() && !$$0x.t())) {
               if ($$4.gF() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dms.a(cxs.oo, new kz(bvq.aH));
      dms.a(cxs.oq, new kz(bvq.bp));
      dms.a(cxs.os, new kz(bvq.m));
      dms.a(cxs.ou, new kz(bvq.au));
      dms.a(cxs.oA, new kz(bvq.G));
      dms.a(cxs.ow, new kz(bvq.a));
      dms.a(cxs.oy, new kz(bvq.w));
      dms.a(cxs.oE, new kz(bvq.aB));
      dms.a(cxs.oC, new kz(bvq.aM));
      dms.a(cxs.oG, new kz(bvq.j));
      dms.a(cxs.op, new kz(bvq.aI));
      dms.a(cxs.or, new kz(bvq.bq));
      dms.a(cxs.ot, new kz(bvq.n));
      dms.a(cxs.ov, new kz(bvq.av));
      dms.a(cxs.oB, new kz(bvq.H));
      dms.a(cxs.ox, new kz(bvq.b));
      dms.a(cxs.oz, new kz(bvq.x));
      dms.a(cxs.oF, new kz(bvq.aC));
      dms.a(cxs.oD, new kz(bvq.aN));
      dms.a(cxs.oH, new kz(bvq.i));
      lb $$2 = new la() {
         private final la c = new la();

         @Override
         public cxo a(ky $$0, cxo $$1) {
            cwj $$2 = (cwj)$$1.h();
            jh $$3 = $$0.c().a($$0.d().c(dms.b));
            dhh $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cxo(cxs.qW));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dms.a(cxs.qY, $$2);
      dms.a(cxs.qX, $$2);
      dms.a(cxs.qZ, $$2);
      dms.a(cxs.re, $$2);
      dms.a(cxs.rf, $$2);
      dms.a(cxs.rd, $$2);
      dms.a(cxs.rg, $$2);
      dms.a(cxs.rh, $$2);
      dms.a(cxs.ri, $$2);
      dms.a(cxs.qW, new la() {
         @Override
         public cxo a(ky $$0, cxo $$1) {
            dhi $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dms.b));
            dxu $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dkt $$6) {
               cxo $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, ecq.y, $$3);
                  cxk $$8 = $$7.h();
                  return this.a($$0, $$1, new cxo($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dms.a(cxs.oO, new le() {
         @Override
         protected cxo a(ky $$0, cxo $$1) {
            ash $$2 = $$0.b();
            this.a(true);
            jm $$3 = $$0.d().c(dms.b);
            jh $$4 = $$0.c().a($$3);
            dxu $$5 = $$2.a_($$4);
            if (djy.a($$2, $$4, $$3)) {
               $$2.b($$4, djy.a($$2, $$4));
               $$2.a(null, ecq.i, $$4);
            } else if (dla.i($$5) || dlb.h($$5) || dlc.h($$5)) {
               $$2.b($$4, $$5.b(dyk.r, Boolean.valueOf(true)));
               $$2.a(null, ecq.c, $$4);
            } else if ($$5.b() instanceof dsx) {
               dsx.a($$2, $$4);
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
      dms.a(cxs.sm, new le() {
         @Override
         protected cxo a(ky $$0, cxo $$1) {
            this.a(true);
            dhh $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dms.b));
            if (!cvw.a($$1, $$2, $$3) && !cvw.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dms.a(dkn.cr, new la() {
         @Override
         protected cxo a(ky $$0, cxo $$1) {
            dhh $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dms.b));
            cmb $$4 = new cmb($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dB(), $$4.dD(), $$4.dH(), axf.zX, axg.e, 1.0F, 1.0F);
            $$2.a(null, ecq.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dms.a(cxs.vc, new le() {
         @Override
         protected cxo a(ky $$0, cxo $$1) {
            dhh $$2 = $$0.b();
            jm $$3 = $$0.d().c(dms.b);
            jh $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && duh.b($$2, $$4, $$1)) {
               $$2.a($$4, dkn.gW.m().b(drq.e, Integer.valueOf(dyz.a($$3))), 3);
               $$2.a(null, ecq.i, $$4);
               duw $$5 = $$2.c_($$4);
               if ($$5 instanceof dwl) {
                  duh.a($$2, $$4, (dwl)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lc.b($$0, $$1));
            }

            return $$1;
         }
      });
      dms.a(dkn.er, new le() {
         @Override
         protected cxo a(ky $$0, cxo $$1) {
            dhh $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dms.b));
            dlg $$4 = (dlg)dkn.er;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, ecq.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lc.b($$0, $$1));
            }

            return $$1;
         }
      });
      dms.a(dkn.lk.j(), new lh());

      for (cwl $$3 : cwl.values()) {
         dms.a(drn.a($$3).j(), new lh());
      }

      dms.a(cxs.sY.j(), new le() {
         private cxo b(ky $$0, cxo $$1, cxo $$2) {
            $$0.b().a(null, ecq.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cxo a(ky $$0, cxo $$1) {
            this.a(false);
            ash $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dms.b));
            dxu $$4 = $$2.a_($$3);
            if ($$4.a(axu.aJ, $$0x -> $$0x.b(dkf.c) && $$0x.b() instanceof dkf) && $$4.c(dkf.c) >= 5) {
               ((dkf)$$4.b()).a($$2, $$4, $$3, null, dut.b.b);
               this.a(true);
               return this.b($$0, $$1, new cxo(cxs.xt));
            } else if ($$2.b_($$3).a(aya.a)) {
               this.a(true);
               return this.b($$0, $$1, czn.a(cxs.sZ, czo.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dms.a(cxs.fH, new le() {
         @Override
         public cxo a(ky $$0, cxo $$1) {
            jm $$2 = $$0.d().c(dms.b);
            jh $$3 = $$0.c().a($$2);
            dhh $$4 = $$0.b();
            dxu $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dkn.pG)) {
               if ($$5.c(dqw.d) != 4) {
                  dqw.a(null, $$4, $$3, $$5);
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
      dms.a(cxs.sJ.j(), new lg());
      dms.a(cxs.yl.j(), new le() {
         @Override
         protected cxo a(ky $$0, cxo $$1) {
            ash $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dms.b));
            List<cjf> $$4 = $$2.a(cjf.class, new fbs($$3), bvo.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cjf $$5 : $$4) {
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
      dms.a(cxs.xq, new le() {
         @Override
         public cxo a(ky $$0, cxo $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dms.b));
            dhh $$3 = $$0.b();
            dxu $$4 = $$3.a_($$2);
            Optional<dxu> $$5 = cxf.a($$4);
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
      dms.a(cxs.sZ, new la() {
         private final la c = new la();

         @Override
         public cxo a(ky $$0, cxo $$1) {
            czn $$2 = $$1.a(ku.Q, czn.a);
            if (!$$2.a(czo.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               ash $$3 = $$0.b();
               jh $$4 = $$0.c();
               jh $$5 = $$0.c().a($$0.d().c(dms.b));
               if (!$$3.a_($$5).a(axu.cl)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(ls.an, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, axf.cB, axg.e, 1.0F, 1.0F);
                  $$3.a(null, ecq.z, $$4);
                  $$3.b($$5, dkn.td.m());
                  return this.a($$0, $$1, new cxo(cxs.sY));
               }
            }
         }
      });
      dms.a(cxs.of, new ld(bvq.aE));
      dms.a(cxs.og, new ld(bvq.y));
      dms.a(cxs.oh, new ld(bvq.ad));
      dms.a(cxs.oi, new ld(bvq.bx));
      dms.a(cxs.oj, new ld(bvq.al));
      dms.a(cxs.vC, new ld(bvq.B));
   }
}
