import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface ij {
   Logger a = LogUtils.getLogger();
   ij b = ($$0, $$1) -> $$1;

   cja dispense(gx var1, cja var2);

   static void c() {
      cur.a(cjd.nH, new ig() {
         @Override
         protected cch a(cpq $$0, hq $$1, cja $$2) {
            cbx $$3 = new cbx($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = cbv.a.b;
            return $$3;
         }
      });
      cur.a(cjd.uw, new ig() {
         @Override
         protected cch a(cpq $$0, hq $$1, cja $$2) {
            cbx $$3 = new cbx($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.a($$2);
            $$3.d = cbv.a.b;
            return $$3;
         }
      });
      cur.a(cjd.uv, new ig() {
         @Override
         protected cch a(cpq $$0, hq $$1, cja $$2) {
            cbv $$3 = new ccm($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = cbv.a.b;
            return $$3;
         }
      });
      cur.a(cjd.qd, new ig() {
         @Override
         protected cch a(cpq $$0, hq $$1, cja $$2) {
            return ac.a(new ccp($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cur.a(cjd.pO, new ig() {
         @Override
         protected cch a(cpq $$0, hq $$1, cja $$2) {
            return ac.a(new ccl($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cur.a(cjd.te, new ig() {
         @Override
         protected cch a(cpq $$0, hq $$1, cja $$2) {
            return ac.a(new ccr($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cur.a(cjd.uu, new ij() {
         @Override
         public cja dispense(gx $$0, cja $$1) {
            return (new ig() {
               @Override
               protected cch a(cpq $$0, hq $$1, cja $$2) {
                  return ac.a(new ccs($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cur.a(cjd.ux, new ij() {
         @Override
         public cja dispense(gx $$0, cja $$1) {
            return (new ig() {
               @Override
               protected cch a(cpq $$0, hq $$1, cja $$2) {
                  return ac.a(new ccs($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
         public cja a(gx $$0, cja $$1) {
            hc $$2 = $$0.e().c(cur.a);
            bip<?> $$3 = ((ckf)$$1.d()).a($$1.v());

            try {
               $$3.a($$0.g(), $$1, null, $$0.d().a($$2), bjf.o, $$2 != hc.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.d(), var6);
               return cja.b;
            }

            $$1.h(1);
            $$0.g().a(null, djo.t, $$0.d());
            return $$1;
         }
      };

      for (ckf $$1 : ckf.h()) {
         cur.a($$1, $$0);
      }

      cur.a(cjd.tL, new ii() {
         @Override
         public cja a(gx $$0, cja $$1) {
            hc $$2 = $$0.e().c(cur.a);
            gw $$3 = $$0.d().a($$2);
            akn $$4 = $$0.g();
            Consumer<bxy> $$5 = bip.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            bxy $$6 = bip.d.a($$4, $$1.v(), $$5, $$3, bjf.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      cur.a(cjd.mZ, new ik() {
         @Override
         public cja a(gx $$0, cja $$1) {
            gw $$2 = $$0.d().a($$0.e().c(cur.a));
            List<bjb> $$3 = $$0.g().a(bjb.class, new ehd($$2), $$0x -> !($$0x instanceof bjr $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((bjr)$$3.get(0)).a(apa.e);
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
         protected cja a(gx $$0, cja $$1) {
            gw $$2 = $$0.d().a($$0.e().c(cur.a));

            for (bwl $$4 : $$0.g().a(bwl.class, new ehd($$2), $$0x -> $$0x.bv() && $$0x.gJ())) {
               if ($$4.l($$1) && !$$4.gK() && $$4.gp()) {
                  $$4.a_(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      cur.a(cjd.tP, $$2);
      cur.a(cjd.tM, $$2);
      cur.a(cjd.tN, $$2);
      cur.a(cjd.tO, $$2);
      cur.a(cjd.hi, $$2);
      cur.a(cjd.hj, $$2);
      cur.a(cjd.hr, $$2);
      cur.a(cjd.ht, $$2);
      cur.a(cjd.hu, $$2);
      cur.a(cjd.hx, $$2);
      cur.a(cjd.hp, $$2);
      cur.a(cjd.hv, $$2);
      cur.a(cjd.hl, $$2);
      cur.a(cjd.hq, $$2);
      cur.a(cjd.hn, $$2);
      cur.a(cjd.hk, $$2);
      cur.a(cjd.ho, $$2);
      cur.a(cjd.hs, $$2);
      cur.a(cjd.hw, $$2);
      cur.a(cjd.hm, $$2);
      cur.a(cjd.er, new ik() {
         @Override
         public cja a(gx $$0, cja $$1) {
            gw $$2 = $$0.d().a($$0.e().c(cur.a));

            for (bwk $$4 : $$0.g().a(bwk.class, new ehd($$2), $$0x -> $$0x.bv() && !$$0x.q())) {
               if ($$4.gp() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      cur.a(cjd.tA, new ii() {
         @Override
         public cja a(gx $$0, cja $$1) {
            hc $$2 = $$0.e().c(cur.a);
            ccc $$3 = new ccc($$0.g(), $$1, $$0.a(), $$0.b(), $$0.a(), true);
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
      cur.a(cjd.tf, new ii() {
         @Override
         public cja a(gx $$0, cja $$1) {
            hc $$2 = $$0.e().c(cur.a);
            hq $$3 = cur.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            cpq $$7 = $$0.g();
            arx $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            cck $$12 = new cck($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(gx $$0) {
            $$0.g().c(1018, $$0.d(), 0);
         }
      });
      cur.a(cjd.ni, new ih(cdi.b.a));
      cur.a(cjd.nk, new ih(cdi.b.b));
      cur.a(cjd.nm, new ih(cdi.b.c));
      cur.a(cjd.no, new ih(cdi.b.d));
      cur.a(cjd.nu, new ih(cdi.b.g));
      cur.a(cjd.nq, new ih(cdi.b.e));
      cur.a(cjd.ns, new ih(cdi.b.f));
      cur.a(cjd.nw, new ih(cdi.b.h));
      cur.a(cjd.ny, new ih(cdi.b.i));
      cur.a(cjd.nj, new ih(cdi.b.a, true));
      cur.a(cjd.nl, new ih(cdi.b.b, true));
      cur.a(cjd.nn, new ih(cdi.b.c, true));
      cur.a(cjd.np, new ih(cdi.b.d, true));
      cur.a(cjd.nv, new ih(cdi.b.g, true));
      cur.a(cjd.nr, new ih(cdi.b.e, true));
      cur.a(cjd.nt, new ih(cdi.b.f, true));
      cur.a(cjd.nx, new ih(cdi.b.h, true));
      cur.a(cjd.nz, new ih(cdi.b.i, true));
      ij $$3 = new ii() {
         private final ii c = new ii();

         @Override
         public cja a(gx $$0, cja $$1) {
            chm $$2 = (chm)$$1.d();
            gw $$3 = $$0.d().a($$0.e().c(cur.a));
            cpq $$4 = $$0.g();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cja(cjd.pK);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      cur.a(cjd.pM, $$3);
      cur.a(cjd.pL, $$3);
      cur.a(cjd.pN, $$3);
      cur.a(cjd.pS, $$3);
      cur.a(cjd.pT, $$3);
      cur.a(cjd.pR, $$3);
      cur.a(cjd.pU, $$3);
      cur.a(cjd.pV, $$3);
      cur.a(cjd.pW, $$3);
      cur.a(cjd.pK, new ii() {
         private final ii c = new ii();

         @Override
         public cja a(gx $$0, cja $$1) {
            cpr $$2 = $$0.g();
            gw $$3 = $$0.d().a($$0.e().c(cur.a));
            dfe $$4 = $$2.a_($$3);
            if ($$4.b() instanceof csw $$6) {
               cja $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, djo.y, $$3);
                  civ $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new cja($$8);
                  } else {
                     if ($$0.<ddh>f().a(new cja($$8)) < 0) {
                        this.c.dispense($$0, new cja($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cur.a(cjd.nE, new ik() {
         @Override
         protected cja a(gx $$0, cja $$1) {
            cpq $$2 = $$0.g();
            this.a(true);
            hc $$3 = $$0.e().c(cur.a);
            gw $$4 = $$0.d().a($$3);
            dfe $$5 = $$2.a_($$4);
            if (cse.a($$2, $$4, $$3)) {
               $$2.b($$4, cse.a($$2, $$4));
               $$2.a(null, djo.i, $$4);
            } else if (ctd.h($$5) || cte.g($$5) || ctf.g($$5)) {
               $$2.b($$4, $$5.a(dfu.r, Boolean.valueOf(true)));
               $$2.a(null, djo.c, $$4);
            } else if ($$5.b() instanceof dba) {
               dba.a($$2, $$4);
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
      cur.a(cjd.qK, new ik() {
         @Override
         protected cja a(gx $$0, cja $$1) {
            this.a(true);
            cpq $$2 = $$0.g();
            gw $$3 = $$0.d().a($$0.e().c(cur.a));
            if (!cgv.a($$1, $$2, $$3) && !cgv.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 0);
            }

            return $$1;
         }
      });
      cur.a(csr.ck, new ii() {
         @Override
         protected cja a(gx $$0, cja $$1) {
            cpq $$2 = $$0.g();
            gw $$3 = $$0.d().a($$0.e().c(cur.a));
            byj $$4 = new byj($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dp(), $$4.dr(), $$4.dv(), aoz.xL, apa.e, 1.0F, 1.0F);
            $$2.a(null, djo.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      ij $$4 = new ik() {
         @Override
         protected cja a(gx $$0, cja $$1) {
            this.a(cgk.a($$0, $$1));
            return $$1;
         }
      };
      cur.a(cjd.tv, $$4);
      cur.a(cjd.tu, $$4);
      cur.a(cjd.tw, $$4);
      cur.a(cjd.tr, $$4);
      cur.a(cjd.tx, $$4);
      cur.a(cjd.tt, $$4);
      cur.a(cjd.ts, new ik() {
         @Override
         protected cja a(gx $$0, cja $$1) {
            cpq $$2 = $$0.g();
            hc $$3 = $$0.e().c(cur.a);
            gw $$4 = $$0.d().a($$3);
            if ($$2.t($$4) && dcc.b($$2, $$4, $$1)) {
               $$2.a($$4, csr.gG.n().a(czs.c, Integer.valueOf(dgk.a($$3))), 3);
               $$2.a(null, djo.i, $$4);
               dcq $$5 = $$2.c_($$4);
               if ($$5 instanceof dea) {
                  dcc.a($$2, $$4, (dea)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cgk.a($$0, $$1));
            }

            return $$1;
         }
      });
      cur.a(csr.ef, new ik() {
         @Override
         protected cja a(gx $$0, cja $$1) {
            cpq $$2 = $$0.g();
            gw $$3 = $$0.d().a($$0.e().c(cur.a));
            ctj $$4 = (ctj)csr.ef;
            if ($$2.t($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.n(), 3);
                  $$2.a(null, djo.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cgk.a($$0, $$1));
            }

            return $$1;
         }
      });
      cur.a(csr.kP.k(), new im());

      for (cho $$5 : cho.values()) {
         cur.a(czp.a($$5).k(), new im());
      }

      cur.a(cjd.rw.k(), new ik() {
         private final ii c = new ii();

         private cja a(gx $$0, cja $$1, cja $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.g().a(null, djo.y, $$0.d());
               return $$2.p();
            } else {
               if ($$0.<ddh>f().a($$2.p()) < 0) {
                  this.c.dispense($$0, $$2.p());
               }

               return $$1;
            }
         }

         @Override
         public cja a(gx $$0, cja $$1) {
            this.a(false);
            akn $$2 = $$0.g();
            gw $$3 = $$0.d().a($$0.e().c(cur.a));
            dfe $$4 = $$2.a_($$3);
            if ($$4.a(apo.aF, $$0x -> $$0x.b(csk.b) && $$0x.b() instanceof csk) && $$4.c(csk.b) >= 5) {
               ((csk)$$4.b()).a($$2, $$4, $$3, null, dcn.b.b);
               this.a(true);
               return this.a($$0, $$1, new cja(cjd.vD));
            } else if ($$2.b_($$3).a(apt.a)) {
               this.a(true);
               return this.a($$0, $$1, ckz.a(new cja(cjd.rv), cla.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cur.a(cjd.eY, new ik() {
         @Override
         public cja a(gx $$0, cja $$1) {
            hc $$2 = $$0.e().c(cur.a);
            gw $$3 = $$0.d().a($$2);
            cpq $$4 = $$0.g();
            dfe $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(csr.pl)) {
               if ($$5.c(cyx.c) != 4) {
                  cyx.a(null, $$4, $$3, $$5);
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
      cur.a(cjd.rg.k(), new il());
      cur.a(cjd.vA, new ik() {
         @Override
         public cja a(gx $$0, cja $$1) {
            gw $$2 = $$0.d().a($$0.e().c(cur.a));
            cpq $$3 = $$0.g();
            dfe $$4 = $$3.a_($$2);
            Optional<dfe> $$5 = cip.b($$4);
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
      cur.a(cjd.rv, new ii() {
         private final ii c = new ii();

         @Override
         public cja a(gx $$0, cja $$1) {
            if (ckz.d($$1) != cla.c) {
               return this.c.dispense($$0, $$1);
            } else {
               akn $$2 = $$0.g();
               gw $$3 = $$0.d();
               gw $$4 = $$0.d().a($$0.e().c(cur.a));
               if (!$$2.a_($$4).a(apo.ca)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(ix.ag, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, aoz.ch, apa.e, 1.0F, 1.0F);
                  $$2.a(null, djo.z, $$3);
                  $$2.b($$4, csr.rH.n());
                  return new cja(cjd.rw);
               }
            }
         }
      });
   }

   static void a(gx $$0, bil $$1, hc $$2) {
      $$1.e(
         $$0.a() + (double)$$2.j() * (0.5000099999997474 - (double)$$1.df() / 2.0),
         $$0.b() + (double)$$2.k() * (0.5000099999997474 - (double)$$1.dg() / 2.0) - (double)$$1.dg() / 2.0,
         $$0.c() + (double)$$2.l() * (0.5000099999997474 - (double)$$1.df() / 2.0)
      );
   }
}
