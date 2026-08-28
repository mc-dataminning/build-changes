import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lg {
   Logger a = LogUtils.getLogger();
   lg b = ($$0, $$1) -> $$1;

   cys dispense(ld var1, cys var2);

   static void a() {
      doa.a(cyw.pf);
      doa.a(cyw.wu);
      doa.a(cyw.wt);
      doa.a(cyw.rC);
      doa.a(cyw.rn);
      doa.a(cyw.uY);
      doa.a(cyw.ws);
      doa.a(cyw.wv);
      doa.a(cyw.vx);
      doa.a(cyw.uZ);
      doa.a(cyw.va);
      lf $$0 = new lf() {
         @Override
         public cys a(ld $$0, cys $$1) {
            ja $$2 = $$0.d().c(doa.b);
            bwj<?> $$3 = ((czz)$$1.h()).a($$0.b().F_(), $$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bwi.o, $$2 != ja.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cys.k;
            }

            $$1.h(1);
            $$0.b().a(null, eeo.t, $$0.c());
            return $$1;
         }
      };

      for (czz $$1 : czz.a()) {
         doa.a($$1, $$0);
      }

      doa.a(cyw.vJ, new lf() {
         @Override
         public cys a(ld $$0, cys $$1) {
            ja $$2 = $$0.d().c(doa.b);
            iu $$3 = $$0.c().a($$2);
            aro $$4 = $$0.b();
            Consumer<cmm> $$5 = bwj.a($$1x -> $$1x.w($$2.p()), $$4, $$1, null);
            cmm $$6 = bwj.f.a($$4, $$5, $$3, bwi.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      doa.a(cyw.fd, new lj() {
         @Override
         public cys a(ld $$0, cys $$1) {
            iu $$2 = $$0.c().a($$0.d().c(doa.b));

            for (ckw $$4 : $$0.b().a(ckw.class, new fdr($$2), $$0x -> $$0x.bK() && !$$0x.t())) {
               if ($$4.gH() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      doa.a(cyw.oz, new le(bwj.aG));
      doa.a(cyw.oB, new le(bwj.bp));
      doa.a(cyw.oD, new le(bwj.m));
      doa.a(cyw.oF, new le(bwj.at));
      doa.a(cyw.oL, new le(bwj.F));
      doa.a(cyw.oH, new le(bwj.a));
      doa.a(cyw.oJ, new le(bwj.w));
      doa.a(cyw.oP, new le(bwj.aA));
      doa.a(cyw.oN, new le(bwj.aL));
      doa.a(cyw.oR, new le(bwj.j));
      doa.a(cyw.oA, new le(bwj.aH));
      doa.a(cyw.oC, new le(bwj.bq));
      doa.a(cyw.oE, new le(bwj.n));
      doa.a(cyw.oG, new le(bwj.au));
      doa.a(cyw.oM, new le(bwj.G));
      doa.a(cyw.oI, new le(bwj.b));
      doa.a(cyw.oK, new le(bwj.x));
      doa.a(cyw.oQ, new le(bwj.aB));
      doa.a(cyw.oO, new le(bwj.aM));
      doa.a(cyw.oS, new le(bwj.i));
      lg $$2 = new lf() {
         private final lf c = new lf();

         @Override
         public cys a(ld $$0, cys $$1) {
            cxo $$2 = (cxo)$$1.h();
            iu $$3 = $$0.c().a($$0.d().c(doa.b));
            dip $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cys(cyw.rj));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      doa.a(cyw.rl, $$2);
      doa.a(cyw.rk, $$2);
      doa.a(cyw.rm, $$2);
      doa.a(cyw.rr, $$2);
      doa.a(cyw.rs, $$2);
      doa.a(cyw.rq, $$2);
      doa.a(cyw.rt, $$2);
      doa.a(cyw.ru, $$2);
      doa.a(cyw.rv, $$2);
      doa.a(cyw.rj, new lf() {
         @Override
         public cys a(ld $$0, cys $$1) {
            diq $$2 = $$0.b();
            iu $$3 = $$0.c().a($$0.d().c(doa.b));
            dzo $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dmc $$6) {
               cys $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, eeo.y, $$3);
                  cyo $$8 = $$7.h();
                  return this.a($$0, $$1, new cys($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      doa.a(cyw.pb, new lj() {
         @Override
         protected cys a(ld $$0, cys $$1) {
            aro $$2 = $$0.b();
            this.a(true);
            ja $$3 = $$0.d().c(doa.b);
            iu $$4 = $$0.c().a($$3);
            dzo $$5 = $$2.a_($$4);
            if (dlh.a($$2, $$4, $$3)) {
               $$2.b($$4, dlh.a($$2, $$4));
               $$2.a(null, eeo.i, $$4);
            } else if (dmj.i($$5) || dmk.h($$5) || dml.h($$5)) {
               $$2.b($$4, $$5.b(eae.u, Boolean.valueOf(true)));
               $$2.a(null, eeo.c, $$4);
            } else if ($$5.b() instanceof dum) {
               dum.a($$2, $$4);
               $$2.a($$4, false);
            } else {
               this.a(false);
            }

            if (this.b()) {
               $$1.a(1, $$2, null, $$0x -> {
               });
            }

            return $$1;
         }
      });
      doa.a(cyw.sz, new lj() {
         @Override
         protected cys a(ld $$0, cys $$1) {
            this.a(true);
            dip $$2 = $$0.b();
            iu $$3 = $$0.c().a($$0.d().c(doa.b));
            if (!cxc.a($$1, $$2, $$3) && !cxc.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      doa.a(dlw.cr, new lf() {
         @Override
         protected cys a(ld $$0, cys $$1) {
            dip $$2 = $$0.b();
            iu $$3 = $$0.c().a($$0.d().c(doa.b));
            cmy $$4 = new cmy($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dA(), $$4.dC(), $$4.dG(), awl.Aw, awm.e, 1.0F, 1.0F);
            $$2.a(null, eeo.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      doa.a(cyw.vp, new lj() {
         @Override
         protected cys a(ld $$0, cys $$1) {
            dip $$2 = $$0.b();
            ja $$3 = $$0.d().c(doa.b);
            iu $$4 = $$0.c().a($$3);
            if ($$2.v($$4) && dvx.b($$2, $$4, $$1)) {
               $$2.a($$4, dlw.hd.m().b(dtc.e, Integer.valueOf(eau.a($$3))), 3);
               $$2.a(null, eeo.i, $$4);
               dwn $$5 = $$2.c_($$4);
               if ($$5 instanceof dyd) {
                  dvx.a($$2, $$4, (dyd)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lh.b($$0, $$1));
            }

            return $$1;
         }
      });
      doa.a(dlw.er, new lj() {
         @Override
         protected cys a(ld $$0, cys $$1) {
            dip $$2 = $$0.b();
            iu $$3 = $$0.c().a($$0.d().c(doa.b));
            dmp $$4 = (dmp)dlw.er;
            if ($$2.v($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, eeo.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lh.b($$0, $$1));
            }

            return $$1;
         }
      });
      doa.a(dlw.lr.h(), new lm());

      for (cxq $$3 : cxq.values()) {
         doa.a(dsz.a($$3).h(), new lm());
      }

      doa.a(cyw.tl.h(), new lj() {
         private cys b(ld $$0, cys $$1, cys $$2) {
            $$0.b().a(null, eeo.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cys a(ld $$0, cys $$1) {
            this.a(false);
            aro $$2 = $$0.b();
            iu $$3 = $$0.c().a($$0.d().c(doa.b));
            dzo $$4 = $$2.a_($$3);
            if ($$4.a(axa.aJ, $$0x -> $$0x.b(dlo.c) && $$0x.b() instanceof dlo) && $$4.c(dlo.c) >= 5) {
               ((dlo)$$4.b()).a($$2, $$4, $$3, null, dwk.b.b);
               this.a(true);
               return this.b($$0, $$1, new cys(cyw.xH));
            } else if ($$2.b_($$3).a(axf.a)) {
               this.a(true);
               return this.b($$0, $$1, dao.a(cyw.tm, dap.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      doa.a(cyw.fL, new lj() {
         @Override
         public cys a(ld $$0, cys $$1) {
            ja $$2 = $$0.d().c(doa.b);
            iu $$3 = $$0.c().a($$2);
            dip $$4 = $$0.b();
            dzo $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dlw.pP)) {
               if ($$5.c(dsh.d) != 4) {
                  dsh.a(null, $$4, $$3, $$5);
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
      doa.a(cyw.sW.h(), new ll());
      doa.a(cyw.yz.h(), new lj() {
         @Override
         protected cys a(ld $$0, cys $$1) {
            aro $$2 = $$0.b();
            iu $$3 = $$0.c().a($$0.d().c(doa.b));
            List<cka> $$4 = $$2.a(cka.class, new fdr($$3), bwh.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cka $$5 : $$4) {
                  if ($$5.gu()) {
                     $$1.a(16, $$2, null, $$0x -> {
                     });
                     return $$1;
                  }
               }

               this.a(false);
               return $$1;
            }
         }
      });
      doa.a(cyw.xE, new lj() {
         @Override
         public cys a(ld $$0, cys $$1) {
            iu $$2 = $$0.c().a($$0.d().c(doa.b));
            dip $$3 = $$0.b();
            dzo $$4 = $$3.a_($$2);
            Optional<dzo> $$5 = cyj.a($$4);
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
      doa.a(cyw.tm, new lf() {
         private final lf c = new lf();

         @Override
         public cys a(ld $$0, cys $$1) {
            dao $$2 = $$1.a(kj.R, dao.a);
            if (!$$2.a(dap.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               aro $$3 = $$0.b();
               iu $$4 = $$0.c();
               iu $$5 = $$0.c().a($$0.d().c(doa.b));
               if (!$$3.a_($$5).a(axa.cm)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lx.ap, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awl.cB, awm.e, 1.0F, 1.0F);
                  $$3.a(null, eeo.z, $$4);
                  $$3.b($$5, dlw.to.m());
                  return this.a($$0, $$1, new cys(cyw.tl));
               }
            }
         }
      });
      doa.a(cyw.oq, new li(bwj.aD));
      doa.a(cyw.or, new li(bwj.y));
      doa.a(cyw.os, new li(bwj.ac));
      doa.a(cyw.ot, new li(bwj.bx));
      doa.a(cyw.ou, new li(bwj.ak));
      doa.a(cyw.vQ, new li(bwj.B));
   }
}
