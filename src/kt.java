import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface kt {
   Logger a = LogUtils.getLogger();
   kt b = ($$0, $$1) -> $$1;

   cuk dispense(kq var1, cuk var2);

   static void a() {
      dgz.a(cun.ov);
      dgz.a(cun.vq);
      dgz.a(cun.vp);
      dgz.a(cun.qR);
      dgz.a(cun.qC);
      dgz.a(cun.tW);
      dgz.a(cun.vo);
      dgz.a(cun.vr);
      dgz.a(cun.uu);
      dgz.a(cun.tX);
      dgz.a(cun.tY);
      ks $$0 = new ks() {
         @Override
         public cuk a(kq $$0, cuk $$1) {
            je $$2 = $$0.d().c(dgz.b);
            bsv<?> $$3 = ((cvr)$$1.g()).j($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bto.o, $$2 != je.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cuk.l;
            }

            $$1.h(1);
            $$0.b().a(null, dwq.t, $$0.c());
            return $$1;
         }
      };

      for (cvr $$1 : cvr.h()) {
         dgz.a($$1, $$0);
      }

      dgz.a(cun.uF, new ks() {
         @Override
         public cuk a(kq $$0, cuk $$1) {
            je $$2 = $$0.d().c(dgz.b);
            iz $$3 = $$0.c().a($$2);
            arb $$4 = $$0.b();
            Consumer<cis> $$5 = bsv.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            cis $$6 = bsv.d.a($$4, $$5, $$3, bto.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dgz.a(cun.nL, new ku() {
         @Override
         public cuk a(kq $$0, cuk $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dgz.b));
            List<btk> $$3 = $$0.b().a(btk.class, new evh($$2), $$0x -> !($$0x instanceof bua $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bua)$$3.get(0)).a(avx.e);
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
         protected cuk a(kq $$0, cuk $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dgz.b));

            for (che $$4 : $$0.b().a(che.class, new evh($$2), $$0x -> $$0x.bD() && $$0x.fS())) {
               if ($$4.l($$1) && !$$4.fT() && $$4.gF()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dgz.a(cun.uJ, $$2);
      dgz.a(cun.uG, $$2);
      dgz.a(cun.uH, $$2);
      dgz.a(cun.uI, $$2);
      dgz.a(cun.hE, $$2);
      dgz.a(cun.hF, $$2);
      dgz.a(cun.hN, $$2);
      dgz.a(cun.hP, $$2);
      dgz.a(cun.hQ, $$2);
      dgz.a(cun.hT, $$2);
      dgz.a(cun.hL, $$2);
      dgz.a(cun.hR, $$2);
      dgz.a(cun.hH, $$2);
      dgz.a(cun.hM, $$2);
      dgz.a(cun.hJ, $$2);
      dgz.a(cun.hG, $$2);
      dgz.a(cun.hK, $$2);
      dgz.a(cun.hO, $$2);
      dgz.a(cun.hS, $$2);
      dgz.a(cun.hI, $$2);
      dgz.a(cun.eN, new ku() {
         @Override
         public cuk a(kq $$0, cuk $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dgz.b));

            for (chd $$4 : $$0.b().a(chd.class, new evh($$2), $$0x -> $$0x.bD() && !$$0x.u())) {
               if ($$4.gF() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dgz.a(cun.nU, new kr(coq.b.a));
      dgz.a(cun.nW, new kr(coq.b.b));
      dgz.a(cun.nY, new kr(coq.b.c));
      dgz.a(cun.oa, new kr(coq.b.d));
      dgz.a(cun.og, new kr(coq.b.g));
      dgz.a(cun.oc, new kr(coq.b.e));
      dgz.a(cun.oe, new kr(coq.b.f));
      dgz.a(cun.oi, new kr(coq.b.h));
      dgz.a(cun.ok, new kr(coq.b.i));
      dgz.a(cun.nV, new kr(coq.b.a, true));
      dgz.a(cun.nX, new kr(coq.b.b, true));
      dgz.a(cun.nZ, new kr(coq.b.c, true));
      dgz.a(cun.ob, new kr(coq.b.d, true));
      dgz.a(cun.oh, new kr(coq.b.g, true));
      dgz.a(cun.od, new kr(coq.b.e, true));
      dgz.a(cun.of, new kr(coq.b.f, true));
      dgz.a(cun.oj, new kr(coq.b.h, true));
      dgz.a(cun.ol, new kr(coq.b.i, true));
      kt $$3 = new ks() {
         private final ks c = new ks();

         @Override
         public cuk a(kq $$0, cuk $$1) {
            ctb $$2 = (ctb)$$1.g();
            iz $$3 = $$0.c().a($$0.d().c(dgz.b));
            dbt $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cuk(cun.qy);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dgz.a(cun.qA, $$3);
      dgz.a(cun.qz, $$3);
      dgz.a(cun.qB, $$3);
      dgz.a(cun.qG, $$3);
      dgz.a(cun.qH, $$3);
      dgz.a(cun.qF, $$3);
      dgz.a(cun.qI, $$3);
      dgz.a(cun.qJ, $$3);
      dgz.a(cun.qK, $$3);
      dgz.a(cun.qy, new ks() {
         private final ks c = new ks();

         @Override
         public cuk a(kq $$0, cuk $$1) {
            dbu $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dgz.b));
            drx $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dfb $$6) {
               cuk $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.e()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dwq.y, $$3);
                  cuf $$8 = $$7.g();
                  $$1.h(1);
                  if ($$1.e()) {
                     return new cuk($$8);
                  } else {
                     if ($$0.e().b(new cuk($$8)) < 0) {
                        this.c.dispense($$0, new cuk($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dgz.a(cun.os, new ku() {
         @Override
         protected cuk a(kq $$0, cuk $$1) {
            dbt $$2 = $$0.b();
            this.a(true);
            je $$3 = $$0.d().c(dgz.b);
            iz $$4 = $$0.c().a($$3);
            drx $$5 = $$2.a_($$4);
            if (deh.a($$2, $$4, $$3)) {
               $$2.b($$4, deh.a($$2, $$4));
               $$2.a(null, dwq.i, $$4);
            } else if (dfi.h($$5) || dfj.g($$5) || dfk.g($$5)) {
               $$2.b($$4, $$5.a(dsn.r, Boolean.valueOf(true)));
               $$2.a(null, dwq.c, $$4);
            } else if ($$5.b() instanceof dnd) {
               dnd.a($$2, $$4);
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
      dgz.a(cun.ry, new ku() {
         @Override
         protected cuk a(kq $$0, cuk $$1) {
            this.a(true);
            dbt $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dgz.b));
            if (!csk.a($$1, $$2, $$3) && !csk.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dgz.a(dew.ck, new ks() {
         @Override
         protected cuk a(kq $$0, cuk $$1) {
            dbt $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dgz.b));
            cjd $$4 = new cjd($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.du(), $$4.dw(), $$4.dA(), avw.zv, avx.e, 1.0F, 1.0F);
            $$2.a(null, dwq.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      kt $$4 = new ku() {
         @Override
         protected cuk a(kq $$0, cuk $$1) {
            this.a(crz.a($$0, $$1));
            return $$1;
         }
      };
      dgz.a(cun.up, $$4);
      dgz.a(cun.uo, $$4);
      dgz.a(cun.uq, $$4);
      dgz.a(cun.ul, $$4);
      dgz.a(cun.ur, $$4);
      dgz.a(cun.un, $$4);
      dgz.a(cun.um, new ku() {
         @Override
         protected cuk a(kq $$0, cuk $$1) {
            dbt $$2 = $$0.b();
            je $$3 = $$0.d().c(dgz.b);
            iz $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && don.b($$2, $$4, $$1)) {
               $$2.a($$4, dew.gG.n().a(dlw.e, Integer.valueOf(dtd.a($$3))), 3);
               $$2.a(null, dwq.i, $$4);
               dpc $$5 = $$2.c_($$4);
               if ($$5 instanceof dqo) {
                  don.a($$2, $$4, (dqo)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(crz.a($$0, $$1));
            }

            return $$1;
         }
      });
      dgz.a(dew.ee, new ku() {
         @Override
         protected cuk a(kq $$0, cuk $$1) {
            dbt $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dgz.b));
            dfo $$4 = (dfo)dew.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.n(), 3);
                  $$2.a(null, dwq.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(crz.a($$0, $$1));
            }

            return $$1;
         }
      });
      dgz.a(dew.kP.r(), new kx());

      for (ctd $$5 : ctd.values()) {
         dgz.a(dlt.a($$5).r(), new kx());
      }

      dgz.a(cun.sl.r(), new ku() {
         private final ks c = new ks();

         private cuk a(kq $$0, cuk $$1, cuk $$2) {
            $$1.h(1);
            if ($$1.e()) {
               $$0.b().a(null, dwq.y, $$0.c());
               return $$2.s();
            } else {
               if ($$0.e().b($$2.s()) < 0) {
                  this.c.dispense($$0, $$2.s());
               }

               return $$1;
            }
         }

         @Override
         public cuk a(kq $$0, cuk $$1) {
            this.a(false);
            arb $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dgz.b));
            drx $$4 = $$2.a_($$3);
            if ($$4.a(awl.aG, $$0x -> $$0x.b(deo.c) && $$0x.b() instanceof deo) && $$4.c(deo.c) >= 5) {
               ((deo)$$4.b()).a($$2, $$4, $$3, null, doz.b.b);
               this.a(true);
               return this.a($$0, $$1, new cuk(cun.wz));
            } else if ($$2.b_($$3).a(awr.a)) {
               this.a(true);
               return this.a($$0, $$1, cwl.a(cun.sk, cwm.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dgz.a(cun.fu, new ku() {
         @Override
         public cuk a(kq $$0, cuk $$1) {
            je $$2 = $$0.d().c(dgz.b);
            iz $$3 = $$0.c().a($$2);
            dbt $$4 = $$0.b();
            drx $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dew.pl)) {
               if ($$5.c(dlc.d) != 4) {
                  dlc.a(null, $$4, $$3, $$5);
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
      dgz.a(cun.rV.r(), new kw());
      dgz.a(cun.xr.r(), new ku() {
         @Override
         protected cuk a(kq $$0, cuk $$1) {
            arb $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dgz.b));
            List<cgj> $$4 = $$2.a(cgj.class, new evh($$3), bsu.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cgj $$5 : $$4) {
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
      dgz.a(cun.ww, new ku() {
         @Override
         public cuk a(kq $$0, cuk $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dgz.b));
            dbt $$3 = $$0.b();
            drx $$4 = $$3.a_($$2);
            Optional<drx> $$5 = cua.a($$4);
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
      dgz.a(cun.sk, new ks() {
         private final ks c = new ks();

         @Override
         public cuk a(kq $$0, cuk $$1) {
            cwl $$2 = $$1.a(km.F, cwl.a);
            if (!$$2.a(cwm.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arb $$3 = $$0.b();
               iz $$4 = $$0.c();
               iz $$5 = $$0.c().a($$0.d().c(dgz.b));
               if (!$$3.a_($$5).a(awl.ci)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lj.am, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, avw.cB, avx.e, 1.0F, 1.0F);
                  $$3.a(null, dwq.z, $$4);
                  $$3.b($$5, dew.sI.n());
                  return new cuk(cun.sl);
               }
            }
         }
      });
   }
}
