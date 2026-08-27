import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface je {
   Logger a = LogUtils.getLogger();
   je b = ($$0, $$1) -> $$1;

   clb dispense(jb var1, clb var2);

   static void c() {
      cwx.a(cle.nH, new ja() {
         @Override
         protected cee a(crs $$0, im $$1, clb $$2) {
            cdu $$3 = new cdu($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = cds.a.b;
            return $$3;
         }
      });
      cwx.a(cle.ux, new ja() {
         @Override
         protected cee a(crs $$0, im $$1, clb $$2) {
            cdu $$3 = new cdu($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.a($$2);
            $$3.d = cds.a.b;
            return $$3;
         }
      });
      cwx.a(cle.uw, new ja() {
         @Override
         protected cee a(crs $$0, im $$1, clb $$2) {
            cds $$3 = new cej($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = cds.a.b;
            return $$3;
         }
      });
      cwx.a(cle.qd, new ja() {
         @Override
         protected cee a(crs $$0, im $$1, clb $$2) {
            return ac.a(new cem($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cwx.a(cle.pO, new ja() {
         @Override
         protected cee a(crs $$0, im $$1, clb $$2) {
            return ac.a(new cei($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cwx.a(cle.tf, new ja() {
         @Override
         protected cee a(crs $$0, im $$1, clb $$2) {
            return ac.a(new ceo($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cwx.a(cle.uv, new je() {
         @Override
         public clb dispense(jb $$0, clb $$1) {
            return (new ja() {
               @Override
               protected cee a(crs $$0, im $$1, clb $$2) {
                  return ac.a(new cep($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cwx.a(cle.uy, new je() {
         @Override
         public clb dispense(jb $$0, clb $$1) {
            return (new ja() {
               @Override
               protected cee a(crs $$0, im $$1, clb $$2) {
                  return ac.a(new cep($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
         public clb a(jb $$0, clb $$1) {
            hx $$2 = $$0.d().c(cwx.b);
            bkm<?> $$3 = ((cmg)$$1.d()).a($$1.v());

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), blc.o, $$2 != hx.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return clb.b;
            }

            $$1.h(1);
            $$0.b().a(null, dlg.t, $$0.c());
            return $$1;
         }
      };

      for (cmg $$1 : cmg.h()) {
         cwx.a($$1, $$0);
      }

      cwx.a(cle.tM, new jd() {
         @Override
         public clb a(jb $$0, clb $$1) {
            hx $$2 = $$0.d().c(cwx.b);
            ht $$3 = $$0.c().a($$2);
            ama $$4 = $$0.b();
            Consumer<bzv> $$5 = bkm.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            bzv $$6 = bkm.d.a($$4, $$1.v(), $$5, $$3, blc.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      cwx.a(cle.mZ, new jf() {
         @Override
         public clb a(jb $$0, clb $$1) {
            ht $$2 = $$0.c().a($$0.d().c(cwx.b));
            List<bky> $$3 = $$0.b().a(bky.class, new ejd($$2), $$0x -> !($$0x instanceof blo $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((blo)$$3.get(0)).a(aqo.e);
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
         protected clb a(jb $$0, clb $$1) {
            ht $$2 = $$0.c().a($$0.d().c(cwx.b));

            for (byi $$4 : $$0.b().a(byi.class, new ejd($$2), $$0x -> $$0x.bv() && $$0x.gN())) {
               if ($$4.l($$1) && !$$4.gO() && $$4.gt()) {
                  $$4.a_(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      cwx.a(cle.tQ, $$2);
      cwx.a(cle.tN, $$2);
      cwx.a(cle.tO, $$2);
      cwx.a(cle.tP, $$2);
      cwx.a(cle.hi, $$2);
      cwx.a(cle.hj, $$2);
      cwx.a(cle.hr, $$2);
      cwx.a(cle.ht, $$2);
      cwx.a(cle.hu, $$2);
      cwx.a(cle.hx, $$2);
      cwx.a(cle.hp, $$2);
      cwx.a(cle.hv, $$2);
      cwx.a(cle.hl, $$2);
      cwx.a(cle.hq, $$2);
      cwx.a(cle.hn, $$2);
      cwx.a(cle.hk, $$2);
      cwx.a(cle.ho, $$2);
      cwx.a(cle.hs, $$2);
      cwx.a(cle.hw, $$2);
      cwx.a(cle.hm, $$2);
      cwx.a(cle.er, new jf() {
         @Override
         public clb a(jb $$0, clb $$1) {
            ht $$2 = $$0.c().a($$0.d().c(cwx.b));

            for (byh $$4 : $$0.b().a(byh.class, new ejd($$2), $$0x -> $$0x.bv() && !$$0x.t())) {
               if ($$4.gt() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      cwx.a(cle.tB, new jd() {
         @Override
         public clb a(jb $$0, clb $$1) {
            hx $$2 = $$0.d().c(cwx.b);
            eji $$3 = je.a($$0, bkm.M, $$2);
            cdz $$4 = new cdz($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
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
      cwx.a(cle.tg, new jd() {
         @Override
         public clb a(jb $$0, clb $$1) {
            hx $$2 = $$0.d().c(cwx.b);
            im $$3 = cwx.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            crs $$7 = $$0.b();
            ato $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            ceh $$12 = new ceh($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(jb $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      cwx.a(cle.ni, new jc(cff.b.a));
      cwx.a(cle.nk, new jc(cff.b.b));
      cwx.a(cle.nm, new jc(cff.b.c));
      cwx.a(cle.no, new jc(cff.b.d));
      cwx.a(cle.nu, new jc(cff.b.g));
      cwx.a(cle.nq, new jc(cff.b.e));
      cwx.a(cle.ns, new jc(cff.b.f));
      cwx.a(cle.nw, new jc(cff.b.h));
      cwx.a(cle.ny, new jc(cff.b.i));
      cwx.a(cle.nj, new jc(cff.b.a, true));
      cwx.a(cle.nl, new jc(cff.b.b, true));
      cwx.a(cle.nn, new jc(cff.b.c, true));
      cwx.a(cle.np, new jc(cff.b.d, true));
      cwx.a(cle.nv, new jc(cff.b.g, true));
      cwx.a(cle.nr, new jc(cff.b.e, true));
      cwx.a(cle.nt, new jc(cff.b.f, true));
      cwx.a(cle.nx, new jc(cff.b.h, true));
      cwx.a(cle.nz, new jc(cff.b.i, true));
      je $$3 = new jd() {
         private final jd c = new jd();

         @Override
         public clb a(jb $$0, clb $$1) {
            cjn $$2 = (cjn)$$1.d();
            ht $$3 = $$0.c().a($$0.d().c(cwx.b));
            crs $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new clb(cle.pK);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      cwx.a(cle.pM, $$3);
      cwx.a(cle.pL, $$3);
      cwx.a(cle.pN, $$3);
      cwx.a(cle.pS, $$3);
      cwx.a(cle.pT, $$3);
      cwx.a(cle.pR, $$3);
      cwx.a(cle.pU, $$3);
      cwx.a(cle.pV, $$3);
      cwx.a(cle.pW, $$3);
      cwx.a(cle.pK, new jd() {
         private final jd c = new jd();

         @Override
         public clb a(jb $$0, clb $$1) {
            crt $$2 = $$0.b();
            ht $$3 = $$0.c().a($$0.d().c(cwx.b));
            dgw $$4 = $$2.a_($$3);
            if ($$4.b() instanceof cva $$6) {
               clb $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dlg.y, $$3);
                  ckw $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new clb($$8);
                  } else {
                     if ($$0.e().a(new clb($$8)) < 0) {
                        this.c.dispense($$0, new clb($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cwx.a(cle.nE, new jf() {
         @Override
         protected clb a(jb $$0, clb $$1) {
            crs $$2 = $$0.b();
            this.a(true);
            hx $$3 = $$0.d().c(cwx.b);
            ht $$4 = $$0.c().a($$3);
            dgw $$5 = $$2.a_($$4);
            if (cug.a($$2, $$4, $$3)) {
               $$2.b($$4, cug.a($$2, $$4));
               $$2.a(null, dlg.i, $$4);
            } else if (cvh.h($$5) || cvi.g($$5) || cvj.g($$5)) {
               $$2.b($$4, $$5.a(dhm.r, Boolean.valueOf(true)));
               $$2.a(null, dlg.c, $$4);
            } else if ($$5.b() instanceof ddb) {
               ddb.a($$2, $$4);
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
      cwx.a(cle.qK, new jf() {
         @Override
         protected clb a(jb $$0, clb $$1) {
            this.a(true);
            crs $$2 = $$0.b();
            ht $$3 = $$0.c().a($$0.d().c(cwx.b));
            if (!ciw.a($$1, $$2, $$3) && !ciw.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 0);
            }

            return $$1;
         }
      });
      cwx.a(cuv.ck, new jd() {
         @Override
         protected clb a(jb $$0, clb $$1) {
            crs $$2 = $$0.b();
            ht $$3 = $$0.c().a($$0.d().c(cwx.b));
            cag $$4 = new cag($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dq(), $$4.ds(), $$4.dw(), aqn.xP, aqo.e, 1.0F, 1.0F);
            $$2.a(null, dlg.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      je $$4 = new jf() {
         @Override
         protected clb a(jb $$0, clb $$1) {
            this.a(cil.a($$0, $$1));
            return $$1;
         }
      };
      cwx.a(cle.tw, $$4);
      cwx.a(cle.tv, $$4);
      cwx.a(cle.tx, $$4);
      cwx.a(cle.ts, $$4);
      cwx.a(cle.ty, $$4);
      cwx.a(cle.tu, $$4);
      cwx.a(cle.tt, new jf() {
         @Override
         protected clb a(jb $$0, clb $$1) {
            crs $$2 = $$0.b();
            hx $$3 = $$0.d().c(cwx.b);
            ht $$4 = $$0.c().a($$3);
            if ($$2.t($$4) && ded.b($$2, $$4, $$1)) {
               $$2.a($$4, cuv.gG.o().a(dbu.e, Integer.valueOf(dic.a($$3))), 3);
               $$2.a(null, dlg.i, $$4);
               der $$5 = $$2.c_($$4);
               if ($$5 instanceof dgc) {
                  ded.a($$2, $$4, (dgc)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cil.a($$0, $$1));
            }

            return $$1;
         }
      });
      cwx.a(cuv.ee, new jf() {
         @Override
         protected clb a(jb $$0, clb $$1) {
            crs $$2 = $$0.b();
            ht $$3 = $$0.c().a($$0.d().c(cwx.b));
            cvn $$4 = (cvn)cuv.ee;
            if ($$2.t($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dlg.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cil.a($$0, $$1));
            }

            return $$1;
         }
      });
      cwx.a(cuv.kP.k(), new jh());

      for (cjp $$5 : cjp.values()) {
         cwx.a(dbr.a($$5).k(), new jh());
      }

      cwx.a(cle.rx.k(), new jf() {
         private final jd c = new jd();

         private clb a(jb $$0, clb $$1, clb $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.b().a(null, dlg.y, $$0.c());
               return $$2.p();
            } else {
               if ($$0.e().a($$2.p()) < 0) {
                  this.c.dispense($$0, $$2.p());
               }

               return $$1;
            }
         }

         @Override
         public clb a(jb $$0, clb $$1) {
            this.a(false);
            ama $$2 = $$0.b();
            ht $$3 = $$0.c().a($$0.d().c(cwx.b));
            dgw $$4 = $$2.a_($$3);
            if ($$4.a(arc.aF, $$0x -> $$0x.b(cun.c) && $$0x.b() instanceof cun) && $$4.c(cun.c) >= 5) {
               ((cun)$$4.b()).a($$2, $$4, $$3, null, deo.b.b);
               this.a(true);
               return this.a($$0, $$1, new clb(cle.vE));
            } else if ($$2.b_($$3).a(arh.a)) {
               this.a(true);
               return this.a($$0, $$1, cna.a(new clb(cle.rw), cnb.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cwx.a(cle.eY, new jf() {
         @Override
         public clb a(jb $$0, clb $$1) {
            hx $$2 = $$0.d().c(cwx.b);
            ht $$3 = $$0.c().a($$2);
            crs $$4 = $$0.b();
            dgw $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(cuv.pl)) {
               if ($$5.c(dba.d) != 4) {
                  dba.a(null, $$4, $$3, $$5);
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
      cwx.a(cle.rh.k(), new jg());
      cwx.a(cle.vB, new jf() {
         @Override
         public clb a(jb $$0, clb $$1) {
            ht $$2 = $$0.c().a($$0.d().c(cwx.b));
            crs $$3 = $$0.b();
            dgw $$4 = $$3.a_($$2);
            Optional<dgw> $$5 = ckq.b($$4);
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
      cwx.a(cle.rw, new jd() {
         private final jd c = new jd();

         @Override
         public clb a(jb $$0, clb $$1) {
            if (cna.d($$1) != cnb.c) {
               return this.c.dispense($$0, $$1);
            } else {
               ama $$2 = $$0.b();
               ht $$3 = $$0.c();
               ht $$4 = $$0.c().a($$0.d().c(cwx.b));
               if (!$$2.a_($$4).a(arc.ca)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(js.ah, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, aqn.ch, aqo.e, 1.0F, 1.0F);
                  $$2.a(null, dlg.z, $$3);
                  $$2.b($$4, cuv.rH.o());
                  return new clb(cle.rx);
               }
            }
         }
      });
   }

   static eji a(jb $$0, bkm<?> $$1, hx $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
