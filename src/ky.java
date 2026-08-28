import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface ky {
   Logger a = LogUtils.getLogger();
   ky b = ($$0, $$1) -> $$1;

   cvp dispense(kv var1, cvp var2);

   static void a() {
      djo.a(cvt.ox);
      djo.a(cvt.vs);
      djo.a(cvt.vr);
      djo.a(cvt.qS);
      djo.a(cvt.qD);
      djo.a(cvt.tX);
      djo.a(cvt.vq);
      djo.a(cvt.vt);
      djo.a(cvt.uw);
      djo.a(cvt.tY);
      djo.a(cvt.tZ);
      kx $$0 = new kx() {
         @Override
         public cvp a(kv $$0, cvp $$1) {
            jj $$2 = $$0.d().c(djo.b);
            btv<?> $$3 = ((cwy)$$1.h()).g($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), btu.o, $$2 != jj.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cvp.k;
            }

            $$1.h(1);
            $$0.b().a(null, dzl.t, $$0.c());
            return $$1;
         }
      };

      for (cwy $$1 : cwy.c()) {
         djo.a($$1, $$0);
      }

      djo.a(cvt.uH, new kx() {
         @Override
         public cvp a(kv $$0, cvp $$1) {
            jj $$2 = $$0.d().c(djo.b);
            je $$3 = $$0.c().a($$2);
            arh $$4 = $$0.b();
            Consumer<cjt> $$5 = btv.a($$1x -> $$1x.v($$2.p()), $$4, $$1, null);
            cjt $$6 = btv.d.a($$4, $$5, $$3, btu.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      djo.a(cvt.nL, new kz() {
         @Override
         public cvp a(kv $$0, cvp $$1) {
            je $$2 = $$0.c().a($$0.d().c(djo.b));
            List<buk> $$3 = $$0.b().a(buk.class, new eyn($$2), $$0x -> !($$0x instanceof buz $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((buz)$$3.get(0)).a($$1.a(1), awf.e);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      kx $$2 = new kz() {
         @Override
         protected cvp a(kv $$0, cvp $$1) {
            je $$2 = $$0.c().a($$0.d().c(djo.b));

            for (cie $$4 : $$0.b().a(cie.class, new eyn($$2), $$0x -> $$0x.bI() && $$0x.e(btw.g))) {
               if ($$4.k($$1) && !$$4.fU() && $$4.gG()) {
                  $$4.l($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      djo.a(cvt.uL, $$2);
      djo.a(cvt.uI, $$2);
      djo.a(cvt.uJ, $$2);
      djo.a(cvt.uK, $$2);
      djo.a(cvt.hE, $$2);
      djo.a(cvt.hF, $$2);
      djo.a(cvt.hN, $$2);
      djo.a(cvt.hP, $$2);
      djo.a(cvt.hQ, $$2);
      djo.a(cvt.hT, $$2);
      djo.a(cvt.hL, $$2);
      djo.a(cvt.hR, $$2);
      djo.a(cvt.hH, $$2);
      djo.a(cvt.hM, $$2);
      djo.a(cvt.hJ, $$2);
      djo.a(cvt.hG, $$2);
      djo.a(cvt.hK, $$2);
      djo.a(cvt.hO, $$2);
      djo.a(cvt.hS, $$2);
      djo.a(cvt.hI, $$2);
      djo.a(cvt.eN, new kz() {
         @Override
         public cvp a(kv $$0, cvp $$1) {
            je $$2 = $$0.c().a($$0.d().c(djo.b));

            for (cid $$4 : $$0.b().a(cid.class, new eyn($$2), $$0x -> $$0x.bI() && !$$0x.t())) {
               if ($$4.gG() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      djo.a(cvt.nV, new kw(cpu.b.a));
      djo.a(cvt.nX, new kw(cpu.b.b));
      djo.a(cvt.nZ, new kw(cpu.b.c));
      djo.a(cvt.ob, new kw(cpu.b.d));
      djo.a(cvt.oh, new kw(cpu.b.g));
      djo.a(cvt.od, new kw(cpu.b.e));
      djo.a(cvt.of, new kw(cpu.b.f));
      djo.a(cvt.oj, new kw(cpu.b.h));
      djo.a(cvt.ol, new kw(cpu.b.i));
      djo.a(cvt.nW, new kw(cpu.b.a, true));
      djo.a(cvt.nY, new kw(cpu.b.b, true));
      djo.a(cvt.oa, new kw(cpu.b.c, true));
      djo.a(cvt.oc, new kw(cpu.b.d, true));
      djo.a(cvt.oi, new kw(cpu.b.g, true));
      djo.a(cvt.oe, new kw(cpu.b.e, true));
      djo.a(cvt.og, new kw(cpu.b.f, true));
      djo.a(cvt.ok, new kw(cpu.b.h, true));
      djo.a(cvt.om, new kw(cpu.b.i, true));
      ky $$3 = new kx() {
         private final kx c = new kx();

         @Override
         public cvp a(kv $$0, cvp $$1) {
            cuh $$2 = (cuh)$$1.h();
            je $$3 = $$0.c().a($$0.d().c(djo.b));
            deg $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cvp(cvt.qz));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      djo.a(cvt.qB, $$3);
      djo.a(cvt.qA, $$3);
      djo.a(cvt.qC, $$3);
      djo.a(cvt.qH, $$3);
      djo.a(cvt.qI, $$3);
      djo.a(cvt.qG, $$3);
      djo.a(cvt.qJ, $$3);
      djo.a(cvt.qK, $$3);
      djo.a(cvt.qL, $$3);
      djo.a(cvt.qz, new kx() {
         @Override
         public cvp a(kv $$0, cvp $$1) {
            deh $$2 = $$0.b();
            je $$3 = $$0.c().a($$0.d().c(djo.b));
            duo $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dhq $$6) {
               cvp $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dzl.y, $$3);
                  cvk $$8 = $$7.h();
                  return this.a($$0, $$1, new cvp($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      djo.a(cvt.ot, new kz() {
         @Override
         protected cvp a(kv $$0, cvp $$1) {
            arh $$2 = $$0.b();
            this.a(true);
            jj $$3 = $$0.d().c(djo.b);
            je $$4 = $$0.c().a($$3);
            duo $$5 = $$2.a_($$4);
            if (dgw.a($$2, $$4, $$3)) {
               $$2.b($$4, dgw.a($$2, $$4));
               $$2.a(null, dzl.i, $$4);
            } else if (dhx.i($$5) || dhy.h($$5) || dhz.h($$5)) {
               $$2.b($$4, $$5.b(dve.r, Boolean.valueOf(true)));
               $$2.a(null, dzl.c, $$4);
            } else if ($$5.b() instanceof dpt) {
               dpt.a($$2, $$4);
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
      djo.a(cvt.rz, new kz() {
         @Override
         protected cvp a(kv $$0, cvp $$1) {
            this.a(true);
            deg $$2 = $$0.b();
            je $$3 = $$0.c().a($$0.d().c(djo.b));
            if (!ctt.a($$1, $$2, $$3) && !ctt.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      djo.a(dhl.ck, new kx() {
         @Override
         protected cvp a(kv $$0, cvp $$1) {
            deg $$2 = $$0.b();
            je $$3 = $$0.c().a($$0.d().c(djo.b));
            ckf $$4 = new ckf($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dx(), $$4.dz(), $$4.dD(), awe.zE, awf.e, 1.0F, 1.0F);
            $$2.a(null, dzl.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      ky $$4 = new kz() {
         @Override
         protected cvp a(kv $$0, cvp $$1) {
            this.a(cti.a($$0, $$1));
            return $$1;
         }
      };
      djo.a(cvt.ur, $$4);
      djo.a(cvt.uq, $$4);
      djo.a(cvt.us, $$4);
      djo.a(cvt.un, $$4);
      djo.a(cvt.ut, $$4);
      djo.a(cvt.up, $$4);
      djo.a(cvt.uo, new kz() {
         @Override
         protected cvp a(kv $$0, cvp $$1) {
            deg $$2 = $$0.b();
            jj $$3 = $$0.d().c(djo.b);
            je $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && drd.b($$2, $$4, $$1)) {
               $$2.a($$4, dhl.gG.o().b(dom.e, Integer.valueOf(dvu.a($$3))), 3);
               $$2.a(null, dzl.i, $$4);
               drs $$5 = $$2.c_($$4);
               if ($$5 instanceof dtg) {
                  drd.a($$2, $$4, (dtg)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cti.a($$0, $$1));
            }

            return $$1;
         }
      });
      djo.a(dhl.ee, new kz() {
         @Override
         protected cvp a(kv $$0, cvp $$1) {
            deg $$2 = $$0.b();
            je $$3 = $$0.c().a($$0.d().c(djo.b));
            did $$4 = (did)dhl.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dzl.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cti.a($$0, $$1));
            }

            return $$1;
         }
      });
      djo.a(dhl.kP.q(), new lc());

      for (cuj $$5 : cuj.values()) {
         djo.a(doj.a($$5).q(), new lc());
      }

      djo.a(cvt.sl.q(), new kz() {
         private cvp b(kv $$0, cvp $$1, cvp $$2) {
            $$0.b().a(null, dzl.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cvp a(kv $$0, cvp $$1) {
            this.a(false);
            arh $$2 = $$0.b();
            je $$3 = $$0.c().a($$0.d().c(djo.b));
            duo $$4 = $$2.a_($$3);
            if ($$4.a(awt.aH, $$0x -> $$0x.b(dhd.c) && $$0x.b() instanceof dhd) && $$4.c(dhd.c) >= 5) {
               ((dhd)$$4.b()).a($$2, $$4, $$3, null, drp.b.b);
               this.a(true);
               return this.b($$0, $$1, new cvp(cvt.wF));
            } else if ($$2.b_($$3).a(awz.a)) {
               this.a(true);
               return this.b($$0, $$1, cxo.a(cvt.sm, cxp.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      djo.a(cvt.fu, new kz() {
         @Override
         public cvp a(kv $$0, cvp $$1) {
            jj $$2 = $$0.d().c(djo.b);
            je $$3 = $$0.c().a($$2);
            deg $$4 = $$0.b();
            duo $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dhl.pl)) {
               if ($$5.c(dns.d) != 4) {
                  dns.a(null, $$4, $$3, $$5);
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
      djo.a(cvt.rW.q(), new lb());
      djo.a(cvt.xx.q(), new kz() {
         @Override
         protected cvp a(kv $$0, cvp $$1) {
            arh $$2 = $$0.b();
            je $$3 = $$0.c().a($$0.d().c(djo.b));
            List<chj> $$4 = $$2.a(chj.class, new eyn($$3), btt.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (chj $$5 : $$4) {
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
      djo.a(cvt.wC, new kz() {
         @Override
         public cvp a(kv $$0, cvp $$1) {
            je $$2 = $$0.c().a($$0.d().c(djo.b));
            deg $$3 = $$0.b();
            duo $$4 = $$3.a_($$2);
            Optional<duo> $$5 = cvf.a($$4);
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
      djo.a(cvt.sm, new kx() {
         private final kx c = new kx();

         @Override
         public cvp a(kv $$0, cvp $$1) {
            cxo $$2 = $$1.a(kr.L, cxo.a);
            if (!$$2.a(cxp.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arh $$3 = $$0.b();
               je $$4 = $$0.c();
               je $$5 = $$0.c().a($$0.d().c(djo.b));
               if (!$$3.a_($$5).a(awt.cj)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(ln.am, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awe.cB, awf.e, 1.0F, 1.0F);
                  $$3.a(null, dzl.z, $$4);
                  $$3.b($$5, dhl.sI.o());
                  return this.a($$0, $$1, new cvp(cvt.sl));
               }
            }
         }
      });
   }
}
