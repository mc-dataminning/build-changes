import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface ku {
   Logger a = LogUtils.getLogger();
   ku b = ($$0, $$1) -> $$1;

   cua dispense(kr var1, cua var2);

   static void a() {
      dhk.a(cud.ov);
      dhk.a(cud.vq);
      dhk.a(cud.vp);
      dhk.a(cud.qR);
      dhk.a(cud.qC);
      dhk.a(cud.tW);
      dhk.a(cud.vo);
      dhk.a(cud.vr);
      dhk.a(cud.uu);
      dhk.a(cud.tX);
      dhk.a(cud.tY);
      kt $$0 = new kt() {
         @Override
         public cua a(kr $$0, cua $$1) {
            jf $$2 = $$0.d().c(dhk.b);
            bsj<?> $$3 = ((cvh)$$1.g()).i($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), btc.o, $$2 != jf.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cua.l;
            }

            $$1.h(1);
            $$0.b().a(null, dxa.t, $$0.c());
            return $$1;
         }
      };

      for (cvh $$1 : cvh.h()) {
         dhk.a($$1, $$0);
      }

      dhk.a(cud.uF, new kt() {
         @Override
         public cua a(kr $$0, cua $$1) {
            jf $$2 = $$0.d().c(dhk.b);
            ja $$3 = $$0.c().a($$2);
            aqk $$4 = $$0.b();
            Consumer<cig> $$5 = bsj.a($$1x -> $$1x.s($$2.p()), $$4, $$1, null);
            cig $$6 = bsj.d.a($$4, $$5, $$3, btc.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dhk.a(cud.nL, new kv() {
         @Override
         public cua a(kr $$0, cua $$1) {
            ja $$2 = $$0.c().a($$0.d().c(dhk.b));
            List<bsy> $$3 = $$0.b().a(bsy.class, new evu($$2), $$0x -> !($$0x instanceof bto $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bto)$$3.get(0)).a(avg.e);
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
         protected cua a(kr $$0, cua $$1) {
            ja $$2 = $$0.c().a($$0.d().c(dhk.b));

            for (cgs $$4 : $$0.b().a(cgs.class, new evu($$2), $$0x -> $$0x.bD() && $$0x.fO())) {
               if ($$4.l($$1) && !$$4.fP() && $$4.gC()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dhk.a(cud.uJ, $$2);
      dhk.a(cud.uG, $$2);
      dhk.a(cud.uH, $$2);
      dhk.a(cud.uI, $$2);
      dhk.a(cud.hE, $$2);
      dhk.a(cud.hF, $$2);
      dhk.a(cud.hN, $$2);
      dhk.a(cud.hP, $$2);
      dhk.a(cud.hQ, $$2);
      dhk.a(cud.hT, $$2);
      dhk.a(cud.hL, $$2);
      dhk.a(cud.hR, $$2);
      dhk.a(cud.hH, $$2);
      dhk.a(cud.hM, $$2);
      dhk.a(cud.hJ, $$2);
      dhk.a(cud.hG, $$2);
      dhk.a(cud.hK, $$2);
      dhk.a(cud.hO, $$2);
      dhk.a(cud.hS, $$2);
      dhk.a(cud.hI, $$2);
      dhk.a(cud.eN, new kv() {
         @Override
         public cua a(kr $$0, cua $$1) {
            ja $$2 = $$0.c().a($$0.d().c(dhk.b));

            for (cgr $$4 : $$0.b().a(cgr.class, new evu($$2), $$0x -> $$0x.bD() && !$$0x.u())) {
               if ($$4.gC() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dhk.a(cud.nU, new ks(coe.b.a));
      dhk.a(cud.nW, new ks(coe.b.b));
      dhk.a(cud.nY, new ks(coe.b.c));
      dhk.a(cud.oa, new ks(coe.b.d));
      dhk.a(cud.og, new ks(coe.b.g));
      dhk.a(cud.oc, new ks(coe.b.e));
      dhk.a(cud.oe, new ks(coe.b.f));
      dhk.a(cud.oi, new ks(coe.b.h));
      dhk.a(cud.ok, new ks(coe.b.i));
      dhk.a(cud.nV, new ks(coe.b.a, true));
      dhk.a(cud.nX, new ks(coe.b.b, true));
      dhk.a(cud.nZ, new ks(coe.b.c, true));
      dhk.a(cud.ob, new ks(coe.b.d, true));
      dhk.a(cud.oh, new ks(coe.b.g, true));
      dhk.a(cud.od, new ks(coe.b.e, true));
      dhk.a(cud.of, new ks(coe.b.f, true));
      dhk.a(cud.oj, new ks(coe.b.h, true));
      dhk.a(cud.ol, new ks(coe.b.i, true));
      ku $$3 = new kt() {
         private final kt c = new kt();

         @Override
         public cua a(kr $$0, cua $$1) {
            csr $$2 = (csr)$$1.g();
            ja $$3 = $$0.c().a($$0.d().c(dhk.b));
            dcd $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cua(cud.qy);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dhk.a(cud.qA, $$3);
      dhk.a(cud.qz, $$3);
      dhk.a(cud.qB, $$3);
      dhk.a(cud.qG, $$3);
      dhk.a(cud.qH, $$3);
      dhk.a(cud.qF, $$3);
      dhk.a(cud.qI, $$3);
      dhk.a(cud.qJ, $$3);
      dhk.a(cud.qK, $$3);
      dhk.a(cud.qy, new kt() {
         private final kt c = new kt();

         @Override
         public cua a(kr $$0, cua $$1) {
            dce $$2 = $$0.b();
            ja $$3 = $$0.c().a($$0.d().c(dhk.b));
            dsh $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dfm $$6) {
               cua $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.e()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dxa.y, $$3);
                  ctv $$8 = $$7.g();
                  $$1.h(1);
                  if ($$1.e()) {
                     return new cua($$8);
                  } else {
                     if ($$0.e().b(new cua($$8)) < 0) {
                        this.c.dispense($$0, new cua($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dhk.a(cud.os, new kv() {
         @Override
         protected cua a(kr $$0, cua $$1) {
            aqk $$2 = $$0.b();
            this.a(true);
            jf $$3 = $$0.d().c(dhk.b);
            ja $$4 = $$0.c().a($$3);
            dsh $$5 = $$2.a_($$4);
            if (des.a($$2, $$4, $$3)) {
               $$2.b($$4, des.a($$2, $$4));
               $$2.a(null, dxa.i, $$4);
            } else if (dft.h($$5) || dfu.g($$5) || dfv.g($$5)) {
               $$2.b($$4, $$5.a(dsx.r, Boolean.valueOf(true)));
               $$2.a(null, dxa.c, $$4);
            } else if ($$5.b() instanceof dno) {
               dno.a($$2, $$4);
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
      dhk.a(cud.ry, new kv() {
         @Override
         protected cua a(kr $$0, cua $$1) {
            this.a(true);
            dcd $$2 = $$0.b();
            ja $$3 = $$0.c().a($$0.d().c(dhk.b));
            if (!csa.a($$1, $$2, $$3) && !csa.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dhk.a(dfh.ck, new kt() {
         @Override
         protected cua a(kr $$0, cua $$1) {
            dcd $$2 = $$0.b();
            ja $$3 = $$0.c().a($$0.d().c(dhk.b));
            cis $$4 = new cis($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.du(), $$4.dw(), $$4.dA(), avf.zy, avg.e, 1.0F, 1.0F);
            $$2.a(null, dxa.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      ku $$4 = new kv() {
         @Override
         protected cua a(kr $$0, cua $$1) {
            this.a(crp.a($$0, $$1));
            return $$1;
         }
      };
      dhk.a(cud.up, $$4);
      dhk.a(cud.uo, $$4);
      dhk.a(cud.uq, $$4);
      dhk.a(cud.ul, $$4);
      dhk.a(cud.ur, $$4);
      dhk.a(cud.un, $$4);
      dhk.a(cud.um, new kv() {
         @Override
         protected cua a(kr $$0, cua $$1) {
            dcd $$2 = $$0.b();
            jf $$3 = $$0.d().c(dhk.b);
            ja $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && doy.b($$2, $$4, $$1)) {
               $$2.a($$4, dfh.gG.o().a(dmh.e, Integer.valueOf(dtn.a($$3))), 3);
               $$2.a(null, dxa.i, $$4);
               dpn $$5 = $$2.c_($$4);
               if ($$5 instanceof dqz) {
                  doy.a($$2, $$4, (dqz)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(crp.a($$0, $$1));
            }

            return $$1;
         }
      });
      dhk.a(dfh.ee, new kv() {
         @Override
         protected cua a(kr $$0, cua $$1) {
            dcd $$2 = $$0.b();
            ja $$3 = $$0.c().a($$0.d().c(dhk.b));
            dfz $$4 = (dfz)dfh.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dxa.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(crp.a($$0, $$1));
            }

            return $$1;
         }
      });
      dhk.a(dfh.kP.r(), new ky());

      for (cst $$5 : cst.values()) {
         dhk.a(dme.a($$5).r(), new ky());
      }

      dhk.a(cud.sl.r(), new kv() {
         private final kt c = new kt();

         private cua a(kr $$0, cua $$1, cua $$2) {
            $$1.h(1);
            if ($$1.e()) {
               $$0.b().a(null, dxa.y, $$0.c());
               return $$2.s();
            } else {
               if ($$0.e().b($$2.s()) < 0) {
                  this.c.dispense($$0, $$2.s());
               }

               return $$1;
            }
         }

         @Override
         public cua a(kr $$0, cua $$1) {
            this.a(false);
            aqk $$2 = $$0.b();
            ja $$3 = $$0.c().a($$0.d().c(dhk.b));
            dsh $$4 = $$2.a_($$3);
            if ($$4.a(avu.aG, $$0x -> $$0x.b(dez.c) && $$0x.b() instanceof dez) && $$4.c(dez.c) >= 5) {
               ((dez)$$4.b()).a($$2, $$4, $$3, null, dpk.b.b);
               this.a(true);
               return this.a($$0, $$1, new cua(cud.wC));
            } else if ($$2.b_($$3).a(awa.a)) {
               this.a(true);
               return this.a($$0, $$1, cwb.a(cud.sk, cwc.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dhk.a(cud.fu, new kv() {
         @Override
         public cua a(kr $$0, cua $$1) {
            jf $$2 = $$0.d().c(dhk.b);
            ja $$3 = $$0.c().a($$2);
            dcd $$4 = $$0.b();
            dsh $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dfh.pl)) {
               if ($$5.c(dln.d) != 4) {
                  dln.a(null, $$4, $$3, $$5);
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
      dhk.a(cud.rV.r(), new kx());
      dhk.a(cud.xu.r(), new kv() {
         @Override
         protected cua a(kr $$0, cua $$1) {
            aqk $$2 = $$0.b();
            ja $$3 = $$0.c().a($$0.d().c(dhk.b));
            List<cfx> $$4 = $$2.a(cfx.class, new evu($$3), bsi.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cfx $$5 : $$4) {
                  if ($$5.gx()) {
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
      dhk.a(cud.wz, new kv() {
         @Override
         public cua a(kr $$0, cua $$1) {
            ja $$2 = $$0.c().a($$0.d().c(dhk.b));
            dcd $$3 = $$0.b();
            dsh $$4 = $$3.a_($$2);
            Optional<dsh> $$5 = ctq.a($$4);
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
      dhk.a(cud.sk, new kt() {
         private final kt c = new kt();

         @Override
         public cua a(kr $$0, cua $$1) {
            cwb $$2 = $$1.a(kn.G, cwb.a);
            if (!$$2.a(cwc.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               aqk $$3 = $$0.b();
               ja $$4 = $$0.c();
               ja $$5 = $$0.c().a($$0.d().c(dhk.b));
               if (!$$3.a_($$5).a(avu.ci)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lj.am, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, avf.cB, avg.e, 1.0F, 1.0F);
                  $$3.a(null, dxa.z, $$4);
                  $$3.b($$5, dfh.sI.o());
                  return new cua(cud.sl);
               }
            }
         }
      });
   }
}
