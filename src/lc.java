import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lc {
   Logger a = LogUtils.getLogger();
   lc b = ($$0, $$1) -> $$1;

   cwq dispense(kz var1, cwq var2);

   static void a() {
      dlt.a(cwu.pb);
      dlt.a(cwu.wq);
      dlt.a(cwu.wp);
      dlt.a(cwu.ry);
      dlt.a(cwu.rj);
      dlt.a(cwu.uU);
      dlt.a(cwu.wo);
      dlt.a(cwu.wr);
      dlt.a(cwu.vt);
      dlt.a(cwu.uV);
      dlt.a(cwu.uW);
      lb $$0 = new lb() {
         @Override
         public cwq a(kz $$0, cwq $$1) {
            jn $$2 = $$0.d().c(dlt.b);
            but<?> $$3 = ((cxz)$$1.h()).a($$0.b().K_(), $$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bus.o, $$2 != jn.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cwq.j;
            }

            $$1.h(1);
            $$0.b().a(null, ebu.t, $$0.c());
            return $$1;
         }
      };

      for (cxz $$1 : cxz.b()) {
         dlt.a($$1, $$0);
      }

      dlt.a(cwu.vF, new lb() {
         @Override
         public cwq a(kz $$0, cwq $$1) {
            jn $$2 = $$0.d().c(dlt.b);
            ji $$3 = $$0.c().a($$2);
            ard $$4 = $$0.b();
            Consumer<cks> $$5 = but.a($$1x -> $$1x.v($$2.p()), $$4, $$1, null);
            cks $$6 = but.f.a($$4, $$5, $$3, bus.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dlt.a(cwu.on, new lf() {
         @Override
         public cwq a(kz $$0, cwq $$1) {
            ji $$2 = $$0.c().a($$0.d().c(dlt.b));
            List<bvi> $$3 = $$0.b().a(bvi.class, new faw($$2), $$0x -> !($$0x instanceof bvy $$1x) ? false : !$$1x.j() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bvy)$$3.get(0)).a($$1.a(1), awb.e);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dlt.a(cwu.fb, new lf() {
         @Override
         public cwq a(kz $$0, cwq $$1) {
            ji $$2 = $$0.c().a($$0.d().c(dlt.b));

            for (cjc $$4 : $$0.b().a(cjc.class, new faw($$2), $$0x -> $$0x.bL() && !$$0x.t())) {
               if ($$4.gJ() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dlt.a(cwu.ox, new la(but.aG));
      dlt.a(cwu.oz, new la(but.bo));
      dlt.a(cwu.oB, new la(but.m));
      dlt.a(cwu.oD, new la(but.at));
      dlt.a(cwu.oJ, new la(but.F));
      dlt.a(cwu.oF, new la(but.a));
      dlt.a(cwu.oH, new la(but.w));
      dlt.a(cwu.oN, new la(but.aA));
      dlt.a(cwu.oL, new la(but.aL));
      dlt.a(cwu.oP, new la(but.j));
      dlt.a(cwu.oy, new la(but.aH));
      dlt.a(cwu.oA, new la(but.bp));
      dlt.a(cwu.oC, new la(but.n));
      dlt.a(cwu.oE, new la(but.au));
      dlt.a(cwu.oK, new la(but.G));
      dlt.a(cwu.oG, new la(but.b));
      dlt.a(cwu.oI, new la(but.x));
      dlt.a(cwu.oO, new la(but.aB));
      dlt.a(cwu.oM, new la(but.aM));
      dlt.a(cwu.oQ, new la(but.i));
      lc $$2 = new lb() {
         private final lb c = new lb();

         @Override
         public cwq a(kz $$0, cwq $$1) {
            cvl $$2 = (cvl)$$1.h();
            ji $$3 = $$0.c().a($$0.d().c(dlt.b));
            dgj $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cwq(cwu.rf));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dlt.a(cwu.rh, $$2);
      dlt.a(cwu.rg, $$2);
      dlt.a(cwu.ri, $$2);
      dlt.a(cwu.rn, $$2);
      dlt.a(cwu.ro, $$2);
      dlt.a(cwu.rm, $$2);
      dlt.a(cwu.rp, $$2);
      dlt.a(cwu.rq, $$2);
      dlt.a(cwu.rr, $$2);
      dlt.a(cwu.rf, new lb() {
         @Override
         public cwq a(kz $$0, cwq $$1) {
            dgk $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dlt.b));
            dwy $$4 = $$2.a_($$3);
            if ($$4.b() instanceof djv $$6) {
               cwq $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, ebu.y, $$3);
                  cwm $$8 = $$7.h();
                  return this.a($$0, $$1, new cwq($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dlt.a(cwu.oX, new lf() {
         @Override
         protected cwq a(kz $$0, cwq $$1) {
            ard $$2 = $$0.b();
            this.a(true);
            jn $$3 = $$0.d().c(dlt.b);
            ji $$4 = $$0.c().a($$3);
            dwy $$5 = $$2.a_($$4);
            if (dja.a($$2, $$4, $$3)) {
               $$2.b($$4, dja.a($$2, $$4));
               $$2.a(null, ebu.i, $$4);
            } else if (dkc.i($$5) || dkd.h($$5) || dke.h($$5)) {
               $$2.b($$4, $$5.b(dxo.v, Boolean.valueOf(true)));
               $$2.a(null, ebu.c, $$4);
            } else if ($$5.b() instanceof dsb) {
               dsb.a($$2, $$4);
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
      dlt.a(cwu.sv, new lf() {
         @Override
         protected cwq a(kz $$0, cwq $$1) {
            this.a(true);
            dgj $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dlt.b));
            if (!cuy.a($$1, $$2, $$3) && !cuy.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dlt.a(djp.cr, new lb() {
         @Override
         protected cwq a(kz $$0, cwq $$1) {
            dgj $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dlt.b));
            cle $$4 = new cle($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dA(), $$4.dC(), $$4.dG(), awa.Am, awb.e, 1.0F, 1.0F);
            $$2.a(null, ebu.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dlt.a(cwu.vl, new lf() {
         @Override
         protected cwq a(kz $$0, cwq $$1) {
            dgj $$2 = $$0.b();
            jn $$3 = $$0.d().c(dlt.b);
            ji $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dtl.b($$2, $$4, $$1)) {
               $$2.a($$4, djp.hd.m().b(dqu.e, Integer.valueOf(dyd.a($$3))), 3);
               $$2.a(null, ebu.i, $$4);
               dua $$5 = $$2.c_($$4);
               if ($$5 instanceof dvp) {
                  dtl.a($$2, $$4, (dvp)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ld.b($$0, $$1));
            }

            return $$1;
         }
      });
      dlt.a(djp.er, new lf() {
         @Override
         protected cwq a(kz $$0, cwq $$1) {
            dgj $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dlt.b));
            dki $$4 = (dki)djp.er;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, ebu.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ld.b($$0, $$1));
            }

            return $$1;
         }
      });
      dlt.a(djp.lr.j(), new li());

      for (cvn $$3 : cvn.values()) {
         dlt.a(dqr.a($$3).j(), new li());
      }

      dlt.a(cwu.th.j(), new lf() {
         private cwq b(kz $$0, cwq $$1, cwq $$2) {
            $$0.b().a(null, ebu.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cwq a(kz $$0, cwq $$1) {
            this.a(false);
            ard $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dlt.b));
            dwy $$4 = $$2.a_($$3);
            if ($$4.a(awp.aJ, $$0x -> $$0x.b(djh.c) && $$0x.b() instanceof djh) && $$4.c(djh.c) >= 5) {
               ((djh)$$4.b()).a($$2, $$4, $$3, null, dtx.b.b);
               this.a(true);
               return this.b($$0, $$1, new cwq(cwu.xD));
            } else if ($$2.b_($$3).a(awv.a)) {
               this.a(true);
               return this.b($$0, $$1, cyp.a(cwu.ti, cyq.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dlt.a(cwu.fJ, new lf() {
         @Override
         public cwq a(kz $$0, cwq $$1) {
            jn $$2 = $$0.d().c(dlt.b);
            ji $$3 = $$0.c().a($$2);
            dgj $$4 = $$0.b();
            dwy $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(djp.pN)) {
               if ($$5.c(dqa.d) != 4) {
                  dqa.a(null, $$4, $$3, $$5);
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
      dlt.a(cwu.sS.j(), new lh());
      dlt.a(cwu.yv.j(), new lf() {
         @Override
         protected cwq a(kz $$0, cwq $$1) {
            ard $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dlt.b));
            List<cii> $$4 = $$2.a(cii.class, new faw($$3), bur.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cii $$5 : $$4) {
                  if ($$5.gw()) {
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
      dlt.a(cwu.xA, new lf() {
         @Override
         public cwq a(kz $$0, cwq $$1) {
            ji $$2 = $$0.c().a($$0.d().c(dlt.b));
            dgj $$3 = $$0.b();
            dwy $$4 = $$3.a_($$2);
            Optional<dwy> $$5 = cwh.a($$4);
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
      dlt.a(cwu.ti, new lb() {
         private final lb c = new lb();

         @Override
         public cwq a(kz $$0, cwq $$1) {
            cyp $$2 = $$1.a(kv.Q, cyp.a);
            if (!$$2.a(cyq.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               ard $$3 = $$0.b();
               ji $$4 = $$0.c();
               ji $$5 = $$0.c().a($$0.d().c(dlt.b));
               if (!$$3.a_($$5).a(awp.cl)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lt.ao, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awa.cB, awb.e, 1.0F, 1.0F);
                  $$3.a(null, ebu.z, $$4);
                  $$3.b($$5, djp.tk.m());
                  return this.a($$0, $$1, new cwq(cwu.th));
               }
            }
         }
      });
      dlt.a(cwu.oo, new le(but.aD));
      dlt.a(cwu.op, new le(but.y));
      dlt.a(cwu.oq, new le(but.ac));
      dlt.a(cwu.or, new le(but.bw));
      dlt.a(cwu.os, new le(but.ak));
      dlt.a(cwu.vM, new le(but.B));
   }
}
