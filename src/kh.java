import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface kh {
   Logger a = LogUtils.getLogger();
   kh b = ($$0, $$1) -> $$1;

   csd dispense(ke var1, csd var2);

   static void c() {
      dfa.a(csg.ov, new kd() {
         @Override
         protected cld a(czu $$0, jf $$1, csd $$2) {
            ckt $$3 = new ckt($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = ckr.a.b;
            return $$3;
         }
      });
      dfa.a(csg.vq, new kd() {
         @Override
         protected cld a(czu $$0, jf $$1, csd $$2) {
            ckt $$3 = new ckt($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = ckr.a.b;
            return $$3;
         }
      });
      dfa.a(csg.vp, new kd() {
         @Override
         protected cld a(czu $$0, jf $$1, csd $$2) {
            ckr $$3 = new clj($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = ckr.a.b;
            return $$3;
         }
      });
      dfa.a(csg.qR, new kd() {
         @Override
         protected cld a(czu $$0, jf $$1, csd $$2) {
            return ac.a(new clm($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      dfa.a(csg.qC, new kd() {
         @Override
         protected cld a(czu $$0, jf $$1, csd $$2) {
            return ac.a(new cli($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      dfa.a(csg.tW, new kd() {
         @Override
         protected cld a(czu $$0, jf $$1, csd $$2) {
            return ac.a(new clo($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }

         @Override
         protected float a() {
            return super.a() * 0.5F;
         }

         @Override
         protected float b() {
            return super.b() * 1.25F;
         }
      });
      dfa.a(csg.vo, new kh() {
         @Override
         public csd dispense(ke $$0, csd $$1) {
            return (new kd() {
               @Override
               protected cld a(czu $$0, jf $$1, csd $$2) {
                  return ac.a(new clp($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
               }

               @Override
               protected float a() {
                  return super.a() * 0.5F;
               }

               @Override
               protected float b() {
                  return super.b() * 1.25F;
               }
            }).dispense($$0, $$1);
         }
      });
      dfa.a(csg.vr, new kh() {
         @Override
         public csd dispense(ke $$0, csd $$1) {
            return (new kd() {
               @Override
               protected cld a(czu $$0, jf $$1, csd $$2) {
                  return ac.a(new clp($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
               }

               @Override
               protected float a() {
                  return super.a() * 0.5F;
               }

               @Override
               protected float b() {
                  return super.b() * 1.25F;
               }
            }).dispense($$0, $$1);
         }
      });
      kg $$0 = new kg() {
         @Override
         public csd a(ke $$0, csd $$1) {
            ir $$2 = $$0.d().c(dfa.b);
            bqr<?> $$3 = ((cti)$$1.f()).j($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bri.o, $$2 != ir.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return csd.i;
            }

            $$1.g(1);
            $$0.b().a(null, dur.t, $$0.c());
            return $$1;
         }
      };

      for (cti $$1 : cti.h()) {
         dfa.a($$1, $$0);
      }

      dfa.a(csg.uF, new kg() {
         @Override
         public csd a(ke $$0, csd $$1) {
            ir $$2 = $$0.d().c(dfa.b);
            im $$3 = $$0.c().a($$2);
            aqe $$4 = $$0.b();
            Consumer<cgl> $$5 = bqr.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            cgl $$6 = bqr.d.a($$4, $$5, $$3, bri.o, false, false);
            if ($$6 != null) {
               $$1.g(1);
            }

            return $$1;
         }
      });
      dfa.a(csg.nL, new ki() {
         @Override
         public csd a(ke $$0, csd $$1) {
            im $$2 = $$0.c().a($$0.d().c(dfa.b));
            List<bre> $$3 = $$0.b().a(bre.class, new eta($$2), $$0x -> !($$0x instanceof brt $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((brt)$$3.get(0)).a(ava.e);
               $$1.g(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      kg $$2 = new ki() {
         @Override
         protected csd a(ke $$0, csd $$1) {
            im $$2 = $$0.c().a($$0.d().c(dfa.b));

            for (cex $$4 : $$0.b().a(cex.class, new eta($$2), $$0x -> $$0x.bB() && $$0x.fR())) {
               if ($$4.l($$1) && !$$4.fS() && $$4.gE()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dfa.a(csg.uJ, $$2);
      dfa.a(csg.uG, $$2);
      dfa.a(csg.uH, $$2);
      dfa.a(csg.uI, $$2);
      dfa.a(csg.hE, $$2);
      dfa.a(csg.hF, $$2);
      dfa.a(csg.hN, $$2);
      dfa.a(csg.hP, $$2);
      dfa.a(csg.hQ, $$2);
      dfa.a(csg.hT, $$2);
      dfa.a(csg.hL, $$2);
      dfa.a(csg.hR, $$2);
      dfa.a(csg.hH, $$2);
      dfa.a(csg.hM, $$2);
      dfa.a(csg.hJ, $$2);
      dfa.a(csg.hG, $$2);
      dfa.a(csg.hK, $$2);
      dfa.a(csg.hO, $$2);
      dfa.a(csg.hS, $$2);
      dfa.a(csg.hI, $$2);
      dfa.a(csg.eN, new ki() {
         @Override
         public csd a(ke $$0, csd $$1) {
            im $$2 = $$0.c().a($$0.d().c(dfa.b));

            for (cew $$4 : $$0.b().a(cew.class, new eta($$2), $$0x -> $$0x.bB() && !$$0x.u())) {
               if ($$4.gE() && $$4.a_(499).a($$1)) {
                  $$1.g(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dfa.a(csg.uu, new kg() {
         @Override
         public csd a(ke $$0, csd $$1) {
            ir $$2 = $$0.d().c(dfa.b);
            etf $$3 = kh.a($$0, bqr.P, $$2);
            cky $$4 = new cky($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
            $$4.c((double)$$2.j(), (double)$$2.k(), (double)$$2.l(), 0.5F, 1.0F);
            $$0.b().b($$4);
            $$1.g(1);
            return $$1;
         }

         @Override
         protected void a(ke $$0) {
            $$0.b().c(1004, $$0.c(), 0);
         }
      });
      dfa.a(csg.tX, new kg() {
         @Override
         public csd a(ke $$0, csd $$1) {
            ir $$2 = $$0.d().c(dfa.b);
            jf $$3 = dfa.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            czu $$7 = $$0.b();
            ayd $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            clh $$12 = new clh($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.g(1);
            return $$1;
         }

         @Override
         protected void a(ke $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      dfa.a(
         csg.tY,
         new kg() {
            @Override
            public csd a(ke $$0, csd $$1) {
               ir $$2 = $$0.d().c(dfa.b);
               jf $$3 = dfa.a($$0);
               czu $$4 = $$0.b();
               ayd $$5 = $$4.z;
               double $$6 = $$5.a((double)$$2.j(), 0.11485000000000001);
               double $$7 = $$5.a((double)$$2.k(), 0.11485000000000001);
               double $$8 = $$5.a((double)$$2.l(), 0.11485000000000001);
               clv $$9 = new clv(
                  $$4,
                  $$3.a() + (double)((float)$$2.j() * 0.3F),
                  $$3.b() + (double)((float)$$2.k() * 0.3F),
                  $$3.c() + (double)((float)$$2.l() * 0.3F),
                  $$6,
                  $$7,
                  $$8
               );
               $$4.b($$9);
               $$1.g(1);
               return $$1;
            }
         }
      );
      dfa.a(csg.nU, new kf(cmi.b.a));
      dfa.a(csg.nW, new kf(cmi.b.b));
      dfa.a(csg.nY, new kf(cmi.b.c));
      dfa.a(csg.oa, new kf(cmi.b.d));
      dfa.a(csg.og, new kf(cmi.b.g));
      dfa.a(csg.oc, new kf(cmi.b.e));
      dfa.a(csg.oe, new kf(cmi.b.f));
      dfa.a(csg.oi, new kf(cmi.b.h));
      dfa.a(csg.ok, new kf(cmi.b.i));
      dfa.a(csg.nV, new kf(cmi.b.a, true));
      dfa.a(csg.nX, new kf(cmi.b.b, true));
      dfa.a(csg.nZ, new kf(cmi.b.c, true));
      dfa.a(csg.ob, new kf(cmi.b.d, true));
      dfa.a(csg.oh, new kf(cmi.b.g, true));
      dfa.a(csg.od, new kf(cmi.b.e, true));
      dfa.a(csg.of, new kf(cmi.b.f, true));
      dfa.a(csg.oj, new kf(cmi.b.h, true));
      dfa.a(csg.ol, new kf(cmi.b.i, true));
      kh $$3 = new kg() {
         private final kg c = new kg();

         @Override
         public csd a(ke $$0, csd $$1) {
            cqu $$2 = (cqu)$$1.f();
            im $$3 = $$0.c().a($$0.d().c(dfa.b));
            czu $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new csd(csg.qy);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dfa.a(csg.qA, $$3);
      dfa.a(csg.qz, $$3);
      dfa.a(csg.qB, $$3);
      dfa.a(csg.qG, $$3);
      dfa.a(csg.qH, $$3);
      dfa.a(csg.qF, $$3);
      dfa.a(csg.qI, $$3);
      dfa.a(csg.qJ, $$3);
      dfa.a(csg.qK, $$3);
      dfa.a(csg.qy, new kg() {
         private final kg c = new kg();

         @Override
         public csd a(ke $$0, csd $$1) {
            czv $$2 = $$0.b();
            im $$3 = $$0.c().a($$0.d().c(dfa.b));
            dpy $$4 = $$2.a_($$3);
            if ($$4.b() instanceof ddc $$6) {
               csd $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.d()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dur.y, $$3);
                  cry $$8 = $$7.f();
                  $$1.g(1);
                  if ($$1.d()) {
                     return new csd($$8);
                  } else {
                     if ($$0.e().a(new csd($$8)) < 0) {
                        this.c.dispense($$0, new csd($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dfa.a(csg.os, new ki() {
         @Override
         protected csd a(ke $$0, csd $$1) {
            czu $$2 = $$0.b();
            this.a(true);
            ir $$3 = $$0.d().c(dfa.b);
            im $$4 = $$0.c().a($$3);
            dpy $$5 = $$2.a_($$4);
            if (dci.a($$2, $$4, $$3)) {
               $$2.b($$4, dci.a($$2, $$4));
               $$2.a(null, dur.i, $$4);
            } else if (ddj.h($$5) || ddk.g($$5) || ddl.g($$5)) {
               $$2.b($$4, $$5.a(dqo.r, Boolean.valueOf(true)));
               $$2.a(null, dur.c, $$4);
            } else if ($$5.b() instanceof dle) {
               dle.a($$2, $$4);
               $$2.a($$4, false);
            } else {
               this.a(false);
            }

            if (this.a()) {
               $$1.a(1, $$2.E_(), null, () -> $$1.e(0));
            }

            return $$1;
         }
      });
      dfa.a(csg.ry, new ki() {
         @Override
         protected csd a(ke $$0, csd $$1) {
            this.a(true);
            czu $$2 = $$0.b();
            im $$3 = $$0.c().a($$0.d().c(dfa.b));
            if (!cqd.a($$1, $$2, $$3) && !cqd.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dfa.a(dcx.ck, new kg() {
         @Override
         protected csd a(ke $$0, csd $$1) {
            czu $$2 = $$0.b();
            im $$3 = $$0.c().a($$0.d().c(dfa.b));
            cgw $$4 = new cgw($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.ds(), $$4.du(), $$4.dy(), auz.zj, ava.e, 1.0F, 1.0F);
            $$2.a(null, dur.t, $$3);
            $$1.g(1);
            return $$1;
         }
      });
      kh $$4 = new ki() {
         @Override
         protected csd a(ke $$0, csd $$1) {
            this.a(cps.a($$0, $$1));
            return $$1;
         }
      };
      dfa.a(csg.up, $$4);
      dfa.a(csg.uo, $$4);
      dfa.a(csg.uq, $$4);
      dfa.a(csg.ul, $$4);
      dfa.a(csg.ur, $$4);
      dfa.a(csg.un, $$4);
      dfa.a(csg.um, new ki() {
         @Override
         protected csd a(ke $$0, csd $$1) {
            czu $$2 = $$0.b();
            ir $$3 = $$0.d().c(dfa.b);
            im $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dmo.b($$2, $$4, $$1)) {
               $$2.a($$4, dcx.gG.n().a(djx.e, Integer.valueOf(dre.a($$3))), 3);
               $$2.a(null, dur.i, $$4);
               dnd $$5 = $$2.c_($$4);
               if ($$5 instanceof dop) {
                  dmo.a($$2, $$4, (dop)$$5);
               }

               $$1.g(1);
               this.a(true);
            } else {
               this.a(cps.a($$0, $$1));
            }

            return $$1;
         }
      });
      dfa.a(dcx.ee, new ki() {
         @Override
         protected csd a(ke $$0, csd $$1) {
            czu $$2 = $$0.b();
            im $$3 = $$0.c().a($$0.d().c(dfa.b));
            ddp $$4 = (ddp)dcx.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.n(), 3);
                  $$2.a(null, dur.i, $$3);
               }

               $$1.g(1);
               this.a(true);
            } else {
               this.a(cps.a($$0, $$1));
            }

            return $$1;
         }
      });
      dfa.a(dcx.kP.p(), new kk());

      for (cqw $$5 : cqw.values()) {
         dfa.a(dju.a($$5).p(), new kk());
      }

      dfa.a(csg.sl.p(), new ki() {
         private final kg c = new kg();

         private csd a(ke $$0, csd $$1, csd $$2) {
            $$1.g(1);
            if ($$1.d()) {
               $$0.b().a(null, dur.y, $$0.c());
               return $$2.r();
            } else {
               if ($$0.e().a($$2.r()) < 0) {
                  this.c.dispense($$0, $$2.r());
               }

               return $$1;
            }
         }

         @Override
         public csd a(ke $$0, csd $$1) {
            this.a(false);
            aqe $$2 = $$0.b();
            im $$3 = $$0.c().a($$0.d().c(dfa.b));
            dpy $$4 = $$2.a_($$3);
            if ($$4.a(avo.aG, $$0x -> $$0x.b(dcp.c) && $$0x.b() instanceof dcp) && $$4.c(dcp.c) >= 5) {
               ((dcp)$$4.b()).a($$2, $$4, $$3, null, dna.b.b);
               this.a(true);
               return this.a($$0, $$1, new csd(csg.wz));
            } else if ($$2.b_($$3).a(avt.a)) {
               this.a(true);
               return this.a($$0, $$1, cuc.a(csg.sk, cud.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dfa.a(csg.fu, new ki() {
         @Override
         public csd a(ke $$0, csd $$1) {
            ir $$2 = $$0.d().c(dfa.b);
            im $$3 = $$0.c().a($$2);
            czu $$4 = $$0.b();
            dpy $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dcx.pl)) {
               if ($$5.c(djd.d) != 4) {
                  djd.a(null, $$4, $$3, $$5);
                  $$1.g(1);
               } else {
                  this.a(false);
               }

               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dfa.a(csg.rV.p(), new kj());
      dfa.a(csg.xr.p(), new ki() {
         @Override
         protected csd a(ke $$0, csd $$1) {
            aqe $$2 = $$0.b();
            im $$3 = $$0.c().a($$0.d().c(dfa.b));
            List<cec> $$4 = $$2.a(cec.class, new eta($$3), bqq.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cec $$5 : $$4) {
                  if ($$5.gz()) {
                     $$1.a(16, $$2.E_(), null, () -> {
                        $$1.g(1);
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
      dfa.a(csg.ww, new ki() {
         @Override
         public csd a(ke $$0, csd $$1) {
            im $$2 = $$0.c().a($$0.d().c(dfa.b));
            czu $$3 = $$0.b();
            dpy $$4 = $$3.a_($$2);
            Optional<dpy> $$5 = crt.b($$4);
            if ($$5.isPresent()) {
               $$3.b($$2, $$5.get());
               $$3.c(3003, $$2, 0);
               $$1.g(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dfa.a(csg.sk, new kg() {
         private final kg c = new kg();

         @Override
         public csd a(ke $$0, csd $$1) {
            cuc $$2 = $$1.a(jz.x, cuc.a);
            if (!$$2.a(cud.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               aqe $$3 = $$0.b();
               im $$4 = $$0.c();
               im $$5 = $$0.c().a($$0.d().c(dfa.b));
               if (!$$3.a_($$5).a(avo.cc)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(kw.aj, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, auz.cB, ava.e, 1.0F, 1.0F);
                  $$3.a(null, dur.z, $$4);
                  $$3.b($$5, dcx.sI.n());
                  return new csd(csg.sl);
               }
            }
         }
      });
   }

   static etf a(ke $$0, bqr<?> $$1, ir $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
