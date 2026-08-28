import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface li {
   Logger a = LogUtils.getLogger();
   li b = ($$0, $$1) -> $$1;

   daa dispense(lf var1, daa var2);

   static void a() {
      dpk.a(dae.pk);
      dpk.a(dae.wB);
      dpk.a(dae.wA);
      dpk.a(dae.rH);
      dpk.a(dae.rI);
      dpk.a(dae.rJ);
      dpk.a(dae.rs);
      dpk.a(dae.vf);
      dpk.a(dae.wz);
      dpk.a(dae.wC);
      dpk.a(dae.vE);
      dpk.a(dae.vg);
      dpk.a(dae.vh);
      lh $$0 = new lh() {
         @Override
         public daa a(lf $$0, daa $$1) {
            jc $$2 = $$0.d().c(dpk.b);
            bxe<?> $$3 = ((dbh)$$1.h()).a($$0.b().J_(), $$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bxd.o, $$2 != jc.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return daa.k;
            }

            $$1.h(1);
            $$0.b().a(null, egg.t, $$0.c());
            return $$1;
         }
      };

      for (dbh $$1 : dbh.a()) {
         dpk.a($$1, $$0);
      }

      dpk.a(dae.vQ, new lh() {
         @Override
         public daa a(lf $$0, daa $$1) {
            jc $$2 = $$0.d().c(dpk.b);
            iw $$3 = $$0.c().a($$2);
            aru $$4 = $$0.b();
            Consumer<cnt> $$5 = bxe.a($$1x -> $$1x.w($$2.p()), $$4, $$1, null);
            cnt $$6 = bxe.g.a($$4, $$5, $$3, bxd.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dpk.a(dae.fh, new ll() {
         @Override
         public daa a(lf $$0, daa $$1) {
            iw $$2 = $$0.c().a($$0.d().c(dpk.b));

            for (clu $$4 : $$0.b().a(clu.class, new ffn($$2), $$0x -> $$0x.bJ() && !$$0x.t())) {
               if ($$4.gL() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dpk.a(dae.oE, new lg(bxe.aH));
      dpk.a(dae.oG, new lg(bxe.bq));
      dpk.a(dae.oI, new lg(bxe.n));
      dpk.a(dae.oK, new lg(bxe.au));
      dpk.a(dae.oQ, new lg(bxe.G));
      dpk.a(dae.oM, new lg(bxe.b));
      dpk.a(dae.oO, new lg(bxe.x));
      dpk.a(dae.oU, new lg(bxe.aB));
      dpk.a(dae.oS, new lg(bxe.aM));
      dpk.a(dae.oW, new lg(bxe.k));
      dpk.a(dae.oF, new lg(bxe.aI));
      dpk.a(dae.oH, new lg(bxe.br));
      dpk.a(dae.oJ, new lg(bxe.o));
      dpk.a(dae.oL, new lg(bxe.av));
      dpk.a(dae.oR, new lg(bxe.H));
      dpk.a(dae.oN, new lg(bxe.c));
      dpk.a(dae.oP, new lg(bxe.y));
      dpk.a(dae.oV, new lg(bxe.aC));
      dpk.a(dae.oT, new lg(bxe.aN));
      dpk.a(dae.oX, new lg(bxe.j));
      li $$2 = new lh() {
         private final lh c = new lh();

         @Override
         public daa a(lf $$0, daa $$1) {
            cyw $$2 = (cyw)$$1.h();
            iw $$3 = $$0.c().a($$0.d().c(dpk.b));
            djz $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new daa(dae.ro));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dpk.a(dae.rq, $$2);
      dpk.a(dae.rp, $$2);
      dpk.a(dae.rr, $$2);
      dpk.a(dae.rw, $$2);
      dpk.a(dae.rx, $$2);
      dpk.a(dae.rv, $$2);
      dpk.a(dae.ry, $$2);
      dpk.a(dae.rz, $$2);
      dpk.a(dae.rA, $$2);
      dpk.a(dae.ro, new lh() {
         @Override
         public daa a(lf $$0, daa $$1) {
            dka $$2 = $$0.b();
            iw $$3 = $$0.c().a($$0.d().c(dpk.b));
            ebg $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dnm $$6) {
               daa $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, egg.y, $$3);
                  czw $$8 = $$7.h();
                  return this.a($$0, $$1, new daa($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dpk.a(dae.pg, new ll() {
         @Override
         protected daa a(lf $$0, daa $$1) {
            aru $$2 = $$0.b();
            this.a(true);
            jc $$3 = $$0.d().c(dpk.b);
            iw $$4 = $$0.c().a($$3);
            ebg $$5 = $$2.a_($$4);
            if (dmr.a($$2, $$4, $$3)) {
               $$2.b($$4, dmr.a($$2, $$4));
               $$2.a(null, egg.i, $$4);
            } else if (dnu.i($$5) || dnv.h($$5) || dnw.h($$5)) {
               $$2.b($$4, $$5.b(ebw.u, Boolean.valueOf(true)));
               $$2.a(null, egg.c, $$4);
            } else if ($$5.b() instanceof dwc) {
               if (dwc.a($$2, $$4)) {
                  $$2.a($$4, false);
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
      dpk.a(dae.sG, new ll() {
         @Override
         protected daa a(lf $$0, daa $$1) {
            this.a(true);
            djz $$2 = $$0.b();
            iw $$3 = $$0.c().a($$0.d().c(dpk.b));
            if (!cyk.a($$1, $$2, $$3) && !cyk.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dpk.a(dng.cu, new lh() {
         @Override
         protected daa a(lf $$0, daa $$1) {
            djz $$2 = $$0.b();
            iw $$3 = $$0.c().a($$0.d().c(dpk.b));
            cof $$4 = new cof($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dA(), $$4.dC(), $$4.dG(), awr.AC, aws.e, 1.0F, 1.0F);
            $$2.a(null, egg.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dpk.a(dae.vw, new ll() {
         @Override
         protected daa a(lf $$0, daa $$1) {
            djz $$2 = $$0.b();
            jc $$3 = $$0.d().c(dpk.b);
            iw $$4 = $$0.c().a($$3);
            if ($$2.v($$4) && dxo.b($$2, $$4, $$1)) {
               $$2.a($$4, dng.hh.m().b(duq.e, Integer.valueOf(ecm.a($$3))), 3);
               $$2.a(null, egg.i, $$4);
               dye $$5 = $$2.c_($$4);
               if ($$5 instanceof dzu) {
                  dxo.a($$2, $$4, (dzu)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lj.b($$0, $$1));
            }

            return $$1;
         }
      });
      dpk.a(dng.ev, new ll() {
         @Override
         protected daa a(lf $$0, daa $$1) {
            djz $$2 = $$0.b();
            iw $$3 = $$0.c().a($$0.d().c(dpk.b));
            doa $$4 = (doa)dng.ev;
            if ($$2.v($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, egg.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lj.b($$0, $$1));
            }

            return $$1;
         }
      });
      dpk.a(dng.lv.h(), new lo());

      for (cyy $$3 : cyy.values()) {
         dpk.a(dun.a($$3).h(), new lo());
      }

      dpk.a(dae.ts.h(), new ll() {
         private daa b(lf $$0, daa $$1, daa $$2) {
            $$0.b().a(null, egg.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public daa a(lf $$0, daa $$1) {
            this.a(false);
            aru $$2 = $$0.b();
            iw $$3 = $$0.c().a($$0.d().c(dpk.b));
            ebg $$4 = $$2.a_($$3);
            if ($$4.a(axg.aJ, $$0x -> $$0x.b(dmy.c) && $$0x.b() instanceof dmy) && $$4.c(dmy.c) >= 5) {
               ((dmy)$$4.b()).a($$2, $$4, $$3, null, dyb.b.b);
               this.a(true);
               return this.b($$0, $$1, new daa(dae.xO));
            } else if ($$2.b_($$3).a(axl.a)) {
               this.a(true);
               return this.b($$0, $$1, dbw.a(dae.tt, dbx.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dpk.a(dae.fQ, new ll() {
         @Override
         public daa a(lf $$0, daa $$1) {
            jc $$2 = $$0.d().c(dpk.b);
            iw $$3 = $$0.c().a($$2);
            djz $$4 = $$0.b();
            ebg $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dng.pT)) {
               if ($$5.c(dtt.d) != 4) {
                  dtt.a(null, $$4, $$3, $$5);
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
      dpk.a(dae.td.h(), new ln());
      dpk.a(dae.yG.h(), new ll() {
         @Override
         protected daa a(lf $$0, daa $$1) {
            aru $$2 = $$0.b();
            iw $$3 = $$0.c().a($$0.d().c(dpk.b));
            List<cky> $$4 = $$2.a(cky.class, new ffn($$3), bxc.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cky $$5 : $$4) {
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
      dpk.a(dae.xL, new ll() {
         @Override
         public daa a(lf $$0, daa $$1) {
            iw $$2 = $$0.c().a($$0.d().c(dpk.b));
            djz $$3 = $$0.b();
            ebg $$4 = $$3.a_($$2);
            Optional<ebg> $$5 = czr.a($$4);
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
      dpk.a(dae.tt, new lh() {
         private final lh c = new lh();

         @Override
         public daa a(lf $$0, daa $$1) {
            dbw $$2 = $$1.a(kl.R, dbw.a);
            if (!$$2.a(dbx.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               aru $$3 = $$0.b();
               iw $$4 = $$0.c();
               iw $$5 = $$0.c().a($$0.d().c(dpk.b));
               if (!$$3.a_($$5).a(axg.co)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lz.ap, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awr.cB, aws.e, 1.0F, 1.0F);
                  $$3.a(null, egg.z, $$4);
                  $$3.b($$5, dng.ts.m());
                  return this.a($$0, $$1, new daa(dae.ts));
               }
            }
         }
      });
      dpk.a(dae.ov, new lk(bxe.aE));
      dpk.a(dae.ow, new lk(bxe.z));
      dpk.a(dae.ox, new lk(bxe.ad));
      dpk.a(dae.oy, new lk(bxe.by));
      dpk.a(dae.oz, new lk(bxe.al));
      dpk.a(dae.vX, new lk(bxe.C));
   }
}
