import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface jj {
   Logger a = LogUtils.getLogger();
   jj b = ($$0, $$1) -> $$1;

   cmy dispense(jg var1, cmy var2);

   static void c() {
      cyv.a(cnb.os, new jf() {
         @Override
         protected cga a(ctp $$0, ir $$1, cmy $$2) {
            cfq $$3 = new cfq($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cfo.a.b;
            return $$3;
         }
      });
      cyv.a(cnb.vj, new jf() {
         @Override
         protected cga a(ctp $$0, ir $$1, cmy $$2) {
            cfq $$3 = new cfq($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.a($$2);
            $$3.d = cfo.a.b;
            return $$3;
         }
      });
      cyv.a(cnb.vi, new jf() {
         @Override
         protected cga a(ctp $$0, ir $$1, cmy $$2) {
            cfo $$3 = new cgf($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cfo.a.b;
            return $$3;
         }
      });
      cyv.a(cnb.qO, new jf() {
         @Override
         protected cga a(ctp $$0, ir $$1, cmy $$2) {
            return ac.a(new cgi($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cyv.a(cnb.qz, new jf() {
         @Override
         protected cga a(ctp $$0, ir $$1, cmy $$2) {
            return ac.a(new cge($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cyv.a(cnb.tR, new jf() {
         @Override
         protected cga a(ctp $$0, ir $$1, cmy $$2) {
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
      });
      cyv.a(cnb.vh, new jj() {
         @Override
         public cmy dispense(jg $$0, cmy $$1) {
            return (new jf() {
               @Override
               protected cga a(ctp $$0, ir $$1, cmy $$2) {
                  return ac.a(new cgl($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cyv.a(cnb.vk, new jj() {
         @Override
         public cmy dispense(jg $$0, cmy $$1) {
            return (new jf() {
               @Override
               protected cga a(ctp $$0, ir $$1, cmy $$2) {
                  return ac.a(new cgl($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
         public cmy a(jg $$0, cmy $$1) {
            ic $$2 = $$0.d().c(cyv.b);
            blz<?> $$3 = ((cod)$$1.d()).a($$1.v());

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bmp.o, $$2 != ic.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cmy.f;
            }

            $$1.h(1);
            $$0.b().a(null, dnr.t, $$0.c());
            return $$1;
         }
      };

      for (cod $$1 : cod.h()) {
         cyv.a($$1, $$0);
      }

      cyv.a(cnb.uy, new ji() {
         @Override
         public cmy a(jg $$0, cmy $$1) {
            ic $$2 = $$0.d().c(cyv.b);
            hx $$3 = $$0.c().a($$2);
            and $$4 = $$0.b();
            Consumer<cbk> $$5 = blz.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            cbk $$6 = blz.d.a($$4, $$1.v(), $$5, $$3, bmp.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      cyv.a(cnb.nK, new jk() {
         @Override
         public cmy a(jg $$0, cmy $$1) {
            hx $$2 = $$0.c().a($$0.d().c(cyv.b));
            List<bml> $$3 = $$0.b().a(bml.class, new elo($$2), $$0x -> !($$0x instanceof bnb $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((bnb)$$3.get(0)).a(art.e);
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
         protected cmy a(jg $$0, cmy $$1) {
            hx $$2 = $$0.c().a($$0.d().c(cyv.b));

            for (bzx $$4 : $$0.b().a(bzx.class, new elo($$2), $$0x -> $$0x.bx() && $$0x.gN())) {
               if ($$4.l($$1) && !$$4.gO() && $$4.gt()) {
                  $$4.a_(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      cyv.a(cnb.uC, $$2);
      cyv.a(cnb.uz, $$2);
      cyv.a(cnb.uA, $$2);
      cyv.a(cnb.uB, $$2);
      cyv.a(cnb.hD, $$2);
      cyv.a(cnb.hE, $$2);
      cyv.a(cnb.hM, $$2);
      cyv.a(cnb.hO, $$2);
      cyv.a(cnb.hP, $$2);
      cyv.a(cnb.hS, $$2);
      cyv.a(cnb.hK, $$2);
      cyv.a(cnb.hQ, $$2);
      cyv.a(cnb.hG, $$2);
      cyv.a(cnb.hL, $$2);
      cyv.a(cnb.hI, $$2);
      cyv.a(cnb.hF, $$2);
      cyv.a(cnb.hJ, $$2);
      cyv.a(cnb.hN, $$2);
      cyv.a(cnb.hR, $$2);
      cyv.a(cnb.hH, $$2);
      cyv.a(cnb.eM, new jk() {
         @Override
         public cmy a(jg $$0, cmy $$1) {
            hx $$2 = $$0.c().a($$0.d().c(cyv.b));

            for (bzw $$4 : $$0.b().a(bzw.class, new elo($$2), $$0x -> $$0x.bx() && !$$0x.w())) {
               if ($$4.gt() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      cyv.a(cnb.un, new ji() {
         @Override
         public cmy a(jg $$0, cmy $$1) {
            ic $$2 = $$0.d().c(cyv.b);
            elt $$3 = jj.a($$0, blz.N, $$2);
            cfv $$4 = new cfv($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
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
      cyv.a(cnb.tS, new ji() {
         @Override
         public cmy a(jg $$0, cmy $$1) {
            ic $$2 = $$0.d().c(cyv.b);
            ir $$3 = cyv.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            ctp $$7 = $$0.b();
            auv $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            cgd $$12 = new cgd($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(jg $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      cyv.a(cnb.nT, new jh(chc.b.a));
      cyv.a(cnb.nV, new jh(chc.b.b));
      cyv.a(cnb.nX, new jh(chc.b.c));
      cyv.a(cnb.nZ, new jh(chc.b.d));
      cyv.a(cnb.of, new jh(chc.b.g));
      cyv.a(cnb.ob, new jh(chc.b.e));
      cyv.a(cnb.od, new jh(chc.b.f));
      cyv.a(cnb.oh, new jh(chc.b.h));
      cyv.a(cnb.oj, new jh(chc.b.i));
      cyv.a(cnb.nU, new jh(chc.b.a, true));
      cyv.a(cnb.nW, new jh(chc.b.b, true));
      cyv.a(cnb.nY, new jh(chc.b.c, true));
      cyv.a(cnb.oa, new jh(chc.b.d, true));
      cyv.a(cnb.og, new jh(chc.b.g, true));
      cyv.a(cnb.oc, new jh(chc.b.e, true));
      cyv.a(cnb.oe, new jh(chc.b.f, true));
      cyv.a(cnb.oi, new jh(chc.b.h, true));
      cyv.a(cnb.ok, new jh(chc.b.i, true));
      jj $$3 = new ji() {
         private final ji c = new ji();

         @Override
         public cmy a(jg $$0, cmy $$1) {
            clk $$2 = (clk)$$1.d();
            hx $$3 = $$0.c().a($$0.d().c(cyv.b));
            ctp $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cmy(cnb.qv);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      cyv.a(cnb.qx, $$3);
      cyv.a(cnb.qw, $$3);
      cyv.a(cnb.qy, $$3);
      cyv.a(cnb.qD, $$3);
      cyv.a(cnb.qE, $$3);
      cyv.a(cnb.qC, $$3);
      cyv.a(cnb.qF, $$3);
      cyv.a(cnb.qG, $$3);
      cyv.a(cnb.qH, $$3);
      cyv.a(cnb.qv, new ji() {
         private final ji c = new ji();

         @Override
         public cmy a(jg $$0, cmy $$1) {
            ctq $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cyv.b));
            djh $$4 = $$2.a_($$3);
            if ($$4.b() instanceof cwx $$6) {
               cmy $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dnr.y, $$3);
                  cmt $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new cmy($$8);
                  } else {
                     if ($$0.e().a(new cmy($$8)) < 0) {
                        this.c.dispense($$0, new cmy($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cyv.a(cnb.op, new jk() {
         @Override
         protected cmy a(jg $$0, cmy $$1) {
            ctp $$2 = $$0.b();
            this.a(true);
            ic $$3 = $$0.d().c(cyv.b);
            hx $$4 = $$0.c().a($$3);
            djh $$5 = $$2.a_($$4);
            if (cwd.a($$2, $$4, $$3)) {
               $$2.b($$4, cwd.a($$2, $$4));
               $$2.a(null, dnr.i, $$4);
            } else if (cxe.h($$5) || cxf.g($$5) || cxg.g($$5)) {
               $$2.b($$4, $$5.a(djx.r, Boolean.valueOf(true)));
               $$2.a(null, dnr.c, $$4);
            } else if ($$5.b() instanceof dey) {
               dey.a($$2, $$4);
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
      cyv.a(cnb.rv, new jk() {
         @Override
         protected cmy a(jg $$0, cmy $$1) {
            this.a(true);
            ctp $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cyv.b));
            if (!ckt.a($$1, $$2, $$3) && !ckt.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 0);
            }

            return $$1;
         }
      });
      cyv.a(cws.ck, new ji() {
         @Override
         protected cmy a(jg $$0, cmy $$1) {
            ctp $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cyv.b));
            cbv $$4 = new cbv($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dr(), $$4.dt(), $$4.dx(), ars.yB, art.e, 1.0F, 1.0F);
            $$2.a(null, dnr.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      jj $$4 = new jk() {
         @Override
         protected cmy a(jg $$0, cmy $$1) {
            this.a(cki.a($$0, $$1));
            return $$1;
         }
      };
      cyv.a(cnb.ui, $$4);
      cyv.a(cnb.uh, $$4);
      cyv.a(cnb.uj, $$4);
      cyv.a(cnb.ue, $$4);
      cyv.a(cnb.uk, $$4);
      cyv.a(cnb.ug, $$4);
      cyv.a(cnb.uf, new jk() {
         @Override
         protected cmy a(jg $$0, cmy $$1) {
            ctp $$2 = $$0.b();
            ic $$3 = $$0.d().c(cyv.b);
            hx $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dgh.b($$2, $$4, $$1)) {
               $$2.a($$4, cws.gG.o().a(ddr.e, Integer.valueOf(dkn.a($$3))), 3);
               $$2.a(null, dnr.i, $$4);
               dgv $$5 = $$2.c_($$4);
               if ($$5 instanceof dig) {
                  dgh.a($$2, $$4, (dig)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cki.a($$0, $$1));
            }

            return $$1;
         }
      });
      cyv.a(cws.ee, new jk() {
         @Override
         protected cmy a(jg $$0, cmy $$1) {
            ctp $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cyv.b));
            cxk $$4 = (cxk)cws.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dnr.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cki.a($$0, $$1));
            }

            return $$1;
         }
      });
      cyv.a(cws.kP.k(), new jm());

      for (clm $$5 : clm.values()) {
         cyv.a(ddo.a($$5).k(), new jm());
      }

      cyv.a(cnb.si.k(), new jk() {
         private final ji c = new ji();

         private cmy a(jg $$0, cmy $$1, cmy $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.b().a(null, dnr.y, $$0.c());
               return $$2.p();
            } else {
               if ($$0.e().a($$2.p()) < 0) {
                  this.c.dispense($$0, $$2.p());
               }

               return $$1;
            }
         }

         @Override
         public cmy a(jg $$0, cmy $$1) {
            this.a(false);
            and $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cyv.b));
            djh $$4 = $$2.a_($$3);
            if ($$4.a(ash.aF, $$0x -> $$0x.b(cwk.c) && $$0x.b() instanceof cwk) && $$4.c(cwk.c) >= 5) {
               ((cwk)$$4.b()).a($$2, $$4, $$3, null, dgs.b.b);
               this.a(true);
               return this.a($$0, $$1, new cmy(cnb.wq));
            } else if ($$2.b_($$3).a(asm.a)) {
               this.a(true);
               return this.a($$0, $$1, coy.a(new cmy(cnb.sh), coz.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cyv.a(cnb.ft, new jk() {
         @Override
         public cmy a(jg $$0, cmy $$1) {
            ic $$2 = $$0.d().c(cyv.b);
            hx $$3 = $$0.c().a($$2);
            ctp $$4 = $$0.b();
            djh $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(cws.pl)) {
               if ($$5.c(dcx.d) != 4) {
                  dcx.a(null, $$4, $$3, $$5);
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
      cyv.a(cnb.rS.k(), new jl());
      cyv.a(cnb.wn, new jk() {
         @Override
         public cmy a(jg $$0, cmy $$1) {
            hx $$2 = $$0.c().a($$0.d().c(cyv.b));
            ctp $$3 = $$0.b();
            djh $$4 = $$3.a_($$2);
            Optional<djh> $$5 = cmn.b($$4);
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
      cyv.a(cnb.sh, new ji() {
         private final ji c = new ji();

         @Override
         public cmy a(jg $$0, cmy $$1) {
            if (coy.d($$1) != coz.c) {
               return this.c.dispense($$0, $$1);
            } else {
               and $$2 = $$0.b();
               hx $$3 = $$0.c();
               hx $$4 = $$0.c().a($$0.d().c(cyv.b));
               if (!$$2.a_($$4).a(ash.ca)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(jx.aj, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, ars.ch, art.e, 1.0F, 1.0F);
                  $$2.a(null, dnr.z, $$3);
                  $$2.b($$4, cws.sI.o());
                  return new cmy(cnb.si);
               }
            }
         }
      });
   }

   static elt a(jg $$0, blz<?> $$1, ic $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
