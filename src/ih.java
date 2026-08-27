import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface ih {
   Logger a = LogUtils.getLogger();
   ih b = ($$0, $$1) -> $$1;

   cix dispense(gv var1, cix var2);

   static void c() {
      cum.a(cja.nH, new id() {
         @Override
         protected cce a(cpl $$0, ho $$1, cix $$2) {
            cbu $$3 = new cbu($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = cbs.a.b;
            return $$3;
         }
      });
      cum.a(cja.uw, new id() {
         @Override
         protected cce a(cpl $$0, ho $$1, cix $$2) {
            cbu $$3 = new cbu($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.a($$2);
            $$3.d = cbs.a.b;
            return $$3;
         }
      });
      cum.a(cja.uv, new id() {
         @Override
         protected cce a(cpl $$0, ho $$1, cix $$2) {
            cbs $$3 = new ccj($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = cbs.a.b;
            return $$3;
         }
      });
      cum.a(cja.qd, new id() {
         @Override
         protected cce a(cpl $$0, ho $$1, cix $$2) {
            return ac.a(new ccm($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cum.a(cja.pO, new id() {
         @Override
         protected cce a(cpl $$0, ho $$1, cix $$2) {
            return ac.a(new cci($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cum.a(cja.te, new id() {
         @Override
         protected cce a(cpl $$0, ho $$1, cix $$2) {
            return ac.a(new cco($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cum.a(cja.uu, new ih() {
         @Override
         public cix dispense(gv $$0, cix $$1) {
            return (new id() {
               @Override
               protected cce a(cpl $$0, ho $$1, cix $$2) {
                  return ac.a(new ccp($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cum.a(cja.ux, new ih() {
         @Override
         public cix dispense(gv $$0, cix $$1) {
            return (new id() {
               @Override
               protected cce a(cpl $$0, ho $$1, cix $$2) {
                  return ac.a(new ccp($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
         public cix a(gv $$0, cix $$1) {
            ha $$2 = $$0.e().c(cum.a);
            bim<?> $$3 = ((ckc)$$1.d()).a($$1.v());

            try {
               $$3.a($$0.g(), $$1, null, $$0.d().a($$2), bjc.o, $$2 != ha.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.d(), var6);
               return cix.b;
            }

            $$1.h(1);
            $$0.g().a(null, djj.t, $$0.d());
            return $$1;
         }
      };

      for (ckc $$1 : ckc.h()) {
         cum.a($$1, $$0);
      }

      cum.a(cja.tL, new ig() {
         @Override
         public cix a(gv $$0, cix $$1) {
            ha $$2 = $$0.e().c(cum.a);
            gu $$3 = $$0.d().a($$2);
            akk $$4 = $$0.g();
            Consumer<bxv> $$5 = bim.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            bxv $$6 = bim.d.a($$4, $$1.v(), $$5, $$3, bjc.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      cum.a(cja.mZ, new ii() {
         @Override
         public cix a(gv $$0, cix $$1) {
            gu $$2 = $$0.d().a($$0.e().c(cum.a));
            List<biy> $$3 = $$0.g().a(biy.class, new egy($$2), $$0x -> !($$0x instanceof bjo $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((bjo)$$3.get(0)).a(aox.e);
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
         protected cix a(gv $$0, cix $$1) {
            gu $$2 = $$0.d().a($$0.e().c(cum.a));

            for (bwi $$4 : $$0.g().a(bwi.class, new egy($$2), $$0x -> $$0x.bv() && $$0x.gJ())) {
               if ($$4.l($$1) && !$$4.gK() && $$4.gp()) {
                  $$4.a_(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      cum.a(cja.tP, $$2);
      cum.a(cja.tM, $$2);
      cum.a(cja.tN, $$2);
      cum.a(cja.tO, $$2);
      cum.a(cja.hi, $$2);
      cum.a(cja.hj, $$2);
      cum.a(cja.hr, $$2);
      cum.a(cja.ht, $$2);
      cum.a(cja.hu, $$2);
      cum.a(cja.hx, $$2);
      cum.a(cja.hp, $$2);
      cum.a(cja.hv, $$2);
      cum.a(cja.hl, $$2);
      cum.a(cja.hq, $$2);
      cum.a(cja.hn, $$2);
      cum.a(cja.hk, $$2);
      cum.a(cja.ho, $$2);
      cum.a(cja.hs, $$2);
      cum.a(cja.hw, $$2);
      cum.a(cja.hm, $$2);
      cum.a(cja.er, new ii() {
         @Override
         public cix a(gv $$0, cix $$1) {
            gu $$2 = $$0.d().a($$0.e().c(cum.a));

            for (bwh $$4 : $$0.g().a(bwh.class, new egy($$2), $$0x -> $$0x.bv() && !$$0x.q())) {
               if ($$4.gp() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      cum.a(cja.tA, new ig() {
         @Override
         public cix a(gv $$0, cix $$1) {
            ha $$2 = $$0.e().c(cum.a);
            cbz $$3 = new cbz($$0.g(), $$1, $$0.a(), $$0.b(), $$0.a(), true);
            ih.a($$0, $$3, $$2);
            $$3.c((double)$$2.j(), (double)$$2.k(), (double)$$2.l(), 0.5F, 1.0F);
            $$0.g().b($$3);
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(gv $$0) {
            $$0.g().c(1004, $$0.d(), 0);
         }
      });
      cum.a(cja.tf, new ig() {
         @Override
         public cix a(gv $$0, cix $$1) {
            ha $$2 = $$0.e().c(cum.a);
            ho $$3 = cum.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            cpl $$7 = $$0.g();
            aru $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            cch $$12 = new cch($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(gv $$0) {
            $$0.g().c(1018, $$0.d(), 0);
         }
      });
      cum.a(cja.ni, new ie(cdf.b.a));
      cum.a(cja.nk, new ie(cdf.b.b));
      cum.a(cja.nm, new ie(cdf.b.c));
      cum.a(cja.no, new ie(cdf.b.d));
      cum.a(cja.nu, new ie(cdf.b.g));
      cum.a(cja.nq, new ie(cdf.b.e));
      cum.a(cja.ns, new ie(cdf.b.f));
      cum.a(cja.nw, new ie(cdf.b.h));
      cum.a(cja.ny, new ie(cdf.b.i));
      cum.a(cja.nj, new ie(cdf.b.a, true));
      cum.a(cja.nl, new ie(cdf.b.b, true));
      cum.a(cja.nn, new ie(cdf.b.c, true));
      cum.a(cja.np, new ie(cdf.b.d, true));
      cum.a(cja.nv, new ie(cdf.b.g, true));
      cum.a(cja.nr, new ie(cdf.b.e, true));
      cum.a(cja.nt, new ie(cdf.b.f, true));
      cum.a(cja.nx, new ie(cdf.b.h, true));
      cum.a(cja.nz, new ie(cdf.b.i, true));
      ih $$3 = new ig() {
         private final ig c = new ig();

         @Override
         public cix a(gv $$0, cix $$1) {
            chj $$2 = (chj)$$1.d();
            gu $$3 = $$0.d().a($$0.e().c(cum.a));
            cpl $$4 = $$0.g();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cix(cja.pK);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      cum.a(cja.pM, $$3);
      cum.a(cja.pL, $$3);
      cum.a(cja.pN, $$3);
      cum.a(cja.pS, $$3);
      cum.a(cja.pT, $$3);
      cum.a(cja.pR, $$3);
      cum.a(cja.pU, $$3);
      cum.a(cja.pV, $$3);
      cum.a(cja.pW, $$3);
      cum.a(cja.pK, new ig() {
         private final ig c = new ig();

         @Override
         public cix a(gv $$0, cix $$1) {
            cpm $$2 = $$0.g();
            gu $$3 = $$0.d().a($$0.e().c(cum.a));
            dez $$4 = $$2.a_($$3);
            if ($$4.b() instanceof csr $$6) {
               cix $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, djj.y, $$3);
                  cis $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new cix($$8);
                  } else {
                     if ($$0.<ddc>f().a(new cix($$8)) < 0) {
                        this.c.dispense($$0, new cix($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cum.a(cja.nE, new ii() {
         @Override
         protected cix a(gv $$0, cix $$1) {
            cpl $$2 = $$0.g();
            this.a(true);
            ha $$3 = $$0.e().c(cum.a);
            gu $$4 = $$0.d().a($$3);
            dez $$5 = $$2.a_($$4);
            if (crz.a($$2, $$4, $$3)) {
               $$2.b($$4, crz.a($$2, $$4));
               $$2.a(null, djj.i, $$4);
            } else if (csy.h($$5) || csz.g($$5) || cta.g($$5)) {
               $$2.b($$4, $$5.a(dfp.r, Boolean.valueOf(true)));
               $$2.a(null, djj.c, $$4);
            } else if ($$5.b() instanceof dav) {
               dav.a($$2, $$4);
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
      cum.a(cja.qK, new ii() {
         @Override
         protected cix a(gv $$0, cix $$1) {
            this.a(true);
            cpl $$2 = $$0.g();
            gu $$3 = $$0.d().a($$0.e().c(cum.a));
            if (!cgs.a($$1, $$2, $$3) && !cgs.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 0);
            }

            return $$1;
         }
      });
      cum.a(csm.ck, new ig() {
         @Override
         protected cix a(gv $$0, cix $$1) {
            cpl $$2 = $$0.g();
            gu $$3 = $$0.d().a($$0.e().c(cum.a));
            byg $$4 = new byg($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dp(), $$4.dr(), $$4.dv(), aow.xL, aox.e, 1.0F, 1.0F);
            $$2.a(null, djj.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      ih $$4 = new ii() {
         @Override
         protected cix a(gv $$0, cix $$1) {
            this.a(cgh.a($$0, $$1));
            return $$1;
         }
      };
      cum.a(cja.tv, $$4);
      cum.a(cja.tu, $$4);
      cum.a(cja.tw, $$4);
      cum.a(cja.tr, $$4);
      cum.a(cja.tx, $$4);
      cum.a(cja.tt, $$4);
      cum.a(cja.ts, new ii() {
         @Override
         protected cix a(gv $$0, cix $$1) {
            cpl $$2 = $$0.g();
            ha $$3 = $$0.e().c(cum.a);
            gu $$4 = $$0.d().a($$3);
            if ($$2.t($$4) && dbx.b($$2, $$4, $$1)) {
               $$2.a($$4, csm.gG.n().a(czn.b, Integer.valueOf(dgf.a($$3))), 3);
               $$2.a(null, djj.i, $$4);
               dcl $$5 = $$2.c_($$4);
               if ($$5 instanceof ddv) {
                  dbx.a($$2, $$4, (ddv)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cgh.a($$0, $$1));
            }

            return $$1;
         }
      });
      cum.a(csm.ef, new ii() {
         @Override
         protected cix a(gv $$0, cix $$1) {
            cpl $$2 = $$0.g();
            gu $$3 = $$0.d().a($$0.e().c(cum.a));
            cte $$4 = (cte)csm.ef;
            if ($$2.t($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.n(), 3);
                  $$2.a(null, djj.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cgh.a($$0, $$1));
            }

            return $$1;
         }
      });
      cum.a(csm.kP.k(), new ik());

      for (chl $$5 : chl.values()) {
         cum.a(czk.a($$5).k(), new ik());
      }

      cum.a(cja.rw.k(), new ii() {
         private final ig c = new ig();

         private cix a(gv $$0, cix $$1, cix $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.g().a(null, djj.y, $$0.d());
               return $$2.p();
            } else {
               if ($$0.<ddc>f().a($$2.p()) < 0) {
                  this.c.dispense($$0, $$2.p());
               }

               return $$1;
            }
         }

         @Override
         public cix a(gv $$0, cix $$1) {
            this.a(false);
            akk $$2 = $$0.g();
            gu $$3 = $$0.d().a($$0.e().c(cum.a));
            dez $$4 = $$2.a_($$3);
            if ($$4.a(apl.aF, $$0x -> $$0x.b(csf.b) && $$0x.b() instanceof csf) && $$4.c(csf.b) >= 5) {
               ((csf)$$4.b()).a($$2, $$4, $$3, null, dci.b.b);
               this.a(true);
               return this.a($$0, $$1, new cix(cja.vD));
            } else if ($$2.b_($$3).a(apq.a)) {
               this.a(true);
               return this.a($$0, $$1, ckw.a(new cix(cja.rv), ckx.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cum.a(cja.eY, new ii() {
         @Override
         public cix a(gv $$0, cix $$1) {
            ha $$2 = $$0.e().c(cum.a);
            gu $$3 = $$0.d().a($$2);
            cpl $$4 = $$0.g();
            dez $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(csm.pl)) {
               if ($$5.c(cys.c) != 4) {
                  cys.a(null, $$4, $$3, $$5);
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
      cum.a(cja.rg.k(), new ij());
      cum.a(cja.vA, new ii() {
         @Override
         public cix a(gv $$0, cix $$1) {
            gu $$2 = $$0.d().a($$0.e().c(cum.a));
            cpl $$3 = $$0.g();
            dez $$4 = $$3.a_($$2);
            Optional<dez> $$5 = cim.b($$4);
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
      cum.a(cja.rv, new ig() {
         private final ig c = new ig();

         @Override
         public cix a(gv $$0, cix $$1) {
            if (ckw.d($$1) != ckx.c) {
               return this.c.dispense($$0, $$1);
            } else {
               akk $$2 = $$0.g();
               gu $$3 = $$0.d();
               gu $$4 = $$0.d().a($$0.e().c(cum.a));
               if (!$$2.a_($$4).a(apl.ca)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(iv.ag, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, aow.ch, aox.e, 1.0F, 1.0F);
                  $$2.a(null, djj.z, $$3);
                  $$2.b($$4, csm.rH.n());
                  return new cix(cja.rw);
               }
            }
         }
      });
   }

   static void a(gv $$0, bii $$1, ha $$2) {
      $$1.e(
         $$0.a() + (double)$$2.j() * (0.5000099999997474 - (double)$$1.df() / 2.0),
         $$0.b() + (double)$$2.k() * (0.5000099999997474 - (double)$$1.dg() / 2.0) - (double)$$1.dg() / 2.0,
         $$0.c() + (double)$$2.l() * (0.5000099999997474 - (double)$$1.df() / 2.0)
      );
   }
}
