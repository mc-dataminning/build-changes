import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface je {
   Logger a = LogUtils.getLogger();
   je b = ($$0, $$1) -> $$1;

   clj dispense(jb var1, clj var2);

   static void c() {
      cxf.a(clm.os, new ja() {
         @Override
         protected cem a(csa $$0, im $$1, clj $$2) {
            cec $$3 = new cec($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cea.a.b;
            return $$3;
         }
      });
      cxf.a(clm.vi, new ja() {
         @Override
         protected cem a(csa $$0, im $$1, clj $$2) {
            cec $$3 = new cec($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.a($$2);
            $$3.d = cea.a.b;
            return $$3;
         }
      });
      cxf.a(clm.vh, new ja() {
         @Override
         protected cem a(csa $$0, im $$1, clj $$2) {
            cea $$3 = new cer($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cea.a.b;
            return $$3;
         }
      });
      cxf.a(clm.qO, new ja() {
         @Override
         protected cem a(csa $$0, im $$1, clj $$2) {
            return ac.a(new ceu($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cxf.a(clm.qz, new ja() {
         @Override
         protected cem a(csa $$0, im $$1, clj $$2) {
            return ac.a(new ceq($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cxf.a(clm.tQ, new ja() {
         @Override
         protected cem a(csa $$0, im $$1, clj $$2) {
            return ac.a(new cew($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cxf.a(clm.vg, new je() {
         @Override
         public clj dispense(jb $$0, clj $$1) {
            return (new ja() {
               @Override
               protected cem a(csa $$0, im $$1, clj $$2) {
                  return ac.a(new cex($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cxf.a(clm.vj, new je() {
         @Override
         public clj dispense(jb $$0, clj $$1) {
            return (new ja() {
               @Override
               protected cem a(csa $$0, im $$1, clj $$2) {
                  return ac.a(new cex($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      jd $$0 = new jd() {
         @Override
         public clj a(jb $$0, clj $$1) {
            hx $$2 = $$0.d().c(cxf.b);
            bku<?> $$3 = ((cmo)$$1.d()).a($$1.v());

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), blk.o, $$2 != hx.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return clj.b;
            }

            $$1.h(1);
            $$0.b().a(null, dls.t, $$0.c());
            return $$1;
         }
      };

      for (cmo $$1 : cmo.h()) {
         cxf.a($$1, $$0);
      }

      cxf.a(clm.ux, new jd() {
         @Override
         public clj a(jb $$0, clj $$1) {
            hx $$2 = $$0.d().c(cxf.b);
            ht $$3 = $$0.c().a($$2);
            ame $$4 = $$0.b();
            Consumer<cad> $$5 = bku.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            cad $$6 = bku.d.a($$4, $$1.v(), $$5, $$3, blk.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      cxf.a(clm.nK, new jf() {
         @Override
         public clj a(jb $$0, clj $$1) {
            ht $$2 = $$0.c().a($$0.d().c(cxf.b));
            List<blg> $$3 = $$0.b().a(blg.class, new ejp($$2), $$0x -> !($$0x instanceof blw $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((blw)$$3.get(0)).a(aqs.e);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      jd $$2 = new jf() {
         @Override
         protected clj a(jb $$0, clj $$1) {
            ht $$2 = $$0.c().a($$0.d().c(cxf.b));

            for (byq $$4 : $$0.b().a(byq.class, new ejp($$2), $$0x -> $$0x.bx() && $$0x.gO())) {
               if ($$4.l($$1) && !$$4.gP() && $$4.gu()) {
                  $$4.a_(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      cxf.a(clm.uB, $$2);
      cxf.a(clm.uy, $$2);
      cxf.a(clm.uz, $$2);
      cxf.a(clm.uA, $$2);
      cxf.a(clm.hD, $$2);
      cxf.a(clm.hE, $$2);
      cxf.a(clm.hM, $$2);
      cxf.a(clm.hO, $$2);
      cxf.a(clm.hP, $$2);
      cxf.a(clm.hS, $$2);
      cxf.a(clm.hK, $$2);
      cxf.a(clm.hQ, $$2);
      cxf.a(clm.hG, $$2);
      cxf.a(clm.hL, $$2);
      cxf.a(clm.hI, $$2);
      cxf.a(clm.hF, $$2);
      cxf.a(clm.hJ, $$2);
      cxf.a(clm.hN, $$2);
      cxf.a(clm.hR, $$2);
      cxf.a(clm.hH, $$2);
      cxf.a(clm.eM, new jf() {
         @Override
         public clj a(jb $$0, clj $$1) {
            ht $$2 = $$0.c().a($$0.d().c(cxf.b));

            for (byp $$4 : $$0.b().a(byp.class, new ejp($$2), $$0x -> $$0x.bx() && !$$0x.w())) {
               if ($$4.gu() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      cxf.a(clm.um, new jd() {
         @Override
         public clj a(jb $$0, clj $$1) {
            hx $$2 = $$0.d().c(cxf.b);
            eju $$3 = je.a($$0, bku.M, $$2);
            ceh $$4 = new ceh($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
            $$4.c((double)$$2.j(), (double)$$2.k(), (double)$$2.l(), 0.5F, 1.0F);
            $$0.b().b($$4);
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(jb $$0) {
            $$0.b().c(1004, $$0.c(), 0);
         }
      });
      cxf.a(clm.tR, new jd() {
         @Override
         public clj a(jb $$0, clj $$1) {
            hx $$2 = $$0.d().c(cxf.b);
            im $$3 = cxf.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            csa $$7 = $$0.b();
            ats $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            cep $$12 = new cep($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(jb $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      cxf.a(clm.nT, new jc(cfn.b.a));
      cxf.a(clm.nV, new jc(cfn.b.b));
      cxf.a(clm.nX, new jc(cfn.b.c));
      cxf.a(clm.nZ, new jc(cfn.b.d));
      cxf.a(clm.of, new jc(cfn.b.g));
      cxf.a(clm.ob, new jc(cfn.b.e));
      cxf.a(clm.od, new jc(cfn.b.f));
      cxf.a(clm.oh, new jc(cfn.b.h));
      cxf.a(clm.oj, new jc(cfn.b.i));
      cxf.a(clm.nU, new jc(cfn.b.a, true));
      cxf.a(clm.nW, new jc(cfn.b.b, true));
      cxf.a(clm.nY, new jc(cfn.b.c, true));
      cxf.a(clm.oa, new jc(cfn.b.d, true));
      cxf.a(clm.og, new jc(cfn.b.g, true));
      cxf.a(clm.oc, new jc(cfn.b.e, true));
      cxf.a(clm.oe, new jc(cfn.b.f, true));
      cxf.a(clm.oi, new jc(cfn.b.h, true));
      cxf.a(clm.ok, new jc(cfn.b.i, true));
      je $$3 = new jd() {
         private final jd c = new jd();

         @Override
         public clj a(jb $$0, clj $$1) {
            cjv $$2 = (cjv)$$1.d();
            ht $$3 = $$0.c().a($$0.d().c(cxf.b));
            csa $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new clj(clm.qv);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      cxf.a(clm.qx, $$3);
      cxf.a(clm.qw, $$3);
      cxf.a(clm.qy, $$3);
      cxf.a(clm.qD, $$3);
      cxf.a(clm.qE, $$3);
      cxf.a(clm.qC, $$3);
      cxf.a(clm.qF, $$3);
      cxf.a(clm.qG, $$3);
      cxf.a(clm.qH, $$3);
      cxf.a(clm.qv, new jd() {
         private final jd c = new jd();

         @Override
         public clj a(jb $$0, clj $$1) {
            csb $$2 = $$0.b();
            ht $$3 = $$0.c().a($$0.d().c(cxf.b));
            dhi $$4 = $$2.a_($$3);
            if ($$4.b() instanceof cvh $$6) {
               clj $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dls.y, $$3);
                  cle $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new clj($$8);
                  } else {
                     if ($$0.e().a(new clj($$8)) < 0) {
                        this.c.dispense($$0, new clj($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cxf.a(clm.op, new jf() {
         @Override
         protected clj a(jb $$0, clj $$1) {
            csa $$2 = $$0.b();
            this.a(true);
            hx $$3 = $$0.d().c(cxf.b);
            ht $$4 = $$0.c().a($$3);
            dhi $$5 = $$2.a_($$4);
            if (cun.a($$2, $$4, $$3)) {
               $$2.b($$4, cun.a($$2, $$4));
               $$2.a(null, dls.i, $$4);
            } else if (cvo.h($$5) || cvp.g($$5) || cvq.g($$5)) {
               $$2.b($$4, $$5.a(dhy.r, Boolean.valueOf(true)));
               $$2.a(null, dls.c, $$4);
            } else if ($$5.b() instanceof ddi) {
               ddi.a($$2, $$4);
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
      cxf.a(clm.rv, new jf() {
         @Override
         protected clj a(jb $$0, clj $$1) {
            this.a(true);
            csa $$2 = $$0.b();
            ht $$3 = $$0.c().a($$0.d().c(cxf.b));
            if (!cje.a($$1, $$2, $$3) && !cje.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 0);
            }

            return $$1;
         }
      });
      cxf.a(cvc.ck, new jd() {
         @Override
         protected clj a(jb $$0, clj $$1) {
            csa $$2 = $$0.b();
            ht $$3 = $$0.c().a($$0.d().c(cxf.b));
            cao $$4 = new cao($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.ds(), $$4.du(), $$4.dy(), aqr.yg, aqs.e, 1.0F, 1.0F);
            $$2.a(null, dls.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      je $$4 = new jf() {
         @Override
         protected clj a(jb $$0, clj $$1) {
            this.a(cit.a($$0, $$1));
            return $$1;
         }
      };
      cxf.a(clm.uh, $$4);
      cxf.a(clm.ug, $$4);
      cxf.a(clm.ui, $$4);
      cxf.a(clm.ud, $$4);
      cxf.a(clm.uj, $$4);
      cxf.a(clm.uf, $$4);
      cxf.a(clm.ue, new jf() {
         @Override
         protected clj a(jb $$0, clj $$1) {
            csa $$2 = $$0.b();
            hx $$3 = $$0.d().c(cxf.b);
            ht $$4 = $$0.c().a($$3);
            if ($$2.t($$4) && dep.b($$2, $$4, $$1)) {
               $$2.a($$4, cvc.gG.o().a(dcb.e, Integer.valueOf(dio.a($$3))), 3);
               $$2.a(null, dls.i, $$4);
               dfd $$5 = $$2.c_($$4);
               if ($$5 instanceof dgo) {
                  dep.a($$2, $$4, (dgo)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cit.a($$0, $$1));
            }

            return $$1;
         }
      });
      cxf.a(cvc.ee, new jf() {
         @Override
         protected clj a(jb $$0, clj $$1) {
            csa $$2 = $$0.b();
            ht $$3 = $$0.c().a($$0.d().c(cxf.b));
            cvu $$4 = (cvu)cvc.ee;
            if ($$2.t($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dls.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cit.a($$0, $$1));
            }

            return $$1;
         }
      });
      cxf.a(cvc.kP.k(), new jh());

      for (cjx $$5 : cjx.values()) {
         cxf.a(dby.a($$5).k(), new jh());
      }

      cxf.a(clm.si.k(), new jf() {
         private final jd c = new jd();

         private clj a(jb $$0, clj $$1, clj $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.b().a(null, dls.y, $$0.c());
               return $$2.p();
            } else {
               if ($$0.e().a($$2.p()) < 0) {
                  this.c.dispense($$0, $$2.p());
               }

               return $$1;
            }
         }

         @Override
         public clj a(jb $$0, clj $$1) {
            this.a(false);
            ame $$2 = $$0.b();
            ht $$3 = $$0.c().a($$0.d().c(cxf.b));
            dhi $$4 = $$2.a_($$3);
            if ($$4.a(arg.aF, $$0x -> $$0x.b(cuu.c) && $$0x.b() instanceof cuu) && $$4.c(cuu.c) >= 5) {
               ((cuu)$$4.b()).a($$2, $$4, $$3, null, dfa.b.b);
               this.a(true);
               return this.a($$0, $$1, new clj(clm.wp));
            } else if ($$2.b_($$3).a(arl.a)) {
               this.a(true);
               return this.a($$0, $$1, cni.a(new clj(clm.sh), cnj.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cxf.a(clm.ft, new jf() {
         @Override
         public clj a(jb $$0, clj $$1) {
            hx $$2 = $$0.d().c(cxf.b);
            ht $$3 = $$0.c().a($$2);
            csa $$4 = $$0.b();
            dhi $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(cvc.pl)) {
               if ($$5.c(dbh.d) != 4) {
                  dbh.a(null, $$4, $$3, $$5);
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
      cxf.a(clm.rS.k(), new jg());
      cxf.a(clm.wm, new jf() {
         @Override
         public clj a(jb $$0, clj $$1) {
            ht $$2 = $$0.c().a($$0.d().c(cxf.b));
            csa $$3 = $$0.b();
            dhi $$4 = $$3.a_($$2);
            Optional<dhi> $$5 = cky.b($$4);
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
      cxf.a(clm.sh, new jd() {
         private final jd c = new jd();

         @Override
         public clj a(jb $$0, clj $$1) {
            if (cni.d($$1) != cnj.c) {
               return this.c.dispense($$0, $$1);
            } else {
               ame $$2 = $$0.b();
               ht $$3 = $$0.c();
               ht $$4 = $$0.c().a($$0.d().c(cxf.b));
               if (!$$2.a_($$4).a(arg.ca)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(js.ah, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, aqr.ch, aqs.e, 1.0F, 1.0F);
                  $$2.a(null, dls.z, $$3);
                  $$2.b($$4, cvc.sI.o());
                  return new clj(clm.si);
               }
            }
         }
      });
   }

   static eju a(jb $$0, bku<?> $$1, hx $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
