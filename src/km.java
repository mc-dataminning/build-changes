import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface km {
   Logger a = LogUtils.getLogger();
   km b = ($$0, $$1) -> $$1;

   cuh dispense(kj var1, cuh var2);

   static void c() {
      dhi.a(cuk.pL, new ki() {
         @Override
         protected cms a(dca $$0, jk $$1, cuh $$2) {
            cmg $$3 = new cmg($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cme.a.b;
            return $$3;
         }
      });
      dhi.a(cuk.xb, new ki() {
         @Override
         protected cms a(dca $$0, jk $$1, cuh $$2) {
            cmg $$3 = new cmg($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cme.a.b;
            return $$3;
         }
      });
      dhi.a(cuk.xa, new ki() {
         @Override
         protected cms a(dca $$0, jk $$1, cuh $$2) {
            cme $$3 = new cmy($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cme.a.b;
            return $$3;
         }
      });
      dhi.a(cuk.so, new ki() {
         @Override
         protected cms a(dca $$0, jk $$1, cuh $$2) {
            return ad.a(new cnb($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      dhi.a(cuk.rZ, new ki() {
         @Override
         protected cms a(dca $$0, jk $$1, cuh $$2) {
            return ad.a(new cmx($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      dhi.a(cuk.vy, new ki() {
         @Override
         protected cms a(dca $$0, jk $$1, cuh $$2) {
            return ad.a(new cnd($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      dhi.a(cuk.wZ, new km() {
         @Override
         public cuh dispense(kj $$0, cuh $$1) {
            return (new ki() {
               @Override
               protected cms a(dca $$0, jk $$1, cuh $$2) {
                  return ad.a(new cne($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      dhi.a(cuk.xc, new km() {
         @Override
         public cuh dispense(kj $$0, cuh $$1) {
            return (new ki() {
               @Override
               protected cms a(dca $$0, jk $$1, cuh $$2) {
                  return ad.a(new cne($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      kl $$0 = new kl() {
         @Override
         public cuh a(kj $$0, cuh $$1) {
            iw $$2 = $$0.d().c(dhi.b);
            bsb<?> $$3 = ((cvw)$$1.f()).j($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bss.o, $$2 != iw.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cuh.i;
            }

            $$1.h(1);
            $$0.b().a(null, dxv.t, $$0.c());
            return $$1;
         }
      };

      for (cvw $$1 : cvw.d()) {
         dhi.a($$1, $$0);
      }

      dhi.a(cuk.wq, new kl() {
         @Override
         public cuh a(kj $$0, cuh $$1) {
            iw $$2 = $$0.d().c(dhi.b);
            ir $$3 = $$0.c().a($$2);
            aqt $$4 = $$0.b();
            Consumer<chw> $$5 = bsb.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            chw $$6 = bsb.d.a($$4, $$5, $$3, bss.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dhi.a(cuk.pb, new kn() {
         @Override
         public cuh a(kj $$0, cuh $$1) {
            ir $$2 = $$0.c().a($$0.d().c(dhi.b));
            List<bso> $$3 = $$0.b().a(bso.class, new ewp($$2), $$0x -> !($$0x instanceof btd $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((btd)$$3.get(0)).a(avq.e);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      kl $$2 = new kn() {
         @Override
         protected cuh a(kj $$0, cuh $$1) {
            ir $$2 = $$0.c().a($$0.d().c(dhi.b));

            for (cgi $$4 : $$0.b().a(cgi.class, new ewp($$2), $$0x -> $$0x.bI() && $$0x.ga())) {
               if ($$4.l($$1) && !$$4.gb() && $$4.gN()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dhi.a(cuk.wu, $$2);
      dhi.a(cuk.wr, $$2);
      dhi.a(cuk.ws, $$2);
      dhi.a(cuk.wt, $$2);
      dhi.a(cuk.iS, $$2);
      dhi.a(cuk.iT, $$2);
      dhi.a(cuk.jb, $$2);
      dhi.a(cuk.jd, $$2);
      dhi.a(cuk.je, $$2);
      dhi.a(cuk.jh, $$2);
      dhi.a(cuk.iZ, $$2);
      dhi.a(cuk.jf, $$2);
      dhi.a(cuk.iV, $$2);
      dhi.a(cuk.ja, $$2);
      dhi.a(cuk.iX, $$2);
      dhi.a(cuk.iU, $$2);
      dhi.a(cuk.iY, $$2);
      dhi.a(cuk.jc, $$2);
      dhi.a(cuk.jg, $$2);
      dhi.a(cuk.iW, $$2);
      dhi.a(cuk.fY, new kn() {
         @Override
         public cuh a(kj $$0, cuh $$1) {
            ir $$2 = $$0.c().a($$0.d().c(dhi.b));

            for (cgh $$4 : $$0.b().a(cgh.class, new ewp($$2), $$0x -> $$0x.bI() && !$$0x.t())) {
               if ($$4.gN() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dhi.a(cuk.wf, new kl() {
         @Override
         public cuh a(kj $$0, cuh $$1) {
            iw $$2 = $$0.d().c(dhi.b);
            ewu $$3 = km.a($$0, bsb.R, $$2);
            cmm $$4 = new cmm($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
            $$4.c((double)$$2.j(), (double)$$2.k(), (double)$$2.l(), 0.5F, 1.0F);
            $$0.b().b($$4);
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(kj $$0) {
            $$0.b().c(1004, $$0.c(), 0);
         }
      });
      dhi.a(cuk.vz, new kl() {
         @Override
         public cuh a(kj $$0, cuh $$1) {
            iw $$2 = $$0.d().c(dhi.b);
            jk $$3 = dhi.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            dca $$7 = $$0.b();
            ayt $$8 = $$7.A;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            cmw $$12 = new cmw($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ad.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(kj $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      dhi.a(
         cuk.vA,
         new kl() {
            @Override
            public cuh a(kj $$0, cuh $$1) {
               iw $$2 = $$0.d().c(dhi.b);
               jk $$3 = dhi.a($$0);
               dca $$4 = $$0.b();
               ayt $$5 = $$4.A;
               double $$6 = $$5.a((double)$$2.j(), 0.11485000000000001);
               double $$7 = $$5.a((double)$$2.k(), 0.11485000000000001);
               double $$8 = $$5.a((double)$$2.l(), 0.11485000000000001);
               cnl $$9 = new cnl(
                  $$4,
                  $$3.a() + (double)((float)$$2.j() * 0.3F),
                  $$3.b() + (double)((float)$$2.k() * 0.3F),
                  $$3.c() + (double)((float)$$2.l() * 0.3F),
                  $$6,
                  $$7,
                  $$8
               );
               $$4.b($$9);
               $$1.h(1);
               return $$1;
            }
         }
      );
      dhi.a(cuk.pk, new kk(cny.b.a));
      dhi.a(cuk.pm, new kk(cny.b.b));
      dhi.a(cuk.po, new kk(cny.b.c));
      dhi.a(cuk.pq, new kk(cny.b.d));
      dhi.a(cuk.pw, new kk(cny.b.g));
      dhi.a(cuk.ps, new kk(cny.b.e));
      dhi.a(cuk.pu, new kk(cny.b.f));
      dhi.a(cuk.py, new kk(cny.b.h));
      dhi.a(cuk.pA, new kk(cny.b.i));
      dhi.a(cuk.pl, new kk(cny.b.a, true));
      dhi.a(cuk.pn, new kk(cny.b.b, true));
      dhi.a(cuk.pp, new kk(cny.b.c, true));
      dhi.a(cuk.pr, new kk(cny.b.d, true));
      dhi.a(cuk.px, new kk(cny.b.g, true));
      dhi.a(cuk.pt, new kk(cny.b.e, true));
      dhi.a(cuk.pv, new kk(cny.b.f, true));
      dhi.a(cuk.pz, new kk(cny.b.h, true));
      dhi.a(cuk.pB, new kk(cny.b.i, true));
      km $$3 = new kl() {
         private final kl c = new kl();

         @Override
         public cuh a(kj $$0, cuh $$1) {
            csw $$2 = (csw)$$1.f();
            ir $$3 = $$0.c().a($$0.d().c(dhi.b));
            dca $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cuh(cuk.rV);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dhi.a(cuk.rX, $$3);
      dhi.a(cuk.rW, $$3);
      dhi.a(cuk.rY, $$3);
      dhi.a(cuk.sd, $$3);
      dhi.a(cuk.se, $$3);
      dhi.a(cuk.sc, $$3);
      dhi.a(cuk.sf, $$3);
      dhi.a(cuk.sg, $$3);
      dhi.a(cuk.sh, $$3);
      dhi.a(cuk.rV, new kl() {
         private final kl c = new kl();

         @Override
         public cuh a(kj $$0, cuh $$1) {
            dcb $$2 = $$0.b();
            ir $$3 = $$0.c().a($$0.d().c(dhi.b));
            dtc $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dfj $$6) {
               cuh $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.d()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dxv.y, $$3);
                  cuc $$8 = $$7.f();
                  $$1.h(1);
                  if ($$1.d()) {
                     return new cuh($$8);
                  } else {
                     if ($$0.e().b(new cuh($$8)) < 0) {
                        this.c.dispense($$0, new cuh($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dhi.a(cuk.pI, new kn() {
         @Override
         protected cuh a(kj $$0, cuh $$1) {
            dca $$2 = $$0.b();
            this.a(true);
            iw $$3 = $$0.d().c(dhi.b);
            ir $$4 = $$0.c().a($$3);
            dtc $$5 = $$2.a_($$4);
            if (deo.a($$2, $$4, $$3)) {
               $$2.b($$4, deo.a($$2, $$4));
               $$2.a(null, dxv.i, $$4);
            } else if (dfq.h($$5) || dfr.g($$5) || dfs.g($$5)) {
               $$2.b($$4, $$5.a(dts.r, Boolean.valueOf(true)));
               $$2.a(null, dxv.c, $$4);
            } else if ($$5.b() instanceof doa) {
               doa.a($$2, $$4);
               $$2.a($$4, false);
            } else {
               this.a(false);
            }

            if (this.a()) {
               $$1.a(1, $$2.F_(), null, () -> $$1.e(0));
            }

            return $$1;
         }
      });
      dhi.a(cuk.sV, new kn() {
         @Override
         protected cuh a(kj $$0, cuh $$1) {
            this.a(true);
            dca $$2 = $$0.b();
            ir $$3 = $$0.c().a($$0.d().c(dhi.b));
            if (!cse.a($$1, $$2, $$3) && !cse.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dhi.a(dfe.cV, new kl() {
         @Override
         protected cuh a(kj $$0, cuh $$1) {
            dca $$2 = $$0.b();
            ir $$3 = $$0.c().a($$0.d().c(dhi.b));
            cih $$4 = new cih($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dz(), $$4.dB(), $$4.dF(), avo.zT, avq.e, 1.0F, 1.0F);
            $$2.a(null, dxv.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      km $$4 = new kn() {
         @Override
         protected cuh a(kj $$0, cuh $$1) {
            this.a(crt.a($$0, $$1));
            return $$1;
         }
      };
      dhi.a(cuk.wa, $$4);
      dhi.a(cuk.vZ, $$4);
      dhi.a(cuk.wb, $$4);
      dhi.a(cuk.vW, $$4);
      dhi.a(cuk.wc, $$4);
      dhi.a(cuk.vY, $$4);
      dhi.a(cuk.vX, new kn() {
         @Override
         protected cuh a(kj $$0, cuh $$1) {
            dca $$2 = $$0.b();
            iw $$3 = $$0.d().c(dhi.b);
            ir $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dpm.b($$2, $$4, $$1)) {
               $$2.a($$4, dfe.hA.n().a(dms.e, Integer.valueOf(dui.a($$3))), 3);
               $$2.a(null, dxv.i, $$4);
               dqc $$5 = $$2.c_($$4);
               if ($$5 instanceof drt) {
                  dpm.a($$2, $$4, (drt)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(crt.a($$0, $$1));
            }

            return $$1;
         }
      });
      dhi.a(dfe.eU, new kn() {
         @Override
         protected cuh a(kj $$0, cuh $$1) {
            dca $$2 = $$0.b();
            ir $$3 = $$0.c().a($$0.d().c(dhi.b));
            dfw $$4 = (dfw)dfe.eU;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.n(), 3);
                  $$2.a(null, dxv.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(crt.a($$0, $$1));
            }

            return $$1;
         }
      });
      dhi.a(dfe.eV, new kn() {
         @Override
         protected cuh a(kj $$0, cuh $$1) {
            dca $$2 = $$0.b();
            ir $$3 = $$0.c().a($$0.d().c(dhi.b));
            dli $$4 = (dli)dfe.eV;
            this.a(crt.a($$0, $$1));
            return $$1;
         }
      });
      dhi.a(dfe.lN.q(), new kp());

      for (csy $$5 : csy.values()) {
         dhi.a(dmp.a($$5).q(), new kp());
      }

      dhi.a(cuk.tI.q(), new kn() {
         private final kl c = new kl();

         private cuh a(kj $$0, cuh $$1, cuh $$2) {
            $$1.h(1);
            if ($$1.d()) {
               $$0.b().a(null, dxv.y, $$0.c());
               return $$2.r();
            } else {
               if ($$0.e().b($$2.r()) < 0) {
                  this.c.dispense($$0, $$2.r());
               }

               return $$1;
            }
         }

         @Override
         public cuh a(kj $$0, cuh $$1) {
            this.a(false);
            aqt $$2 = $$0.b();
            ir $$3 = $$0.c().a($$0.d().c(dhi.b));
            dtc $$4 = $$2.a_($$3);
            if ($$4.a(awe.aH, $$0x -> $$0x.b(dev.c) && $$0x.b() instanceof dev) && $$4.c(dev.c) >= 5) {
               ((dev)$$4.b()).a($$2, $$4, $$3, null, dpy.b.b);
               this.a(true);
               return this.a($$0, $$1, new cuh(cuk.ym));
            } else if ($$2.b_($$3).a(awj.a)) {
               this.a(true);
               return this.a($$0, $$1, cwr.a(cuk.tH, cws.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dhi.a(cuk.gH, new kn() {
         @Override
         public cuh a(kj $$0, cuh $$1) {
            iw $$2 = $$0.d().c(dhi.b);
            ir $$3 = $$0.c().a($$2);
            dca $$4 = $$0.b();
            dtc $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dfe.qw)) {
               if ($$5.c(dly.d) != 4) {
                  dly.a(null, $$4, $$3, $$5);
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
      dhi.a(cuk.ts.q(), new ko());
      dhi.a(cuk.ze.q(), new kn() {
         @Override
         protected cuh a(kj $$0, cuh $$1) {
            aqt $$2 = $$0.b();
            ir $$3 = $$0.c().a($$0.d().c(dhi.b));
            List<cfn> $$4 = $$2.a(cfn.class, new ewp($$3), bsa.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cfn $$5 : $$4) {
                  if ($$5.gI()) {
                     $$1.a(16, $$2.F_(), null, () -> {
                        $$1.h(1);
                        $$1.b(0);
                     });
                     return $$1;
                  }
               }

               this.a(false);
               return $$1;
            }
         }
      });
      dhi.a(cuk.yj, new kn() {
         @Override
         public cuh a(kj $$0, cuh $$1) {
            ir $$2 = $$0.c().a($$0.d().c(dhi.b));
            dca $$3 = $$0.b();
            dtc $$4 = $$3.a_($$2);
            Optional<dtc> $$5 = ctw.a($$4);
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
      dhi.a(cuk.tH, new kl() {
         private final kl c = new kl();

         @Override
         public cuh a(kj $$0, cuh $$1) {
            cwr $$2 = $$1.a(ke.E, cwr.a);
            if (!$$2.a(cws.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               aqt $$3 = $$0.b();
               ir $$4 = $$0.c();
               ir $$5 = $$0.c().a($$0.d().c(dhi.b));
               if (!$$3.a_($$5).a(awe.cl)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lb.ak, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, avo.cG, avq.e, 1.0F, 1.0F);
                  $$3.a(null, dxv.z, $$4);
                  $$3.b($$5, dfe.uf.n());
                  return new cuh(cuk.tI);
               }
            }
         }
      });
   }

   static ewu a(kj $$0, bsb<?> $$1, iw $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
