import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface li {
   Logger a = LogUtils.getLogger();
   li b = ($$0, $$1) -> $$1;

   dak dispense(lf var1, dak var2);

   static void a() {
      dpu.a(dao.pk);
      dpu.a(dao.wB);
      dpu.a(dao.wA);
      dpu.a(dao.rH);
      dpu.a(dao.rI);
      dpu.a(dao.rJ);
      dpu.a(dao.rs);
      dpu.a(dao.vf);
      dpu.a(dao.wz);
      dpu.a(dao.wC);
      dpu.a(dao.vE);
      dpu.a(dao.vg);
      dpu.a(dao.vh);
      lh $$0 = new lh() {
         @Override
         public dak a(lf $$0, dak $$1) {
            jc $$2 = $$0.d().c(dpu.b);
            bxn<?> $$3 = ((dbr)$$1.h()).a($$0.b().J_(), $$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bxm.o, $$2 != jc.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return dak.l;
            }

            $$1.h(1);
            $$0.b().a(null, egq.t, $$0.c());
            return $$1;
         }
      };

      for (dbr $$1 : dbr.a()) {
         dpu.a($$1, $$0);
      }

      dpu.a(dao.vQ, new lh() {
         @Override
         public dak a(lf $$0, dak $$1) {
            jc $$2 = $$0.d().c(dpu.b);
            iw $$3 = $$0.c().a($$2);
            asb $$4 = $$0.b();
            Consumer<coc> $$5 = bxn.a($$1x -> $$1x.w($$2.p()), $$4, $$1, null);
            coc $$6 = bxn.g.a($$4, $$5, $$3, bxm.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dpu.a(dao.fh, new ll() {
         @Override
         public dak a(lf $$0, dak $$1) {
            iw $$2 = $$0.c().a($$0.d().c(dpu.b));

            for (cmd $$4 : $$0.b().a(cmd.class, new ffx($$2), $$0x -> $$0x.bJ() && !$$0x.t())) {
               if ($$4.gL() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dpu.a(dao.oE, new lg(bxn.aH));
      dpu.a(dao.oG, new lg(bxn.bq));
      dpu.a(dao.oI, new lg(bxn.n));
      dpu.a(dao.oK, new lg(bxn.au));
      dpu.a(dao.oQ, new lg(bxn.G));
      dpu.a(dao.oM, new lg(bxn.b));
      dpu.a(dao.oO, new lg(bxn.x));
      dpu.a(dao.oU, new lg(bxn.aB));
      dpu.a(dao.oS, new lg(bxn.aM));
      dpu.a(dao.oW, new lg(bxn.k));
      dpu.a(dao.oF, new lg(bxn.aI));
      dpu.a(dao.oH, new lg(bxn.br));
      dpu.a(dao.oJ, new lg(bxn.o));
      dpu.a(dao.oL, new lg(bxn.av));
      dpu.a(dao.oR, new lg(bxn.H));
      dpu.a(dao.oN, new lg(bxn.c));
      dpu.a(dao.oP, new lg(bxn.y));
      dpu.a(dao.oV, new lg(bxn.aC));
      dpu.a(dao.oT, new lg(bxn.aN));
      dpu.a(dao.oX, new lg(bxn.j));
      li $$2 = new lh() {
         private final lh c = new lh();

         @Override
         public dak a(lf $$0, dak $$1) {
            czg $$2 = (czg)$$1.h();
            iw $$3 = $$0.c().a($$0.d().c(dpu.b));
            dkj $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new dak(dao.ro));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dpu.a(dao.rq, $$2);
      dpu.a(dao.rp, $$2);
      dpu.a(dao.rr, $$2);
      dpu.a(dao.rw, $$2);
      dpu.a(dao.rx, $$2);
      dpu.a(dao.rv, $$2);
      dpu.a(dao.ry, $$2);
      dpu.a(dao.rz, $$2);
      dpu.a(dao.rA, $$2);
      dpu.a(dao.ro, new lh() {
         @Override
         public dak a(lf $$0, dak $$1) {
            dkk $$2 = $$0.b();
            iw $$3 = $$0.c().a($$0.d().c(dpu.b));
            ebq $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dnw $$6) {
               dak $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, egq.y, $$3);
                  dag $$8 = $$7.h();
                  return this.a($$0, $$1, new dak($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dpu.a(dao.pg, new ll() {
         @Override
         protected dak a(lf $$0, dak $$1) {
            asb $$2 = $$0.b();
            this.a(true);
            jc $$3 = $$0.d().c(dpu.b);
            iw $$4 = $$0.c().a($$3);
            ebq $$5 = $$2.a_($$4);
            if (dnb.a($$2, $$4, $$3)) {
               $$2.b($$4, dnb.a($$2, $$4));
               $$2.a(null, egq.i, $$4);
            } else if (doe.i($$5) || dof.h($$5) || dog.h($$5)) {
               $$2.b($$4, $$5.b(ecg.u, Boolean.valueOf(true)));
               $$2.a(null, egq.c, $$4);
            } else if ($$5.b() instanceof dwm) {
               if (dwm.a($$2, $$4)) {
                  $$2.a($$4, false);
               } else {
                  this.a(false);
               }
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
      dpu.a(dao.sG, new ll() {
         @Override
         protected dak a(lf $$0, dak $$1) {
            this.a(true);
            dkj $$2 = $$0.b();
            iw $$3 = $$0.c().a($$0.d().c(dpu.b));
            if (!cyu.a($$1, $$2, $$3) && !cyu.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dpu.a(dnq.cu, new ll() {
         @Override
         protected dak a(lf $$0, dak $$1) {
            asb $$2 = $$0.b();
            if (!$$2.O().c(dkf.ad)) {
               this.a(false);
               return $$1;
            } else {
               iw $$3 = $$0.c().a($$0.d().c(dpu.b));
               cop $$4 = new cop($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
               $$2.b($$4);
               $$2.a(null, $$4.dA(), $$4.dC(), $$4.dG(), awy.AC, awz.e, 1.0F, 1.0F);
               $$2.a(null, egq.t, $$3);
               $$1.h(1);
               this.a(true);
               return $$1;
            }
         }
      });
      dpu.a(dao.vw, new ll() {
         @Override
         protected dak a(lf $$0, dak $$1) {
            dkj $$2 = $$0.b();
            jc $$3 = $$0.d().c(dpu.b);
            iw $$4 = $$0.c().a($$3);
            if ($$2.v($$4) && dxy.b($$2, $$4, $$1)) {
               $$2.a($$4, dnq.hh.m().b(dva.e, Integer.valueOf(ecw.a($$3))), 3);
               $$2.a(null, egq.i, $$4);
               dyo $$5 = $$2.c_($$4);
               if ($$5 instanceof eae) {
                  dxy.a($$2, $$4, (eae)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lj.b($$0, $$1));
            }

            return $$1;
         }
      });
      dpu.a(dnq.ev, new ll() {
         @Override
         protected dak a(lf $$0, dak $$1) {
            dkj $$2 = $$0.b();
            iw $$3 = $$0.c().a($$0.d().c(dpu.b));
            dok $$4 = (dok)dnq.ev;
            if ($$2.v($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, egq.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lj.b($$0, $$1));
            }

            return $$1;
         }
      });
      dpu.a(dnq.lv.h(), new lo());

      for (czi $$3 : czi.values()) {
         dpu.a(dux.a($$3).h(), new lo());
      }

      dpu.a(dao.ts.h(), new ll() {
         private dak b(lf $$0, dak $$1, dak $$2) {
            $$0.b().a(null, egq.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public dak a(lf $$0, dak $$1) {
            this.a(false);
            asb $$2 = $$0.b();
            iw $$3 = $$0.c().a($$0.d().c(dpu.b));
            ebq $$4 = $$2.a_($$3);
            if ($$4.a(axn.aJ, $$0x -> $$0x.b(dni.c) && $$0x.b() instanceof dni) && $$4.c(dni.c) >= 5) {
               ((dni)$$4.b()).a($$2, $$4, $$3, null, dyl.b.b);
               this.a(true);
               return this.b($$0, $$1, new dak(dao.xO));
            } else if ($$2.b_($$3).a(axs.a)) {
               this.a(true);
               return this.b($$0, $$1, dcg.a(dao.tt, dch.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dpu.a(dao.fQ, new ll() {
         @Override
         public dak a(lf $$0, dak $$1) {
            jc $$2 = $$0.d().c(dpu.b);
            iw $$3 = $$0.c().a($$2);
            dkj $$4 = $$0.b();
            ebq $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dnq.pT)) {
               if ($$5.c(dud.d) != 4) {
                  dud.a(null, $$4, $$3, $$5);
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
      dpu.a(dao.td.h(), new ln());
      dpu.a(dao.yG.h(), new ll() {
         @Override
         protected dak a(lf $$0, dak $$1) {
            asb $$2 = $$0.b();
            iw $$3 = $$0.c().a($$0.d().c(dpu.b));
            List<clh> $$4 = $$2.a(clh.class, new ffx($$3), bxl.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (clh $$5 : $$4) {
                  if ($$5.gy()) {
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
      dpu.a(dao.xL, new ll() {
         @Override
         public dak a(lf $$0, dak $$1) {
            iw $$2 = $$0.c().a($$0.d().c(dpu.b));
            dkj $$3 = $$0.b();
            ebq $$4 = $$3.a_($$2);
            Optional<ebq> $$5 = dab.a($$4);
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
      dpu.a(dao.tt, new lh() {
         private final lh c = new lh();

         @Override
         public dak a(lf $$0, dak $$1) {
            dcg $$2 = $$1.a(kl.R, dcg.a);
            if (!$$2.a(dch.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               asb $$3 = $$0.b();
               iw $$4 = $$0.c();
               iw $$5 = $$0.c().a($$0.d().c(dpu.b));
               if (!$$3.a_($$5).a(axn.co)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lz.ap, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awy.cB, awz.e, 1.0F, 1.0F);
                  $$3.a(null, egq.z, $$4);
                  $$3.b($$5, dnq.ts.m());
                  return this.a($$0, $$1, new dak(dao.ts));
               }
            }
         }
      });
      dpu.a(dao.ov, new lk(bxn.aE));
      dpu.a(dao.ow, new lk(bxn.z));
      dpu.a(dao.ox, new lk(bxn.ad));
      dpu.a(dao.oy, new lk(bxn.by));
      dpu.a(dao.oz, new lk(bxn.al));
      dpu.a(dao.vX, new lk(bxn.C));
   }
}
