import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface jh {
   Logger a = LogUtils.getLogger();
   jh b = ($$0, $$1) -> $$1;

   cmh dispense(je var1, cmh var2);

   static void c() {
      cye.a(cmk.os, new jd() {
         @Override
         protected cfj a(csy $$0, ip $$1, cmh $$2) {
            cez $$3 = new cez($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cex.a.b;
            return $$3;
         }
      });
      cye.a(cmk.vj, new jd() {
         @Override
         protected cfj a(csy $$0, ip $$1, cmh $$2) {
            cez $$3 = new cez($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.a($$2);
            $$3.d = cex.a.b;
            return $$3;
         }
      });
      cye.a(cmk.vi, new jd() {
         @Override
         protected cfj a(csy $$0, ip $$1, cmh $$2) {
            cex $$3 = new cfo($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cex.a.b;
            return $$3;
         }
      });
      cye.a(cmk.qO, new jd() {
         @Override
         protected cfj a(csy $$0, ip $$1, cmh $$2) {
            return ac.a(new cfr($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cye.a(cmk.qz, new jd() {
         @Override
         protected cfj a(csy $$0, ip $$1, cmh $$2) {
            return ac.a(new cfn($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cye.a(cmk.tR, new jd() {
         @Override
         protected cfj a(csy $$0, ip $$1, cmh $$2) {
            return ac.a(new cft($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }

         @Override
         protected float a() {
            return super.a() * 0.5F;
         }

         @Override
         protected float b() {
            return super.b() * 1.25F;
         }
      });
      cye.a(cmk.vh, new jh() {
         @Override
         public cmh dispense(je $$0, cmh $$1) {
            return (new jd() {
               @Override
               protected cfj a(csy $$0, ip $$1, cmh $$2) {
                  return ac.a(new cfu($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
               }

               @Override
               protected float a() {
                  return super.a() * 0.5F;
               }

               @Override
               protected float b() {
                  return super.b() * 1.25F;
               }
            }).dispense($$0, $$1);
         }
      });
      cye.a(cmk.vk, new jh() {
         @Override
         public cmh dispense(je $$0, cmh $$1) {
            return (new jd() {
               @Override
               protected cfj a(csy $$0, ip $$1, cmh $$2) {
                  return ac.a(new cfu($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
               }

               @Override
               protected float a() {
                  return super.a() * 0.5F;
               }

               @Override
               protected float b() {
                  return super.b() * 1.25F;
               }
            }).dispense($$0, $$1);
         }
      });
      jg $$0 = new jg() {
         @Override
         public cmh a(je $$0, cmh $$1) {
            ia $$2 = $$0.d().c(cye.b);
            blj<?> $$3 = ((cnm)$$1.d()).a($$1.v());

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), blz.o, $$2 != ia.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cmh.f;
            }

            $$1.h(1);
            $$0.b().a(null, dmz.t, $$0.c());
            return $$1;
         }
      };

      for (cnm $$1 : cnm.h()) {
         cye.a($$1, $$0);
      }

      cye.a(cmk.uy, new jg() {
         @Override
         public cmh a(je $$0, cmh $$1) {
            ia $$2 = $$0.d().c(cye.b);
            hv $$3 = $$0.c().a($$2);
            amp $$4 = $$0.b();
            Consumer<cau> $$5 = blj.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            cau $$6 = blj.d.a($$4, $$1.v(), $$5, $$3, blz.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      cye.a(cmk.nK, new ji() {
         @Override
         public cmh a(je $$0, cmh $$1) {
            hv $$2 = $$0.c().a($$0.d().c(cye.b));
            List<blv> $$3 = $$0.b().a(blv.class, new ekw($$2), $$0x -> !($$0x instanceof bml $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((bml)$$3.get(0)).a(ard.e);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      jg $$2 = new ji() {
         @Override
         protected cmh a(je $$0, cmh $$1) {
            hv $$2 = $$0.c().a($$0.d().c(cye.b));

            for (bzh $$4 : $$0.b().a(bzh.class, new ekw($$2), $$0x -> $$0x.bx() && $$0x.gN())) {
               if ($$4.l($$1) && !$$4.gO() && $$4.gt()) {
                  $$4.a_(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      cye.a(cmk.uC, $$2);
      cye.a(cmk.uz, $$2);
      cye.a(cmk.uA, $$2);
      cye.a(cmk.uB, $$2);
      cye.a(cmk.hD, $$2);
      cye.a(cmk.hE, $$2);
      cye.a(cmk.hM, $$2);
      cye.a(cmk.hO, $$2);
      cye.a(cmk.hP, $$2);
      cye.a(cmk.hS, $$2);
      cye.a(cmk.hK, $$2);
      cye.a(cmk.hQ, $$2);
      cye.a(cmk.hG, $$2);
      cye.a(cmk.hL, $$2);
      cye.a(cmk.hI, $$2);
      cye.a(cmk.hF, $$2);
      cye.a(cmk.hJ, $$2);
      cye.a(cmk.hN, $$2);
      cye.a(cmk.hR, $$2);
      cye.a(cmk.hH, $$2);
      cye.a(cmk.eM, new ji() {
         @Override
         public cmh a(je $$0, cmh $$1) {
            hv $$2 = $$0.c().a($$0.d().c(cye.b));

            for (bzg $$4 : $$0.b().a(bzg.class, new ekw($$2), $$0x -> $$0x.bx() && !$$0x.w())) {
               if ($$4.gt() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      cye.a(cmk.un, new jg() {
         @Override
         public cmh a(je $$0, cmh $$1) {
            ia $$2 = $$0.d().c(cye.b);
            elb $$3 = jh.a($$0, blj.N, $$2);
            cfe $$4 = new cfe($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
            $$4.c((double)$$2.j(), (double)$$2.k(), (double)$$2.l(), 0.5F, 1.0F);
            $$0.b().b($$4);
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(je $$0) {
            $$0.b().c(1004, $$0.c(), 0);
         }
      });
      cye.a(cmk.tS, new jg() {
         @Override
         public cmh a(je $$0, cmh $$1) {
            ia $$2 = $$0.d().c(cye.b);
            ip $$3 = cye.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            csy $$7 = $$0.b();
            auf $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            cfm $$12 = new cfm($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(je $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      cye.a(cmk.nT, new jf(cgl.b.a));
      cye.a(cmk.nV, new jf(cgl.b.b));
      cye.a(cmk.nX, new jf(cgl.b.c));
      cye.a(cmk.nZ, new jf(cgl.b.d));
      cye.a(cmk.of, new jf(cgl.b.g));
      cye.a(cmk.ob, new jf(cgl.b.e));
      cye.a(cmk.od, new jf(cgl.b.f));
      cye.a(cmk.oh, new jf(cgl.b.h));
      cye.a(cmk.oj, new jf(cgl.b.i));
      cye.a(cmk.nU, new jf(cgl.b.a, true));
      cye.a(cmk.nW, new jf(cgl.b.b, true));
      cye.a(cmk.nY, new jf(cgl.b.c, true));
      cye.a(cmk.oa, new jf(cgl.b.d, true));
      cye.a(cmk.og, new jf(cgl.b.g, true));
      cye.a(cmk.oc, new jf(cgl.b.e, true));
      cye.a(cmk.oe, new jf(cgl.b.f, true));
      cye.a(cmk.oi, new jf(cgl.b.h, true));
      cye.a(cmk.ok, new jf(cgl.b.i, true));
      jh $$3 = new jg() {
         private final jg c = new jg();

         @Override
         public cmh a(je $$0, cmh $$1) {
            ckt $$2 = (ckt)$$1.d();
            hv $$3 = $$0.c().a($$0.d().c(cye.b));
            csy $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cmh(cmk.qv);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      cye.a(cmk.qx, $$3);
      cye.a(cmk.qw, $$3);
      cye.a(cmk.qy, $$3);
      cye.a(cmk.qD, $$3);
      cye.a(cmk.qE, $$3);
      cye.a(cmk.qC, $$3);
      cye.a(cmk.qF, $$3);
      cye.a(cmk.qG, $$3);
      cye.a(cmk.qH, $$3);
      cye.a(cmk.qv, new jg() {
         private final jg c = new jg();

         @Override
         public cmh a(je $$0, cmh $$1) {
            csz $$2 = $$0.b();
            hv $$3 = $$0.c().a($$0.d().c(cye.b));
            dip $$4 = $$2.a_($$3);
            if ($$4.b() instanceof cwg $$6) {
               cmh $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dmz.y, $$3);
                  cmc $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new cmh($$8);
                  } else {
                     if ($$0.e().a(new cmh($$8)) < 0) {
                        this.c.dispense($$0, new cmh($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cye.a(cmk.op, new ji() {
         @Override
         protected cmh a(je $$0, cmh $$1) {
            csy $$2 = $$0.b();
            this.a(true);
            ia $$3 = $$0.d().c(cye.b);
            hv $$4 = $$0.c().a($$3);
            dip $$5 = $$2.a_($$4);
            if (cvm.a($$2, $$4, $$3)) {
               $$2.b($$4, cvm.a($$2, $$4));
               $$2.a(null, dmz.i, $$4);
            } else if (cwn.h($$5) || cwo.g($$5) || cwp.g($$5)) {
               $$2.b($$4, $$5.a(djf.r, Boolean.valueOf(true)));
               $$2.a(null, dmz.c, $$4);
            } else if ($$5.b() instanceof deh) {
               deh.a($$2, $$4);
               $$2.a($$4, false);
            } else {
               this.a(false);
            }

            if (this.a() && $$1.a(1, $$2.z, null)) {
               $$1.f(0);
            }

            return $$1;
         }
      });
      cye.a(cmk.rv, new ji() {
         @Override
         protected cmh a(je $$0, cmh $$1) {
            this.a(true);
            csy $$2 = $$0.b();
            hv $$3 = $$0.c().a($$0.d().c(cye.b));
            if (!ckc.a($$1, $$2, $$3) && !ckc.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 0);
            }

            return $$1;
         }
      });
      cye.a(cwb.ck, new jg() {
         @Override
         protected cmh a(je $$0, cmh $$1) {
            csy $$2 = $$0.b();
            hv $$3 = $$0.c().a($$0.d().c(cye.b));
            cbf $$4 = new cbf($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dr(), $$4.dt(), $$4.dx(), arc.yB, ard.e, 1.0F, 1.0F);
            $$2.a(null, dmz.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      jh $$4 = new ji() {
         @Override
         protected cmh a(je $$0, cmh $$1) {
            this.a(cjr.a($$0, $$1));
            return $$1;
         }
      };
      cye.a(cmk.ui, $$4);
      cye.a(cmk.uh, $$4);
      cye.a(cmk.uj, $$4);
      cye.a(cmk.ue, $$4);
      cye.a(cmk.uk, $$4);
      cye.a(cmk.ug, $$4);
      cye.a(cmk.uf, new ji() {
         @Override
         protected cmh a(je $$0, cmh $$1) {
            csy $$2 = $$0.b();
            ia $$3 = $$0.d().c(cye.b);
            hv $$4 = $$0.c().a($$3);
            if ($$2.t($$4) && dfp.b($$2, $$4, $$1)) {
               $$2.a($$4, cwb.gG.o().a(dda.e, Integer.valueOf(djv.a($$3))), 3);
               $$2.a(null, dmz.i, $$4);
               dgd $$5 = $$2.c_($$4);
               if ($$5 instanceof dho) {
                  dfp.a($$2, $$4, (dho)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cjr.a($$0, $$1));
            }

            return $$1;
         }
      });
      cye.a(cwb.ee, new ji() {
         @Override
         protected cmh a(je $$0, cmh $$1) {
            csy $$2 = $$0.b();
            hv $$3 = $$0.c().a($$0.d().c(cye.b));
            cwt $$4 = (cwt)cwb.ee;
            if ($$2.t($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dmz.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cjr.a($$0, $$1));
            }

            return $$1;
         }
      });
      cye.a(cwb.kP.k(), new jk());

      for (ckv $$5 : ckv.values()) {
         cye.a(dcx.a($$5).k(), new jk());
      }

      cye.a(cmk.si.k(), new ji() {
         private final jg c = new jg();

         private cmh a(je $$0, cmh $$1, cmh $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.b().a(null, dmz.y, $$0.c());
               return $$2.p();
            } else {
               if ($$0.e().a($$2.p()) < 0) {
                  this.c.dispense($$0, $$2.p());
               }

               return $$1;
            }
         }

         @Override
         public cmh a(je $$0, cmh $$1) {
            this.a(false);
            amp $$2 = $$0.b();
            hv $$3 = $$0.c().a($$0.d().c(cye.b));
            dip $$4 = $$2.a_($$3);
            if ($$4.a(arr.aF, $$0x -> $$0x.b(cvt.c) && $$0x.b() instanceof cvt) && $$4.c(cvt.c) >= 5) {
               ((cvt)$$4.b()).a($$2, $$4, $$3, null, dga.b.b);
               this.a(true);
               return this.a($$0, $$1, new cmh(cmk.wq));
            } else if ($$2.b_($$3).a(arw.a)) {
               this.a(true);
               return this.a($$0, $$1, cog.a(new cmh(cmk.sh), coh.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cye.a(cmk.ft, new ji() {
         @Override
         public cmh a(je $$0, cmh $$1) {
            ia $$2 = $$0.d().c(cye.b);
            hv $$3 = $$0.c().a($$2);
            csy $$4 = $$0.b();
            dip $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(cwb.pl)) {
               if ($$5.c(dcg.d) != 4) {
                  dcg.a(null, $$4, $$3, $$5);
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
      cye.a(cmk.rS.k(), new jj());
      cye.a(cmk.wn, new ji() {
         @Override
         public cmh a(je $$0, cmh $$1) {
            hv $$2 = $$0.c().a($$0.d().c(cye.b));
            csy $$3 = $$0.b();
            dip $$4 = $$3.a_($$2);
            Optional<dip> $$5 = clw.b($$4);
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
      cye.a(cmk.sh, new jg() {
         private final jg c = new jg();

         @Override
         public cmh a(je $$0, cmh $$1) {
            if (cog.d($$1) != coh.c) {
               return this.c.dispense($$0, $$1);
            } else {
               amp $$2 = $$0.b();
               hv $$3 = $$0.c();
               hv $$4 = $$0.c().a($$0.d().c(cye.b));
               if (!$$2.a_($$4).a(arr.ca)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(jv.aj, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, arc.ch, ard.e, 1.0F, 1.0F);
                  $$2.a(null, dmz.z, $$3);
                  $$2.b($$4, cwb.sI.o());
                  return new cmh(cmk.si);
               }
            }
         }
      });
   }

   static elb a(je $$0, blj<?> $$1, ia $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
