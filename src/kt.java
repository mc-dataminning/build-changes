import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface kt {
   Logger a = LogUtils.getLogger();
   kt b = ($$0, $$1) -> $$1;

   cur dispense(kq var1, cur var2);

   static void a() {
      dhg.a(cuu.ov);
      dhg.a(cuu.vq);
      dhg.a(cuu.vp);
      dhg.a(cuu.qR);
      dhg.a(cuu.qC);
      dhg.a(cuu.tW);
      dhg.a(cuu.vo);
      dhg.a(cuu.vr);
      dhg.a(cuu.uu);
      dhg.a(cuu.tX);
      dhg.a(cuu.tY);
      ks $$0 = new ks() {
         @Override
         public cur a(kq $$0, cur $$1) {
            je $$2 = $$0.d().c(dhg.b);
            btc<?> $$3 = ((cvy)$$1.g()).j($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), btv.o, $$2 != je.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cur.l;
            }

            $$1.h(1);
            $$0.b().a(null, dwx.t, $$0.c());
            return $$1;
         }
      };

      for (cvy $$1 : cvy.h()) {
         dhg.a($$1, $$0);
      }

      dhg.a(cuu.uF, new ks() {
         @Override
         public cur a(kq $$0, cur $$1) {
            je $$2 = $$0.d().c(dhg.b);
            iz $$3 = $$0.c().a($$2);
            arf $$4 = $$0.b();
            Consumer<ciz> $$5 = btc.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            ciz $$6 = btc.d.a($$4, $$5, $$3, btv.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dhg.a(cuu.nL, new ku() {
         @Override
         public cur a(kq $$0, cur $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhg.b));
            List<btr> $$3 = $$0.b().a(btr.class, new evo($$2), $$0x -> !($$0x instanceof buh $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((buh)$$3.get(0)).a(awb.e);
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
         protected cur a(kq $$0, cur $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhg.b));

            for (chl $$4 : $$0.b().a(chl.class, new evo($$2), $$0x -> $$0x.bD() && $$0x.fS())) {
               if ($$4.l($$1) && !$$4.fT() && $$4.gF()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dhg.a(cuu.uJ, $$2);
      dhg.a(cuu.uG, $$2);
      dhg.a(cuu.uH, $$2);
      dhg.a(cuu.uI, $$2);
      dhg.a(cuu.hE, $$2);
      dhg.a(cuu.hF, $$2);
      dhg.a(cuu.hN, $$2);
      dhg.a(cuu.hP, $$2);
      dhg.a(cuu.hQ, $$2);
      dhg.a(cuu.hT, $$2);
      dhg.a(cuu.hL, $$2);
      dhg.a(cuu.hR, $$2);
      dhg.a(cuu.hH, $$2);
      dhg.a(cuu.hM, $$2);
      dhg.a(cuu.hJ, $$2);
      dhg.a(cuu.hG, $$2);
      dhg.a(cuu.hK, $$2);
      dhg.a(cuu.hO, $$2);
      dhg.a(cuu.hS, $$2);
      dhg.a(cuu.hI, $$2);
      dhg.a(cuu.eN, new ku() {
         @Override
         public cur a(kq $$0, cur $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhg.b));

            for (chk $$4 : $$0.b().a(chk.class, new evo($$2), $$0x -> $$0x.bD() && !$$0x.u())) {
               if ($$4.gF() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dhg.a(cuu.nU, new kr(cox.b.a));
      dhg.a(cuu.nW, new kr(cox.b.b));
      dhg.a(cuu.nY, new kr(cox.b.c));
      dhg.a(cuu.oa, new kr(cox.b.d));
      dhg.a(cuu.og, new kr(cox.b.g));
      dhg.a(cuu.oc, new kr(cox.b.e));
      dhg.a(cuu.oe, new kr(cox.b.f));
      dhg.a(cuu.oi, new kr(cox.b.h));
      dhg.a(cuu.ok, new kr(cox.b.i));
      dhg.a(cuu.nV, new kr(cox.b.a, true));
      dhg.a(cuu.nX, new kr(cox.b.b, true));
      dhg.a(cuu.nZ, new kr(cox.b.c, true));
      dhg.a(cuu.ob, new kr(cox.b.d, true));
      dhg.a(cuu.oh, new kr(cox.b.g, true));
      dhg.a(cuu.od, new kr(cox.b.e, true));
      dhg.a(cuu.of, new kr(cox.b.f, true));
      dhg.a(cuu.oj, new kr(cox.b.h, true));
      dhg.a(cuu.ol, new kr(cox.b.i, true));
      kt $$3 = new ks() {
         private final ks c = new ks();

         @Override
         public cur a(kq $$0, cur $$1) {
            cti $$2 = (cti)$$1.g();
            iz $$3 = $$0.c().a($$0.d().c(dhg.b));
            dca $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cur(cuu.qy);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dhg.a(cuu.qA, $$3);
      dhg.a(cuu.qz, $$3);
      dhg.a(cuu.qB, $$3);
      dhg.a(cuu.qG, $$3);
      dhg.a(cuu.qH, $$3);
      dhg.a(cuu.qF, $$3);
      dhg.a(cuu.qI, $$3);
      dhg.a(cuu.qJ, $$3);
      dhg.a(cuu.qK, $$3);
      dhg.a(cuu.qy, new ks() {
         private final ks c = new ks();

         @Override
         public cur a(kq $$0, cur $$1) {
            dcb $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhg.b));
            dse $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dfi $$6) {
               cur $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.e()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dwx.y, $$3);
                  cum $$8 = $$7.g();
                  $$1.h(1);
                  if ($$1.e()) {
                     return new cur($$8);
                  } else {
                     if ($$0.e().b(new cur($$8)) < 0) {
                        this.c.dispense($$0, new cur($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dhg.a(cuu.os, new ku() {
         @Override
         protected cur a(kq $$0, cur $$1) {
            dca $$2 = $$0.b();
            this.a(true);
            je $$3 = $$0.d().c(dhg.b);
            iz $$4 = $$0.c().a($$3);
            dse $$5 = $$2.a_($$4);
            if (deo.a($$2, $$4, $$3)) {
               $$2.b($$4, deo.a($$2, $$4));
               $$2.a(null, dwx.i, $$4);
            } else if (dfp.h($$5) || dfq.g($$5) || dfr.g($$5)) {
               $$2.b($$4, $$5.a(dsu.r, Boolean.valueOf(true)));
               $$2.a(null, dwx.c, $$4);
            } else if ($$5.b() instanceof dnk) {
               dnk.a($$2, $$4);
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
      dhg.a(cuu.ry, new ku() {
         @Override
         protected cur a(kq $$0, cur $$1) {
            this.a(true);
            dca $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhg.b));
            if (!csr.a($$1, $$2, $$3) && !csr.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dhg.a(dfd.ck, new ks() {
         @Override
         protected cur a(kq $$0, cur $$1) {
            dca $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhg.b));
            cjk $$4 = new cjk($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.du(), $$4.dw(), $$4.dA(), awa.zv, awb.e, 1.0F, 1.0F);
            $$2.a(null, dwx.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      kt $$4 = new ku() {
         @Override
         protected cur a(kq $$0, cur $$1) {
            this.a(csg.a($$0, $$1));
            return $$1;
         }
      };
      dhg.a(cuu.up, $$4);
      dhg.a(cuu.uo, $$4);
      dhg.a(cuu.uq, $$4);
      dhg.a(cuu.ul, $$4);
      dhg.a(cuu.ur, $$4);
      dhg.a(cuu.un, $$4);
      dhg.a(cuu.um, new ku() {
         @Override
         protected cur a(kq $$0, cur $$1) {
            dca $$2 = $$0.b();
            je $$3 = $$0.d().c(dhg.b);
            iz $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dou.b($$2, $$4, $$1)) {
               $$2.a($$4, dfd.gG.o().a(dmd.e, Integer.valueOf(dtk.a($$3))), 3);
               $$2.a(null, dwx.i, $$4);
               dpj $$5 = $$2.c_($$4);
               if ($$5 instanceof dqv) {
                  dou.a($$2, $$4, (dqv)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(csg.a($$0, $$1));
            }

            return $$1;
         }
      });
      dhg.a(dfd.ee, new ku() {
         @Override
         protected cur a(kq $$0, cur $$1) {
            dca $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhg.b));
            dfv $$4 = (dfv)dfd.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dwx.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(csg.a($$0, $$1));
            }

            return $$1;
         }
      });
      dhg.a(dfd.kP.r(), new kx());

      for (ctk $$5 : ctk.values()) {
         dhg.a(dma.a($$5).r(), new kx());
      }

      dhg.a(cuu.sl.r(), new ku() {
         private final ks c = new ks();

         private cur a(kq $$0, cur $$1, cur $$2) {
            $$1.h(1);
            if ($$1.e()) {
               $$0.b().a(null, dwx.y, $$0.c());
               return $$2.s();
            } else {
               if ($$0.e().b($$2.s()) < 0) {
                  this.c.dispense($$0, $$2.s());
               }

               return $$1;
            }
         }

         @Override
         public cur a(kq $$0, cur $$1) {
            this.a(false);
            arf $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhg.b));
            dse $$4 = $$2.a_($$3);
            if ($$4.a(awp.aG, $$0x -> $$0x.b(dev.c) && $$0x.b() instanceof dev) && $$4.c(dev.c) >= 5) {
               ((dev)$$4.b()).a($$2, $$4, $$3, null, dpg.b.b);
               this.a(true);
               return this.a($$0, $$1, new cur(cuu.wz));
            } else if ($$2.b_($$3).a(awv.a)) {
               this.a(true);
               return this.a($$0, $$1, cws.a(cuu.sk, cwt.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dhg.a(cuu.fu, new ku() {
         @Override
         public cur a(kq $$0, cur $$1) {
            je $$2 = $$0.d().c(dhg.b);
            iz $$3 = $$0.c().a($$2);
            dca $$4 = $$0.b();
            dse $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dfd.pl)) {
               if ($$5.c(dlj.d) != 4) {
                  dlj.a(null, $$4, $$3, $$5);
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
      dhg.a(cuu.rV.r(), new kw());
      dhg.a(cuu.xr.r(), new ku() {
         @Override
         protected cur a(kq $$0, cur $$1) {
            arf $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhg.b));
            List<cgq> $$4 = $$2.a(cgq.class, new evo($$3), btb.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cgq $$5 : $$4) {
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
      dhg.a(cuu.ww, new ku() {
         @Override
         public cur a(kq $$0, cur $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhg.b));
            dca $$3 = $$0.b();
            dse $$4 = $$3.a_($$2);
            Optional<dse> $$5 = cuh.a($$4);
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
      dhg.a(cuu.sk, new ks() {
         private final ks c = new ks();

         @Override
         public cur a(kq $$0, cur $$1) {
            cws $$2 = $$1.a(km.G, cws.a);
            if (!$$2.a(cwt.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arf $$3 = $$0.b();
               iz $$4 = $$0.c();
               iz $$5 = $$0.c().a($$0.d().c(dhg.b));
               if (!$$3.a_($$5).a(awp.ci)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(li.am, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awa.cB, awb.e, 1.0F, 1.0F);
                  $$3.a(null, dwx.z, $$4);
                  $$3.b($$5, dfd.sI.o());
                  return new cur(cuu.sl);
               }
            }
         }
      });
   }
}
