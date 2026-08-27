import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface ki {
   Logger a = LogUtils.getLogger();
   ki b = ($$0, $$1) -> $$1;

   csz dispense(kf var1, csz var2);

   static void c() {
      dfj.a(ctc.ov, new ke() {
         @Override
         protected clz a(dad $$0, jg $$1, csz $$2) {
            clp $$3 = new clp($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cln.a.b;
            return $$3;
         }
      });
      dfj.a(ctc.vq, new ke() {
         @Override
         protected clz a(dad $$0, jg $$1, csz $$2) {
            clp $$3 = new clp($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cln.a.b;
            return $$3;
         }
      });
      dfj.a(ctc.vp, new ke() {
         @Override
         protected clz a(dad $$0, jg $$1, csz $$2) {
            cln $$3 = new cmf($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cln.a.b;
            return $$3;
         }
      });
      dfj.a(ctc.qR, new ke() {
         @Override
         protected clz a(dad $$0, jg $$1, csz $$2) {
            return ac.a(new cmi($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      dfj.a(ctc.qC, new ke() {
         @Override
         protected clz a(dad $$0, jg $$1, csz $$2) {
            return ac.a(new cme($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      dfj.a(ctc.tW, new ke() {
         @Override
         protected clz a(dad $$0, jg $$1, csz $$2) {
            return ac.a(new cmk($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      dfj.a(ctc.vo, new ki() {
         @Override
         public csz dispense(kf $$0, csz $$1) {
            return (new ke() {
               @Override
               protected clz a(dad $$0, jg $$1, csz $$2) {
                  return ac.a(new cml($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      dfj.a(ctc.vr, new ki() {
         @Override
         public csz dispense(kf $$0, csz $$1) {
            return (new ke() {
               @Override
               protected clz a(dad $$0, jg $$1, csz $$2) {
                  return ac.a(new cml($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      kh $$0 = new kh() {
         @Override
         public csz a(kf $$0, csz $$1) {
            is $$2 = $$0.d().c(dfj.b);
            brn<?> $$3 = ((cue)$$1.f()).j($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bse.o, $$2 != is.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return csz.i;
            }

            $$1.h(1);
            $$0.b().a(null, dva.t, $$0.c());
            return $$1;
         }
      };

      for (cue $$1 : cue.h()) {
         dfj.a($$1, $$0);
      }

      dfj.a(ctc.uF, new kh() {
         @Override
         public csz a(kf $$0, csz $$1) {
            is $$2 = $$0.d().c(dfj.b);
            in $$3 = $$0.c().a($$2);
            aqh $$4 = $$0.b();
            Consumer<chh> $$5 = brn.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            chh $$6 = brn.d.a($$4, $$5, $$3, bse.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dfj.a(ctc.nL, new kj() {
         @Override
         public csz a(kf $$0, csz $$1) {
            in $$2 = $$0.c().a($$0.d().c(dfj.b));
            List<bsa> $$3 = $$0.b().a(bsa.class, new etk($$2), $$0x -> !($$0x instanceof bsp $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bsp)$$3.get(0)).a(avd.e);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      kh $$2 = new kj() {
         @Override
         protected csz a(kf $$0, csz $$1) {
            in $$2 = $$0.c().a($$0.d().c(dfj.b));

            for (cft $$4 : $$0.b().a(cft.class, new etk($$2), $$0x -> $$0x.bB() && $$0x.fR())) {
               if ($$4.l($$1) && !$$4.fS() && $$4.gE()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dfj.a(ctc.uJ, $$2);
      dfj.a(ctc.uG, $$2);
      dfj.a(ctc.uH, $$2);
      dfj.a(ctc.uI, $$2);
      dfj.a(ctc.hE, $$2);
      dfj.a(ctc.hF, $$2);
      dfj.a(ctc.hN, $$2);
      dfj.a(ctc.hP, $$2);
      dfj.a(ctc.hQ, $$2);
      dfj.a(ctc.hT, $$2);
      dfj.a(ctc.hL, $$2);
      dfj.a(ctc.hR, $$2);
      dfj.a(ctc.hH, $$2);
      dfj.a(ctc.hM, $$2);
      dfj.a(ctc.hJ, $$2);
      dfj.a(ctc.hG, $$2);
      dfj.a(ctc.hK, $$2);
      dfj.a(ctc.hO, $$2);
      dfj.a(ctc.hS, $$2);
      dfj.a(ctc.hI, $$2);
      dfj.a(ctc.eN, new kj() {
         @Override
         public csz a(kf $$0, csz $$1) {
            in $$2 = $$0.c().a($$0.d().c(dfj.b));

            for (cfs $$4 : $$0.b().a(cfs.class, new etk($$2), $$0x -> $$0x.bB() && !$$0x.u())) {
               if ($$4.gE() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dfj.a(ctc.uu, new kh() {
         @Override
         public csz a(kf $$0, csz $$1) {
            is $$2 = $$0.d().c(dfj.b);
            etp $$3 = ki.a($$0, brn.P, $$2);
            clu $$4 = new clu($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
            $$4.c((double)$$2.j(), (double)$$2.k(), (double)$$2.l(), 0.5F, 1.0F);
            $$0.b().b($$4);
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(kf $$0) {
            $$0.b().c(1004, $$0.c(), 0);
         }
      });
      dfj.a(ctc.tX, new kh() {
         @Override
         public csz a(kf $$0, csz $$1) {
            is $$2 = $$0.d().c(dfj.b);
            jg $$3 = dfj.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            dad $$7 = $$0.b();
            ayg $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            cmd $$12 = new cmd($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(kf $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      dfj.a(
         ctc.tY,
         new kh() {
            @Override
            public csz a(kf $$0, csz $$1) {
               is $$2 = $$0.d().c(dfj.b);
               jg $$3 = dfj.a($$0);
               dad $$4 = $$0.b();
               ayg $$5 = $$4.z;
               double $$6 = $$5.a((double)$$2.j(), 0.11485000000000001);
               double $$7 = $$5.a((double)$$2.k(), 0.11485000000000001);
               double $$8 = $$5.a((double)$$2.l(), 0.11485000000000001);
               cmr $$9 = new cmr(
                  $$4,
                  $$3.a() + (double)((float)$$2.j() * 0.3F),
                  $$3.b() + (double)((float)$$2.k() * 0.3F),
                  $$3.c() + (double)((float)$$2.l() * 0.3F),
                  $$6,
                  $$7,
                  $$8
               );
               $$4.b($$9);
               $$1.h(1);
               return $$1;
            }
         }
      );
      dfj.a(ctc.nU, new kg(cne.b.a));
      dfj.a(ctc.nW, new kg(cne.b.b));
      dfj.a(ctc.nY, new kg(cne.b.c));
      dfj.a(ctc.oa, new kg(cne.b.d));
      dfj.a(ctc.og, new kg(cne.b.g));
      dfj.a(ctc.oc, new kg(cne.b.e));
      dfj.a(ctc.oe, new kg(cne.b.f));
      dfj.a(ctc.oi, new kg(cne.b.h));
      dfj.a(ctc.ok, new kg(cne.b.i));
      dfj.a(ctc.nV, new kg(cne.b.a, true));
      dfj.a(ctc.nX, new kg(cne.b.b, true));
      dfj.a(ctc.nZ, new kg(cne.b.c, true));
      dfj.a(ctc.ob, new kg(cne.b.d, true));
      dfj.a(ctc.oh, new kg(cne.b.g, true));
      dfj.a(ctc.od, new kg(cne.b.e, true));
      dfj.a(ctc.of, new kg(cne.b.f, true));
      dfj.a(ctc.oj, new kg(cne.b.h, true));
      dfj.a(ctc.ol, new kg(cne.b.i, true));
      ki $$3 = new kh() {
         private final kh c = new kh();

         @Override
         public csz a(kf $$0, csz $$1) {
            crq $$2 = (crq)$$1.f();
            in $$3 = $$0.c().a($$0.d().c(dfj.b));
            dad $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new csz(ctc.qy);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dfj.a(ctc.qA, $$3);
      dfj.a(ctc.qz, $$3);
      dfj.a(ctc.qB, $$3);
      dfj.a(ctc.qG, $$3);
      dfj.a(ctc.qH, $$3);
      dfj.a(ctc.qF, $$3);
      dfj.a(ctc.qI, $$3);
      dfj.a(ctc.qJ, $$3);
      dfj.a(ctc.qK, $$3);
      dfj.a(ctc.qy, new kh() {
         private final kh c = new kh();

         @Override
         public csz a(kf $$0, csz $$1) {
            dae $$2 = $$0.b();
            in $$3 = $$0.c().a($$0.d().c(dfj.b));
            dqh $$4 = $$2.a_($$3);
            if ($$4.b() instanceof ddl $$6) {
               csz $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.d()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dva.y, $$3);
                  csu $$8 = $$7.f();
                  $$1.h(1);
                  if ($$1.d()) {
                     return new csz($$8);
                  } else {
                     if ($$0.e().b(new csz($$8)) < 0) {
                        this.c.dispense($$0, new csz($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dfj.a(ctc.os, new kj() {
         @Override
         protected csz a(kf $$0, csz $$1) {
            dad $$2 = $$0.b();
            this.a(true);
            is $$3 = $$0.d().c(dfj.b);
            in $$4 = $$0.c().a($$3);
            dqh $$5 = $$2.a_($$4);
            if (dcr.a($$2, $$4, $$3)) {
               $$2.b($$4, dcr.a($$2, $$4));
               $$2.a(null, dva.i, $$4);
            } else if (dds.h($$5) || ddt.g($$5) || ddu.g($$5)) {
               $$2.b($$4, $$5.a(dqx.r, Boolean.valueOf(true)));
               $$2.a(null, dva.c, $$4);
            } else if ($$5.b() instanceof dln) {
               dln.a($$2, $$4);
               $$2.a($$4, false);
            } else {
               this.a(false);
            }

            if (this.a()) {
               $$1.a(1, $$2.E_(), null, () -> $$1.e(0));
            }

            return $$1;
         }
      });
      dfj.a(ctc.ry, new kj() {
         @Override
         protected csz a(kf $$0, csz $$1) {
            this.a(true);
            dad $$2 = $$0.b();
            in $$3 = $$0.c().a($$0.d().c(dfj.b));
            if (!cqz.a($$1, $$2, $$3) && !cqz.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dfj.a(ddg.ck, new kh() {
         @Override
         protected csz a(kf $$0, csz $$1) {
            dad $$2 = $$0.b();
            in $$3 = $$0.c().a($$0.d().c(dfj.b));
            chs $$4 = new chs($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.ds(), $$4.du(), $$4.dy(), avc.zk, avd.e, 1.0F, 1.0F);
            $$2.a(null, dva.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      ki $$4 = new kj() {
         @Override
         protected csz a(kf $$0, csz $$1) {
            this.a(cqo.a($$0, $$1));
            return $$1;
         }
      };
      dfj.a(ctc.up, $$4);
      dfj.a(ctc.uo, $$4);
      dfj.a(ctc.uq, $$4);
      dfj.a(ctc.ul, $$4);
      dfj.a(ctc.ur, $$4);
      dfj.a(ctc.un, $$4);
      dfj.a(ctc.um, new kj() {
         @Override
         protected csz a(kf $$0, csz $$1) {
            dad $$2 = $$0.b();
            is $$3 = $$0.d().c(dfj.b);
            in $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dmx.b($$2, $$4, $$1)) {
               $$2.a($$4, ddg.gG.n().a(dkg.e, Integer.valueOf(drn.a($$3))), 3);
               $$2.a(null, dva.i, $$4);
               dnm $$5 = $$2.c_($$4);
               if ($$5 instanceof doy) {
                  dmx.a($$2, $$4, (doy)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cqo.a($$0, $$1));
            }

            return $$1;
         }
      });
      dfj.a(ddg.ee, new kj() {
         @Override
         protected csz a(kf $$0, csz $$1) {
            dad $$2 = $$0.b();
            in $$3 = $$0.c().a($$0.d().c(dfj.b));
            ddy $$4 = (ddy)ddg.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.n(), 3);
                  $$2.a(null, dva.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cqo.a($$0, $$1));
            }

            return $$1;
         }
      });
      dfj.a(ddg.kP.q(), new kl());

      for (crs $$5 : crs.values()) {
         dfj.a(dkd.a($$5).q(), new kl());
      }

      dfj.a(ctc.sl.q(), new kj() {
         private final kh c = new kh();

         private csz a(kf $$0, csz $$1, csz $$2) {
            $$1.h(1);
            if ($$1.d()) {
               $$0.b().a(null, dva.y, $$0.c());
               return $$2.r();
            } else {
               if ($$0.e().b($$2.r()) < 0) {
                  this.c.dispense($$0, $$2.r());
               }

               return $$1;
            }
         }

         @Override
         public csz a(kf $$0, csz $$1) {
            this.a(false);
            aqh $$2 = $$0.b();
            in $$3 = $$0.c().a($$0.d().c(dfj.b));
            dqh $$4 = $$2.a_($$3);
            if ($$4.a(avr.aG, $$0x -> $$0x.b(dcy.c) && $$0x.b() instanceof dcy) && $$4.c(dcy.c) >= 5) {
               ((dcy)$$4.b()).a($$2, $$4, $$3, null, dnj.b.b);
               this.a(true);
               return this.a($$0, $$1, new csz(ctc.wz));
            } else if ($$2.b_($$3).a(avw.a)) {
               this.a(true);
               return this.a($$0, $$1, cuy.a(ctc.sk, cuz.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dfj.a(ctc.fu, new kj() {
         @Override
         public csz a(kf $$0, csz $$1) {
            is $$2 = $$0.d().c(dfj.b);
            in $$3 = $$0.c().a($$2);
            dad $$4 = $$0.b();
            dqh $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(ddg.pl)) {
               if ($$5.c(djm.d) != 4) {
                  djm.a(null, $$4, $$3, $$5);
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
      dfj.a(ctc.rV.q(), new kk());
      dfj.a(ctc.xr.q(), new kj() {
         @Override
         protected csz a(kf $$0, csz $$1) {
            aqh $$2 = $$0.b();
            in $$3 = $$0.c().a($$0.d().c(dfj.b));
            List<cey> $$4 = $$2.a(cey.class, new etk($$3), brm.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cey $$5 : $$4) {
                  if ($$5.gz()) {
                     $$1.a(16, $$2.E_(), null, () -> {
                        $$1.h(1);
                        $$1.b(0);
                     });
                     return $$1;
                  }
               }

               this.a(false);
               return $$1;
            }
         }
      });
      dfj.a(ctc.ww, new kj() {
         @Override
         public csz a(kf $$0, csz $$1) {
            in $$2 = $$0.c().a($$0.d().c(dfj.b));
            dad $$3 = $$0.b();
            dqh $$4 = $$3.a_($$2);
            Optional<dqh> $$5 = csp.a($$4);
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
      dfj.a(ctc.sk, new kh() {
         private final kh c = new kh();

         @Override
         public csz a(kf $$0, csz $$1) {
            cuy $$2 = $$1.a(ka.E, cuy.a);
            if (!$$2.a(cuz.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               aqh $$3 = $$0.b();
               in $$4 = $$0.c();
               in $$5 = $$0.c().a($$0.d().c(dfj.b));
               if (!$$3.a_($$5).a(avr.ci)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(kx.aj, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, avc.cB, avd.e, 1.0F, 1.0F);
                  $$3.a(null, dva.z, $$4);
                  $$3.b($$5, ddg.sI.n());
                  return new csz(ctc.sl);
               }
            }
         }
      });
   }

   static etp a(kf $$0, brn<?> $$1, is $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
