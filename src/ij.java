import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface ij {
   Logger a = LogUtils.getLogger();
   ij b = ($$0, $$1) -> $$1;

   cjh dispense(gx var1, cjh var2);

   static void c() {
      cuy.a(cjk.nH, new ig() {
         @Override
         protected cco a(cpx $$0, hq $$1, cjh $$2) {
            cce $$3 = new cce($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = ccc.a.b;
            return $$3;
         }
      });
      cuy.a(cjk.uw, new ig() {
         @Override
         protected cco a(cpx $$0, hq $$1, cjh $$2) {
            cce $$3 = new cce($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.a($$2);
            $$3.d = ccc.a.b;
            return $$3;
         }
      });
      cuy.a(cjk.uv, new ig() {
         @Override
         protected cco a(cpx $$0, hq $$1, cjh $$2) {
            ccc $$3 = new cct($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = ccc.a.b;
            return $$3;
         }
      });
      cuy.a(cjk.qd, new ig() {
         @Override
         protected cco a(cpx $$0, hq $$1, cjh $$2) {
            return ac.a(new ccw($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cuy.a(cjk.pO, new ig() {
         @Override
         protected cco a(cpx $$0, hq $$1, cjh $$2) {
            return ac.a(new ccs($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cuy.a(cjk.te, new ig() {
         @Override
         protected cco a(cpx $$0, hq $$1, cjh $$2) {
            return ac.a(new ccy($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cuy.a(cjk.uu, new ij() {
         @Override
         public cjh dispense(gx $$0, cjh $$1) {
            return (new ig() {
               @Override
               protected cco a(cpx $$0, hq $$1, cjh $$2) {
                  return ac.a(new ccz($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cuy.a(cjk.ux, new ij() {
         @Override
         public cjh dispense(gx $$0, cjh $$1) {
            return (new ig() {
               @Override
               protected cco a(cpx $$0, hq $$1, cjh $$2) {
                  return ac.a(new ccz($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
         public cjh a(gx $$0, cjh $$1) {
            hc $$2 = $$0.e().c(cuy.a);
            biw<?> $$3 = ((ckm)$$1.d()).a($$1.v());

            try {
               $$3.a($$0.g(), $$1, null, $$0.d().a($$2), bjm.o, $$2 != hc.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.d(), var6);
               return cjh.b;
            }

            $$1.h(1);
            $$0.g().a(null, djv.t, $$0.d());
            return $$1;
         }
      };

      for (ckm $$1 : ckm.h()) {
         cuy.a($$1, $$0);
      }

      cuy.a(cjk.tL, new ii() {
         @Override
         public cjh a(gx $$0, cjh $$1) {
            hc $$2 = $$0.e().c(cuy.a);
            gw $$3 = $$0.d().a($$2);
            aks $$4 = $$0.g();
            Consumer<byf> $$5 = biw.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            byf $$6 = biw.d.a($$4, $$1.v(), $$5, $$3, bjm.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      cuy.a(cjk.mZ, new ik() {
         @Override
         public cjh a(gx $$0, cjh $$1) {
            gw $$2 = $$0.d().a($$0.e().c(cuy.a));
            List<bji> $$3 = $$0.g().a(bji.class, new ehk($$2), $$0x -> !($$0x instanceof bjy $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((bjy)$$3.get(0)).a(apg.e);
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
         protected cjh a(gx $$0, cjh $$1) {
            gw $$2 = $$0.d().a($$0.e().c(cuy.a));

            for (bws $$4 : $$0.g().a(bws.class, new ehk($$2), $$0x -> $$0x.bv() && $$0x.gM())) {
               if ($$4.l($$1) && !$$4.gN() && $$4.gs()) {
                  $$4.a_(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      cuy.a(cjk.tP, $$2);
      cuy.a(cjk.tM, $$2);
      cuy.a(cjk.tN, $$2);
      cuy.a(cjk.tO, $$2);
      cuy.a(cjk.hi, $$2);
      cuy.a(cjk.hj, $$2);
      cuy.a(cjk.hr, $$2);
      cuy.a(cjk.ht, $$2);
      cuy.a(cjk.hu, $$2);
      cuy.a(cjk.hx, $$2);
      cuy.a(cjk.hp, $$2);
      cuy.a(cjk.hv, $$2);
      cuy.a(cjk.hl, $$2);
      cuy.a(cjk.hq, $$2);
      cuy.a(cjk.hn, $$2);
      cuy.a(cjk.hk, $$2);
      cuy.a(cjk.ho, $$2);
      cuy.a(cjk.hs, $$2);
      cuy.a(cjk.hw, $$2);
      cuy.a(cjk.hm, $$2);
      cuy.a(cjk.er, new ik() {
         @Override
         public cjh a(gx $$0, cjh $$1) {
            gw $$2 = $$0.d().a($$0.e().c(cuy.a));

            for (bwr $$4 : $$0.g().a(bwr.class, new ehk($$2), $$0x -> $$0x.bv() && !$$0x.t())) {
               if ($$4.gs() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      cuy.a(cjk.tA, new ii() {
         @Override
         public cjh a(gx $$0, cjh $$1) {
            hc $$2 = $$0.e().c(cuy.a);
            ccj $$3 = new ccj($$0.g(), $$1, $$0.a(), $$0.b(), $$0.a(), true);
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
      cuy.a(cjk.tf, new ii() {
         @Override
         public cjh a(gx $$0, cjh $$1) {
            hc $$2 = $$0.e().c(cuy.a);
            hq $$3 = cuy.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            cpx $$7 = $$0.g();
            ase $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            ccr $$12 = new ccr($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(gx $$0) {
            $$0.g().c(1018, $$0.d(), 0);
         }
      });
      cuy.a(cjk.ni, new ih(cdp.b.a));
      cuy.a(cjk.nk, new ih(cdp.b.b));
      cuy.a(cjk.nm, new ih(cdp.b.c));
      cuy.a(cjk.no, new ih(cdp.b.d));
      cuy.a(cjk.nu, new ih(cdp.b.g));
      cuy.a(cjk.nq, new ih(cdp.b.e));
      cuy.a(cjk.ns, new ih(cdp.b.f));
      cuy.a(cjk.nw, new ih(cdp.b.h));
      cuy.a(cjk.ny, new ih(cdp.b.i));
      cuy.a(cjk.nj, new ih(cdp.b.a, true));
      cuy.a(cjk.nl, new ih(cdp.b.b, true));
      cuy.a(cjk.nn, new ih(cdp.b.c, true));
      cuy.a(cjk.np, new ih(cdp.b.d, true));
      cuy.a(cjk.nv, new ih(cdp.b.g, true));
      cuy.a(cjk.nr, new ih(cdp.b.e, true));
      cuy.a(cjk.nt, new ih(cdp.b.f, true));
      cuy.a(cjk.nx, new ih(cdp.b.h, true));
      cuy.a(cjk.nz, new ih(cdp.b.i, true));
      ij $$3 = new ii() {
         private final ii c = new ii();

         @Override
         public cjh a(gx $$0, cjh $$1) {
            cht $$2 = (cht)$$1.d();
            gw $$3 = $$0.d().a($$0.e().c(cuy.a));
            cpx $$4 = $$0.g();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cjh(cjk.pK);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      cuy.a(cjk.pM, $$3);
      cuy.a(cjk.pL, $$3);
      cuy.a(cjk.pN, $$3);
      cuy.a(cjk.pS, $$3);
      cuy.a(cjk.pT, $$3);
      cuy.a(cjk.pR, $$3);
      cuy.a(cjk.pU, $$3);
      cuy.a(cjk.pV, $$3);
      cuy.a(cjk.pW, $$3);
      cuy.a(cjk.pK, new ii() {
         private final ii c = new ii();

         @Override
         public cjh a(gx $$0, cjh $$1) {
            cpy $$2 = $$0.g();
            gw $$3 = $$0.d().a($$0.e().c(cuy.a));
            dfl $$4 = $$2.a_($$3);
            if ($$4.b() instanceof ctd $$6) {
               cjh $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, djv.y, $$3);
                  cjc $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new cjh($$8);
                  } else {
                     if ($$0.<ddo>f().a(new cjh($$8)) < 0) {
                        this.c.dispense($$0, new cjh($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cuy.a(cjk.nE, new ik() {
         @Override
         protected cjh a(gx $$0, cjh $$1) {
            cpx $$2 = $$0.g();
            this.a(true);
            hc $$3 = $$0.e().c(cuy.a);
            gw $$4 = $$0.d().a($$3);
            dfl $$5 = $$2.a_($$4);
            if (csl.a($$2, $$4, $$3)) {
               $$2.b($$4, csl.a($$2, $$4));
               $$2.a(null, djv.i, $$4);
            } else if (ctk.h($$5) || ctl.g($$5) || ctm.g($$5)) {
               $$2.b($$4, $$5.a(dgb.r, Boolean.valueOf(true)));
               $$2.a(null, djv.c, $$4);
            } else if ($$5.b() instanceof dbh) {
               dbh.a($$2, $$4);
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
      cuy.a(cjk.qK, new ik() {
         @Override
         protected cjh a(gx $$0, cjh $$1) {
            this.a(true);
            cpx $$2 = $$0.g();
            gw $$3 = $$0.d().a($$0.e().c(cuy.a));
            if (!chc.a($$1, $$2, $$3) && !chc.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 0);
            }

            return $$1;
         }
      });
      cuy.a(csy.ck, new ii() {
         @Override
         protected cjh a(gx $$0, cjh $$1) {
            cpx $$2 = $$0.g();
            gw $$3 = $$0.d().a($$0.e().c(cuy.a));
            byq $$4 = new byq($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dq(), $$4.ds(), $$4.dw(), apf.xL, apg.e, 1.0F, 1.0F);
            $$2.a(null, djv.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      ij $$4 = new ik() {
         @Override
         protected cjh a(gx $$0, cjh $$1) {
            this.a(cgr.a($$0, $$1));
            return $$1;
         }
      };
      cuy.a(cjk.tv, $$4);
      cuy.a(cjk.tu, $$4);
      cuy.a(cjk.tw, $$4);
      cuy.a(cjk.tr, $$4);
      cuy.a(cjk.tx, $$4);
      cuy.a(cjk.tt, $$4);
      cuy.a(cjk.ts, new ik() {
         @Override
         protected cjh a(gx $$0, cjh $$1) {
            cpx $$2 = $$0.g();
            hc $$3 = $$0.e().c(cuy.a);
            gw $$4 = $$0.d().a($$3);
            if ($$2.t($$4) && dcj.b($$2, $$4, $$1)) {
               $$2.a($$4, csy.gG.n().a(czz.c, Integer.valueOf(dgr.a($$3))), 3);
               $$2.a(null, djv.i, $$4);
               dcx $$5 = $$2.c_($$4);
               if ($$5 instanceof deh) {
                  dcj.a($$2, $$4, (deh)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cgr.a($$0, $$1));
            }

            return $$1;
         }
      });
      cuy.a(csy.ef, new ik() {
         @Override
         protected cjh a(gx $$0, cjh $$1) {
            cpx $$2 = $$0.g();
            gw $$3 = $$0.d().a($$0.e().c(cuy.a));
            ctq $$4 = (ctq)csy.ef;
            if ($$2.t($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.n(), 3);
                  $$2.a(null, djv.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cgr.a($$0, $$1));
            }

            return $$1;
         }
      });
      cuy.a(csy.kP.k(), new im());

      for (chv $$5 : chv.values()) {
         cuy.a(czw.a($$5).k(), new im());
      }

      cuy.a(cjk.rw.k(), new ik() {
         private final ii c = new ii();

         private cjh a(gx $$0, cjh $$1, cjh $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.g().a(null, djv.y, $$0.d());
               return $$2.p();
            } else {
               if ($$0.<ddo>f().a($$2.p()) < 0) {
                  this.c.dispense($$0, $$2.p());
               }

               return $$1;
            }
         }

         @Override
         public cjh a(gx $$0, cjh $$1) {
            this.a(false);
            aks $$2 = $$0.g();
            gw $$3 = $$0.d().a($$0.e().c(cuy.a));
            dfl $$4 = $$2.a_($$3);
            if ($$4.a(apu.aF, $$0x -> $$0x.b(csr.b) && $$0x.b() instanceof csr) && $$4.c(csr.b) >= 5) {
               ((csr)$$4.b()).a($$2, $$4, $$3, null, dcu.b.b);
               this.a(true);
               return this.a($$0, $$1, new cjh(cjk.vD));
            } else if ($$2.b_($$3).a(apz.a)) {
               this.a(true);
               return this.a($$0, $$1, clg.a(new cjh(cjk.rv), clh.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cuy.a(cjk.eY, new ik() {
         @Override
         public cjh a(gx $$0, cjh $$1) {
            hc $$2 = $$0.e().c(cuy.a);
            gw $$3 = $$0.d().a($$2);
            cpx $$4 = $$0.g();
            dfl $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(csy.pl)) {
               if ($$5.c(cze.c) != 4) {
                  cze.a(null, $$4, $$3, $$5);
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
      cuy.a(cjk.rg.k(), new il());
      cuy.a(cjk.vA, new ik() {
         @Override
         public cjh a(gx $$0, cjh $$1) {
            gw $$2 = $$0.d().a($$0.e().c(cuy.a));
            cpx $$3 = $$0.g();
            dfl $$4 = $$3.a_($$2);
            Optional<dfl> $$5 = ciw.b($$4);
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
      cuy.a(cjk.rv, new ii() {
         private final ii c = new ii();

         @Override
         public cjh a(gx $$0, cjh $$1) {
            if (clg.d($$1) != clh.c) {
               return this.c.dispense($$0, $$1);
            } else {
               aks $$2 = $$0.g();
               gw $$3 = $$0.d();
               gw $$4 = $$0.d().a($$0.e().c(cuy.a));
               if (!$$2.a_($$4).a(apu.ca)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(ix.ag, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, apf.ch, apg.e, 1.0F, 1.0F);
                  $$2.a(null, djv.z, $$3);
                  $$2.b($$4, csy.rH.n());
                  return new cjh(cjk.rw);
               }
            }
         }
      });
   }

   static void a(gx $$0, bis $$1, hc $$2) {
      $$1.e(
         $$0.a() + (double)$$2.j() * (0.5000099999997474 - (double)$$1.df() / 2.0),
         $$0.b() + (double)$$2.k() * (0.5000099999997474 - (double)$$1.dg() / 2.0) - (double)$$1.dg() / 2.0,
         $$0.c() + (double)$$2.l() * (0.5000099999997474 - (double)$$1.df() / 2.0)
      );
   }
}
