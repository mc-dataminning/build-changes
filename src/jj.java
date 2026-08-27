import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface jj {
   Logger a = LogUtils.getLogger();
   jj b = ($$0, $$1) -> $$1;

   cmr dispense(jg var1, cmr var2);

   static void c() {
      cyo.a(cmu.os, new jf() {
         @Override
         protected cft a(cti $$0, ir $$1, cmr $$2) {
            cfj $$3 = new cfj($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cfh.a.b;
            return $$3;
         }
      });
      cyo.a(cmu.vj, new jf() {
         @Override
         protected cft a(cti $$0, ir $$1, cmr $$2) {
            cfj $$3 = new cfj($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.a($$2);
            $$3.d = cfh.a.b;
            return $$3;
         }
      });
      cyo.a(cmu.vi, new jf() {
         @Override
         protected cft a(cti $$0, ir $$1, cmr $$2) {
            cfh $$3 = new cfy($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cfh.a.b;
            return $$3;
         }
      });
      cyo.a(cmu.qO, new jf() {
         @Override
         protected cft a(cti $$0, ir $$1, cmr $$2) {
            return ac.a(new cgb($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cyo.a(cmu.qz, new jf() {
         @Override
         protected cft a(cti $$0, ir $$1, cmr $$2) {
            return ac.a(new cfx($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cyo.a(cmu.tR, new jf() {
         @Override
         protected cft a(cti $$0, ir $$1, cmr $$2) {
            return ac.a(new cgd($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cyo.a(cmu.vh, new jj() {
         @Override
         public cmr dispense(jg $$0, cmr $$1) {
            return (new jf() {
               @Override
               protected cft a(cti $$0, ir $$1, cmr $$2) {
                  return ac.a(new cge($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cyo.a(cmu.vk, new jj() {
         @Override
         public cmr dispense(jg $$0, cmr $$1) {
            return (new jf() {
               @Override
               protected cft a(cti $$0, ir $$1, cmr $$2) {
                  return ac.a(new cge($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
         public cmr a(jg $$0, cmr $$1) {
            ic $$2 = $$0.d().c(cyo.b);
            blt<?> $$3 = ((cnw)$$1.d()).a($$1.v());

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bmj.o, $$2 != ic.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cmr.f;
            }

            $$1.h(1);
            $$0.b().a(null, dnk.t, $$0.c());
            return $$1;
         }
      };

      for (cnw $$1 : cnw.h()) {
         cyo.a($$1, $$0);
      }

      cyo.a(cmu.uy, new ji() {
         @Override
         public cmr a(jg $$0, cmr $$1) {
            ic $$2 = $$0.d().c(cyo.b);
            hx $$3 = $$0.c().a($$2);
            amz $$4 = $$0.b();
            Consumer<cbe> $$5 = blt.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            cbe $$6 = blt.d.a($$4, $$1.v(), $$5, $$3, bmj.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      cyo.a(cmu.nK, new jk() {
         @Override
         public cmr a(jg $$0, cmr $$1) {
            hx $$2 = $$0.c().a($$0.d().c(cyo.b));
            List<bmf> $$3 = $$0.b().a(bmf.class, new elh($$2), $$0x -> !($$0x instanceof bmv $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((bmv)$$3.get(0)).a(arn.e);
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
         protected cmr a(jg $$0, cmr $$1) {
            hx $$2 = $$0.c().a($$0.d().c(cyo.b));

            for (bzr $$4 : $$0.b().a(bzr.class, new elh($$2), $$0x -> $$0x.bx() && $$0x.gN())) {
               if ($$4.l($$1) && !$$4.gO() && $$4.gt()) {
                  $$4.a_(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      cyo.a(cmu.uC, $$2);
      cyo.a(cmu.uz, $$2);
      cyo.a(cmu.uA, $$2);
      cyo.a(cmu.uB, $$2);
      cyo.a(cmu.hD, $$2);
      cyo.a(cmu.hE, $$2);
      cyo.a(cmu.hM, $$2);
      cyo.a(cmu.hO, $$2);
      cyo.a(cmu.hP, $$2);
      cyo.a(cmu.hS, $$2);
      cyo.a(cmu.hK, $$2);
      cyo.a(cmu.hQ, $$2);
      cyo.a(cmu.hG, $$2);
      cyo.a(cmu.hL, $$2);
      cyo.a(cmu.hI, $$2);
      cyo.a(cmu.hF, $$2);
      cyo.a(cmu.hJ, $$2);
      cyo.a(cmu.hN, $$2);
      cyo.a(cmu.hR, $$2);
      cyo.a(cmu.hH, $$2);
      cyo.a(cmu.eM, new jk() {
         @Override
         public cmr a(jg $$0, cmr $$1) {
            hx $$2 = $$0.c().a($$0.d().c(cyo.b));

            for (bzq $$4 : $$0.b().a(bzq.class, new elh($$2), $$0x -> $$0x.bx() && !$$0x.w())) {
               if ($$4.gt() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      cyo.a(cmu.un, new ji() {
         @Override
         public cmr a(jg $$0, cmr $$1) {
            ic $$2 = $$0.d().c(cyo.b);
            elm $$3 = jj.a($$0, blt.N, $$2);
            cfo $$4 = new cfo($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
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
      cyo.a(cmu.tS, new ji() {
         @Override
         public cmr a(jg $$0, cmr $$1) {
            ic $$2 = $$0.d().c(cyo.b);
            ir $$3 = cyo.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            cti $$7 = $$0.b();
            aup $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            cfw $$12 = new cfw($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(jg $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      cyo.a(cmu.nT, new jh(cgv.b.a));
      cyo.a(cmu.nV, new jh(cgv.b.b));
      cyo.a(cmu.nX, new jh(cgv.b.c));
      cyo.a(cmu.nZ, new jh(cgv.b.d));
      cyo.a(cmu.of, new jh(cgv.b.g));
      cyo.a(cmu.ob, new jh(cgv.b.e));
      cyo.a(cmu.od, new jh(cgv.b.f));
      cyo.a(cmu.oh, new jh(cgv.b.h));
      cyo.a(cmu.oj, new jh(cgv.b.i));
      cyo.a(cmu.nU, new jh(cgv.b.a, true));
      cyo.a(cmu.nW, new jh(cgv.b.b, true));
      cyo.a(cmu.nY, new jh(cgv.b.c, true));
      cyo.a(cmu.oa, new jh(cgv.b.d, true));
      cyo.a(cmu.og, new jh(cgv.b.g, true));
      cyo.a(cmu.oc, new jh(cgv.b.e, true));
      cyo.a(cmu.oe, new jh(cgv.b.f, true));
      cyo.a(cmu.oi, new jh(cgv.b.h, true));
      cyo.a(cmu.ok, new jh(cgv.b.i, true));
      jj $$3 = new ji() {
         private final ji c = new ji();

         @Override
         public cmr a(jg $$0, cmr $$1) {
            cld $$2 = (cld)$$1.d();
            hx $$3 = $$0.c().a($$0.d().c(cyo.b));
            cti $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cmr(cmu.qv);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      cyo.a(cmu.qx, $$3);
      cyo.a(cmu.qw, $$3);
      cyo.a(cmu.qy, $$3);
      cyo.a(cmu.qD, $$3);
      cyo.a(cmu.qE, $$3);
      cyo.a(cmu.qC, $$3);
      cyo.a(cmu.qF, $$3);
      cyo.a(cmu.qG, $$3);
      cyo.a(cmu.qH, $$3);
      cyo.a(cmu.qv, new ji() {
         private final ji c = new ji();

         @Override
         public cmr a(jg $$0, cmr $$1) {
            ctj $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cyo.b));
            dja $$4 = $$2.a_($$3);
            if ($$4.b() instanceof cwq $$6) {
               cmr $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dnk.y, $$3);
                  cmm $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new cmr($$8);
                  } else {
                     if ($$0.e().a(new cmr($$8)) < 0) {
                        this.c.dispense($$0, new cmr($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cyo.a(cmu.op, new jk() {
         @Override
         protected cmr a(jg $$0, cmr $$1) {
            cti $$2 = $$0.b();
            this.a(true);
            ic $$3 = $$0.d().c(cyo.b);
            hx $$4 = $$0.c().a($$3);
            dja $$5 = $$2.a_($$4);
            if (cvw.a($$2, $$4, $$3)) {
               $$2.b($$4, cvw.a($$2, $$4));
               $$2.a(null, dnk.i, $$4);
            } else if (cwx.h($$5) || cwy.g($$5) || cwz.g($$5)) {
               $$2.b($$4, $$5.a(djq.r, Boolean.valueOf(true)));
               $$2.a(null, dnk.c, $$4);
            } else if ($$5.b() instanceof der) {
               der.a($$2, $$4);
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
      cyo.a(cmu.rv, new jk() {
         @Override
         protected cmr a(jg $$0, cmr $$1) {
            this.a(true);
            cti $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cyo.b));
            if (!ckm.a($$1, $$2, $$3) && !ckm.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 0);
            }

            return $$1;
         }
      });
      cyo.a(cwl.ck, new ji() {
         @Override
         protected cmr a(jg $$0, cmr $$1) {
            cti $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cyo.b));
            cbp $$4 = new cbp($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dr(), $$4.dt(), $$4.dx(), arm.yB, arn.e, 1.0F, 1.0F);
            $$2.a(null, dnk.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      jj $$4 = new jk() {
         @Override
         protected cmr a(jg $$0, cmr $$1) {
            this.a(ckb.a($$0, $$1));
            return $$1;
         }
      };
      cyo.a(cmu.ui, $$4);
      cyo.a(cmu.uh, $$4);
      cyo.a(cmu.uj, $$4);
      cyo.a(cmu.ue, $$4);
      cyo.a(cmu.uk, $$4);
      cyo.a(cmu.ug, $$4);
      cyo.a(cmu.uf, new jk() {
         @Override
         protected cmr a(jg $$0, cmr $$1) {
            cti $$2 = $$0.b();
            ic $$3 = $$0.d().c(cyo.b);
            hx $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dga.b($$2, $$4, $$1)) {
               $$2.a($$4, cwl.gG.o().a(ddk.e, Integer.valueOf(dkg.a($$3))), 3);
               $$2.a(null, dnk.i, $$4);
               dgo $$5 = $$2.c_($$4);
               if ($$5 instanceof dhz) {
                  dga.a($$2, $$4, (dhz)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ckb.a($$0, $$1));
            }

            return $$1;
         }
      });
      cyo.a(cwl.ee, new jk() {
         @Override
         protected cmr a(jg $$0, cmr $$1) {
            cti $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cyo.b));
            cxd $$4 = (cxd)cwl.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dnk.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ckb.a($$0, $$1));
            }

            return $$1;
         }
      });
      cyo.a(cwl.kP.k(), new jm());

      for (clf $$5 : clf.values()) {
         cyo.a(ddh.a($$5).k(), new jm());
      }

      cyo.a(cmu.si.k(), new jk() {
         private final ji c = new ji();

         private cmr a(jg $$0, cmr $$1, cmr $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.b().a(null, dnk.y, $$0.c());
               return $$2.p();
            } else {
               if ($$0.e().a($$2.p()) < 0) {
                  this.c.dispense($$0, $$2.p());
               }

               return $$1;
            }
         }

         @Override
         public cmr a(jg $$0, cmr $$1) {
            this.a(false);
            amz $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cyo.b));
            dja $$4 = $$2.a_($$3);
            if ($$4.a(asb.aF, $$0x -> $$0x.b(cwd.c) && $$0x.b() instanceof cwd) && $$4.c(cwd.c) >= 5) {
               ((cwd)$$4.b()).a($$2, $$4, $$3, null, dgl.b.b);
               this.a(true);
               return this.a($$0, $$1, new cmr(cmu.wq));
            } else if ($$2.b_($$3).a(asg.a)) {
               this.a(true);
               return this.a($$0, $$1, cor.a(new cmr(cmu.sh), cos.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cyo.a(cmu.ft, new jk() {
         @Override
         public cmr a(jg $$0, cmr $$1) {
            ic $$2 = $$0.d().c(cyo.b);
            hx $$3 = $$0.c().a($$2);
            cti $$4 = $$0.b();
            dja $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(cwl.pl)) {
               if ($$5.c(dcq.d) != 4) {
                  dcq.a(null, $$4, $$3, $$5);
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
      cyo.a(cmu.rS.k(), new jl());
      cyo.a(cmu.wn, new jk() {
         @Override
         public cmr a(jg $$0, cmr $$1) {
            hx $$2 = $$0.c().a($$0.d().c(cyo.b));
            cti $$3 = $$0.b();
            dja $$4 = $$3.a_($$2);
            Optional<dja> $$5 = cmg.b($$4);
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
      cyo.a(cmu.sh, new ji() {
         private final ji c = new ji();

         @Override
         public cmr a(jg $$0, cmr $$1) {
            if (cor.d($$1) != cos.c) {
               return this.c.dispense($$0, $$1);
            } else {
               amz $$2 = $$0.b();
               hx $$3 = $$0.c();
               hx $$4 = $$0.c().a($$0.d().c(cyo.b));
               if (!$$2.a_($$4).a(asb.ca)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(jx.aj, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, arm.ch, arn.e, 1.0F, 1.0F);
                  $$2.a(null, dnk.z, $$3);
                  $$2.b($$4, cwl.sI.o());
                  return new cmr(cmu.si);
               }
            }
         }
      });
   }

   static elm a(jg $$0, blt<?> $$1, ic $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
