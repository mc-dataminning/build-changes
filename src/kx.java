import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface kx {
   Logger a = LogUtils.getLogger();
   kx b = ($$0, $$1) -> $$1;

   cuo dispense(ku var1, cuo var2);

   static void a() {
      dib.a(cur.ow);
      dib.a(cur.vq);
      dib.a(cur.vp);
      dib.a(cur.qR);
      dib.a(cur.qC);
      dib.a(cur.tW);
      dib.a(cur.vo);
      dib.a(cur.vr);
      dib.a(cur.uu);
      dib.a(cur.tX);
      dib.a(cur.tY);
      kw $$0 = new kw() {
         @Override
         public cuo a(ku $$0, cuo $$1) {
            ji $$2 = $$0.d().c(dib.b);
            bsw<?> $$3 = ((cvy)$$1.g()).i($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), btp.o, $$2 != ji.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cuo.l;
            }

            $$1.h(1);
            $$0.b().a(null, dxw.t, $$0.c());
            return $$1;
         }
      };

      for (cvy $$1 : cvy.h()) {
         dib.a($$1, $$0);
      }

      dib.a(cur.uF, new kw() {
         @Override
         public cuo a(ku $$0, cuo $$1) {
            ji $$2 = $$0.d().c(dib.b);
            jd $$3 = $$0.c().a($$2);
            aqt $$4 = $$0.b();
            Consumer<ciu> $$5 = bsw.a($$1x -> $$1x.s($$2.p()), $$4, $$1, null);
            ciu $$6 = bsw.d.a($$4, $$5, $$3, btp.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dib.a(cur.nL, new ky() {
         @Override
         public cuo a(ku $$0, cuo $$1) {
            jd $$2 = $$0.c().a($$0.d().c(dib.b));
            List<btl> $$3 = $$0.b().a(btl.class, new ewr($$2), $$0x -> !($$0x instanceof buc $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((buc)$$3.get(0)).a(avp.e);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      kw $$2 = new ky() {
         @Override
         protected cuo a(ku $$0, cuo $$1) {
            jd $$2 = $$0.c().a($$0.d().c(dib.b));

            for (chg $$4 : $$0.b().a(chg.class, new ewr($$2), $$0x -> $$0x.bE() && $$0x.d(bsx.g))) {
               if ($$4.l($$1) && !$$4.fO() && $$4.gB()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dib.a(cur.uJ, $$2);
      dib.a(cur.uG, $$2);
      dib.a(cur.uH, $$2);
      dib.a(cur.uI, $$2);
      dib.a(cur.hE, $$2);
      dib.a(cur.hF, $$2);
      dib.a(cur.hN, $$2);
      dib.a(cur.hP, $$2);
      dib.a(cur.hQ, $$2);
      dib.a(cur.hT, $$2);
      dib.a(cur.hL, $$2);
      dib.a(cur.hR, $$2);
      dib.a(cur.hH, $$2);
      dib.a(cur.hM, $$2);
      dib.a(cur.hJ, $$2);
      dib.a(cur.hG, $$2);
      dib.a(cur.hK, $$2);
      dib.a(cur.hO, $$2);
      dib.a(cur.hS, $$2);
      dib.a(cur.hI, $$2);
      dib.a(cur.eN, new ky() {
         @Override
         public cuo a(ku $$0, cuo $$1) {
            jd $$2 = $$0.c().a($$0.d().c(dib.b));

            for (chf $$4 : $$0.b().a(chf.class, new ewr($$2), $$0x -> $$0x.bE() && !$$0x.t())) {
               if ($$4.gB() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dib.a(cur.nU, new kv(cot.b.a));
      dib.a(cur.nW, new kv(cot.b.b));
      dib.a(cur.nY, new kv(cot.b.c));
      dib.a(cur.oa, new kv(cot.b.d));
      dib.a(cur.og, new kv(cot.b.g));
      dib.a(cur.oc, new kv(cot.b.e));
      dib.a(cur.oe, new kv(cot.b.f));
      dib.a(cur.oi, new kv(cot.b.h));
      dib.a(cur.ok, new kv(cot.b.i));
      dib.a(cur.nV, new kv(cot.b.a, true));
      dib.a(cur.nX, new kv(cot.b.b, true));
      dib.a(cur.nZ, new kv(cot.b.c, true));
      dib.a(cur.ob, new kv(cot.b.d, true));
      dib.a(cur.oh, new kv(cot.b.g, true));
      dib.a(cur.od, new kv(cot.b.e, true));
      dib.a(cur.of, new kv(cot.b.f, true));
      dib.a(cur.oj, new kv(cot.b.h, true));
      dib.a(cur.ol, new kv(cot.b.i, true));
      kx $$3 = new kw() {
         private final kw c = new kw();

         @Override
         public cuo a(ku $$0, cuo $$1) {
            cte $$2 = (cte)$$1.g();
            jd $$3 = $$0.c().a($$0.d().c(dib.b));
            dcu $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cuo(cur.qy));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dib.a(cur.qA, $$3);
      dib.a(cur.qz, $$3);
      dib.a(cur.qB, $$3);
      dib.a(cur.qG, $$3);
      dib.a(cur.qH, $$3);
      dib.a(cur.qF, $$3);
      dib.a(cur.qI, $$3);
      dib.a(cur.qJ, $$3);
      dib.a(cur.qK, $$3);
      dib.a(cur.qy, new kw() {
         @Override
         public cuo a(ku $$0, cuo $$1) {
            dcv $$2 = $$0.b();
            jd $$3 = $$0.c().a($$0.d().c(dib.b));
            dta $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dgd $$6) {
               cuo $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.e()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dxw.y, $$3);
                  cuj $$8 = $$7.g();
                  return this.a($$0, $$1, new cuo($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dib.a(cur.os, new ky() {
         @Override
         protected cuo a(ku $$0, cuo $$1) {
            aqt $$2 = $$0.b();
            this.a(true);
            ji $$3 = $$0.d().c(dib.b);
            jd $$4 = $$0.c().a($$3);
            dta $$5 = $$2.a_($$4);
            if (dfj.a($$2, $$4, $$3)) {
               $$2.b($$4, dfj.a($$2, $$4));
               $$2.a(null, dxw.i, $$4);
            } else if (dgk.h($$5) || dgl.g($$5) || dgm.g($$5)) {
               $$2.b($$4, $$5.a(dtq.r, Boolean.valueOf(true)));
               $$2.a(null, dxw.c, $$4);
            } else if ($$5.b() instanceof dog) {
               dog.a($$2, $$4);
               $$2.a($$4, false);
            } else {
               this.a(false);
            }

            if (this.b()) {
               $$1.a(1, $$2, null, $$0x -> {
               });
            }

            return $$1;
         }
      });
      dib.a(cur.ry, new ky() {
         @Override
         protected cuo a(ku $$0, cuo $$1) {
            this.a(true);
            dcu $$2 = $$0.b();
            jd $$3 = $$0.c().a($$0.d().c(dib.b));
            if (!cso.a($$1, $$2, $$3) && !cso.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dib.a(dfy.ck, new kw() {
         @Override
         protected cuo a(ku $$0, cuo $$1) {
            dcu $$2 = $$0.b();
            jd $$3 = $$0.c().a($$0.d().c(dib.b));
            cjg $$4 = new cjg($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dv(), $$4.dx(), $$4.dB(), avo.zy, avp.e, 1.0F, 1.0F);
            $$2.a(null, dxw.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      kx $$4 = new ky() {
         @Override
         protected cuo a(ku $$0, cuo $$1) {
            this.a(csd.a($$0, $$1));
            return $$1;
         }
      };
      dib.a(cur.up, $$4);
      dib.a(cur.uo, $$4);
      dib.a(cur.uq, $$4);
      dib.a(cur.ul, $$4);
      dib.a(cur.ur, $$4);
      dib.a(cur.un, $$4);
      dib.a(cur.um, new ky() {
         @Override
         protected cuo a(ku $$0, cuo $$1) {
            dcu $$2 = $$0.b();
            ji $$3 = $$0.d().c(dib.b);
            jd $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dpq.b($$2, $$4, $$1)) {
               $$2.a($$4, dfy.gG.o().a(dmz.e, Integer.valueOf(dug.a($$3))), 3);
               $$2.a(null, dxw.i, $$4);
               dqf $$5 = $$2.c_($$4);
               if ($$5 instanceof drs) {
                  dpq.a($$2, $$4, (drs)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(csd.a($$0, $$1));
            }

            return $$1;
         }
      });
      dib.a(dfy.ee, new ky() {
         @Override
         protected cuo a(ku $$0, cuo $$1) {
            dcu $$2 = $$0.b();
            jd $$3 = $$0.c().a($$0.d().c(dib.b));
            dgq $$4 = (dgq)dfy.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dxw.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(csd.a($$0, $$1));
            }

            return $$1;
         }
      });
      dib.a(dfy.kP.r(), new lb());

      for (ctg $$5 : ctg.values()) {
         dib.a(dmw.a($$5).r(), new lb());
      }

      dib.a(cur.sl.r(), new ky() {
         private cuo b(ku $$0, cuo $$1, cuo $$2) {
            $$0.b().a(null, dxw.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cuo a(ku $$0, cuo $$1) {
            this.a(false);
            aqt $$2 = $$0.b();
            jd $$3 = $$0.c().a($$0.d().c(dib.b));
            dta $$4 = $$2.a_($$3);
            if ($$4.a(awd.aG, $$0x -> $$0x.b(dfq.c) && $$0x.b() instanceof dfq) && $$4.c(dfq.c) >= 5) {
               ((dfq)$$4.b()).a($$2, $$4, $$3, null, dqc.b.b);
               this.a(true);
               return this.b($$0, $$1, new cuo(cur.wC));
            } else if ($$2.b_($$3).a(awj.a)) {
               this.a(true);
               return this.b($$0, $$1, cws.a(cur.sk, cwt.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dib.a(cur.fu, new ky() {
         @Override
         public cuo a(ku $$0, cuo $$1) {
            ji $$2 = $$0.d().c(dib.b);
            jd $$3 = $$0.c().a($$2);
            dcu $$4 = $$0.b();
            dta $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dfy.pl)) {
               if ($$5.c(dmf.d) != 4) {
                  dmf.a(null, $$4, $$3, $$5);
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
      dib.a(cur.rV.r(), new la());
      dib.a(cur.xu.r(), new ky() {
         @Override
         protected cuo a(ku $$0, cuo $$1) {
            aqt $$2 = $$0.b();
            jd $$3 = $$0.c().a($$0.d().c(dib.b));
            List<cgl> $$4 = $$2.a(cgl.class, new ewr($$3), bsv.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cgl $$5 : $$4) {
                  if ($$5.gq()) {
                     $$1.a(16, $$2, null, $$0x -> {
                     });
                     return $$1;
                  }
               }

               this.a(false);
               return $$1;
            }
         }
      });
      dib.a(cur.wz, new ky() {
         @Override
         public cuo a(ku $$0, cuo $$1) {
            jd $$2 = $$0.c().a($$0.d().c(dib.b));
            dcu $$3 = $$0.b();
            dta $$4 = $$3.a_($$2);
            Optional<dta> $$5 = cue.a($$4);
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
      dib.a(cur.sk, new kw() {
         private final kw c = new kw();

         @Override
         public cuo a(ku $$0, cuo $$1) {
            cws $$2 = $$1.a(kq.G, cws.a);
            if (!$$2.a(cwt.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               aqt $$3 = $$0.b();
               jd $$4 = $$0.c();
               jd $$5 = $$0.c().a($$0.d().c(dib.b));
               if (!$$3.a_($$5).a(awd.ci)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lm.am, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, avo.cB, avp.e, 1.0F, 1.0F);
                  $$3.a(null, dxw.z, $$4);
                  $$3.b($$5, dfy.sI.o());
                  return this.a($$0, $$1, new cuo(cur.sl));
               }
            }
         }
      });
   }
}
