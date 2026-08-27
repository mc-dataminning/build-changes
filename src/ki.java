import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface ki {
   Logger a = LogUtils.getLogger();
   ki b = ($$0, $$1) -> $$1;

   ctq dispense(kf var1, ctq var2);

   static void a() {
      dgf.a(ctt.ov);
      dgf.a(ctt.vq);
      dgf.a(ctt.vp);
      dgf.a(ctt.qR);
      dgf.a(ctt.qC);
      dgf.a(ctt.tW);
      dgf.a(ctt.vo);
      dgf.a(ctt.vr);
      dgf.a(ctt.uu);
      dgf.a(ctt.tX);
      dgf.a(ctt.tY);
      kh $$0 = new kh() {
         @Override
         public ctq a(kf $$0, ctq $$1) {
            it $$2 = $$0.d().c(dgf.b);
            bsc<?> $$3 = ((cux)$$1.g()).j($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bsu.o, $$2 != it.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return ctq.i;
            }

            $$1.h(1);
            $$0.b().a(null, dvw.t, $$0.c());
            return $$1;
         }
      };

      for (cux $$1 : cux.h()) {
         dgf.a($$1, $$0);
      }

      dgf.a(ctt.uF, new kh() {
         @Override
         public ctq a(kf $$0, ctq $$1) {
            it $$2 = $$0.d().c(dgf.b);
            io $$3 = $$0.c().a($$2);
            aqn $$4 = $$0.b();
            Consumer<chy> $$5 = bsc.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            chy $$6 = bsc.d.a($$4, $$5, $$3, bsu.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dgf.a(ctt.nL, new kj() {
         @Override
         public ctq a(kf $$0, ctq $$1) {
            io $$2 = $$0.c().a($$0.d().c(dgf.b));
            List<bsq> $$3 = $$0.b().a(bsq.class, new euh($$2), $$0x -> !($$0x instanceof btg $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((btg)$$3.get(0)).a(avj.e);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      kh $$2 = new kj() {
         @Override
         protected ctq a(kf $$0, ctq $$1) {
            io $$2 = $$0.c().a($$0.d().c(dgf.b));

            for (cgk $$4 : $$0.b().a(cgk.class, new euh($$2), $$0x -> $$0x.bD() && $$0x.fR())) {
               if ($$4.l($$1) && !$$4.fS() && $$4.gE()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dgf.a(ctt.uJ, $$2);
      dgf.a(ctt.uG, $$2);
      dgf.a(ctt.uH, $$2);
      dgf.a(ctt.uI, $$2);
      dgf.a(ctt.hE, $$2);
      dgf.a(ctt.hF, $$2);
      dgf.a(ctt.hN, $$2);
      dgf.a(ctt.hP, $$2);
      dgf.a(ctt.hQ, $$2);
      dgf.a(ctt.hT, $$2);
      dgf.a(ctt.hL, $$2);
      dgf.a(ctt.hR, $$2);
      dgf.a(ctt.hH, $$2);
      dgf.a(ctt.hM, $$2);
      dgf.a(ctt.hJ, $$2);
      dgf.a(ctt.hG, $$2);
      dgf.a(ctt.hK, $$2);
      dgf.a(ctt.hO, $$2);
      dgf.a(ctt.hS, $$2);
      dgf.a(ctt.hI, $$2);
      dgf.a(ctt.eN, new kj() {
         @Override
         public ctq a(kf $$0, ctq $$1) {
            io $$2 = $$0.c().a($$0.d().c(dgf.b));

            for (cgj $$4 : $$0.b().a(cgj.class, new euh($$2), $$0x -> $$0x.bD() && !$$0x.u())) {
               if ($$4.gE() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dgf.a(ctt.nU, new kg(cnv.b.a));
      dgf.a(ctt.nW, new kg(cnv.b.b));
      dgf.a(ctt.nY, new kg(cnv.b.c));
      dgf.a(ctt.oa, new kg(cnv.b.d));
      dgf.a(ctt.og, new kg(cnv.b.g));
      dgf.a(ctt.oc, new kg(cnv.b.e));
      dgf.a(ctt.oe, new kg(cnv.b.f));
      dgf.a(ctt.oi, new kg(cnv.b.h));
      dgf.a(ctt.ok, new kg(cnv.b.i));
      dgf.a(ctt.nV, new kg(cnv.b.a, true));
      dgf.a(ctt.nX, new kg(cnv.b.b, true));
      dgf.a(ctt.nZ, new kg(cnv.b.c, true));
      dgf.a(ctt.ob, new kg(cnv.b.d, true));
      dgf.a(ctt.oh, new kg(cnv.b.g, true));
      dgf.a(ctt.od, new kg(cnv.b.e, true));
      dgf.a(ctt.of, new kg(cnv.b.f, true));
      dgf.a(ctt.oj, new kg(cnv.b.h, true));
      dgf.a(ctt.ol, new kg(cnv.b.i, true));
      ki $$3 = new kh() {
         private final kh c = new kh();

         @Override
         public ctq a(kf $$0, ctq $$1) {
            csh $$2 = (csh)$$1.g();
            io $$3 = $$0.c().a($$0.d().c(dgf.b));
            daz $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new ctq(ctt.qy);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dgf.a(ctt.qA, $$3);
      dgf.a(ctt.qz, $$3);
      dgf.a(ctt.qB, $$3);
      dgf.a(ctt.qG, $$3);
      dgf.a(ctt.qH, $$3);
      dgf.a(ctt.qF, $$3);
      dgf.a(ctt.qI, $$3);
      dgf.a(ctt.qJ, $$3);
      dgf.a(ctt.qK, $$3);
      dgf.a(ctt.qy, new kh() {
         private final kh c = new kh();

         @Override
         public ctq a(kf $$0, ctq $$1) {
            dba $$2 = $$0.b();
            io $$3 = $$0.c().a($$0.d().c(dgf.b));
            drd $$4 = $$2.a_($$3);
            if ($$4.b() instanceof deh $$6) {
               ctq $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.e()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dvw.y, $$3);
                  ctl $$8 = $$7.g();
                  $$1.h(1);
                  if ($$1.e()) {
                     return new ctq($$8);
                  } else {
                     if ($$0.e().b(new ctq($$8)) < 0) {
                        this.c.dispense($$0, new ctq($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dgf.a(ctt.os, new kj() {
         @Override
         protected ctq a(kf $$0, ctq $$1) {
            daz $$2 = $$0.b();
            this.a(true);
            it $$3 = $$0.d().c(dgf.b);
            io $$4 = $$0.c().a($$3);
            drd $$5 = $$2.a_($$4);
            if (ddn.a($$2, $$4, $$3)) {
               $$2.b($$4, ddn.a($$2, $$4));
               $$2.a(null, dvw.i, $$4);
            } else if (deo.h($$5) || dep.g($$5) || deq.g($$5)) {
               $$2.b($$4, $$5.a(drt.r, Boolean.valueOf(true)));
               $$2.a(null, dvw.c, $$4);
            } else if ($$5.b() instanceof dmj) {
               dmj.a($$2, $$4);
               $$2.a($$4, false);
            } else {
               this.a(false);
            }

            if (this.b()) {
               $$1.a(1, $$2.E_(), null, () -> $$1.e(0));
            }

            return $$1;
         }
      });
      dgf.a(ctt.ry, new kj() {
         @Override
         protected ctq a(kf $$0, ctq $$1) {
            this.a(true);
            daz $$2 = $$0.b();
            io $$3 = $$0.c().a($$0.d().c(dgf.b));
            if (!crq.a($$1, $$2, $$3) && !crq.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dgf.a(dec.ck, new kh() {
         @Override
         protected ctq a(kf $$0, ctq $$1) {
            daz $$2 = $$0.b();
            io $$3 = $$0.c().a($$0.d().c(dgf.b));
            cij $$4 = new cij($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.du(), $$4.dw(), $$4.dA(), avi.zv, avj.e, 1.0F, 1.0F);
            $$2.a(null, dvw.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      ki $$4 = new kj() {
         @Override
         protected ctq a(kf $$0, ctq $$1) {
            this.a(crf.a($$0, $$1));
            return $$1;
         }
      };
      dgf.a(ctt.up, $$4);
      dgf.a(ctt.uo, $$4);
      dgf.a(ctt.uq, $$4);
      dgf.a(ctt.ul, $$4);
      dgf.a(ctt.ur, $$4);
      dgf.a(ctt.un, $$4);
      dgf.a(ctt.um, new kj() {
         @Override
         protected ctq a(kf $$0, ctq $$1) {
            daz $$2 = $$0.b();
            it $$3 = $$0.d().c(dgf.b);
            io $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dnt.b($$2, $$4, $$1)) {
               $$2.a($$4, dec.gG.n().a(dlc.e, Integer.valueOf(dsj.a($$3))), 3);
               $$2.a(null, dvw.i, $$4);
               doi $$5 = $$2.c_($$4);
               if ($$5 instanceof dpu) {
                  dnt.a($$2, $$4, (dpu)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(crf.a($$0, $$1));
            }

            return $$1;
         }
      });
      dgf.a(dec.ee, new kj() {
         @Override
         protected ctq a(kf $$0, ctq $$1) {
            daz $$2 = $$0.b();
            io $$3 = $$0.c().a($$0.d().c(dgf.b));
            deu $$4 = (deu)dec.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.n(), 3);
                  $$2.a(null, dvw.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(crf.a($$0, $$1));
            }

            return $$1;
         }
      });
      dgf.a(dec.kP.r(), new km());

      for (csj $$5 : csj.values()) {
         dgf.a(dkz.a($$5).r(), new km());
      }

      dgf.a(ctt.sl.r(), new kj() {
         private final kh c = new kh();

         private ctq a(kf $$0, ctq $$1, ctq $$2) {
            $$1.h(1);
            if ($$1.e()) {
               $$0.b().a(null, dvw.y, $$0.c());
               return $$2.s();
            } else {
               if ($$0.e().b($$2.s()) < 0) {
                  this.c.dispense($$0, $$2.s());
               }

               return $$1;
            }
         }

         @Override
         public ctq a(kf $$0, ctq $$1) {
            this.a(false);
            aqn $$2 = $$0.b();
            io $$3 = $$0.c().a($$0.d().c(dgf.b));
            drd $$4 = $$2.a_($$3);
            if ($$4.a(avx.aG, $$0x -> $$0x.b(ddu.c) && $$0x.b() instanceof ddu) && $$4.c(ddu.c) >= 5) {
               ((ddu)$$4.b()).a($$2, $$4, $$3, null, dof.b.b);
               this.a(true);
               return this.a($$0, $$1, new ctq(ctt.wz));
            } else if ($$2.b_($$3).a(awc.a)) {
               this.a(true);
               return this.a($$0, $$1, cvr.a(ctt.sk, cvs.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dgf.a(ctt.fu, new kj() {
         @Override
         public ctq a(kf $$0, ctq $$1) {
            it $$2 = $$0.d().c(dgf.b);
            io $$3 = $$0.c().a($$2);
            daz $$4 = $$0.b();
            drd $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dec.pl)) {
               if ($$5.c(dki.d) != 4) {
                  dki.a(null, $$4, $$3, $$5);
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
      dgf.a(ctt.rV.r(), new kl());
      dgf.a(ctt.xr.r(), new kj() {
         @Override
         protected ctq a(kf $$0, ctq $$1) {
            aqn $$2 = $$0.b();
            io $$3 = $$0.c().a($$0.d().c(dgf.b));
            List<cfp> $$4 = $$2.a(cfp.class, new euh($$3), bsb.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cfp $$5 : $$4) {
                  if ($$5.gz()) {
                     $$1.a(16, $$2.E_(), null, () -> {
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
      dgf.a(ctt.ww, new kj() {
         @Override
         public ctq a(kf $$0, ctq $$1) {
            io $$2 = $$0.c().a($$0.d().c(dgf.b));
            daz $$3 = $$0.b();
            drd $$4 = $$3.a_($$2);
            Optional<drd> $$5 = ctg.a($$4);
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
      dgf.a(ctt.sk, new kh() {
         private final kh c = new kh();

         @Override
         public ctq a(kf $$0, ctq $$1) {
            cvr $$2 = $$1.a(kb.F, cvr.a);
            if (!$$2.a(cvs.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               aqn $$3 = $$0.b();
               io $$4 = $$0.c();
               io $$5 = $$0.c().a($$0.d().c(dgf.b));
               if (!$$3.a_($$5).a(avx.ci)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(ky.am, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, avi.cB, avj.e, 1.0F, 1.0F);
                  $$3.a(null, dvw.z, $$4);
                  $$3.b($$5, dec.sI.n());
                  return new ctq(ctt.sl);
               }
            }
         }
      });
   }
}
