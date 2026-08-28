import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface ky {
   Logger a = LogUtils.getLogger();
   ky b = ($$0, $$1) -> $$1;

   cvl dispense(kv var1, cvl var2);

   static void a() {
      dja.a(cvo.ox);
      dja.a(cvo.vs);
      dja.a(cvo.vr);
      dja.a(cvo.qS);
      dja.a(cvo.qD);
      dja.a(cvo.tX);
      dja.a(cvo.vq);
      dja.a(cvo.vt);
      dja.a(cvo.uw);
      dja.a(cvo.tY);
      dja.a(cvo.tZ);
      kx $$0 = new kx() {
         @Override
         public cvl a(kv $$0, cvl $$1) {
            jj $$2 = $$0.d().c(dja.b);
            btq<?> $$3 = ((cwv)$$1.h()).h($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), btp.o, $$2 != jj.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cvl.k;
            }

            $$1.h(1);
            $$0.b().a(null, dyx.t, $$0.c());
            return $$1;
         }
      };

      for (cwv $$1 : cwv.h()) {
         dja.a($$1, $$0);
      }

      dja.a(cvo.uH, new kx() {
         @Override
         public cvl a(kv $$0, cvl $$1) {
            jj $$2 = $$0.d().c(dja.b);
            je $$3 = $$0.c().a($$2);
            arg $$4 = $$0.b();
            Consumer<cjo> $$5 = btq.a($$1x -> $$1x.v($$2.p()), $$4, $$1, null);
            cjo $$6 = btq.d.a($$4, $$5, $$3, btp.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dja.a(cvo.nL, new kz() {
         @Override
         public cvl a(kv $$0, cvl $$1) {
            je $$2 = $$0.c().a($$0.d().c(dja.b));
            List<buf> $$3 = $$0.b().a(buf.class, new exz($$2), $$0x -> !($$0x instanceof buu $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((buu)$$3.get(0)).a($$1.a(1), awe.e);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      kx $$2 = new kz() {
         @Override
         protected cvl a(kv $$0, cvl $$1) {
            je $$2 = $$0.c().a($$0.d().c(dja.b));

            for (chz $$4 : $$0.b().a(chz.class, new exz($$2), $$0x -> $$0x.bI() && $$0x.e(btr.g))) {
               if ($$4.m($$1) && !$$4.fT() && $$4.gF()) {
                  $$4.n($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dja.a(cvo.uL, $$2);
      dja.a(cvo.uI, $$2);
      dja.a(cvo.uJ, $$2);
      dja.a(cvo.uK, $$2);
      dja.a(cvo.hE, $$2);
      dja.a(cvo.hF, $$2);
      dja.a(cvo.hN, $$2);
      dja.a(cvo.hP, $$2);
      dja.a(cvo.hQ, $$2);
      dja.a(cvo.hT, $$2);
      dja.a(cvo.hL, $$2);
      dja.a(cvo.hR, $$2);
      dja.a(cvo.hH, $$2);
      dja.a(cvo.hM, $$2);
      dja.a(cvo.hJ, $$2);
      dja.a(cvo.hG, $$2);
      dja.a(cvo.hK, $$2);
      dja.a(cvo.hO, $$2);
      dja.a(cvo.hS, $$2);
      dja.a(cvo.hI, $$2);
      dja.a(cvo.eN, new kz() {
         @Override
         public cvl a(kv $$0, cvl $$1) {
            je $$2 = $$0.c().a($$0.d().c(dja.b));

            for (chy $$4 : $$0.b().a(chy.class, new exz($$2), $$0x -> $$0x.bI() && !$$0x.t())) {
               if ($$4.gF() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dja.a(cvo.nV, new kw(cpo.b.a));
      dja.a(cvo.nX, new kw(cpo.b.b));
      dja.a(cvo.nZ, new kw(cpo.b.c));
      dja.a(cvo.ob, new kw(cpo.b.d));
      dja.a(cvo.oh, new kw(cpo.b.g));
      dja.a(cvo.od, new kw(cpo.b.e));
      dja.a(cvo.of, new kw(cpo.b.f));
      dja.a(cvo.oj, new kw(cpo.b.h));
      dja.a(cvo.ol, new kw(cpo.b.i));
      dja.a(cvo.nW, new kw(cpo.b.a, true));
      dja.a(cvo.nY, new kw(cpo.b.b, true));
      dja.a(cvo.oa, new kw(cpo.b.c, true));
      dja.a(cvo.oc, new kw(cpo.b.d, true));
      dja.a(cvo.oi, new kw(cpo.b.g, true));
      dja.a(cvo.oe, new kw(cpo.b.e, true));
      dja.a(cvo.og, new kw(cpo.b.f, true));
      dja.a(cvo.ok, new kw(cpo.b.h, true));
      dja.a(cvo.om, new kw(cpo.b.i, true));
      ky $$3 = new kx() {
         private final kx c = new kx();

         @Override
         public cvl a(kv $$0, cvl $$1) {
            cuc $$2 = (cuc)$$1.h();
            je $$3 = $$0.c().a($$0.d().c(dja.b));
            dds $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cvl(cvo.qz));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dja.a(cvo.qB, $$3);
      dja.a(cvo.qA, $$3);
      dja.a(cvo.qC, $$3);
      dja.a(cvo.qH, $$3);
      dja.a(cvo.qI, $$3);
      dja.a(cvo.qG, $$3);
      dja.a(cvo.qJ, $$3);
      dja.a(cvo.qK, $$3);
      dja.a(cvo.qL, $$3);
      dja.a(cvo.qz, new kx() {
         @Override
         public cvl a(kv $$0, cvl $$1) {
            ddt $$2 = $$0.b();
            je $$3 = $$0.c().a($$0.d().c(dja.b));
            dua $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dhc $$6) {
               cvl $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dyx.y, $$3);
                  cvg $$8 = $$7.h();
                  return this.a($$0, $$1, new cvl($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dja.a(cvo.ot, new kz() {
         @Override
         protected cvl a(kv $$0, cvl $$1) {
            arg $$2 = $$0.b();
            this.a(true);
            jj $$3 = $$0.d().c(dja.b);
            je $$4 = $$0.c().a($$3);
            dua $$5 = $$2.a_($$4);
            if (dgi.a($$2, $$4, $$3)) {
               $$2.b($$4, dgi.a($$2, $$4));
               $$2.a(null, dyx.i, $$4);
            } else if (dhj.i($$5) || dhk.h($$5) || dhl.h($$5)) {
               $$2.b($$4, $$5.b(duq.r, Boolean.valueOf(true)));
               $$2.a(null, dyx.c, $$4);
            } else if ($$5.b() instanceof dpf) {
               dpf.a($$2, $$4);
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
      dja.a(cvo.rz, new kz() {
         @Override
         protected cvl a(kv $$0, cvl $$1) {
            this.a(true);
            dds $$2 = $$0.b();
            je $$3 = $$0.c().a($$0.d().c(dja.b));
            if (!ctn.a($$1, $$2, $$3) && !ctn.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dja.a(dgx.ck, new kx() {
         @Override
         protected cvl a(kv $$0, cvl $$1) {
            dds $$2 = $$0.b();
            je $$3 = $$0.c().a($$0.d().c(dja.b));
            cka $$4 = new cka($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dx(), $$4.dz(), $$4.dD(), awd.zE, awe.e, 1.0F, 1.0F);
            $$2.a(null, dyx.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      ky $$4 = new kz() {
         @Override
         protected cvl a(kv $$0, cvl $$1) {
            this.a(ctc.a($$0, $$1));
            return $$1;
         }
      };
      dja.a(cvo.ur, $$4);
      dja.a(cvo.uq, $$4);
      dja.a(cvo.us, $$4);
      dja.a(cvo.un, $$4);
      dja.a(cvo.ut, $$4);
      dja.a(cvo.up, $$4);
      dja.a(cvo.uo, new kz() {
         @Override
         protected cvl a(kv $$0, cvl $$1) {
            dds $$2 = $$0.b();
            jj $$3 = $$0.d().c(dja.b);
            je $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dqp.b($$2, $$4, $$1)) {
               $$2.a($$4, dgx.gG.o().b(dny.e, Integer.valueOf(dvg.a($$3))), 3);
               $$2.a(null, dyx.i, $$4);
               dre $$5 = $$2.c_($$4);
               if ($$5 instanceof dss) {
                  dqp.a($$2, $$4, (dss)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ctc.a($$0, $$1));
            }

            return $$1;
         }
      });
      dja.a(dgx.ee, new kz() {
         @Override
         protected cvl a(kv $$0, cvl $$1) {
            dds $$2 = $$0.b();
            je $$3 = $$0.c().a($$0.d().c(dja.b));
            dhp $$4 = (dhp)dgx.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dyx.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ctc.a($$0, $$1));
            }

            return $$1;
         }
      });
      dja.a(dgx.kP.r(), new lc());

      for (cue $$5 : cue.values()) {
         dja.a(dnv.a($$5).r(), new lc());
      }

      dja.a(cvo.sm.r(), new kz() {
         private cvl b(kv $$0, cvl $$1, cvl $$2) {
            $$0.b().a(null, dyx.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cvl a(kv $$0, cvl $$1) {
            this.a(false);
            arg $$2 = $$0.b();
            je $$3 = $$0.c().a($$0.d().c(dja.b));
            dua $$4 = $$2.a_($$3);
            if ($$4.a(aws.aH, $$0x -> $$0x.b(dgp.c) && $$0x.b() instanceof dgp) && $$4.c(dgp.c) >= 5) {
               ((dgp)$$4.b()).a($$2, $$4, $$3, null, drb.b.b);
               this.a(true);
               return this.b($$0, $$1, new cvl(cvo.wF));
            } else if ($$2.b_($$3).a(awy.a)) {
               this.a(true);
               return this.b($$0, $$1, cxn.a(cvo.sl, cxo.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dja.a(cvo.fu, new kz() {
         @Override
         public cvl a(kv $$0, cvl $$1) {
            jj $$2 = $$0.d().c(dja.b);
            je $$3 = $$0.c().a($$2);
            dds $$4 = $$0.b();
            dua $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dgx.pl)) {
               if ($$5.c(dne.d) != 4) {
                  dne.a(null, $$4, $$3, $$5);
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
      dja.a(cvo.rW.r(), new lb());
      dja.a(cvo.xx.r(), new kz() {
         @Override
         protected cvl a(kv $$0, cvl $$1) {
            arg $$2 = $$0.b();
            je $$3 = $$0.c().a($$0.d().c(dja.b));
            List<che> $$4 = $$2.a(che.class, new exz($$3), bto.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (che $$5 : $$4) {
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
      dja.a(cvo.wC, new kz() {
         @Override
         public cvl a(kv $$0, cvl $$1) {
            je $$2 = $$0.c().a($$0.d().c(dja.b));
            dds $$3 = $$0.b();
            dua $$4 = $$3.a_($$2);
            Optional<dua> $$5 = cvb.a($$4);
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
      dja.a(cvo.sl, new kx() {
         private final kx c = new kx();

         @Override
         public cvl a(kv $$0, cvl $$1) {
            cxn $$2 = $$1.a(kr.I, cxn.a);
            if (!$$2.a(cxo.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arg $$3 = $$0.b();
               je $$4 = $$0.c();
               je $$5 = $$0.c().a($$0.d().c(dja.b));
               if (!$$3.a_($$5).a(aws.cj)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(ln.am, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awd.cB, awe.e, 1.0F, 1.0F);
                  $$3.a(null, dyx.z, $$4);
                  $$3.b($$5, dgx.sI.o());
                  return this.a($$0, $$1, new cvl(cvo.sm));
               }
            }
         }
      });
   }
}
