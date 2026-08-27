import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface jj {
   Logger a = LogUtils.getLogger();
   jj b = ($$0, $$1) -> $$1;

   cmx dispense(jg var1, cmx var2);

   static void c() {
      cyu.a(cna.os, new jf() {
         @Override
         protected cfz a(cto $$0, ir $$1, cmx $$2) {
            cfp $$3 = new cfp($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cfn.a.b;
            return $$3;
         }
      });
      cyu.a(cna.vj, new jf() {
         @Override
         protected cfz a(cto $$0, ir $$1, cmx $$2) {
            cfp $$3 = new cfp($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.a($$2);
            $$3.d = cfn.a.b;
            return $$3;
         }
      });
      cyu.a(cna.vi, new jf() {
         @Override
         protected cfz a(cto $$0, ir $$1, cmx $$2) {
            cfn $$3 = new cge($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cfn.a.b;
            return $$3;
         }
      });
      cyu.a(cna.qO, new jf() {
         @Override
         protected cfz a(cto $$0, ir $$1, cmx $$2) {
            return ac.a(new cgh($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cyu.a(cna.qz, new jf() {
         @Override
         protected cfz a(cto $$0, ir $$1, cmx $$2) {
            return ac.a(new cgd($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cyu.a(cna.tR, new jf() {
         @Override
         protected cfz a(cto $$0, ir $$1, cmx $$2) {
            return ac.a(new cgj($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cyu.a(cna.vh, new jj() {
         @Override
         public cmx dispense(jg $$0, cmx $$1) {
            return (new jf() {
               @Override
               protected cfz a(cto $$0, ir $$1, cmx $$2) {
                  return ac.a(new cgk($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cyu.a(cna.vk, new jj() {
         @Override
         public cmx dispense(jg $$0, cmx $$1) {
            return (new jf() {
               @Override
               protected cfz a(cto $$0, ir $$1, cmx $$2) {
                  return ac.a(new cgk($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
         public cmx a(jg $$0, cmx $$1) {
            ic $$2 = $$0.d().c(cyu.b);
            bly<?> $$3 = ((coc)$$1.d()).a($$1.v());

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bmo.o, $$2 != ic.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cmx.f;
            }

            $$1.h(1);
            $$0.b().a(null, dnq.t, $$0.c());
            return $$1;
         }
      };

      for (coc $$1 : coc.h()) {
         cyu.a($$1, $$0);
      }

      cyu.a(cna.uy, new ji() {
         @Override
         public cmx a(jg $$0, cmx $$1) {
            ic $$2 = $$0.d().c(cyu.b);
            hx $$3 = $$0.c().a($$2);
            and $$4 = $$0.b();
            Consumer<cbj> $$5 = bly.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            cbj $$6 = bly.d.a($$4, $$1.v(), $$5, $$3, bmo.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      cyu.a(cna.nK, new jk() {
         @Override
         public cmx a(jg $$0, cmx $$1) {
            hx $$2 = $$0.c().a($$0.d().c(cyu.b));
            List<bmk> $$3 = $$0.b().a(bmk.class, new eln($$2), $$0x -> !($$0x instanceof bna $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((bna)$$3.get(0)).a(ars.e);
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
         protected cmx a(jg $$0, cmx $$1) {
            hx $$2 = $$0.c().a($$0.d().c(cyu.b));

            for (bzw $$4 : $$0.b().a(bzw.class, new eln($$2), $$0x -> $$0x.bx() && $$0x.gN())) {
               if ($$4.l($$1) && !$$4.gO() && $$4.gt()) {
                  $$4.a_(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      cyu.a(cna.uC, $$2);
      cyu.a(cna.uz, $$2);
      cyu.a(cna.uA, $$2);
      cyu.a(cna.uB, $$2);
      cyu.a(cna.hD, $$2);
      cyu.a(cna.hE, $$2);
      cyu.a(cna.hM, $$2);
      cyu.a(cna.hO, $$2);
      cyu.a(cna.hP, $$2);
      cyu.a(cna.hS, $$2);
      cyu.a(cna.hK, $$2);
      cyu.a(cna.hQ, $$2);
      cyu.a(cna.hG, $$2);
      cyu.a(cna.hL, $$2);
      cyu.a(cna.hI, $$2);
      cyu.a(cna.hF, $$2);
      cyu.a(cna.hJ, $$2);
      cyu.a(cna.hN, $$2);
      cyu.a(cna.hR, $$2);
      cyu.a(cna.hH, $$2);
      cyu.a(cna.eM, new jk() {
         @Override
         public cmx a(jg $$0, cmx $$1) {
            hx $$2 = $$0.c().a($$0.d().c(cyu.b));

            for (bzv $$4 : $$0.b().a(bzv.class, new eln($$2), $$0x -> $$0x.bx() && !$$0x.w())) {
               if ($$4.gt() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      cyu.a(cna.un, new ji() {
         @Override
         public cmx a(jg $$0, cmx $$1) {
            ic $$2 = $$0.d().c(cyu.b);
            els $$3 = jj.a($$0, bly.N, $$2);
            cfu $$4 = new cfu($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
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
      cyu.a(cna.tS, new ji() {
         @Override
         public cmx a(jg $$0, cmx $$1) {
            ic $$2 = $$0.d().c(cyu.b);
            ir $$3 = cyu.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            cto $$7 = $$0.b();
            auu $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            cgc $$12 = new cgc($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(jg $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      cyu.a(cna.nT, new jh(chb.b.a));
      cyu.a(cna.nV, new jh(chb.b.b));
      cyu.a(cna.nX, new jh(chb.b.c));
      cyu.a(cna.nZ, new jh(chb.b.d));
      cyu.a(cna.of, new jh(chb.b.g));
      cyu.a(cna.ob, new jh(chb.b.e));
      cyu.a(cna.od, new jh(chb.b.f));
      cyu.a(cna.oh, new jh(chb.b.h));
      cyu.a(cna.oj, new jh(chb.b.i));
      cyu.a(cna.nU, new jh(chb.b.a, true));
      cyu.a(cna.nW, new jh(chb.b.b, true));
      cyu.a(cna.nY, new jh(chb.b.c, true));
      cyu.a(cna.oa, new jh(chb.b.d, true));
      cyu.a(cna.og, new jh(chb.b.g, true));
      cyu.a(cna.oc, new jh(chb.b.e, true));
      cyu.a(cna.oe, new jh(chb.b.f, true));
      cyu.a(cna.oi, new jh(chb.b.h, true));
      cyu.a(cna.ok, new jh(chb.b.i, true));
      jj $$3 = new ji() {
         private final ji c = new ji();

         @Override
         public cmx a(jg $$0, cmx $$1) {
            clj $$2 = (clj)$$1.d();
            hx $$3 = $$0.c().a($$0.d().c(cyu.b));
            cto $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cmx(cna.qv);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      cyu.a(cna.qx, $$3);
      cyu.a(cna.qw, $$3);
      cyu.a(cna.qy, $$3);
      cyu.a(cna.qD, $$3);
      cyu.a(cna.qE, $$3);
      cyu.a(cna.qC, $$3);
      cyu.a(cna.qF, $$3);
      cyu.a(cna.qG, $$3);
      cyu.a(cna.qH, $$3);
      cyu.a(cna.qv, new ji() {
         private final ji c = new ji();

         @Override
         public cmx a(jg $$0, cmx $$1) {
            ctp $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cyu.b));
            djg $$4 = $$2.a_($$3);
            if ($$4.b() instanceof cww $$6) {
               cmx $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dnq.y, $$3);
                  cms $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new cmx($$8);
                  } else {
                     if ($$0.e().a(new cmx($$8)) < 0) {
                        this.c.dispense($$0, new cmx($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cyu.a(cna.op, new jk() {
         @Override
         protected cmx a(jg $$0, cmx $$1) {
            cto $$2 = $$0.b();
            this.a(true);
            ic $$3 = $$0.d().c(cyu.b);
            hx $$4 = $$0.c().a($$3);
            djg $$5 = $$2.a_($$4);
            if (cwc.a($$2, $$4, $$3)) {
               $$2.b($$4, cwc.a($$2, $$4));
               $$2.a(null, dnq.i, $$4);
            } else if (cxd.h($$5) || cxe.g($$5) || cxf.g($$5)) {
               $$2.b($$4, $$5.a(djw.r, Boolean.valueOf(true)));
               $$2.a(null, dnq.c, $$4);
            } else if ($$5.b() instanceof dex) {
               dex.a($$2, $$4);
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
      cyu.a(cna.rv, new jk() {
         @Override
         protected cmx a(jg $$0, cmx $$1) {
            this.a(true);
            cto $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cyu.b));
            if (!cks.a($$1, $$2, $$3) && !cks.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 0);
            }

            return $$1;
         }
      });
      cyu.a(cwr.ck, new ji() {
         @Override
         protected cmx a(jg $$0, cmx $$1) {
            cto $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cyu.b));
            cbu $$4 = new cbu($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dr(), $$4.dt(), $$4.dx(), arr.yB, ars.e, 1.0F, 1.0F);
            $$2.a(null, dnq.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      jj $$4 = new jk() {
         @Override
         protected cmx a(jg $$0, cmx $$1) {
            this.a(ckh.a($$0, $$1));
            return $$1;
         }
      };
      cyu.a(cna.ui, $$4);
      cyu.a(cna.uh, $$4);
      cyu.a(cna.uj, $$4);
      cyu.a(cna.ue, $$4);
      cyu.a(cna.uk, $$4);
      cyu.a(cna.ug, $$4);
      cyu.a(cna.uf, new jk() {
         @Override
         protected cmx a(jg $$0, cmx $$1) {
            cto $$2 = $$0.b();
            ic $$3 = $$0.d().c(cyu.b);
            hx $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dgg.b($$2, $$4, $$1)) {
               $$2.a($$4, cwr.gG.o().a(ddq.e, Integer.valueOf(dkm.a($$3))), 3);
               $$2.a(null, dnq.i, $$4);
               dgu $$5 = $$2.c_($$4);
               if ($$5 instanceof dif) {
                  dgg.a($$2, $$4, (dif)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ckh.a($$0, $$1));
            }

            return $$1;
         }
      });
      cyu.a(cwr.ee, new jk() {
         @Override
         protected cmx a(jg $$0, cmx $$1) {
            cto $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cyu.b));
            cxj $$4 = (cxj)cwr.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dnq.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ckh.a($$0, $$1));
            }

            return $$1;
         }
      });
      cyu.a(cwr.kP.k(), new jm());

      for (cll $$5 : cll.values()) {
         cyu.a(ddn.a($$5).k(), new jm());
      }

      cyu.a(cna.si.k(), new jk() {
         private final ji c = new ji();

         private cmx a(jg $$0, cmx $$1, cmx $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.b().a(null, dnq.y, $$0.c());
               return $$2.p();
            } else {
               if ($$0.e().a($$2.p()) < 0) {
                  this.c.dispense($$0, $$2.p());
               }

               return $$1;
            }
         }

         @Override
         public cmx a(jg $$0, cmx $$1) {
            this.a(false);
            and $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cyu.b));
            djg $$4 = $$2.a_($$3);
            if ($$4.a(asg.aF, $$0x -> $$0x.b(cwj.c) && $$0x.b() instanceof cwj) && $$4.c(cwj.c) >= 5) {
               ((cwj)$$4.b()).a($$2, $$4, $$3, null, dgr.b.b);
               this.a(true);
               return this.a($$0, $$1, new cmx(cna.wq));
            } else if ($$2.b_($$3).a(asl.a)) {
               this.a(true);
               return this.a($$0, $$1, cox.a(new cmx(cna.sh), coy.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cyu.a(cna.ft, new jk() {
         @Override
         public cmx a(jg $$0, cmx $$1) {
            ic $$2 = $$0.d().c(cyu.b);
            hx $$3 = $$0.c().a($$2);
            cto $$4 = $$0.b();
            djg $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(cwr.pl)) {
               if ($$5.c(dcw.d) != 4) {
                  dcw.a(null, $$4, $$3, $$5);
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
      cyu.a(cna.rS.k(), new jl());
      cyu.a(cna.wn, new jk() {
         @Override
         public cmx a(jg $$0, cmx $$1) {
            hx $$2 = $$0.c().a($$0.d().c(cyu.b));
            cto $$3 = $$0.b();
            djg $$4 = $$3.a_($$2);
            Optional<djg> $$5 = cmm.b($$4);
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
      cyu.a(cna.sh, new ji() {
         private final ji c = new ji();

         @Override
         public cmx a(jg $$0, cmx $$1) {
            if (cox.d($$1) != coy.c) {
               return this.c.dispense($$0, $$1);
            } else {
               and $$2 = $$0.b();
               hx $$3 = $$0.c();
               hx $$4 = $$0.c().a($$0.d().c(cyu.b));
               if (!$$2.a_($$4).a(asg.ca)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(jx.aj, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, arr.ch, ars.e, 1.0F, 1.0F);
                  $$2.a(null, dnq.z, $$3);
                  $$2.b($$4, cwr.sI.o());
                  return new cmx(cna.si);
               }
            }
         }
      });
   }

   static els a(jg $$0, bly<?> $$1, ic $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
