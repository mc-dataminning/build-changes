import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface kt {
   Logger a = LogUtils.getLogger();
   kt b = ($$0, $$1) -> $$1;

   cun dispense(kq var1, cun var2);

   static void a() {
      dhc.a(cuq.ov);
      dhc.a(cuq.vq);
      dhc.a(cuq.vp);
      dhc.a(cuq.qR);
      dhc.a(cuq.qC);
      dhc.a(cuq.tW);
      dhc.a(cuq.vo);
      dhc.a(cuq.vr);
      dhc.a(cuq.uu);
      dhc.a(cuq.tX);
      dhc.a(cuq.tY);
      ks $$0 = new ks() {
         @Override
         public cun a(kq $$0, cun $$1) {
            je $$2 = $$0.d().c(dhc.b);
            bsy<?> $$3 = ((cvu)$$1.g()).j($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), btr.o, $$2 != je.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cun.l;
            }

            $$1.h(1);
            $$0.b().a(null, dwt.t, $$0.c());
            return $$1;
         }
      };

      for (cvu $$1 : cvu.h()) {
         dhc.a($$1, $$0);
      }

      dhc.a(cuq.uF, new ks() {
         @Override
         public cun a(kq $$0, cun $$1) {
            je $$2 = $$0.d().c(dhc.b);
            iz $$3 = $$0.c().a($$2);
            are $$4 = $$0.b();
            Consumer<civ> $$5 = bsy.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            civ $$6 = bsy.d.a($$4, $$5, $$3, btr.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dhc.a(cuq.nL, new ku() {
         @Override
         public cun a(kq $$0, cun $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhc.b));
            List<btn> $$3 = $$0.b().a(btn.class, new evk($$2), $$0x -> !($$0x instanceof bud $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bud)$$3.get(0)).a(awa.e);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      ks $$2 = new ku() {
         @Override
         protected cun a(kq $$0, cun $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhc.b));

            for (chh $$4 : $$0.b().a(chh.class, new evk($$2), $$0x -> $$0x.bD() && $$0x.fS())) {
               if ($$4.l($$1) && !$$4.fT() && $$4.gF()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dhc.a(cuq.uJ, $$2);
      dhc.a(cuq.uG, $$2);
      dhc.a(cuq.uH, $$2);
      dhc.a(cuq.uI, $$2);
      dhc.a(cuq.hE, $$2);
      dhc.a(cuq.hF, $$2);
      dhc.a(cuq.hN, $$2);
      dhc.a(cuq.hP, $$2);
      dhc.a(cuq.hQ, $$2);
      dhc.a(cuq.hT, $$2);
      dhc.a(cuq.hL, $$2);
      dhc.a(cuq.hR, $$2);
      dhc.a(cuq.hH, $$2);
      dhc.a(cuq.hM, $$2);
      dhc.a(cuq.hJ, $$2);
      dhc.a(cuq.hG, $$2);
      dhc.a(cuq.hK, $$2);
      dhc.a(cuq.hO, $$2);
      dhc.a(cuq.hS, $$2);
      dhc.a(cuq.hI, $$2);
      dhc.a(cuq.eN, new ku() {
         @Override
         public cun a(kq $$0, cun $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhc.b));

            for (chg $$4 : $$0.b().a(chg.class, new evk($$2), $$0x -> $$0x.bD() && !$$0x.u())) {
               if ($$4.gF() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dhc.a(cuq.nU, new kr(cot.b.a));
      dhc.a(cuq.nW, new kr(cot.b.b));
      dhc.a(cuq.nY, new kr(cot.b.c));
      dhc.a(cuq.oa, new kr(cot.b.d));
      dhc.a(cuq.og, new kr(cot.b.g));
      dhc.a(cuq.oc, new kr(cot.b.e));
      dhc.a(cuq.oe, new kr(cot.b.f));
      dhc.a(cuq.oi, new kr(cot.b.h));
      dhc.a(cuq.ok, new kr(cot.b.i));
      dhc.a(cuq.nV, new kr(cot.b.a, true));
      dhc.a(cuq.nX, new kr(cot.b.b, true));
      dhc.a(cuq.nZ, new kr(cot.b.c, true));
      dhc.a(cuq.ob, new kr(cot.b.d, true));
      dhc.a(cuq.oh, new kr(cot.b.g, true));
      dhc.a(cuq.od, new kr(cot.b.e, true));
      dhc.a(cuq.of, new kr(cot.b.f, true));
      dhc.a(cuq.oj, new kr(cot.b.h, true));
      dhc.a(cuq.ol, new kr(cot.b.i, true));
      kt $$3 = new ks() {
         private final ks c = new ks();

         @Override
         public cun a(kq $$0, cun $$1) {
            cte $$2 = (cte)$$1.g();
            iz $$3 = $$0.c().a($$0.d().c(dhc.b));
            dbw $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cun(cuq.qy);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dhc.a(cuq.qA, $$3);
      dhc.a(cuq.qz, $$3);
      dhc.a(cuq.qB, $$3);
      dhc.a(cuq.qG, $$3);
      dhc.a(cuq.qH, $$3);
      dhc.a(cuq.qF, $$3);
      dhc.a(cuq.qI, $$3);
      dhc.a(cuq.qJ, $$3);
      dhc.a(cuq.qK, $$3);
      dhc.a(cuq.qy, new ks() {
         private final ks c = new ks();

         @Override
         public cun a(kq $$0, cun $$1) {
            dbx $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhc.b));
            dsa $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dfe $$6) {
               cun $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.e()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dwt.y, $$3);
                  cui $$8 = $$7.g();
                  $$1.h(1);
                  if ($$1.e()) {
                     return new cun($$8);
                  } else {
                     if ($$0.e().b(new cun($$8)) < 0) {
                        this.c.dispense($$0, new cun($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dhc.a(cuq.os, new ku() {
         @Override
         protected cun a(kq $$0, cun $$1) {
            dbw $$2 = $$0.b();
            this.a(true);
            je $$3 = $$0.d().c(dhc.b);
            iz $$4 = $$0.c().a($$3);
            dsa $$5 = $$2.a_($$4);
            if (dek.a($$2, $$4, $$3)) {
               $$2.b($$4, dek.a($$2, $$4));
               $$2.a(null, dwt.i, $$4);
            } else if (dfl.h($$5) || dfm.g($$5) || dfn.g($$5)) {
               $$2.b($$4, $$5.a(dsq.r, Boolean.valueOf(true)));
               $$2.a(null, dwt.c, $$4);
            } else if ($$5.b() instanceof dng) {
               dng.a($$2, $$4);
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
      dhc.a(cuq.ry, new ku() {
         @Override
         protected cun a(kq $$0, cun $$1) {
            this.a(true);
            dbw $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhc.b));
            if (!csn.a($$1, $$2, $$3) && !csn.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dhc.a(dez.ck, new ks() {
         @Override
         protected cun a(kq $$0, cun $$1) {
            dbw $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhc.b));
            cjg $$4 = new cjg($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.du(), $$4.dw(), $$4.dA(), avz.zv, awa.e, 1.0F, 1.0F);
            $$2.a(null, dwt.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      kt $$4 = new ku() {
         @Override
         protected cun a(kq $$0, cun $$1) {
            this.a(csc.a($$0, $$1));
            return $$1;
         }
      };
      dhc.a(cuq.up, $$4);
      dhc.a(cuq.uo, $$4);
      dhc.a(cuq.uq, $$4);
      dhc.a(cuq.ul, $$4);
      dhc.a(cuq.ur, $$4);
      dhc.a(cuq.un, $$4);
      dhc.a(cuq.um, new ku() {
         @Override
         protected cun a(kq $$0, cun $$1) {
            dbw $$2 = $$0.b();
            je $$3 = $$0.d().c(dhc.b);
            iz $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && doq.b($$2, $$4, $$1)) {
               $$2.a($$4, dez.gG.o().a(dlz.e, Integer.valueOf(dtg.a($$3))), 3);
               $$2.a(null, dwt.i, $$4);
               dpf $$5 = $$2.c_($$4);
               if ($$5 instanceof dqr) {
                  doq.a($$2, $$4, (dqr)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(csc.a($$0, $$1));
            }

            return $$1;
         }
      });
      dhc.a(dez.ee, new ku() {
         @Override
         protected cun a(kq $$0, cun $$1) {
            dbw $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhc.b));
            dfr $$4 = (dfr)dez.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dwt.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(csc.a($$0, $$1));
            }

            return $$1;
         }
      });
      dhc.a(dez.kP.r(), new kx());

      for (ctg $$5 : ctg.values()) {
         dhc.a(dlw.a($$5).r(), new kx());
      }

      dhc.a(cuq.sl.r(), new ku() {
         private final ks c = new ks();

         private cun a(kq $$0, cun $$1, cun $$2) {
            $$1.h(1);
            if ($$1.e()) {
               $$0.b().a(null, dwt.y, $$0.c());
               return $$2.s();
            } else {
               if ($$0.e().b($$2.s()) < 0) {
                  this.c.dispense($$0, $$2.s());
               }

               return $$1;
            }
         }

         @Override
         public cun a(kq $$0, cun $$1) {
            this.a(false);
            are $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhc.b));
            dsa $$4 = $$2.a_($$3);
            if ($$4.a(awo.aG, $$0x -> $$0x.b(der.c) && $$0x.b() instanceof der) && $$4.c(der.c) >= 5) {
               ((der)$$4.b()).a($$2, $$4, $$3, null, dpc.b.b);
               this.a(true);
               return this.a($$0, $$1, new cun(cuq.wz));
            } else if ($$2.b_($$3).a(awu.a)) {
               this.a(true);
               return this.a($$0, $$1, cwo.a(cuq.sk, cwp.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dhc.a(cuq.fu, new ku() {
         @Override
         public cun a(kq $$0, cun $$1) {
            je $$2 = $$0.d().c(dhc.b);
            iz $$3 = $$0.c().a($$2);
            dbw $$4 = $$0.b();
            dsa $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dez.pl)) {
               if ($$5.c(dlf.d) != 4) {
                  dlf.a(null, $$4, $$3, $$5);
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
      dhc.a(cuq.rV.r(), new kw());
      dhc.a(cuq.xr.r(), new ku() {
         @Override
         protected cun a(kq $$0, cun $$1) {
            are $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhc.b));
            List<cgm> $$4 = $$2.a(cgm.class, new evk($$3), bsx.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cgm $$5 : $$4) {
                  if ($$5.gA()) {
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
      dhc.a(cuq.ww, new ku() {
         @Override
         public cun a(kq $$0, cun $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhc.b));
            dbw $$3 = $$0.b();
            dsa $$4 = $$3.a_($$2);
            Optional<dsa> $$5 = cud.a($$4);
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
      dhc.a(cuq.sk, new ks() {
         private final ks c = new ks();

         @Override
         public cun a(kq $$0, cun $$1) {
            cwo $$2 = $$1.a(km.F, cwo.a);
            if (!$$2.a(cwp.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               are $$3 = $$0.b();
               iz $$4 = $$0.c();
               iz $$5 = $$0.c().a($$0.d().c(dhc.b));
               if (!$$3.a_($$5).a(awo.ci)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(li.am, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, avz.cB, awa.e, 1.0F, 1.0F);
                  $$3.a(null, dwt.z, $$4);
                  $$3.b($$5, dez.sI.o());
                  return new cun(cuq.sl);
               }
            }
         }
      });
   }
}
