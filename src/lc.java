import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lc {
   Logger a = LogUtils.getLogger();
   lc b = ($$0, $$1) -> $$1;

   cwo dispense(kz var1, cwo var2);

   static void a() {
      dlr.a(cws.pb);
      dlr.a(cws.wq);
      dlr.a(cws.wp);
      dlr.a(cws.ry);
      dlr.a(cws.rj);
      dlr.a(cws.uU);
      dlr.a(cws.wo);
      dlr.a(cws.wr);
      dlr.a(cws.vt);
      dlr.a(cws.uV);
      dlr.a(cws.uW);
      lb $$0 = new lb() {
         @Override
         public cwo a(kz $$0, cwo $$1) {
            jn $$2 = $$0.d().c(dlr.b);
            bur<?> $$3 = ((cxx)$$1.h()).a($$0.b().K_(), $$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), buq.o, $$2 != jn.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cwo.j;
            }

            $$1.h(1);
            $$0.b().a(null, ebs.t, $$0.c());
            return $$1;
         }
      };

      for (cxx $$1 : cxx.b()) {
         dlr.a($$1, $$0);
      }

      dlr.a(cws.vF, new lb() {
         @Override
         public cwo a(kz $$0, cwo $$1) {
            jn $$2 = $$0.d().c(dlr.b);
            ji $$3 = $$0.c().a($$2);
            ard $$4 = $$0.b();
            Consumer<ckq> $$5 = bur.a($$1x -> $$1x.v($$2.p()), $$4, $$1, null);
            ckq $$6 = bur.f.a($$4, $$5, $$3, buq.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dlr.a(cws.on, new lf() {
         @Override
         public cwo a(kz $$0, cwo $$1) {
            ji $$2 = $$0.c().a($$0.d().c(dlr.b));
            List<bvg> $$3 = $$0.b().a(bvg.class, new fau($$2), $$0x -> !($$0x instanceof bvw $$1x) ? false : !$$1x.j() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bvw)$$3.get(0)).a($$1.a(1), awb.e);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dlr.a(cws.fb, new lf() {
         @Override
         public cwo a(kz $$0, cwo $$1) {
            ji $$2 = $$0.c().a($$0.d().c(dlr.b));

            for (cja $$4 : $$0.b().a(cja.class, new fau($$2), $$0x -> $$0x.bL() && !$$0x.t())) {
               if ($$4.gJ() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dlr.a(cws.ox, new la(bur.aG));
      dlr.a(cws.oz, new la(bur.bo));
      dlr.a(cws.oB, new la(bur.m));
      dlr.a(cws.oD, new la(bur.at));
      dlr.a(cws.oJ, new la(bur.F));
      dlr.a(cws.oF, new la(bur.a));
      dlr.a(cws.oH, new la(bur.w));
      dlr.a(cws.oN, new la(bur.aA));
      dlr.a(cws.oL, new la(bur.aL));
      dlr.a(cws.oP, new la(bur.j));
      dlr.a(cws.oy, new la(bur.aH));
      dlr.a(cws.oA, new la(bur.bp));
      dlr.a(cws.oC, new la(bur.n));
      dlr.a(cws.oE, new la(bur.au));
      dlr.a(cws.oK, new la(bur.G));
      dlr.a(cws.oG, new la(bur.b));
      dlr.a(cws.oI, new la(bur.x));
      dlr.a(cws.oO, new la(bur.aB));
      dlr.a(cws.oM, new la(bur.aM));
      dlr.a(cws.oQ, new la(bur.i));
      lc $$2 = new lb() {
         private final lb c = new lb();

         @Override
         public cwo a(kz $$0, cwo $$1) {
            cvj $$2 = (cvj)$$1.h();
            ji $$3 = $$0.c().a($$0.d().c(dlr.b));
            dgh $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cwo(cws.rf));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dlr.a(cws.rh, $$2);
      dlr.a(cws.rg, $$2);
      dlr.a(cws.ri, $$2);
      dlr.a(cws.rn, $$2);
      dlr.a(cws.ro, $$2);
      dlr.a(cws.rm, $$2);
      dlr.a(cws.rp, $$2);
      dlr.a(cws.rq, $$2);
      dlr.a(cws.rr, $$2);
      dlr.a(cws.rf, new lb() {
         @Override
         public cwo a(kz $$0, cwo $$1) {
            dgi $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dlr.b));
            dww $$4 = $$2.a_($$3);
            if ($$4.b() instanceof djt $$6) {
               cwo $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, ebs.y, $$3);
                  cwk $$8 = $$7.h();
                  return this.a($$0, $$1, new cwo($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dlr.a(cws.oX, new lf() {
         @Override
         protected cwo a(kz $$0, cwo $$1) {
            ard $$2 = $$0.b();
            this.a(true);
            jn $$3 = $$0.d().c(dlr.b);
            ji $$4 = $$0.c().a($$3);
            dww $$5 = $$2.a_($$4);
            if (diy.a($$2, $$4, $$3)) {
               $$2.b($$4, diy.a($$2, $$4));
               $$2.a(null, ebs.i, $$4);
            } else if (dka.i($$5) || dkb.h($$5) || dkc.h($$5)) {
               $$2.b($$4, $$5.b(dxm.v, Boolean.valueOf(true)));
               $$2.a(null, ebs.c, $$4);
            } else if ($$5.b() instanceof drz) {
               drz.a($$2, $$4);
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
      dlr.a(cws.sv, new lf() {
         @Override
         protected cwo a(kz $$0, cwo $$1) {
            this.a(true);
            dgh $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dlr.b));
            if (!cuw.a($$1, $$2, $$3) && !cuw.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dlr.a(djn.cr, new lb() {
         @Override
         protected cwo a(kz $$0, cwo $$1) {
            dgh $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dlr.b));
            clc $$4 = new clc($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dA(), $$4.dC(), $$4.dG(), awa.Am, awb.e, 1.0F, 1.0F);
            $$2.a(null, ebs.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dlr.a(cws.vl, new lf() {
         @Override
         protected cwo a(kz $$0, cwo $$1) {
            dgh $$2 = $$0.b();
            jn $$3 = $$0.d().c(dlr.b);
            ji $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dtj.b($$2, $$4, $$1)) {
               $$2.a($$4, djn.hd.m().b(dqs.e, Integer.valueOf(dyb.a($$3))), 3);
               $$2.a(null, ebs.i, $$4);
               dty $$5 = $$2.c_($$4);
               if ($$5 instanceof dvn) {
                  dtj.a($$2, $$4, (dvn)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ld.b($$0, $$1));
            }

            return $$1;
         }
      });
      dlr.a(djn.er, new lf() {
         @Override
         protected cwo a(kz $$0, cwo $$1) {
            dgh $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dlr.b));
            dkg $$4 = (dkg)djn.er;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, ebs.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ld.b($$0, $$1));
            }

            return $$1;
         }
      });
      dlr.a(djn.lr.j(), new li());

      for (cvl $$3 : cvl.values()) {
         dlr.a(dqp.a($$3).j(), new li());
      }

      dlr.a(cws.th.j(), new lf() {
         private cwo b(kz $$0, cwo $$1, cwo $$2) {
            $$0.b().a(null, ebs.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cwo a(kz $$0, cwo $$1) {
            this.a(false);
            ard $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dlr.b));
            dww $$4 = $$2.a_($$3);
            if ($$4.a(awp.aJ, $$0x -> $$0x.b(djf.c) && $$0x.b() instanceof djf) && $$4.c(djf.c) >= 5) {
               ((djf)$$4.b()).a($$2, $$4, $$3, null, dtv.b.b);
               this.a(true);
               return this.b($$0, $$1, new cwo(cws.xD));
            } else if ($$2.b_($$3).a(awv.a)) {
               this.a(true);
               return this.b($$0, $$1, cyn.a(cws.ti, cyo.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dlr.a(cws.fJ, new lf() {
         @Override
         public cwo a(kz $$0, cwo $$1) {
            jn $$2 = $$0.d().c(dlr.b);
            ji $$3 = $$0.c().a($$2);
            dgh $$4 = $$0.b();
            dww $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(djn.pN)) {
               if ($$5.c(dpy.d) != 4) {
                  dpy.a(null, $$4, $$3, $$5);
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
      dlr.a(cws.sS.j(), new lh());
      dlr.a(cws.yv.j(), new lf() {
         @Override
         protected cwo a(kz $$0, cwo $$1) {
            ard $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dlr.b));
            List<cig> $$4 = $$2.a(cig.class, new fau($$3), bup.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cig $$5 : $$4) {
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
      dlr.a(cws.xA, new lf() {
         @Override
         public cwo a(kz $$0, cwo $$1) {
            ji $$2 = $$0.c().a($$0.d().c(dlr.b));
            dgh $$3 = $$0.b();
            dww $$4 = $$3.a_($$2);
            Optional<dww> $$5 = cwf.a($$4);
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
      dlr.a(cws.ti, new lb() {
         private final lb c = new lb();

         @Override
         public cwo a(kz $$0, cwo $$1) {
            cyn $$2 = $$1.a(kv.Q, cyn.a);
            if (!$$2.a(cyo.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               ard $$3 = $$0.b();
               ji $$4 = $$0.c();
               ji $$5 = $$0.c().a($$0.d().c(dlr.b));
               if (!$$3.a_($$5).a(awp.cl)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lt.ao, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awa.cB, awb.e, 1.0F, 1.0F);
                  $$3.a(null, ebs.z, $$4);
                  $$3.b($$5, djn.tk.m());
                  return this.a($$0, $$1, new cwo(cws.th));
               }
            }
         }
      });
      dlr.a(cws.oo, new le(bur.aD));
      dlr.a(cws.op, new le(bur.y));
      dlr.a(cws.oq, new le(bur.ac));
      dlr.a(cws.or, new le(bur.bw));
      dlr.a(cws.os, new le(bur.ak));
      dlr.a(cws.vM, new le(bur.B));
   }
}
