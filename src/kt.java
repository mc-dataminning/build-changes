import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface kt {
   Logger a = LogUtils.getLogger();
   kt b = ($$0, $$1) -> $$1;

   cup dispense(kq var1, cup var2);

   static void a() {
      dhe.a(cus.ov);
      dhe.a(cus.vq);
      dhe.a(cus.vp);
      dhe.a(cus.qR);
      dhe.a(cus.qC);
      dhe.a(cus.tW);
      dhe.a(cus.vo);
      dhe.a(cus.vr);
      dhe.a(cus.uu);
      dhe.a(cus.tX);
      dhe.a(cus.tY);
      ks $$0 = new ks() {
         @Override
         public cup a(kq $$0, cup $$1) {
            je $$2 = $$0.d().c(dhe.b);
            bta<?> $$3 = ((cvw)$$1.g()).j($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), btt.o, $$2 != je.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cup.l;
            }

            $$1.h(1);
            $$0.b().a(null, dwv.t, $$0.c());
            return $$1;
         }
      };

      for (cvw $$1 : cvw.h()) {
         dhe.a($$1, $$0);
      }

      dhe.a(cus.uF, new ks() {
         @Override
         public cup a(kq $$0, cup $$1) {
            je $$2 = $$0.d().c(dhe.b);
            iz $$3 = $$0.c().a($$2);
            arf $$4 = $$0.b();
            Consumer<cix> $$5 = bta.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            cix $$6 = bta.d.a($$4, $$5, $$3, btt.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dhe.a(cus.nL, new ku() {
         @Override
         public cup a(kq $$0, cup $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhe.b));
            List<btp> $$3 = $$0.b().a(btp.class, new evm($$2), $$0x -> !($$0x instanceof buf $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((buf)$$3.get(0)).a(awb.e);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      ks $$2 = new ku() {
         @Override
         protected cup a(kq $$0, cup $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhe.b));

            for (chj $$4 : $$0.b().a(chj.class, new evm($$2), $$0x -> $$0x.bD() && $$0x.fS())) {
               if ($$4.l($$1) && !$$4.fT() && $$4.gF()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dhe.a(cus.uJ, $$2);
      dhe.a(cus.uG, $$2);
      dhe.a(cus.uH, $$2);
      dhe.a(cus.uI, $$2);
      dhe.a(cus.hE, $$2);
      dhe.a(cus.hF, $$2);
      dhe.a(cus.hN, $$2);
      dhe.a(cus.hP, $$2);
      dhe.a(cus.hQ, $$2);
      dhe.a(cus.hT, $$2);
      dhe.a(cus.hL, $$2);
      dhe.a(cus.hR, $$2);
      dhe.a(cus.hH, $$2);
      dhe.a(cus.hM, $$2);
      dhe.a(cus.hJ, $$2);
      dhe.a(cus.hG, $$2);
      dhe.a(cus.hK, $$2);
      dhe.a(cus.hO, $$2);
      dhe.a(cus.hS, $$2);
      dhe.a(cus.hI, $$2);
      dhe.a(cus.eN, new ku() {
         @Override
         public cup a(kq $$0, cup $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhe.b));

            for (chi $$4 : $$0.b().a(chi.class, new evm($$2), $$0x -> $$0x.bD() && !$$0x.u())) {
               if ($$4.gF() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dhe.a(cus.nU, new kr(cov.b.a));
      dhe.a(cus.nW, new kr(cov.b.b));
      dhe.a(cus.nY, new kr(cov.b.c));
      dhe.a(cus.oa, new kr(cov.b.d));
      dhe.a(cus.og, new kr(cov.b.g));
      dhe.a(cus.oc, new kr(cov.b.e));
      dhe.a(cus.oe, new kr(cov.b.f));
      dhe.a(cus.oi, new kr(cov.b.h));
      dhe.a(cus.ok, new kr(cov.b.i));
      dhe.a(cus.nV, new kr(cov.b.a, true));
      dhe.a(cus.nX, new kr(cov.b.b, true));
      dhe.a(cus.nZ, new kr(cov.b.c, true));
      dhe.a(cus.ob, new kr(cov.b.d, true));
      dhe.a(cus.oh, new kr(cov.b.g, true));
      dhe.a(cus.od, new kr(cov.b.e, true));
      dhe.a(cus.of, new kr(cov.b.f, true));
      dhe.a(cus.oj, new kr(cov.b.h, true));
      dhe.a(cus.ol, new kr(cov.b.i, true));
      kt $$3 = new ks() {
         private final ks c = new ks();

         @Override
         public cup a(kq $$0, cup $$1) {
            ctg $$2 = (ctg)$$1.g();
            iz $$3 = $$0.c().a($$0.d().c(dhe.b));
            dby $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cup(cus.qy);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dhe.a(cus.qA, $$3);
      dhe.a(cus.qz, $$3);
      dhe.a(cus.qB, $$3);
      dhe.a(cus.qG, $$3);
      dhe.a(cus.qH, $$3);
      dhe.a(cus.qF, $$3);
      dhe.a(cus.qI, $$3);
      dhe.a(cus.qJ, $$3);
      dhe.a(cus.qK, $$3);
      dhe.a(cus.qy, new ks() {
         private final ks c = new ks();

         @Override
         public cup a(kq $$0, cup $$1) {
            dbz $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhe.b));
            dsc $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dfg $$6) {
               cup $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.e()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dwv.y, $$3);
                  cuk $$8 = $$7.g();
                  $$1.h(1);
                  if ($$1.e()) {
                     return new cup($$8);
                  } else {
                     if ($$0.e().b(new cup($$8)) < 0) {
                        this.c.dispense($$0, new cup($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dhe.a(cus.os, new ku() {
         @Override
         protected cup a(kq $$0, cup $$1) {
            dby $$2 = $$0.b();
            this.a(true);
            je $$3 = $$0.d().c(dhe.b);
            iz $$4 = $$0.c().a($$3);
            dsc $$5 = $$2.a_($$4);
            if (dem.a($$2, $$4, $$3)) {
               $$2.b($$4, dem.a($$2, $$4));
               $$2.a(null, dwv.i, $$4);
            } else if (dfn.h($$5) || dfo.g($$5) || dfp.g($$5)) {
               $$2.b($$4, $$5.a(dss.r, Boolean.valueOf(true)));
               $$2.a(null, dwv.c, $$4);
            } else if ($$5.b() instanceof dni) {
               dni.a($$2, $$4);
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
      dhe.a(cus.ry, new ku() {
         @Override
         protected cup a(kq $$0, cup $$1) {
            this.a(true);
            dby $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhe.b));
            if (!csp.a($$1, $$2, $$3) && !csp.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dhe.a(dfb.ck, new ks() {
         @Override
         protected cup a(kq $$0, cup $$1) {
            dby $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhe.b));
            cji $$4 = new cji($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.du(), $$4.dw(), $$4.dA(), awa.zv, awb.e, 1.0F, 1.0F);
            $$2.a(null, dwv.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      kt $$4 = new ku() {
         @Override
         protected cup a(kq $$0, cup $$1) {
            this.a(cse.a($$0, $$1));
            return $$1;
         }
      };
      dhe.a(cus.up, $$4);
      dhe.a(cus.uo, $$4);
      dhe.a(cus.uq, $$4);
      dhe.a(cus.ul, $$4);
      dhe.a(cus.ur, $$4);
      dhe.a(cus.un, $$4);
      dhe.a(cus.um, new ku() {
         @Override
         protected cup a(kq $$0, cup $$1) {
            dby $$2 = $$0.b();
            je $$3 = $$0.d().c(dhe.b);
            iz $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dos.b($$2, $$4, $$1)) {
               $$2.a($$4, dfb.gG.o().a(dmb.e, Integer.valueOf(dti.a($$3))), 3);
               $$2.a(null, dwv.i, $$4);
               dph $$5 = $$2.c_($$4);
               if ($$5 instanceof dqt) {
                  dos.a($$2, $$4, (dqt)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cse.a($$0, $$1));
            }

            return $$1;
         }
      });
      dhe.a(dfb.ee, new ku() {
         @Override
         protected cup a(kq $$0, cup $$1) {
            dby $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhe.b));
            dft $$4 = (dft)dfb.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dwv.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cse.a($$0, $$1));
            }

            return $$1;
         }
      });
      dhe.a(dfb.kP.r(), new kx());

      for (cti $$5 : cti.values()) {
         dhe.a(dly.a($$5).r(), new kx());
      }

      dhe.a(cus.sl.r(), new ku() {
         private final ks c = new ks();

         private cup a(kq $$0, cup $$1, cup $$2) {
            $$1.h(1);
            if ($$1.e()) {
               $$0.b().a(null, dwv.y, $$0.c());
               return $$2.s();
            } else {
               if ($$0.e().b($$2.s()) < 0) {
                  this.c.dispense($$0, $$2.s());
               }

               return $$1;
            }
         }

         @Override
         public cup a(kq $$0, cup $$1) {
            this.a(false);
            arf $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhe.b));
            dsc $$4 = $$2.a_($$3);
            if ($$4.a(awp.aG, $$0x -> $$0x.b(det.c) && $$0x.b() instanceof det) && $$4.c(det.c) >= 5) {
               ((det)$$4.b()).a($$2, $$4, $$3, null, dpe.b.b);
               this.a(true);
               return this.a($$0, $$1, new cup(cus.wz));
            } else if ($$2.b_($$3).a(awv.a)) {
               this.a(true);
               return this.a($$0, $$1, cwq.a(cus.sk, cwr.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dhe.a(cus.fu, new ku() {
         @Override
         public cup a(kq $$0, cup $$1) {
            je $$2 = $$0.d().c(dhe.b);
            iz $$3 = $$0.c().a($$2);
            dby $$4 = $$0.b();
            dsc $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dfb.pl)) {
               if ($$5.c(dlh.d) != 4) {
                  dlh.a(null, $$4, $$3, $$5);
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
      dhe.a(cus.rV.r(), new kw());
      dhe.a(cus.xr.r(), new ku() {
         @Override
         protected cup a(kq $$0, cup $$1) {
            arf $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhe.b));
            List<cgo> $$4 = $$2.a(cgo.class, new evm($$3), bsz.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cgo $$5 : $$4) {
                  if ($$5.gA()) {
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
      dhe.a(cus.ww, new ku() {
         @Override
         public cup a(kq $$0, cup $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhe.b));
            dby $$3 = $$0.b();
            dsc $$4 = $$3.a_($$2);
            Optional<dsc> $$5 = cuf.a($$4);
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
      dhe.a(cus.sk, new ks() {
         private final ks c = new ks();

         @Override
         public cup a(kq $$0, cup $$1) {
            cwq $$2 = $$1.a(km.G, cwq.a);
            if (!$$2.a(cwr.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arf $$3 = $$0.b();
               iz $$4 = $$0.c();
               iz $$5 = $$0.c().a($$0.d().c(dhe.b));
               if (!$$3.a_($$5).a(awp.ci)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(li.am, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awa.cB, awb.e, 1.0F, 1.0F);
                  $$3.a(null, dwv.z, $$4);
                  $$3.b($$5, dfb.sI.o());
                  return new cup(cus.sl);
               }
            }
         }
      });
   }
}
