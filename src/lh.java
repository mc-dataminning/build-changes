import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lh {
   Logger a = LogUtils.getLogger();
   lh b = ($$0, $$1) -> $$1;

   czk dispense(le var1, czk var2);

   static void a() {
      dos.a(czo.pk);
      dos.a(czo.wB);
      dos.a(czo.wA);
      dos.a(czo.rH);
      dos.a(czo.rI);
      dos.a(czo.rJ);
      dos.a(czo.rs);
      dos.a(czo.vf);
      dos.a(czo.wz);
      dos.a(czo.wC);
      dos.a(czo.vE);
      dos.a(czo.vg);
      dos.a(czo.vh);
      lg $$0 = new lg() {
         @Override
         public czk a(le $$0, czk $$1) {
            jb $$2 = $$0.d().c(dos.b);
            bwr<?> $$3 = ((dar)$$1.h()).a($$0.b().F_(), $$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bwq.o, $$2 != jb.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return czk.k;
            }

            $$1.h(1);
            $$0.b().a(null, efo.t, $$0.c());
            return $$1;
         }
      };

      for (dar $$1 : dar.a()) {
         dos.a($$1, $$0);
      }

      dos.a(czo.vQ, new lg() {
         @Override
         public czk a(le $$0, czk $$1) {
            jb $$2 = $$0.d().c(dos.b);
            iv $$3 = $$0.c().a($$2);
            arq $$4 = $$0.b();
            Consumer<cnd> $$5 = bwr.a($$1x -> $$1x.w($$2.p()), $$4, $$1, null);
            cnd $$6 = bwr.f.a($$4, $$5, $$3, bwq.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dos.a(czo.fh, new lk() {
         @Override
         public czk a(le $$0, czk $$1) {
            iv $$2 = $$0.c().a($$0.d().c(dos.b));

            for (clk $$4 : $$0.b().a(clk.class, new fes($$2), $$0x -> $$0x.bI() && !$$0x.t())) {
               if ($$4.gK() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dos.a(czo.oE, new lf(bwr.aG));
      dos.a(czo.oG, new lf(bwr.bp));
      dos.a(czo.oI, new lf(bwr.m));
      dos.a(czo.oK, new lf(bwr.at));
      dos.a(czo.oQ, new lf(bwr.F));
      dos.a(czo.oM, new lf(bwr.a));
      dos.a(czo.oO, new lf(bwr.w));
      dos.a(czo.oU, new lf(bwr.aA));
      dos.a(czo.oS, new lf(bwr.aL));
      dos.a(czo.oW, new lf(bwr.j));
      dos.a(czo.oF, new lf(bwr.aH));
      dos.a(czo.oH, new lf(bwr.bq));
      dos.a(czo.oJ, new lf(bwr.n));
      dos.a(czo.oL, new lf(bwr.au));
      dos.a(czo.oR, new lf(bwr.G));
      dos.a(czo.oN, new lf(bwr.b));
      dos.a(czo.oP, new lf(bwr.x));
      dos.a(czo.oV, new lf(bwr.aB));
      dos.a(czo.oT, new lf(bwr.aM));
      dos.a(czo.oX, new lf(bwr.i));
      lh $$2 = new lg() {
         private final lg c = new lg();

         @Override
         public czk a(le $$0, czk $$1) {
            cyg $$2 = (cyg)$$1.h();
            iv $$3 = $$0.c().a($$0.d().c(dos.b));
            djh $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new czk(czo.ro));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dos.a(czo.rq, $$2);
      dos.a(czo.rp, $$2);
      dos.a(czo.rr, $$2);
      dos.a(czo.rw, $$2);
      dos.a(czo.rx, $$2);
      dos.a(czo.rv, $$2);
      dos.a(czo.ry, $$2);
      dos.a(czo.rz, $$2);
      dos.a(czo.rA, $$2);
      dos.a(czo.ro, new lg() {
         @Override
         public czk a(le $$0, czk $$1) {
            dji $$2 = $$0.b();
            iv $$3 = $$0.c().a($$0.d().c(dos.b));
            eao $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dmu $$6) {
               czk $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, efo.y, $$3);
                  czg $$8 = $$7.h();
                  return this.a($$0, $$1, new czk($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dos.a(czo.pg, new lk() {
         @Override
         protected czk a(le $$0, czk $$1) {
            arq $$2 = $$0.b();
            this.a(true);
            jb $$3 = $$0.d().c(dos.b);
            iv $$4 = $$0.c().a($$3);
            eao $$5 = $$2.a_($$4);
            if (dlz.a($$2, $$4, $$3)) {
               $$2.b($$4, dlz.a($$2, $$4));
               $$2.a(null, efo.i, $$4);
            } else if (dnc.i($$5) || dnd.h($$5) || dne.h($$5)) {
               $$2.b($$4, $$5.b(ebe.u, Boolean.valueOf(true)));
               $$2.a(null, efo.c, $$4);
            } else if ($$5.b() instanceof dvk) {
               dvk.a($$2, $$4);
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
      dos.a(czo.sG, new lk() {
         @Override
         protected czk a(le $$0, czk $$1) {
            this.a(true);
            djh $$2 = $$0.b();
            iv $$3 = $$0.c().a($$0.d().c(dos.b));
            if (!cxu.a($$1, $$2, $$3) && !cxu.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dos.a(dmo.cu, new lg() {
         @Override
         protected czk a(le $$0, czk $$1) {
            djh $$2 = $$0.b();
            iv $$3 = $$0.c().a($$0.d().c(dos.b));
            cnp $$4 = new cnp($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dz(), $$4.dB(), $$4.dF(), awn.AC, awo.e, 1.0F, 1.0F);
            $$2.a(null, efo.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dos.a(czo.vw, new lk() {
         @Override
         protected czk a(le $$0, czk $$1) {
            djh $$2 = $$0.b();
            jb $$3 = $$0.d().c(dos.b);
            iv $$4 = $$0.c().a($$3);
            if ($$2.v($$4) && dww.b($$2, $$4, $$1)) {
               $$2.a($$4, dmo.hh.m().b(dty.e, Integer.valueOf(ebu.a($$3))), 3);
               $$2.a(null, efo.i, $$4);
               dxm $$5 = $$2.c_($$4);
               if ($$5 instanceof dzc) {
                  dww.a($$2, $$4, (dzc)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(li.b($$0, $$1));
            }

            return $$1;
         }
      });
      dos.a(dmo.ev, new lk() {
         @Override
         protected czk a(le $$0, czk $$1) {
            djh $$2 = $$0.b();
            iv $$3 = $$0.c().a($$0.d().c(dos.b));
            dni $$4 = (dni)dmo.ev;
            if ($$2.v($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, efo.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(li.b($$0, $$1));
            }

            return $$1;
         }
      });
      dos.a(dmo.lv.h(), new ln());

      for (cyi $$3 : cyi.values()) {
         dos.a(dtv.a($$3).h(), new ln());
      }

      dos.a(czo.ts.h(), new lk() {
         private czk b(le $$0, czk $$1, czk $$2) {
            $$0.b().a(null, efo.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public czk a(le $$0, czk $$1) {
            this.a(false);
            arq $$2 = $$0.b();
            iv $$3 = $$0.c().a($$0.d().c(dos.b));
            eao $$4 = $$2.a_($$3);
            if ($$4.a(axc.aJ, $$0x -> $$0x.b(dmg.c) && $$0x.b() instanceof dmg) && $$4.c(dmg.c) >= 5) {
               ((dmg)$$4.b()).a($$2, $$4, $$3, null, dxj.b.b);
               this.a(true);
               return this.b($$0, $$1, new czk(czo.xO));
            } else if ($$2.b_($$3).a(axh.a)) {
               this.a(true);
               return this.b($$0, $$1, dbg.a(czo.tt, dbh.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dos.a(czo.fQ, new lk() {
         @Override
         public czk a(le $$0, czk $$1) {
            jb $$2 = $$0.d().c(dos.b);
            iv $$3 = $$0.c().a($$2);
            djh $$4 = $$0.b();
            eao $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dmo.pT)) {
               if ($$5.c(dtb.d) != 4) {
                  dtb.a(null, $$4, $$3, $$5);
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
      dos.a(czo.td.h(), new lm());
      dos.a(czo.yG.h(), new lk() {
         @Override
         protected czk a(le $$0, czk $$1) {
            arq $$2 = $$0.b();
            iv $$3 = $$0.c().a($$0.d().c(dos.b));
            List<cko> $$4 = $$2.a(cko.class, new fes($$3), bwp.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cko $$5 : $$4) {
                  if ($$5.gx()) {
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
      dos.a(czo.xL, new lk() {
         @Override
         public czk a(le $$0, czk $$1) {
            iv $$2 = $$0.c().a($$0.d().c(dos.b));
            djh $$3 = $$0.b();
            eao $$4 = $$3.a_($$2);
            Optional<eao> $$5 = czb.a($$4);
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
      dos.a(czo.tt, new lg() {
         private final lg c = new lg();

         @Override
         public czk a(le $$0, czk $$1) {
            dbg $$2 = $$1.a(kk.R, dbg.a);
            if (!$$2.a(dbh.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arq $$3 = $$0.b();
               iv $$4 = $$0.c();
               iv $$5 = $$0.c().a($$0.d().c(dos.b));
               if (!$$3.a_($$5).a(axc.co)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(ly.ap, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awn.cB, awo.e, 1.0F, 1.0F);
                  $$3.a(null, efo.z, $$4);
                  $$3.b($$5, dmo.ts.m());
                  return this.a($$0, $$1, new czk(czo.ts));
               }
            }
         }
      });
      dos.a(czo.ov, new lj(bwr.aD));
      dos.a(czo.ow, new lj(bwr.y));
      dos.a(czo.ox, new lj(bwr.ac));
      dos.a(czo.oy, new lj(bwr.bx));
      dos.a(czo.oz, new lj(bwr.ak));
      dos.a(czo.vX, new lj(bwr.B));
   }
}
