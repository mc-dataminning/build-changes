import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface ji {
   Logger a = LogUtils.getLogger();
   ji b = ($$0, $$1) -> $$1;

   clo dispense(jf var1, clo var2);

   static void c() {
      cxk.a(clr.os, new je() {
         @Override
         protected cer a(csf $$0, iq $$1, clo $$2) {
            ceh $$3 = new ceh($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cef.a.b;
            return $$3;
         }
      });
      cxk.a(clr.vi, new je() {
         @Override
         protected cer a(csf $$0, iq $$1, clo $$2) {
            ceh $$3 = new ceh($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.a($$2);
            $$3.d = cef.a.b;
            return $$3;
         }
      });
      cxk.a(clr.vh, new je() {
         @Override
         protected cer a(csf $$0, iq $$1, clo $$2) {
            cef $$3 = new cew($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = cef.a.b;
            return $$3;
         }
      });
      cxk.a(clr.qO, new je() {
         @Override
         protected cer a(csf $$0, iq $$1, clo $$2) {
            return ac.a(new cez($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cxk.a(clr.qz, new je() {
         @Override
         protected cer a(csf $$0, iq $$1, clo $$2) {
            return ac.a(new cev($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cxk.a(clr.tQ, new je() {
         @Override
         protected cer a(csf $$0, iq $$1, clo $$2) {
            return ac.a(new cfb($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cxk.a(clr.vg, new ji() {
         @Override
         public clo dispense(jf $$0, clo $$1) {
            return (new je() {
               @Override
               protected cer a(csf $$0, iq $$1, clo $$2) {
                  return ac.a(new cfc($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cxk.a(clr.vj, new ji() {
         @Override
         public clo dispense(jf $$0, clo $$1) {
            return (new je() {
               @Override
               protected cer a(csf $$0, iq $$1, clo $$2) {
                  return ac.a(new cfc($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      jh $$0 = new jh() {
         @Override
         public clo a(jf $$0, clo $$1) {
            ib $$2 = $$0.d().c(cxk.b);
            bkz<?> $$3 = ((cmt)$$1.d()).a($$1.v());

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), blp.o, $$2 != ib.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return clo.b;
            }

            $$1.h(1);
            $$0.b().a(null, dlx.t, $$0.c());
            return $$1;
         }
      };

      for (cmt $$1 : cmt.h()) {
         cxk.a($$1, $$0);
      }

      cxk.a(clr.ux, new jh() {
         @Override
         public clo a(jf $$0, clo $$1) {
            ib $$2 = $$0.d().c(cxk.b);
            hx $$3 = $$0.c().a($$2);
            ami $$4 = $$0.b();
            Consumer<cai> $$5 = bkz.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            cai $$6 = bkz.d.a($$4, $$1.v(), $$5, $$3, blp.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      cxk.a(clr.nK, new jj() {
         @Override
         public clo a(jf $$0, clo $$1) {
            hx $$2 = $$0.c().a($$0.d().c(cxk.b));
            List<bll> $$3 = $$0.b().a(bll.class, new eju($$2), $$0x -> !($$0x instanceof bmb $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((bmb)$$3.get(0)).a(aqw.e);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      jh $$2 = new jj() {
         @Override
         protected clo a(jf $$0, clo $$1) {
            hx $$2 = $$0.c().a($$0.d().c(cxk.b));

            for (byv $$4 : $$0.b().a(byv.class, new eju($$2), $$0x -> $$0x.bx() && $$0x.gO())) {
               if ($$4.l($$1) && !$$4.gP() && $$4.gu()) {
                  $$4.a_(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      cxk.a(clr.uB, $$2);
      cxk.a(clr.uy, $$2);
      cxk.a(clr.uz, $$2);
      cxk.a(clr.uA, $$2);
      cxk.a(clr.hD, $$2);
      cxk.a(clr.hE, $$2);
      cxk.a(clr.hM, $$2);
      cxk.a(clr.hO, $$2);
      cxk.a(clr.hP, $$2);
      cxk.a(clr.hS, $$2);
      cxk.a(clr.hK, $$2);
      cxk.a(clr.hQ, $$2);
      cxk.a(clr.hG, $$2);
      cxk.a(clr.hL, $$2);
      cxk.a(clr.hI, $$2);
      cxk.a(clr.hF, $$2);
      cxk.a(clr.hJ, $$2);
      cxk.a(clr.hN, $$2);
      cxk.a(clr.hR, $$2);
      cxk.a(clr.hH, $$2);
      cxk.a(clr.eM, new jj() {
         @Override
         public clo a(jf $$0, clo $$1) {
            hx $$2 = $$0.c().a($$0.d().c(cxk.b));

            for (byu $$4 : $$0.b().a(byu.class, new eju($$2), $$0x -> $$0x.bx() && !$$0x.w())) {
               if ($$4.gu() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      cxk.a(clr.um, new jh() {
         @Override
         public clo a(jf $$0, clo $$1) {
            ib $$2 = $$0.d().c(cxk.b);
            ejz $$3 = ji.a($$0, bkz.M, $$2);
            cem $$4 = new cem($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
            $$4.c((double)$$2.j(), (double)$$2.k(), (double)$$2.l(), 0.5F, 1.0F);
            $$0.b().b($$4);
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(jf $$0) {
            $$0.b().c(1004, $$0.c(), 0);
         }
      });
      cxk.a(clr.tR, new jh() {
         @Override
         public clo a(jf $$0, clo $$1) {
            ib $$2 = $$0.d().c(cxk.b);
            iq $$3 = cxk.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            csf $$7 = $$0.b();
            atw $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            ceu $$12 = new ceu($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(jf $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      cxk.a(clr.nT, new jg(cfs.b.a));
      cxk.a(clr.nV, new jg(cfs.b.b));
      cxk.a(clr.nX, new jg(cfs.b.c));
      cxk.a(clr.nZ, new jg(cfs.b.d));
      cxk.a(clr.of, new jg(cfs.b.g));
      cxk.a(clr.ob, new jg(cfs.b.e));
      cxk.a(clr.od, new jg(cfs.b.f));
      cxk.a(clr.oh, new jg(cfs.b.h));
      cxk.a(clr.oj, new jg(cfs.b.i));
      cxk.a(clr.nU, new jg(cfs.b.a, true));
      cxk.a(clr.nW, new jg(cfs.b.b, true));
      cxk.a(clr.nY, new jg(cfs.b.c, true));
      cxk.a(clr.oa, new jg(cfs.b.d, true));
      cxk.a(clr.og, new jg(cfs.b.g, true));
      cxk.a(clr.oc, new jg(cfs.b.e, true));
      cxk.a(clr.oe, new jg(cfs.b.f, true));
      cxk.a(clr.oi, new jg(cfs.b.h, true));
      cxk.a(clr.ok, new jg(cfs.b.i, true));
      ji $$3 = new jh() {
         private final jh c = new jh();

         @Override
         public clo a(jf $$0, clo $$1) {
            cka $$2 = (cka)$$1.d();
            hx $$3 = $$0.c().a($$0.d().c(cxk.b));
            csf $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new clo(clr.qv);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      cxk.a(clr.qx, $$3);
      cxk.a(clr.qw, $$3);
      cxk.a(clr.qy, $$3);
      cxk.a(clr.qD, $$3);
      cxk.a(clr.qE, $$3);
      cxk.a(clr.qC, $$3);
      cxk.a(clr.qF, $$3);
      cxk.a(clr.qG, $$3);
      cxk.a(clr.qH, $$3);
      cxk.a(clr.qv, new jh() {
         private final jh c = new jh();

         @Override
         public clo a(jf $$0, clo $$1) {
            csg $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cxk.b));
            dhn $$4 = $$2.a_($$3);
            if ($$4.b() instanceof cvm $$6) {
               clo $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dlx.y, $$3);
                  clj $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new clo($$8);
                  } else {
                     if ($$0.e().a(new clo($$8)) < 0) {
                        this.c.dispense($$0, new clo($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cxk.a(clr.op, new jj() {
         @Override
         protected clo a(jf $$0, clo $$1) {
            csf $$2 = $$0.b();
            this.a(true);
            ib $$3 = $$0.d().c(cxk.b);
            hx $$4 = $$0.c().a($$3);
            dhn $$5 = $$2.a_($$4);
            if (cus.a($$2, $$4, $$3)) {
               $$2.b($$4, cus.a($$2, $$4));
               $$2.a(null, dlx.i, $$4);
            } else if (cvt.h($$5) || cvu.g($$5) || cvv.g($$5)) {
               $$2.b($$4, $$5.a(did.r, Boolean.valueOf(true)));
               $$2.a(null, dlx.c, $$4);
            } else if ($$5.b() instanceof ddn) {
               ddn.a($$2, $$4);
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
      cxk.a(clr.rv, new jj() {
         @Override
         protected clo a(jf $$0, clo $$1) {
            this.a(true);
            csf $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cxk.b));
            if (!cjj.a($$1, $$2, $$3) && !cjj.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 0);
            }

            return $$1;
         }
      });
      cxk.a(cvh.ck, new jh() {
         @Override
         protected clo a(jf $$0, clo $$1) {
            csf $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cxk.b));
            cat $$4 = new cat($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.ds(), $$4.du(), $$4.dy(), aqv.yg, aqw.e, 1.0F, 1.0F);
            $$2.a(null, dlx.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      ji $$4 = new jj() {
         @Override
         protected clo a(jf $$0, clo $$1) {
            this.a(ciy.a($$0, $$1));
            return $$1;
         }
      };
      cxk.a(clr.uh, $$4);
      cxk.a(clr.ug, $$4);
      cxk.a(clr.ui, $$4);
      cxk.a(clr.ud, $$4);
      cxk.a(clr.uj, $$4);
      cxk.a(clr.uf, $$4);
      cxk.a(clr.ue, new jj() {
         @Override
         protected clo a(jf $$0, clo $$1) {
            csf $$2 = $$0.b();
            ib $$3 = $$0.d().c(cxk.b);
            hx $$4 = $$0.c().a($$3);
            if ($$2.t($$4) && deu.b($$2, $$4, $$1)) {
               $$2.a($$4, cvh.gG.o().a(dcg.e, Integer.valueOf(dit.a($$3))), 3);
               $$2.a(null, dlx.i, $$4);
               dfi $$5 = $$2.c_($$4);
               if ($$5 instanceof dgt) {
                  deu.a($$2, $$4, (dgt)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ciy.a($$0, $$1));
            }

            return $$1;
         }
      });
      cxk.a(cvh.ee, new jj() {
         @Override
         protected clo a(jf $$0, clo $$1) {
            csf $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cxk.b));
            cvz $$4 = (cvz)cvh.ee;
            if ($$2.t($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dlx.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(ciy.a($$0, $$1));
            }

            return $$1;
         }
      });
      cxk.a(cvh.kP.k(), new jl());

      for (ckc $$5 : ckc.values()) {
         cxk.a(dcd.a($$5).k(), new jl());
      }

      cxk.a(clr.si.k(), new jj() {
         private final jh c = new jh();

         private clo a(jf $$0, clo $$1, clo $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.b().a(null, dlx.y, $$0.c());
               return $$2.p();
            } else {
               if ($$0.e().a($$2.p()) < 0) {
                  this.c.dispense($$0, $$2.p());
               }

               return $$1;
            }
         }

         @Override
         public clo a(jf $$0, clo $$1) {
            this.a(false);
            ami $$2 = $$0.b();
            hx $$3 = $$0.c().a($$0.d().c(cxk.b));
            dhn $$4 = $$2.a_($$3);
            if ($$4.a(ark.aF, $$0x -> $$0x.b(cuz.c) && $$0x.b() instanceof cuz) && $$4.c(cuz.c) >= 5) {
               ((cuz)$$4.b()).a($$2, $$4, $$3, null, dff.b.b);
               this.a(true);
               return this.a($$0, $$1, new clo(clr.wp));
            } else if ($$2.b_($$3).a(arp.a)) {
               this.a(true);
               return this.a($$0, $$1, cnn.a(new clo(clr.sh), cno.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cxk.a(clr.ft, new jj() {
         @Override
         public clo a(jf $$0, clo $$1) {
            ib $$2 = $$0.d().c(cxk.b);
            hx $$3 = $$0.c().a($$2);
            csf $$4 = $$0.b();
            dhn $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(cvh.pl)) {
               if ($$5.c(dbm.d) != 4) {
                  dbm.a(null, $$4, $$3, $$5);
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
      cxk.a(clr.rS.k(), new jk());
      cxk.a(clr.wm, new jj() {
         @Override
         public clo a(jf $$0, clo $$1) {
            hx $$2 = $$0.c().a($$0.d().c(cxk.b));
            csf $$3 = $$0.b();
            dhn $$4 = $$3.a_($$2);
            Optional<dhn> $$5 = cld.b($$4);
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
      cxk.a(clr.sh, new jh() {
         private final jh c = new jh();

         @Override
         public clo a(jf $$0, clo $$1) {
            if (cnn.d($$1) != cno.c) {
               return this.c.dispense($$0, $$1);
            } else {
               ami $$2 = $$0.b();
               hx $$3 = $$0.c();
               hx $$4 = $$0.c().a($$0.d().c(cxk.b));
               if (!$$2.a_($$4).a(ark.ca)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(jw.ah, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, aqv.ch, aqw.e, 1.0F, 1.0F);
                  $$2.a(null, dlx.z, $$3);
                  $$2.b($$4, cvh.sI.o());
                  return new clo(clr.si);
               }
            }
         }
      });
   }

   static ejz a(jf $$0, bkz<?> $$1, ib $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
