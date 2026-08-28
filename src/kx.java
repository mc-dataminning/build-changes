import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface kx {
   Logger a = LogUtils.getLogger();
   kx b = ($$0, $$1) -> $$1;

   cuq dispense(ku var1, cuq var2);

   static void a() {
      did.a(cut.ow);
      did.a(cut.vq);
      did.a(cut.vp);
      did.a(cut.qR);
      did.a(cut.qC);
      did.a(cut.tW);
      did.a(cut.vo);
      did.a(cut.vr);
      did.a(cut.uu);
      did.a(cut.tX);
      did.a(cut.tY);
      kw $$0 = new kw() {
         @Override
         public cuq a(ku $$0, cuq $$1) {
            ji $$2 = $$0.d().c(did.b);
            bsx<?> $$3 = ((cwa)$$1.g()).i($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), btr.o, $$2 != ji.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cuq.l;
            }

            $$1.h(1);
            $$0.b().a(null, dxz.t, $$0.c());
            return $$1;
         }
      };

      for (cwa $$1 : cwa.h()) {
         did.a($$1, $$0);
      }

      did.a(cut.uF, new kw() {
         @Override
         public cuq a(ku $$0, cuq $$1) {
            ji $$2 = $$0.d().c(did.b);
            jd $$3 = $$0.c().a($$2);
            aqu $$4 = $$0.b();
            Consumer<ciw> $$5 = bsx.a($$1x -> $$1x.t($$2.p()), $$4, $$1, null);
            ciw $$6 = bsx.d.a($$4, $$5, $$3, btr.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      did.a(cut.nL, new ky() {
         @Override
         public cuq a(ku $$0, cuq $$1) {
            jd $$2 = $$0.c().a($$0.d().c(did.b));
            List<btn> $$3 = $$0.b().a(btn.class, new ewv($$2), $$0x -> !($$0x instanceof bue $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bue)$$3.get(0)).a($$1.a(1), avq.e);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      kw $$2 = new ky() {
         @Override
         protected cuq a(ku $$0, cuq $$1) {
            jd $$2 = $$0.c().a($$0.d().c(did.b));

            for (chi $$4 : $$0.b().a(chi.class, new ewv($$2), $$0x -> $$0x.bE() && $$0x.d(bsy.g))) {
               if ($$4.l($$1) && !$$4.fQ() && $$4.gA()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      did.a(cut.uJ, $$2);
      did.a(cut.uG, $$2);
      did.a(cut.uH, $$2);
      did.a(cut.uI, $$2);
      did.a(cut.hE, $$2);
      did.a(cut.hF, $$2);
      did.a(cut.hN, $$2);
      did.a(cut.hP, $$2);
      did.a(cut.hQ, $$2);
      did.a(cut.hT, $$2);
      did.a(cut.hL, $$2);
      did.a(cut.hR, $$2);
      did.a(cut.hH, $$2);
      did.a(cut.hM, $$2);
      did.a(cut.hJ, $$2);
      did.a(cut.hG, $$2);
      did.a(cut.hK, $$2);
      did.a(cut.hO, $$2);
      did.a(cut.hS, $$2);
      did.a(cut.hI, $$2);
      did.a(cut.eN, new ky() {
         @Override
         public cuq a(ku $$0, cuq $$1) {
            jd $$2 = $$0.c().a($$0.d().c(did.b));

            for (chh $$4 : $$0.b().a(chh.class, new ewv($$2), $$0x -> $$0x.bE() && !$$0x.t())) {
               if ($$4.gA() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      did.a(cut.nU, new kv(cov.b.a));
      did.a(cut.nW, new kv(cov.b.b));
      did.a(cut.nY, new kv(cov.b.c));
      did.a(cut.oa, new kv(cov.b.d));
      did.a(cut.og, new kv(cov.b.g));
      did.a(cut.oc, new kv(cov.b.e));
      did.a(cut.oe, new kv(cov.b.f));
      did.a(cut.oi, new kv(cov.b.h));
      did.a(cut.ok, new kv(cov.b.i));
      did.a(cut.nV, new kv(cov.b.a, true));
      did.a(cut.nX, new kv(cov.b.b, true));
      did.a(cut.nZ, new kv(cov.b.c, true));
      did.a(cut.ob, new kv(cov.b.d, true));
      did.a(cut.oh, new kv(cov.b.g, true));
      did.a(cut.od, new kv(cov.b.e, true));
      did.a(cut.of, new kv(cov.b.f, true));
      did.a(cut.oj, new kv(cov.b.h, true));
      did.a(cut.ol, new kv(cov.b.i, true));
      kx $$3 = new kw() {
         private final kw c = new kw();

         @Override
         public cuq a(ku $$0, cuq $$1) {
            ctg $$2 = (ctg)$$1.g();
            jd $$3 = $$0.c().a($$0.d().c(did.b));
            dcw $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cuq(cut.qy));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      did.a(cut.qA, $$3);
      did.a(cut.qz, $$3);
      did.a(cut.qB, $$3);
      did.a(cut.qG, $$3);
      did.a(cut.qH, $$3);
      did.a(cut.qF, $$3);
      did.a(cut.qI, $$3);
      did.a(cut.qJ, $$3);
      did.a(cut.qK, $$3);
      did.a(cut.qy, new kw() {
         @Override
         public cuq a(ku $$0, cuq $$1) {
            dcx $$2 = $$0.b();
            jd $$3 = $$0.c().a($$0.d().c(did.b));
            dtc $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dgf $$6) {
               cuq $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.e()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dxz.y, $$3);
                  cul $$8 = $$7.g();
                  return this.a($$0, $$1, new cuq($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      did.a(cut.os, new ky() {
         @Override
         protected cuq a(ku $$0, cuq $$1) {
            aqu $$2 = $$0.b();
            this.a(true);
            ji $$3 = $$0.d().c(did.b);
            jd $$4 = $$0.c().a($$3);
            dtc $$5 = $$2.a_($$4);
            if (dfl.a($$2, $$4, $$3)) {
               $$2.b($$4, dfl.a($$2, $$4));
               $$2.a(null, dxz.i, $$4);
            } else if (dgm.h($$5) || dgn.g($$5) || dgo.g($$5)) {
               $$2.b($$4, $$5.a(dts.r, Boolean.valueOf(true)));
               $$2.a(null, dxz.c, $$4);
            } else if ($$5.b() instanceof doi) {
               doi.a($$2, $$4);
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
      did.a(cut.ry, new ky() {
         @Override
         protected cuq a(ku $$0, cuq $$1) {
            this.a(true);
            dcw $$2 = $$0.b();
            jd $$3 = $$0.c().a($$0.d().c(did.b));
            if (!csq.a($$1, $$2, $$3) && !csq.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      did.a(dga.ck, new kw() {
         @Override
         protected cuq a(ku $$0, cuq $$1) {
            dcw $$2 = $$0.b();
            jd $$3 = $$0.c().a($$0.d().c(did.b));
            cji $$4 = new cji($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.du(), $$4.dw(), $$4.dA(), avp.zy, avq.e, 1.0F, 1.0F);
            $$2.a(null, dxz.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      kx $$4 = new ky() {
         @Override
         protected cuq a(ku $$0, cuq $$1) {
            this.a(csf.a($$0, $$1));
            return $$1;
         }
      };
      did.a(cut.up, $$4);
      did.a(cut.uo, $$4);
      did.a(cut.uq, $$4);
      did.a(cut.ul, $$4);
      did.a(cut.ur, $$4);
      did.a(cut.un, $$4);
      did.a(cut.um, new ky() {
         @Override
         protected cuq a(ku $$0, cuq $$1) {
            dcw $$2 = $$0.b();
            ji $$3 = $$0.d().c(did.b);
            jd $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dps.b($$2, $$4, $$1)) {
               $$2.a($$4, dga.gG.o().a(dnb.e, Integer.valueOf(dui.a($$3))), 3);
               $$2.a(null, dxz.i, $$4);
               dqh $$5 = $$2.c_($$4);
               if ($$5 instanceof dru) {
                  dps.a($$2, $$4, (dru)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(csf.a($$0, $$1));
            }

            return $$1;
         }
      });
      did.a(dga.ee, new ky() {
         @Override
         protected cuq a(ku $$0, cuq $$1) {
            dcw $$2 = $$0.b();
            jd $$3 = $$0.c().a($$0.d().c(did.b));
            dgs $$4 = (dgs)dga.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.o(), 3);
                  $$2.a(null, dxz.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(csf.a($$0, $$1));
            }

            return $$1;
         }
      });
      did.a(dga.kP.r(), new lb());

      for (cti $$5 : cti.values()) {
         did.a(dmy.a($$5).r(), new lb());
      }

      did.a(cut.sl.r(), new ky() {
         private cuq b(ku $$0, cuq $$1, cuq $$2) {
            $$0.b().a(null, dxz.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cuq a(ku $$0, cuq $$1) {
            this.a(false);
            aqu $$2 = $$0.b();
            jd $$3 = $$0.c().a($$0.d().c(did.b));
            dtc $$4 = $$2.a_($$3);
            if ($$4.a(awe.aG, $$0x -> $$0x.b(dfs.c) && $$0x.b() instanceof dfs) && $$4.c(dfs.c) >= 5) {
               ((dfs)$$4.b()).a($$2, $$4, $$3, null, dqe.b.b);
               this.a(true);
               return this.b($$0, $$1, new cuq(cut.wC));
            } else if ($$2.b_($$3).a(awk.a)) {
               this.a(true);
               return this.b($$0, $$1, cwu.a(cut.sk, cwv.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      did.a(cut.fu, new ky() {
         @Override
         public cuq a(ku $$0, cuq $$1) {
            ji $$2 = $$0.d().c(did.b);
            jd $$3 = $$0.c().a($$2);
            dcw $$4 = $$0.b();
            dtc $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dga.pl)) {
               if ($$5.c(dmh.d) != 4) {
                  dmh.a(null, $$4, $$3, $$5);
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
      did.a(cut.rV.r(), new la());
      did.a(cut.xu.r(), new ky() {
         @Override
         protected cuq a(ku $$0, cuq $$1) {
            aqu $$2 = $$0.b();
            jd $$3 = $$0.c().a($$0.d().c(did.b));
            List<cgn> $$4 = $$2.a(cgn.class, new ewv($$3), bsw.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cgn $$5 : $$4) {
                  if ($$5.gp()) {
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
      did.a(cut.wz, new ky() {
         @Override
         public cuq a(ku $$0, cuq $$1) {
            jd $$2 = $$0.c().a($$0.d().c(did.b));
            dcw $$3 = $$0.b();
            dtc $$4 = $$3.a_($$2);
            Optional<dtc> $$5 = cug.a($$4);
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
      did.a(cut.sk, new kw() {
         private final kw c = new kw();

         @Override
         public cuq a(ku $$0, cuq $$1) {
            cwu $$2 = $$1.a(kq.G, cwu.a);
            if (!$$2.a(cwv.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               aqu $$3 = $$0.b();
               jd $$4 = $$0.c();
               jd $$5 = $$0.c().a($$0.d().c(did.b));
               if (!$$3.a_($$5).a(awe.ci)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lm.am, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, avp.cB, avq.e, 1.0F, 1.0F);
                  $$3.a(null, dxz.z, $$4);
                  $$3.b($$5, dga.sI.o());
                  return this.a($$0, $$1, new cuq(cut.sl));
               }
            }
         }
      });
   }
}
