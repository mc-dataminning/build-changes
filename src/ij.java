import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface ij {
   Logger a = LogUtils.getLogger();
   ij b = ($$0, $$1) -> $$1;

   cjf dispense(gx var1, cjf var2);

   static void c() {
      cuw.a(cji.nH, new ig() {
         @Override
         protected ccm a(cpv $$0, hq $$1, cjf $$2) {
            ccc $$3 = new ccc($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = cca.a.b;
            return $$3;
         }
      });
      cuw.a(cji.uw, new ig() {
         @Override
         protected ccm a(cpv $$0, hq $$1, cjf $$2) {
            ccc $$3 = new ccc($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.a($$2);
            $$3.d = cca.a.b;
            return $$3;
         }
      });
      cuw.a(cji.uv, new ig() {
         @Override
         protected ccm a(cpv $$0, hq $$1, cjf $$2) {
            cca $$3 = new ccr($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = cca.a.b;
            return $$3;
         }
      });
      cuw.a(cji.qd, new ig() {
         @Override
         protected ccm a(cpv $$0, hq $$1, cjf $$2) {
            return ac.a(new ccu($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cuw.a(cji.pO, new ig() {
         @Override
         protected ccm a(cpv $$0, hq $$1, cjf $$2) {
            return ac.a(new ccq($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cuw.a(cji.te, new ig() {
         @Override
         protected ccm a(cpv $$0, hq $$1, cjf $$2) {
            return ac.a(new ccw($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cuw.a(cji.uu, new ij() {
         @Override
         public cjf dispense(gx $$0, cjf $$1) {
            return (new ig() {
               @Override
               protected ccm a(cpv $$0, hq $$1, cjf $$2) {
                  return ac.a(new ccx($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cuw.a(cji.ux, new ij() {
         @Override
         public cjf dispense(gx $$0, cjf $$1) {
            return (new ig() {
               @Override
               protected ccm a(cpv $$0, hq $$1, cjf $$2) {
                  return ac.a(new ccx($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      ii $$0 = new ii() {
         @Override
         public cjf a(gx $$0, cjf $$1) {
            hc $$2 = $$0.e().c(cuw.a);
            biu<?> $$3 = ((ckk)$$1.d()).a($$1.v());

            try {
               $$3.a($$0.g(), $$1, null, $$0.d().a($$2), bjk.o, $$2 != hc.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.d(), var6);
               return cjf.b;
            }

            $$1.h(1);
            $$0.g().a(null, djt.t, $$0.d());
            return $$1;
         }
      };

      for (ckk $$1 : ckk.h()) {
         cuw.a($$1, $$0);
      }

      cuw.a(cji.tL, new ii() {
         @Override
         public cjf a(gx $$0, cjf $$1) {
            hc $$2 = $$0.e().c(cuw.a);
            gw $$3 = $$0.d().a($$2);
            akr $$4 = $$0.g();
            Consumer<byd> $$5 = biu.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            byd $$6 = biu.d.a($$4, $$1.v(), $$5, $$3, bjk.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      cuw.a(cji.mZ, new ik() {
         @Override
         public cjf a(gx $$0, cjf $$1) {
            gw $$2 = $$0.d().a($$0.e().c(cuw.a));
            List<bjg> $$3 = $$0.g().a(bjg.class, new ehi($$2), $$0x -> !($$0x instanceof bjw $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((bjw)$$3.get(0)).a(apf.e);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      ii $$2 = new ik() {
         @Override
         protected cjf a(gx $$0, cjf $$1) {
            gw $$2 = $$0.d().a($$0.e().c(cuw.a));

            for (bwq $$4 : $$0.g().a(bwq.class, new ehi($$2), $$0x -> $$0x.bw() && $$0x.gM())) {
               if ($$4.l($$1) && !$$4.gN() && $$4.gs()) {
                  $$4.a_(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      cuw.a(cji.tP, $$2);
      cuw.a(cji.tM, $$2);
      cuw.a(cji.tN, $$2);
      cuw.a(cji.tO, $$2);
      cuw.a(cji.hi, $$2);
      cuw.a(cji.hj, $$2);
      cuw.a(cji.hr, $$2);
      cuw.a(cji.ht, $$2);
      cuw.a(cji.hu, $$2);
      cuw.a(cji.hx, $$2);
      cuw.a(cji.hp, $$2);
      cuw.a(cji.hv, $$2);
      cuw.a(cji.hl, $$2);
      cuw.a(cji.hq, $$2);
      cuw.a(cji.hn, $$2);
      cuw.a(cji.hk, $$2);
      cuw.a(cji.ho, $$2);
      cuw.a(cji.hs, $$2);
      cuw.a(cji.hw, $$2);
      cuw.a(cji.hm, $$2);
      cuw.a(cji.er, new ik() {
         @Override
         public cjf a(gx $$0, cjf $$1) {
            gw $$2 = $$0.d().a($$0.e().c(cuw.a));

            for (bwp $$4 : $$0.g().a(bwp.class, new ehi($$2), $$0x -> $$0x.bw() && !$$0x.t())) {
               if ($$4.gs() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      cuw.a(cji.tA, new ii() {
         @Override
         public cjf a(gx $$0, cjf $$1) {
            hc $$2 = $$0.e().c(cuw.a);
            cch $$3 = new cch($$0.g(), $$1, $$0.a(), $$0.b(), $$0.a(), true);
            ij.a($$0, $$3, $$2);
            $$3.c((double)$$2.j(), (double)$$2.k(), (double)$$2.l(), 0.5F, 1.0F);
            $$0.g().b($$3);
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(gx $$0) {
            $$0.g().c(1004, $$0.d(), 0);
         }
      });
      cuw.a(cji.tf, new ii() {
         @Override
         public cjf a(gx $$0, cjf $$1) {
            hc $$2 = $$0.e().c(cuw.a);
            hq $$3 = cuw.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            cpv $$7 = $$0.g();
            asc $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            ccp $$12 = new ccp($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(gx $$0) {
            $$0.g().c(1018, $$0.d(), 0);
         }
      });
      cuw.a(cji.ni, new ih(cdn.b.a));
      cuw.a(cji.nk, new ih(cdn.b.b));
      cuw.a(cji.nm, new ih(cdn.b.c));
      cuw.a(cji.no, new ih(cdn.b.d));
      cuw.a(cji.nu, new ih(cdn.b.g));
      cuw.a(cji.nq, new ih(cdn.b.e));
      cuw.a(cji.ns, new ih(cdn.b.f));
      cuw.a(cji.nw, new ih(cdn.b.h));
      cuw.a(cji.ny, new ih(cdn.b.i));
      cuw.a(cji.nj, new ih(cdn.b.a, true));
      cuw.a(cji.nl, new ih(cdn.b.b, true));
      cuw.a(cji.nn, new ih(cdn.b.c, true));
      cuw.a(cji.np, new ih(cdn.b.d, true));
      cuw.a(cji.nv, new ih(cdn.b.g, true));
      cuw.a(cji.nr, new ih(cdn.b.e, true));
      cuw.a(cji.nt, new ih(cdn.b.f, true));
      cuw.a(cji.nx, new ih(cdn.b.h, true));
      cuw.a(cji.nz, new ih(cdn.b.i, true));
      ij $$3 = new ii() {
         private final ii c = new ii();

         @Override
         public cjf a(gx $$0, cjf $$1) {
            chr $$2 = (chr)$$1.d();
            gw $$3 = $$0.d().a($$0.e().c(cuw.a));
            cpv $$4 = $$0.g();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cjf(cji.pK);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      cuw.a(cji.pM, $$3);
      cuw.a(cji.pL, $$3);
      cuw.a(cji.pN, $$3);
      cuw.a(cji.pS, $$3);
      cuw.a(cji.pT, $$3);
      cuw.a(cji.pR, $$3);
      cuw.a(cji.pU, $$3);
      cuw.a(cji.pV, $$3);
      cuw.a(cji.pW, $$3);
      cuw.a(cji.pK, new ii() {
         private final ii c = new ii();

         @Override
         public cjf a(gx $$0, cjf $$1) {
            cpw $$2 = $$0.g();
            gw $$3 = $$0.d().a($$0.e().c(cuw.a));
            dfj $$4 = $$2.a_($$3);
            if ($$4.b() instanceof ctb $$6) {
               cjf $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, djt.y, $$3);
                  cja $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new cjf($$8);
                  } else {
                     if ($$0.<ddm>f().a(new cjf($$8)) < 0) {
                        this.c.dispense($$0, new cjf($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cuw.a(cji.nE, new ik() {
         @Override
         protected cjf a(gx $$0, cjf $$1) {
            cpv $$2 = $$0.g();
            this.a(true);
            hc $$3 = $$0.e().c(cuw.a);
            gw $$4 = $$0.d().a($$3);
            dfj $$5 = $$2.a_($$4);
            if (csj.a($$2, $$4, $$3)) {
               $$2.b($$4, csj.a($$2, $$4));
               $$2.a(null, djt.i, $$4);
            } else if (cti.h($$5) || ctj.g($$5) || ctk.g($$5)) {
               $$2.b($$4, $$5.a(dfz.r, Boolean.valueOf(true)));
               $$2.a(null, djt.c, $$4);
            } else if ($$5.b() instanceof dbf) {
               dbf.a($$2, $$4);
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
      cuw.a(cji.qK, new ik() {
         @Override
         protected cjf a(gx $$0, cjf $$1) {
            this.a(true);
            cpv $$2 = $$0.g();
            gw $$3 = $$0.d().a($$0.e().c(cuw.a));
            if (!cha.a($$1, $$2, $$3) && !cha.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 0);
            }

            return $$1;
         }
      });
      cuw.a(csw.ck, new ii() {
         @Override
         protected cjf a(gx $$0, cjf $$1) {
            cpv $$2 = $$0.g();
            gw $$3 = $$0.d().a($$0.e().c(cuw.a));
            byo $$4 = new byo($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dq(), $$4.ds(), $$4.dw(), ape.xL, apf.e, 1.0F, 1.0F);
            $$2.a(null, djt.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      ij $$4 = new ik() {
         @Override
         protected cjf a(gx $$0, cjf $$1) {
            this.a(cgp.a($$0, $$1));
            return $$1;
         }
      };
      cuw.a(cji.tv, $$4);
      cuw.a(cji.tu, $$4);
      cuw.a(cji.tw, $$4);
      cuw.a(cji.tr, $$4);
      cuw.a(cji.tx, $$4);
      cuw.a(cji.tt, $$4);
      cuw.a(cji.ts, new ik() {
         @Override
         protected cjf a(gx $$0, cjf $$1) {
            cpv $$2 = $$0.g();
            hc $$3 = $$0.e().c(cuw.a);
            gw $$4 = $$0.d().a($$3);
            if ($$2.t($$4) && dch.b($$2, $$4, $$1)) {
               $$2.a($$4, csw.gG.n().a(czx.c, Integer.valueOf(dgp.a($$3))), 3);
               $$2.a(null, djt.i, $$4);
               dcv $$5 = $$2.c_($$4);
               if ($$5 instanceof def) {
                  dch.a($$2, $$4, (def)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cgp.a($$0, $$1));
            }

            return $$1;
         }
      });
      cuw.a(csw.ef, new ik() {
         @Override
         protected cjf a(gx $$0, cjf $$1) {
            cpv $$2 = $$0.g();
            gw $$3 = $$0.d().a($$0.e().c(cuw.a));
            cto $$4 = (cto)csw.ef;
            if ($$2.t($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.n(), 3);
                  $$2.a(null, djt.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cgp.a($$0, $$1));
            }

            return $$1;
         }
      });
      cuw.a(csw.kP.k(), new im());

      for (cht $$5 : cht.values()) {
         cuw.a(czu.a($$5).k(), new im());
      }

      cuw.a(cji.rw.k(), new ik() {
         private final ii c = new ii();

         private cjf a(gx $$0, cjf $$1, cjf $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.g().a(null, djt.y, $$0.d());
               return $$2.p();
            } else {
               if ($$0.<ddm>f().a($$2.p()) < 0) {
                  this.c.dispense($$0, $$2.p());
               }

               return $$1;
            }
         }

         @Override
         public cjf a(gx $$0, cjf $$1) {
            this.a(false);
            akr $$2 = $$0.g();
            gw $$3 = $$0.d().a($$0.e().c(cuw.a));
            dfj $$4 = $$2.a_($$3);
            if ($$4.a(apt.aF, $$0x -> $$0x.b(csp.b) && $$0x.b() instanceof csp) && $$4.c(csp.b) >= 5) {
               ((csp)$$4.b()).a($$2, $$4, $$3, null, dcs.b.b);
               this.a(true);
               return this.a($$0, $$1, new cjf(cji.vD));
            } else if ($$2.b_($$3).a(apy.a)) {
               this.a(true);
               return this.a($$0, $$1, cle.a(new cjf(cji.rv), clf.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cuw.a(cji.eY, new ik() {
         @Override
         public cjf a(gx $$0, cjf $$1) {
            hc $$2 = $$0.e().c(cuw.a);
            gw $$3 = $$0.d().a($$2);
            cpv $$4 = $$0.g();
            dfj $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(csw.pl)) {
               if ($$5.c(czc.c) != 4) {
                  czc.a(null, $$4, $$3, $$5);
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
      cuw.a(cji.rg.k(), new il());
      cuw.a(cji.vA, new ik() {
         @Override
         public cjf a(gx $$0, cjf $$1) {
            gw $$2 = $$0.d().a($$0.e().c(cuw.a));
            cpv $$3 = $$0.g();
            dfj $$4 = $$3.a_($$2);
            Optional<dfj> $$5 = ciu.b($$4);
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
      cuw.a(cji.rv, new ii() {
         private final ii c = new ii();

         @Override
         public cjf a(gx $$0, cjf $$1) {
            if (cle.d($$1) != clf.c) {
               return this.c.dispense($$0, $$1);
            } else {
               akr $$2 = $$0.g();
               gw $$3 = $$0.d();
               gw $$4 = $$0.d().a($$0.e().c(cuw.a));
               if (!$$2.a_($$4).a(apt.ca)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(ix.ag, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, ape.ch, apf.e, 1.0F, 1.0F);
                  $$2.a(null, djt.z, $$3);
                  $$2.b($$4, csw.rH.n());
                  return new cjf(cji.rw);
               }
            }
         }
      });
   }

   static void a(gx $$0, biq $$1, hc $$2) {
      $$1.e(
         $$0.a() + (double)$$2.j() * (0.5000099999997474 - (double)$$1.dg() / 2.0),
         $$0.b() + (double)$$2.k() * (0.5000099999997474 - (double)$$1.dh() / 2.0) - (double)$$1.dh() / 2.0,
         $$0.c() + (double)$$2.l() * (0.5000099999997474 - (double)$$1.dg() / 2.0)
      );
   }
}
