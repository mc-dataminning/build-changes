import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface jl {
   Logger a = LogUtils.getLogger();
   jl b = ($$0, $$1) -> $$1;

   cpd dispense(ji var1, cpd var2);

   static void c() {
      dax.a(cpg.ou, new jh() {
         @Override
         protected cid a(cvr $$0, it $$1, cpd $$2) {
            cht $$3 = new cht($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = chr.a.b;
            return $$3;
         }
      });
      dax.a(cpg.vm, new jh() {
         @Override
         protected cid a(cvr $$0, it $$1, cpd $$2) {
            cht $$3 = new cht($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.a($$2);
            $$3.d = chr.a.b;
            return $$3;
         }
      });
      dax.a(cpg.vl, new jh() {
         @Override
         protected cid a(cvr $$0, it $$1, cpd $$2) {
            chr $$3 = new cij($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = chr.a.b;
            return $$3;
         }
      });
      dax.a(cpg.qQ, new jh() {
         @Override
         protected cid a(cvr $$0, it $$1, cpd $$2) {
            return ac.a(new cim($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      dax.a(cpg.qB, new jh() {
         @Override
         protected cid a(cvr $$0, it $$1, cpd $$2) {
            return ac.a(new cii($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      dax.a(cpg.tU, new jh() {
         @Override
         protected cid a(cvr $$0, it $$1, cpd $$2) {
            return ac.a(new cio($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      dax.a(cpg.vk, new jl() {
         @Override
         public cpd dispense(ji $$0, cpd $$1) {
            return (new jh() {
               @Override
               protected cid a(cvr $$0, it $$1, cpd $$2) {
                  return ac.a(new cip($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      dax.a(cpg.vn, new jl() {
         @Override
         public cpd dispense(ji $$0, cpd $$1) {
            return (new jh() {
               @Override
               protected cid a(cvr $$0, it $$1, cpd $$2) {
                  return ac.a(new cip($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
         public cpd a(ji $$0, cpd $$1) {
            ie $$2 = $$0.d().c(dax.b);
            bnw<?> $$3 = ((cqi)$$1.d()).a($$1.w());

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bom.o, $$2 != ie.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cpd.h;
            }

            $$1.h(1);
            $$0.b().a(null, dpw.t, $$0.c());
            return $$1;
         }
      };

      for (cqi $$1 : cqi.h()) {
         dax.a($$1, $$0);
      }

      dax.a(cpg.uB, new jk() {
         @Override
         public cpd a(ji $$0, cpd $$1) {
            ie $$2 = $$0.d().c(dax.b);
            hz $$3 = $$0.c().a($$2);
            aow $$4 = $$0.b();
            Consumer<cdm> $$5 = bnw.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            cdm $$6 = bnw.e.a($$4, $$1.w(), $$5, $$3, bom.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dax.a(cpg.nK, new jm() {
         @Override
         public cpd a(ji $$0, cpd $$1) {
            hz $$2 = $$0.c().a($$0.d().c(dax.b));
            List<boi> $$3 = $$0.b().a(boi.class, new enu($$2), $$0x -> !($$0x instanceof box $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((box)$$3.get(0)).a(atm.e);
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
         protected cpd a(ji $$0, cpd $$1) {
            hz $$2 = $$0.c().a($$0.d().c(dax.b));

            for (cbz $$4 : $$0.b().a(cbz.class, new enu($$2), $$0x -> $$0x.bx() && $$0x.gP())) {
               if ($$4.l($$1) && !$$4.gQ() && $$4.gv()) {
                  $$4.a_(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dax.a(cpg.uF, $$2);
      dax.a(cpg.uC, $$2);
      dax.a(cpg.uD, $$2);
      dax.a(cpg.uE, $$2);
      dax.a(cpg.hD, $$2);
      dax.a(cpg.hE, $$2);
      dax.a(cpg.hM, $$2);
      dax.a(cpg.hO, $$2);
      dax.a(cpg.hP, $$2);
      dax.a(cpg.hS, $$2);
      dax.a(cpg.hK, $$2);
      dax.a(cpg.hQ, $$2);
      dax.a(cpg.hG, $$2);
      dax.a(cpg.hL, $$2);
      dax.a(cpg.hI, $$2);
      dax.a(cpg.hF, $$2);
      dax.a(cpg.hJ, $$2);
      dax.a(cpg.hN, $$2);
      dax.a(cpg.hR, $$2);
      dax.a(cpg.hH, $$2);
      dax.a(cpg.eM, new jm() {
         @Override
         public cpd a(ji $$0, cpd $$1) {
            hz $$2 = $$0.c().a($$0.d().c(dax.b));

            for (cby $$4 : $$0.b().a(cby.class, new enu($$2), $$0x -> $$0x.bx() && !$$0x.w())) {
               if ($$4.gv() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dax.a(cpg.uq, new jk() {
         @Override
         public cpd a(ji $$0, cpd $$1) {
            ie $$2 = $$0.d().c(dax.b);
            enz $$3 = jl.a($$0, bnw.O, $$2);
            chy $$4 = new chy($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
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
      dax.a(cpg.tV, new jk() {
         @Override
         public cpd a(ji $$0, cpd $$1) {
            ie $$2 = $$0.d().c(dax.b);
            it $$3 = dax.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            cvr $$7 = $$0.b();
            awp $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            cih $$12 = new cih($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(ji $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      dax.a(cpg.nT, new jj(cjg.b.a));
      dax.a(cpg.nV, new jj(cjg.b.b));
      dax.a(cpg.nX, new jj(cjg.b.c));
      dax.a(cpg.nZ, new jj(cjg.b.d));
      dax.a(cpg.of, new jj(cjg.b.g));
      dax.a(cpg.ob, new jj(cjg.b.e));
      dax.a(cpg.od, new jj(cjg.b.f));
      dax.a(cpg.oh, new jj(cjg.b.h));
      dax.a(cpg.oj, new jj(cjg.b.i));
      dax.a(cpg.nU, new jj(cjg.b.a, true));
      dax.a(cpg.nW, new jj(cjg.b.b, true));
      dax.a(cpg.nY, new jj(cjg.b.c, true));
      dax.a(cpg.oa, new jj(cjg.b.d, true));
      dax.a(cpg.og, new jj(cjg.b.g, true));
      dax.a(cpg.oc, new jj(cjg.b.e, true));
      dax.a(cpg.oe, new jj(cjg.b.f, true));
      dax.a(cpg.oi, new jj(cjg.b.h, true));
      dax.a(cpg.ok, new jj(cjg.b.i, true));
      jl $$3 = new jk() {
         private final jk c = new jk();

         @Override
         public cpd a(ji $$0, cpd $$1) {
            cnp $$2 = (cnp)$$1.d();
            hz $$3 = $$0.c().a($$0.d().c(dax.b));
            cvr $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cpd(cpg.qx);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dax.a(cpg.qz, $$3);
      dax.a(cpg.qy, $$3);
      dax.a(cpg.qA, $$3);
      dax.a(cpg.qF, $$3);
      dax.a(cpg.qG, $$3);
      dax.a(cpg.qE, $$3);
      dax.a(cpg.qH, $$3);
      dax.a(cpg.qI, $$3);
      dax.a(cpg.qJ, $$3);
      dax.a(cpg.qx, new jk() {
         private final jk c = new jk();

         @Override
         public cpd a(ji $$0, cpd $$1) {
            cvs $$2 = $$0.b();
            hz $$3 = $$0.c().a($$0.d().c(dax.b));
            dlj $$4 = $$2.a_($$3);
            if ($$4.b() instanceof cyz $$6) {
               cpd $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dpw.y, $$3);
                  coy $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new cpd($$8);
                  } else {
                     if ($$0.e().a(new cpd($$8)) < 0) {
                        this.c.dispense($$0, new cpd($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dax.a(cpg.or, new jm() {
         @Override
         protected cpd a(ji $$0, cpd $$1) {
            cvr $$2 = $$0.b();
            this.a(true);
            ie $$3 = $$0.d().c(dax.b);
            hz $$4 = $$0.c().a($$3);
            dlj $$5 = $$2.a_($$4);
            if (cyf.a($$2, $$4, $$3)) {
               $$2.b($$4, cyf.a($$2, $$4));
               $$2.a(null, dpw.i, $$4);
            } else if (czg.h($$5) || czh.g($$5) || czi.g($$5)) {
               $$2.b($$4, $$5.a(dlz.r, Boolean.valueOf(true)));
               $$2.a(null, dpw.c, $$4);
            } else if ($$5.b() instanceof dha) {
               dha.a($$2, $$4);
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
      dax.a(cpg.rx, new jm() {
         @Override
         protected cpd a(ji $$0, cpd $$1) {
            this.a(true);
            cvr $$2 = $$0.b();
            hz $$3 = $$0.c().a($$0.d().c(dax.b));
            if (!cmy.a($$1, $$2, $$3) && !cmy.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dax.a(cyu.ck, new jk() {
         @Override
         protected cpd a(ji $$0, cpd $$1) {
            cvr $$2 = $$0.b();
            hz $$3 = $$0.c().a($$0.d().c(dax.b));
            cdx $$4 = new cdx($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dr(), $$4.dt(), $$4.dx(), atl.yR, atm.e, 1.0F, 1.0F);
            $$2.a(null, dpw.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      jl $$4 = new jm() {
         @Override
         protected cpd a(ji $$0, cpd $$1) {
            this.a(cmn.a($$0, $$1));
            return $$1;
         }
      };
      dax.a(cpg.ul, $$4);
      dax.a(cpg.uk, $$4);
      dax.a(cpg.um, $$4);
      dax.a(cpg.uh, $$4);
      dax.a(cpg.un, $$4);
      dax.a(cpg.uj, $$4);
      dax.a(cpg.ui, new jm() {
         @Override
         protected cpd a(ji $$0, cpd $$1) {
            cvr $$2 = $$0.b();
            ie $$3 = $$0.d().c(dax.b);
            hz $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dij.b($$2, $$4, $$1)) {
               $$2.a($$4, cyu.gG.o().a(dft.e, Integer.valueOf(dmp.a($$3))), 3);
               $$2.a(null, dpw.i, $$4);
               dix $$5 = $$2.c_($$4);
               if ($$5 instanceof dki) {
                  dij.a($$2, $$4, (dki)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cmn.a($$0, $$1));
            }

            return $$1;
         }
      });
      dax.a(cyu.ee, new jm() {
         @Override
         protected cpd a(ji $$0, cpd $$1) {
            cvr $$2 = $$0.b();
            hz $$3 = $$0.c().a($$0.d().c(dax.b));
            czm $$4 = (czm)cyu.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dpw.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cmn.a($$0, $$1));
            }

            return $$1;
         }
      });
      dax.a(cyu.kP.j(), new jo());

      for (cnr $$5 : cnr.values()) {
         dax.a(dfq.a($$5).j(), new jo());
      }

      dax.a(cpg.sk.j(), new jm() {
         private final jk c = new jk();

         private cpd a(ji $$0, cpd $$1, cpd $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.b().a(null, dpw.y, $$0.c());
               return $$2.q();
            } else {
               if ($$0.e().a($$2.q()) < 0) {
                  this.c.dispense($$0, $$2.q());
               }

               return $$1;
            }
         }

         @Override
         public cpd a(ji $$0, cpd $$1) {
            this.a(false);
            aow $$2 = $$0.b();
            hz $$3 = $$0.c().a($$0.d().c(dax.b));
            dlj $$4 = $$2.a_($$3);
            if ($$4.a(aua.aF, $$0x -> $$0x.b(cym.c) && $$0x.b() instanceof cym) && $$4.c(cym.c) >= 5) {
               ((cym)$$4.b()).a($$2, $$4, $$3, null, diu.b.b);
               this.a(true);
               return this.a($$0, $$1, new cpd(cpg.wt));
            } else if ($$2.b_($$3).a(auf.a)) {
               this.a(true);
               return this.a($$0, $$1, crb.a(new cpd(cpg.sj), crc.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dax.a(cpg.ft, new jm() {
         @Override
         public cpd a(ji $$0, cpd $$1) {
            ie $$2 = $$0.d().c(dax.b);
            hz $$3 = $$0.c().a($$2);
            cvr $$4 = $$0.b();
            dlj $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(cyu.pl)) {
               if ($$5.c(dez.d) != 4) {
                  dez.a(null, $$4, $$3, $$5);
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
      dax.a(cpg.rU.j(), new jn());
      dax.a(cpg.xl.j(), new jm() {
         @Override
         protected cpd a(ji $$0, cpd $$1) {
            aow $$2 = $$0.b();
            hz $$3 = $$0.c().a($$0.d().c(dax.b));
            List<cbe> $$4 = $$2.a(cbe.class, new enu($$3), bnv.f);
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
      dax.a(cpg.wq, new jm() {
         @Override
         public cpd a(ji $$0, cpd $$1) {
            hz $$2 = $$0.c().a($$0.d().c(dax.b));
            cvr $$3 = $$0.b();
            dlj $$4 = $$3.a_($$2);
            Optional<dlj> $$5 = cot.b($$4);
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
      dax.a(cpg.sj, new jk() {
         private final jk c = new jk();

         @Override
         public cpd a(ji $$0, cpd $$1) {
            if (!crb.d($$1).a(crc.c)) {
               return this.c.dispense($$0, $$1);
            } else {
               aow $$2 = $$0.b();
               hz $$3 = $$0.c();
               hz $$4 = $$0.c().a($$0.d().c(dax.b));
               if (!$$2.a_($$4).a(aua.cb)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(jz.aj, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, atl.cu, atm.e, 1.0F, 1.0F);
                  $$2.a(null, dpw.z, $$3);
                  $$2.b($$4, cyu.sI.o());
                  return new cpd(cpg.sk);
               }
            }
         }
      });
   }

   static enz a(ji $$0, bnw<?> $$1, ie $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
