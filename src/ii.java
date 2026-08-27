import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface ii {
   Logger a = LogUtils.getLogger();
   ii b = ($$0, $$1) -> $$1;

   ciw dispense(gw var1, ciw var2);

   static void c() {
      cul.a(ciz.nH, new ie() {
         @Override
         protected ccd a(cpk $$0, hp $$1, ciw $$2) {
            cbt $$3 = new cbt($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = cbr.a.b;
            return $$3;
         }
      });
      cul.a(ciz.uw, new ie() {
         @Override
         protected ccd a(cpk $$0, hp $$1, ciw $$2) {
            cbt $$3 = new cbt($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.a($$2);
            $$3.d = cbr.a.b;
            return $$3;
         }
      });
      cul.a(ciz.uv, new ie() {
         @Override
         protected ccd a(cpk $$0, hp $$1, ciw $$2) {
            cbr $$3 = new cci($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = cbr.a.b;
            return $$3;
         }
      });
      cul.a(ciz.qd, new ie() {
         @Override
         protected ccd a(cpk $$0, hp $$1, ciw $$2) {
            return ac.a(new ccl($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cul.a(ciz.pO, new ie() {
         @Override
         protected ccd a(cpk $$0, hp $$1, ciw $$2) {
            return ac.a(new cch($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cul.a(ciz.te, new ie() {
         @Override
         protected ccd a(cpk $$0, hp $$1, ciw $$2) {
            return ac.a(new ccn($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cul.a(ciz.uu, new ii() {
         @Override
         public ciw dispense(gw $$0, ciw $$1) {
            return (new ie() {
               @Override
               protected ccd a(cpk $$0, hp $$1, ciw $$2) {
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
            }).dispense($$0, $$1);
         }
      });
      cul.a(ciz.ux, new ii() {
         @Override
         public ciw dispense(gw $$0, ciw $$1) {
            return (new ie() {
               @Override
               protected ccd a(cpk $$0, hp $$1, ciw $$2) {
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
            }).dispense($$0, $$1);
         }
      });
      ih $$0 = new ih() {
         @Override
         public ciw a(gw $$0, ciw $$1) {
            hb $$2 = $$0.e().c(cul.a);
            bik<?> $$3 = ((ckb)$$1.d()).a($$1.v());

            try {
               $$3.a($$0.g(), $$1, null, $$0.d().a($$2), bja.o, $$2 != hb.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.d(), var6);
               return ciw.b;
            }

            $$1.h(1);
            $$0.g().a(null, dji.t, $$0.d());
            return $$1;
         }
      };

      for (ckb $$1 : ckb.h()) {
         cul.a($$1, $$0);
      }

      cul.a(ciz.tL, new ih() {
         @Override
         public ciw a(gw $$0, ciw $$1) {
            hb $$2 = $$0.e().c(cul.a);
            gv $$3 = $$0.d().a($$2);
            aki $$4 = $$0.g();
            Consumer<bxu> $$5 = bik.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            bxu $$6 = bik.d.a($$4, $$1.v(), $$5, $$3, bja.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      cul.a(ciz.mZ, new ij() {
         @Override
         public ciw a(gw $$0, ciw $$1) {
            gv $$2 = $$0.d().a($$0.e().c(cul.a));
            List<biw> $$3 = $$0.g().a(biw.class, new eha($$2), $$0x -> !($$0x instanceof bjn $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((bjn)$$3.get(0)).a(aov.e);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      ih $$2 = new ij() {
         @Override
         protected ciw a(gw $$0, ciw $$1) {
            gv $$2 = $$0.d().a($$0.e().c(cul.a));

            for (bwh $$4 : $$0.g().a(bwh.class, new eha($$2), $$0x -> $$0x.bv() && $$0x.gI())) {
               if ($$4.l($$1) && !$$4.gJ() && $$4.go()) {
                  $$4.a_(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      cul.a(ciz.tP, $$2);
      cul.a(ciz.tM, $$2);
      cul.a(ciz.tN, $$2);
      cul.a(ciz.tO, $$2);
      cul.a(ciz.hi, $$2);
      cul.a(ciz.hj, $$2);
      cul.a(ciz.hr, $$2);
      cul.a(ciz.ht, $$2);
      cul.a(ciz.hu, $$2);
      cul.a(ciz.hx, $$2);
      cul.a(ciz.hp, $$2);
      cul.a(ciz.hv, $$2);
      cul.a(ciz.hl, $$2);
      cul.a(ciz.hq, $$2);
      cul.a(ciz.hn, $$2);
      cul.a(ciz.hk, $$2);
      cul.a(ciz.ho, $$2);
      cul.a(ciz.hs, $$2);
      cul.a(ciz.hw, $$2);
      cul.a(ciz.hm, $$2);
      cul.a(ciz.er, new ij() {
         @Override
         public ciw a(gw $$0, ciw $$1) {
            gv $$2 = $$0.d().a($$0.e().c(cul.a));

            for (bwg $$4 : $$0.g().a(bwg.class, new eha($$2), $$0x -> $$0x.bv() && !$$0x.q())) {
               if ($$4.go() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      cul.a(ciz.tA, new ih() {
         @Override
         public ciw a(gw $$0, ciw $$1) {
            hb $$2 = $$0.e().c(cul.a);
            cby $$3 = new cby($$0.g(), $$1, $$0.a(), $$0.b(), $$0.a(), true);
            ii.a($$0, $$3, $$2);
            $$3.c((double)$$2.j(), (double)$$2.k(), (double)$$2.l(), 0.5F, 1.0F);
            $$0.g().b($$3);
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(gw $$0) {
            $$0.g().c(1004, $$0.d(), 0);
         }
      });
      cul.a(ciz.tf, new ih() {
         @Override
         public ciw a(gw $$0, ciw $$1) {
            hb $$2 = $$0.e().c(cul.a);
            hp $$3 = cul.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            cpk $$7 = $$0.g();
            art $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            ccg $$12 = new ccg($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(gw $$0) {
            $$0.g().c(1018, $$0.d(), 0);
         }
      });
      cul.a(ciz.ni, new ig(cde.b.a));
      cul.a(ciz.nk, new ig(cde.b.b));
      cul.a(ciz.nm, new ig(cde.b.c));
      cul.a(ciz.no, new ig(cde.b.d));
      cul.a(ciz.nu, new ig(cde.b.g));
      cul.a(ciz.nq, new ig(cde.b.e));
      cul.a(ciz.ns, new ig(cde.b.f));
      cul.a(ciz.nw, new ig(cde.b.h));
      cul.a(ciz.ny, new ig(cde.b.i));
      cul.a(ciz.nj, new ig(cde.b.a, true));
      cul.a(ciz.nl, new ig(cde.b.b, true));
      cul.a(ciz.nn, new ig(cde.b.c, true));
      cul.a(ciz.np, new ig(cde.b.d, true));
      cul.a(ciz.nv, new ig(cde.b.g, true));
      cul.a(ciz.nr, new ig(cde.b.e, true));
      cul.a(ciz.nt, new ig(cde.b.f, true));
      cul.a(ciz.nx, new ig(cde.b.h, true));
      cul.a(ciz.nz, new ig(cde.b.i, true));
      ii $$3 = new ih() {
         private final ih c = new ih();

         @Override
         public ciw a(gw $$0, ciw $$1) {
            chi $$2 = (chi)$$1.d();
            gv $$3 = $$0.d().a($$0.e().c(cul.a));
            cpk $$4 = $$0.g();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new ciw(ciz.pK);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      cul.a(ciz.pM, $$3);
      cul.a(ciz.pL, $$3);
      cul.a(ciz.pN, $$3);
      cul.a(ciz.pS, $$3);
      cul.a(ciz.pT, $$3);
      cul.a(ciz.pR, $$3);
      cul.a(ciz.pU, $$3);
      cul.a(ciz.pV, $$3);
      cul.a(ciz.pW, $$3);
      cul.a(ciz.pK, new ih() {
         private final ih c = new ih();

         @Override
         public ciw a(gw $$0, ciw $$1) {
            cpl $$2 = $$0.g();
            gv $$3 = $$0.d().a($$0.e().c(cul.a));
            dey $$4 = $$2.a_($$3);
            if ($$4.b() instanceof csq $$6) {
               ciw $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dji.y, $$3);
                  cir $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new ciw($$8);
                  } else {
                     if ($$0.<ddb>f().a(new ciw($$8)) < 0) {
                        this.c.dispense($$0, new ciw($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cul.a(ciz.nE, new ij() {
         @Override
         protected ciw a(gw $$0, ciw $$1) {
            cpk $$2 = $$0.g();
            this.a(true);
            hb $$3 = $$0.e().c(cul.a);
            gv $$4 = $$0.d().a($$3);
            dey $$5 = $$2.a_($$4);
            if (cry.a($$2, $$4, $$3)) {
               $$2.b($$4, cry.a($$2, $$4));
               $$2.a(null, dji.i, $$4);
            } else if (csx.h($$5) || csy.g($$5) || csz.g($$5)) {
               $$2.b($$4, $$5.a(dfo.r, Boolean.valueOf(true)));
               $$2.a(null, dji.c, $$4);
            } else if ($$5.b() instanceof dau) {
               dau.a($$2, $$4);
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
      cul.a(ciz.qK, new ij() {
         @Override
         protected ciw a(gw $$0, ciw $$1) {
            this.a(true);
            cpk $$2 = $$0.g();
            gv $$3 = $$0.d().a($$0.e().c(cul.a));
            if (!cgr.a($$1, $$2, $$3) && !cgr.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 0);
            }

            return $$1;
         }
      });
      cul.a(csl.ck, new ih() {
         @Override
         protected ciw a(gw $$0, ciw $$1) {
            cpk $$2 = $$0.g();
            gv $$3 = $$0.d().a($$0.e().c(cul.a));
            byf $$4 = new byf($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dp(), $$4.dr(), $$4.dv(), aou.xG, aov.e, 1.0F, 1.0F);
            $$2.a(null, dji.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      ii $$4 = new ij() {
         @Override
         protected ciw a(gw $$0, ciw $$1) {
            this.a(cgg.a($$0, $$1));
            return $$1;
         }
      };
      cul.a(ciz.tv, $$4);
      cul.a(ciz.tu, $$4);
      cul.a(ciz.tw, $$4);
      cul.a(ciz.tr, $$4);
      cul.a(ciz.tx, $$4);
      cul.a(ciz.tt, $$4);
      cul.a(ciz.ts, new ij() {
         @Override
         protected ciw a(gw $$0, ciw $$1) {
            cpk $$2 = $$0.g();
            hb $$3 = $$0.e().c(cul.a);
            gv $$4 = $$0.d().a($$3);
            if ($$2.t($$4) && dbw.b($$2, $$4, $$1)) {
               $$2.a($$4, csl.gG.n().a(czm.b, Integer.valueOf(dge.a($$3))), 3);
               $$2.a(null, dji.i, $$4);
               dck $$5 = $$2.c_($$4);
               if ($$5 instanceof ddu) {
                  dbw.a($$2, $$4, (ddu)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cgg.a($$0, $$1));
            }

            return $$1;
         }
      });
      cul.a(csl.ef, new ij() {
         @Override
         protected ciw a(gw $$0, ciw $$1) {
            cpk $$2 = $$0.g();
            gv $$3 = $$0.d().a($$0.e().c(cul.a));
            ctd $$4 = (ctd)csl.ef;
            if ($$2.t($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.n(), 3);
                  $$2.a(null, dji.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cgg.a($$0, $$1));
            }

            return $$1;
         }
      });
      cul.a(csl.kP.k(), new il());

      for (chk $$5 : chk.values()) {
         cul.a(czj.a($$5).k(), new il());
      }

      cul.a(ciz.rw.k(), new ij() {
         private final ih c = new ih();

         private ciw a(gw $$0, ciw $$1, ciw $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.g().a(null, dji.y, $$0.d());
               return $$2.p();
            } else {
               if ($$0.<ddb>f().a($$2.p()) < 0) {
                  this.c.dispense($$0, $$2.p());
               }

               return $$1;
            }
         }

         @Override
         public ciw a(gw $$0, ciw $$1) {
            this.a(false);
            aki $$2 = $$0.g();
            gv $$3 = $$0.d().a($$0.e().c(cul.a));
            dey $$4 = $$2.a_($$3);
            if ($$4.a(apj.aF, $$0x -> $$0x.b(cse.b) && $$0x.b() instanceof cse) && $$4.c(cse.b) >= 5) {
               ((cse)$$4.b()).a($$2, $$4, $$3, null, dch.b.b);
               this.a(true);
               return this.a($$0, $$1, new ciw(ciz.vD));
            } else if ($$2.b_($$3).a(apo.a)) {
               this.a(true);
               return this.a($$0, $$1, ckv.a(new ciw(ciz.rv), ckw.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cul.a(ciz.eY, new ij() {
         @Override
         public ciw a(gw $$0, ciw $$1) {
            hb $$2 = $$0.e().c(cul.a);
            gv $$3 = $$0.d().a($$2);
            cpk $$4 = $$0.g();
            dey $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(csl.pl)) {
               if ($$5.c(cyr.c) != 4) {
                  cyr.a(null, $$4, $$3, $$5);
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
      cul.a(ciz.rg.k(), new ik());
      cul.a(ciz.vA, new ij() {
         @Override
         public ciw a(gw $$0, ciw $$1) {
            gv $$2 = $$0.d().a($$0.e().c(cul.a));
            cpk $$3 = $$0.g();
            dey $$4 = $$3.a_($$2);
            Optional<dey> $$5 = cil.b($$4);
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
      cul.a(ciz.rv, new ih() {
         private final ih c = new ih();

         @Override
         public ciw a(gw $$0, ciw $$1) {
            if (ckv.d($$1) != ckw.c) {
               return this.c.dispense($$0, $$1);
            } else {
               aki $$2 = $$0.g();
               gv $$3 = $$0.d();
               gv $$4 = $$0.d().a($$0.e().c(cul.a));
               if (!$$2.a_($$4).a(apj.ca)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(iw.ag, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, aou.ch, aov.e, 1.0F, 1.0F);
                  $$2.a(null, dji.z, $$3);
                  $$2.b($$4, csl.rH.n());
                  return new ciw(ciz.rw);
               }
            }
         }
      });
   }

   static void a(gw $$0, big $$1, hb $$2) {
      $$1.e(
         $$0.a() + (double)$$2.j() * (0.5000099999997474 - (double)$$1.df() / 2.0),
         $$0.b() + (double)$$2.k() * (0.5000099999997474 - (double)$$1.dg() / 2.0) - (double)$$1.dg() / 2.0,
         $$0.c() + (double)$$2.l() * (0.5000099999997474 - (double)$$1.df() / 2.0)
      );
   }
}
