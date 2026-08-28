import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface kt {
   Logger a = LogUtils.getLogger();
   kt b = ($$0, $$1) -> $$1;

   cuo dispense(kq var1, cuo var2);

   static void a() {
      dhd.a(cur.ov);
      dhd.a(cur.vq);
      dhd.a(cur.vp);
      dhd.a(cur.qR);
      dhd.a(cur.qC);
      dhd.a(cur.tW);
      dhd.a(cur.vo);
      dhd.a(cur.vr);
      dhd.a(cur.uu);
      dhd.a(cur.tX);
      dhd.a(cur.tY);
      ks $$0 = new ks() {
         @Override
         public cuo a(kq $$0, cuo $$1) {
            je $$2 = $$0.d().c(dhd.b);
            bsz<?> $$3 = ((cvv)$$1.g()).j($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bts.o, $$2 != je.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cuo.l;
            }

            $$1.h(1);
            $$0.b().a(null, dwu.t, $$0.c());
            return $$1;
         }
      };

      for (cvv $$1 : cvv.h()) {
         dhd.a($$1, $$0);
      }

      dhd.a(cur.uF, new ks() {
         @Override
         public cuo a(kq $$0, cuo $$1) {
            je $$2 = $$0.d().c(dhd.b);
            iz $$3 = $$0.c().a($$2);
            are $$4 = $$0.b();
            Consumer<ciw> $$5 = bsz.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            ciw $$6 = bsz.d.a($$4, $$5, $$3, bts.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dhd.a(cur.nL, new ku() {
         @Override
         public cuo a(kq $$0, cuo $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhd.b));
            List<bto> $$3 = $$0.b().a(bto.class, new evl($$2), $$0x -> !($$0x instanceof bue $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bue)$$3.get(0)).a(awa.e);
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
         protected cuo a(kq $$0, cuo $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhd.b));

            for (chi $$4 : $$0.b().a(chi.class, new evl($$2), $$0x -> $$0x.bD() && $$0x.fS())) {
               if ($$4.l($$1) && !$$4.fT() && $$4.gF()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dhd.a(cur.uJ, $$2);
      dhd.a(cur.uG, $$2);
      dhd.a(cur.uH, $$2);
      dhd.a(cur.uI, $$2);
      dhd.a(cur.hE, $$2);
      dhd.a(cur.hF, $$2);
      dhd.a(cur.hN, $$2);
      dhd.a(cur.hP, $$2);
      dhd.a(cur.hQ, $$2);
      dhd.a(cur.hT, $$2);
      dhd.a(cur.hL, $$2);
      dhd.a(cur.hR, $$2);
      dhd.a(cur.hH, $$2);
      dhd.a(cur.hM, $$2);
      dhd.a(cur.hJ, $$2);
      dhd.a(cur.hG, $$2);
      dhd.a(cur.hK, $$2);
      dhd.a(cur.hO, $$2);
      dhd.a(cur.hS, $$2);
      dhd.a(cur.hI, $$2);
      dhd.a(cur.eN, new ku() {
         @Override
         public cuo a(kq $$0, cuo $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhd.b));

            for (chh $$4 : $$0.b().a(chh.class, new evl($$2), $$0x -> $$0x.bD() && !$$0x.u())) {
               if ($$4.gF() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dhd.a(cur.nU, new kr(cou.b.a));
      dhd.a(cur.nW, new kr(cou.b.b));
      dhd.a(cur.nY, new kr(cou.b.c));
      dhd.a(cur.oa, new kr(cou.b.d));
      dhd.a(cur.og, new kr(cou.b.g));
      dhd.a(cur.oc, new kr(cou.b.e));
      dhd.a(cur.oe, new kr(cou.b.f));
      dhd.a(cur.oi, new kr(cou.b.h));
      dhd.a(cur.ok, new kr(cou.b.i));
      dhd.a(cur.nV, new kr(cou.b.a, true));
      dhd.a(cur.nX, new kr(cou.b.b, true));
      dhd.a(cur.nZ, new kr(cou.b.c, true));
      dhd.a(cur.ob, new kr(cou.b.d, true));
      dhd.a(cur.oh, new kr(cou.b.g, true));
      dhd.a(cur.od, new kr(cou.b.e, true));
      dhd.a(cur.of, new kr(cou.b.f, true));
      dhd.a(cur.oj, new kr(cou.b.h, true));
      dhd.a(cur.ol, new kr(cou.b.i, true));
      kt $$3 = new ks() {
         private final ks c = new ks();

         @Override
         public cuo a(kq $$0, cuo $$1) {
            ctf $$2 = (ctf)$$1.g();
            iz $$3 = $$0.c().a($$0.d().c(dhd.b));
            dbx $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cuo(cur.qy);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dhd.a(cur.qA, $$3);
      dhd.a(cur.qz, $$3);
      dhd.a(cur.qB, $$3);
      dhd.a(cur.qG, $$3);
      dhd.a(cur.qH, $$3);
      dhd.a(cur.qF, $$3);
      dhd.a(cur.qI, $$3);
      dhd.a(cur.qJ, $$3);
      dhd.a(cur.qK, $$3);
      dhd.a(cur.qy, new ks() {
         private final ks c = new ks();

         @Override
         public cuo a(kq $$0, cuo $$1) {
            dby $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhd.b));
            dsb $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dff $$6) {
               cuo $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.e()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dwu.y, $$3);
                  cuj $$8 = $$7.g();
                  $$1.h(1);
                  if ($$1.e()) {
                     return new cuo($$8);
                  } else {
                     if ($$0.e().b(new cuo($$8)) < 0) {
                        this.c.dispense($$0, new cuo($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dhd.a(cur.os, new ku() {
         @Override
         protected cuo a(kq $$0, cuo $$1) {
            dbx $$2 = $$0.b();
            this.a(true);
            je $$3 = $$0.d().c(dhd.b);
            iz $$4 = $$0.c().a($$3);
            dsb $$5 = $$2.a_($$4);
            if (del.a($$2, $$4, $$3)) {
               $$2.b($$4, del.a($$2, $$4));
               $$2.a(null, dwu.i, $$4);
            } else if (dfm.h($$5) || dfn.g($$5) || dfo.g($$5)) {
               $$2.b($$4, $$5.a(dsr.r, Boolean.valueOf(true)));
               $$2.a(null, dwu.c, $$4);
            } else if ($$5.b() instanceof dnh) {
               dnh.a($$2, $$4);
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
      dhd.a(cur.ry, new ku() {
         @Override
         protected cuo a(kq $$0, cuo $$1) {
            this.a(true);
            dbx $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhd.b));
            if (!cso.a($$1, $$2, $$3) && !cso.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dhd.a(dfa.ck, new ks() {
         @Override
         protected cuo a(kq $$0, cuo $$1) {
            dbx $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhd.b));
            cjh $$4 = new cjh($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.du(), $$4.dw(), $$4.dA(), avz.zv, awa.e, 1.0F, 1.0F);
            $$2.a(null, dwu.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      kt $$4 = new ku() {
         @Override
         protected cuo a(kq $$0, cuo $$1) {
            this.a(csd.a($$0, $$1));
            return $$1;
         }
      };
      dhd.a(cur.up, $$4);
      dhd.a(cur.uo, $$4);
      dhd.a(cur.uq, $$4);
      dhd.a(cur.ul, $$4);
      dhd.a(cur.ur, $$4);
      dhd.a(cur.un, $$4);
      dhd.a(cur.um, new ku() {
         @Override
         protected cuo a(kq $$0, cuo $$1) {
            dbx $$2 = $$0.b();
            je $$3 = $$0.d().c(dhd.b);
            iz $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dor.b($$2, $$4, $$1)) {
               $$2.a($$4, dfa.gG.o().a(dma.e, Integer.valueOf(dth.a($$3))), 3);
               $$2.a(null, dwu.i, $$4);
               dpg $$5 = $$2.c_($$4);
               if ($$5 instanceof dqs) {
                  dor.a($$2, $$4, (dqs)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(csd.a($$0, $$1));
            }

            return $$1;
         }
      });
      dhd.a(dfa.ee, new ku() {
         @Override
         protected cuo a(kq $$0, cuo $$1) {
            dbx $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhd.b));
            dfs $$4 = (dfs)dfa.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dwu.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(csd.a($$0, $$1));
            }

            return $$1;
         }
      });
      dhd.a(dfa.kP.r(), new kx());

      for (cth $$5 : cth.values()) {
         dhd.a(dlx.a($$5).r(), new kx());
      }

      dhd.a(cur.sl.r(), new ku() {
         private final ks c = new ks();

         private cuo a(kq $$0, cuo $$1, cuo $$2) {
            $$1.h(1);
            if ($$1.e()) {
               $$0.b().a(null, dwu.y, $$0.c());
               return $$2.s();
            } else {
               if ($$0.e().b($$2.s()) < 0) {
                  this.c.dispense($$0, $$2.s());
               }

               return $$1;
            }
         }

         @Override
         public cuo a(kq $$0, cuo $$1) {
            this.a(false);
            are $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhd.b));
            dsb $$4 = $$2.a_($$3);
            if ($$4.a(awo.aG, $$0x -> $$0x.b(des.c) && $$0x.b() instanceof des) && $$4.c(des.c) >= 5) {
               ((des)$$4.b()).a($$2, $$4, $$3, null, dpd.b.b);
               this.a(true);
               return this.a($$0, $$1, new cuo(cur.wz));
            } else if ($$2.b_($$3).a(awu.a)) {
               this.a(true);
               return this.a($$0, $$1, cwp.a(cur.sk, cwq.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dhd.a(cur.fu, new ku() {
         @Override
         public cuo a(kq $$0, cuo $$1) {
            je $$2 = $$0.d().c(dhd.b);
            iz $$3 = $$0.c().a($$2);
            dbx $$4 = $$0.b();
            dsb $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dfa.pl)) {
               if ($$5.c(dlg.d) != 4) {
                  dlg.a(null, $$4, $$3, $$5);
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
      dhd.a(cur.rV.r(), new kw());
      dhd.a(cur.xr.r(), new ku() {
         @Override
         protected cuo a(kq $$0, cuo $$1) {
            are $$2 = $$0.b();
            iz $$3 = $$0.c().a($$0.d().c(dhd.b));
            List<cgn> $$4 = $$2.a(cgn.class, new evl($$3), bsy.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cgn $$5 : $$4) {
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
      dhd.a(cur.ww, new ku() {
         @Override
         public cuo a(kq $$0, cuo $$1) {
            iz $$2 = $$0.c().a($$0.d().c(dhd.b));
            dbx $$3 = $$0.b();
            dsb $$4 = $$3.a_($$2);
            Optional<dsb> $$5 = cue.a($$4);
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
      dhd.a(cur.sk, new ks() {
         private final ks c = new ks();

         @Override
         public cuo a(kq $$0, cuo $$1) {
            cwp $$2 = $$1.a(km.G, cwp.a);
            if (!$$2.a(cwq.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               are $$3 = $$0.b();
               iz $$4 = $$0.c();
               iz $$5 = $$0.c().a($$0.d().c(dhd.b));
               if (!$$3.a_($$5).a(awo.ci)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(li.am, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, avz.cB, awa.e, 1.0F, 1.0F);
                  $$3.a(null, dwu.z, $$4);
                  $$3.b($$5, dfa.sI.o());
                  return new cuo(cur.sl);
               }
            }
         }
      });
   }
}
