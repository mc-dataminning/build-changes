import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lh {
   Logger a = LogUtils.getLogger();
   lh b = ($$0, $$1) -> $$1;

   czy dispense(le var1, czy var2);

   static void a() {
      dpi.a(dac.pk);
      dpi.a(dac.wB);
      dpi.a(dac.wA);
      dpi.a(dac.rH);
      dpi.a(dac.rI);
      dpi.a(dac.rJ);
      dpi.a(dac.rs);
      dpi.a(dac.vf);
      dpi.a(dac.wz);
      dpi.a(dac.wC);
      dpi.a(dac.vE);
      dpi.a(dac.vg);
      dpi.a(dac.vh);
      lg $$0 = new lg() {
         @Override
         public czy a(le $$0, czy $$1) {
            jb $$2 = $$0.d().c(dpi.b);
            bxc<?> $$3 = ((dbf)$$1.h()).a($$0.b().J_(), $$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bxb.o, $$2 != jb.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return czy.k;
            }

            $$1.h(1);
            $$0.b().a(null, ege.t, $$0.c());
            return $$1;
         }
      };

      for (dbf $$1 : dbf.a()) {
         dpi.a($$1, $$0);
      }

      dpi.a(dac.vQ, new lg() {
         @Override
         public czy a(le $$0, czy $$1) {
            jb $$2 = $$0.d().c(dpi.b);
            iv $$3 = $$0.c().a($$2);
            ars $$4 = $$0.b();
            Consumer<cnr> $$5 = bxc.a($$1x -> $$1x.w($$2.p()), $$4, $$1, null);
            cnr $$6 = bxc.g.a($$4, $$5, $$3, bxb.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dpi.a(dac.fh, new lk() {
         @Override
         public czy a(le $$0, czy $$1) {
            iv $$2 = $$0.c().a($$0.d().c(dpi.b));

            for (cls $$4 : $$0.b().a(cls.class, new ffl($$2), $$0x -> $$0x.bJ() && !$$0x.t())) {
               if ($$4.gL() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dpi.a(dac.oE, new lf(bxc.aH));
      dpi.a(dac.oG, new lf(bxc.bq));
      dpi.a(dac.oI, new lf(bxc.n));
      dpi.a(dac.oK, new lf(bxc.au));
      dpi.a(dac.oQ, new lf(bxc.G));
      dpi.a(dac.oM, new lf(bxc.b));
      dpi.a(dac.oO, new lf(bxc.x));
      dpi.a(dac.oU, new lf(bxc.aB));
      dpi.a(dac.oS, new lf(bxc.aM));
      dpi.a(dac.oW, new lf(bxc.k));
      dpi.a(dac.oF, new lf(bxc.aI));
      dpi.a(dac.oH, new lf(bxc.br));
      dpi.a(dac.oJ, new lf(bxc.o));
      dpi.a(dac.oL, new lf(bxc.av));
      dpi.a(dac.oR, new lf(bxc.H));
      dpi.a(dac.oN, new lf(bxc.c));
      dpi.a(dac.oP, new lf(bxc.y));
      dpi.a(dac.oV, new lf(bxc.aC));
      dpi.a(dac.oT, new lf(bxc.aN));
      dpi.a(dac.oX, new lf(bxc.j));
      lh $$2 = new lg() {
         private final lg c = new lg();

         @Override
         public czy a(le $$0, czy $$1) {
            cyu $$2 = (cyu)$$1.h();
            iv $$3 = $$0.c().a($$0.d().c(dpi.b));
            djx $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new czy(dac.ro));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dpi.a(dac.rq, $$2);
      dpi.a(dac.rp, $$2);
      dpi.a(dac.rr, $$2);
      dpi.a(dac.rw, $$2);
      dpi.a(dac.rx, $$2);
      dpi.a(dac.rv, $$2);
      dpi.a(dac.ry, $$2);
      dpi.a(dac.rz, $$2);
      dpi.a(dac.rA, $$2);
      dpi.a(dac.ro, new lg() {
         @Override
         public czy a(le $$0, czy $$1) {
            djy $$2 = $$0.b();
            iv $$3 = $$0.c().a($$0.d().c(dpi.b));
            ebe $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dnk $$6) {
               czy $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, ege.y, $$3);
                  czu $$8 = $$7.h();
                  return this.a($$0, $$1, new czy($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dpi.a(dac.pg, new lk() {
         @Override
         protected czy a(le $$0, czy $$1) {
            ars $$2 = $$0.b();
            this.a(true);
            jb $$3 = $$0.d().c(dpi.b);
            iv $$4 = $$0.c().a($$3);
            ebe $$5 = $$2.a_($$4);
            if (dmp.a($$2, $$4, $$3)) {
               $$2.b($$4, dmp.a($$2, $$4));
               $$2.a(null, ege.i, $$4);
            } else if (dns.i($$5) || dnt.h($$5) || dnu.h($$5)) {
               $$2.b($$4, $$5.b(ebu.u, Boolean.valueOf(true)));
               $$2.a(null, ege.c, $$4);
            } else if ($$5.b() instanceof dwa) {
               dwa.a($$2, $$4);
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
      dpi.a(dac.sG, new lk() {
         @Override
         protected czy a(le $$0, czy $$1) {
            this.a(true);
            djx $$2 = $$0.b();
            iv $$3 = $$0.c().a($$0.d().c(dpi.b));
            if (!cyi.a($$1, $$2, $$3) && !cyi.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dpi.a(dne.cu, new lg() {
         @Override
         protected czy a(le $$0, czy $$1) {
            djx $$2 = $$0.b();
            iv $$3 = $$0.c().a($$0.d().c(dpi.b));
            cod $$4 = new cod($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dA(), $$4.dC(), $$4.dG(), awp.AC, awq.e, 1.0F, 1.0F);
            $$2.a(null, ege.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dpi.a(dac.vw, new lk() {
         @Override
         protected czy a(le $$0, czy $$1) {
            djx $$2 = $$0.b();
            jb $$3 = $$0.d().c(dpi.b);
            iv $$4 = $$0.c().a($$3);
            if ($$2.v($$4) && dxm.b($$2, $$4, $$1)) {
               $$2.a($$4, dne.hh.m().b(duo.e, Integer.valueOf(eck.a($$3))), 3);
               $$2.a(null, ege.i, $$4);
               dyc $$5 = $$2.c_($$4);
               if ($$5 instanceof dzs) {
                  dxm.a($$2, $$4, (dzs)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(li.b($$0, $$1));
            }

            return $$1;
         }
      });
      dpi.a(dne.ev, new lk() {
         @Override
         protected czy a(le $$0, czy $$1) {
            djx $$2 = $$0.b();
            iv $$3 = $$0.c().a($$0.d().c(dpi.b));
            dny $$4 = (dny)dne.ev;
            if ($$2.v($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, ege.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(li.b($$0, $$1));
            }

            return $$1;
         }
      });
      dpi.a(dne.lv.h(), new ln());

      for (cyw $$3 : cyw.values()) {
         dpi.a(dul.a($$3).h(), new ln());
      }

      dpi.a(dac.ts.h(), new lk() {
         private czy b(le $$0, czy $$1, czy $$2) {
            $$0.b().a(null, ege.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public czy a(le $$0, czy $$1) {
            this.a(false);
            ars $$2 = $$0.b();
            iv $$3 = $$0.c().a($$0.d().c(dpi.b));
            ebe $$4 = $$2.a_($$3);
            if ($$4.a(axe.aJ, $$0x -> $$0x.b(dmw.c) && $$0x.b() instanceof dmw) && $$4.c(dmw.c) >= 5) {
               ((dmw)$$4.b()).a($$2, $$4, $$3, null, dxz.b.b);
               this.a(true);
               return this.b($$0, $$1, new czy(dac.xO));
            } else if ($$2.b_($$3).a(axj.a)) {
               this.a(true);
               return this.b($$0, $$1, dbu.a(dac.tt, dbv.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dpi.a(dac.fQ, new lk() {
         @Override
         public czy a(le $$0, czy $$1) {
            jb $$2 = $$0.d().c(dpi.b);
            iv $$3 = $$0.c().a($$2);
            djx $$4 = $$0.b();
            ebe $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dne.pT)) {
               if ($$5.c(dtr.d) != 4) {
                  dtr.a(null, $$4, $$3, $$5);
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
      dpi.a(dac.td.h(), new lm());
      dpi.a(dac.yG.h(), new lk() {
         @Override
         protected czy a(le $$0, czy $$1) {
            ars $$2 = $$0.b();
            iv $$3 = $$0.c().a($$0.d().c(dpi.b));
            List<ckw> $$4 = $$2.a(ckw.class, new ffl($$3), bxa.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (ckw $$5 : $$4) {
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
      dpi.a(dac.xL, new lk() {
         @Override
         public czy a(le $$0, czy $$1) {
            iv $$2 = $$0.c().a($$0.d().c(dpi.b));
            djx $$3 = $$0.b();
            ebe $$4 = $$3.a_($$2);
            Optional<ebe> $$5 = czp.a($$4);
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
      dpi.a(dac.tt, new lg() {
         private final lg c = new lg();

         @Override
         public czy a(le $$0, czy $$1) {
            dbu $$2 = $$1.a(kk.R, dbu.a);
            if (!$$2.a(dbv.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               ars $$3 = $$0.b();
               iv $$4 = $$0.c();
               iv $$5 = $$0.c().a($$0.d().c(dpi.b));
               if (!$$3.a_($$5).a(axe.co)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(ly.ap, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awp.cB, awq.e, 1.0F, 1.0F);
                  $$3.a(null, ege.z, $$4);
                  $$3.b($$5, dne.ts.m());
                  return this.a($$0, $$1, new czy(dac.ts));
               }
            }
         }
      });
      dpi.a(dac.ov, new lj(bxc.aE));
      dpi.a(dac.ow, new lj(bxc.z));
      dpi.a(dac.ox, new lj(bxc.ad));
      dpi.a(dac.oy, new lj(bxc.by));
      dpi.a(dac.oz, new lj(bxc.al));
      dpi.a(dac.vX, new lj(bxc.C));
   }
}
