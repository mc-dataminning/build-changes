import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface kz {
   Logger a = LogUtils.getLogger();
   kz b = ($$0, $$1) -> $$1;

   cvs dispense(kw var1, cvs var2);

   static void a() {
      djr.a(cvw.ox);
      djr.a(cvw.vs);
      djr.a(cvw.vr);
      djr.a(cvw.qS);
      djr.a(cvw.qD);
      djr.a(cvw.tX);
      djr.a(cvw.vq);
      djr.a(cvw.vt);
      djr.a(cvw.uw);
      djr.a(cvw.tY);
      djr.a(cvw.tZ);
      ky $$0 = new ky() {
         @Override
         public cvs a(kw $$0, cvs $$1) {
            jk $$2 = $$0.d().c(djr.b);
            bty<?> $$3 = ((cxb)$$1.h()).g($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), btx.o, $$2 != jk.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cvs.k;
            }

            $$1.h(1);
            $$0.b().a(null, dzp.t, $$0.c());
            return $$1;
         }
      };

      for (cxb $$1 : cxb.c()) {
         djr.a($$1, $$0);
      }

      djr.a(cvw.uH, new ky() {
         @Override
         public cvs a(kw $$0, cvs $$1) {
            jk $$2 = $$0.d().c(djr.b);
            jf $$3 = $$0.c().a($$2);
            arj $$4 = $$0.b();
            Consumer<cjw> $$5 = bty.a($$1x -> $$1x.v($$2.p()), $$4, $$1, null);
            cjw $$6 = bty.d.a($$4, $$5, $$3, btx.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      djr.a(cvw.nL, new la() {
         @Override
         public cvs a(kw $$0, cvs $$1) {
            jf $$2 = $$0.c().a($$0.d().c(djr.b));
            List<bun> $$3 = $$0.b().a(bun.class, new eyr($$2), $$0x -> !($$0x instanceof bvc $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bvc)$$3.get(0)).a($$1.a(1), awh.e);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      ky $$2 = new la() {
         @Override
         protected cvs a(kw $$0, cvs $$1) {
            jf $$2 = $$0.c().a($$0.d().c(djr.b));

            for (cih $$4 : $$0.b().a(cih.class, new eyr($$2), $$0x -> $$0x.bI() && $$0x.e(btz.g))) {
               if ($$4.k($$1) && !$$4.fU() && $$4.gF()) {
                  $$4.l($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      djr.a(cvw.uL, $$2);
      djr.a(cvw.uI, $$2);
      djr.a(cvw.uJ, $$2);
      djr.a(cvw.uK, $$2);
      djr.a(cvw.hE, $$2);
      djr.a(cvw.hF, $$2);
      djr.a(cvw.hN, $$2);
      djr.a(cvw.hP, $$2);
      djr.a(cvw.hQ, $$2);
      djr.a(cvw.hT, $$2);
      djr.a(cvw.hL, $$2);
      djr.a(cvw.hR, $$2);
      djr.a(cvw.hH, $$2);
      djr.a(cvw.hM, $$2);
      djr.a(cvw.hJ, $$2);
      djr.a(cvw.hG, $$2);
      djr.a(cvw.hK, $$2);
      djr.a(cvw.hO, $$2);
      djr.a(cvw.hS, $$2);
      djr.a(cvw.hI, $$2);
      djr.a(cvw.eN, new la() {
         @Override
         public cvs a(kw $$0, cvs $$1) {
            jf $$2 = $$0.c().a($$0.d().c(djr.b));

            for (cig $$4 : $$0.b().a(cig.class, new eyr($$2), $$0x -> $$0x.bI() && !$$0x.t())) {
               if ($$4.gF() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      djr.a(cvw.nV, new kx(cpx.b.a));
      djr.a(cvw.nX, new kx(cpx.b.b));
      djr.a(cvw.nZ, new kx(cpx.b.c));
      djr.a(cvw.ob, new kx(cpx.b.d));
      djr.a(cvw.oh, new kx(cpx.b.g));
      djr.a(cvw.od, new kx(cpx.b.e));
      djr.a(cvw.of, new kx(cpx.b.f));
      djr.a(cvw.oj, new kx(cpx.b.h));
      djr.a(cvw.ol, new kx(cpx.b.i));
      djr.a(cvw.nW, new kx(cpx.b.a, true));
      djr.a(cvw.nY, new kx(cpx.b.b, true));
      djr.a(cvw.oa, new kx(cpx.b.c, true));
      djr.a(cvw.oc, new kx(cpx.b.d, true));
      djr.a(cvw.oi, new kx(cpx.b.g, true));
      djr.a(cvw.oe, new kx(cpx.b.e, true));
      djr.a(cvw.og, new kx(cpx.b.f, true));
      djr.a(cvw.ok, new kx(cpx.b.h, true));
      djr.a(cvw.om, new kx(cpx.b.i, true));
      kz $$3 = new ky() {
         private final ky c = new ky();

         @Override
         public cvs a(kw $$0, cvs $$1) {
            cuk $$2 = (cuk)$$1.h();
            jf $$3 = $$0.c().a($$0.d().c(djr.b));
            dej $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cvs(cvw.qz));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      djr.a(cvw.qB, $$3);
      djr.a(cvw.qA, $$3);
      djr.a(cvw.qC, $$3);
      djr.a(cvw.qH, $$3);
      djr.a(cvw.qI, $$3);
      djr.a(cvw.qG, $$3);
      djr.a(cvw.qJ, $$3);
      djr.a(cvw.qK, $$3);
      djr.a(cvw.qL, $$3);
      djr.a(cvw.qz, new ky() {
         @Override
         public cvs a(kw $$0, cvs $$1) {
            dek $$2 = $$0.b();
            jf $$3 = $$0.c().a($$0.d().c(djr.b));
            dus $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dht $$6) {
               cvs $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dzp.y, $$3);
                  cvn $$8 = $$7.h();
                  return this.a($$0, $$1, new cvs($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      djr.a(cvw.ot, new la() {
         @Override
         protected cvs a(kw $$0, cvs $$1) {
            arj $$2 = $$0.b();
            this.a(true);
            jk $$3 = $$0.d().c(djr.b);
            jf $$4 = $$0.c().a($$3);
            dus $$5 = $$2.a_($$4);
            if (dgz.a($$2, $$4, $$3)) {
               $$2.b($$4, dgz.a($$2, $$4));
               $$2.a(null, dzp.i, $$4);
            } else if (dia.i($$5) || dib.h($$5) || dic.h($$5)) {
               $$2.b($$4, $$5.b(dvi.r, Boolean.valueOf(true)));
               $$2.a(null, dzp.c, $$4);
            } else if ($$5.b() instanceof dpw) {
               dpw.a($$2, $$4);
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
      djr.a(cvw.rz, new la() {
         @Override
         protected cvs a(kw $$0, cvs $$1) {
            this.a(true);
            dej $$2 = $$0.b();
            jf $$3 = $$0.c().a($$0.d().c(djr.b));
            if (!ctw.a($$1, $$2, $$3) && !ctw.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      djr.a(dho.ck, new ky() {
         @Override
         protected cvs a(kw $$0, cvs $$1) {
            dej $$2 = $$0.b();
            jf $$3 = $$0.c().a($$0.d().c(djr.b));
            cki $$4 = new cki($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dx(), $$4.dz(), $$4.dD(), awg.zE, awh.e, 1.0F, 1.0F);
            $$2.a(null, dzp.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      kz $$4 = new la() {
         @Override
         protected cvs a(kw $$0, cvs $$1) {
            this.a(ctl.a($$0, $$1));
            return $$1;
         }
      };
      djr.a(cvw.ur, $$4);
      djr.a(cvw.uq, $$4);
      djr.a(cvw.us, $$4);
      djr.a(cvw.un, $$4);
      djr.a(cvw.ut, $$4);
      djr.a(cvw.up, $$4);
      djr.a(cvw.uo, new la() {
         @Override
         protected cvs a(kw $$0, cvs $$1) {
            dej $$2 = $$0.b();
            jk $$3 = $$0.d().c(djr.b);
            jf $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && drg.b($$2, $$4, $$1)) {
               $$2.a($$4, dho.gG.n().b(dop.e, Integer.valueOf(dvy.a($$3))), 3);
               $$2.a(null, dzp.i, $$4);
               drv $$5 = $$2.c_($$4);
               if ($$5 instanceof dtj) {
                  drg.a($$2, $$4, (dtj)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ctl.a($$0, $$1));
            }

            return $$1;
         }
      });
      djr.a(dho.ee, new la() {
         @Override
         protected cvs a(kw $$0, cvs $$1) {
            dej $$2 = $$0.b();
            jf $$3 = $$0.c().a($$0.d().c(djr.b));
            dig $$4 = (dig)dho.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.n(), 3);
                  $$2.a(null, dzp.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ctl.a($$0, $$1));
            }

            return $$1;
         }
      });
      djr.a(dho.kP.q(), new ld());

      for (cum $$5 : cum.values()) {
         djr.a(dom.a($$5).q(), new ld());
      }

      djr.a(cvw.sl.q(), new la() {
         private cvs b(kw $$0, cvs $$1, cvs $$2) {
            $$0.b().a(null, dzp.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cvs a(kw $$0, cvs $$1) {
            this.a(false);
            arj $$2 = $$0.b();
            jf $$3 = $$0.c().a($$0.d().c(djr.b));
            dus $$4 = $$2.a_($$3);
            if ($$4.a(awv.aH, $$0x -> $$0x.b(dhg.c) && $$0x.b() instanceof dhg) && $$4.c(dhg.c) >= 5) {
               ((dhg)$$4.b()).a($$2, $$4, $$3, null, drs.b.b);
               this.a(true);
               return this.b($$0, $$1, new cvs(cvw.wF));
            } else if ($$2.b_($$3).a(axb.a)) {
               this.a(true);
               return this.b($$0, $$1, cxr.a(cvw.sm, cxs.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      djr.a(cvw.fu, new la() {
         @Override
         public cvs a(kw $$0, cvs $$1) {
            jk $$2 = $$0.d().c(djr.b);
            jf $$3 = $$0.c().a($$2);
            dej $$4 = $$0.b();
            dus $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dho.pl)) {
               if ($$5.c(dnv.d) != 4) {
                  dnv.a(null, $$4, $$3, $$5);
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
      djr.a(cvw.rW.q(), new lc());
      djr.a(cvw.xx.q(), new la() {
         @Override
         protected cvs a(kw $$0, cvs $$1) {
            arj $$2 = $$0.b();
            jf $$3 = $$0.c().a($$0.d().c(djr.b));
            List<chm> $$4 = $$2.a(chm.class, new eyr($$3), btw.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (chm $$5 : $$4) {
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
      djr.a(cvw.wC, new la() {
         @Override
         public cvs a(kw $$0, cvs $$1) {
            jf $$2 = $$0.c().a($$0.d().c(djr.b));
            dej $$3 = $$0.b();
            dus $$4 = $$3.a_($$2);
            Optional<dus> $$5 = cvi.a($$4);
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
      djr.a(cvw.sm, new ky() {
         private final ky c = new ky();

         @Override
         public cvs a(kw $$0, cvs $$1) {
            cxr $$2 = $$1.a(ks.L, cxr.a);
            if (!$$2.a(cxs.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arj $$3 = $$0.b();
               jf $$4 = $$0.c();
               jf $$5 = $$0.c().a($$0.d().c(djr.b));
               if (!$$3.a_($$5).a(awv.cj)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lo.am, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awg.cB, awh.e, 1.0F, 1.0F);
                  $$3.a(null, dzp.z, $$4);
                  $$3.b($$5, dho.sI.n());
                  return this.a($$0, $$1, new cvs(cvw.sl));
               }
            }
         }
      });
   }
}
