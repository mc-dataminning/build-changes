import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface je {
   Logger a = LogUtils.getLogger();
   je b = ($$0, $$1) -> $$1;

   ckj dispense(jb var1, ckj var2);

   static void c() {
      cwd.a(ckm.nH, new ja() {
         @Override
         protected cdp a(cqz $$0, im $$1, ckj $$2) {
            cdf $$3 = new cdf($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = cdd.a.b;
            return $$3;
         }
      });
      cwd.a(ckm.uw, new ja() {
         @Override
         protected cdp a(cqz $$0, im $$1, ckj $$2) {
            cdf $$3 = new cdf($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.a($$2);
            $$3.d = cdd.a.b;
            return $$3;
         }
      });
      cwd.a(ckm.uv, new ja() {
         @Override
         protected cdp a(cqz $$0, im $$1, ckj $$2) {
            cdd $$3 = new cdu($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = cdd.a.b;
            return $$3;
         }
      });
      cwd.a(ckm.qd, new ja() {
         @Override
         protected cdp a(cqz $$0, im $$1, ckj $$2) {
            return ac.a(new cdx($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cwd.a(ckm.pO, new ja() {
         @Override
         protected cdp a(cqz $$0, im $$1, ckj $$2) {
            return ac.a(new cdt($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      cwd.a(ckm.te, new ja() {
         @Override
         protected cdp a(cqz $$0, im $$1, ckj $$2) {
            return ac.a(new cdz($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cwd.a(ckm.uu, new je() {
         @Override
         public ckj dispense(jb $$0, ckj $$1) {
            return (new ja() {
               @Override
               protected cdp a(cqz $$0, im $$1, ckj $$2) {
                  return ac.a(new cea($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      cwd.a(ckm.ux, new je() {
         @Override
         public ckj dispense(jb $$0, ckj $$1) {
            return (new ja() {
               @Override
               protected cdp a(cqz $$0, im $$1, ckj $$2) {
                  return ac.a(new cea($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
         public ckj a(jb $$0, ckj $$1) {
            hx $$2 = $$0.d().c(cwd.b);
            bjx<?> $$3 = ((clo)$$1.d()).a($$1.v());

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bkn.o, $$2 != hx.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return ckj.b;
            }

            $$1.h(1);
            $$0.b().a(null, dkl.t, $$0.c());
            return $$1;
         }
      };

      for (clo $$1 : clo.h()) {
         cwd.a($$1, $$0);
      }

      cwd.a(ckm.tL, new jd() {
         @Override
         public ckj a(jb $$0, ckj $$1) {
            hx $$2 = $$0.d().c(cwd.b);
            ht $$3 = $$0.c().a($$2);
            alq $$4 = $$0.b();
            Consumer<bzg> $$5 = bjx.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            bzg $$6 = bjx.d.a($$4, $$1.v(), $$5, $$3, bkn.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      cwd.a(ckm.mZ, new jf() {
         @Override
         public ckj a(jb $$0, ckj $$1) {
            ht $$2 = $$0.c().a($$0.d().c(cwd.b));
            List<bkj> $$3 = $$0.b().a(bkj.class, new eia($$2), $$0x -> !($$0x instanceof bkz $$1x) ? false : !$$1x.i() && $$1x.g());
            if (!$$3.isEmpty()) {
               ((bkz)$$3.get(0)).a(aqe.e);
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
         protected ckj a(jb $$0, ckj $$1) {
            ht $$2 = $$0.c().a($$0.d().c(cwd.b));

            for (bxt $$4 : $$0.b().a(bxt.class, new eia($$2), $$0x -> $$0x.bv() && $$0x.gN())) {
               if ($$4.l($$1) && !$$4.gO() && $$4.gt()) {
                  $$4.a_(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      cwd.a(ckm.tP, $$2);
      cwd.a(ckm.tM, $$2);
      cwd.a(ckm.tN, $$2);
      cwd.a(ckm.tO, $$2);
      cwd.a(ckm.hi, $$2);
      cwd.a(ckm.hj, $$2);
      cwd.a(ckm.hr, $$2);
      cwd.a(ckm.ht, $$2);
      cwd.a(ckm.hu, $$2);
      cwd.a(ckm.hx, $$2);
      cwd.a(ckm.hp, $$2);
      cwd.a(ckm.hv, $$2);
      cwd.a(ckm.hl, $$2);
      cwd.a(ckm.hq, $$2);
      cwd.a(ckm.hn, $$2);
      cwd.a(ckm.hk, $$2);
      cwd.a(ckm.ho, $$2);
      cwd.a(ckm.hs, $$2);
      cwd.a(ckm.hw, $$2);
      cwd.a(ckm.hm, $$2);
      cwd.a(ckm.er, new jf() {
         @Override
         public ckj a(jb $$0, ckj $$1) {
            ht $$2 = $$0.c().a($$0.d().c(cwd.b));

            for (bxs $$4 : $$0.b().a(bxs.class, new eia($$2), $$0x -> $$0x.bv() && !$$0x.t())) {
               if ($$4.gt() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      cwd.a(ckm.tA, new jd() {
         @Override
         public ckj a(jb $$0, ckj $$1) {
            hx $$2 = $$0.d().c(cwd.b);
            eif $$3 = je.a($$0, bjx.M, $$2);
            cdk $$4 = new cdk($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
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
      cwd.a(ckm.tf, new jd() {
         @Override
         public ckj a(jb $$0, ckj $$1) {
            hx $$2 = $$0.d().c(cwd.b);
            im $$3 = cwd.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            cqz $$7 = $$0.b();
            ate $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            cds $$12 = new cds($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.h(1);
            return $$1;
         }

         @Override
         protected void a(jb $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      cwd.a(ckm.ni, new jc(ceq.b.a));
      cwd.a(ckm.nk, new jc(ceq.b.b));
      cwd.a(ckm.nm, new jc(ceq.b.c));
      cwd.a(ckm.no, new jc(ceq.b.d));
      cwd.a(ckm.nu, new jc(ceq.b.g));
      cwd.a(ckm.nq, new jc(ceq.b.e));
      cwd.a(ckm.ns, new jc(ceq.b.f));
      cwd.a(ckm.nw, new jc(ceq.b.h));
      cwd.a(ckm.ny, new jc(ceq.b.i));
      cwd.a(ckm.nj, new jc(ceq.b.a, true));
      cwd.a(ckm.nl, new jc(ceq.b.b, true));
      cwd.a(ckm.nn, new jc(ceq.b.c, true));
      cwd.a(ckm.np, new jc(ceq.b.d, true));
      cwd.a(ckm.nv, new jc(ceq.b.g, true));
      cwd.a(ckm.nr, new jc(ceq.b.e, true));
      cwd.a(ckm.nt, new jc(ceq.b.f, true));
      cwd.a(ckm.nx, new jc(ceq.b.h, true));
      cwd.a(ckm.nz, new jc(ceq.b.i, true));
      je $$3 = new jd() {
         private final jd c = new jd();

         @Override
         public ckj a(jb $$0, ckj $$1) {
            civ $$2 = (civ)$$1.d();
            ht $$3 = $$0.c().a($$0.d().c(cwd.b));
            cqz $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new ckj(ckm.pK);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      cwd.a(ckm.pM, $$3);
      cwd.a(ckm.pL, $$3);
      cwd.a(ckm.pN, $$3);
      cwd.a(ckm.pS, $$3);
      cwd.a(ckm.pT, $$3);
      cwd.a(ckm.pR, $$3);
      cwd.a(ckm.pU, $$3);
      cwd.a(ckm.pV, $$3);
      cwd.a(ckm.pW, $$3);
      cwd.a(ckm.pK, new jd() {
         private final jd c = new jd();

         @Override
         public ckj a(jb $$0, ckj $$1) {
            cra $$2 = $$0.b();
            ht $$3 = $$0.c().a($$0.d().c(cwd.b));
            dgb $$4 = $$2.a_($$3);
            if ($$4.b() instanceof cuh $$6) {
               ckj $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dkl.y, $$3);
                  cke $$8 = $$7.d();
                  $$1.h(1);
                  if ($$1.b()) {
                     return new ckj($$8);
                  } else {
                     if ($$0.e().a(new ckj($$8)) < 0) {
                        this.c.dispense($$0, new ckj($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cwd.a(ckm.nE, new jf() {
         @Override
         protected ckj a(jb $$0, ckj $$1) {
            cqz $$2 = $$0.b();
            this.a(true);
            hx $$3 = $$0.d().c(cwd.b);
            ht $$4 = $$0.c().a($$3);
            dgb $$5 = $$2.a_($$4);
            if (ctn.a($$2, $$4, $$3)) {
               $$2.b($$4, ctn.a($$2, $$4));
               $$2.a(null, dkl.i, $$4);
            } else if (cuo.h($$5) || cup.g($$5) || cuq.g($$5)) {
               $$2.b($$4, $$5.a(dgr.r, Boolean.valueOf(true)));
               $$2.a(null, dkl.c, $$4);
            } else if ($$5.b() instanceof dch) {
               dch.a($$2, $$4);
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
      cwd.a(ckm.qK, new jf() {
         @Override
         protected ckj a(jb $$0, ckj $$1) {
            this.a(true);
            cqz $$2 = $$0.b();
            ht $$3 = $$0.c().a($$0.d().c(cwd.b));
            if (!cie.a($$1, $$2, $$3) && !cie.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 0);
            }

            return $$1;
         }
      });
      cwd.a(cuc.ck, new jd() {
         @Override
         protected ckj a(jb $$0, ckj $$1) {
            cqz $$2 = $$0.b();
            ht $$3 = $$0.c().a($$0.d().c(cwd.b));
            bzr $$4 = new bzr($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dq(), $$4.ds(), $$4.dw(), aqd.xN, aqe.e, 1.0F, 1.0F);
            $$2.a(null, dkl.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      je $$4 = new jf() {
         @Override
         protected ckj a(jb $$0, ckj $$1) {
            this.a(cht.a($$0, $$1));
            return $$1;
         }
      };
      cwd.a(ckm.tv, $$4);
      cwd.a(ckm.tu, $$4);
      cwd.a(ckm.tw, $$4);
      cwd.a(ckm.tr, $$4);
      cwd.a(ckm.tx, $$4);
      cwd.a(ckm.tt, $$4);
      cwd.a(ckm.ts, new jf() {
         @Override
         protected ckj a(jb $$0, ckj $$1) {
            cqz $$2 = $$0.b();
            hx $$3 = $$0.d().c(cwd.b);
            ht $$4 = $$0.c().a($$3);
            if ($$2.t($$4) && ddj.b($$2, $$4, $$1)) {
               $$2.a($$4, cuc.gG.o().a(dba.e, Integer.valueOf(dhh.a($$3))), 3);
               $$2.a(null, dkl.i, $$4);
               ddx $$5 = $$2.c_($$4);
               if ($$5 instanceof dfh) {
                  ddj.a($$2, $$4, (dfh)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cht.a($$0, $$1));
            }

            return $$1;
         }
      });
      cwd.a(cuc.ee, new jf() {
         @Override
         protected ckj a(jb $$0, ckj $$1) {
            cqz $$2 = $$0.b();
            ht $$3 = $$0.c().a($$0.d().c(cwd.b));
            cuu $$4 = (cuu)cuc.ee;
            if ($$2.t($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dkl.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(cht.a($$0, $$1));
            }

            return $$1;
         }
      });
      cwd.a(cuc.kP.k(), new jh());

      for (cix $$5 : cix.values()) {
         cwd.a(dax.a($$5).k(), new jh());
      }

      cwd.a(ckm.rw.k(), new jf() {
         private final jd c = new jd();

         private ckj a(jb $$0, ckj $$1, ckj $$2) {
            $$1.h(1);
            if ($$1.b()) {
               $$0.b().a(null, dkl.y, $$0.c());
               return $$2.p();
            } else {
               if ($$0.e().a($$2.p()) < 0) {
                  this.c.dispense($$0, $$2.p());
               }

               return $$1;
            }
         }

         @Override
         public ckj a(jb $$0, ckj $$1) {
            this.a(false);
            alq $$2 = $$0.b();
            ht $$3 = $$0.c().a($$0.d().c(cwd.b));
            dgb $$4 = $$2.a_($$3);
            if ($$4.a(aqs.aF, $$0x -> $$0x.b(ctu.c) && $$0x.b() instanceof ctu) && $$4.c(ctu.c) >= 5) {
               ((ctu)$$4.b()).a($$2, $$4, $$3, null, ddu.b.b);
               this.a(true);
               return this.a($$0, $$1, new ckj(ckm.vD));
            } else if ($$2.b_($$3).a(aqx.a)) {
               this.a(true);
               return this.a($$0, $$1, cmi.a(new ckj(ckm.rv), cmj.c));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      cwd.a(ckm.eY, new jf() {
         @Override
         public ckj a(jb $$0, ckj $$1) {
            hx $$2 = $$0.d().c(cwd.b);
            ht $$3 = $$0.c().a($$2);
            cqz $$4 = $$0.b();
            dgb $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(cuc.pl)) {
               if ($$5.c(dag.d) != 4) {
                  dag.a(null, $$4, $$3, $$5);
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
      cwd.a(ckm.rg.k(), new jg());
      cwd.a(ckm.vA, new jf() {
         @Override
         public ckj a(jb $$0, ckj $$1) {
            ht $$2 = $$0.c().a($$0.d().c(cwd.b));
            cqz $$3 = $$0.b();
            dgb $$4 = $$3.a_($$2);
            Optional<dgb> $$5 = cjy.b($$4);
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
      cwd.a(ckm.rv, new jd() {
         private final jd c = new jd();

         @Override
         public ckj a(jb $$0, ckj $$1) {
            if (cmi.d($$1) != cmj.c) {
               return this.c.dispense($$0, $$1);
            } else {
               alq $$2 = $$0.b();
               ht $$3 = $$0.c();
               ht $$4 = $$0.c().a($$0.d().c(cwd.b));
               if (!$$2.a_($$4).a(aqs.ca)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.B) {
                     for (int $$5 = 0; $$5 < 5; $$5++) {
                        $$2.a(js.ag, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, aqd.ch, aqe.e, 1.0F, 1.0F);
                  $$2.a(null, dkl.z, $$3);
                  $$2.b($$4, cuc.rH.o());
                  return new ckj(ckm.rw);
               }
            }
         }
      });
   }

   static eif a(jb $$0, bjx<?> $$1, hx $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
