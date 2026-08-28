import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lb {
   Logger a = LogUtils.getLogger();
   lb b = ($$0, $$1) -> $$1;

   cwm dispense(ky var1, cwm var2);

   static void a() {
      dkv.a(cwq.ox);
      dkv.a(cwq.vI);
      dkv.a(cwq.vH);
      dkv.a(cwq.qS);
      dkv.a(cwq.qD);
      dkv.a(cwq.un);
      dkv.a(cwq.vG);
      dkv.a(cwq.vJ);
      dkv.a(cwq.uM);
      dkv.a(cwq.uo);
      dkv.a(cwq.up);
      la $$0 = new la() {
         @Override
         public cwm a(ky $$0, cwm $$1) {
            jm $$2 = $$0.d().c(dkv.b);
            bus<?> $$3 = ((cxv)$$1.h()).g($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bur.o, $$2 != jm.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cwm.k;
            }

            $$1.h(1);
            $$0.b().a(null, ear.t, $$0.c());
            return $$1;
         }
      };

      for (cxv $$1 : cxv.b()) {
         dkv.a($$1, $$0);
      }

      dkv.a(cwq.uX, new la() {
         @Override
         public cwm a(ky $$0, cwm $$1) {
            jm $$2 = $$0.d().c(dkv.b);
            jh $$3 = $$0.c().a($$2);
            arp $$4 = $$0.b();
            Consumer<ckr> $$5 = bus.a($$1x -> $$1x.v($$2.p()), $$4, $$1, null);
            ckr $$6 = bus.f.a($$4, $$5, $$3, bur.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dkv.a(cwq.nL, new le() {
         @Override
         public cwm a(ky $$0, cwm $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dkv.b));
            List<bvh> $$3 = $$0.b().a(bvh.class, new ezt($$2), $$0x -> !($$0x instanceof bvx $$1x) ? false : !$$1x.j() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bvx)$$3.get(0)).a($$1.a(1), awo.e);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dkv.a(cwq.eN, new le() {
         @Override
         public cwm a(ky $$0, cwm $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dkv.b));

            for (cjb $$4 : $$0.b().a(cjb.class, new ezt($$2), $$0x -> $$0x.bL() && !$$0x.q())) {
               if ($$4.gD() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dkv.a(cwq.nV, new kz(bus.aF));
      dkv.a(cwq.nX, new kz(bus.bl));
      dkv.a(cwq.nZ, new kz(bus.m));
      dkv.a(cwq.ob, new kz(bus.as));
      dkv.a(cwq.oh, new kz(bus.E));
      dkv.a(cwq.od, new kz(bus.a));
      dkv.a(cwq.of, new kz(bus.w));
      dkv.a(cwq.oj, new kz(bus.az));
      dkv.a(cwq.ol, new kz(bus.j));
      dkv.a(cwq.nW, new kz(bus.aG));
      dkv.a(cwq.nY, new kz(bus.bm));
      dkv.a(cwq.oa, new kz(bus.n));
      dkv.a(cwq.oc, new kz(bus.at));
      dkv.a(cwq.oi, new kz(bus.F));
      dkv.a(cwq.oe, new kz(bus.b));
      dkv.a(cwq.og, new kz(bus.x));
      dkv.a(cwq.ok, new kz(bus.aA));
      dkv.a(cwq.om, new kz(bus.i));
      lb $$2 = new la() {
         private final la c = new la();

         @Override
         public cwm a(ky $$0, cwm $$1) {
            cvh $$2 = (cvh)$$1.h();
            jh $$3 = $$0.c().a($$0.d().c(dkv.b));
            dfm $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cwm(cwq.qz));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dkv.a(cwq.qB, $$2);
      dkv.a(cwq.qA, $$2);
      dkv.a(cwq.qC, $$2);
      dkv.a(cwq.qH, $$2);
      dkv.a(cwq.qI, $$2);
      dkv.a(cwq.qG, $$2);
      dkv.a(cwq.qJ, $$2);
      dkv.a(cwq.qK, $$2);
      dkv.a(cwq.qL, $$2);
      dkv.a(cwq.qz, new la() {
         @Override
         public cwm a(ky $$0, cwm $$1) {
            dfn $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dkv.b));
            dvv $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dix $$6) {
               cwm $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, ear.y, $$3);
                  cwi $$8 = $$7.h();
                  return this.a($$0, $$1, new cwm($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dkv.a(cwq.ot, new le() {
         @Override
         protected cwm a(ky $$0, cwm $$1) {
            arp $$2 = $$0.b();
            this.a(true);
            jm $$3 = $$0.d().c(dkv.b);
            jh $$4 = $$0.c().a($$3);
            dvv $$5 = $$2.a_($$4);
            if (did.a($$2, $$4, $$3)) {
               $$2.b($$4, did.a($$2, $$4));
               $$2.a(null, ear.i, $$4);
            } else if (dje.i($$5) || djf.h($$5) || djg.h($$5)) {
               $$2.b($$4, $$5.b(dwl.r, Boolean.valueOf(true)));
               $$2.a(null, ear.c, $$4);
            } else if ($$5.b() instanceof dqz) {
               dqz.a($$2, $$4);
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
      dkv.a(cwq.rP, new le() {
         @Override
         protected cwm a(ky $$0, cwm $$1) {
            this.a(true);
            dfm $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dkv.b));
            if (!cuu.a($$1, $$2, $$3) && !cuu.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dkv.a(dis.ck, new la() {
         @Override
         protected cwm a(ky $$0, cwm $$1) {
            dfm $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dkv.b));
            cld $$4 = new cld($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dA(), $$4.dC(), $$4.dG(), awn.zC, awo.e, 1.0F, 1.0F);
            $$2.a(null, ear.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dkv.a(cwq.uE, new le() {
         @Override
         protected cwm a(ky $$0, cwm $$1) {
            dfm $$2 = $$0.b();
            jm $$3 = $$0.d().c(dkv.b);
            jh $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dsj.b($$2, $$4, $$1)) {
               $$2.a($$4, dis.gG.m().b(dps.e, Integer.valueOf(dxa.a($$3))), 3);
               $$2.a(null, ear.i, $$4);
               dsy $$5 = $$2.c_($$4);
               if ($$5 instanceof dum) {
                  dsj.a($$2, $$4, (dum)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lc.b($$0, $$1));
            }

            return $$1;
         }
      });
      dkv.a(dis.ee, new le() {
         @Override
         protected cwm a(ky $$0, cwm $$1) {
            dfm $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dkv.b));
            djk $$4 = (djk)dis.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, ear.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lc.b($$0, $$1));
            }

            return $$1;
         }
      });
      dkv.a(dis.kP.j(), new lh());

      for (cvj $$3 : cvj.values()) {
         dkv.a(dpp.a($$3).j(), new lh());
      }

      dkv.a(cwq.sB.j(), new le() {
         private cwm b(ky $$0, cwm $$1, cwm $$2) {
            $$0.b().a(null, ear.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cwm a(ky $$0, cwm $$1) {
            this.a(false);
            arp $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dkv.b));
            dvv $$4 = $$2.a_($$3);
            if ($$4.a(axc.aI, $$0x -> $$0x.b(dik.c) && $$0x.b() instanceof dik) && $$4.c(dik.c) >= 5) {
               ((dik)$$4.b()).a($$2, $$4, $$3, null, dsv.b.b);
               this.a(true);
               return this.b($$0, $$1, new cwm(cwq.wV));
            } else if ($$2.b_($$3).a(axi.a)) {
               this.a(true);
               return this.b($$0, $$1, cyl.a(cwq.sC, cym.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dkv.a(cwq.fu, new le() {
         @Override
         public cwm a(ky $$0, cwm $$1) {
            jm $$2 = $$0.d().c(dkv.b);
            jh $$3 = $$0.c().a($$2);
            dfm $$4 = $$0.b();
            dvv $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dis.pl)) {
               if ($$5.c(doy.d) != 4) {
                  doy.a(null, $$4, $$3, $$5);
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
      dkv.a(cwq.sm.j(), new lg());
      dkv.a(cwq.xN.j(), new le() {
         @Override
         protected cwm a(ky $$0, cwm $$1) {
            arp $$2 = $$0.b();
            jh $$3 = $$0.c().a($$0.d().c(dkv.b));
            List<cih> $$4 = $$2.a(cih.class, new ezt($$3), buq.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cih $$5 : $$4) {
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
      dkv.a(cwq.wS, new le() {
         @Override
         public cwm a(ky $$0, cwm $$1) {
            jh $$2 = $$0.c().a($$0.d().c(dkv.b));
            dfm $$3 = $$0.b();
            dvv $$4 = $$3.a_($$2);
            Optional<dvv> $$5 = cwd.a($$4);
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
      dkv.a(cwq.sC, new la() {
         private final la c = new la();

         @Override
         public cwm a(ky $$0, cwm $$1) {
            cyl $$2 = $$1.a(ku.Q, cyl.a);
            if (!$$2.a(cym.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arp $$3 = $$0.b();
               jh $$4 = $$0.c();
               jh $$5 = $$0.c().a($$0.d().c(dkv.b));
               if (!$$3.a_($$5).a(axc.ck)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(ls.am, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awn.cB, awo.e, 1.0F, 1.0F);
                  $$3.a(null, ear.z, $$4);
                  $$3.b($$5, dis.sI.m());
                  return this.a($$0, $$1, new cwm(cwq.sB));
               }
            }
         }
      });
      dkv.a(cwq.nM, new ld(bus.aC));
      dkv.a(cwq.nN, new ld(bus.y));
      dkv.a(cwq.nO, new ld(bus.ab));
      dkv.a(cwq.nP, new ld(bus.bt));
      dkv.a(cwq.nQ, new ld(bus.aj));
      dkv.a(cwq.ve, new ld(bus.B));
   }
}
