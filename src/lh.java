import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lh {
   Logger a = LogUtils.getLogger();
   lh b = ($$0, $$1) -> $$1;

   czn dispense(le var1, czn var2);

   static void a() {
      dox.a(czr.pk);
      dox.a(czr.wB);
      dox.a(czr.wA);
      dox.a(czr.rH);
      dox.a(czr.rI);
      dox.a(czr.rJ);
      dox.a(czr.rs);
      dox.a(czr.vf);
      dox.a(czr.wz);
      dox.a(czr.wC);
      dox.a(czr.vE);
      dox.a(czr.vg);
      dox.a(czr.vh);
      lg $$0 = new lg() {
         @Override
         public czn a(le $$0, czn $$1) {
            jb $$2 = $$0.d().c(dox.b);
            bwr<?> $$3 = ((dau)$$1.h()).a($$0.b().F_(), $$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bwq.o, $$2 != jb.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return czn.k;
            }

            $$1.h(1);
            $$0.b().a(null, eft.t, $$0.c());
            return $$1;
         }
      };

      for (dau $$1 : dau.a()) {
         dox.a($$1, $$0);
      }

      dox.a(czr.vQ, new lg() {
         @Override
         public czn a(le $$0, czn $$1) {
            jb $$2 = $$0.d().c(dox.b);
            iv $$3 = $$0.c().a($$2);
            arq $$4 = $$0.b();
            Consumer<cng> $$5 = bwr.a($$1x -> $$1x.w($$2.p()), $$4, $$1, null);
            cng $$6 = bwr.f.a($$4, $$5, $$3, bwq.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dox.a(czr.fh, new lk() {
         @Override
         public czn a(le $$0, czn $$1) {
            iv $$2 = $$0.c().a($$0.d().c(dox.b));

            for (clh $$4 : $$0.b().a(clh.class, new fex($$2), $$0x -> $$0x.bI() && !$$0x.t())) {
               if ($$4.gK() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dox.a(czr.oE, new lf(bwr.aG));
      dox.a(czr.oG, new lf(bwr.bp));
      dox.a(czr.oI, new lf(bwr.m));
      dox.a(czr.oK, new lf(bwr.at));
      dox.a(czr.oQ, new lf(bwr.F));
      dox.a(czr.oM, new lf(bwr.a));
      dox.a(czr.oO, new lf(bwr.w));
      dox.a(czr.oU, new lf(bwr.aA));
      dox.a(czr.oS, new lf(bwr.aL));
      dox.a(czr.oW, new lf(bwr.j));
      dox.a(czr.oF, new lf(bwr.aH));
      dox.a(czr.oH, new lf(bwr.bq));
      dox.a(czr.oJ, new lf(bwr.n));
      dox.a(czr.oL, new lf(bwr.au));
      dox.a(czr.oR, new lf(bwr.G));
      dox.a(czr.oN, new lf(bwr.b));
      dox.a(czr.oP, new lf(bwr.x));
      dox.a(czr.oV, new lf(bwr.aB));
      dox.a(czr.oT, new lf(bwr.aM));
      dox.a(czr.oX, new lf(bwr.i));
      lh $$2 = new lg() {
         private final lg c = new lg();

         @Override
         public czn a(le $$0, czn $$1) {
            cyj $$2 = (cyj)$$1.h();
            iv $$3 = $$0.c().a($$0.d().c(dox.b));
            djm $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new czn(czr.ro));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dox.a(czr.rq, $$2);
      dox.a(czr.rp, $$2);
      dox.a(czr.rr, $$2);
      dox.a(czr.rw, $$2);
      dox.a(czr.rx, $$2);
      dox.a(czr.rv, $$2);
      dox.a(czr.ry, $$2);
      dox.a(czr.rz, $$2);
      dox.a(czr.rA, $$2);
      dox.a(czr.ro, new lg() {
         @Override
         public czn a(le $$0, czn $$1) {
            djn $$2 = $$0.b();
            iv $$3 = $$0.c().a($$0.d().c(dox.b));
            eat $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dmz $$6) {
               czn $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, eft.y, $$3);
                  czj $$8 = $$7.h();
                  return this.a($$0, $$1, new czn($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dox.a(czr.pg, new lk() {
         @Override
         protected czn a(le $$0, czn $$1) {
            arq $$2 = $$0.b();
            this.a(true);
            jb $$3 = $$0.d().c(dox.b);
            iv $$4 = $$0.c().a($$3);
            eat $$5 = $$2.a_($$4);
            if (dme.a($$2, $$4, $$3)) {
               $$2.b($$4, dme.a($$2, $$4));
               $$2.a(null, eft.i, $$4);
            } else if (dnh.i($$5) || dni.h($$5) || dnj.h($$5)) {
               $$2.b($$4, $$5.b(ebj.u, Boolean.valueOf(true)));
               $$2.a(null, eft.c, $$4);
            } else if ($$5.b() instanceof dvp) {
               dvp.a($$2, $$4);
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
      dox.a(czr.sG, new lk() {
         @Override
         protected czn a(le $$0, czn $$1) {
            this.a(true);
            djm $$2 = $$0.b();
            iv $$3 = $$0.c().a($$0.d().c(dox.b));
            if (!cxx.a($$1, $$2, $$3) && !cxx.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dox.a(dmt.cu, new lg() {
         @Override
         protected czn a(le $$0, czn $$1) {
            djm $$2 = $$0.b();
            iv $$3 = $$0.c().a($$0.d().c(dox.b));
            cns $$4 = new cns($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dz(), $$4.dB(), $$4.dF(), awn.AC, awo.e, 1.0F, 1.0F);
            $$2.a(null, eft.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dox.a(czr.vw, new lk() {
         @Override
         protected czn a(le $$0, czn $$1) {
            djm $$2 = $$0.b();
            jb $$3 = $$0.d().c(dox.b);
            iv $$4 = $$0.c().a($$3);
            if ($$2.v($$4) && dxb.b($$2, $$4, $$1)) {
               $$2.a($$4, dmt.hh.m().b(dud.e, Integer.valueOf(ebz.a($$3))), 3);
               $$2.a(null, eft.i, $$4);
               dxr $$5 = $$2.c_($$4);
               if ($$5 instanceof dzh) {
                  dxb.a($$2, $$4, (dzh)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(li.b($$0, $$1));
            }

            return $$1;
         }
      });
      dox.a(dmt.ev, new lk() {
         @Override
         protected czn a(le $$0, czn $$1) {
            djm $$2 = $$0.b();
            iv $$3 = $$0.c().a($$0.d().c(dox.b));
            dnn $$4 = (dnn)dmt.ev;
            if ($$2.v($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, eft.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(li.b($$0, $$1));
            }

            return $$1;
         }
      });
      dox.a(dmt.lv.h(), new ln());

      for (cyl $$3 : cyl.values()) {
         dox.a(dua.a($$3).h(), new ln());
      }

      dox.a(czr.ts.h(), new lk() {
         private czn b(le $$0, czn $$1, czn $$2) {
            $$0.b().a(null, eft.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public czn a(le $$0, czn $$1) {
            this.a(false);
            arq $$2 = $$0.b();
            iv $$3 = $$0.c().a($$0.d().c(dox.b));
            eat $$4 = $$2.a_($$3);
            if ($$4.a(axc.aJ, $$0x -> $$0x.b(dml.c) && $$0x.b() instanceof dml) && $$4.c(dml.c) >= 5) {
               ((dml)$$4.b()).a($$2, $$4, $$3, null, dxo.b.b);
               this.a(true);
               return this.b($$0, $$1, new czn(czr.xO));
            } else if ($$2.b_($$3).a(axh.a)) {
               this.a(true);
               return this.b($$0, $$1, dbj.a(czr.tt, dbk.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dox.a(czr.fQ, new lk() {
         @Override
         public czn a(le $$0, czn $$1) {
            jb $$2 = $$0.d().c(dox.b);
            iv $$3 = $$0.c().a($$2);
            djm $$4 = $$0.b();
            eat $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dmt.pT)) {
               if ($$5.c(dtg.d) != 4) {
                  dtg.a(null, $$4, $$3, $$5);
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
      dox.a(czr.td.h(), new lm());
      dox.a(czr.yG.h(), new lk() {
         @Override
         protected czn a(le $$0, czn $$1) {
            arq $$2 = $$0.b();
            iv $$3 = $$0.c().a($$0.d().c(dox.b));
            List<ckl> $$4 = $$2.a(ckl.class, new fex($$3), bwp.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (ckl $$5 : $$4) {
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
      dox.a(czr.xL, new lk() {
         @Override
         public czn a(le $$0, czn $$1) {
            iv $$2 = $$0.c().a($$0.d().c(dox.b));
            djm $$3 = $$0.b();
            eat $$4 = $$3.a_($$2);
            Optional<eat> $$5 = cze.a($$4);
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
      dox.a(czr.tt, new lg() {
         private final lg c = new lg();

         @Override
         public czn a(le $$0, czn $$1) {
            dbj $$2 = $$1.a(kk.R, dbj.a);
            if (!$$2.a(dbk.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arq $$3 = $$0.b();
               iv $$4 = $$0.c();
               iv $$5 = $$0.c().a($$0.d().c(dox.b));
               if (!$$3.a_($$5).a(axc.co)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(ly.ap, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awn.cB, awo.e, 1.0F, 1.0F);
                  $$3.a(null, eft.z, $$4);
                  $$3.b($$5, dmt.ts.m());
                  return this.a($$0, $$1, new czn(czr.ts));
               }
            }
         }
      });
      dox.a(czr.ov, new lj(bwr.aD));
      dox.a(czr.ow, new lj(bwr.y));
      dox.a(czr.ox, new lj(bwr.ac));
      dox.a(czr.oy, new lj(bwr.bx));
      dox.a(czr.oz, new lj(bwr.ak));
      dox.a(czr.vX, new lj(bwr.B));
   }
}
