import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lg {
   Logger a = LogUtils.getLogger();
   lg b = ($$0, $$1) -> $$1;

   cyy dispense(ld var1, cyy var2);

   static void a() {
      dog.a(czc.ph);
      dog.a(czc.ww);
      dog.a(czc.wv);
      dog.a(czc.rE);
      dog.a(czc.rp);
      dog.a(czc.va);
      dog.a(czc.wu);
      dog.a(czc.wx);
      dog.a(czc.vz);
      dog.a(czc.vb);
      dog.a(czc.vc);
      lf $$0 = new lf() {
         @Override
         public cyy a(ld $$0, cyy $$1) {
            ja $$2 = $$0.d().c(dog.b);
            bwm<?> $$3 = ((daf)$$1.h()).a($$0.b().F_(), $$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bwl.o, $$2 != ja.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cyy.k;
            }

            $$1.h(1);
            $$0.b().a(null, eez.t, $$0.c());
            return $$1;
         }
      };

      for (daf $$1 : daf.a()) {
         dog.a($$1, $$0);
      }

      dog.a(czc.vL, new lf() {
         @Override
         public cyy a(ld $$0, cyy $$1) {
            ja $$2 = $$0.d().c(dog.b);
            iu $$3 = $$0.c().a($$2);
            arq $$4 = $$0.b();
            Consumer<cms> $$5 = bwm.a($$1x -> $$1x.w($$2.p()), $$4, $$1, null);
            cms $$6 = bwm.f.a($$4, $$5, $$3, bwl.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dog.a(czc.ff, new lj() {
         @Override
         public cyy a(ld $$0, cyy $$1) {
            iu $$2 = $$0.c().a($$0.d().c(dog.b));

            for (clc $$4 : $$0.b().a(clc.class, new fed($$2), $$0x -> $$0x.bK() && !$$0x.t())) {
               if ($$4.gH() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dog.a(czc.oB, new le(bwm.aG));
      dog.a(czc.oD, new le(bwm.bp));
      dog.a(czc.oF, new le(bwm.m));
      dog.a(czc.oH, new le(bwm.at));
      dog.a(czc.oN, new le(bwm.F));
      dog.a(czc.oJ, new le(bwm.a));
      dog.a(czc.oL, new le(bwm.w));
      dog.a(czc.oR, new le(bwm.aA));
      dog.a(czc.oP, new le(bwm.aL));
      dog.a(czc.oT, new le(bwm.j));
      dog.a(czc.oC, new le(bwm.aH));
      dog.a(czc.oE, new le(bwm.bq));
      dog.a(czc.oG, new le(bwm.n));
      dog.a(czc.oI, new le(bwm.au));
      dog.a(czc.oO, new le(bwm.G));
      dog.a(czc.oK, new le(bwm.b));
      dog.a(czc.oM, new le(bwm.x));
      dog.a(czc.oS, new le(bwm.aB));
      dog.a(czc.oQ, new le(bwm.aM));
      dog.a(czc.oU, new le(bwm.i));
      lg $$2 = new lf() {
         private final lf c = new lf();

         @Override
         public cyy a(ld $$0, cyy $$1) {
            cxu $$2 = (cxu)$$1.h();
            iu $$3 = $$0.c().a($$0.d().c(dog.b));
            div $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cyy(czc.rl));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dog.a(czc.rn, $$2);
      dog.a(czc.rm, $$2);
      dog.a(czc.ro, $$2);
      dog.a(czc.rt, $$2);
      dog.a(czc.ru, $$2);
      dog.a(czc.rs, $$2);
      dog.a(czc.rv, $$2);
      dog.a(czc.rw, $$2);
      dog.a(czc.rx, $$2);
      dog.a(czc.rl, new lf() {
         @Override
         public cyy a(ld $$0, cyy $$1) {
            diw $$2 = $$0.b();
            iu $$3 = $$0.c().a($$0.d().c(dog.b));
            dzz $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dmi $$6) {
               cyy $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, eez.y, $$3);
                  cyu $$8 = $$7.h();
                  return this.a($$0, $$1, new cyy($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dog.a(czc.pd, new lj() {
         @Override
         protected cyy a(ld $$0, cyy $$1) {
            arq $$2 = $$0.b();
            this.a(true);
            ja $$3 = $$0.d().c(dog.b);
            iu $$4 = $$0.c().a($$3);
            dzz $$5 = $$2.a_($$4);
            if (dln.a($$2, $$4, $$3)) {
               $$2.b($$4, dln.a($$2, $$4));
               $$2.a(null, eez.i, $$4);
            } else if (dmp.i($$5) || dmq.h($$5) || dmr.h($$5)) {
               $$2.b($$4, $$5.b(eap.u, Boolean.valueOf(true)));
               $$2.a(null, eez.c, $$4);
            } else if ($$5.b() instanceof duv) {
               duv.a($$2, $$4);
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
      dog.a(czc.sB, new lj() {
         @Override
         protected cyy a(ld $$0, cyy $$1) {
            this.a(true);
            div $$2 = $$0.b();
            iu $$3 = $$0.c().a($$0.d().c(dog.b));
            if (!cxi.a($$1, $$2, $$3) && !cxi.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dog.a(dmc.cs, new lf() {
         @Override
         protected cyy a(ld $$0, cyy $$1) {
            div $$2 = $$0.b();
            iu $$3 = $$0.c().a($$0.d().c(dog.b));
            cne $$4 = new cne($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dA(), $$4.dC(), $$4.dG(), awn.Az, awo.e, 1.0F, 1.0F);
            $$2.a(null, eez.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dog.a(czc.vr, new lj() {
         @Override
         protected cyy a(ld $$0, cyy $$1) {
            div $$2 = $$0.b();
            ja $$3 = $$0.d().c(dog.b);
            iu $$4 = $$0.c().a($$3);
            if ($$2.v($$4) && dwh.b($$2, $$4, $$1)) {
               $$2.a($$4, dmc.he.m().b(dtk.e, Integer.valueOf(ebf.a($$3))), 3);
               $$2.a(null, eez.i, $$4);
               dwx $$5 = $$2.c_($$4);
               if ($$5 instanceof dyn) {
                  dwh.a($$2, $$4, (dyn)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lh.b($$0, $$1));
            }

            return $$1;
         }
      });
      dog.a(dmc.es, new lj() {
         @Override
         protected cyy a(ld $$0, cyy $$1) {
            div $$2 = $$0.b();
            iu $$3 = $$0.c().a($$0.d().c(dog.b));
            dmv $$4 = (dmv)dmc.es;
            if ($$2.v($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, eez.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lh.b($$0, $$1));
            }

            return $$1;
         }
      });
      dog.a(dmc.ls.h(), new lm());

      for (cxw $$3 : cxw.values()) {
         dog.a(dth.a($$3).h(), new lm());
      }

      dog.a(czc.tn.h(), new lj() {
         private cyy b(ld $$0, cyy $$1, cyy $$2) {
            $$0.b().a(null, eez.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cyy a(ld $$0, cyy $$1) {
            this.a(false);
            arq $$2 = $$0.b();
            iu $$3 = $$0.c().a($$0.d().c(dog.b));
            dzz $$4 = $$2.a_($$3);
            if ($$4.a(axc.aJ, $$0x -> $$0x.b(dlu.c) && $$0x.b() instanceof dlu) && $$4.c(dlu.c) >= 5) {
               ((dlu)$$4.b()).a($$2, $$4, $$3, null, dwu.b.b);
               this.a(true);
               return this.b($$0, $$1, new cyy(czc.xJ));
            } else if ($$2.b_($$3).a(axh.a)) {
               this.a(true);
               return this.b($$0, $$1, dau.a(czc.to, dav.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dog.a(czc.fN, new lj() {
         @Override
         public cyy a(ld $$0, cyy $$1) {
            ja $$2 = $$0.d().c(dog.b);
            iu $$3 = $$0.c().a($$2);
            div $$4 = $$0.b();
            dzz $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dmc.pQ)) {
               if ($$5.c(dso.d) != 4) {
                  dso.a(null, $$4, $$3, $$5);
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
      dog.a(czc.sY.h(), new ll());
      dog.a(czc.yB.h(), new lj() {
         @Override
         protected cyy a(ld $$0, cyy $$1) {
            arq $$2 = $$0.b();
            iu $$3 = $$0.c().a($$0.d().c(dog.b));
            List<ckg> $$4 = $$2.a(ckg.class, new fed($$3), bwk.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (ckg $$5 : $$4) {
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
      dog.a(czc.xG, new lj() {
         @Override
         public cyy a(ld $$0, cyy $$1) {
            iu $$2 = $$0.c().a($$0.d().c(dog.b));
            div $$3 = $$0.b();
            dzz $$4 = $$3.a_($$2);
            Optional<dzz> $$5 = cyp.a($$4);
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
      dog.a(czc.to, new lf() {
         private final lf c = new lf();

         @Override
         public cyy a(ld $$0, cyy $$1) {
            dau $$2 = $$1.a(kj.R, dau.a);
            if (!$$2.a(dav.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arq $$3 = $$0.b();
               iu $$4 = $$0.c();
               iu $$5 = $$0.c().a($$0.d().c(dog.b));
               if (!$$3.a_($$5).a(axc.cm)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lx.ap, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awn.cB, awo.e, 1.0F, 1.0F);
                  $$3.a(null, eez.z, $$4);
                  $$3.b($$5, dmc.tp.m());
                  return this.a($$0, $$1, new cyy(czc.tn));
               }
            }
         }
      });
      dog.a(czc.os, new li(bwm.aD));
      dog.a(czc.ot, new li(bwm.y));
      dog.a(czc.ou, new li(bwm.ac));
      dog.a(czc.ov, new li(bwm.bx));
      dog.a(czc.ow, new li(bwm.ak));
      dog.a(czc.vS, new li(bwm.B));
   }
}
