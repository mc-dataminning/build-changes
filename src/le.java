import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface le {
   Logger a = LogUtils.getLogger();
   le b = ($$0, $$1) -> $$1;

   cxy dispense(lb var1, cxy var2);

   static void a() {
      dna.a(cyc.pf);
      dna.a(cyc.wu);
      dna.a(cyc.wt);
      dna.a(cyc.rC);
      dna.a(cyc.rn);
      dna.a(cyc.uY);
      dna.a(cyc.ws);
      dna.a(cyc.wv);
      dna.a(cyc.vx);
      dna.a(cyc.uZ);
      dna.a(cyc.va);
      ld $$0 = new ld() {
         @Override
         public cxy a(lb $$0, cxy $$1) {
            jo $$2 = $$0.d().c(dna.b);
            bwb<?> $$3 = ((czf)$$1.h()).a($$0.b().F_(), $$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bwa.o, $$2 != jo.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return cxy.k;
            }

            $$1.h(1);
            $$0.b().a(null, edm.t, $$0.c());
            return $$1;
         }
      };

      for (czf $$1 : czf.b()) {
         dna.a($$1, $$0);
      }

      dna.a(cyc.vJ, new ld() {
         @Override
         public cxy a(lb $$0, cxy $$1) {
            jo $$2 = $$0.d().c(dna.b);
            jj $$3 = $$0.c().a($$2);
            arn $$4 = $$0.b();
            Consumer<cmc> $$5 = bwb.a($$1x -> $$1x.w($$2.p()), $$4, $$1, null);
            cmc $$6 = bwb.f.a($$4, $$5, $$3, bwa.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dna.a(cyc.fd, new lh() {
         @Override
         public cxy a(lb $$0, cxy $$1) {
            jj $$2 = $$0.c().a($$0.d().c(dna.b));

            for (ckm $$4 : $$0.b().a(ckm.class, new fcp($$2), $$0x -> $$0x.bK() && !$$0x.t())) {
               if ($$4.gH() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dna.a(cyc.oz, new lc(bwb.aG));
      dna.a(cyc.oB, new lc(bwb.bo));
      dna.a(cyc.oD, new lc(bwb.m));
      dna.a(cyc.oF, new lc(bwb.at));
      dna.a(cyc.oL, new lc(bwb.F));
      dna.a(cyc.oH, new lc(bwb.a));
      dna.a(cyc.oJ, new lc(bwb.w));
      dna.a(cyc.oP, new lc(bwb.aA));
      dna.a(cyc.oN, new lc(bwb.aL));
      dna.a(cyc.oR, new lc(bwb.j));
      dna.a(cyc.oA, new lc(bwb.aH));
      dna.a(cyc.oC, new lc(bwb.bp));
      dna.a(cyc.oE, new lc(bwb.n));
      dna.a(cyc.oG, new lc(bwb.au));
      dna.a(cyc.oM, new lc(bwb.G));
      dna.a(cyc.oI, new lc(bwb.b));
      dna.a(cyc.oK, new lc(bwb.x));
      dna.a(cyc.oQ, new lc(bwb.aB));
      dna.a(cyc.oO, new lc(bwb.aM));
      dna.a(cyc.oS, new lc(bwb.i));
      le $$2 = new ld() {
         private final ld c = new ld();

         @Override
         public cxy a(lb $$0, cxy $$1) {
            cwt $$2 = (cwt)$$1.h();
            jj $$3 = $$0.c().a($$0.d().c(dna.b));
            dhp $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new cxy(cyc.rj));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dna.a(cyc.rl, $$2);
      dna.a(cyc.rk, $$2);
      dna.a(cyc.rm, $$2);
      dna.a(cyc.rr, $$2);
      dna.a(cyc.rs, $$2);
      dna.a(cyc.rq, $$2);
      dna.a(cyc.rt, $$2);
      dna.a(cyc.ru, $$2);
      dna.a(cyc.rv, $$2);
      dna.a(cyc.rj, new ld() {
         @Override
         public cxy a(lb $$0, cxy $$1) {
            dhq $$2 = $$0.b();
            jj $$3 = $$0.c().a($$0.d().c(dna.b));
            dym $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dlc $$6) {
               cxy $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, edm.y, $$3);
                  cxu $$8 = $$7.h();
                  return this.a($$0, $$1, new cxy($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dna.a(cyc.pb, new lh() {
         @Override
         protected cxy a(lb $$0, cxy $$1) {
            arn $$2 = $$0.b();
            this.a(true);
            jo $$3 = $$0.d().c(dna.b);
            jj $$4 = $$0.c().a($$3);
            dym $$5 = $$2.a_($$4);
            if (dkh.a($$2, $$4, $$3)) {
               $$2.b($$4, dkh.a($$2, $$4));
               $$2.a(null, edm.i, $$4);
            } else if (dlj.i($$5) || dlk.h($$5) || dll.h($$5)) {
               $$2.b($$4, $$5.b(dzc.u, Boolean.valueOf(true)));
               $$2.a(null, edm.c, $$4);
            } else if ($$5.b() instanceof dtl) {
               dtl.a($$2, $$4);
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
      dna.a(cyc.sz, new lh() {
         @Override
         protected cxy a(lb $$0, cxy $$1) {
            this.a(true);
            dhp $$2 = $$0.b();
            jj $$3 = $$0.c().a($$0.d().c(dna.b));
            if (!cwh.a($$1, $$2, $$3) && !cwh.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dna.a(dkw.cr, new ld() {
         @Override
         protected cxy a(lb $$0, cxy $$1) {
            dhp $$2 = $$0.b();
            jj $$3 = $$0.c().a($$0.d().c(dna.b));
            cmo $$4 = new cmo($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dA(), $$4.dC(), $$4.dG(), awk.Aw, awl.e, 1.0F, 1.0F);
            $$2.a(null, edm.t, $$3);
            $$1.h(1);
            return $$1;
         }
      });
      dna.a(cyc.vp, new lh() {
         @Override
         protected cxy a(lb $$0, cxy $$1) {
            dhp $$2 = $$0.b();
            jo $$3 = $$0.d().c(dna.b);
            jj $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && duv.b($$2, $$4, $$1)) {
               $$2.a($$4, dkw.hd.m().b(dsc.e, Integer.valueOf(dzs.a($$3))), 3);
               $$2.a(null, edm.i, $$4);
               dvl $$5 = $$2.c_($$4);
               if ($$5 instanceof dxb) {
                  duv.a($$2, $$4, (dxb)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lf.b($$0, $$1));
            }

            return $$1;
         }
      });
      dna.a(dkw.er, new lh() {
         @Override
         protected cxy a(lb $$0, cxy $$1) {
            dhp $$2 = $$0.b();
            jj $$3 = $$0.c().a($$0.d().c(dna.b));
            dlp $$4 = (dlp)dkw.er;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, edm.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lf.b($$0, $$1));
            }

            return $$1;
         }
      });
      dna.a(dkw.lr.i(), new lk());

      for (cwv $$3 : cwv.values()) {
         dna.a(drz.a($$3).i(), new lk());
      }

      dna.a(cyc.tl.i(), new lh() {
         private cxy b(lb $$0, cxy $$1, cxy $$2) {
            $$0.b().a(null, edm.y, $$0.c());
            return this.a($$0, $$1, $$2);
         }

         @Override
         public cxy a(lb $$0, cxy $$1) {
            this.a(false);
            arn $$2 = $$0.b();
            jj $$3 = $$0.c().a($$0.d().c(dna.b));
            dym $$4 = $$2.a_($$3);
            if ($$4.a(awz.aJ, $$0x -> $$0x.b(dko.c) && $$0x.b() instanceof dko) && $$4.c(dko.c) >= 5) {
               ((dko)$$4.b()).a($$2, $$4, $$3, null, dvi.b.b);
               this.a(true);
               return this.b($$0, $$1, new cxy(cyc.xH));
            } else if ($$2.b_($$3).a(axf.a)) {
               this.a(true);
               return this.b($$0, $$1, czu.a(cyc.tm, czv.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dna.a(cyc.fL, new lh() {
         @Override
         public cxy a(lb $$0, cxy $$1) {
            jo $$2 = $$0.d().c(dna.b);
            jj $$3 = $$0.c().a($$2);
            dhp $$4 = $$0.b();
            dym $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dkw.pP)) {
               if ($$5.c(drh.d) != 4) {
                  drh.a(null, $$4, $$3, $$5);
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
      dna.a(cyc.sW.i(), new lj());
      dna.a(cyc.yz.i(), new lh() {
         @Override
         protected cxy a(lb $$0, cxy $$1) {
            arn $$2 = $$0.b();
            jj $$3 = $$0.c().a($$0.d().c(dna.b));
            List<cjs> $$4 = $$2.a(cjs.class, new fcp($$3), bvz.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cjs $$5 : $$4) {
                  if ($$5.gu()) {
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
      dna.a(cyc.xE, new lh() {
         @Override
         public cxy a(lb $$0, cxy $$1) {
            jj $$2 = $$0.c().a($$0.d().c(dna.b));
            dhp $$3 = $$0.b();
            dym $$4 = $$3.a_($$2);
            Optional<dym> $$5 = cxp.a($$4);
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
      dna.a(cyc.tm, new ld() {
         private final ld c = new ld();

         @Override
         public cxy a(lb $$0, cxy $$1) {
            czu $$2 = $$1.a(kx.R, czu.a);
            if (!$$2.a(czv.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               arn $$3 = $$0.b();
               jj $$4 = $$0.c();
               jj $$5 = $$0.c().a($$0.d().c(dna.b));
               if (!$$3.a_($$5).a(awz.cm)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(lv.ap, (double)$$4.u() + $$3.A.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, awk.cB, awl.e, 1.0F, 1.0F);
                  $$3.a(null, edm.z, $$4);
                  $$3.b($$5, dkw.to.m());
                  return this.a($$0, $$1, new cxy(cyc.tl));
               }
            }
         }
      });
      dna.a(cyc.oq, new lg(bwb.aD));
      dna.a(cyc.or, new lg(bwb.y));
      dna.a(cyc.os, new lg(bwb.ac));
      dna.a(cyc.ot, new lg(bwb.bw));
      dna.a(cyc.ou, new lg(bwb.ak));
      dna.a(cyc.vQ, new lg(bwb.B));
   }
}
