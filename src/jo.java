import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface jo {
   Logger a = LogUtils.getLogger();
   jo b = ($$0, $$1) -> $$1;

   cqm dispense(jl var1, cqm var2);

   static void c() {
      dch.a(cqp.ou, new jk() {
         @Override
         protected cjm a(cxb $$0, iv $$1, cqm $$2) {
            cjc $$3 = new cjc($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cja.a.b;
            return $$3;
         }
      });
      dch.a(cqp.vo, new jk() {
         @Override
         protected cjm a(cxb $$0, iv $$1, cqm $$2) {
            cjc $$3 = new cjc($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.a($$2);
            $$3.d = cja.a.b;
            return $$3;
         }
      });
      dch.a(cqp.vn, new jk() {
         @Override
         protected cjm a(cxb $$0, iv $$1, cqm $$2) {
            cja $$3 = new cjs($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cja.a.b;
            return $$3;
         }
      });
      dch.a(cqp.qQ, new jk() {
         @Override
         protected cjm a(cxb $$0, iv $$1, cqm $$2) {
            return ac.a(new cjv($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      dch.a(cqp.qB, new jk() {
         @Override
         protected cjm a(cxb $$0, iv $$1, cqm $$2) {
            return ac.a(new cjr($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      dch.a(cqp.tV, new jk() {
         @Override
         protected cjm a(cxb $$0, iv $$1, cqm $$2) {
            return ac.a(new cjx($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      dch.a(cqp.vm, new jo() {
         @Override
         public cqm dispense(jl $$0, cqm $$1) {
            return (new jk() {
               @Override
               protected cjm a(cxb $$0, iv $$1, cqm $$2) {
                  return ac.a(new cjy($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      dch.a(cqp.vp, new jo() {
         @Override
         public cqm dispense(jl $$0, cqm $$1) {
            return (new jk() {
               @Override
               protected cjm a(cxb $$0, iv $$1, cqm $$2) {
                  return ac.a(new cjy($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      jn $$0 = new jn() {
         @Override
         public cqm a(jl $$0, cqm $$1) {
            ih $$2 = $$0.d().c(dch.b);
            bpd<?> $$3 = ((crr)$$1.d()).a($$1.w());

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bpt.o, $$2 != ih.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cqm.h;
            }

            $$1.h(1);
            $$0.b().a(null, drp.t, $$0.c());
            return $$1;
         }
      };

      for (crr $$1 : crr.h()) {
         dch.a($$1, $$0);
      }

      dch.a(cqp.uD, new jn() {
         @Override
         public cqm a(jl $$0, cqm $$1) {
            ih $$2 = $$0.d().c(dch.b);
            ib $$3 = $$0.c().a($$2);
            apf $$4 = $$0.b();
            Consumer<ceu> $$5 = bpd.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            ceu $$6 = bpd.e.a($$4, $$5, $$3, bpt.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dch.a(cqp.nK, new jp() {
         @Override
         public cqm a(jl $$0, cqm $$1) {
            ib $$2 = $$0.c().a($$0.d().c(dch.b));
            List<bpp> $$3 = $$0.b().a(bpp.class, new epo($$2), $$0x -> !($$0x instanceof bqe $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bqe)$$3.get(0)).a(atz.e);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      jn $$2 = new jp() {
         @Override
         protected cqm a(jl $$0, cqm $$1) {
            ib $$2 = $$0.c().a($$0.d().c(dch.b));

            for (cdg $$4 : $$0.b().a(cdg.class, new epo($$2), $$0x -> $$0x.bA() && $$0x.fQ())) {
               if ($$4.l($$1) && !$$4.fR() && $$4.gC()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dch.a(cqp.uH, $$2);
      dch.a(cqp.uE, $$2);
      dch.a(cqp.uF, $$2);
      dch.a(cqp.uG, $$2);
      dch.a(cqp.hD, $$2);
      dch.a(cqp.hE, $$2);
      dch.a(cqp.hM, $$2);
      dch.a(cqp.hO, $$2);
      dch.a(cqp.hP, $$2);
      dch.a(cqp.hS, $$2);
      dch.a(cqp.hK, $$2);
      dch.a(cqp.hQ, $$2);
      dch.a(cqp.hG, $$2);
      dch.a(cqp.hL, $$2);
      dch.a(cqp.hI, $$2);
      dch.a(cqp.hF, $$2);
      dch.a(cqp.hJ, $$2);
      dch.a(cqp.hN, $$2);
      dch.a(cqp.hR, $$2);
      dch.a(cqp.hH, $$2);
      dch.a(cqp.eM, new jp() {
         @Override
         public cqm a(jl $$0, cqm $$1) {
            ib $$2 = $$0.c().a($$0.d().c(dch.b));

            for (cdf $$4 : $$0.b().a(cdf.class, new epo($$2), $$0x -> $$0x.bA() && !$$0x.s())) {
               if ($$4.gC() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dch.a(cqp.us, new jn() {
         @Override
         public cqm a(jl $$0, cqm $$1) {
            ih $$2 = $$0.d().c(dch.b);
            ept $$3 = jo.a($$0, bpd.Q, $$2);
            cjh $$4 = new cjh($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
            $$4.c((double)$$2.j(), (double)$$2.k(), (double)$$2.l(), 0.5F, 1.0F);
            $$0.b().b($$4);
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(jl $$0) {
            $$0.b().c(1004, $$0.c(), 0);
         }
      });
      dch.a(cqp.tW, new jn() {
         @Override
         public cqm a(jl $$0, cqm $$1) {
            ih $$2 = $$0.d().c(dch.b);
            iv $$3 = dch.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            cxb $$7 = $$0.b();
            axd $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            cjq $$12 = new cjq($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(jl $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      dch.a(
         cqp.tX,
         new jn() {
            @Override
            public cqm a(jl $$0, cqm $$1) {
               ih $$2 = $$0.d().c(dch.b);
               iv $$3 = dch.a($$0);
               cxb $$4 = $$0.b();
               axd $$5 = $$4.z;
               double $$6 = $$5.a((double)$$2.j(), 0.11485000000000001);
               double $$7 = $$5.a((double)$$2.k(), 0.11485000000000001);
               double $$8 = $$5.a((double)$$2.l(), 0.11485000000000001);
               cke $$9 = new cke(
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
      dch.a(cqp.nT, new jm(ckr.b.a));
      dch.a(cqp.nV, new jm(ckr.b.b));
      dch.a(cqp.nX, new jm(ckr.b.c));
      dch.a(cqp.nZ, new jm(ckr.b.d));
      dch.a(cqp.of, new jm(ckr.b.g));
      dch.a(cqp.ob, new jm(ckr.b.e));
      dch.a(cqp.od, new jm(ckr.b.f));
      dch.a(cqp.oh, new jm(ckr.b.h));
      dch.a(cqp.oj, new jm(ckr.b.i));
      dch.a(cqp.nU, new jm(ckr.b.a, true));
      dch.a(cqp.nW, new jm(ckr.b.b, true));
      dch.a(cqp.nY, new jm(ckr.b.c, true));
      dch.a(cqp.oa, new jm(ckr.b.d, true));
      dch.a(cqp.og, new jm(ckr.b.g, true));
      dch.a(cqp.oc, new jm(ckr.b.e, true));
      dch.a(cqp.oe, new jm(ckr.b.f, true));
      dch.a(cqp.oi, new jm(ckr.b.h, true));
      dch.a(cqp.ok, new jm(ckr.b.i, true));
      jo $$3 = new jn() {
         private final jn c = new jn();

         @Override
         public cqm a(jl $$0, cqm $$1) {
            cpb $$2 = (cpb)$$1.d();
            ib $$3 = $$0.c().a($$0.d().c(dch.b));
            cxb $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cqm(cqp.qx);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dch.a(cqp.qz, $$3);
      dch.a(cqp.qy, $$3);
      dch.a(cqp.qA, $$3);
      dch.a(cqp.qF, $$3);
      dch.a(cqp.qG, $$3);
      dch.a(cqp.qE, $$3);
      dch.a(cqp.qH, $$3);
      dch.a(cqp.qI, $$3);
      dch.a(cqp.qJ, $$3);
      dch.a(cqp.qx, new jn() {
         private final jn c = new jn();

         @Override
         public cqm a(jl $$0, cqm $$1) {
            cxc $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(dch.b));
            dnb $$4 = $$2.a_($$3);
            if ($$4.b() instanceof daj $$6) {
               cqm $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, drp.y, $$3);
                  cqh $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new cqm($$8);
                  } else {
                     if ($$0.e().a(new cqm($$8)) < 0) {
                        this.c.dispense($$0, new cqm($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dch.a(cqp.or, new jp() {
         @Override
         protected cqm a(jl $$0, cqm $$1) {
            cxb $$2 = $$0.b();
            this.a(true);
            ih $$3 = $$0.d().c(dch.b);
            ib $$4 = $$0.c().a($$3);
            dnb $$5 = $$2.a_($$4);
            if (czp.a($$2, $$4, $$3)) {
               $$2.b($$4, czp.a($$2, $$4));
               $$2.a(null, drp.i, $$4);
            } else if (daq.h($$5) || dar.g($$5) || das.g($$5)) {
               $$2.b($$4, $$5.a(dnr.r, Boolean.valueOf(true)));
               $$2.a(null, drp.c, $$4);
            } else if ($$5.b() instanceof dik) {
               dik.a($$2, $$4);
               $$2.a($$4, false);
            } else {
               this.a(false);
            }

            if (this.a()) {
               $$1.a(1, $$2.E_(), null, () -> $$1.f(0));
            }

            return $$1;
         }
      });
      dch.a(cqp.rx, new jp() {
         @Override
         protected cqm a(jl $$0, cqm $$1) {
            this.a(true);
            cxb $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(dch.b));
            if (!coj.a($$1, $$2, $$3) && !coj.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dch.a(dae.ck, new jn() {
         @Override
         protected cqm a(jl $$0, cqm $$1) {
            cxb $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(dch.b));
            cff $$4 = new cff($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dr(), $$4.dt(), $$4.dx(), aty.yZ, atz.e, 1.0F, 1.0F);
            $$2.a(null, drp.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      jo $$4 = new jp() {
         @Override
         protected cqm a(jl $$0, cqm $$1) {
            this.a(cny.a($$0, $$1));
            return $$1;
         }
      };
      dch.a(cqp.un, $$4);
      dch.a(cqp.um, $$4);
      dch.a(cqp.uo, $$4);
      dch.a(cqp.uj, $$4);
      dch.a(cqp.up, $$4);
      dch.a(cqp.ul, $$4);
      dch.a(cqp.uk, new jp() {
         @Override
         protected cqm a(jl $$0, cqm $$1) {
            cxb $$2 = $$0.b();
            ih $$3 = $$0.d().c(dch.b);
            ib $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dju.b($$2, $$4, $$1)) {
               $$2.a($$4, dae.gG.o().a(dhd.e, Integer.valueOf(doh.a($$3))), 3);
               $$2.a(null, drp.i, $$4);
               dki $$5 = $$2.c_($$4);
               if ($$5 instanceof dlt) {
                  dju.a($$2, $$4, (dlt)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cny.a($$0, $$1));
            }

            return $$1;
         }
      });
      dch.a(dae.ee, new jp() {
         @Override
         protected cqm a(jl $$0, cqm $$1) {
            cxb $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(dch.b));
            daw $$4 = (daw)dae.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, drp.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cny.a($$0, $$1));
            }

            return $$1;
         }
      });
      dch.a(dae.kP.l(), new jr());

      for (cpd $$5 : cpd.values()) {
         dch.a(dha.a($$5).l(), new jr());
      }

      dch.a(cqp.sk.l(), new jp() {
         private final jn c = new jn();

         private cqm a(jl $$0, cqm $$1, cqm $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.b().a(null, drp.y, $$0.c());
               return $$2.q();
            } else {
               if ($$0.e().a($$2.q()) < 0) {
                  this.c.dispense($$0, $$2.q());
               }

               return $$1;
            }
         }

         @Override
         public cqm a(jl $$0, cqm $$1) {
            this.a(false);
            apf $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(dch.b));
            dnb $$4 = $$2.a_($$3);
            if ($$4.a(aun.aG, $$0x -> $$0x.b(czw.c) && $$0x.b() instanceof czw) && $$4.c(czw.c) >= 5) {
               ((czw)$$4.b()).a($$2, $$4, $$3, null, dkf.b.b);
               this.a(true);
               return this.a($$0, $$1, new cqm(cqp.wv));
            } else if ($$2.b_($$3).a(aus.a)) {
               this.a(true);
               return this.a($$0, $$1, csl.a(new cqm(cqp.sj), csm.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dch.a(cqp.ft, new jp() {
         @Override
         public cqm a(jl $$0, cqm $$1) {
            ih $$2 = $$0.d().c(dch.b);
            ib $$3 = $$0.c().a($$2);
            cxb $$4 = $$0.b();
            dnb $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dae.pl)) {
               if ($$5.c(dgj.d) != 4) {
                  dgj.a(null, $$4, $$3, $$5);
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
      dch.a(cqp.rU.l(), new jq());
      dch.a(cqp.xn.l(), new jp() {
         @Override
         protected cqm a(jl $$0, cqm $$1) {
            apf $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(dch.b));
            List<ccl> $$4 = $$2.a(ccl.class, new epo($$3), bpc.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               $$4.get(0).gx();
               $$1.a(16, $$2.E_(), null, () -> {
                  $$1.h(1);
                  $$1.b(0);
               });
               return $$1;
            }
         }
      });
      dch.a(cqp.ws, new jp() {
         @Override
         public cqm a(jl $$0, cqm $$1) {
            ib $$2 = $$0.c().a($$0.d().c(dch.b));
            cxb $$3 = $$0.b();
            dnb $$4 = $$3.a_($$2);
            Optional<dnb> $$5 = cqc.b($$4);
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
      dch.a(cqp.sj, new jn() {
         private final jn c = new jn();

         @Override
         public cqm a(jl $$0, cqm $$1) {
            if (!csl.d($$1).a(csm.c)) {
               return this.c.dispense($$0, $$1);
            } else {
               apf $$2 = $$0.b();
               ib $$3 = $$0.c();
               ib $$4 = $$0.c().a($$0.d().c(dch.b));
               if (!$$2.a_($$4).a(aun.cc)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(kc.ak, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, aty.cA, atz.e, 1.0F, 1.0F);
                  $$2.a(null, drp.z, $$3);
                  $$2.b($$4, dae.sI.o());
                  return new cqm(cqp.sk);
               }
            }
         }
      });
   }

   static ept a(jl $$0, bpd<?> $$1, ih $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
