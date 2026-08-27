import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface ih {
   Logger a = LogUtils.getLogger();
   ih b = ($$0, $$1) -> $$1;

   cjl dispense(id var1, cjl var2);

   static void c() {
      cvf.a(cjo.nH, new ic() {
         @Override
         protected ccs a(cqb $$0, ho $$1, cjl $$2) {
            cci $$3 = new cci($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = ccg.a.b;
            return $$3;
         }
      });
      cvf.a(cjo.uw, new ic() {
         @Override
         protected ccs a(cqb $$0, ho $$1, cjl $$2) {
            cci $$3 = new cci($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.a($$2);
            $$3.d = ccg.a.b;
            return $$3;
         }
      });
      cvf.a(cjo.uv, new ic() {
         @Override
         protected ccs a(cqb $$0, ho $$1, cjl $$2) {
            ccg $$3 = new ccx($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = ccg.a.b;
            return $$3;
         }
      });
      cvf.a(cjo.qd, new ic() {
         @Override
         protected ccs a(cqb $$0, ho $$1, cjl $$2) {
            return ac.a(new cda($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cvf.a(cjo.pO, new ic() {
         @Override
         protected ccs a(cqb $$0, ho $$1, cjl $$2) {
            return ac.a(new ccw($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cvf.a(cjo.te, new ic() {
         @Override
         protected ccs a(cqb $$0, ho $$1, cjl $$2) {
            return ac.a(new cdc($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cvf.a(cjo.uu, new ih() {
         @Override
         public cjl dispense(id $$0, cjl $$1) {
            return (new ic() {
               @Override
               protected ccs a(cqb $$0, ho $$1, cjl $$2) {
                  return ac.a(new cdd($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cvf.a(cjo.ux, new ih() {
         @Override
         public cjl dispense(id $$0, cjl $$1) {
            return (new ic() {
               @Override
               protected ccs a(cqb $$0, ho $$1, cjl $$2) {
                  return ac.a(new cdd($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      ig $$0 = new ig() {
         @Override
         public cjl a(id $$0, cjl $$1) {
            ha $$2 = $$0.d().c(cvf.b);
            bja<?> $$3 = ((ckq)$$1.d()).a($$1.v());

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bjq.o, $$2 != ha.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cjl.b;
            }

            $$1.h(1);
            $$0.b().a(null, djn.t, $$0.c());
            return $$1;
         }
      };

      for (ckq $$1 : ckq.h()) {
         cvf.a($$1, $$0);
      }

      cvf.a(cjo.tL, new ig() {
         @Override
         public cjl a(id $$0, cjl $$1) {
            ha $$2 = $$0.d().c(cvf.b);
            gw $$3 = $$0.c().a($$2);
            akt $$4 = $$0.b();
            Consumer<byj> $$5 = bja.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            byj $$6 = bja.d.a($$4, $$1.v(), $$5, $$3, bjq.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      cvf.a(cjo.mZ, new ii() {
         @Override
         public cjl a(id $$0, cjl $$1) {
            gw $$2 = $$0.c().a($$0.d().c(cvf.b));
            List<bjm> $$3 = $$0.b().a(bjm.class, new ehc($$2), $$0x -> !($$0x instanceof bkc $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((bkc)$$3.get(0)).a(aph.e);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      ig $$2 = new ii() {
         @Override
         protected cjl a(id $$0, cjl $$1) {
            gw $$2 = $$0.c().a($$0.d().c(cvf.b));

            for (bww $$4 : $$0.b().a(bww.class, new ehc($$2), $$0x -> $$0x.bv() && $$0x.gN())) {
               if ($$4.l($$1) && !$$4.gO() && $$4.gt()) {
                  $$4.a_(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      cvf.a(cjo.tP, $$2);
      cvf.a(cjo.tM, $$2);
      cvf.a(cjo.tN, $$2);
      cvf.a(cjo.tO, $$2);
      cvf.a(cjo.hi, $$2);
      cvf.a(cjo.hj, $$2);
      cvf.a(cjo.hr, $$2);
      cvf.a(cjo.ht, $$2);
      cvf.a(cjo.hu, $$2);
      cvf.a(cjo.hx, $$2);
      cvf.a(cjo.hp, $$2);
      cvf.a(cjo.hv, $$2);
      cvf.a(cjo.hl, $$2);
      cvf.a(cjo.hq, $$2);
      cvf.a(cjo.hn, $$2);
      cvf.a(cjo.hk, $$2);
      cvf.a(cjo.ho, $$2);
      cvf.a(cjo.hs, $$2);
      cvf.a(cjo.hw, $$2);
      cvf.a(cjo.hm, $$2);
      cvf.a(cjo.er, new ii() {
         @Override
         public cjl a(id $$0, cjl $$1) {
            gw $$2 = $$0.c().a($$0.d().c(cvf.b));

            for (bwv $$4 : $$0.b().a(bwv.class, new ehc($$2), $$0x -> $$0x.bv() && !$$0x.t())) {
               if ($$4.gt() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      cvf.a(cjo.tA, new ig() {
         @Override
         public cjl a(id $$0, cjl $$1) {
            ha $$2 = $$0.d().c(cvf.b);
            ehh $$3 = ih.a($$0, bja.M, $$2);
            ccn $$4 = new ccn($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
            $$4.c((double)$$2.j(), (double)$$2.k(), (double)$$2.l(), 0.5F, 1.0F);
            $$0.b().b($$4);
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(id $$0) {
            $$0.b().c(1004, $$0.c(), 0);
         }
      });
      cvf.a(cjo.tf, new ig() {
         @Override
         public cjl a(id $$0, cjl $$1) {
            ha $$2 = $$0.d().c(cvf.b);
            ho $$3 = cvf.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            cqb $$7 = $$0.b();
            ash $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            ccv $$12 = new ccv($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(id $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      cvf.a(cjo.ni, new ie(cdt.b.a));
      cvf.a(cjo.nk, new ie(cdt.b.b));
      cvf.a(cjo.nm, new ie(cdt.b.c));
      cvf.a(cjo.no, new ie(cdt.b.d));
      cvf.a(cjo.nu, new ie(cdt.b.g));
      cvf.a(cjo.nq, new ie(cdt.b.e));
      cvf.a(cjo.ns, new ie(cdt.b.f));
      cvf.a(cjo.nw, new ie(cdt.b.h));
      cvf.a(cjo.ny, new ie(cdt.b.i));
      cvf.a(cjo.nj, new ie(cdt.b.a, true));
      cvf.a(cjo.nl, new ie(cdt.b.b, true));
      cvf.a(cjo.nn, new ie(cdt.b.c, true));
      cvf.a(cjo.np, new ie(cdt.b.d, true));
      cvf.a(cjo.nv, new ie(cdt.b.g, true));
      cvf.a(cjo.nr, new ie(cdt.b.e, true));
      cvf.a(cjo.nt, new ie(cdt.b.f, true));
      cvf.a(cjo.nx, new ie(cdt.b.h, true));
      cvf.a(cjo.nz, new ie(cdt.b.i, true));
      ih $$3 = new ig() {
         private final ig c = new ig();

         @Override
         public cjl a(id $$0, cjl $$1) {
            chx $$2 = (chx)$$1.d();
            gw $$3 = $$0.c().a($$0.d().c(cvf.b));
            cqb $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cjl(cjo.pK);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      cvf.a(cjo.pM, $$3);
      cvf.a(cjo.pL, $$3);
      cvf.a(cjo.pN, $$3);
      cvf.a(cjo.pS, $$3);
      cvf.a(cjo.pT, $$3);
      cvf.a(cjo.pR, $$3);
      cvf.a(cjo.pU, $$3);
      cvf.a(cjo.pV, $$3);
      cvf.a(cjo.pW, $$3);
      cvf.a(cjo.pK, new ig() {
         private final ig c = new ig();

         @Override
         public cjl a(id $$0, cjl $$1) {
            cqc $$2 = $$0.b();
            gw $$3 = $$0.c().a($$0.d().c(cvf.b));
            dfd $$4 = $$2.a_($$3);
            if ($$4.b() instanceof ctj $$6) {
               cjl $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, djn.y, $$3);
                  cjg $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new cjl($$8);
                  } else {
                     if ($$0.e().a(new cjl($$8)) < 0) {
                        this.c.dispense($$0, new cjl($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cvf.a(cjo.nE, new ii() {
         @Override
         protected cjl a(id $$0, cjl $$1) {
            cqb $$2 = $$0.b();
            this.a(true);
            ha $$3 = $$0.d().c(cvf.b);
            gw $$4 = $$0.c().a($$3);
            dfd $$5 = $$2.a_($$4);
            if (csp.a($$2, $$4, $$3)) {
               $$2.b($$4, csp.a($$2, $$4));
               $$2.a(null, djn.i, $$4);
            } else if (ctq.h($$5) || ctr.g($$5) || cts.g($$5)) {
               $$2.b($$4, $$5.a(dft.r, Boolean.valueOf(true)));
               $$2.a(null, djn.c, $$4);
            } else if ($$5.b() instanceof dbj) {
               dbj.a($$2, $$4);
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
      cvf.a(cjo.qK, new ii() {
         @Override
         protected cjl a(id $$0, cjl $$1) {
            this.a(true);
            cqb $$2 = $$0.b();
            gw $$3 = $$0.c().a($$0.d().c(cvf.b));
            if (!chg.a($$1, $$2, $$3) && !chg.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 0);
            }

            return $$1;
         }
      });
      cvf.a(cte.ck, new ig() {
         @Override
         protected cjl a(id $$0, cjl $$1) {
            cqb $$2 = $$0.b();
            gw $$3 = $$0.c().a($$0.d().c(cvf.b));
            byu $$4 = new byu($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dq(), $$4.ds(), $$4.dw(), apg.xL, aph.e, 1.0F, 1.0F);
            $$2.a(null, djn.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      ih $$4 = new ii() {
         @Override
         protected cjl a(id $$0, cjl $$1) {
            this.a(cgv.a($$0, $$1));
            return $$1;
         }
      };
      cvf.a(cjo.tv, $$4);
      cvf.a(cjo.tu, $$4);
      cvf.a(cjo.tw, $$4);
      cvf.a(cjo.tr, $$4);
      cvf.a(cjo.tx, $$4);
      cvf.a(cjo.tt, $$4);
      cvf.a(cjo.ts, new ii() {
         @Override
         protected cjl a(id $$0, cjl $$1) {
            cqb $$2 = $$0.b();
            ha $$3 = $$0.d().c(cvf.b);
            gw $$4 = $$0.c().a($$3);
            if ($$2.t($$4) && dcl.b($$2, $$4, $$1)) {
               $$2.a($$4, cte.gG.o().a(dac.e, Integer.valueOf(dgj.a($$3))), 3);
               $$2.a(null, djn.i, $$4);
               dcz $$5 = $$2.c_($$4);
               if ($$5 instanceof dej) {
                  dcl.a($$2, $$4, (dej)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cgv.a($$0, $$1));
            }

            return $$1;
         }
      });
      cvf.a(cte.ee, new ii() {
         @Override
         protected cjl a(id $$0, cjl $$1) {
            cqb $$2 = $$0.b();
            gw $$3 = $$0.c().a($$0.d().c(cvf.b));
            ctw $$4 = (ctw)cte.ee;
            if ($$2.t($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, djn.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cgv.a($$0, $$1));
            }

            return $$1;
         }
      });
      cvf.a(cte.kP.k(), new ik());

      for (chz $$5 : chz.values()) {
         cvf.a(czz.a($$5).k(), new ik());
      }

      cvf.a(cjo.rw.k(), new ii() {
         private final ig c = new ig();

         private cjl a(id $$0, cjl $$1, cjl $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.b().a(null, djn.y, $$0.c());
               return $$2.p();
            } else {
               if ($$0.e().a($$2.p()) < 0) {
                  this.c.dispense($$0, $$2.p());
               }

               return $$1;
            }
         }

         @Override
         public cjl a(id $$0, cjl $$1) {
            this.a(false);
            akt $$2 = $$0.b();
            gw $$3 = $$0.c().a($$0.d().c(cvf.b));
            dfd $$4 = $$2.a_($$3);
            if ($$4.a(apv.aF, $$0x -> $$0x.b(csw.c) && $$0x.b() instanceof csw) && $$4.c(csw.c) >= 5) {
               ((csw)$$4.b()).a($$2, $$4, $$3, null, dcw.b.b);
               this.a(true);
               return this.a($$0, $$1, new cjl(cjo.vD));
            } else if ($$2.b_($$3).a(aqa.a)) {
               this.a(true);
               return this.a($$0, $$1, clk.a(new cjl(cjo.rv), cll.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cvf.a(cjo.eY, new ii() {
         @Override
         public cjl a(id $$0, cjl $$1) {
            ha $$2 = $$0.d().c(cvf.b);
            gw $$3 = $$0.c().a($$2);
            cqb $$4 = $$0.b();
            dfd $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(cte.pl)) {
               if ($$5.c(czi.d) != 4) {
                  czi.a(null, $$4, $$3, $$5);
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
      cvf.a(cjo.rg.k(), new ij());
      cvf.a(cjo.vA, new ii() {
         @Override
         public cjl a(id $$0, cjl $$1) {
            gw $$2 = $$0.c().a($$0.d().c(cvf.b));
            cqb $$3 = $$0.b();
            dfd $$4 = $$3.a_($$2);
            Optional<dfd> $$5 = cja.b($$4);
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
      cvf.a(cjo.rv, new ig() {
         private final ig c = new ig();

         @Override
         public cjl a(id $$0, cjl $$1) {
            if (clk.d($$1) != cll.c) {
               return this.c.dispense($$0, $$1);
            } else {
               akt $$2 = $$0.b();
               gw $$3 = $$0.c();
               gw $$4 = $$0.c().a($$0.d().c(cvf.b));
               if (!$$2.a_($$4).a(apv.ca)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(iv.ag, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, apg.ch, aph.e, 1.0F, 1.0F);
                  $$2.a(null, djn.z, $$3);
                  $$2.b($$4, cte.rH.o());
                  return new cjl(cjo.rw);
               }
            }
         }
      });
   }

   static ehh a(id $$0, bja<?> $$1, ha $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
