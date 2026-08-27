import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface ih {
   Logger a = LogUtils.getLogger();
   ih b = ($$0, $$1) -> $$1;

   ciy dispense(gv var1, ciy var2);

   static void c() {
      cun.a(cjb.nH, new id() {
         @Override
         protected ccf a(cpm $$0, ho $$1, ciy $$2) {
            cbv $$3 = new cbv($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = cbt.a.b;
            return $$3;
         }
      });
      cun.a(cjb.uw, new id() {
         @Override
         protected ccf a(cpm $$0, ho $$1, ciy $$2) {
            cbv $$3 = new cbv($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.a($$2);
            $$3.d = cbt.a.b;
            return $$3;
         }
      });
      cun.a(cjb.uv, new id() {
         @Override
         protected ccf a(cpm $$0, ho $$1, ciy $$2) {
            cbt $$3 = new cck($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = cbt.a.b;
            return $$3;
         }
      });
      cun.a(cjb.qd, new id() {
         @Override
         protected ccf a(cpm $$0, ho $$1, ciy $$2) {
            return ac.a(new ccn($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cun.a(cjb.pO, new id() {
         @Override
         protected ccf a(cpm $$0, ho $$1, ciy $$2) {
            return ac.a(new ccj($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cun.a(cjb.te, new id() {
         @Override
         protected ccf a(cpm $$0, ho $$1, ciy $$2) {
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
      });
      cun.a(cjb.uu, new ih() {
         @Override
         public ciy dispense(gv $$0, ciy $$1) {
            return (new id() {
               @Override
               protected ccf a(cpm $$0, ho $$1, ciy $$2) {
                  return ac.a(new ccq($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cun.a(cjb.ux, new ih() {
         @Override
         public ciy dispense(gv $$0, ciy $$1) {
            return (new id() {
               @Override
               protected ccf a(cpm $$0, ho $$1, ciy $$2) {
                  return ac.a(new ccq($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
         public ciy a(gv $$0, ciy $$1) {
            ha $$2 = $$0.e().c(cun.a);
            bim<?> $$3 = ((ckd)$$1.d()).a($$1.v());

            try {
               $$3.a($$0.g(), $$1, null, $$0.d().a($$2), bjc.o, $$2 != ha.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.d(), var6);
               return ciy.b;
            }

            $$1.h(1);
            $$0.g().a(null, djk.t, $$0.d());
            return $$1;
         }
      };

      for (ckd $$1 : ckd.h()) {
         cun.a($$1, $$0);
      }

      cun.a(cjb.tL, new ig() {
         @Override
         public ciy a(gv $$0, ciy $$1) {
            ha $$2 = $$0.e().c(cun.a);
            gu $$3 = $$0.d().a($$2);
            akk $$4 = $$0.g();
            Consumer<bxw> $$5 = bim.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            bxw $$6 = bim.d.a($$4, $$1.v(), $$5, $$3, bjc.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      cun.a(cjb.mZ, new ii() {
         @Override
         public ciy a(gv $$0, ciy $$1) {
            gu $$2 = $$0.d().a($$0.e().c(cun.a));
            List<biy> $$3 = $$0.g().a(biy.class, new egz($$2), $$0x -> !($$0x instanceof bjp $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((bjp)$$3.get(0)).a(aox.e);
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
         protected ciy a(gv $$0, ciy $$1) {
            gu $$2 = $$0.d().a($$0.e().c(cun.a));

            for (bwj $$4 : $$0.g().a(bwj.class, new egz($$2), $$0x -> $$0x.bv() && $$0x.gI())) {
               if ($$4.l($$1) && !$$4.gJ() && $$4.go()) {
                  $$4.a_(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      cun.a(cjb.tP, $$2);
      cun.a(cjb.tM, $$2);
      cun.a(cjb.tN, $$2);
      cun.a(cjb.tO, $$2);
      cun.a(cjb.hi, $$2);
      cun.a(cjb.hj, $$2);
      cun.a(cjb.hr, $$2);
      cun.a(cjb.ht, $$2);
      cun.a(cjb.hu, $$2);
      cun.a(cjb.hx, $$2);
      cun.a(cjb.hp, $$2);
      cun.a(cjb.hv, $$2);
      cun.a(cjb.hl, $$2);
      cun.a(cjb.hq, $$2);
      cun.a(cjb.hn, $$2);
      cun.a(cjb.hk, $$2);
      cun.a(cjb.ho, $$2);
      cun.a(cjb.hs, $$2);
      cun.a(cjb.hw, $$2);
      cun.a(cjb.hm, $$2);
      cun.a(cjb.er, new ii() {
         @Override
         public ciy a(gv $$0, ciy $$1) {
            gu $$2 = $$0.d().a($$0.e().c(cun.a));

            for (bwi $$4 : $$0.g().a(bwi.class, new egz($$2), $$0x -> $$0x.bv() && !$$0x.q())) {
               if ($$4.go() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      cun.a(cjb.tA, new ig() {
         @Override
         public ciy a(gv $$0, ciy $$1) {
            ha $$2 = $$0.e().c(cun.a);
            cca $$3 = new cca($$0.g(), $$1, $$0.a(), $$0.b(), $$0.a(), true);
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
      cun.a(cjb.tf, new ig() {
         @Override
         public ciy a(gv $$0, ciy $$1) {
            ha $$2 = $$0.e().c(cun.a);
            ho $$3 = cun.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            cpm $$7 = $$0.g();
            aru $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            cci $$12 = new cci($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(gv $$0) {
            $$0.g().c(1018, $$0.d(), 0);
         }
      });
      cun.a(cjb.ni, new ie(cdg.b.a));
      cun.a(cjb.nk, new ie(cdg.b.b));
      cun.a(cjb.nm, new ie(cdg.b.c));
      cun.a(cjb.no, new ie(cdg.b.d));
      cun.a(cjb.nu, new ie(cdg.b.g));
      cun.a(cjb.nq, new ie(cdg.b.e));
      cun.a(cjb.ns, new ie(cdg.b.f));
      cun.a(cjb.nw, new ie(cdg.b.h));
      cun.a(cjb.ny, new ie(cdg.b.i));
      cun.a(cjb.nj, new ie(cdg.b.a, true));
      cun.a(cjb.nl, new ie(cdg.b.b, true));
      cun.a(cjb.nn, new ie(cdg.b.c, true));
      cun.a(cjb.np, new ie(cdg.b.d, true));
      cun.a(cjb.nv, new ie(cdg.b.g, true));
      cun.a(cjb.nr, new ie(cdg.b.e, true));
      cun.a(cjb.nt, new ie(cdg.b.f, true));
      cun.a(cjb.nx, new ie(cdg.b.h, true));
      cun.a(cjb.nz, new ie(cdg.b.i, true));
      ih $$3 = new ig() {
         private final ig c = new ig();

         @Override
         public ciy a(gv $$0, ciy $$1) {
            chk $$2 = (chk)$$1.d();
            gu $$3 = $$0.d().a($$0.e().c(cun.a));
            cpm $$4 = $$0.g();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new ciy(cjb.pK);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      cun.a(cjb.pM, $$3);
      cun.a(cjb.pL, $$3);
      cun.a(cjb.pN, $$3);
      cun.a(cjb.pS, $$3);
      cun.a(cjb.pT, $$3);
      cun.a(cjb.pR, $$3);
      cun.a(cjb.pU, $$3);
      cun.a(cjb.pV, $$3);
      cun.a(cjb.pW, $$3);
      cun.a(cjb.pK, new ig() {
         private final ig c = new ig();

         @Override
         public ciy a(gv $$0, ciy $$1) {
            cpn $$2 = $$0.g();
            gu $$3 = $$0.d().a($$0.e().c(cun.a));
            dfa $$4 = $$2.a_($$3);
            if ($$4.b() instanceof css $$6) {
               ciy $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, djk.y, $$3);
                  cit $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new ciy($$8);
                  } else {
                     if ($$0.<ddd>f().a(new ciy($$8)) < 0) {
                        this.c.dispense($$0, new ciy($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cun.a(cjb.nE, new ii() {
         @Override
         protected ciy a(gv $$0, ciy $$1) {
            cpm $$2 = $$0.g();
            this.a(true);
            ha $$3 = $$0.e().c(cun.a);
            gu $$4 = $$0.d().a($$3);
            dfa $$5 = $$2.a_($$4);
            if (csa.a($$2, $$4, $$3)) {
               $$2.b($$4, csa.a($$2, $$4));
               $$2.a(null, djk.i, $$4);
            } else if (csz.h($$5) || cta.g($$5) || ctb.g($$5)) {
               $$2.b($$4, $$5.a(dfq.r, Boolean.valueOf(true)));
               $$2.a(null, djk.c, $$4);
            } else if ($$5.b() instanceof daw) {
               daw.a($$2, $$4);
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
      cun.a(cjb.qK, new ii() {
         @Override
         protected ciy a(gv $$0, ciy $$1) {
            this.a(true);
            cpm $$2 = $$0.g();
            gu $$3 = $$0.d().a($$0.e().c(cun.a));
            if (!cgt.a($$1, $$2, $$3) && !cgt.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 0);
            }

            return $$1;
         }
      });
      cun.a(csn.ck, new ig() {
         @Override
         protected ciy a(gv $$0, ciy $$1) {
            cpm $$2 = $$0.g();
            gu $$3 = $$0.d().a($$0.e().c(cun.a));
            byh $$4 = new byh($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dp(), $$4.dr(), $$4.dv(), aow.xG, aox.e, 1.0F, 1.0F);
            $$2.a(null, djk.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      ih $$4 = new ii() {
         @Override
         protected ciy a(gv $$0, ciy $$1) {
            this.a(cgi.a($$0, $$1));
            return $$1;
         }
      };
      cun.a(cjb.tv, $$4);
      cun.a(cjb.tu, $$4);
      cun.a(cjb.tw, $$4);
      cun.a(cjb.tr, $$4);
      cun.a(cjb.tx, $$4);
      cun.a(cjb.tt, $$4);
      cun.a(cjb.ts, new ii() {
         @Override
         protected ciy a(gv $$0, ciy $$1) {
            cpm $$2 = $$0.g();
            ha $$3 = $$0.e().c(cun.a);
            gu $$4 = $$0.d().a($$3);
            if ($$2.t($$4) && dby.b($$2, $$4, $$1)) {
               $$2.a($$4, csn.gG.n().a(czo.b, Integer.valueOf(dgg.a($$3))), 3);
               $$2.a(null, djk.i, $$4);
               dcm $$5 = $$2.c_($$4);
               if ($$5 instanceof ddw) {
                  dby.a($$2, $$4, (ddw)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cgi.a($$0, $$1));
            }

            return $$1;
         }
      });
      cun.a(csn.ef, new ii() {
         @Override
         protected ciy a(gv $$0, ciy $$1) {
            cpm $$2 = $$0.g();
            gu $$3 = $$0.d().a($$0.e().c(cun.a));
            ctf $$4 = (ctf)csn.ef;
            if ($$2.t($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.n(), 3);
                  $$2.a(null, djk.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cgi.a($$0, $$1));
            }

            return $$1;
         }
      });
      cun.a(csn.kP.k(), new ik());

      for (chm $$5 : chm.values()) {
         cun.a(czl.a($$5).k(), new ik());
      }

      cun.a(cjb.rw.k(), new ii() {
         private final ig c = new ig();

         private ciy a(gv $$0, ciy $$1, ciy $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.g().a(null, djk.y, $$0.d());
               return $$2.p();
            } else {
               if ($$0.<ddd>f().a($$2.p()) < 0) {
                  this.c.dispense($$0, $$2.p());
               }

               return $$1;
            }
         }

         @Override
         public ciy a(gv $$0, ciy $$1) {
            this.a(false);
            akk $$2 = $$0.g();
            gu $$3 = $$0.d().a($$0.e().c(cun.a));
            dfa $$4 = $$2.a_($$3);
            if ($$4.a(apl.aF, $$0x -> $$0x.b(csg.b) && $$0x.b() instanceof csg) && $$4.c(csg.b) >= 5) {
               ((csg)$$4.b()).a($$2, $$4, $$3, null, dcj.b.b);
               this.a(true);
               return this.a($$0, $$1, new ciy(cjb.vD));
            } else if ($$2.b_($$3).a(apq.a)) {
               this.a(true);
               return this.a($$0, $$1, ckx.a(new ciy(cjb.rv), cky.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cun.a(cjb.eY, new ii() {
         @Override
         public ciy a(gv $$0, ciy $$1) {
            ha $$2 = $$0.e().c(cun.a);
            gu $$3 = $$0.d().a($$2);
            cpm $$4 = $$0.g();
            dfa $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(csn.pl)) {
               if ($$5.c(cyt.c) != 4) {
                  cyt.a(null, $$4, $$3, $$5);
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
      cun.a(cjb.rg.k(), new ij());
      cun.a(cjb.vA, new ii() {
         @Override
         public ciy a(gv $$0, ciy $$1) {
            gu $$2 = $$0.d().a($$0.e().c(cun.a));
            cpm $$3 = $$0.g();
            dfa $$4 = $$3.a_($$2);
            Optional<dfa> $$5 = cin.b($$4);
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
      cun.a(cjb.rv, new ig() {
         private final ig c = new ig();

         @Override
         public ciy a(gv $$0, ciy $$1) {
            if (ckx.d($$1) != cky.c) {
               return this.c.dispense($$0, $$1);
            } else {
               akk $$2 = $$0.g();
               gu $$3 = $$0.d();
               gu $$4 = $$0.d().a($$0.e().c(cun.a));
               if (!$$2.a_($$4).a(apl.ca)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(iv.ag, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, aow.ch, aox.e, 1.0F, 1.0F);
                  $$2.a(null, djk.z, $$3);
                  $$2.b($$4, csn.rH.n());
                  return new ciy(cjb.rw);
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
