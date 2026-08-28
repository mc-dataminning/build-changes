import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface ku {
   Logger a = LogUtils.getLogger();
   ku b = ($$0, $$1) -> $$1;

   cuc dispense(kr var1, cuc var2);

   static void a() {
      dhm.a(cuf.ow);
      dhm.a(cuf.vq);
      dhm.a(cuf.vp);
      dhm.a(cuf.qR);
      dhm.a(cuf.qC);
      dhm.a(cuf.tW);
      dhm.a(cuf.vo);
      dhm.a(cuf.vr);
      dhm.a(cuf.uu);
      dhm.a(cuf.tX);
      dhm.a(cuf.tY);
      kt $$0 = new kt() {
         @Override
         public cuc a(kr $$0, cuc $$1) {
            jf $$2 = $$0.d().c(dhm.b);
            bsm<?> $$3 = ((cvj)$$1.g()).i($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), btf.o, $$2 != jf.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cuc.l;
            }

            $$1.h(1);
            $$0.b().a(null, dxg.t, $$0.c());
            return $$1;
         }
      };

      for (cvj $$1 : cvj.h()) {
         dhm.a($$1, $$0);
      }

      dhm.a(cuf.uF, new kt() {
         @Override
         public cuc a(kr $$0, cuc $$1) {
            jf $$2 = $$0.d().c(dhm.b);
            ja $$3 = $$0.c().a($$2);
            aqm $$4 = $$0.b();
            Consumer<cij> $$5 = bsm.a($$1x -> $$1x.s($$2.p()), $$4, $$1, null);
            cij $$6 = bsm.d.a($$4, $$5, $$3, btf.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dhm.a(cuf.nL, new kv() {
         @Override
         public cuc a(kr $$0, cuc $$1) {
            ja $$2 = $$0.c().a($$0.d().c(dhm.b));
            List<btb> $$3 = $$0.b().a(btb.class, new ewa($$2), $$0x -> !($$0x instanceof btr $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((btr)$$3.get(0)).a(avi.e);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      kt $$2 = new kv() {
         @Override
         protected cuc a(kr $$0, cuc $$1) {
            ja $$2 = $$0.c().a($$0.d().c(dhm.b));

            for (cgv $$4 : $$0.b().a(cgv.class, new ewa($$2), $$0x -> $$0x.bE() && $$0x.fP())) {
               if ($$4.l($$1) && !$$4.fQ() && $$4.gD()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dhm.a(cuf.uJ, $$2);
      dhm.a(cuf.uG, $$2);
      dhm.a(cuf.uH, $$2);
      dhm.a(cuf.uI, $$2);
      dhm.a(cuf.hE, $$2);
      dhm.a(cuf.hF, $$2);
      dhm.a(cuf.hN, $$2);
      dhm.a(cuf.hP, $$2);
      dhm.a(cuf.hQ, $$2);
      dhm.a(cuf.hT, $$2);
      dhm.a(cuf.hL, $$2);
      dhm.a(cuf.hR, $$2);
      dhm.a(cuf.hH, $$2);
      dhm.a(cuf.hM, $$2);
      dhm.a(cuf.hJ, $$2);
      dhm.a(cuf.hG, $$2);
      dhm.a(cuf.hK, $$2);
      dhm.a(cuf.hO, $$2);
      dhm.a(cuf.hS, $$2);
      dhm.a(cuf.hI, $$2);
      dhm.a(cuf.eN, new kv() {
         @Override
         public cuc a(kr $$0, cuc $$1) {
            ja $$2 = $$0.c().a($$0.d().c(dhm.b));

            for (cgu $$4 : $$0.b().a(cgu.class, new ewa($$2), $$0x -> $$0x.bE() && !$$0x.u())) {
               if ($$4.gD() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dhm.a(cuf.nU, new ks(coh.b.a));
      dhm.a(cuf.nW, new ks(coh.b.b));
      dhm.a(cuf.nY, new ks(coh.b.c));
      dhm.a(cuf.oa, new ks(coh.b.d));
      dhm.a(cuf.og, new ks(coh.b.g));
      dhm.a(cuf.oc, new ks(coh.b.e));
      dhm.a(cuf.oe, new ks(coh.b.f));
      dhm.a(cuf.oi, new ks(coh.b.h));
      dhm.a(cuf.ok, new ks(coh.b.i));
      dhm.a(cuf.nV, new ks(coh.b.a, true));
      dhm.a(cuf.nX, new ks(coh.b.b, true));
      dhm.a(cuf.nZ, new ks(coh.b.c, true));
      dhm.a(cuf.ob, new ks(coh.b.d, true));
      dhm.a(cuf.oh, new ks(coh.b.g, true));
      dhm.a(cuf.od, new ks(coh.b.e, true));
      dhm.a(cuf.of, new ks(coh.b.f, true));
      dhm.a(cuf.oj, new ks(coh.b.h, true));
      dhm.a(cuf.ol, new ks(coh.b.i, true));
      ku $$3 = new kt() {
         private final kt c = new kt();

         @Override
         public cuc a(kr $$0, cuc $$1) {
            cst $$2 = (cst)$$1.g();
            ja $$3 = $$0.c().a($$0.d().c(dhm.b));
            dcf $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cuc(cuf.qy));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dhm.a(cuf.qA, $$3);
      dhm.a(cuf.qz, $$3);
      dhm.a(cuf.qB, $$3);
      dhm.a(cuf.qG, $$3);
      dhm.a(cuf.qH, $$3);
      dhm.a(cuf.qF, $$3);
      dhm.a(cuf.qI, $$3);
      dhm.a(cuf.qJ, $$3);
      dhm.a(cuf.qK, $$3);
      dhm.a(cuf.qy, new kt() {
         @Override
         public cuc a(kr $$0, cuc $$1) {
            dcg $$2 = $$0.b();
            ja $$3 = $$0.c().a($$0.d().c(dhm.b));
            dsk $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dfo $$6) {
               cuc $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.e()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dxg.y, $$3);
                  ctx $$8 = $$7.g();
                  return this.a($$0, $$1, new cuc($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dhm.a(cuf.os, new kv() {
         @Override
         protected cuc a(kr $$0, cuc $$1) {
            aqm $$2 = $$0.b();
            this.a(true);
            jf $$3 = $$0.d().c(dhm.b);
            ja $$4 = $$0.c().a($$3);
            dsk $$5 = $$2.a_($$4);
            if (deu.a($$2, $$4, $$3)) {
               $$2.b($$4, deu.a($$2, $$4));
               $$2.a(null, dxg.i, $$4);
            } else if (dfv.h($$5) || dfw.g($$5) || dfx.g($$5)) {
               $$2.b($$4, $$5.a(dta.r, Boolean.valueOf(true)));
               $$2.a(null, dxg.c, $$4);
            } else if ($$5.b() instanceof dnq) {
               dnq.a($$2, $$4);
               $$2.a($$4, false);
            } else {
               this.a(false);
            }

            if (this.b()) {
               $$1.a(1, $$2, null, () -> $$1.e(0));
            }

            return $$1;
         }
      });
      dhm.a(cuf.ry, new kv() {
         @Override
         protected cuc a(kr $$0, cuc $$1) {
            this.a(true);
            dcf $$2 = $$0.b();
            ja $$3 = $$0.c().a($$0.d().c(dhm.b));
            if (!csd.a($$1, $$2, $$3) && !csd.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dhm.a(dfj.ck, new kt() {
         @Override
         protected cuc a(kr $$0, cuc $$1) {
            dcf $$2 = $$0.b();
            ja $$3 = $$0.c().a($$0.d().c(dhm.b));
            civ $$4 = new civ($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dv(), $$4.dx(), $$4.dB(), avh.zy, avi.e, 1.0F, 1.0F);
            $$2.a(null, dxg.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      ku $$4 = new kv() {
         @Override
         protected cuc a(kr $$0, cuc $$1) {
            this.a(crs.a($$0, $$1));
            return $$1;
         }
      };
      dhm.a(cuf.up, $$4);
      dhm.a(cuf.uo, $$4);
      dhm.a(cuf.uq, $$4);
      dhm.a(cuf.ul, $$4);
      dhm.a(cuf.ur, $$4);
      dhm.a(cuf.un, $$4);
      dhm.a(cuf.um, new kv() {
         @Override
         protected cuc a(kr $$0, cuc $$1) {
            dcf $$2 = $$0.b();
            jf $$3 = $$0.d().c(dhm.b);
            ja $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dpa.b($$2, $$4, $$1)) {
               $$2.a($$4, dfj.gG.o().a(dmj.e, Integer.valueOf(dtq.a($$3))), 3);
               $$2.a(null, dxg.i, $$4);
               dpp $$5 = $$2.c_($$4);
               if ($$5 instanceof drc) {
                  dpa.a($$2, $$4, (drc)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(crs.a($$0, $$1));
            }

            return $$1;
         }
      });
      dhm.a(dfj.ee, new kv() {
         @Override
         protected cuc a(kr $$0, cuc $$1) {
            dcf $$2 = $$0.b();
            ja $$3 = $$0.c().a($$0.d().c(dhm.b));
            dgb $$4 = (dgb)dfj.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dxg.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(crs.a($$0, $$1));
            }

            return $$1;
         }
      });
      dhm.a(dfj.kP.r(), new ky());

      for (csv $$5 : csv.values()) {
         dhm.a(dmg.a($$5).r(), new ky());
      }

      dhm.a(cuf.sl.r(), new kv() {
         private cuc b(kr $$0, cuc $$1, cuc $$2) {
            $$0.b().a(null, dxg.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cuc a(kr $$0, cuc $$1) {
            this.a(false);
            aqm $$2 = $$0.b();
            ja $$3 = $$0.c().a($$0.d().c(dhm.b));
            dsk $$4 = $$2.a_($$3);
            if ($$4.a(avw.aG, $$0x -> $$0x.b(dfb.c) && $$0x.b() instanceof dfb) && $$4.c(dfb.c) >= 5) {
               ((dfb)$$4.b()).a($$2, $$4, $$3, null, dpm.b.b);
               this.a(true);
               return this.b($$0, $$1, new cuc(cuf.wC));
            } else if ($$2.b_($$3).a(awc.a)) {
               this.a(true);
               return this.b($$0, $$1, cwd.a(cuf.sk, cwe.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dhm.a(cuf.fu, new kv() {
         @Override
         public cuc a(kr $$0, cuc $$1) {
            jf $$2 = $$0.d().c(dhm.b);
            ja $$3 = $$0.c().a($$2);
            dcf $$4 = $$0.b();
            dsk $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dfj.pl)) {
               if ($$5.c(dlp.d) != 4) {
                  dlp.a(null, $$4, $$3, $$5);
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
      dhm.a(cuf.rV.r(), new kx());
      dhm.a(cuf.xu.r(), new kv() {
         @Override
         protected cuc a(kr $$0, cuc $$1) {
            aqm $$2 = $$0.b();
            ja $$3 = $$0.c().a($$0.d().c(dhm.b));
            List<cga> $$4 = $$2.a(cga.class, new ewa($$3), bsl.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cga $$5 : $$4) {
                  if ($$5.gy()) {
                     $$1.a(16, $$2, null, () -> {
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
      dhm.a(cuf.wz, new kv() {
         @Override
         public cuc a(kr $$0, cuc $$1) {
            ja $$2 = $$0.c().a($$0.d().c(dhm.b));
            dcf $$3 = $$0.b();
            dsk $$4 = $$3.a_($$2);
            Optional<dsk> $$5 = cts.a($$4);
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
      dhm.a(cuf.sk, new kt() {
         private final kt c = new kt();

         @Override
         public cuc a(kr $$0, cuc $$1) {
            cwd $$2 = $$1.a(kn.G, cwd.a);
            if (!$$2.a(cwe.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               aqm $$3 = $$0.b();
               ja $$4 = $$0.c();
               ja $$5 = $$0.c().a($$0.d().c(dhm.b));
               if (!$$3.a_($$5).a(avw.ci)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lj.am, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, avh.cB, avi.e, 1.0F, 1.0F);
                  $$3.a(null, dxg.z, $$4);
                  $$3.b($$5, dfj.sI.o());
                  return this.a($$0, $$1, new cuc(cuf.sl));
               }
            }
         }
      });
   }
}
