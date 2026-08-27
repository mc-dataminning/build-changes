import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface jn {
   Logger a = LogUtils.getLogger();
   jn b = ($$0, $$1) -> $$1;

   cpq dispense(jk var1, cpq var2);

   static void c() {
      dbk.a(cpt.ou, new jj() {
         @Override
         protected cis a(cwe $$0, iv $$1, cpq $$2) {
            cii $$3 = new cii($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cig.a.b;
            return $$3;
         }
      });
      dbk.a(cpt.vm, new jj() {
         @Override
         protected cis a(cwe $$0, iv $$1, cpq $$2) {
            cii $$3 = new cii($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.a($$2);
            $$3.d = cig.a.b;
            return $$3;
         }
      });
      dbk.a(cpt.vl, new jj() {
         @Override
         protected cis a(cwe $$0, iv $$1, cpq $$2) {
            cig $$3 = new ciy($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cig.a.b;
            return $$3;
         }
      });
      dbk.a(cpt.qQ, new jj() {
         @Override
         protected cis a(cwe $$0, iv $$1, cpq $$2) {
            return ac.a(new cjb($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      dbk.a(cpt.qB, new jj() {
         @Override
         protected cis a(cwe $$0, iv $$1, cpq $$2) {
            return ac.a(new cix($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      dbk.a(cpt.tU, new jj() {
         @Override
         protected cis a(cwe $$0, iv $$1, cpq $$2) {
            return ac.a(new cjd($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      dbk.a(cpt.vk, new jn() {
         @Override
         public cpq dispense(jk $$0, cpq $$1) {
            return (new jj() {
               @Override
               protected cis a(cwe $$0, iv $$1, cpq $$2) {
                  return ac.a(new cje($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      dbk.a(cpt.vn, new jn() {
         @Override
         public cpq dispense(jk $$0, cpq $$1) {
            return (new jj() {
               @Override
               protected cis a(cwe $$0, iv $$1, cpq $$2) {
                  return ac.a(new cje($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      jm $$0 = new jm() {
         @Override
         public cpq a(jk $$0, cpq $$1) {
            ih $$2 = $$0.d().c(dbk.b);
            bol<?> $$3 = ((cqv)$$1.d()).a($$1.w());

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bpb.o, $$2 != ih.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cpq.h;
            }

            $$1.h(1);
            $$0.b().a(null, dqr.t, $$0.c());
            return $$1;
         }
      };

      for (cqv $$1 : cqv.h()) {
         dbk.a($$1, $$0);
      }

      dbk.a(cpt.uB, new jm() {
         @Override
         public cpq a(jk $$0, cpq $$1) {
            ih $$2 = $$0.d().c(dbk.b);
            ib $$3 = $$0.c().a($$2);
            apa $$4 = $$0.b();
            Consumer<ceb> $$5 = bol.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            ceb $$6 = bol.e.a($$4, $$5, $$3, bpb.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dbk.a(cpt.nK, new jo() {
         @Override
         public cpq a(jk $$0, cpq $$1) {
            ib $$2 = $$0.c().a($$0.d().c(dbk.b));
            List<box> $$3 = $$0.b().a(box.class, new eoq($$2), $$0x -> !($$0x instanceof bpm $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((bpm)$$3.get(0)).a(atq.e);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      jm $$2 = new jo() {
         @Override
         protected cpq a(jk $$0, cpq $$1) {
            ib $$2 = $$0.c().a($$0.d().c(dbk.b));

            for (cco $$4 : $$0.b().a(cco.class, new eoq($$2), $$0x -> $$0x.bx() && $$0x.fO())) {
               if ($$4.l($$1) && !$$4.fP() && $$4.gA()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dbk.a(cpt.uF, $$2);
      dbk.a(cpt.uC, $$2);
      dbk.a(cpt.uD, $$2);
      dbk.a(cpt.uE, $$2);
      dbk.a(cpt.hD, $$2);
      dbk.a(cpt.hE, $$2);
      dbk.a(cpt.hM, $$2);
      dbk.a(cpt.hO, $$2);
      dbk.a(cpt.hP, $$2);
      dbk.a(cpt.hS, $$2);
      dbk.a(cpt.hK, $$2);
      dbk.a(cpt.hQ, $$2);
      dbk.a(cpt.hG, $$2);
      dbk.a(cpt.hL, $$2);
      dbk.a(cpt.hI, $$2);
      dbk.a(cpt.hF, $$2);
      dbk.a(cpt.hJ, $$2);
      dbk.a(cpt.hN, $$2);
      dbk.a(cpt.hR, $$2);
      dbk.a(cpt.hH, $$2);
      dbk.a(cpt.eM, new jo() {
         @Override
         public cpq a(jk $$0, cpq $$1) {
            ib $$2 = $$0.c().a($$0.d().c(dbk.b));

            for (ccn $$4 : $$0.b().a(ccn.class, new eoq($$2), $$0x -> $$0x.bx() && !$$0x.w())) {
               if ($$4.gA() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dbk.a(cpt.uq, new jm() {
         @Override
         public cpq a(jk $$0, cpq $$1) {
            ih $$2 = $$0.d().c(dbk.b);
            eov $$3 = jn.a($$0, bol.O, $$2);
            cin $$4 = new cin($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
            $$4.c((double)$$2.j(), (double)$$2.k(), (double)$$2.l(), 0.5F, 1.0F);
            $$0.b().b($$4);
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(jk $$0) {
            $$0.b().c(1004, $$0.c(), 0);
         }
      });
      dbk.a(cpt.tV, new jm() {
         @Override
         public cpq a(jk $$0, cpq $$1) {
            ih $$2 = $$0.d().c(dbk.b);
            iv $$3 = dbk.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            cwe $$7 = $$0.b();
            awt $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            ciw $$12 = new ciw($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(jk $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      dbk.a(cpt.nT, new jl(cjv.b.a));
      dbk.a(cpt.nV, new jl(cjv.b.b));
      dbk.a(cpt.nX, new jl(cjv.b.c));
      dbk.a(cpt.nZ, new jl(cjv.b.d));
      dbk.a(cpt.of, new jl(cjv.b.g));
      dbk.a(cpt.ob, new jl(cjv.b.e));
      dbk.a(cpt.od, new jl(cjv.b.f));
      dbk.a(cpt.oh, new jl(cjv.b.h));
      dbk.a(cpt.oj, new jl(cjv.b.i));
      dbk.a(cpt.nU, new jl(cjv.b.a, true));
      dbk.a(cpt.nW, new jl(cjv.b.b, true));
      dbk.a(cpt.nY, new jl(cjv.b.c, true));
      dbk.a(cpt.oa, new jl(cjv.b.d, true));
      dbk.a(cpt.og, new jl(cjv.b.g, true));
      dbk.a(cpt.oc, new jl(cjv.b.e, true));
      dbk.a(cpt.oe, new jl(cjv.b.f, true));
      dbk.a(cpt.oi, new jl(cjv.b.h, true));
      dbk.a(cpt.ok, new jl(cjv.b.i, true));
      jn $$3 = new jm() {
         private final jm c = new jm();

         @Override
         public cpq a(jk $$0, cpq $$1) {
            coe $$2 = (coe)$$1.d();
            ib $$3 = $$0.c().a($$0.d().c(dbk.b));
            cwe $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cpq(cpt.qx);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dbk.a(cpt.qz, $$3);
      dbk.a(cpt.qy, $$3);
      dbk.a(cpt.qA, $$3);
      dbk.a(cpt.qF, $$3);
      dbk.a(cpt.qG, $$3);
      dbk.a(cpt.qE, $$3);
      dbk.a(cpt.qH, $$3);
      dbk.a(cpt.qI, $$3);
      dbk.a(cpt.qJ, $$3);
      dbk.a(cpt.qx, new jm() {
         private final jm c = new jm();

         @Override
         public cpq a(jk $$0, cpq $$1) {
            cwf $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(dbk.b));
            dme $$4 = $$2.a_($$3);
            if ($$4.b() instanceof czm $$6) {
               cpq $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dqr.y, $$3);
                  cpl $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new cpq($$8);
                  } else {
                     if ($$0.e().a(new cpq($$8)) < 0) {
                        this.c.dispense($$0, new cpq($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dbk.a(cpt.or, new jo() {
         @Override
         protected cpq a(jk $$0, cpq $$1) {
            cwe $$2 = $$0.b();
            this.a(true);
            ih $$3 = $$0.d().c(dbk.b);
            ib $$4 = $$0.c().a($$3);
            dme $$5 = $$2.a_($$4);
            if (cys.a($$2, $$4, $$3)) {
               $$2.b($$4, cys.a($$2, $$4));
               $$2.a(null, dqr.i, $$4);
            } else if (czt.h($$5) || czu.g($$5) || czv.g($$5)) {
               $$2.b($$4, $$5.a(dmu.r, Boolean.valueOf(true)));
               $$2.a(null, dqr.c, $$4);
            } else if ($$5.b() instanceof dhn) {
               dhn.a($$2, $$4);
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
      dbk.a(cpt.rx, new jo() {
         @Override
         protected cpq a(jk $$0, cpq $$1) {
            this.a(true);
            cwe $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(dbk.b));
            if (!cnn.a($$1, $$2, $$3) && !cnn.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dbk.a(czh.ck, new jm() {
         @Override
         protected cpq a(jk $$0, cpq $$1) {
            cwe $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(dbk.b));
            cem $$4 = new cem($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.do(), $$4.dq(), $$4.du(), atp.yR, atq.e, 1.0F, 1.0F);
            $$2.a(null, dqr.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      jn $$4 = new jo() {
         @Override
         protected cpq a(jk $$0, cpq $$1) {
            this.a(cnc.a($$0, $$1));
            return $$1;
         }
      };
      dbk.a(cpt.ul, $$4);
      dbk.a(cpt.uk, $$4);
      dbk.a(cpt.um, $$4);
      dbk.a(cpt.uh, $$4);
      dbk.a(cpt.un, $$4);
      dbk.a(cpt.uj, $$4);
      dbk.a(cpt.ui, new jo() {
         @Override
         protected cpq a(jk $$0, cpq $$1) {
            cwe $$2 = $$0.b();
            ih $$3 = $$0.d().c(dbk.b);
            ib $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dix.b($$2, $$4, $$1)) {
               $$2.a($$4, czh.gG.o().a(dgg.e, Integer.valueOf(dnk.a($$3))), 3);
               $$2.a(null, dqr.i, $$4);
               djl $$5 = $$2.c_($$4);
               if ($$5 instanceof dkw) {
                  dix.a($$2, $$4, (dkw)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cnc.a($$0, $$1));
            }

            return $$1;
         }
      });
      dbk.a(czh.ee, new jo() {
         @Override
         protected cpq a(jk $$0, cpq $$1) {
            cwe $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(dbk.b));
            czz $$4 = (czz)czh.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dqr.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cnc.a($$0, $$1));
            }

            return $$1;
         }
      });
      dbk.a(czh.kP.l(), new jq());

      for (cog $$5 : cog.values()) {
         dbk.a(dgd.a($$5).l(), new jq());
      }

      dbk.a(cpt.sk.l(), new jo() {
         private final jm c = new jm();

         private cpq a(jk $$0, cpq $$1, cpq $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.b().a(null, dqr.y, $$0.c());
               return $$2.q();
            } else {
               if ($$0.e().a($$2.q()) < 0) {
                  this.c.dispense($$0, $$2.q());
               }

               return $$1;
            }
         }

         @Override
         public cpq a(jk $$0, cpq $$1) {
            this.a(false);
            apa $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(dbk.b));
            dme $$4 = $$2.a_($$3);
            if ($$4.a(aue.aF, $$0x -> $$0x.b(cyz.c) && $$0x.b() instanceof cyz) && $$4.c(cyz.c) >= 5) {
               ((cyz)$$4.b()).a($$2, $$4, $$3, null, dji.b.b);
               this.a(true);
               return this.a($$0, $$1, new cpq(cpt.wt));
            } else if ($$2.b_($$3).a(auj.a)) {
               this.a(true);
               return this.a($$0, $$1, cro.a(new cpq(cpt.sj), crp.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dbk.a(cpt.ft, new jo() {
         @Override
         public cpq a(jk $$0, cpq $$1) {
            ih $$2 = $$0.d().c(dbk.b);
            ib $$3 = $$0.c().a($$2);
            cwe $$4 = $$0.b();
            dme $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(czh.pl)) {
               if ($$5.c(dfm.d) != 4) {
                  dfm.a(null, $$4, $$3, $$5);
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
      dbk.a(cpt.rU.l(), new jp());
      dbk.a(cpt.xl.l(), new jo() {
         @Override
         protected cpq a(jk $$0, cpq $$1) {
            apa $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(dbk.b));
            List<cbt> $$4 = $$2.a(cbt.class, new eoq($$3), bok.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               $$4.get(0).gt();
               $$1.a(16, $$2.F_(), null, () -> {
                  $$1.h(1);
                  $$1.b(0);
               });
               return $$1;
            }
         }
      });
      dbk.a(cpt.wq, new jo() {
         @Override
         public cpq a(jk $$0, cpq $$1) {
            ib $$2 = $$0.c().a($$0.d().c(dbk.b));
            cwe $$3 = $$0.b();
            dme $$4 = $$3.a_($$2);
            Optional<dme> $$5 = cpg.b($$4);
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
      dbk.a(cpt.sj, new jm() {
         private final jm c = new jm();

         @Override
         public cpq a(jk $$0, cpq $$1) {
            if (!cro.d($$1).a(crp.c)) {
               return this.c.dispense($$0, $$1);
            } else {
               apa $$2 = $$0.b();
               ib $$3 = $$0.c();
               ib $$4 = $$0.c().a($$0.d().c(dbk.b));
               if (!$$2.a_($$4).a(aue.cb)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(kb.aj, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, atp.cu, atq.e, 1.0F, 1.0F);
                  $$2.a(null, dqr.z, $$3);
                  $$2.b($$4, czh.sI.o());
                  return new cpq(cpt.sk);
               }
            }
         }
      });
   }

   static eov a(jk $$0, bol<?> $$1, ih $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
