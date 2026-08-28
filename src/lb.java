import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lb {
   Logger a = LogUtils.getLogger();
   lb b = ($$0, $$1) -> $$1;

   cwf dispense(ky var1, cwf var2);

   static void a() {
      dko.a(cwj.ox);
      dko.a(cwj.vI);
      dko.a(cwj.vH);
      dko.a(cwj.qS);
      dko.a(cwj.qD);
      dko.a(cwj.un);
      dko.a(cwj.vG);
      dko.a(cwj.vJ);
      dko.a(cwj.uM);
      dko.a(cwj.uo);
      dko.a(cwj.up);
      la $$0 = new la() {
         @Override
         public cwf a(ky $$0, cwf $$1) {
            jm $$2 = $$0.d().c(dko.b);
            bup<?> $$3 = ((cxo)$$1.h()).g($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), buo.o, $$2 != jm.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cwf.k;
            }

            $$1.h(1);
            $$0.b().a(null, eak.t, $$0.c());
            return $$1;
         }
      };

      for (cxo $$1 : cxo.b()) {
         dko.a($$1, $$0);
      }

      dko.a(cwj.uX, new la() {
         @Override
         public cwf a(ky $$0, cwf $$1) {
            jm $$2 = $$0.d().c(dko.b);
            jh $$3 = $$0.c().a($$2);
            arq $$4 = $$0.b();
            Consumer<cko> $$5 = bup.a($$1x -> $$1x.v($$2.p()), $$4, $$1, null);
            cko $$6 = bup.d.a($$4, $$5, $$3, buo.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dko.a(cwj.nL, new le() {
         @Override
         public cwf a(ky $$0, cwf $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dko.b));
            List<bve> $$3 = $$0.b().a(bve.class, new ezm($$2), $$0x -> !($$0x instanceof bvu $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bvu)$$3.get(0)).a($$1.a(1), awp.e);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dko.a(cwj.eN, new le() {
         @Override
         public cwf a(ky $$0, cwf $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dko.b));

            for (ciy $$4 : $$0.b().a(ciy.class, new ezm($$2), $$0x -> $$0x.bN() && !$$0x.t())) {
               if ($$4.gM() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dko.a(cwj.nV, new kz(cqq.b.a));
      dko.a(cwj.nX, new kz(cqq.b.b));
      dko.a(cwj.nZ, new kz(cqq.b.c));
      dko.a(cwj.ob, new kz(cqq.b.d));
      dko.a(cwj.oh, new kz(cqq.b.g));
      dko.a(cwj.od, new kz(cqq.b.e));
      dko.a(cwj.of, new kz(cqq.b.f));
      dko.a(cwj.oj, new kz(cqq.b.h));
      dko.a(cwj.ol, new kz(cqq.b.i));
      dko.a(cwj.nW, new kz(cqq.b.a, true));
      dko.a(cwj.nY, new kz(cqq.b.b, true));
      dko.a(cwj.oa, new kz(cqq.b.c, true));
      dko.a(cwj.oc, new kz(cqq.b.d, true));
      dko.a(cwj.oi, new kz(cqq.b.g, true));
      dko.a(cwj.oe, new kz(cqq.b.e, true));
      dko.a(cwj.og, new kz(cqq.b.f, true));
      dko.a(cwj.ok, new kz(cqq.b.h, true));
      dko.a(cwj.om, new kz(cqq.b.i, true));
      lb $$2 = new la() {
         private final la c = new la();

         @Override
         public cwf a(ky $$0, cwf $$1) {
            cva $$2 = (cva)$$1.h();
            jh $$3 = $$0.c().a($$0.d().c(dko.b));
            dff $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cwf(cwj.qz));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dko.a(cwj.qB, $$2);
      dko.a(cwj.qA, $$2);
      dko.a(cwj.qC, $$2);
      dko.a(cwj.qH, $$2);
      dko.a(cwj.qI, $$2);
      dko.a(cwj.qG, $$2);
      dko.a(cwj.qJ, $$2);
      dko.a(cwj.qK, $$2);
      dko.a(cwj.qL, $$2);
      dko.a(cwj.qz, new la() {
         @Override
         public cwf a(ky $$0, cwf $$1) {
            dfg $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dko.b));
            dvo $$4 = $$2.a_($$3);
            if ($$4.b() instanceof diq $$6) {
               cwf $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, eak.y, $$3);
                  cwb $$8 = $$7.h();
                  return this.a($$0, $$1, new cwf($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dko.a(cwj.ot, new le() {
         @Override
         protected cwf a(ky $$0, cwf $$1) {
            arq $$2 = $$0.b();
            this.a(true);
            jm $$3 = $$0.d().c(dko.b);
            jh $$4 = $$0.c().a($$3);
            dvo $$5 = $$2.a_($$4);
            if (dhw.a($$2, $$4, $$3)) {
               $$2.b($$4, dhw.a($$2, $$4));
               $$2.a(null, eak.i, $$4);
            } else if (dix.i($$5) || diy.h($$5) || diz.h($$5)) {
               $$2.b($$4, $$5.b(dwe.r, Boolean.valueOf(true)));
               $$2.a(null, eak.c, $$4);
            } else if ($$5.b() instanceof dqs) {
               dqs.a($$2, $$4);
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
      dko.a(cwj.rP, new le() {
         @Override
         protected cwf a(ky $$0, cwf $$1) {
            this.a(true);
            dff $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dko.b));
            if (!cun.a($$1, $$2, $$3) && !cun.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dko.a(dil.ck, new la() {
         @Override
         protected cwf a(ky $$0, cwf $$1) {
            dff $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dko.b));
            cla $$4 = new cla($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dD(), $$4.dF(), $$4.dJ(), awo.zC, awp.e, 1.0F, 1.0F);
            $$2.a(null, eak.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dko.a(cwj.uE, new le() {
         @Override
         protected cwf a(ky $$0, cwf $$1) {
            dff $$2 = $$0.b();
            jm $$3 = $$0.d().c(dko.b);
            jh $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dsc.b($$2, $$4, $$1)) {
               $$2.a($$4, dil.gG.m().b(dpl.e, Integer.valueOf(dwt.a($$3))), 3);
               $$2.a(null, eak.i, $$4);
               dsr $$5 = $$2.c_($$4);
               if ($$5 instanceof duf) {
                  dsc.a($$2, $$4, (duf)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lc.b($$0, $$1));
            }

            return $$1;
         }
      });
      dko.a(dil.ee, new le() {
         @Override
         protected cwf a(ky $$0, cwf $$1) {
            dff $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dko.b));
            djd $$4 = (djd)dil.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, eak.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lc.b($$0, $$1));
            }

            return $$1;
         }
      });
      dko.a(dil.kP.j(), new lh());

      for (cvc $$3 : cvc.values()) {
         dko.a(dpi.a($$3).j(), new lh());
      }

      dko.a(cwj.sB.j(), new le() {
         private cwf b(ky $$0, cwf $$1, cwf $$2) {
            $$0.b().a(null, eak.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cwf a(ky $$0, cwf $$1) {
            this.a(false);
            arq $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dko.b));
            dvo $$4 = $$2.a_($$3);
            if ($$4.a(axd.aI, $$0x -> $$0x.b(did.c) && $$0x.b() instanceof did) && $$4.c(did.c) >= 5) {
               ((did)$$4.b()).a($$2, $$4, $$3, null, dso.b.b);
               this.a(true);
               return this.b($$0, $$1, new cwf(cwj.wV));
            } else if ($$2.b_($$3).a(axj.a)) {
               this.a(true);
               return this.b($$0, $$1, cye.a(cwj.sC, cyf.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dko.a(cwj.fu, new le() {
         @Override
         public cwf a(ky $$0, cwf $$1) {
            jm $$2 = $$0.d().c(dko.b);
            jh $$3 = $$0.c().a($$2);
            dff $$4 = $$0.b();
            dvo $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dil.pl)) {
               if ($$5.c(dor.d) != 4) {
                  dor.a(null, $$4, $$3, $$5);
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
      dko.a(cwj.sm.j(), new lg());
      dko.a(cwj.xN.j(), new le() {
         @Override
         protected cwf a(ky $$0, cwf $$1) {
            arq $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dko.b));
            List<cie> $$4 = $$2.a(cie.class, new ezm($$3), bun.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cie $$5 : $$4) {
                  if ($$5.gz()) {
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
      dko.a(cwj.wS, new le() {
         @Override
         public cwf a(ky $$0, cwf $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dko.b));
            dff $$3 = $$0.b();
            dvo $$4 = $$3.a_($$2);
            Optional<dvo> $$5 = cvw.a($$4);
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
      dko.a(cwj.sC, new la() {
         private final la c = new la();

         @Override
         public cwf a(ky $$0, cwf $$1) {
            cye $$2 = $$1.a(ku.Q, cye.a);
            if (!$$2.a(cyf.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arq $$3 = $$0.b();
               jh $$4 = $$0.c();
               jh $$5 = $$0.c().a($$0.d().c(dko.b));
               if (!$$3.a_($$5).a(axd.ck)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(ls.am, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awo.cB, awp.e, 1.0F, 1.0F);
                  $$3.a(null, eak.z, $$4);
                  $$3.b($$5, dil.sI.m());
                  return this.a($$0, $$1, new cwf(cwj.sB));
               }
            }
         }
      });
      dko.a(cwj.nM, new ld(bup.ar));
      dko.a(cwj.nN, new ld(bup.s));
      dko.a(cwj.nO, new ld(bup.S));
      dko.a(cwj.nP, new ld(bup.bd));
      dko.a(cwj.nQ, new ld(bup.aa));
      dko.a(cwj.ve, new ld(bup.v));
   }
}
