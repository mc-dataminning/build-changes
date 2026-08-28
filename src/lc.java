import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lc {
   Logger a = LogUtils.getLogger();
   lc b = ($$0, $$1) -> $$1;

   cxh dispense(kz var1, cxh var2);

   static void a() {
      dmk.a(cxl.pd);
      dmk.a(cxl.ws);
      dmk.a(cxl.wr);
      dmk.a(cxl.rA);
      dmk.a(cxl.rl);
      dmk.a(cxl.uW);
      dmk.a(cxl.wq);
      dmk.a(cxl.wt);
      dmk.a(cxl.vv);
      dmk.a(cxl.uX);
      dmk.a(cxl.uY);
      lb $$0 = new lb() {
         @Override
         public cxh a(kz $$0, cxh $$1) {
            jn $$2 = $$0.d().c(dmk.b);
            bvi<?> $$3 = ((cyp)$$1.h()).a($$0.b().F_(), $$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bvh.o, $$2 != jn.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cxh.k;
            }

            $$1.h(1);
            $$0.b().a(null, ecp.t, $$0.c());
            return $$1;
         }
      };

      for (cyp $$1 : cyp.b()) {
         dmk.a($$1, $$0);
      }

      dmk.a(cxl.vH, new lb() {
         @Override
         public cxh a(kz $$0, cxh $$1) {
            jn $$2 = $$0.d().c(dmk.b);
            ji $$3 = $$0.c().a($$2);
            ard $$4 = $$0.b();
            Consumer<cll> $$5 = bvi.a($$1x -> $$1x.w($$2.p()), $$4, $$1, null);
            cll $$6 = bvi.f.a($$4, $$5, $$3, bvh.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dmk.a(cxl.op, new lf() {
         @Override
         public cxh a(kz $$0, cxh $$1) {
            ji $$2 = $$0.c().a($$0.d().c(dmk.b));
            List<bvy> $$3 = $$0.b().a(bvy.class, new fbs($$2), $$0x -> !($$0x instanceof bwo $$1x) ? false : !$$1x.j() && $$1x.e());
            if (!$$3.isEmpty()) {
               ((bwo)$$3.get(0)).a($$1.a(1), awb.e);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dmk.a(cxl.fd, new lf() {
         @Override
         public cxh a(kz $$0, cxh $$1) {
            ji $$2 = $$0.c().a($$0.d().c(dmk.b));

            for (cjv $$4 : $$0.b().a(cjv.class, new fbs($$2), $$0x -> $$0x.bJ() && !$$0x.t())) {
               if ($$4.gJ() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dmk.a(cxl.oz, new la(bvi.aG));
      dmk.a(cxl.oB, new la(bvi.bo));
      dmk.a(cxl.oD, new la(bvi.m));
      dmk.a(cxl.oF, new la(bvi.at));
      dmk.a(cxl.oL, new la(bvi.F));
      dmk.a(cxl.oH, new la(bvi.a));
      dmk.a(cxl.oJ, new la(bvi.w));
      dmk.a(cxl.oP, new la(bvi.aA));
      dmk.a(cxl.oN, new la(bvi.aL));
      dmk.a(cxl.oR, new la(bvi.j));
      dmk.a(cxl.oA, new la(bvi.aH));
      dmk.a(cxl.oC, new la(bvi.bp));
      dmk.a(cxl.oE, new la(bvi.n));
      dmk.a(cxl.oG, new la(bvi.au));
      dmk.a(cxl.oM, new la(bvi.G));
      dmk.a(cxl.oI, new la(bvi.b));
      dmk.a(cxl.oK, new la(bvi.x));
      dmk.a(cxl.oQ, new la(bvi.aB));
      dmk.a(cxl.oO, new la(bvi.aM));
      dmk.a(cxl.oS, new la(bvi.i));
      lc $$2 = new lb() {
         private final lb c = new lb();

         @Override
         public cxh a(kz $$0, cxh $$1) {
            cwc $$2 = (cwc)$$1.h();
            ji $$3 = $$0.c().a($$0.d().c(dmk.b));
            dgz $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cxh(cxl.rh));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dmk.a(cxl.rj, $$2);
      dmk.a(cxl.ri, $$2);
      dmk.a(cxl.rk, $$2);
      dmk.a(cxl.rp, $$2);
      dmk.a(cxl.rq, $$2);
      dmk.a(cxl.ro, $$2);
      dmk.a(cxl.rr, $$2);
      dmk.a(cxl.rs, $$2);
      dmk.a(cxl.rt, $$2);
      dmk.a(cxl.rh, new lb() {
         @Override
         public cxh a(kz $$0, cxh $$1) {
            dha $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dmk.b));
            dxq $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dkm $$6) {
               cxh $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, ecp.y, $$3);
                  cxd $$8 = $$7.h();
                  return this.a($$0, $$1, new cxh($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dmk.a(cxl.oZ, new lf() {
         @Override
         protected cxh a(kz $$0, cxh $$1) {
            ard $$2 = $$0.b();
            this.a(true);
            jn $$3 = $$0.d().c(dmk.b);
            ji $$4 = $$0.c().a($$3);
            dxq $$5 = $$2.a_($$4);
            if (djr.a($$2, $$4, $$3)) {
               $$2.b($$4, djr.a($$2, $$4));
               $$2.a(null, ecp.i, $$4);
            } else if (dkt.i($$5) || dku.h($$5) || dkv.h($$5)) {
               $$2.b($$4, $$5.b(dyg.u, Boolean.valueOf(true)));
               $$2.a(null, ecp.c, $$4);
            } else if ($$5.b() instanceof dst) {
               dst.a($$2, $$4);
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
      dmk.a(cxl.sx, new lf() {
         @Override
         protected cxh a(kz $$0, cxh $$1) {
            this.a(true);
            dgz $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dmk.b));
            if (!cvq.a($$1, $$2, $$3) && !cvq.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dmk.a(dkg.cr, new lb() {
         @Override
         protected cxh a(kz $$0, cxh $$1) {
            dgz $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dmk.b));
            clx $$4 = new clx($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dz(), $$4.dB(), $$4.dF(), awa.Aw, awb.e, 1.0F, 1.0F);
            $$2.a(null, ecp.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dmk.a(cxl.vn, new lf() {
         @Override
         protected cxh a(kz $$0, cxh $$1) {
            dgz $$2 = $$0.b();
            jn $$3 = $$0.d().c(dmk.b);
            ji $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dud.b($$2, $$4, $$1)) {
               $$2.a($$4, dkg.hd.m().b(drm.e, Integer.valueOf(dyw.a($$3))), 3);
               $$2.a(null, ecp.i, $$4);
               dus $$5 = $$2.c_($$4);
               if ($$5 instanceof dwh) {
                  dud.a($$2, $$4, (dwh)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ld.b($$0, $$1));
            }

            return $$1;
         }
      });
      dmk.a(dkg.er, new lf() {
         @Override
         protected cxh a(kz $$0, cxh $$1) {
            dgz $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dmk.b));
            dkz $$4 = (dkz)dkg.er;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, ecp.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ld.b($$0, $$1));
            }

            return $$1;
         }
      });
      dmk.a(dkg.lr.i(), new li());

      for (cwe $$3 : cwe.values()) {
         dmk.a(drj.a($$3).i(), new li());
      }

      dmk.a(cxl.tj.i(), new lf() {
         private cxh b(kz $$0, cxh $$1, cxh $$2) {
            $$0.b().a(null, ecp.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cxh a(kz $$0, cxh $$1) {
            this.a(false);
            ard $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dmk.b));
            dxq $$4 = $$2.a_($$3);
            if ($$4.a(awp.aJ, $$0x -> $$0x.b(djy.c) && $$0x.b() instanceof djy) && $$4.c(djy.c) >= 5) {
               ((djy)$$4.b()).a($$2, $$4, $$3, null, dup.b.b);
               this.a(true);
               return this.b($$0, $$1, new cxh(cxl.xF));
            } else if ($$2.b_($$3).a(awv.a)) {
               this.a(true);
               return this.b($$0, $$1, cze.a(cxl.tk, czf.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dmk.a(cxl.fL, new lf() {
         @Override
         public cxh a(kz $$0, cxh $$1) {
            jn $$2 = $$0.d().c(dmk.b);
            ji $$3 = $$0.c().a($$2);
            dgz $$4 = $$0.b();
            dxq $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dkg.pN)) {
               if ($$5.c(dqr.d) != 4) {
                  dqr.a(null, $$4, $$3, $$5);
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
      dmk.a(cxl.sU.i(), new lh());
      dmk.a(cxl.yx.i(), new lf() {
         @Override
         protected cxh a(kz $$0, cxh $$1) {
            ard $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dmk.b));
            List<cjb> $$4 = $$2.a(cjb.class, new fbs($$3), bvg.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cjb $$5 : $$4) {
                  if ($$5.gw()) {
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
      dmk.a(cxl.xC, new lf() {
         @Override
         public cxh a(kz $$0, cxh $$1) {
            ji $$2 = $$0.c().a($$0.d().c(dmk.b));
            dgz $$3 = $$0.b();
            dxq $$4 = $$3.a_($$2);
            Optional<dxq> $$5 = cwy.a($$4);
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
      dmk.a(cxl.tk, new lb() {
         private final lb c = new lb();

         @Override
         public cxh a(kz $$0, cxh $$1) {
            cze $$2 = $$1.a(kv.R, cze.a);
            if (!$$2.a(czf.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               ard $$3 = $$0.b();
               ji $$4 = $$0.c();
               ji $$5 = $$0.c().a($$0.d().c(dmk.b));
               if (!$$3.a_($$5).a(awp.cm)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lt.ap, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awa.cB, awb.e, 1.0F, 1.0F);
                  $$3.a(null, ecp.z, $$4);
                  $$3.b($$5, dkg.tm.m());
                  return this.a($$0, $$1, new cxh(cxl.tj));
               }
            }
         }
      });
      dmk.a(cxl.oq, new le(bvi.aD));
      dmk.a(cxl.or, new le(bvi.y));
      dmk.a(cxl.os, new le(bvi.ac));
      dmk.a(cxl.ot, new le(bvi.bw));
      dmk.a(cxl.ou, new le(bvi.ak));
      dmk.a(cxl.vO, new le(bvi.B));
   }
}
