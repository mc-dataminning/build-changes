import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lb {
   Logger a = LogUtils.getLogger();
   lb b = ($$0, $$1) -> $$1;

   cxk dispense(ky var1, cxk var2);

   static void a() {
      dml.a(cxo.oS);
      dml.a(cxo.wg);
      dml.a(cxo.wf);
      dml.a(cxo.rp);
      dml.a(cxo.ra);
      dml.a(cxo.uL);
      dml.a(cxo.we);
      dml.a(cxo.wh);
      dml.a(cxo.vk);
      dml.a(cxo.uM);
      dml.a(cxo.uN);
      la $$0 = new la() {
         @Override
         public cxk a(ky $$0, cxk $$1) {
            jm $$2 = $$0.d().c(dml.b);
            bvm<?> $$3 = ((cyt)$$1.h()).g($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bvl.o, $$2 != jm.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cxk.k;
            }

            $$1.h(1);
            $$0.b().a(null, ecj.t, $$0.c());
            return $$1;
         }
      };

      for (cyt $$1 : cyt.b()) {
         dml.a($$1, $$0);
      }

      dml.a(cxo.vv, new la() {
         @Override
         public cxk a(ky $$0, cxk $$1) {
            jm $$2 = $$0.d().c(dml.b);
            jh $$3 = $$0.c().a($$2);
            ash $$4 = $$0.b();
            Consumer<cll> $$5 = bvm.a($$1x -> $$1x.v($$2.p()), $$4, $$1, null);
            cll $$6 = bvm.f.a($$4, $$5, $$3, bvl.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dml.a(cxo.oe, new le() {
         @Override
         public cxk a(ky $$0, cxk $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dml.b));
            List<bwb> $$3 = $$0.b().a(bwb.class, new fbn($$2), $$0x -> !($$0x instanceof bwr $$1x) ? false : !$$1x.j() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bwr)$$3.get(0)).a($$1.a(1), axg.e);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dml.a(cxo.eZ, new le() {
         @Override
         public cxk a(ky $$0, cxk $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dml.b));

            for (cjv $$4 : $$0.b().a(cjv.class, new fbn($$2), $$0x -> $$0x.bL() && !$$0x.t())) {
               if ($$4.gD() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dml.a(cxo.oo, new kz(bvm.aH));
      dml.a(cxo.oq, new kz(bvm.bp));
      dml.a(cxo.os, new kz(bvm.m));
      dml.a(cxo.ou, new kz(bvm.au));
      dml.a(cxo.oA, new kz(bvm.G));
      dml.a(cxo.ow, new kz(bvm.a));
      dml.a(cxo.oy, new kz(bvm.w));
      dml.a(cxo.oE, new kz(bvm.aB));
      dml.a(cxo.oC, new kz(bvm.aM));
      dml.a(cxo.oG, new kz(bvm.j));
      dml.a(cxo.op, new kz(bvm.aI));
      dml.a(cxo.or, new kz(bvm.bq));
      dml.a(cxo.ot, new kz(bvm.n));
      dml.a(cxo.ov, new kz(bvm.av));
      dml.a(cxo.oB, new kz(bvm.H));
      dml.a(cxo.ox, new kz(bvm.b));
      dml.a(cxo.oz, new kz(bvm.x));
      dml.a(cxo.oF, new kz(bvm.aC));
      dml.a(cxo.oD, new kz(bvm.aN));
      dml.a(cxo.oH, new kz(bvm.i));
      lb $$2 = new la() {
         private final la c = new la();

         @Override
         public cxk a(ky $$0, cxk $$1) {
            cwf $$2 = (cwf)$$1.h();
            jh $$3 = $$0.c().a($$0.d().c(dml.b));
            dha $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cxk(cxo.qW));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dml.a(cxo.qY, $$2);
      dml.a(cxo.qX, $$2);
      dml.a(cxo.qZ, $$2);
      dml.a(cxo.re, $$2);
      dml.a(cxo.rf, $$2);
      dml.a(cxo.rd, $$2);
      dml.a(cxo.rg, $$2);
      dml.a(cxo.rh, $$2);
      dml.a(cxo.ri, $$2);
      dml.a(cxo.qW, new la() {
         @Override
         public cxk a(ky $$0, cxk $$1) {
            dhb $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dml.b));
            dxn $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dkm $$6) {
               cxk $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, ecj.y, $$3);
                  cxg $$8 = $$7.h();
                  return this.a($$0, $$1, new cxk($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dml.a(cxo.oO, new le() {
         @Override
         protected cxk a(ky $$0, cxk $$1) {
            ash $$2 = $$0.b();
            this.a(true);
            jm $$3 = $$0.d().c(dml.b);
            jh $$4 = $$0.c().a($$3);
            dxn $$5 = $$2.a_($$4);
            if (djr.a($$2, $$4, $$3)) {
               $$2.b($$4, djr.a($$2, $$4));
               $$2.a(null, ecj.i, $$4);
            } else if (dkt.i($$5) || dku.h($$5) || dkv.h($$5)) {
               $$2.b($$4, $$5.b(dyd.r, Boolean.valueOf(true)));
               $$2.a(null, ecj.c, $$4);
            } else if ($$5.b() instanceof dsq) {
               dsq.a($$2, $$4);
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
      dml.a(cxo.sm, new le() {
         @Override
         protected cxk a(ky $$0, cxk $$1) {
            this.a(true);
            dha $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dml.b));
            if (!cvs.a($$1, $$2, $$3) && !cvs.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dml.a(dkg.cr, new la() {
         @Override
         protected cxk a(ky $$0, cxk $$1) {
            dha $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dml.b));
            clx $$4 = new clx($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dA(), $$4.dC(), $$4.dG(), axf.zW, axg.e, 1.0F, 1.0F);
            $$2.a(null, ecj.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dml.a(cxo.vc, new le() {
         @Override
         protected cxk a(ky $$0, cxk $$1) {
            dha $$2 = $$0.b();
            jm $$3 = $$0.d().c(dml.b);
            jh $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dua.b($$2, $$4, $$1)) {
               $$2.a($$4, dkg.gW.m().b(drj.e, Integer.valueOf(dys.a($$3))), 3);
               $$2.a(null, ecj.i, $$4);
               dup $$5 = $$2.c_($$4);
               if ($$5 instanceof dwe) {
                  dua.a($$2, $$4, (dwe)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lc.b($$0, $$1));
            }

            return $$1;
         }
      });
      dml.a(dkg.er, new le() {
         @Override
         protected cxk a(ky $$0, cxk $$1) {
            dha $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dml.b));
            dkz $$4 = (dkz)dkg.er;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, ecj.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lc.b($$0, $$1));
            }

            return $$1;
         }
      });
      dml.a(dkg.lk.j(), new lh());

      for (cwh $$3 : cwh.values()) {
         dml.a(drg.a($$3).j(), new lh());
      }

      dml.a(cxo.sY.j(), new le() {
         private cxk b(ky $$0, cxk $$1, cxk $$2) {
            $$0.b().a(null, ecj.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cxk a(ky $$0, cxk $$1) {
            this.a(false);
            ash $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dml.b));
            dxn $$4 = $$2.a_($$3);
            if ($$4.a(axu.aJ, $$0x -> $$0x.b(djy.c) && $$0x.b() instanceof djy) && $$4.c(djy.c) >= 5) {
               ((djy)$$4.b()).a($$2, $$4, $$3, null, dum.b.b);
               this.a(true);
               return this.b($$0, $$1, new cxk(cxo.xt));
            } else if ($$2.b_($$3).a(aya.a)) {
               this.a(true);
               return this.b($$0, $$1, czj.a(cxo.sZ, czk.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dml.a(cxo.fH, new le() {
         @Override
         public cxk a(ky $$0, cxk $$1) {
            jm $$2 = $$0.d().c(dml.b);
            jh $$3 = $$0.c().a($$2);
            dha $$4 = $$0.b();
            dxn $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dkg.pG)) {
               if ($$5.c(dqp.d) != 4) {
                  dqp.a(null, $$4, $$3, $$5);
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
      dml.a(cxo.sJ.j(), new lg());
      dml.a(cxo.yl.j(), new le() {
         @Override
         protected cxk a(ky $$0, cxk $$1) {
            ash $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dml.b));
            List<cjb> $$4 = $$2.a(cjb.class, new fbn($$3), bvk.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cjb $$5 : $$4) {
                  if ($$5.gq()) {
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
      dml.a(cxo.xq, new le() {
         @Override
         public cxk a(ky $$0, cxk $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dml.b));
            dha $$3 = $$0.b();
            dxn $$4 = $$3.a_($$2);
            Optional<dxn> $$5 = cxb.a($$4);
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
      dml.a(cxo.sZ, new la() {
         private final la c = new la();

         @Override
         public cxk a(ky $$0, cxk $$1) {
            czj $$2 = $$1.a(ku.Q, czj.a);
            if (!$$2.a(czk.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               ash $$3 = $$0.b();
               jh $$4 = $$0.c();
               jh $$5 = $$0.c().a($$0.d().c(dml.b));
               if (!$$3.a_($$5).a(axu.cl)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(ls.an, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, axf.cB, axg.e, 1.0F, 1.0F);
                  $$3.a(null, ecj.z, $$4);
                  $$3.b($$5, dkg.td.m());
                  return this.a($$0, $$1, new cxk(cxo.sY));
               }
            }
         }
      });
      dml.a(cxo.of, new ld(bvm.aE));
      dml.a(cxo.og, new ld(bvm.y));
      dml.a(cxo.oh, new ld(bvm.ad));
      dml.a(cxo.oi, new ld(bvm.bx));
      dml.a(cxo.oj, new ld(bvm.al));
      dml.a(cxo.vC, new ld(bvm.B));
   }
}
