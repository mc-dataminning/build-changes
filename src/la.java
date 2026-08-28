import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface la {
   Logger a = LogUtils.getLogger();
   la b = ($$0, $$1) -> $$1;

   cvx dispense(kx var1, cvx var2);

   static void a() {
      dkd.a(cwb.ox);
      dkd.a(cwb.vs);
      dkd.a(cwb.vr);
      dkd.a(cwb.qS);
      dkd.a(cwb.qD);
      dkd.a(cwb.tX);
      dkd.a(cwb.vq);
      dkd.a(cwb.vt);
      dkd.a(cwb.uw);
      dkd.a(cwb.tY);
      dkd.a(cwb.tZ);
      kz $$0 = new kz() {
         @Override
         public cvx a(kx $$0, cvx $$1) {
            jl $$2 = $$0.d().c(dkd.b);
            bug<?> $$3 = ((cxg)$$1.h()).g($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), buf.o, $$2 != jl.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cvx.k;
            }

            $$1.h(1);
            $$0.b().a(null, eaa.t, $$0.c());
            return $$1;
         }
      };

      for (cxg $$1 : cxg.c()) {
         dkd.a($$1, $$0);
      }

      dkd.a(cwb.uH, new kz() {
         @Override
         public cvx a(kx $$0, cvx $$1) {
            jl $$2 = $$0.d().c(dkd.b);
            jg $$3 = $$0.c().a($$2);
            arm $$4 = $$0.b();
            Consumer<ckf> $$5 = bug.a($$1x -> $$1x.v($$2.p()), $$4, $$1, null);
            ckf $$6 = bug.d.a($$4, $$5, $$3, buf.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dkd.a(cwb.nL, new lc() {
         @Override
         public cvx a(kx $$0, cvx $$1) {
            jg $$2 = $$0.c().a($$0.d().c(dkd.b));
            List<buv> $$3 = $$0.b().a(buv.class, new ezc($$2), $$0x -> !($$0x instanceof bvl $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bvl)$$3.get(0)).a($$1.a(1), awl.e);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dkd.a(cwb.eN, new lc() {
         @Override
         public cvx a(kx $$0, cvx $$1) {
            jg $$2 = $$0.c().a($$0.d().c(dkd.b));

            for (cip $$4 : $$0.b().a(cip.class, new ezc($$2), $$0x -> $$0x.bM() && !$$0x.t())) {
               if ($$4.gM() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dkd.a(cwb.nV, new ky(cqh.b.a));
      dkd.a(cwb.nX, new ky(cqh.b.b));
      dkd.a(cwb.nZ, new ky(cqh.b.c));
      dkd.a(cwb.ob, new ky(cqh.b.d));
      dkd.a(cwb.oh, new ky(cqh.b.g));
      dkd.a(cwb.od, new ky(cqh.b.e));
      dkd.a(cwb.of, new ky(cqh.b.f));
      dkd.a(cwb.oj, new ky(cqh.b.h));
      dkd.a(cwb.ol, new ky(cqh.b.i));
      dkd.a(cwb.nW, new ky(cqh.b.a, true));
      dkd.a(cwb.nY, new ky(cqh.b.b, true));
      dkd.a(cwb.oa, new ky(cqh.b.c, true));
      dkd.a(cwb.oc, new ky(cqh.b.d, true));
      dkd.a(cwb.oi, new ky(cqh.b.g, true));
      dkd.a(cwb.oe, new ky(cqh.b.e, true));
      dkd.a(cwb.og, new ky(cqh.b.f, true));
      dkd.a(cwb.ok, new ky(cqh.b.h, true));
      dkd.a(cwb.om, new ky(cqh.b.i, true));
      la $$2 = new kz() {
         private final kz c = new kz();

         @Override
         public cvx a(kx $$0, cvx $$1) {
            cus $$2 = (cus)$$1.h();
            jg $$3 = $$0.c().a($$0.d().c(dkd.b));
            dev $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cvx(cwb.qz));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dkd.a(cwb.qB, $$2);
      dkd.a(cwb.qA, $$2);
      dkd.a(cwb.qC, $$2);
      dkd.a(cwb.qH, $$2);
      dkd.a(cwb.qI, $$2);
      dkd.a(cwb.qG, $$2);
      dkd.a(cwb.qJ, $$2);
      dkd.a(cwb.qK, $$2);
      dkd.a(cwb.qL, $$2);
      dkd.a(cwb.qz, new kz() {
         @Override
         public cvx a(kx $$0, cvx $$1) {
            dew $$2 = $$0.b();
            jg $$3 = $$0.c().a($$0.d().c(dkd.b));
            dvd $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dif $$6) {
               cvx $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, eaa.y, $$3);
                  cvt $$8 = $$7.h();
                  return this.a($$0, $$1, new cvx($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dkd.a(cwb.ot, new lc() {
         @Override
         protected cvx a(kx $$0, cvx $$1) {
            arm $$2 = $$0.b();
            this.a(true);
            jl $$3 = $$0.d().c(dkd.b);
            jg $$4 = $$0.c().a($$3);
            dvd $$5 = $$2.a_($$4);
            if (dhl.a($$2, $$4, $$3)) {
               $$2.b($$4, dhl.a($$2, $$4));
               $$2.a(null, eaa.i, $$4);
            } else if (dim.i($$5) || din.h($$5) || dio.h($$5)) {
               $$2.b($$4, $$5.b(dvt.r, Boolean.valueOf(true)));
               $$2.a(null, eaa.c, $$4);
            } else if ($$5.b() instanceof dqh) {
               dqh.a($$2, $$4);
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
      dkd.a(cwb.rz, new lc() {
         @Override
         protected cvx a(kx $$0, cvx $$1) {
            this.a(true);
            dev $$2 = $$0.b();
            jg $$3 = $$0.c().a($$0.d().c(dkd.b));
            if (!cue.a($$1, $$2, $$3) && !cue.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dkd.a(dia.ck, new kz() {
         @Override
         protected cvx a(kx $$0, cvx $$1) {
            dev $$2 = $$0.b();
            jg $$3 = $$0.c().a($$0.d().c(dkd.b));
            ckr $$4 = new ckr($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dC(), $$4.dE(), $$4.dI(), awk.zC, awl.e, 1.0F, 1.0F);
            $$2.a(null, eaa.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dkd.a(cwb.uo, new lc() {
         @Override
         protected cvx a(kx $$0, cvx $$1) {
            dev $$2 = $$0.b();
            jl $$3 = $$0.d().c(dkd.b);
            jg $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && drr.b($$2, $$4, $$1)) {
               $$2.a($$4, dia.gG.m().b(dpa.e, Integer.valueOf(dwj.a($$3))), 3);
               $$2.a(null, eaa.i, $$4);
               dsg $$5 = $$2.c_($$4);
               if ($$5 instanceof dtu) {
                  drr.a($$2, $$4, (dtu)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lb.b($$0, $$1));
            }

            return $$1;
         }
      });
      dkd.a(dia.ee, new lc() {
         @Override
         protected cvx a(kx $$0, cvx $$1) {
            dev $$2 = $$0.b();
            jg $$3 = $$0.c().a($$0.d().c(dkd.b));
            dis $$4 = (dis)dia.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, eaa.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lb.b($$0, $$1));
            }

            return $$1;
         }
      });
      dkd.a(dia.kP.j(), new lf());

      for (cuu $$3 : cuu.values()) {
         dkd.a(dox.a($$3).j(), new lf());
      }

      dkd.a(cwb.sl.j(), new lc() {
         private cvx b(kx $$0, cvx $$1, cvx $$2) {
            $$0.b().a(null, eaa.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cvx a(kx $$0, cvx $$1) {
            this.a(false);
            arm $$2 = $$0.b();
            jg $$3 = $$0.c().a($$0.d().c(dkd.b));
            dvd $$4 = $$2.a_($$3);
            if ($$4.a(awz.aH, $$0x -> $$0x.b(dhs.c) && $$0x.b() instanceof dhs) && $$4.c(dhs.c) >= 5) {
               ((dhs)$$4.b()).a($$2, $$4, $$3, null, dsd.b.b);
               this.a(true);
               return this.b($$0, $$1, new cvx(cwb.wF));
            } else if ($$2.b_($$3).a(axf.a)) {
               this.a(true);
               return this.b($$0, $$1, cxw.a(cwb.sm, cxx.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dkd.a(cwb.fu, new lc() {
         @Override
         public cvx a(kx $$0, cvx $$1) {
            jl $$2 = $$0.d().c(dkd.b);
            jg $$3 = $$0.c().a($$2);
            dev $$4 = $$0.b();
            dvd $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dia.pl)) {
               if ($$5.c(dog.d) != 4) {
                  dog.a(null, $$4, $$3, $$5);
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
      dkd.a(cwb.rW.j(), new le());
      dkd.a(cwb.xx.j(), new lc() {
         @Override
         protected cvx a(kx $$0, cvx $$1) {
            arm $$2 = $$0.b();
            jg $$3 = $$0.c().a($$0.d().c(dkd.b));
            List<chv> $$4 = $$2.a(chv.class, new ezc($$3), bue.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (chv $$5 : $$4) {
                  if ($$5.gz()) {
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
      dkd.a(cwb.wC, new lc() {
         @Override
         public cvx a(kx $$0, cvx $$1) {
            jg $$2 = $$0.c().a($$0.d().c(dkd.b));
            dev $$3 = $$0.b();
            dvd $$4 = $$3.a_($$2);
            Optional<dvd> $$5 = cvo.a($$4);
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
      dkd.a(cwb.sm, new kz() {
         private final kz c = new kz();

         @Override
         public cvx a(kx $$0, cvx $$1) {
            cxw $$2 = $$1.a(kt.P, cxw.a);
            if (!$$2.a(cxx.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arm $$3 = $$0.b();
               jg $$4 = $$0.c();
               jg $$5 = $$0.c().a($$0.d().c(dkd.b));
               if (!$$3.a_($$5).a(awz.ck)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lq.am, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awk.cB, awl.e, 1.0F, 1.0F);
                  $$3.a(null, eaa.z, $$4);
                  $$3.b($$5, dia.sI.m());
                  return this.a($$0, $$1, new cvx(cwb.sl));
               }
            }
         }
      });
   }
}
