import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface jx {
   Logger a = LogUtils.getLogger();
   jx b = ($$0, $$1) -> $$1;

   crj dispense(ju var1, crj var2);

   static void c() {
      ded.a(crm.ou, new jt() {
         @Override
         protected ckl a(cyx $$0, iv $$1, crj $$2) {
            ckb $$3 = new ckb($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cjz.a.b;
            return $$3;
         }
      });
      ded.a(crm.vo, new jt() {
         @Override
         protected ckl a(cyx $$0, iv $$1, crj $$2) {
            ckb $$3 = new ckb($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cjz.a.b;
            return $$3;
         }
      });
      ded.a(crm.vn, new jt() {
         @Override
         protected ckl a(cyx $$0, iv $$1, crj $$2) {
            cjz $$3 = new ckr($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cjz.a.b;
            return $$3;
         }
      });
      ded.a(crm.qQ, new jt() {
         @Override
         protected ckl a(cyx $$0, iv $$1, crj $$2) {
            return ac.a(new cku($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      ded.a(crm.qB, new jt() {
         @Override
         protected ckl a(cyx $$0, iv $$1, crj $$2) {
            return ac.a(new ckq($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      ded.a(crm.tV, new jt() {
         @Override
         protected ckl a(cyx $$0, iv $$1, crj $$2) {
            return ac.a(new ckw($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      ded.a(crm.vm, new jx() {
         @Override
         public crj dispense(ju $$0, crj $$1) {
            return (new jt() {
               @Override
               protected ckl a(cyx $$0, iv $$1, crj $$2) {
                  return ac.a(new ckx($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      ded.a(crm.vp, new jx() {
         @Override
         public crj dispense(ju $$0, crj $$1) {
            return (new jt() {
               @Override
               protected ckl a(cyx $$0, iv $$1, crj $$2) {
                  return ac.a(new ckx($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      jw $$0 = new jw() {
         @Override
         public crj a(ju $$0, crj $$1) {
            ih $$2 = $$0.d().c(ded.b);
            bqb<?> $$3 = ((csn)$$1.f()).j($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bqs.o, $$2 != ih.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return crj.i;
            }

            $$1.g(1);
            $$0.b().a(null, dts.t, $$0.c());
            return $$1;
         }
      };

      for (csn $$1 : csn.h()) {
         ded.a($$1, $$0);
      }

      ded.a(crm.uD, new jw() {
         @Override
         public crj a(ju $$0, crj $$1) {
            ih $$2 = $$0.d().c(ded.b);
            ib $$3 = $$0.c().a($$2);
            aps $$4 = $$0.b();
            Consumer<cft> $$5 = bqb.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            cft $$6 = bqb.d.a($$4, $$5, $$3, bqs.o, false, false);
            if ($$6 != null) {
               $$1.g(1);
            }

            return $$1;
         }
      });
      ded.a(crm.nK, new jy() {
         @Override
         public crj a(ju $$0, crj $$1) {
            ib $$2 = $$0.c().a($$0.d().c(ded.b));
            List<bqo> $$3 = $$0.b().a(bqo.class, new erv($$2), $$0x -> !($$0x instanceof brd $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((brd)$$3.get(0)).a(aun.e);
               $$1.g(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      jw $$2 = new jy() {
         @Override
         protected crj a(ju $$0, crj $$1) {
            ib $$2 = $$0.c().a($$0.d().c(ded.b));

            for (cef $$4 : $$0.b().a(cef.class, new erv($$2), $$0x -> $$0x.bA() && $$0x.fQ())) {
               if ($$4.l($$1) && !$$4.fR() && $$4.gC()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      ded.a(crm.uH, $$2);
      ded.a(crm.uE, $$2);
      ded.a(crm.uF, $$2);
      ded.a(crm.uG, $$2);
      ded.a(crm.hD, $$2);
      ded.a(crm.hE, $$2);
      ded.a(crm.hM, $$2);
      ded.a(crm.hO, $$2);
      ded.a(crm.hP, $$2);
      ded.a(crm.hS, $$2);
      ded.a(crm.hK, $$2);
      ded.a(crm.hQ, $$2);
      ded.a(crm.hG, $$2);
      ded.a(crm.hL, $$2);
      ded.a(crm.hI, $$2);
      ded.a(crm.hF, $$2);
      ded.a(crm.hJ, $$2);
      ded.a(crm.hN, $$2);
      ded.a(crm.hR, $$2);
      ded.a(crm.hH, $$2);
      ded.a(crm.eM, new jy() {
         @Override
         public crj a(ju $$0, crj $$1) {
            ib $$2 = $$0.c().a($$0.d().c(ded.b));

            for (cee $$4 : $$0.b().a(cee.class, new erv($$2), $$0x -> $$0x.bA() && !$$0x.u())) {
               if ($$4.gC() && $$4.a_(499).a($$1)) {
                  $$1.g(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      ded.a(crm.us, new jw() {
         @Override
         public crj a(ju $$0, crj $$1) {
            ih $$2 = $$0.d().c(ded.b);
            esa $$3 = jx.a($$0, bqb.P, $$2);
            ckg $$4 = new ckg($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
            $$4.c((double)$$2.j(), (double)$$2.k(), (double)$$2.l(), 0.5F, 1.0F);
            $$0.b().b($$4);
            $$1.g(1);
            return $$1;
         }

         @Override
         protected void a(ju $$0) {
            $$0.b().c(1004, $$0.c(), 0);
         }
      });
      ded.a(crm.tW, new jw() {
         @Override
         public crj a(ju $$0, crj $$1) {
            ih $$2 = $$0.d().c(ded.b);
            iv $$3 = ded.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            cyx $$7 = $$0.b();
            axr $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            ckp $$12 = new ckp($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.g(1);
            return $$1;
         }

         @Override
         protected void a(ju $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      ded.a(
         crm.tX,
         new jw() {
            @Override
            public crj a(ju $$0, crj $$1) {
               ih $$2 = $$0.d().c(ded.b);
               iv $$3 = ded.a($$0);
               cyx $$4 = $$0.b();
               axr $$5 = $$4.z;
               double $$6 = $$5.a((double)$$2.j(), 0.11485000000000001);
               double $$7 = $$5.a((double)$$2.k(), 0.11485000000000001);
               double $$8 = $$5.a((double)$$2.l(), 0.11485000000000001);
               cld $$9 = new cld(
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
      ded.a(crm.nT, new jv(clq.b.a));
      ded.a(crm.nV, new jv(clq.b.b));
      ded.a(crm.nX, new jv(clq.b.c));
      ded.a(crm.nZ, new jv(clq.b.d));
      ded.a(crm.of, new jv(clq.b.g));
      ded.a(crm.ob, new jv(clq.b.e));
      ded.a(crm.od, new jv(clq.b.f));
      ded.a(crm.oh, new jv(clq.b.h));
      ded.a(crm.oj, new jv(clq.b.i));
      ded.a(crm.nU, new jv(clq.b.a, true));
      ded.a(crm.nW, new jv(clq.b.b, true));
      ded.a(crm.nY, new jv(clq.b.c, true));
      ded.a(crm.oa, new jv(clq.b.d, true));
      ded.a(crm.og, new jv(clq.b.g, true));
      ded.a(crm.oc, new jv(clq.b.e, true));
      ded.a(crm.oe, new jv(clq.b.f, true));
      ded.a(crm.oi, new jv(clq.b.h, true));
      ded.a(crm.ok, new jv(clq.b.i, true));
      jx $$3 = new jw() {
         private final jw c = new jw();

         @Override
         public crj a(ju $$0, crj $$1) {
            cqa $$2 = (cqa)$$1.f();
            ib $$3 = $$0.c().a($$0.d().c(ded.b));
            cyx $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new crj(crm.qx);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      ded.a(crm.qz, $$3);
      ded.a(crm.qy, $$3);
      ded.a(crm.qA, $$3);
      ded.a(crm.qF, $$3);
      ded.a(crm.qG, $$3);
      ded.a(crm.qE, $$3);
      ded.a(crm.qH, $$3);
      ded.a(crm.qI, $$3);
      ded.a(crm.qJ, $$3);
      ded.a(crm.qx, new jw() {
         private final jw c = new jw();

         @Override
         public crj a(ju $$0, crj $$1) {
            cyy $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(ded.b));
            doz $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dcf $$6) {
               crj $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.d()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dts.y, $$3);
                  cre $$8 = $$7.f();
                  $$1.g(1);
                  if ($$1.d()) {
                     return new crj($$8);
                  } else {
                     if ($$0.e().a(new crj($$8)) < 0) {
                        this.c.dispense($$0, new crj($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      ded.a(crm.or, new jy() {
         @Override
         protected crj a(ju $$0, crj $$1) {
            cyx $$2 = $$0.b();
            this.a(true);
            ih $$3 = $$0.d().c(ded.b);
            ib $$4 = $$0.c().a($$3);
            doz $$5 = $$2.a_($$4);
            if (dbl.a($$2, $$4, $$3)) {
               $$2.b($$4, dbl.a($$2, $$4));
               $$2.a(null, dts.i, $$4);
            } else if (dcm.h($$5) || dcn.g($$5) || dco.g($$5)) {
               $$2.b($$4, $$5.a(dpp.r, Boolean.valueOf(true)));
               $$2.a(null, dts.c, $$4);
            } else if ($$5.b() instanceof dkg) {
               dkg.a($$2, $$4);
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
      ded.a(crm.rx, new jy() {
         @Override
         protected crj a(ju $$0, crj $$1) {
            this.a(true);
            cyx $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(ded.b));
            if (!cpj.a($$1, $$2, $$3) && !cpj.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      ded.a(dca.ck, new jw() {
         @Override
         protected crj a(ju $$0, crj $$1) {
            cyx $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(ded.b));
            cge $$4 = new cge($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dr(), $$4.dt(), $$4.dx(), aum.zc, aun.e, 1.0F, 1.0F);
            $$2.a(null, dts.t, $$3);
            $$1.g(1);
            return $$1;
         }
      });
      jx $$4 = new jy() {
         @Override
         protected crj a(ju $$0, crj $$1) {
            this.a(coy.a($$0, $$1));
            return $$1;
         }
      };
      ded.a(crm.un, $$4);
      ded.a(crm.um, $$4);
      ded.a(crm.uo, $$4);
      ded.a(crm.uj, $$4);
      ded.a(crm.up, $$4);
      ded.a(crm.ul, $$4);
      ded.a(crm.uk, new jy() {
         @Override
         protected crj a(ju $$0, crj $$1) {
            cyx $$2 = $$0.b();
            ih $$3 = $$0.d().c(ded.b);
            ib $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dlq.b($$2, $$4, $$1)) {
               $$2.a($$4, dca.gG.n().a(diz.e, Integer.valueOf(dqf.a($$3))), 3);
               $$2.a(null, dts.i, $$4);
               dmf $$5 = $$2.c_($$4);
               if ($$5 instanceof dnr) {
                  dlq.a($$2, $$4, (dnr)$$5);
               }

               $$1.g(1);
               this.a(true);
            } else {
               this.a(coy.a($$0, $$1));
            }

            return $$1;
         }
      });
      ded.a(dca.ee, new jy() {
         @Override
         protected crj a(ju $$0, crj $$1) {
            cyx $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(ded.b));
            dcs $$4 = (dcs)dca.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.n(), 3);
                  $$2.a(null, dts.i, $$3);
               }

               $$1.g(1);
               this.a(true);
            } else {
               this.a(coy.a($$0, $$1));
            }

            return $$1;
         }
      });
      ded.a(dca.kP.p(), new ka());

      for (cqc $$5 : cqc.values()) {
         ded.a(diw.a($$5).p(), new ka());
      }

      ded.a(crm.sk.p(), new jy() {
         private final jw c = new jw();

         private crj a(ju $$0, crj $$1, crj $$2) {
            $$1.g(1);
            if ($$1.d()) {
               $$0.b().a(null, dts.y, $$0.c());
               return $$2.r();
            } else {
               if ($$0.e().a($$2.r()) < 0) {
                  this.c.dispense($$0, $$2.r());
               }

               return $$1;
            }
         }

         @Override
         public crj a(ju $$0, crj $$1) {
            this.a(false);
            aps $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(ded.b));
            doz $$4 = $$2.a_($$3);
            if ($$4.a(avc.aG, $$0x -> $$0x.b(dbs.c) && $$0x.b() instanceof dbs) && $$4.c(dbs.c) >= 5) {
               ((dbs)$$4.b()).a($$2, $$4, $$3, null, dmc.b.b);
               this.a(true);
               return this.a($$0, $$1, new crj(crm.wv));
            } else if ($$2.b_($$3).a(avh.a)) {
               this.a(true);
               return this.a($$0, $$1, cth.a(crm.sj, cti.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      ded.a(crm.ft, new jy() {
         @Override
         public crj a(ju $$0, crj $$1) {
            ih $$2 = $$0.d().c(ded.b);
            ib $$3 = $$0.c().a($$2);
            cyx $$4 = $$0.b();
            doz $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dca.pl)) {
               if ($$5.c(dif.d) != 4) {
                  dif.a(null, $$4, $$3, $$5);
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
      ded.a(crm.rU.p(), new jz());
      ded.a(crm.xn.p(), new jy() {
         @Override
         protected crj a(ju $$0, crj $$1) {
            aps $$2 = $$0.b();
            ib $$3 = $$0.c().a($$0.d().c(ded.b));
            List<cdk> $$4 = $$2.a(cdk.class, new erv($$3), bqa.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cdk $$5 : $$4) {
                  if ($$5.gx()) {
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
      ded.a(crm.ws, new jy() {
         @Override
         public crj a(ju $$0, crj $$1) {
            ib $$2 = $$0.c().a($$0.d().c(ded.b));
            cyx $$3 = $$0.b();
            doz $$4 = $$3.a_($$2);
            Optional<doz> $$5 = cqz.b($$4);
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
      ded.a(crm.sj, new jw() {
         private final jw c = new jw();

         @Override
         public crj a(ju $$0, crj $$1) {
            cth $$2 = $$1.a(jp.x, cth.a);
            if (!$$2.a(cti.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               aps $$3 = $$0.b();
               ib $$4 = $$0.c();
               ib $$5 = $$0.c().a($$0.d().c(ded.b));
               if (!$$3.a_($$5).a(avc.cc)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(kl.ak, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, aum.cB, aun.e, 1.0F, 1.0F);
                  $$3.a(null, dts.z, $$4);
                  $$3.b($$5, dca.sI.n());
                  return new crj(crm.sk);
               }
            }
         }
      });
   }

   static esa a(ju $$0, bqb<?> $$1, ih $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
