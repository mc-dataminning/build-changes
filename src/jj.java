import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface jj {
   Logger a = LogUtils.getLogger();
   jj b = ($$0, $$1) -> $$1;

   cng dispense(jg var1, cng var2);

   static void c() {
      czd.a(cnj.ou, new jf() {
         @Override
         protected cgi a(ctx $$0, ir $$1, cng $$2) {
            cfy $$3 = new cfy($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cfw.a.b;
            return $$3;
         }
      });
      czd.a(cnj.vm, new jf() {
         @Override
         protected cgi a(ctx $$0, ir $$1, cng $$2) {
            cfy $$3 = new cfy($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.a($$2);
            $$3.d = cfw.a.b;
            return $$3;
         }
      });
      czd.a(cnj.vl, new jf() {
         @Override
         protected cgi a(ctx $$0, ir $$1, cng $$2) {
            cfw $$3 = new cgn($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cfw.a.b;
            return $$3;
         }
      });
      czd.a(cnj.qQ, new jf() {
         @Override
         protected cgi a(ctx $$0, ir $$1, cng $$2) {
            return ac.a(new cgq($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      czd.a(cnj.qB, new jf() {
         @Override
         protected cgi a(ctx $$0, ir $$1, cng $$2) {
            return ac.a(new cgm($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      czd.a(cnj.tU, new jf() {
         @Override
         protected cgi a(ctx $$0, ir $$1, cng $$2) {
            return ac.a(new cgs($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      czd.a(cnj.vk, new jj() {
         @Override
         public cng dispense(jg $$0, cng $$1) {
            return (new jf() {
               @Override
               protected cgi a(ctx $$0, ir $$1, cng $$2) {
                  return ac.a(new cgt($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      czd.a(cnj.vn, new jj() {
         @Override
         public cng dispense(jg $$0, cng $$1) {
            return (new jf() {
               @Override
               protected cgi a(ctx $$0, ir $$1, cng $$2) {
                  return ac.a(new cgt($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      ji $$0 = new ji() {
         @Override
         public cng a(jg $$0, cng $$1) {
            ic $$2 = $$0.d().c(czd.b);
            bmc<?> $$3 = ((col)$$1.d()).a($$1.v());

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bms.o, $$2 != ic.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cng.f;
            }

            $$1.h(1);
            $$0.b().a(null, dnz.t, $$0.c());
            return $$1;
         }
      };

      for (col $$1 : col.h()) {
         czd.a($$1, $$0);
      }

      czd.a(cnj.uB, new ji() {
         @Override
         public cng a(jg $$0, cng $$1) {
            ic $$2 = $$0.d().c(czd.b);
            hx $$3 = $$0.c().a($$2);
            ane $$4 = $$0.b();
            Consumer<cbr> $$5 = bmc.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            cbr $$6 = bmc.e.a($$4, $$1.v(), $$5, $$3, bms.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      czd.a(cnj.nK, new jk() {
         @Override
         public cng a(jg $$0, cng $$1) {
            hx $$2 = $$0.c().a($$0.d().c(czd.b));
            List<bmo> $$3 = $$0.b().a(bmo.class, new elx($$2), $$0x -> !($$0x instanceof bne $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((bne)$$3.get(0)).a(aru.e);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      ji $$2 = new jk() {
         @Override
         protected cng a(jg $$0, cng $$1) {
            hx $$2 = $$0.c().a($$0.d().c(czd.b));

            for (cae $$4 : $$0.b().a(cae.class, new elx($$2), $$0x -> $$0x.bx() && $$0x.gO())) {
               if ($$4.l($$1) && !$$4.gP() && $$4.gu()) {
                  $$4.a_(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      czd.a(cnj.uF, $$2);
      czd.a(cnj.uC, $$2);
      czd.a(cnj.uD, $$2);
      czd.a(cnj.uE, $$2);
      czd.a(cnj.hD, $$2);
      czd.a(cnj.hE, $$2);
      czd.a(cnj.hM, $$2);
      czd.a(cnj.hO, $$2);
      czd.a(cnj.hP, $$2);
      czd.a(cnj.hS, $$2);
      czd.a(cnj.hK, $$2);
      czd.a(cnj.hQ, $$2);
      czd.a(cnj.hG, $$2);
      czd.a(cnj.hL, $$2);
      czd.a(cnj.hI, $$2);
      czd.a(cnj.hF, $$2);
      czd.a(cnj.hJ, $$2);
      czd.a(cnj.hN, $$2);
      czd.a(cnj.hR, $$2);
      czd.a(cnj.hH, $$2);
      czd.a(cnj.eM, new jk() {
         @Override
         public cng a(jg $$0, cng $$1) {
            hx $$2 = $$0.c().a($$0.d().c(czd.b));

            for (cad $$4 : $$0.b().a(cad.class, new elx($$2), $$0x -> $$0x.bx() && !$$0x.w())) {
               if ($$4.gu() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      czd.a(cnj.uq, new ji() {
         @Override
         public cng a(jg $$0, cng $$1) {
            ic $$2 = $$0.d().c(czd.b);
            emc $$3 = jj.a($$0, bmc.O, $$2);
            cgd $$4 = new cgd($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
            $$4.c((double)$$2.j(), (double)$$2.k(), (double)$$2.l(), 0.5F, 1.0F);
            $$0.b().b($$4);
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(jg $$0) {
            $$0.b().c(1004, $$0.c(), 0);
         }
      });
      czd.a(cnj.tV, new ji() {
         @Override
         public cng a(jg $$0, cng $$1) {
            ic $$2 = $$0.d().c(czd.b);
            ir $$3 = czd.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            ctx $$7 = $$0.b();
            auw $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            cgl $$12 = new cgl($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(jg $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      czd.a(cnj.nT, new jh(chk.b.a));
      czd.a(cnj.nV, new jh(chk.b.b));
      czd.a(cnj.nX, new jh(chk.b.c));
      czd.a(cnj.nZ, new jh(chk.b.d));
      czd.a(cnj.of, new jh(chk.b.g));
      czd.a(cnj.ob, new jh(chk.b.e));
      czd.a(cnj.od, new jh(chk.b.f));
      czd.a(cnj.oh, new jh(chk.b.h));
      czd.a(cnj.oj, new jh(chk.b.i));
      czd.a(cnj.nU, new jh(chk.b.a, true));
      czd.a(cnj.nW, new jh(chk.b.b, true));
      czd.a(cnj.nY, new jh(chk.b.c, true));
      czd.a(cnj.oa, new jh(chk.b.d, true));
      czd.a(cnj.og, new jh(chk.b.g, true));
      czd.a(cnj.oc, new jh(chk.b.e, true));
      czd.a(cnj.oe, new jh(chk.b.f, true));
      czd.a(cnj.oi, new jh(chk.b.h, true));
      czd.a(cnj.ok, new jh(chk.b.i, true));
      jj $$3 = new ji() {
         private final ji c = new ji();

         @Override
         public cng a(jg $$0, cng $$1) {
            clt $$2 = (clt)$$1.d();
            hx $$3 = $$0.c().a($$0.d().c(czd.b));
            ctx $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cng(cnj.qx);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      czd.a(cnj.qz, $$3);
      czd.a(cnj.qy, $$3);
      czd.a(cnj.qA, $$3);
      czd.a(cnj.qF, $$3);
      czd.a(cnj.qG, $$3);
      czd.a(cnj.qE, $$3);
      czd.a(cnj.qH, $$3);
      czd.a(cnj.qI, $$3);
      czd.a(cnj.qJ, $$3);
      czd.a(cnj.qx, new ji() {
         private final ji c = new ji();

         @Override
         public cng a(jg $$0, cng $$1) {
            cty $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(czd.b));
            djp $$4 = $$2.a_($$3);
            if ($$4.b() instanceof cxf $$6) {
               cng $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dnz.y, $$3);
                  cnb $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new cng($$8);
                  } else {
                     if ($$0.e().a(new cng($$8)) < 0) {
                        this.c.dispense($$0, new cng($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      czd.a(cnj.or, new jk() {
         @Override
         protected cng a(jg $$0, cng $$1) {
            ctx $$2 = $$0.b();
            this.a(true);
            ic $$3 = $$0.d().c(czd.b);
            hx $$4 = $$0.c().a($$3);
            djp $$5 = $$2.a_($$4);
            if (cwl.a($$2, $$4, $$3)) {
               $$2.b($$4, cwl.a($$2, $$4));
               $$2.a(null, dnz.i, $$4);
            } else if (cxm.h($$5) || cxn.g($$5) || cxo.g($$5)) {
               $$2.b($$4, $$5.a(dkf.r, Boolean.valueOf(true)));
               $$2.a(null, dnz.c, $$4);
            } else if ($$5.b() instanceof dfg) {
               dfg.a($$2, $$4);
               $$2.a($$4, false);
            } else {
               this.a(false);
            }

            if (this.a() && $$1.a(1, $$2.z, null)) {
               $$1.f(0);
            }

            return $$1;
         }
      });
      czd.a(cnj.rx, new jk() {
         @Override
         protected cng a(jg $$0, cng $$1) {
            this.a(true);
            ctx $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(czd.b));
            if (!clc.a($$1, $$2, $$3) && !clc.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      czd.a(cxa.ck, new ji() {
         @Override
         protected cng a(jg $$0, cng $$1) {
            ctx $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(czd.b));
            ccc $$4 = new ccc($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dq(), $$4.ds(), $$4.dw(), art.yQ, aru.e, 1.0F, 1.0F);
            $$2.a(null, dnz.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      jj $$4 = new jk() {
         @Override
         protected cng a(jg $$0, cng $$1) {
            this.a(ckr.a($$0, $$1));
            return $$1;
         }
      };
      czd.a(cnj.ul, $$4);
      czd.a(cnj.uk, $$4);
      czd.a(cnj.um, $$4);
      czd.a(cnj.uh, $$4);
      czd.a(cnj.un, $$4);
      czd.a(cnj.uj, $$4);
      czd.a(cnj.ui, new jk() {
         @Override
         protected cng a(jg $$0, cng $$1) {
            ctx $$2 = $$0.b();
            ic $$3 = $$0.d().c(czd.b);
            hx $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dgp.b($$2, $$4, $$1)) {
               $$2.a($$4, cxa.gG.o().a(ddz.e, Integer.valueOf(dkv.a($$3))), 3);
               $$2.a(null, dnz.i, $$4);
               dhd $$5 = $$2.c_($$4);
               if ($$5 instanceof dio) {
                  dgp.a($$2, $$4, (dio)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ckr.a($$0, $$1));
            }

            return $$1;
         }
      });
      czd.a(cxa.ee, new jk() {
         @Override
         protected cng a(jg $$0, cng $$1) {
            ctx $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(czd.b));
            cxs $$4 = (cxs)cxa.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dnz.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ckr.a($$0, $$1));
            }

            return $$1;
         }
      });
      czd.a(cxa.kP.j(), new jm());

      for (clv $$5 : clv.values()) {
         czd.a(ddw.a($$5).j(), new jm());
      }

      czd.a(cnj.sk.j(), new jk() {
         private final ji c = new ji();

         private cng a(jg $$0, cng $$1, cng $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.b().a(null, dnz.y, $$0.c());
               return $$2.p();
            } else {
               if ($$0.e().a($$2.p()) < 0) {
                  this.c.dispense($$0, $$2.p());
               }

               return $$1;
            }
         }

         @Override
         public cng a(jg $$0, cng $$1) {
            this.a(false);
            ane $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(czd.b));
            djp $$4 = $$2.a_($$3);
            if ($$4.a(asi.aF, $$0x -> $$0x.b(cws.c) && $$0x.b() instanceof cws) && $$4.c(cws.c) >= 5) {
               ((cws)$$4.b()).a($$2, $$4, $$3, null, dha.b.b);
               this.a(true);
               return this.a($$0, $$1, new cng(cnj.wt));
            } else if ($$2.b_($$3).a(asn.a)) {
               this.a(true);
               return this.a($$0, $$1, cpg.a(new cng(cnj.sj), cph.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      czd.a(cnj.ft, new jk() {
         @Override
         public cng a(jg $$0, cng $$1) {
            ic $$2 = $$0.d().c(czd.b);
            hx $$3 = $$0.c().a($$2);
            ctx $$4 = $$0.b();
            djp $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(cxa.pl)) {
               if ($$5.c(ddf.d) != 4) {
                  ddf.a(null, $$4, $$3, $$5);
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
      czd.a(cnj.rU.j(), new jl());
      czd.a(cnj.xl.j(), new jk() {
         @Override
         protected cng a(jg $$0, cng $$1) {
            ane $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(czd.b));
            List<bzj> $$4 = $$2.a(bzj.class, new elx($$3), bmb.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               $$4.get(0).gm();
               if ($$1.a(16, $$2.F_(), null)) {
                  $$1.h(1);
                  $$1.b(0);
               }

               return $$1;
            }
         }
      });
      czd.a(cnj.wq, new jk() {
         @Override
         public cng a(jg $$0, cng $$1) {
            hx $$2 = $$0.c().a($$0.d().c(czd.b));
            ctx $$3 = $$0.b();
            djp $$4 = $$3.a_($$2);
            Optional<djp> $$5 = cmw.b($$4);
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
      czd.a(cnj.sj, new ji() {
         private final ji c = new ji();

         @Override
         public cng a(jg $$0, cng $$1) {
            if (!cpg.d($$1).a(cph.c)) {
               return this.c.dispense($$0, $$1);
            } else {
               ane $$2 = $$0.b();
               hx $$3 = $$0.c();
               hx $$4 = $$0.c().a($$0.d().c(czd.b));
               if (!$$2.a_($$4).a(asi.ca)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(jx.aj, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, art.ct, aru.e, 1.0F, 1.0F);
                  $$2.a(null, dnz.z, $$3);
                  $$2.b($$4, cxa.sI.o());
                  return new cng(cnj.sk);
               }
            }
         }
      });
   }

   static emc a(jg $$0, bmc<?> $$1, ic $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
