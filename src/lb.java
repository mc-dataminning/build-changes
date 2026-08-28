import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lb {
   Logger a = LogUtils.getLogger();
   lb b = ($$0, $$1) -> $$1;

   cxg dispense(ky var1, cxg var2);

   static void a() {
      dmj.a(cxk.pb);
      dmj.a(cxk.wq);
      dmj.a(cxk.wp);
      dmj.a(cxk.ry);
      dmj.a(cxk.rj);
      dmj.a(cxk.uU);
      dmj.a(cxk.wo);
      dmj.a(cxk.wr);
      dmj.a(cxk.vt);
      dmj.a(cxk.uV);
      dmj.a(cxk.uW);
      la $$0 = new la() {
         @Override
         public cxg a(ky $$0, cxg $$1) {
            jm $$2 = $$0.d().c(dmj.b);
            bvi<?> $$3 = ((cyp)$$1.h()).g($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bvh.o, $$2 != jm.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cxg.j;
            }

            $$1.h(1);
            $$0.b().a(null, eck.t, $$0.c());
            return $$1;
         }
      };

      for (cyp $$1 : cyp.b()) {
         dmj.a($$1, $$0);
      }

      dmj.a(cxk.vF, new la() {
         @Override
         public cxg a(ky $$0, cxg $$1) {
            jm $$2 = $$0.d().c(dmj.b);
            jh $$3 = $$0.c().a($$2);
            arx $$4 = $$0.b();
            Consumer<clh> $$5 = bvi.a($$1x -> $$1x.v($$2.p()), $$4, $$1, null);
            clh $$6 = bvi.f.a($$4, $$5, $$3, bvh.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dmj.a(cxk.on, new le() {
         @Override
         public cxg a(ky $$0, cxg $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dmj.b));
            List<bvx> $$3 = $$0.b().a(bvx.class, new fbm($$2), $$0x -> !($$0x instanceof bwn $$1x) ? false : !$$1x.j() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bwn)$$3.get(0)).a($$1.a(1), aww.e);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dmj.a(cxk.fb, new le() {
         @Override
         public cxg a(ky $$0, cxg $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dmj.b));

            for (cjr $$4 : $$0.b().a(cjr.class, new fbm($$2), $$0x -> $$0x.bL() && !$$0x.t())) {
               if ($$4.gF() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dmj.a(cxk.ox, new kz(bvi.aH));
      dmj.a(cxk.oz, new kz(bvi.bp));
      dmj.a(cxk.oB, new kz(bvi.m));
      dmj.a(cxk.oD, new kz(bvi.au));
      dmj.a(cxk.oJ, new kz(bvi.G));
      dmj.a(cxk.oF, new kz(bvi.a));
      dmj.a(cxk.oH, new kz(bvi.w));
      dmj.a(cxk.oN, new kz(bvi.aB));
      dmj.a(cxk.oL, new kz(bvi.aM));
      dmj.a(cxk.oP, new kz(bvi.j));
      dmj.a(cxk.oy, new kz(bvi.aI));
      dmj.a(cxk.oA, new kz(bvi.bq));
      dmj.a(cxk.oC, new kz(bvi.n));
      dmj.a(cxk.oE, new kz(bvi.av));
      dmj.a(cxk.oK, new kz(bvi.H));
      dmj.a(cxk.oG, new kz(bvi.b));
      dmj.a(cxk.oI, new kz(bvi.x));
      dmj.a(cxk.oO, new kz(bvi.aC));
      dmj.a(cxk.oM, new kz(bvi.aN));
      dmj.a(cxk.oQ, new kz(bvi.i));
      lb $$2 = new la() {
         private final la c = new la();

         @Override
         public cxg a(ky $$0, cxg $$1) {
            cwb $$2 = (cwb)$$1.h();
            jh $$3 = $$0.c().a($$0.d().c(dmj.b));
            dgz $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cxg(cxk.rf));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dmj.a(cxk.rh, $$2);
      dmj.a(cxk.rg, $$2);
      dmj.a(cxk.ri, $$2);
      dmj.a(cxk.rn, $$2);
      dmj.a(cxk.ro, $$2);
      dmj.a(cxk.rm, $$2);
      dmj.a(cxk.rp, $$2);
      dmj.a(cxk.rq, $$2);
      dmj.a(cxk.rr, $$2);
      dmj.a(cxk.rf, new la() {
         @Override
         public cxg a(ky $$0, cxg $$1) {
            dha $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dmj.b));
            dxo $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dkl $$6) {
               cxg $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, eck.y, $$3);
                  cxc $$8 = $$7.h();
                  return this.a($$0, $$1, new cxg($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dmj.a(cxk.oX, new le() {
         @Override
         protected cxg a(ky $$0, cxg $$1) {
            arx $$2 = $$0.b();
            this.a(true);
            jm $$3 = $$0.d().c(dmj.b);
            jh $$4 = $$0.c().a($$3);
            dxo $$5 = $$2.a_($$4);
            if (djq.a($$2, $$4, $$3)) {
               $$2.b($$4, djq.a($$2, $$4));
               $$2.a(null, eck.i, $$4);
            } else if (dks.i($$5) || dkt.h($$5) || dku.h($$5)) {
               $$2.b($$4, $$5.b(dye.v, Boolean.valueOf(true)));
               $$2.a(null, eck.c, $$4);
            } else if ($$5.b() instanceof dsr) {
               dsr.a($$2, $$4);
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
      dmj.a(cxk.sv, new le() {
         @Override
         protected cxg a(ky $$0, cxg $$1) {
            this.a(true);
            dgz $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dmj.b));
            if (!cvo.a($$1, $$2, $$3) && !cvo.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dmj.a(dkf.cr, new la() {
         @Override
         protected cxg a(ky $$0, cxg $$1) {
            dgz $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dmj.b));
            clt $$4 = new clt($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dB(), $$4.dD(), $$4.dH(), awv.An, aww.e, 1.0F, 1.0F);
            $$2.a(null, eck.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dmj.a(cxk.vl, new le() {
         @Override
         protected cxg a(ky $$0, cxg $$1) {
            dgz $$2 = $$0.b();
            jm $$3 = $$0.d().c(dmj.b);
            jh $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dub.b($$2, $$4, $$1)) {
               $$2.a($$4, dkf.hd.m().b(drk.e, Integer.valueOf(dyt.a($$3))), 3);
               $$2.a(null, eck.i, $$4);
               duq $$5 = $$2.c_($$4);
               if ($$5 instanceof dwf) {
                  dub.a($$2, $$4, (dwf)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lc.b($$0, $$1));
            }

            return $$1;
         }
      });
      dmj.a(dkf.er, new le() {
         @Override
         protected cxg a(ky $$0, cxg $$1) {
            dgz $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dmj.b));
            dky $$4 = (dky)dkf.er;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, eck.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lc.b($$0, $$1));
            }

            return $$1;
         }
      });
      dmj.a(dkf.lr.j(), new lh());

      for (cwd $$3 : cwd.values()) {
         dmj.a(drh.a($$3).j(), new lh());
      }

      dmj.a(cxk.th.j(), new le() {
         private cxg b(ky $$0, cxg $$1, cxg $$2) {
            $$0.b().a(null, eck.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cxg a(ky $$0, cxg $$1) {
            this.a(false);
            arx $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dmj.b));
            dxo $$4 = $$2.a_($$3);
            if ($$4.a(axk.aJ, $$0x -> $$0x.b(djx.c) && $$0x.b() instanceof djx) && $$4.c(djx.c) >= 5) {
               ((djx)$$4.b()).a($$2, $$4, $$3, null, dun.b.b);
               this.a(true);
               return this.b($$0, $$1, new cxg(cxk.xD));
            } else if ($$2.b_($$3).a(axq.a)) {
               this.a(true);
               return this.b($$0, $$1, czf.a(cxk.ti, czg.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dmj.a(cxk.fJ, new le() {
         @Override
         public cxg a(ky $$0, cxg $$1) {
            jm $$2 = $$0.d().c(dmj.b);
            jh $$3 = $$0.c().a($$2);
            dgz $$4 = $$0.b();
            dxo $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dkf.pN)) {
               if ($$5.c(dqq.d) != 4) {
                  dqq.a(null, $$4, $$3, $$5);
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
      dmj.a(cxk.sS.j(), new lg());
      dmj.a(cxk.yv.j(), new le() {
         @Override
         protected cxg a(ky $$0, cxg $$1) {
            arx $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dmj.b));
            List<cix> $$4 = $$2.a(cix.class, new fbm($$3), bvg.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cix $$5 : $$4) {
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
      dmj.a(cxk.xA, new le() {
         @Override
         public cxg a(ky $$0, cxg $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dmj.b));
            dgz $$3 = $$0.b();
            dxo $$4 = $$3.a_($$2);
            Optional<dxo> $$5 = cwx.a($$4);
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
      dmj.a(cxk.ti, new la() {
         private final la c = new la();

         @Override
         public cxg a(ky $$0, cxg $$1) {
            czf $$2 = $$1.a(ku.Q, czf.a);
            if (!$$2.a(czg.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arx $$3 = $$0.b();
               jh $$4 = $$0.c();
               jh $$5 = $$0.c().a($$0.d().c(dmj.b));
               if (!$$3.a_($$5).a(axk.cl)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(ls.ao, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awv.cB, aww.e, 1.0F, 1.0F);
                  $$3.a(null, eck.z, $$4);
                  $$3.b($$5, dkf.tk.m());
                  return this.a($$0, $$1, new cxg(cxk.th));
               }
            }
         }
      });
      dmj.a(cxk.oo, new ld(bvi.aE));
      dmj.a(cxk.op, new ld(bvi.y));
      dmj.a(cxk.oq, new ld(bvi.ad));
      dmj.a(cxk.or, new ld(bvi.bx));
      dmj.a(cxk.os, new ld(bvi.al));
      dmj.a(cxk.vM, new ld(bvi.B));
   }
}
