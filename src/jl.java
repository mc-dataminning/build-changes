import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface jl {
   Logger a = LogUtils.getLogger();
   jl b = ($$0, $$1) -> $$1;

   coz dispense(ji var1, coz var2);

   static void c() {
      dat.a(cpc.ou, new jh() {
         @Override
         protected chz a(cvn $$0, it $$1, coz $$2) {
            chp $$3 = new chp($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = chn.a.b;
            return $$3;
         }
      });
      dat.a(cpc.vm, new jh() {
         @Override
         protected chz a(cvn $$0, it $$1, coz $$2) {
            chp $$3 = new chp($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.a($$2);
            $$3.d = chn.a.b;
            return $$3;
         }
      });
      dat.a(cpc.vl, new jh() {
         @Override
         protected chz a(cvn $$0, it $$1, coz $$2) {
            chn $$3 = new cif($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = chn.a.b;
            return $$3;
         }
      });
      dat.a(cpc.qQ, new jh() {
         @Override
         protected chz a(cvn $$0, it $$1, coz $$2) {
            return ac.a(new cii($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      dat.a(cpc.qB, new jh() {
         @Override
         protected chz a(cvn $$0, it $$1, coz $$2) {
            return ac.a(new cie($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      dat.a(cpc.tU, new jh() {
         @Override
         protected chz a(cvn $$0, it $$1, coz $$2) {
            return ac.a(new cik($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      dat.a(cpc.vk, new jl() {
         @Override
         public coz dispense(ji $$0, coz $$1) {
            return (new jh() {
               @Override
               protected chz a(cvn $$0, it $$1, coz $$2) {
                  return ac.a(new cil($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      dat.a(cpc.vn, new jl() {
         @Override
         public coz dispense(ji $$0, coz $$1) {
            return (new jh() {
               @Override
               protected chz a(cvn $$0, it $$1, coz $$2) {
                  return ac.a(new cil($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      jk $$0 = new jk() {
         @Override
         public coz a(ji $$0, coz $$1) {
            ie $$2 = $$0.d().c(dat.b);
            bnu<?> $$3 = ((cqe)$$1.d()).a($$1.w());

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bok.o, $$2 != ie.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return coz.h;
            }

            $$1.h(1);
            $$0.b().a(null, dpp.t, $$0.c());
            return $$1;
         }
      };

      for (cqe $$1 : cqe.h()) {
         dat.a($$1, $$0);
      }

      dat.a(cpc.uB, new jk() {
         @Override
         public coz a(ji $$0, coz $$1) {
            ie $$2 = $$0.d().c(dat.b);
            hz $$3 = $$0.c().a($$2);
            aov $$4 = $$0.b();
            Consumer<cdi> $$5 = bnu.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            cdi $$6 = bnu.e.a($$4, $$1.w(), $$5, $$3, bok.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dat.a(cpc.nK, new jm() {
         @Override
         public coz a(ji $$0, coz $$1) {
            hz $$2 = $$0.c().a($$0.d().c(dat.b));
            List<bog> $$3 = $$0.b().a(bog.class, new enn($$2), $$0x -> !($$0x instanceof bov $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((bov)$$3.get(0)).a(atl.e);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      jk $$2 = new jm() {
         @Override
         protected coz a(ji $$0, coz $$1) {
            hz $$2 = $$0.c().a($$0.d().c(dat.b));

            for (cbv $$4 : $$0.b().a(cbv.class, new enn($$2), $$0x -> $$0x.bx() && $$0x.gP())) {
               if ($$4.l($$1) && !$$4.gQ() && $$4.gv()) {
                  $$4.a_(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dat.a(cpc.uF, $$2);
      dat.a(cpc.uC, $$2);
      dat.a(cpc.uD, $$2);
      dat.a(cpc.uE, $$2);
      dat.a(cpc.hD, $$2);
      dat.a(cpc.hE, $$2);
      dat.a(cpc.hM, $$2);
      dat.a(cpc.hO, $$2);
      dat.a(cpc.hP, $$2);
      dat.a(cpc.hS, $$2);
      dat.a(cpc.hK, $$2);
      dat.a(cpc.hQ, $$2);
      dat.a(cpc.hG, $$2);
      dat.a(cpc.hL, $$2);
      dat.a(cpc.hI, $$2);
      dat.a(cpc.hF, $$2);
      dat.a(cpc.hJ, $$2);
      dat.a(cpc.hN, $$2);
      dat.a(cpc.hR, $$2);
      dat.a(cpc.hH, $$2);
      dat.a(cpc.eM, new jm() {
         @Override
         public coz a(ji $$0, coz $$1) {
            hz $$2 = $$0.c().a($$0.d().c(dat.b));

            for (cbu $$4 : $$0.b().a(cbu.class, new enn($$2), $$0x -> $$0x.bx() && !$$0x.w())) {
               if ($$4.gv() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dat.a(cpc.uq, new jk() {
         @Override
         public coz a(ji $$0, coz $$1) {
            ie $$2 = $$0.d().c(dat.b);
            ens $$3 = jl.a($$0, bnu.O, $$2);
            chu $$4 = new chu($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
            $$4.c((double)$$2.j(), (double)$$2.k(), (double)$$2.l(), 0.5F, 1.0F);
            $$0.b().b($$4);
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(ji $$0) {
            $$0.b().c(1004, $$0.c(), 0);
         }
      });
      dat.a(cpc.tV, new jk() {
         @Override
         public coz a(ji $$0, coz $$1) {
            ie $$2 = $$0.d().c(dat.b);
            it $$3 = dat.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            cvn $$7 = $$0.b();
            awo $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            cid $$12 = new cid($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(ji $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      dat.a(cpc.nT, new jj(cjc.b.a));
      dat.a(cpc.nV, new jj(cjc.b.b));
      dat.a(cpc.nX, new jj(cjc.b.c));
      dat.a(cpc.nZ, new jj(cjc.b.d));
      dat.a(cpc.of, new jj(cjc.b.g));
      dat.a(cpc.ob, new jj(cjc.b.e));
      dat.a(cpc.od, new jj(cjc.b.f));
      dat.a(cpc.oh, new jj(cjc.b.h));
      dat.a(cpc.oj, new jj(cjc.b.i));
      dat.a(cpc.nU, new jj(cjc.b.a, true));
      dat.a(cpc.nW, new jj(cjc.b.b, true));
      dat.a(cpc.nY, new jj(cjc.b.c, true));
      dat.a(cpc.oa, new jj(cjc.b.d, true));
      dat.a(cpc.og, new jj(cjc.b.g, true));
      dat.a(cpc.oc, new jj(cjc.b.e, true));
      dat.a(cpc.oe, new jj(cjc.b.f, true));
      dat.a(cpc.oi, new jj(cjc.b.h, true));
      dat.a(cpc.ok, new jj(cjc.b.i, true));
      jl $$3 = new jk() {
         private final jk c = new jk();

         @Override
         public coz a(ji $$0, coz $$1) {
            cnl $$2 = (cnl)$$1.d();
            hz $$3 = $$0.c().a($$0.d().c(dat.b));
            cvn $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new coz(cpc.qx);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dat.a(cpc.qz, $$3);
      dat.a(cpc.qy, $$3);
      dat.a(cpc.qA, $$3);
      dat.a(cpc.qF, $$3);
      dat.a(cpc.qG, $$3);
      dat.a(cpc.qE, $$3);
      dat.a(cpc.qH, $$3);
      dat.a(cpc.qI, $$3);
      dat.a(cpc.qJ, $$3);
      dat.a(cpc.qx, new jk() {
         private final jk c = new jk();

         @Override
         public coz a(ji $$0, coz $$1) {
            cvo $$2 = $$0.b();
            hz $$3 = $$0.c().a($$0.d().c(dat.b));
            dlf $$4 = $$2.a_($$3);
            if ($$4.b() instanceof cyv $$6) {
               coz $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dpp.y, $$3);
                  cou $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new coz($$8);
                  } else {
                     if ($$0.e().a(new coz($$8)) < 0) {
                        this.c.dispense($$0, new coz($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dat.a(cpc.or, new jm() {
         @Override
         protected coz a(ji $$0, coz $$1) {
            cvn $$2 = $$0.b();
            this.a(true);
            ie $$3 = $$0.d().c(dat.b);
            hz $$4 = $$0.c().a($$3);
            dlf $$5 = $$2.a_($$4);
            if (cyb.a($$2, $$4, $$3)) {
               $$2.b($$4, cyb.a($$2, $$4));
               $$2.a(null, dpp.i, $$4);
            } else if (czc.h($$5) || czd.g($$5) || cze.g($$5)) {
               $$2.b($$4, $$5.a(dlv.r, Boolean.valueOf(true)));
               $$2.a(null, dpp.c, $$4);
            } else if ($$5.b() instanceof dgw) {
               dgw.a($$2, $$4);
               $$2.a($$4, false);
            } else {
               this.a(false);
            }

            if (this.a()) {
               $$1.a(1, $$2.F_(), null, () -> $$1.f(0));
            }

            return $$1;
         }
      });
      dat.a(cpc.rx, new jm() {
         @Override
         protected coz a(ji $$0, coz $$1) {
            this.a(true);
            cvn $$2 = $$0.b();
            hz $$3 = $$0.c().a($$0.d().c(dat.b));
            if (!cmu.a($$1, $$2, $$3) && !cmu.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dat.a(cyq.ck, new jk() {
         @Override
         protected coz a(ji $$0, coz $$1) {
            cvn $$2 = $$0.b();
            hz $$3 = $$0.c().a($$0.d().c(dat.b));
            cdt $$4 = new cdt($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dr(), $$4.dt(), $$4.dx(), atk.yQ, atl.e, 1.0F, 1.0F);
            $$2.a(null, dpp.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      jl $$4 = new jm() {
         @Override
         protected coz a(ji $$0, coz $$1) {
            this.a(cmj.a($$0, $$1));
            return $$1;
         }
      };
      dat.a(cpc.ul, $$4);
      dat.a(cpc.uk, $$4);
      dat.a(cpc.um, $$4);
      dat.a(cpc.uh, $$4);
      dat.a(cpc.un, $$4);
      dat.a(cpc.uj, $$4);
      dat.a(cpc.ui, new jm() {
         @Override
         protected coz a(ji $$0, coz $$1) {
            cvn $$2 = $$0.b();
            ie $$3 = $$0.d().c(dat.b);
            hz $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dif.b($$2, $$4, $$1)) {
               $$2.a($$4, cyq.gG.o().a(dfp.e, Integer.valueOf(dml.a($$3))), 3);
               $$2.a(null, dpp.i, $$4);
               dit $$5 = $$2.c_($$4);
               if ($$5 instanceof dke) {
                  dif.a($$2, $$4, (dke)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cmj.a($$0, $$1));
            }

            return $$1;
         }
      });
      dat.a(cyq.ee, new jm() {
         @Override
         protected coz a(ji $$0, coz $$1) {
            cvn $$2 = $$0.b();
            hz $$3 = $$0.c().a($$0.d().c(dat.b));
            czi $$4 = (czi)cyq.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dpp.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cmj.a($$0, $$1));
            }

            return $$1;
         }
      });
      dat.a(cyq.kP.j(), new jo());

      for (cnn $$5 : cnn.values()) {
         dat.a(dfm.a($$5).j(), new jo());
      }

      dat.a(cpc.sk.j(), new jm() {
         private final jk c = new jk();

         private coz a(ji $$0, coz $$1, coz $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.b().a(null, dpp.y, $$0.c());
               return $$2.q();
            } else {
               if ($$0.e().a($$2.q()) < 0) {
                  this.c.dispense($$0, $$2.q());
               }

               return $$1;
            }
         }

         @Override
         public coz a(ji $$0, coz $$1) {
            this.a(false);
            aov $$2 = $$0.b();
            hz $$3 = $$0.c().a($$0.d().c(dat.b));
            dlf $$4 = $$2.a_($$3);
            if ($$4.a(atz.aF, $$0x -> $$0x.b(cyi.c) && $$0x.b() instanceof cyi) && $$4.c(cyi.c) >= 5) {
               ((cyi)$$4.b()).a($$2, $$4, $$3, null, diq.b.b);
               this.a(true);
               return this.a($$0, $$1, new coz(cpc.wt));
            } else if ($$2.b_($$3).a(aue.a)) {
               this.a(true);
               return this.a($$0, $$1, cqx.a(new coz(cpc.sj), cqy.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dat.a(cpc.ft, new jm() {
         @Override
         public coz a(ji $$0, coz $$1) {
            ie $$2 = $$0.d().c(dat.b);
            hz $$3 = $$0.c().a($$2);
            cvn $$4 = $$0.b();
            dlf $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(cyq.pl)) {
               if ($$5.c(dev.d) != 4) {
                  dev.a(null, $$4, $$3, $$5);
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
      dat.a(cpc.rU.j(), new jn());
      dat.a(cpc.xl.j(), new jm() {
         @Override
         protected coz a(ji $$0, coz $$1) {
            aov $$2 = $$0.b();
            hz $$3 = $$0.c().a($$0.d().c(dat.b));
            List<cba> $$4 = $$2.a(cba.class, new enn($$3), bnt.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               $$4.get(0).go();
               $$1.a(16, $$2.F_(), null, () -> {
                  $$1.h(1);
                  $$1.b(0);
               });
               return $$1;
            }
         }
      });
      dat.a(cpc.wq, new jm() {
         @Override
         public coz a(ji $$0, coz $$1) {
            hz $$2 = $$0.c().a($$0.d().c(dat.b));
            cvn $$3 = $$0.b();
            dlf $$4 = $$3.a_($$2);
            Optional<dlf> $$5 = cop.b($$4);
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
      dat.a(cpc.sj, new jk() {
         private final jk c = new jk();

         @Override
         public coz a(ji $$0, coz $$1) {
            if (!cqx.d($$1).a(cqy.c)) {
               return this.c.dispense($$0, $$1);
            } else {
               aov $$2 = $$0.b();
               hz $$3 = $$0.c();
               hz $$4 = $$0.c().a($$0.d().c(dat.b));
               if (!$$2.a_($$4).a(atz.cb)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(jz.aj, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, atk.ct, atl.e, 1.0F, 1.0F);
                  $$2.a(null, dpp.z, $$3);
                  $$2.b($$4, cyq.sI.o());
                  return new coz(cpc.sk);
               }
            }
         }
      });
   }

   static ens a(ji $$0, bnu<?> $$1, ie $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
