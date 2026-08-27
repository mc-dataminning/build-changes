import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface ki {
   Logger a = LogUtils.getLogger();
   ki b = ($$0, $$1) -> $$1;

   cto dispense(kf var1, cto var2);

   static void a() {
      dgd.a(ctr.ov);
      dgd.a(ctr.vq);
      dgd.a(ctr.vp);
      dgd.a(ctr.qR);
      dgd.a(ctr.qC);
      dgd.a(ctr.tW);
      dgd.a(ctr.vo);
      dgd.a(ctr.vr);
      dgd.a(ctr.uu);
      dgd.a(ctr.tX);
      dgd.a(ctr.tY);
      kh $$0 = new kh() {
         @Override
         public cto a(kf $$0, cto $$1) {
            it $$2 = $$0.d().c(dgd.b);
            bsa<?> $$3 = ((cuv)$$1.g()).j($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bss.o, $$2 != it.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cto.i;
            }

            $$1.h(1);
            $$0.b().a(null, dvu.t, $$0.c());
            return $$1;
         }
      };

      for (cuv $$1 : cuv.h()) {
         dgd.a($$1, $$0);
      }

      dgd.a(ctr.uF, new kh() {
         @Override
         public cto a(kf $$0, cto $$1) {
            it $$2 = $$0.d().c(dgd.b);
            io $$3 = $$0.c().a($$2);
            aqm $$4 = $$0.b();
            Consumer<chw> $$5 = bsa.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            chw $$6 = bsa.d.a($$4, $$5, $$3, bss.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dgd.a(ctr.nL, new kj() {
         @Override
         public cto a(kf $$0, cto $$1) {
            io $$2 = $$0.c().a($$0.d().c(dgd.b));
            List<bso> $$3 = $$0.b().a(bso.class, new euf($$2), $$0x -> !($$0x instanceof bte $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bte)$$3.get(0)).a(avi.e);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      kh $$2 = new kj() {
         @Override
         protected cto a(kf $$0, cto $$1) {
            io $$2 = $$0.c().a($$0.d().c(dgd.b));

            for (cgi $$4 : $$0.b().a(cgi.class, new euf($$2), $$0x -> $$0x.bD() && $$0x.fR())) {
               if ($$4.l($$1) && !$$4.fS() && $$4.gE()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dgd.a(ctr.uJ, $$2);
      dgd.a(ctr.uG, $$2);
      dgd.a(ctr.uH, $$2);
      dgd.a(ctr.uI, $$2);
      dgd.a(ctr.hE, $$2);
      dgd.a(ctr.hF, $$2);
      dgd.a(ctr.hN, $$2);
      dgd.a(ctr.hP, $$2);
      dgd.a(ctr.hQ, $$2);
      dgd.a(ctr.hT, $$2);
      dgd.a(ctr.hL, $$2);
      dgd.a(ctr.hR, $$2);
      dgd.a(ctr.hH, $$2);
      dgd.a(ctr.hM, $$2);
      dgd.a(ctr.hJ, $$2);
      dgd.a(ctr.hG, $$2);
      dgd.a(ctr.hK, $$2);
      dgd.a(ctr.hO, $$2);
      dgd.a(ctr.hS, $$2);
      dgd.a(ctr.hI, $$2);
      dgd.a(ctr.eN, new kj() {
         @Override
         public cto a(kf $$0, cto $$1) {
            io $$2 = $$0.c().a($$0.d().c(dgd.b));

            for (cgh $$4 : $$0.b().a(cgh.class, new euf($$2), $$0x -> $$0x.bD() && !$$0x.u())) {
               if ($$4.gE() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dgd.a(ctr.nU, new kg(cnt.b.a));
      dgd.a(ctr.nW, new kg(cnt.b.b));
      dgd.a(ctr.nY, new kg(cnt.b.c));
      dgd.a(ctr.oa, new kg(cnt.b.d));
      dgd.a(ctr.og, new kg(cnt.b.g));
      dgd.a(ctr.oc, new kg(cnt.b.e));
      dgd.a(ctr.oe, new kg(cnt.b.f));
      dgd.a(ctr.oi, new kg(cnt.b.h));
      dgd.a(ctr.ok, new kg(cnt.b.i));
      dgd.a(ctr.nV, new kg(cnt.b.a, true));
      dgd.a(ctr.nX, new kg(cnt.b.b, true));
      dgd.a(ctr.nZ, new kg(cnt.b.c, true));
      dgd.a(ctr.ob, new kg(cnt.b.d, true));
      dgd.a(ctr.oh, new kg(cnt.b.g, true));
      dgd.a(ctr.od, new kg(cnt.b.e, true));
      dgd.a(ctr.of, new kg(cnt.b.f, true));
      dgd.a(ctr.oj, new kg(cnt.b.h, true));
      dgd.a(ctr.ol, new kg(cnt.b.i, true));
      ki $$3 = new kh() {
         private final kh c = new kh();

         @Override
         public cto a(kf $$0, cto $$1) {
            csf $$2 = (csf)$$1.g();
            io $$3 = $$0.c().a($$0.d().c(dgd.b));
            dax $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cto(ctr.qy);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dgd.a(ctr.qA, $$3);
      dgd.a(ctr.qz, $$3);
      dgd.a(ctr.qB, $$3);
      dgd.a(ctr.qG, $$3);
      dgd.a(ctr.qH, $$3);
      dgd.a(ctr.qF, $$3);
      dgd.a(ctr.qI, $$3);
      dgd.a(ctr.qJ, $$3);
      dgd.a(ctr.qK, $$3);
      dgd.a(ctr.qy, new kh() {
         private final kh c = new kh();

         @Override
         public cto a(kf $$0, cto $$1) {
            day $$2 = $$0.b();
            io $$3 = $$0.c().a($$0.d().c(dgd.b));
            drb $$4 = $$2.a_($$3);
            if ($$4.b() instanceof def $$6) {
               cto $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.e()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dvu.y, $$3);
                  ctj $$8 = $$7.g();
                  $$1.h(1);
                  if ($$1.e()) {
                     return new cto($$8);
                  } else {
                     if ($$0.e().b(new cto($$8)) < 0) {
                        this.c.dispense($$0, new cto($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dgd.a(ctr.os, new kj() {
         @Override
         protected cto a(kf $$0, cto $$1) {
            dax $$2 = $$0.b();
            this.a(true);
            it $$3 = $$0.d().c(dgd.b);
            io $$4 = $$0.c().a($$3);
            drb $$5 = $$2.a_($$4);
            if (ddl.a($$2, $$4, $$3)) {
               $$2.b($$4, ddl.a($$2, $$4));
               $$2.a(null, dvu.i, $$4);
            } else if (dem.h($$5) || den.g($$5) || deo.g($$5)) {
               $$2.b($$4, $$5.a(drr.r, Boolean.valueOf(true)));
               $$2.a(null, dvu.c, $$4);
            } else if ($$5.b() instanceof dmh) {
               dmh.a($$2, $$4);
               $$2.a($$4, false);
            } else {
               this.a(false);
            }

            if (this.b()) {
               $$1.a(1, $$2.E_(), null, () -> $$1.e(0));
            }

            return $$1;
         }
      });
      dgd.a(ctr.ry, new kj() {
         @Override
         protected cto a(kf $$0, cto $$1) {
            this.a(true);
            dax $$2 = $$0.b();
            io $$3 = $$0.c().a($$0.d().c(dgd.b));
            if (!cro.a($$1, $$2, $$3) && !cro.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dgd.a(dea.ck, new kh() {
         @Override
         protected cto a(kf $$0, cto $$1) {
            dax $$2 = $$0.b();
            io $$3 = $$0.c().a($$0.d().c(dgd.b));
            cih $$4 = new cih($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.du(), $$4.dw(), $$4.dA(), avh.zv, avi.e, 1.0F, 1.0F);
            $$2.a(null, dvu.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      ki $$4 = new kj() {
         @Override
         protected cto a(kf $$0, cto $$1) {
            this.a(crd.a($$0, $$1));
            return $$1;
         }
      };
      dgd.a(ctr.up, $$4);
      dgd.a(ctr.uo, $$4);
      dgd.a(ctr.uq, $$4);
      dgd.a(ctr.ul, $$4);
      dgd.a(ctr.ur, $$4);
      dgd.a(ctr.un, $$4);
      dgd.a(ctr.um, new kj() {
         @Override
         protected cto a(kf $$0, cto $$1) {
            dax $$2 = $$0.b();
            it $$3 = $$0.d().c(dgd.b);
            io $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dnr.b($$2, $$4, $$1)) {
               $$2.a($$4, dea.gG.n().a(dla.e, Integer.valueOf(dsh.a($$3))), 3);
               $$2.a(null, dvu.i, $$4);
               dog $$5 = $$2.c_($$4);
               if ($$5 instanceof dps) {
                  dnr.a($$2, $$4, (dps)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(crd.a($$0, $$1));
            }

            return $$1;
         }
      });
      dgd.a(dea.ee, new kj() {
         @Override
         protected cto a(kf $$0, cto $$1) {
            dax $$2 = $$0.b();
            io $$3 = $$0.c().a($$0.d().c(dgd.b));
            des $$4 = (des)dea.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.n(), 3);
                  $$2.a(null, dvu.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(crd.a($$0, $$1));
            }

            return $$1;
         }
      });
      dgd.a(dea.kP.q(), new km());

      for (csh $$5 : csh.values()) {
         dgd.a(dkx.a($$5).q(), new km());
      }

      dgd.a(ctr.sl.q(), new kj() {
         private final kh c = new kh();

         private cto a(kf $$0, cto $$1, cto $$2) {
            $$1.h(1);
            if ($$1.e()) {
               $$0.b().a(null, dvu.y, $$0.c());
               return $$2.s();
            } else {
               if ($$0.e().b($$2.s()) < 0) {
                  this.c.dispense($$0, $$2.s());
               }

               return $$1;
            }
         }

         @Override
         public cto a(kf $$0, cto $$1) {
            this.a(false);
            aqm $$2 = $$0.b();
            io $$3 = $$0.c().a($$0.d().c(dgd.b));
            drb $$4 = $$2.a_($$3);
            if ($$4.a(avw.aG, $$0x -> $$0x.b(dds.c) && $$0x.b() instanceof dds) && $$4.c(dds.c) >= 5) {
               ((dds)$$4.b()).a($$2, $$4, $$3, null, dod.b.b);
               this.a(true);
               return this.a($$0, $$1, new cto(ctr.wz));
            } else if ($$2.b_($$3).a(awb.a)) {
               this.a(true);
               return this.a($$0, $$1, cvp.a(ctr.sk, cvq.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dgd.a(ctr.fu, new kj() {
         @Override
         public cto a(kf $$0, cto $$1) {
            it $$2 = $$0.d().c(dgd.b);
            io $$3 = $$0.c().a($$2);
            dax $$4 = $$0.b();
            drb $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dea.pl)) {
               if ($$5.c(dkg.d) != 4) {
                  dkg.a(null, $$4, $$3, $$5);
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
      dgd.a(ctr.rV.q(), new kl());
      dgd.a(ctr.xr.q(), new kj() {
         @Override
         protected cto a(kf $$0, cto $$1) {
            aqm $$2 = $$0.b();
            io $$3 = $$0.c().a($$0.d().c(dgd.b));
            List<cfn> $$4 = $$2.a(cfn.class, new euf($$3), brz.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cfn $$5 : $$4) {
                  if ($$5.gz()) {
                     $$1.a(16, $$2.E_(), null, () -> {
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
      dgd.a(ctr.ww, new kj() {
         @Override
         public cto a(kf $$0, cto $$1) {
            io $$2 = $$0.c().a($$0.d().c(dgd.b));
            dax $$3 = $$0.b();
            drb $$4 = $$3.a_($$2);
            Optional<drb> $$5 = cte.a($$4);
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
      dgd.a(ctr.sk, new kh() {
         private final kh c = new kh();

         @Override
         public cto a(kf $$0, cto $$1) {
            cvp $$2 = $$1.a(kb.F, cvp.a);
            if (!$$2.a(cvq.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               aqm $$3 = $$0.b();
               io $$4 = $$0.c();
               io $$5 = $$0.c().a($$0.d().c(dgd.b));
               if (!$$3.a_($$5).a(avw.ci)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(ky.am, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, avh.cB, avi.e, 1.0F, 1.0F);
                  $$3.a(null, dvu.z, $$4);
                  $$3.b($$5, dea.sI.n());
                  return new cto(ctr.sl);
               }
            }
         }
      });
   }
}
