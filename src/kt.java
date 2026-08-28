import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface kt {
   Logger a = LogUtils.getLogger();
   kt b = ($$0, $$1) -> $$1;

   cuq dispense(kq var1, cuq var2);

   static void a() {
      dhf.a(cut.ov);
      dhf.a(cut.vq);
      dhf.a(cut.vp);
      dhf.a(cut.qR);
      dhf.a(cut.qC);
      dhf.a(cut.tW);
      dhf.a(cut.vo);
      dhf.a(cut.vr);
      dhf.a(cut.uu);
      dhf.a(cut.tX);
      dhf.a(cut.tY);
      ks $$0 = new ks() {
         @Override
         public cuq a(kq $$0, cuq $$1) {
            je $$2 = $$0.d().c(dhf.b);
            btb<?> $$3 = ((cvx)$$1.g()).j($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), btu.o, $$2 != je.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cuq.l;
            }

            $$1.h(1);
            $$0.b().a(null, dww.t, $$0.c());
            return $$1;
         }
      };

      for (cvx $$1 : cvx.h()) {
         dhf.a($$1, $$0);
      }

      dhf.a(cut.uF, new ks() {
         @Override
         public cuq a(kq $$0, cuq $$1) {
            je $$2 = $$0.d().c(dhf.b);
            iz $$3 = $$0.c().a($$2);
            arf $$4 = $$0.b();
            Consumer<ciy> $$5 = btb.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            ciy $$6 = btb.d.a($$4, $$5, $$3, btu.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dhf.a(cut.nL, new ku() {
         @Override
         public cuq a(kq $$0, cuq $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhf.b));
            List<btq> $$3 = $$0.b().a(btq.class, new evn($$2), $$0x -> !($$0x instanceof bug $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bug)$$3.get(0)).a(awb.e);
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
         protected cuq a(kq $$0, cuq $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhf.b));

            for (chk $$4 : $$0.b().a(chk.class, new evn($$2), $$0x -> $$0x.bD() && $$0x.fS())) {
               if ($$4.l($$1) && !$$4.fT() && $$4.gF()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dhf.a(cut.uJ, $$2);
      dhf.a(cut.uG, $$2);
      dhf.a(cut.uH, $$2);
      dhf.a(cut.uI, $$2);
      dhf.a(cut.hE, $$2);
      dhf.a(cut.hF, $$2);
      dhf.a(cut.hN, $$2);
      dhf.a(cut.hP, $$2);
      dhf.a(cut.hQ, $$2);
      dhf.a(cut.hT, $$2);
      dhf.a(cut.hL, $$2);
      dhf.a(cut.hR, $$2);
      dhf.a(cut.hH, $$2);
      dhf.a(cut.hM, $$2);
      dhf.a(cut.hJ, $$2);
      dhf.a(cut.hG, $$2);
      dhf.a(cut.hK, $$2);
      dhf.a(cut.hO, $$2);
      dhf.a(cut.hS, $$2);
      dhf.a(cut.hI, $$2);
      dhf.a(cut.eN, new ku() {
         @Override
         public cuq a(kq $$0, cuq $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhf.b));

            for (chj $$4 : $$0.b().a(chj.class, new evn($$2), $$0x -> $$0x.bD() && !$$0x.u())) {
               if ($$4.gF() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dhf.a(cut.nU, new kr(cow.b.a));
      dhf.a(cut.nW, new kr(cow.b.b));
      dhf.a(cut.nY, new kr(cow.b.c));
      dhf.a(cut.oa, new kr(cow.b.d));
      dhf.a(cut.og, new kr(cow.b.g));
      dhf.a(cut.oc, new kr(cow.b.e));
      dhf.a(cut.oe, new kr(cow.b.f));
      dhf.a(cut.oi, new kr(cow.b.h));
      dhf.a(cut.ok, new kr(cow.b.i));
      dhf.a(cut.nV, new kr(cow.b.a, true));
      dhf.a(cut.nX, new kr(cow.b.b, true));
      dhf.a(cut.nZ, new kr(cow.b.c, true));
      dhf.a(cut.ob, new kr(cow.b.d, true));
      dhf.a(cut.oh, new kr(cow.b.g, true));
      dhf.a(cut.od, new kr(cow.b.e, true));
      dhf.a(cut.of, new kr(cow.b.f, true));
      dhf.a(cut.oj, new kr(cow.b.h, true));
      dhf.a(cut.ol, new kr(cow.b.i, true));
      kt $$3 = new ks() {
         private final ks c = new ks();

         @Override
         public cuq a(kq $$0, cuq $$1) {
            cth $$2 = (cth)$$1.g();
            iz $$3 = $$0.c().a($$0.d().c(dhf.b));
            dbz $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cuq(cut.qy);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dhf.a(cut.qA, $$3);
      dhf.a(cut.qz, $$3);
      dhf.a(cut.qB, $$3);
      dhf.a(cut.qG, $$3);
      dhf.a(cut.qH, $$3);
      dhf.a(cut.qF, $$3);
      dhf.a(cut.qI, $$3);
      dhf.a(cut.qJ, $$3);
      dhf.a(cut.qK, $$3);
      dhf.a(cut.qy, new ks() {
         private final ks c = new ks();

         @Override
         public cuq a(kq $$0, cuq $$1) {
            dca $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhf.b));
            dsd $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dfh $$6) {
               cuq $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.e()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dww.y, $$3);
                  cul $$8 = $$7.g();
                  $$1.h(1);
                  if ($$1.e()) {
                     return new cuq($$8);
                  } else {
                     if ($$0.e().b(new cuq($$8)) < 0) {
                        this.c.dispense($$0, new cuq($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dhf.a(cut.os, new ku() {
         @Override
         protected cuq a(kq $$0, cuq $$1) {
            dbz $$2 = $$0.b();
            this.a(true);
            je $$3 = $$0.d().c(dhf.b);
            iz $$4 = $$0.c().a($$3);
            dsd $$5 = $$2.a_($$4);
            if (den.a($$2, $$4, $$3)) {
               $$2.b($$4, den.a($$2, $$4));
               $$2.a(null, dww.i, $$4);
            } else if (dfo.h($$5) || dfp.g($$5) || dfq.g($$5)) {
               $$2.b($$4, $$5.a(dst.r, Boolean.valueOf(true)));
               $$2.a(null, dww.c, $$4);
            } else if ($$5.b() instanceof dnj) {
               dnj.a($$2, $$4);
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
      dhf.a(cut.ry, new ku() {
         @Override
         protected cuq a(kq $$0, cuq $$1) {
            this.a(true);
            dbz $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhf.b));
            if (!csq.a($$1, $$2, $$3) && !csq.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dhf.a(dfc.ck, new ks() {
         @Override
         protected cuq a(kq $$0, cuq $$1) {
            dbz $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhf.b));
            cjj $$4 = new cjj($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.du(), $$4.dw(), $$4.dA(), awa.zv, awb.e, 1.0F, 1.0F);
            $$2.a(null, dww.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      kt $$4 = new ku() {
         @Override
         protected cuq a(kq $$0, cuq $$1) {
            this.a(csf.a($$0, $$1));
            return $$1;
         }
      };
      dhf.a(cut.up, $$4);
      dhf.a(cut.uo, $$4);
      dhf.a(cut.uq, $$4);
      dhf.a(cut.ul, $$4);
      dhf.a(cut.ur, $$4);
      dhf.a(cut.un, $$4);
      dhf.a(cut.um, new ku() {
         @Override
         protected cuq a(kq $$0, cuq $$1) {
            dbz $$2 = $$0.b();
            je $$3 = $$0.d().c(dhf.b);
            iz $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dot.b($$2, $$4, $$1)) {
               $$2.a($$4, dfc.gG.o().a(dmc.e, Integer.valueOf(dtj.a($$3))), 3);
               $$2.a(null, dww.i, $$4);
               dpi $$5 = $$2.c_($$4);
               if ($$5 instanceof dqu) {
                  dot.a($$2, $$4, (dqu)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(csf.a($$0, $$1));
            }

            return $$1;
         }
      });
      dhf.a(dfc.ee, new ku() {
         @Override
         protected cuq a(kq $$0, cuq $$1) {
            dbz $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhf.b));
            dfu $$4 = (dfu)dfc.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dww.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(csf.a($$0, $$1));
            }

            return $$1;
         }
      });
      dhf.a(dfc.kP.r(), new kx());

      for (ctj $$5 : ctj.values()) {
         dhf.a(dlz.a($$5).r(), new kx());
      }

      dhf.a(cut.sl.r(), new ku() {
         private final ks c = new ks();

         private cuq a(kq $$0, cuq $$1, cuq $$2) {
            $$1.h(1);
            if ($$1.e()) {
               $$0.b().a(null, dww.y, $$0.c());
               return $$2.s();
            } else {
               if ($$0.e().b($$2.s()) < 0) {
                  this.c.dispense($$0, $$2.s());
               }

               return $$1;
            }
         }

         @Override
         public cuq a(kq $$0, cuq $$1) {
            this.a(false);
            arf $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhf.b));
            dsd $$4 = $$2.a_($$3);
            if ($$4.a(awp.aG, $$0x -> $$0x.b(deu.c) && $$0x.b() instanceof deu) && $$4.c(deu.c) >= 5) {
               ((deu)$$4.b()).a($$2, $$4, $$3, null, dpf.b.b);
               this.a(true);
               return this.a($$0, $$1, new cuq(cut.wz));
            } else if ($$2.b_($$3).a(awv.a)) {
               this.a(true);
               return this.a($$0, $$1, cwr.a(cut.sk, cws.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dhf.a(cut.fu, new ku() {
         @Override
         public cuq a(kq $$0, cuq $$1) {
            je $$2 = $$0.d().c(dhf.b);
            iz $$3 = $$0.c().a($$2);
            dbz $$4 = $$0.b();
            dsd $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dfc.pl)) {
               if ($$5.c(dli.d) != 4) {
                  dli.a(null, $$4, $$3, $$5);
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
      dhf.a(cut.rV.r(), new kw());
      dhf.a(cut.xr.r(), new ku() {
         @Override
         protected cuq a(kq $$0, cuq $$1) {
            arf $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhf.b));
            List<cgp> $$4 = $$2.a(cgp.class, new evn($$3), bta.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cgp $$5 : $$4) {
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
      dhf.a(cut.ww, new ku() {
         @Override
         public cuq a(kq $$0, cuq $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhf.b));
            dbz $$3 = $$0.b();
            dsd $$4 = $$3.a_($$2);
            Optional<dsd> $$5 = cug.a($$4);
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
      dhf.a(cut.sk, new ks() {
         private final ks c = new ks();

         @Override
         public cuq a(kq $$0, cuq $$1) {
            cwr $$2 = $$1.a(km.G, cwr.a);
            if (!$$2.a(cws.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arf $$3 = $$0.b();
               iz $$4 = $$0.c();
               iz $$5 = $$0.c().a($$0.d().c(dhf.b));
               if (!$$3.a_($$5).a(awp.ci)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(li.am, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awa.cB, awb.e, 1.0F, 1.0F);
                  $$3.a(null, dww.z, $$4);
                  $$3.b($$5, dfc.sI.o());
                  return new cuq(cut.sl);
               }
            }
         }
      });
   }
}
