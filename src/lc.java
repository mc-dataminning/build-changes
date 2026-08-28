import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lc {
   Logger a = LogUtils.getLogger();
   lc b = ($$0, $$1) -> $$1;

   cwn dispense(kz var1, cwn var2);

   static void a() {
      dlq.a(cwr.pb);
      dlq.a(cwr.wq);
      dlq.a(cwr.wp);
      dlq.a(cwr.ry);
      dlq.a(cwr.rj);
      dlq.a(cwr.uU);
      dlq.a(cwr.wo);
      dlq.a(cwr.wr);
      dlq.a(cwr.vt);
      dlq.a(cwr.uV);
      dlq.a(cwr.uW);
      lb $$0 = new lb() {
         @Override
         public cwn a(kz $$0, cwn $$1) {
            jn $$2 = $$0.d().c(dlq.b);
            buq<?> $$3 = ((cxw)$$1.h()).g($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bup.o, $$2 != jn.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cwn.j;
            }

            $$1.h(1);
            $$0.b().a(null, ebr.t, $$0.c());
            return $$1;
         }
      };

      for (cxw $$1 : cxw.b()) {
         dlq.a($$1, $$0);
      }

      dlq.a(cwr.vF, new lb() {
         @Override
         public cwn a(kz $$0, cwn $$1) {
            jn $$2 = $$0.d().c(dlq.b);
            ji $$3 = $$0.c().a($$2);
            arc $$4 = $$0.b();
            Consumer<ckp> $$5 = buq.a($$1x -> $$1x.v($$2.p()), $$4, $$1, null);
            ckp $$6 = buq.f.a($$4, $$5, $$3, bup.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dlq.a(cwr.on, new lf() {
         @Override
         public cwn a(kz $$0, cwn $$1) {
            ji $$2 = $$0.c().a($$0.d().c(dlq.b));
            List<bvf> $$3 = $$0.b().a(bvf.class, new fat($$2), $$0x -> !($$0x instanceof bvv $$1x) ? false : !$$1x.j() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bvv)$$3.get(0)).a($$1.a(1), awa.e);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dlq.a(cwr.fb, new lf() {
         @Override
         public cwn a(kz $$0, cwn $$1) {
            ji $$2 = $$0.c().a($$0.d().c(dlq.b));

            for (ciz $$4 : $$0.b().a(ciz.class, new fat($$2), $$0x -> $$0x.bL() && !$$0x.t())) {
               if ($$4.gG() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dlq.a(cwr.ox, new la(buq.aG));
      dlq.a(cwr.oz, new la(buq.bo));
      dlq.a(cwr.oB, new la(buq.m));
      dlq.a(cwr.oD, new la(buq.at));
      dlq.a(cwr.oJ, new la(buq.F));
      dlq.a(cwr.oF, new la(buq.a));
      dlq.a(cwr.oH, new la(buq.w));
      dlq.a(cwr.oN, new la(buq.aA));
      dlq.a(cwr.oL, new la(buq.aL));
      dlq.a(cwr.oP, new la(buq.j));
      dlq.a(cwr.oy, new la(buq.aH));
      dlq.a(cwr.oA, new la(buq.bp));
      dlq.a(cwr.oC, new la(buq.n));
      dlq.a(cwr.oE, new la(buq.au));
      dlq.a(cwr.oK, new la(buq.G));
      dlq.a(cwr.oG, new la(buq.b));
      dlq.a(cwr.oI, new la(buq.x));
      dlq.a(cwr.oO, new la(buq.aB));
      dlq.a(cwr.oM, new la(buq.aM));
      dlq.a(cwr.oQ, new la(buq.i));
      lc $$2 = new lb() {
         private final lb c = new lb();

         @Override
         public cwn a(kz $$0, cwn $$1) {
            cvi $$2 = (cvi)$$1.h();
            ji $$3 = $$0.c().a($$0.d().c(dlq.b));
            dgg $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cwn(cwr.rf));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dlq.a(cwr.rh, $$2);
      dlq.a(cwr.rg, $$2);
      dlq.a(cwr.ri, $$2);
      dlq.a(cwr.rn, $$2);
      dlq.a(cwr.ro, $$2);
      dlq.a(cwr.rm, $$2);
      dlq.a(cwr.rp, $$2);
      dlq.a(cwr.rq, $$2);
      dlq.a(cwr.rr, $$2);
      dlq.a(cwr.rf, new lb() {
         @Override
         public cwn a(kz $$0, cwn $$1) {
            dgh $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dlq.b));
            dwv $$4 = $$2.a_($$3);
            if ($$4.b() instanceof djs $$6) {
               cwn $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, ebr.y, $$3);
                  cwj $$8 = $$7.h();
                  return this.a($$0, $$1, new cwn($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dlq.a(cwr.oX, new lf() {
         @Override
         protected cwn a(kz $$0, cwn $$1) {
            arc $$2 = $$0.b();
            this.a(true);
            jn $$3 = $$0.d().c(dlq.b);
            ji $$4 = $$0.c().a($$3);
            dwv $$5 = $$2.a_($$4);
            if (dix.a($$2, $$4, $$3)) {
               $$2.b($$4, dix.a($$2, $$4));
               $$2.a(null, ebr.i, $$4);
            } else if (djz.i($$5) || dka.h($$5) || dkb.h($$5)) {
               $$2.b($$4, $$5.b(dxl.v, Boolean.valueOf(true)));
               $$2.a(null, ebr.c, $$4);
            } else if ($$5.b() instanceof dry) {
               dry.a($$2, $$4);
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
      dlq.a(cwr.sv, new lf() {
         @Override
         protected cwn a(kz $$0, cwn $$1) {
            this.a(true);
            dgg $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dlq.b));
            if (!cuv.a($$1, $$2, $$3) && !cuv.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dlq.a(djm.cr, new lb() {
         @Override
         protected cwn a(kz $$0, cwn $$1) {
            dgg $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dlq.b));
            clb $$4 = new clb($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dB(), $$4.dD(), $$4.dH(), avz.Am, awa.e, 1.0F, 1.0F);
            $$2.a(null, ebr.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dlq.a(cwr.vl, new lf() {
         @Override
         protected cwn a(kz $$0, cwn $$1) {
            dgg $$2 = $$0.b();
            jn $$3 = $$0.d().c(dlq.b);
            ji $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dti.b($$2, $$4, $$1)) {
               $$2.a($$4, djm.hd.m().b(dqr.e, Integer.valueOf(dya.a($$3))), 3);
               $$2.a(null, ebr.i, $$4);
               dtx $$5 = $$2.c_($$4);
               if ($$5 instanceof dvm) {
                  dti.a($$2, $$4, (dvm)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ld.b($$0, $$1));
            }

            return $$1;
         }
      });
      dlq.a(djm.er, new lf() {
         @Override
         protected cwn a(kz $$0, cwn $$1) {
            dgg $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dlq.b));
            dkf $$4 = (dkf)djm.er;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, ebr.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ld.b($$0, $$1));
            }

            return $$1;
         }
      });
      dlq.a(djm.lr.j(), new li());

      for (cvk $$3 : cvk.values()) {
         dlq.a(dqo.a($$3).j(), new li());
      }

      dlq.a(cwr.th.j(), new lf() {
         private cwn b(kz $$0, cwn $$1, cwn $$2) {
            $$0.b().a(null, ebr.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cwn a(kz $$0, cwn $$1) {
            this.a(false);
            arc $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dlq.b));
            dwv $$4 = $$2.a_($$3);
            if ($$4.a(awo.aJ, $$0x -> $$0x.b(dje.c) && $$0x.b() instanceof dje) && $$4.c(dje.c) >= 5) {
               ((dje)$$4.b()).a($$2, $$4, $$3, null, dtu.b.b);
               this.a(true);
               return this.b($$0, $$1, new cwn(cwr.xD));
            } else if ($$2.b_($$3).a(awu.a)) {
               this.a(true);
               return this.b($$0, $$1, cym.a(cwr.ti, cyn.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dlq.a(cwr.fJ, new lf() {
         @Override
         public cwn a(kz $$0, cwn $$1) {
            jn $$2 = $$0.d().c(dlq.b);
            ji $$3 = $$0.c().a($$2);
            dgg $$4 = $$0.b();
            dwv $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(djm.pN)) {
               if ($$5.c(dpx.d) != 4) {
                  dpx.a(null, $$4, $$3, $$5);
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
      dlq.a(cwr.sS.j(), new lh());
      dlq.a(cwr.yv.j(), new lf() {
         @Override
         protected cwn a(kz $$0, cwn $$1) {
            arc $$2 = $$0.b();
            ji $$3 = $$0.c().a($$0.d().c(dlq.b));
            List<cif> $$4 = $$2.a(cif.class, new fat($$3), buo.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cif $$5 : $$4) {
                  if ($$5.gt()) {
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
      dlq.a(cwr.xA, new lf() {
         @Override
         public cwn a(kz $$0, cwn $$1) {
            ji $$2 = $$0.c().a($$0.d().c(dlq.b));
            dgg $$3 = $$0.b();
            dwv $$4 = $$3.a_($$2);
            Optional<dwv> $$5 = cwe.a($$4);
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
      dlq.a(cwr.ti, new lb() {
         private final lb c = new lb();

         @Override
         public cwn a(kz $$0, cwn $$1) {
            cym $$2 = $$1.a(kv.Q, cym.a);
            if (!$$2.a(cyn.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arc $$3 = $$0.b();
               ji $$4 = $$0.c();
               ji $$5 = $$0.c().a($$0.d().c(dlq.b));
               if (!$$3.a_($$5).a(awo.cl)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lt.ao, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, avz.cB, awa.e, 1.0F, 1.0F);
                  $$3.a(null, ebr.z, $$4);
                  $$3.b($$5, djm.tk.m());
                  return this.a($$0, $$1, new cwn(cwr.th));
               }
            }
         }
      });
      dlq.a(cwr.oo, new le(buq.aD));
      dlq.a(cwr.op, new le(buq.y));
      dlq.a(cwr.oq, new le(buq.ac));
      dlq.a(cwr.or, new le(buq.bw));
      dlq.a(cwr.os, new le(buq.ak));
      dlq.a(cwr.vM, new le(buq.B));
   }
}
