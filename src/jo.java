import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface jo {
   Logger a = LogUtils.getLogger();
   jo b = ($$0, $$1) -> $$1;

   cqk dispense(jl var1, cqk var2);

   static void c() {
      dcf.a(cqn.ou, new jk() {
         @Override
         protected cjk a(cwz $$0, iv $$1, cqk $$2) {
            cja $$3 = new cja($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = ciy.a.b;
            return $$3;
         }
      });
      dcf.a(cqn.vn, new jk() {
         @Override
         protected cjk a(cwz $$0, iv $$1, cqk $$2) {
            cja $$3 = new cja($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.a($$2);
            $$3.d = ciy.a.b;
            return $$3;
         }
      });
      dcf.a(cqn.vm, new jk() {
         @Override
         protected cjk a(cwz $$0, iv $$1, cqk $$2) {
            ciy $$3 = new cjq($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = ciy.a.b;
            return $$3;
         }
      });
      dcf.a(cqn.qQ, new jk() {
         @Override
         protected cjk a(cwz $$0, iv $$1, cqk $$2) {
            return ac.a(new cjt($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      dcf.a(cqn.qB, new jk() {
         @Override
         protected cjk a(cwz $$0, iv $$1, cqk $$2) {
            return ac.a(new cjp($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      dcf.a(cqn.tU, new jk() {
         @Override
         protected cjk a(cwz $$0, iv $$1, cqk $$2) {
            return ac.a(new cjv($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      dcf.a(cqn.vl, new jo() {
         @Override
         public cqk dispense(jl $$0, cqk $$1) {
            return (new jk() {
               @Override
               protected cjk a(cwz $$0, iv $$1, cqk $$2) {
                  return ac.a(new cjw($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      dcf.a(cqn.vo, new jo() {
         @Override
         public cqk dispense(jl $$0, cqk $$1) {
            return (new jk() {
               @Override
               protected cjk a(cwz $$0, iv $$1, cqk $$2) {
                  return ac.a(new cjw($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
         public cqk a(jl $$0, cqk $$1) {
            ih $$2 = $$0.d().c(dcf.b);
            bpc<?> $$3 = ((crp)$$1.d()).a($$1.w());

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bps.o, $$2 != ih.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cqk.h;
            }

            $$1.h(1);
            $$0.b().a(null, drn.t, $$0.c());
            return $$1;
         }
      };

      for (crp $$1 : crp.h()) {
         dcf.a($$1, $$0);
      }

      dcf.a(cqn.uC, new jn() {
         @Override
         public cqk a(jl $$0, cqk $$1) {
            ih $$2 = $$0.d().c(dcf.b);
            ib $$3 = $$0.c().a($$2);
            apf $$4 = $$0.b();
            Consumer<cet> $$5 = bpc.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            cet $$6 = bpc.e.a($$4, $$5, $$3, bps.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dcf.a(cqn.nK, new jp() {
         @Override
         public cqk a(jl $$0, cqk $$1) {
            ib $$2 = $$0.c().a($$0.d().c(dcf.b));
            List<bpo> $$3 = $$0.b().a(bpo.class, new epm($$2), $$0x -> !($$0x instanceof bqd $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bqd)$$3.get(0)).a(atz.e);
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
         protected cqk a(jl $$0, cqk $$1) {
            ib $$2 = $$0.c().a($$0.d().c(dcf.b));

            for (cdf $$4 : $$0.b().a(cdf.class, new epm($$2), $$0x -> $$0x.bA() && $$0x.fQ())) {
               if ($$4.l($$1) && !$$4.fR() && $$4.gC()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dcf.a(cqn.uG, $$2);
      dcf.a(cqn.uD, $$2);
      dcf.a(cqn.uE, $$2);
      dcf.a(cqn.uF, $$2);
      dcf.a(cqn.hD, $$2);
      dcf.a(cqn.hE, $$2);
      dcf.a(cqn.hM, $$2);
      dcf.a(cqn.hO, $$2);
      dcf.a(cqn.hP, $$2);
      dcf.a(cqn.hS, $$2);
      dcf.a(cqn.hK, $$2);
      dcf.a(cqn.hQ, $$2);
      dcf.a(cqn.hG, $$2);
      dcf.a(cqn.hL, $$2);
      dcf.a(cqn.hI, $$2);
      dcf.a(cqn.hF, $$2);
      dcf.a(cqn.hJ, $$2);
      dcf.a(cqn.hN, $$2);
      dcf.a(cqn.hR, $$2);
      dcf.a(cqn.hH, $$2);
      dcf.a(cqn.eM, new jp() {
         @Override
         public cqk a(jl $$0, cqk $$1) {
            ib $$2 = $$0.c().a($$0.d().c(dcf.b));

            for (cde $$4 : $$0.b().a(cde.class, new epm($$2), $$0x -> $$0x.bA() && !$$0x.s())) {
               if ($$4.gC() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dcf.a(cqn.ur, new jn() {
         @Override
         public cqk a(jl $$0, cqk $$1) {
            ih $$2 = $$0.d().c(dcf.b);
            epr $$3 = jo.a($$0, bpc.P, $$2);
            cjf $$4 = new cjf($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
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
      dcf.a(cqn.tV, new jn() {
         @Override
         public cqk a(jl $$0, cqk $$1) {
            ih $$2 = $$0.d().c(dcf.b);
            iv $$3 = dcf.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            cwz $$7 = $$0.b();
            axd $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            cjo $$12 = new cjo($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(jl $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      dcf.a(
         cqn.tW,
         new jn() {
            @Override
            public cqk a(jl $$0, cqk $$1) {
               ih $$2 = $$0.d().c(dcf.b);
               iv $$3 = dcf.a($$0);
               cwz $$4 = $$0.b();
               axd $$5 = $$4.z;
               double $$6 = $$5.a((double)$$2.j(), 0.11485000000000001);
               double $$7 = $$5.a((double)$$2.k(), 0.11485000000000001);
               double $$8 = $$5.a((double)$$2.l(), 0.11485000000000001);
               ckc $$9 = new ckc(
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
      dcf.a(cqn.nT, new jm(ckp.b.a));
      dcf.a(cqn.nV, new jm(ckp.b.b));
      dcf.a(cqn.nX, new jm(ckp.b.c));
      dcf.a(cqn.nZ, new jm(ckp.b.d));
      dcf.a(cqn.of, new jm(ckp.b.g));
      dcf.a(cqn.ob, new jm(ckp.b.e));
      dcf.a(cqn.od, new jm(ckp.b.f));
      dcf.a(cqn.oh, new jm(ckp.b.h));
      dcf.a(cqn.oj, new jm(ckp.b.i));
      dcf.a(cqn.nU, new jm(ckp.b.a, true));
      dcf.a(cqn.nW, new jm(ckp.b.b, true));
      dcf.a(cqn.nY, new jm(ckp.b.c, true));
      dcf.a(cqn.oa, new jm(ckp.b.d, true));
      dcf.a(cqn.og, new jm(ckp.b.g, true));
      dcf.a(cqn.oc, new jm(ckp.b.e, true));
      dcf.a(cqn.oe, new jm(ckp.b.f, true));
      dcf.a(cqn.oi, new jm(ckp.b.h, true));
      dcf.a(cqn.ok, new jm(ckp.b.i, true));
      jo $$3 = new jn() {
         private final jn c = new jn();

         @Override
         public cqk a(jl $$0, cqk $$1) {
            coz $$2 = (coz)$$1.d();
            ib $$3 = $$0.c().a($$0.d().c(dcf.b));
            cwz $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cqk(cqn.qx);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dcf.a(cqn.qz, $$3);
      dcf.a(cqn.qy, $$3);
      dcf.a(cqn.qA, $$3);
      dcf.a(cqn.qF, $$3);
      dcf.a(cqn.qG, $$3);
      dcf.a(cqn.qE, $$3);
      dcf.a(cqn.qH, $$3);
      dcf.a(cqn.qI, $$3);
      dcf.a(cqn.qJ, $$3);
      dcf.a(cqn.qx, new jn() {
         private final jn c = new jn();

         @Override
         public cqk a(jl $$0, cqk $$1) {
            cxa $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(dcf.b));
            dmz $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dah $$6) {
               cqk $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, drn.y, $$3);
                  cqf $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new cqk($$8);
                  } else {
                     if ($$0.e().a(new cqk($$8)) < 0) {
                        this.c.dispense($$0, new cqk($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dcf.a(cqn.or, new jp() {
         @Override
         protected cqk a(jl $$0, cqk $$1) {
            cwz $$2 = $$0.b();
            this.a(true);
            ih $$3 = $$0.d().c(dcf.b);
            ib $$4 = $$0.c().a($$3);
            dmz $$5 = $$2.a_($$4);
            if (czn.a($$2, $$4, $$3)) {
               $$2.b($$4, czn.a($$2, $$4));
               $$2.a(null, drn.i, $$4);
            } else if (dao.h($$5) || dap.g($$5) || daq.g($$5)) {
               $$2.b($$4, $$5.a(dnp.r, Boolean.valueOf(true)));
               $$2.a(null, drn.c, $$4);
            } else if ($$5.b() instanceof dii) {
               dii.a($$2, $$4);
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
      dcf.a(cqn.rx, new jp() {
         @Override
         protected cqk a(jl $$0, cqk $$1) {
            this.a(true);
            cwz $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(dcf.b));
            if (!coh.a($$1, $$2, $$3) && !coh.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dcf.a(dac.ck, new jn() {
         @Override
         protected cqk a(jl $$0, cqk $$1) {
            cwz $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(dcf.b));
            cfe $$4 = new cfe($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dr(), $$4.dt(), $$4.dx(), aty.yU, atz.e, 1.0F, 1.0F);
            $$2.a(null, drn.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      jo $$4 = new jp() {
         @Override
         protected cqk a(jl $$0, cqk $$1) {
            this.a(cnw.a($$0, $$1));
            return $$1;
         }
      };
      dcf.a(cqn.um, $$4);
      dcf.a(cqn.ul, $$4);
      dcf.a(cqn.un, $$4);
      dcf.a(cqn.ui, $$4);
      dcf.a(cqn.uo, $$4);
      dcf.a(cqn.uk, $$4);
      dcf.a(cqn.uj, new jp() {
         @Override
         protected cqk a(jl $$0, cqk $$1) {
            cwz $$2 = $$0.b();
            ih $$3 = $$0.d().c(dcf.b);
            ib $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && djs.b($$2, $$4, $$1)) {
               $$2.a($$4, dac.gG.o().a(dhb.e, Integer.valueOf(dof.a($$3))), 3);
               $$2.a(null, drn.i, $$4);
               dkg $$5 = $$2.c_($$4);
               if ($$5 instanceof dlr) {
                  djs.a($$2, $$4, (dlr)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cnw.a($$0, $$1));
            }

            return $$1;
         }
      });
      dcf.a(dac.ee, new jp() {
         @Override
         protected cqk a(jl $$0, cqk $$1) {
            cwz $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(dcf.b));
            dau $$4 = (dau)dac.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, drn.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cnw.a($$0, $$1));
            }

            return $$1;
         }
      });
      dcf.a(dac.kP.l(), new jr());

      for (cpb $$5 : cpb.values()) {
         dcf.a(dgy.a($$5).l(), new jr());
      }

      dcf.a(cqn.sk.l(), new jp() {
         private final jn c = new jn();

         private cqk a(jl $$0, cqk $$1, cqk $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.b().a(null, drn.y, $$0.c());
               return $$2.q();
            } else {
               if ($$0.e().a($$2.q()) < 0) {
                  this.c.dispense($$0, $$2.q());
               }

               return $$1;
            }
         }

         @Override
         public cqk a(jl $$0, cqk $$1) {
            this.a(false);
            apf $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(dcf.b));
            dmz $$4 = $$2.a_($$3);
            if ($$4.a(aun.aG, $$0x -> $$0x.b(czu.c) && $$0x.b() instanceof czu) && $$4.c(czu.c) >= 5) {
               ((czu)$$4.b()).a($$2, $$4, $$3, null, dkd.b.b);
               this.a(true);
               return this.a($$0, $$1, new cqk(cqn.wu));
            } else if ($$2.b_($$3).a(aus.a)) {
               this.a(true);
               return this.a($$0, $$1, csj.a(new cqk(cqn.sj), csk.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dcf.a(cqn.ft, new jp() {
         @Override
         public cqk a(jl $$0, cqk $$1) {
            ih $$2 = $$0.d().c(dcf.b);
            ib $$3 = $$0.c().a($$2);
            cwz $$4 = $$0.b();
            dmz $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dac.pl)) {
               if ($$5.c(dgh.d) != 4) {
                  dgh.a(null, $$4, $$3, $$5);
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
      dcf.a(cqn.rU.l(), new jq());
      dcf.a(cqn.xm.l(), new jp() {
         @Override
         protected cqk a(jl $$0, cqk $$1) {
            apf $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(dcf.b));
            List<cck> $$4 = $$2.a(cck.class, new epm($$3), bpb.f);
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
      dcf.a(cqn.wr, new jp() {
         @Override
         public cqk a(jl $$0, cqk $$1) {
            ib $$2 = $$0.c().a($$0.d().c(dcf.b));
            cwz $$3 = $$0.b();
            dmz $$4 = $$3.a_($$2);
            Optional<dmz> $$5 = cqa.b($$4);
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
      dcf.a(cqn.sj, new jn() {
         private final jn c = new jn();

         @Override
         public cqk a(jl $$0, cqk $$1) {
            if (!csj.d($$1).a(csk.c)) {
               return this.c.dispense($$0, $$1);
            } else {
               apf $$2 = $$0.b();
               ib $$3 = $$0.c();
               ib $$4 = $$0.c().a($$0.d().c(dcf.b));
               if (!$$2.a_($$4).a(aun.cc)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(kc.ak, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, aty.cw, atz.e, 1.0F, 1.0F);
                  $$2.a(null, drn.z, $$3);
                  $$2.b($$4, dac.sI.o());
                  return new cqk(cqn.sk);
               }
            }
         }
      });
   }

   static epr a(jl $$0, bpc<?> $$1, ih $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
