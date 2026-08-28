import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lg {
   Logger a = LogUtils.getLogger();
   lg b = ($$0, $$1) -> $$1;

   czd dispense(ld var1, czd var2);

   static void a() {
      dol.a(czh.pk);
      dol.a(czh.wB);
      dol.a(czh.wA);
      dol.a(czh.rH);
      dol.a(czh.rI);
      dol.a(czh.rJ);
      dol.a(czh.rs);
      dol.a(czh.vf);
      dol.a(czh.wz);
      dol.a(czh.wC);
      dol.a(czh.vE);
      dol.a(czh.vg);
      dol.a(czh.vh);
      lf $$0 = new lf() {
         @Override
         public czd a(ld $$0, czd $$1) {
            ja $$2 = $$0.d().c(dol.b);
            bwo<?> $$3 = ((dak)$$1.h()).a($$0.b().F_(), $$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bwn.o, $$2 != ja.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return czd.k;
            }

            $$1.h(1);
            $$0.b().a(null, efh.t, $$0.c());
            return $$1;
         }
      };

      for (dak $$1 : dak.a()) {
         dol.a($$1, $$0);
      }

      dol.a(czh.vQ, new lf() {
         @Override
         public czd a(ld $$0, czd $$1) {
            ja $$2 = $$0.d().c(dol.b);
            iu $$3 = $$0.c().a($$2);
            arq $$4 = $$0.b();
            Consumer<cmw> $$5 = bwo.a($$1x -> $$1x.w($$2.p()), $$4, $$1, null);
            cmw $$6 = bwo.f.a($$4, $$5, $$3, bwn.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dol.a(czh.fh, new lj() {
         @Override
         public czd a(ld $$0, czd $$1) {
            iu $$2 = $$0.c().a($$0.d().c(dol.b));

            for (clg $$4 : $$0.b().a(clg.class, new fel($$2), $$0x -> $$0x.bK() && !$$0x.t())) {
               if ($$4.gI() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dol.a(czh.oE, new le(bwo.aG));
      dol.a(czh.oG, new le(bwo.bp));
      dol.a(czh.oI, new le(bwo.m));
      dol.a(czh.oK, new le(bwo.at));
      dol.a(czh.oQ, new le(bwo.F));
      dol.a(czh.oM, new le(bwo.a));
      dol.a(czh.oO, new le(bwo.w));
      dol.a(czh.oU, new le(bwo.aA));
      dol.a(czh.oS, new le(bwo.aL));
      dol.a(czh.oW, new le(bwo.j));
      dol.a(czh.oF, new le(bwo.aH));
      dol.a(czh.oH, new le(bwo.bq));
      dol.a(czh.oJ, new le(bwo.n));
      dol.a(czh.oL, new le(bwo.au));
      dol.a(czh.oR, new le(bwo.G));
      dol.a(czh.oN, new le(bwo.b));
      dol.a(czh.oP, new le(bwo.x));
      dol.a(czh.oV, new le(bwo.aB));
      dol.a(czh.oT, new le(bwo.aM));
      dol.a(czh.oX, new le(bwo.i));
      lg $$2 = new lf() {
         private final lf c = new lf();

         @Override
         public czd a(ld $$0, czd $$1) {
            cxz $$2 = (cxz)$$1.h();
            iu $$3 = $$0.c().a($$0.d().c(dol.b));
            dja $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new czd(czh.ro));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dol.a(czh.rq, $$2);
      dol.a(czh.rp, $$2);
      dol.a(czh.rr, $$2);
      dol.a(czh.rw, $$2);
      dol.a(czh.rx, $$2);
      dol.a(czh.rv, $$2);
      dol.a(czh.ry, $$2);
      dol.a(czh.rz, $$2);
      dol.a(czh.rA, $$2);
      dol.a(czh.ro, new lf() {
         @Override
         public czd a(ld $$0, czd $$1) {
            djb $$2 = $$0.b();
            iu $$3 = $$0.c().a($$0.d().c(dol.b));
            eah $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dmn $$6) {
               czd $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, efh.y, $$3);
                  cyz $$8 = $$7.h();
                  return this.a($$0, $$1, new czd($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dol.a(czh.pg, new lj() {
         @Override
         protected czd a(ld $$0, czd $$1) {
            arq $$2 = $$0.b();
            this.a(true);
            ja $$3 = $$0.d().c(dol.b);
            iu $$4 = $$0.c().a($$3);
            eah $$5 = $$2.a_($$4);
            if (dls.a($$2, $$4, $$3)) {
               $$2.b($$4, dls.a($$2, $$4));
               $$2.a(null, efh.i, $$4);
            } else if (dmv.i($$5) || dmw.h($$5) || dmx.h($$5)) {
               $$2.b($$4, $$5.b(eax.u, Boolean.valueOf(true)));
               $$2.a(null, efh.c, $$4);
            } else if ($$5.b() instanceof dvd) {
               dvd.a($$2, $$4);
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
      dol.a(czh.sG, new lj() {
         @Override
         protected czd a(ld $$0, czd $$1) {
            this.a(true);
            dja $$2 = $$0.b();
            iu $$3 = $$0.c().a($$0.d().c(dol.b));
            if (!cxn.a($$1, $$2, $$3) && !cxn.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dol.a(dmh.cu, new lf() {
         @Override
         protected czd a(ld $$0, czd $$1) {
            dja $$2 = $$0.b();
            iu $$3 = $$0.c().a($$0.d().c(dol.b));
            cni $$4 = new cni($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dA(), $$4.dC(), $$4.dG(), awn.AC, awo.e, 1.0F, 1.0F);
            $$2.a(null, efh.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dol.a(czh.vw, new lj() {
         @Override
         protected czd a(ld $$0, czd $$1) {
            dja $$2 = $$0.b();
            ja $$3 = $$0.d().c(dol.b);
            iu $$4 = $$0.c().a($$3);
            if ($$2.v($$4) && dwp.b($$2, $$4, $$1)) {
               $$2.a($$4, dmh.hh.m().b(dtr.e, Integer.valueOf(ebn.a($$3))), 3);
               $$2.a(null, efh.i, $$4);
               dxf $$5 = $$2.c_($$4);
               if ($$5 instanceof dyv) {
                  dwp.a($$2, $$4, (dyv)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lh.b($$0, $$1));
            }

            return $$1;
         }
      });
      dol.a(dmh.ev, new lj() {
         @Override
         protected czd a(ld $$0, czd $$1) {
            dja $$2 = $$0.b();
            iu $$3 = $$0.c().a($$0.d().c(dol.b));
            dnb $$4 = (dnb)dmh.ev;
            if ($$2.v($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, efh.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lh.b($$0, $$1));
            }

            return $$1;
         }
      });
      dol.a(dmh.lv.h(), new lm());

      for (cyb $$3 : cyb.values()) {
         dol.a(dto.a($$3).h(), new lm());
      }

      dol.a(czh.ts.h(), new lj() {
         private czd b(ld $$0, czd $$1, czd $$2) {
            $$0.b().a(null, efh.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public czd a(ld $$0, czd $$1) {
            this.a(false);
            arq $$2 = $$0.b();
            iu $$3 = $$0.c().a($$0.d().c(dol.b));
            eah $$4 = $$2.a_($$3);
            if ($$4.a(axc.aJ, $$0x -> $$0x.b(dlz.c) && $$0x.b() instanceof dlz) && $$4.c(dlz.c) >= 5) {
               ((dlz)$$4.b()).a($$2, $$4, $$3, null, dxc.b.b);
               this.a(true);
               return this.b($$0, $$1, new czd(czh.xO));
            } else if ($$2.b_($$3).a(axh.a)) {
               this.a(true);
               return this.b($$0, $$1, daz.a(czh.tt, dba.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dol.a(czh.fQ, new lj() {
         @Override
         public czd a(ld $$0, czd $$1) {
            ja $$2 = $$0.d().c(dol.b);
            iu $$3 = $$0.c().a($$2);
            dja $$4 = $$0.b();
            eah $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dmh.pT)) {
               if ($$5.c(dsu.d) != 4) {
                  dsu.a(null, $$4, $$3, $$5);
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
      dol.a(czh.td.h(), new ll());
      dol.a(czh.yG.h(), new lj() {
         @Override
         protected czd a(ld $$0, czd $$1) {
            arq $$2 = $$0.b();
            iu $$3 = $$0.c().a($$0.d().c(dol.b));
            List<ckk> $$4 = $$2.a(ckk.class, new fel($$3), bwm.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (ckk $$5 : $$4) {
                  if ($$5.gv()) {
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
      dol.a(czh.xL, new lj() {
         @Override
         public czd a(ld $$0, czd $$1) {
            iu $$2 = $$0.c().a($$0.d().c(dol.b));
            dja $$3 = $$0.b();
            eah $$4 = $$3.a_($$2);
            Optional<eah> $$5 = cyu.a($$4);
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
      dol.a(czh.tt, new lf() {
         private final lf c = new lf();

         @Override
         public czd a(ld $$0, czd $$1) {
            daz $$2 = $$1.a(kj.R, daz.a);
            if (!$$2.a(dba.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arq $$3 = $$0.b();
               iu $$4 = $$0.c();
               iu $$5 = $$0.c().a($$0.d().c(dol.b));
               if (!$$3.a_($$5).a(axc.cn)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lx.ap, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awn.cB, awo.e, 1.0F, 1.0F);
                  $$3.a(null, efh.z, $$4);
                  $$3.b($$5, dmh.ts.m());
                  return this.a($$0, $$1, new czd(czh.ts));
               }
            }
         }
      });
      dol.a(czh.ov, new li(bwo.aD));
      dol.a(czh.ow, new li(bwo.y));
      dol.a(czh.ox, new li(bwo.ac));
      dol.a(czh.oy, new li(bwo.bx));
      dol.a(czh.oz, new li(bwo.ak));
      dol.a(czh.vX, new li(bwo.B));
   }
}
