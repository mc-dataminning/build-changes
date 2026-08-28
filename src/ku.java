import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface ku {
   Logger a = LogUtils.getLogger();
   ku b = ($$0, $$1) -> $$1;

   cud dispense(kr var1, cud var2);

   static void a() {
      dhn.a(cug.ow);
      dhn.a(cug.vq);
      dhn.a(cug.vp);
      dhn.a(cug.qR);
      dhn.a(cug.qC);
      dhn.a(cug.tW);
      dhn.a(cug.vo);
      dhn.a(cug.vr);
      dhn.a(cug.uu);
      dhn.a(cug.tX);
      dhn.a(cug.tY);
      kt $$0 = new kt() {
         @Override
         public cud a(kr $$0, cud $$1) {
            jf $$2 = $$0.d().c(dhn.b);
            bsn<?> $$3 = ((cvk)$$1.g()).i($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), btg.o, $$2 != jf.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cud.l;
            }

            $$1.h(1);
            $$0.b().a(null, dxh.t, $$0.c());
            return $$1;
         }
      };

      for (cvk $$1 : cvk.h()) {
         dhn.a($$1, $$0);
      }

      dhn.a(cug.uF, new kt() {
         @Override
         public cud a(kr $$0, cud $$1) {
            jf $$2 = $$0.d().c(dhn.b);
            ja $$3 = $$0.c().a($$2);
            aqm $$4 = $$0.b();
            Consumer<cik> $$5 = bsn.a($$1x -> $$1x.s($$2.p()), $$4, $$1, null);
            cik $$6 = bsn.d.a($$4, $$5, $$3, btg.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dhn.a(cug.nL, new kv() {
         @Override
         public cud a(kr $$0, cud $$1) {
            ja $$2 = $$0.c().a($$0.d().c(dhn.b));
            List<btc> $$3 = $$0.b().a(btc.class, new ewc($$2), $$0x -> !($$0x instanceof bts $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bts)$$3.get(0)).a(avi.e);
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
         protected cud a(kr $$0, cud $$1) {
            ja $$2 = $$0.c().a($$0.d().c(dhn.b));

            for (cgw $$4 : $$0.b().a(cgw.class, new ewc($$2), $$0x -> $$0x.bF() && $$0x.d(bso.g))) {
               if ($$4.l($$1) && !$$4.fP() && $$4.gC()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dhn.a(cug.uJ, $$2);
      dhn.a(cug.uG, $$2);
      dhn.a(cug.uH, $$2);
      dhn.a(cug.uI, $$2);
      dhn.a(cug.hE, $$2);
      dhn.a(cug.hF, $$2);
      dhn.a(cug.hN, $$2);
      dhn.a(cug.hP, $$2);
      dhn.a(cug.hQ, $$2);
      dhn.a(cug.hT, $$2);
      dhn.a(cug.hL, $$2);
      dhn.a(cug.hR, $$2);
      dhn.a(cug.hH, $$2);
      dhn.a(cug.hM, $$2);
      dhn.a(cug.hJ, $$2);
      dhn.a(cug.hG, $$2);
      dhn.a(cug.hK, $$2);
      dhn.a(cug.hO, $$2);
      dhn.a(cug.hS, $$2);
      dhn.a(cug.hI, $$2);
      dhn.a(cug.eN, new kv() {
         @Override
         public cud a(kr $$0, cud $$1) {
            ja $$2 = $$0.c().a($$0.d().c(dhn.b));

            for (cgv $$4 : $$0.b().a(cgv.class, new ewc($$2), $$0x -> $$0x.bF() && !$$0x.t())) {
               if ($$4.gC() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dhn.a(cug.nU, new ks(coi.b.a));
      dhn.a(cug.nW, new ks(coi.b.b));
      dhn.a(cug.nY, new ks(coi.b.c));
      dhn.a(cug.oa, new ks(coi.b.d));
      dhn.a(cug.og, new ks(coi.b.g));
      dhn.a(cug.oc, new ks(coi.b.e));
      dhn.a(cug.oe, new ks(coi.b.f));
      dhn.a(cug.oi, new ks(coi.b.h));
      dhn.a(cug.ok, new ks(coi.b.i));
      dhn.a(cug.nV, new ks(coi.b.a, true));
      dhn.a(cug.nX, new ks(coi.b.b, true));
      dhn.a(cug.nZ, new ks(coi.b.c, true));
      dhn.a(cug.ob, new ks(coi.b.d, true));
      dhn.a(cug.oh, new ks(coi.b.g, true));
      dhn.a(cug.od, new ks(coi.b.e, true));
      dhn.a(cug.of, new ks(coi.b.f, true));
      dhn.a(cug.oj, new ks(coi.b.h, true));
      dhn.a(cug.ol, new ks(coi.b.i, true));
      ku $$3 = new kt() {
         private final kt c = new kt();

         @Override
         public cud a(kr $$0, cud $$1) {
            csu $$2 = (csu)$$1.g();
            ja $$3 = $$0.c().a($$0.d().c(dhn.b));
            dcg $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cud(cug.qy));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dhn.a(cug.qA, $$3);
      dhn.a(cug.qz, $$3);
      dhn.a(cug.qB, $$3);
      dhn.a(cug.qG, $$3);
      dhn.a(cug.qH, $$3);
      dhn.a(cug.qF, $$3);
      dhn.a(cug.qI, $$3);
      dhn.a(cug.qJ, $$3);
      dhn.a(cug.qK, $$3);
      dhn.a(cug.qy, new kt() {
         @Override
         public cud a(kr $$0, cud $$1) {
            dch $$2 = $$0.b();
            ja $$3 = $$0.c().a($$0.d().c(dhn.b));
            dsl $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dfp $$6) {
               cud $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.e()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dxh.y, $$3);
                  cty $$8 = $$7.g();
                  return this.a($$0, $$1, new cud($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dhn.a(cug.os, new kv() {
         @Override
         protected cud a(kr $$0, cud $$1) {
            aqm $$2 = $$0.b();
            this.a(true);
            jf $$3 = $$0.d().c(dhn.b);
            ja $$4 = $$0.c().a($$3);
            dsl $$5 = $$2.a_($$4);
            if (dev.a($$2, $$4, $$3)) {
               $$2.b($$4, dev.a($$2, $$4));
               $$2.a(null, dxh.i, $$4);
            } else if (dfw.h($$5) || dfx.g($$5) || dfy.g($$5)) {
               $$2.b($$4, $$5.a(dtb.r, Boolean.valueOf(true)));
               $$2.a(null, dxh.c, $$4);
            } else if ($$5.b() instanceof dnr) {
               dnr.a($$2, $$4);
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
      dhn.a(cug.ry, new kv() {
         @Override
         protected cud a(kr $$0, cud $$1) {
            this.a(true);
            dcg $$2 = $$0.b();
            ja $$3 = $$0.c().a($$0.d().c(dhn.b));
            if (!cse.a($$1, $$2, $$3) && !cse.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dhn.a(dfk.ck, new kt() {
         @Override
         protected cud a(kr $$0, cud $$1) {
            dcg $$2 = $$0.b();
            ja $$3 = $$0.c().a($$0.d().c(dhn.b));
            ciw $$4 = new ciw($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dw(), $$4.dy(), $$4.dC(), avh.zy, avi.e, 1.0F, 1.0F);
            $$2.a(null, dxh.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      ku $$4 = new kv() {
         @Override
         protected cud a(kr $$0, cud $$1) {
            this.a(crt.a($$0, $$1));
            return $$1;
         }
      };
      dhn.a(cug.up, $$4);
      dhn.a(cug.uo, $$4);
      dhn.a(cug.uq, $$4);
      dhn.a(cug.ul, $$4);
      dhn.a(cug.ur, $$4);
      dhn.a(cug.un, $$4);
      dhn.a(cug.um, new kv() {
         @Override
         protected cud a(kr $$0, cud $$1) {
            dcg $$2 = $$0.b();
            jf $$3 = $$0.d().c(dhn.b);
            ja $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dpb.b($$2, $$4, $$1)) {
               $$2.a($$4, dfk.gG.o().a(dmk.e, Integer.valueOf(dtr.a($$3))), 3);
               $$2.a(null, dxh.i, $$4);
               dpq $$5 = $$2.c_($$4);
               if ($$5 instanceof drd) {
                  dpb.a($$2, $$4, (drd)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(crt.a($$0, $$1));
            }

            return $$1;
         }
      });
      dhn.a(dfk.ee, new kv() {
         @Override
         protected cud a(kr $$0, cud $$1) {
            dcg $$2 = $$0.b();
            ja $$3 = $$0.c().a($$0.d().c(dhn.b));
            dgc $$4 = (dgc)dfk.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dxh.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(crt.a($$0, $$1));
            }

            return $$1;
         }
      });
      dhn.a(dfk.kP.r(), new ky());

      for (csw $$5 : csw.values()) {
         dhn.a(dmh.a($$5).r(), new ky());
      }

      dhn.a(cug.sl.r(), new kv() {
         private cud b(kr $$0, cud $$1, cud $$2) {
            $$0.b().a(null, dxh.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cud a(kr $$0, cud $$1) {
            this.a(false);
            aqm $$2 = $$0.b();
            ja $$3 = $$0.c().a($$0.d().c(dhn.b));
            dsl $$4 = $$2.a_($$3);
            if ($$4.a(avw.aG, $$0x -> $$0x.b(dfc.c) && $$0x.b() instanceof dfc) && $$4.c(dfc.c) >= 5) {
               ((dfc)$$4.b()).a($$2, $$4, $$3, null, dpn.b.b);
               this.a(true);
               return this.b($$0, $$1, new cud(cug.wC));
            } else if ($$2.b_($$3).a(awc.a)) {
               this.a(true);
               return this.b($$0, $$1, cwe.a(cug.sk, cwf.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dhn.a(cug.fu, new kv() {
         @Override
         public cud a(kr $$0, cud $$1) {
            jf $$2 = $$0.d().c(dhn.b);
            ja $$3 = $$0.c().a($$2);
            dcg $$4 = $$0.b();
            dsl $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dfk.pl)) {
               if ($$5.c(dlq.d) != 4) {
                  dlq.a(null, $$4, $$3, $$5);
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
      dhn.a(cug.rV.r(), new kx());
      dhn.a(cug.xu.r(), new kv() {
         @Override
         protected cud a(kr $$0, cud $$1) {
            aqm $$2 = $$0.b();
            ja $$3 = $$0.c().a($$0.d().c(dhn.b));
            List<cgb> $$4 = $$2.a(cgb.class, new ewc($$3), bsm.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cgb $$5 : $$4) {
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
      dhn.a(cug.wz, new kv() {
         @Override
         public cud a(kr $$0, cud $$1) {
            ja $$2 = $$0.c().a($$0.d().c(dhn.b));
            dcg $$3 = $$0.b();
            dsl $$4 = $$3.a_($$2);
            Optional<dsl> $$5 = ctt.a($$4);
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
      dhn.a(cug.sk, new kt() {
         private final kt c = new kt();

         @Override
         public cud a(kr $$0, cud $$1) {
            cwe $$2 = $$1.a(kn.G, cwe.a);
            if (!$$2.a(cwf.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               aqm $$3 = $$0.b();
               ja $$4 = $$0.c();
               ja $$5 = $$0.c().a($$0.d().c(dhn.b));
               if (!$$3.a_($$5).a(avw.ci)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lj.am, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, avh.cB, avi.e, 1.0F, 1.0F);
                  $$3.a(null, dxh.z, $$4);
                  $$3.b($$5, dfk.sI.o());
                  return this.a($$0, $$1, new cud(cug.sl));
               }
            }
         }
      });
   }
}
