import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lb {
   Logger a = LogUtils.getLogger();
   lb b = ($$0, $$1) -> $$1;

   cwb dispense(ky var1, cwb var2);

   static void a() {
      dkj.a(cwf.ox);
      dkj.a(cwf.vs);
      dkj.a(cwf.vr);
      dkj.a(cwf.qS);
      dkj.a(cwf.qD);
      dkj.a(cwf.tX);
      dkj.a(cwf.vq);
      dkj.a(cwf.vt);
      dkj.a(cwf.uw);
      dkj.a(cwf.tY);
      dkj.a(cwf.tZ);
      la $$0 = new la() {
         @Override
         public cwb a(ky $$0, cwb $$1) {
            jm $$2 = $$0.d().c(dkj.b);
            bul<?> $$3 = ((cxk)$$1.h()).g($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), buk.o, $$2 != jm.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cwb.k;
            }

            $$1.h(1);
            $$0.b().a(null, eag.t, $$0.c());
            return $$1;
         }
      };

      for (cxk $$1 : cxk.b()) {
         dkj.a($$1, $$0);
      }

      dkj.a(cwf.uH, new la() {
         @Override
         public cwb a(ky $$0, cwb $$1) {
            jm $$2 = $$0.d().c(dkj.b);
            jh $$3 = $$0.c().a($$2);
            arn $$4 = $$0.b();
            Consumer<ckk> $$5 = bul.a($$1x -> $$1x.v($$2.p()), $$4, $$1, null);
            ckk $$6 = bul.d.a($$4, $$5, $$3, buk.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dkj.a(cwf.nL, new ld() {
         @Override
         public cwb a(ky $$0, cwb $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dkj.b));
            List<bva> $$3 = $$0.b().a(bva.class, new ezi($$2), $$0x -> !($$0x instanceof bvq $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bvq)$$3.get(0)).a($$1.a(1), awm.e);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dkj.a(cwf.eN, new ld() {
         @Override
         public cwb a(ky $$0, cwb $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dkj.b));

            for (ciu $$4 : $$0.b().a(ciu.class, new ezi($$2), $$0x -> $$0x.bM() && !$$0x.t())) {
               if ($$4.gL() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dkj.a(cwf.nV, new kz(cqm.b.a));
      dkj.a(cwf.nX, new kz(cqm.b.b));
      dkj.a(cwf.nZ, new kz(cqm.b.c));
      dkj.a(cwf.ob, new kz(cqm.b.d));
      dkj.a(cwf.oh, new kz(cqm.b.g));
      dkj.a(cwf.od, new kz(cqm.b.e));
      dkj.a(cwf.of, new kz(cqm.b.f));
      dkj.a(cwf.oj, new kz(cqm.b.h));
      dkj.a(cwf.ol, new kz(cqm.b.i));
      dkj.a(cwf.nW, new kz(cqm.b.a, true));
      dkj.a(cwf.nY, new kz(cqm.b.b, true));
      dkj.a(cwf.oa, new kz(cqm.b.c, true));
      dkj.a(cwf.oc, new kz(cqm.b.d, true));
      dkj.a(cwf.oi, new kz(cqm.b.g, true));
      dkj.a(cwf.oe, new kz(cqm.b.e, true));
      dkj.a(cwf.og, new kz(cqm.b.f, true));
      dkj.a(cwf.ok, new kz(cqm.b.h, true));
      dkj.a(cwf.om, new kz(cqm.b.i, true));
      lb $$2 = new la() {
         private final la c = new la();

         @Override
         public cwb a(ky $$0, cwb $$1) {
            cuw $$2 = (cuw)$$1.h();
            jh $$3 = $$0.c().a($$0.d().c(dkj.b));
            dfb $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cwb(cwf.qz));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dkj.a(cwf.qB, $$2);
      dkj.a(cwf.qA, $$2);
      dkj.a(cwf.qC, $$2);
      dkj.a(cwf.qH, $$2);
      dkj.a(cwf.qI, $$2);
      dkj.a(cwf.qG, $$2);
      dkj.a(cwf.qJ, $$2);
      dkj.a(cwf.qK, $$2);
      dkj.a(cwf.qL, $$2);
      dkj.a(cwf.qz, new la() {
         @Override
         public cwb a(ky $$0, cwb $$1) {
            dfc $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dkj.b));
            dvj $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dil $$6) {
               cwb $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, eag.y, $$3);
                  cvx $$8 = $$7.h();
                  return this.a($$0, $$1, new cwb($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dkj.a(cwf.ot, new ld() {
         @Override
         protected cwb a(ky $$0, cwb $$1) {
            arn $$2 = $$0.b();
            this.a(true);
            jm $$3 = $$0.d().c(dkj.b);
            jh $$4 = $$0.c().a($$3);
            dvj $$5 = $$2.a_($$4);
            if (dhr.a($$2, $$4, $$3)) {
               $$2.b($$4, dhr.a($$2, $$4));
               $$2.a(null, eag.i, $$4);
            } else if (dis.i($$5) || dit.h($$5) || diu.h($$5)) {
               $$2.b($$4, $$5.b(dvz.r, Boolean.valueOf(true)));
               $$2.a(null, eag.c, $$4);
            } else if ($$5.b() instanceof dqn) {
               dqn.a($$2, $$4);
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
      dkj.a(cwf.rz, new ld() {
         @Override
         protected cwb a(ky $$0, cwb $$1) {
            this.a(true);
            dfb $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dkj.b));
            if (!cuj.a($$1, $$2, $$3) && !cuj.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dkj.a(dig.ck, new la() {
         @Override
         protected cwb a(ky $$0, cwb $$1) {
            dfb $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dkj.b));
            ckw $$4 = new ckw($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dC(), $$4.dE(), $$4.dI(), awl.zC, awm.e, 1.0F, 1.0F);
            $$2.a(null, eag.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dkj.a(cwf.uo, new ld() {
         @Override
         protected cwb a(ky $$0, cwb $$1) {
            dfb $$2 = $$0.b();
            jm $$3 = $$0.d().c(dkj.b);
            jh $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && drx.b($$2, $$4, $$1)) {
               $$2.a($$4, dig.gG.m().b(dpg.e, Integer.valueOf(dwp.a($$3))), 3);
               $$2.a(null, eag.i, $$4);
               dsm $$5 = $$2.c_($$4);
               if ($$5 instanceof dua) {
                  drx.a($$2, $$4, (dua)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lc.b($$0, $$1));
            }

            return $$1;
         }
      });
      dkj.a(dig.ee, new ld() {
         @Override
         protected cwb a(ky $$0, cwb $$1) {
            dfb $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dkj.b));
            diy $$4 = (diy)dig.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, eag.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lc.b($$0, $$1));
            }

            return $$1;
         }
      });
      dkj.a(dig.kP.j(), new lg());

      for (cuy $$3 : cuy.values()) {
         dkj.a(dpd.a($$3).j(), new lg());
      }

      dkj.a(cwf.sl.j(), new ld() {
         private cwb b(ky $$0, cwb $$1, cwb $$2) {
            $$0.b().a(null, eag.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cwb a(ky $$0, cwb $$1) {
            this.a(false);
            arn $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dkj.b));
            dvj $$4 = $$2.a_($$3);
            if ($$4.a(axa.aH, $$0x -> $$0x.b(dhy.c) && $$0x.b() instanceof dhy) && $$4.c(dhy.c) >= 5) {
               ((dhy)$$4.b()).a($$2, $$4, $$3, null, dsj.b.b);
               this.a(true);
               return this.b($$0, $$1, new cwb(cwf.wF));
            } else if ($$2.b_($$3).a(axg.a)) {
               this.a(true);
               return this.b($$0, $$1, cya.a(cwf.sm, cyb.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dkj.a(cwf.fu, new ld() {
         @Override
         public cwb a(ky $$0, cwb $$1) {
            jm $$2 = $$0.d().c(dkj.b);
            jh $$3 = $$0.c().a($$2);
            dfb $$4 = $$0.b();
            dvj $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dig.pl)) {
               if ($$5.c(dom.d) != 4) {
                  dom.a(null, $$4, $$3, $$5);
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
      dkj.a(cwf.rW.j(), new lf());
      dkj.a(cwf.xx.j(), new ld() {
         @Override
         protected cwb a(ky $$0, cwb $$1) {
            arn $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dkj.b));
            List<cia> $$4 = $$2.a(cia.class, new ezi($$3), buj.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cia $$5 : $$4) {
                  if ($$5.gy()) {
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
      dkj.a(cwf.wC, new ld() {
         @Override
         public cwb a(ky $$0, cwb $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dkj.b));
            dfb $$3 = $$0.b();
            dvj $$4 = $$3.a_($$2);
            Optional<dvj> $$5 = cvs.a($$4);
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
      dkj.a(cwf.sm, new la() {
         private final la c = new la();

         @Override
         public cwb a(ky $$0, cwb $$1) {
            cya $$2 = $$1.a(ku.Q, cya.a);
            if (!$$2.a(cyb.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arn $$3 = $$0.b();
               jh $$4 = $$0.c();
               jh $$5 = $$0.c().a($$0.d().c(dkj.b));
               if (!$$3.a_($$5).a(axa.ck)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lr.am, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awl.cB, awm.e, 1.0F, 1.0F);
                  $$3.a(null, eag.z, $$4);
                  $$3.b($$5, dig.sI.m());
                  return this.a($$0, $$1, new cwb(cwf.sl));
               }
            }
         }
      });
   }
}
