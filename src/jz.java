import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface jz {
   Logger a = LogUtils.getLogger();
   jz b = ($$0, $$1) -> $$1;

   crs dispense(jw var1, crs var2);

   static void c() {
      dem.a(crv.ou, new jv() {
         @Override
         protected cks a(czg $$0, ix $$1, crs $$2) {
            cki $$3 = new cki($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = ckg.a.b;
            return $$3;
         }
      });
      dem.a(crv.vo, new jv() {
         @Override
         protected cks a(czg $$0, ix $$1, crs $$2) {
            cki $$3 = new cki($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = ckg.a.b;
            return $$3;
         }
      });
      dem.a(crv.vn, new jv() {
         @Override
         protected cks a(czg $$0, ix $$1, crs $$2) {
            ckg $$3 = new cky($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
            $$3.d = ckg.a.b;
            return $$3;
         }
      });
      dem.a(crv.qQ, new jv() {
         @Override
         protected cks a(czg $$0, ix $$1, crs $$2) {
            return ac.a(new clb($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      dem.a(crv.qB, new jv() {
         @Override
         protected cks a(czg $$0, ix $$1, crs $$2) {
            return ac.a(new ckx($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      dem.a(crv.tV, new jv() {
         @Override
         protected cks a(czg $$0, ix $$1, crs $$2) {
            return ac.a(new cld($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      dem.a(crv.vm, new jz() {
         @Override
         public crs dispense(jw $$0, crs $$1) {
            return (new jv() {
               @Override
               protected cks a(czg $$0, ix $$1, crs $$2) {
                  return ac.a(new cle($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      dem.a(crv.vp, new jz() {
         @Override
         public crs dispense(jw $$0, crs $$1) {
            return (new jv() {
               @Override
               protected cks a(czg $$0, ix $$1, crs $$2) {
                  return ac.a(new cle($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
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
      jy $$0 = new jy() {
         @Override
         public crs a(jw $$0, crs $$1) {
            ij $$2 = $$0.d().c(dem.b);
            bqg<?> $$3 = ((csw)$$1.f()).j($$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bqx.o, $$2 != ij.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return crs.i;
            }

            $$1.g(1);
            $$0.b().a(null, dub.t, $$0.c());
            return $$1;
         }
      };

      for (csw $$1 : csw.h()) {
         dem.a($$1, $$0);
      }

      dem.a(crv.uD, new jy() {
         @Override
         public crs a(jw $$0, crs $$1) {
            ij $$2 = $$0.d().c(dem.b);
            id $$3 = $$0.c().a($$2);
            apu $$4 = $$0.b();
            Consumer<cga> $$5 = bqg.a($$1x -> $$1x.r($$2.p()), $$4, $$1, null);
            cga $$6 = bqg.d.a($$4, $$5, $$3, bqx.o, false, false);
            if ($$6 != null) {
               $$1.g(1);
            }

            return $$1;
         }
      });
      dem.a(crv.nK, new ka() {
         @Override
         public crs a(jw $$0, crs $$1) {
            id $$2 = $$0.c().a($$0.d().c(dem.b));
            List<bqt> $$3 = $$0.b().a(bqt.class, new ese($$2), $$0x -> !($$0x instanceof bri $$1x) ? false : !$$1x.i() && $$1x.f());
            if (!$$3.isEmpty()) {
               ((bri)$$3.get(0)).a(aup.e);
               $$1.g(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      jy $$2 = new ka() {
         @Override
         protected crs a(jw $$0, crs $$1) {
            id $$2 = $$0.c().a($$0.d().c(dem.b));

            for (cem $$4 : $$0.b().a(cem.class, new ese($$2), $$0x -> $$0x.bA() && $$0x.fQ())) {
               if ($$4.l($$1) && !$$4.fR() && $$4.gC()) {
                  $$4.m($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      dem.a(crv.uH, $$2);
      dem.a(crv.uE, $$2);
      dem.a(crv.uF, $$2);
      dem.a(crv.uG, $$2);
      dem.a(crv.hD, $$2);
      dem.a(crv.hE, $$2);
      dem.a(crv.hM, $$2);
      dem.a(crv.hO, $$2);
      dem.a(crv.hP, $$2);
      dem.a(crv.hS, $$2);
      dem.a(crv.hK, $$2);
      dem.a(crv.hQ, $$2);
      dem.a(crv.hG, $$2);
      dem.a(crv.hL, $$2);
      dem.a(crv.hI, $$2);
      dem.a(crv.hF, $$2);
      dem.a(crv.hJ, $$2);
      dem.a(crv.hN, $$2);
      dem.a(crv.hR, $$2);
      dem.a(crv.hH, $$2);
      dem.a(crv.eM, new ka() {
         @Override
         public crs a(jw $$0, crs $$1) {
            id $$2 = $$0.c().a($$0.d().c(dem.b));

            for (cel $$4 : $$0.b().a(cel.class, new ese($$2), $$0x -> $$0x.bA() && !$$0x.u())) {
               if ($$4.gC() && $$4.a_(499).a($$1)) {
                  $$1.g(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dem.a(crv.us, new jy() {
         @Override
         public crs a(jw $$0, crs $$1) {
            ij $$2 = $$0.d().c(dem.b);
            esj $$3 = jz.a($$0, bqg.P, $$2);
            ckn $$4 = new ckn($$0.b(), $$1, $$3.a(), $$3.b(), $$3.c(), true);
            $$4.c((double)$$2.j(), (double)$$2.k(), (double)$$2.l(), 0.5F, 1.0F);
            $$0.b().b($$4);
            $$1.g(1);
            return $$1;
         }

         @Override
         protected void a(jw $$0) {
            $$0.b().c(1004, $$0.c(), 0);
         }
      });
      dem.a(crv.tW, new jy() {
         @Override
         public crs a(jw $$0, crs $$1) {
            ij $$2 = $$0.d().c(dem.b);
            ix $$3 = dem.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            czg $$7 = $$0.b();
            axt $$8 = $$7.z;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            ckw $$12 = new ckw($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ac.a($$12, $$1x -> $$1x.a($$1)));
            $$1.g(1);
            return $$1;
         }

         @Override
         protected void a(jw $$0) {
            $$0.b().c(1018, $$0.c(), 0);
         }
      });
      dem.a(
         crv.tX,
         new jy() {
            @Override
            public crs a(jw $$0, crs $$1) {
               ij $$2 = $$0.d().c(dem.b);
               ix $$3 = dem.a($$0);
               czg $$4 = $$0.b();
               axt $$5 = $$4.z;
               double $$6 = $$5.a((double)$$2.j(), 0.11485000000000001);
               double $$7 = $$5.a((double)$$2.k(), 0.11485000000000001);
               double $$8 = $$5.a((double)$$2.l(), 0.11485000000000001);
               clk $$9 = new clk(
                  $$4,
                  $$3.a() + (double)((float)$$2.j() * 0.3F),
                  $$3.b() + (double)((float)$$2.k() * 0.3F),
                  $$3.c() + (double)((float)$$2.l() * 0.3F),
                  $$6,
                  $$7,
                  $$8
               );
               $$4.b($$9);
               $$1.g(1);
               return $$1;
            }
         }
      );
      dem.a(crv.nT, new jx(clx.b.a));
      dem.a(crv.nV, new jx(clx.b.b));
      dem.a(crv.nX, new jx(clx.b.c));
      dem.a(crv.nZ, new jx(clx.b.d));
      dem.a(crv.of, new jx(clx.b.g));
      dem.a(crv.ob, new jx(clx.b.e));
      dem.a(crv.od, new jx(clx.b.f));
      dem.a(crv.oh, new jx(clx.b.h));
      dem.a(crv.oj, new jx(clx.b.i));
      dem.a(crv.nU, new jx(clx.b.a, true));
      dem.a(crv.nW, new jx(clx.b.b, true));
      dem.a(crv.nY, new jx(clx.b.c, true));
      dem.a(crv.oa, new jx(clx.b.d, true));
      dem.a(crv.og, new jx(clx.b.g, true));
      dem.a(crv.oc, new jx(clx.b.e, true));
      dem.a(crv.oe, new jx(clx.b.f, true));
      dem.a(crv.oi, new jx(clx.b.h, true));
      dem.a(crv.ok, new jx(clx.b.i, true));
      jz $$3 = new jy() {
         private final jy c = new jy();

         @Override
         public crs a(jw $$0, crs $$1) {
            cqj $$2 = (cqj)$$1.f();
            id $$3 = $$0.c().a($$0.d().c(dem.b));
            czg $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new crs(crv.qx);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dem.a(crv.qz, $$3);
      dem.a(crv.qy, $$3);
      dem.a(crv.qA, $$3);
      dem.a(crv.qF, $$3);
      dem.a(crv.qG, $$3);
      dem.a(crv.qE, $$3);
      dem.a(crv.qH, $$3);
      dem.a(crv.qI, $$3);
      dem.a(crv.qJ, $$3);
      dem.a(crv.qx, new jy() {
         private final jy c = new jy();

         @Override
         public crs a(jw $$0, crs $$1) {
            czh $$2 = $$0.b();
            id $$3 = $$0.c().a($$0.d().c(dem.b));
            dpi $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dco $$6) {
               crs $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.d()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, dub.y, $$3);
                  crn $$8 = $$7.f();
                  $$1.g(1);
                  if ($$1.d()) {
                     return new crs($$8);
                  } else {
                     if ($$0.e().a(new crs($$8)) < 0) {
                        this.c.dispense($$0, new crs($$8));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dem.a(crv.or, new ka() {
         @Override
         protected crs a(jw $$0, crs $$1) {
            czg $$2 = $$0.b();
            this.a(true);
            ij $$3 = $$0.d().c(dem.b);
            id $$4 = $$0.c().a($$3);
            dpi $$5 = $$2.a_($$4);
            if (dbu.a($$2, $$4, $$3)) {
               $$2.b($$4, dbu.a($$2, $$4));
               $$2.a(null, dub.i, $$4);
            } else if (dcv.h($$5) || dcw.g($$5) || dcx.g($$5)) {
               $$2.b($$4, $$5.a(dpy.r, Boolean.valueOf(true)));
               $$2.a(null, dub.c, $$4);
            } else if ($$5.b() instanceof dkp) {
               dkp.a($$2, $$4);
               $$2.a($$4, false);
            } else {
               this.a(false);
            }

            if (this.a()) {
               $$1.a(1, $$2.E_(), null, () -> $$1.e(0));
            }

            return $$1;
         }
      });
      dem.a(crv.rx, new ka() {
         @Override
         protected crs a(jw $$0, crs $$1) {
            this.a(true);
            czg $$2 = $$0.b();
            id $$3 = $$0.c().a($$0.d().c(dem.b));
            if (!cps.a($$1, $$2, $$3) && !cps.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.B) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dem.a(dcj.ck, new jy() {
         @Override
         protected crs a(jw $$0, crs $$1) {
            czg $$2 = $$0.b();
            id $$3 = $$0.c().a($$0.d().c(dem.b));
            cgl $$4 = new cgl($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.dr(), $$4.dt(), $$4.dx(), auo.zc, aup.e, 1.0F, 1.0F);
            $$2.a(null, dub.t, $$3);
            $$1.g(1);
            return $$1;
         }
      });
      jz $$4 = new ka() {
         @Override
         protected crs a(jw $$0, crs $$1) {
            this.a(cph.a($$0, $$1));
            return $$1;
         }
      };
      dem.a(crv.un, $$4);
      dem.a(crv.um, $$4);
      dem.a(crv.uo, $$4);
      dem.a(crv.uj, $$4);
      dem.a(crv.up, $$4);
      dem.a(crv.ul, $$4);
      dem.a(crv.uk, new ka() {
         @Override
         protected crs a(jw $$0, crs $$1) {
            czg $$2 = $$0.b();
            ij $$3 = $$0.d().c(dem.b);
            id $$4 = $$0.c().a($$3);
            if ($$2.u($$4) && dlz.b($$2, $$4, $$1)) {
               $$2.a($$4, dcj.gG.n().a(dji.e, Integer.valueOf(dqo.a($$3))), 3);
               $$2.a(null, dub.i, $$4);
               dmo $$5 = $$2.c_($$4);
               if ($$5 instanceof doa) {
                  dlz.a($$2, $$4, (doa)$$5);
               }

               $$1.g(1);
               this.a(true);
            } else {
               this.a(cph.a($$0, $$1));
            }

            return $$1;
         }
      });
      dem.a(dcj.ee, new ka() {
         @Override
         protected crs a(jw $$0, crs $$1) {
            czg $$2 = $$0.b();
            id $$3 = $$0.c().a($$0.d().c(dem.b));
            ddb $$4 = (ddb)dcj.ee;
            if ($$2.u($$3) && $$4.a($$2, $$3)) {
               if (!$$2.B) {
                  $$2.a($$3, $$4.n(), 3);
                  $$2.a(null, dub.i, $$3);
               }

               $$1.g(1);
               this.a(true);
            } else {
               this.a(cph.a($$0, $$1));
            }

            return $$1;
         }
      });
      dem.a(dcj.kP.p(), new kc());

      for (cql $$5 : cql.values()) {
         dem.a(djf.a($$5).p(), new kc());
      }

      dem.a(crv.sk.p(), new ka() {
         private final jy c = new jy();

         private crs a(jw $$0, crs $$1, crs $$2) {
            $$1.g(1);
            if ($$1.d()) {
               $$0.b().a(null, dub.y, $$0.c());
               return $$2.r();
            } else {
               if ($$0.e().a($$2.r()) < 0) {
                  this.c.dispense($$0, $$2.r());
               }

               return $$1;
            }
         }

         @Override
         public crs a(jw $$0, crs $$1) {
            this.a(false);
            apu $$2 = $$0.b();
            id $$3 = $$0.c().a($$0.d().c(dem.b));
            dpi $$4 = $$2.a_($$3);
            if ($$4.a(ave.aG, $$0x -> $$0x.b(dcb.c) && $$0x.b() instanceof dcb) && $$4.c(dcb.c) >= 5) {
               ((dcb)$$4.b()).a($$2, $$4, $$3, null, dml.b.b);
               this.a(true);
               return this.a($$0, $$1, new crs(crv.wv));
            } else if ($$2.b_($$3).a(avj.a)) {
               this.a(true);
               return this.a($$0, $$1, ctq.a(crv.sj, ctr.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dem.a(crv.ft, new ka() {
         @Override
         public crs a(jw $$0, crs $$1) {
            ij $$2 = $$0.d().c(dem.b);
            id $$3 = $$0.c().a($$2);
            czg $$4 = $$0.b();
            dpi $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dcj.pl)) {
               if ($$5.c(dio.d) != 4) {
                  dio.a(null, $$4, $$3, $$5);
                  $$1.g(1);
               } else {
                  this.a(false);
               }

               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dem.a(crv.rU.p(), new kb());
      dem.a(crv.xn.p(), new ka() {
         @Override
         protected crs a(jw $$0, crs $$1) {
            apu $$2 = $$0.b();
            id $$3 = $$0.c().a($$0.d().c(dem.b));
            List<cdr> $$4 = $$2.a(cdr.class, new ese($$3), bqf.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cdr $$5 : $$4) {
                  if ($$5.gx()) {
                     $$1.a(16, $$2.E_(), null, () -> {
                        $$1.g(1);
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
      dem.a(crv.ws, new ka() {
         @Override
         public crs a(jw $$0, crs $$1) {
            id $$2 = $$0.c().a($$0.d().c(dem.b));
            czg $$3 = $$0.b();
            dpi $$4 = $$3.a_($$2);
            Optional<dpi> $$5 = cri.b($$4);
            if ($$5.isPresent()) {
               $$3.b($$2, $$5.get());
               $$3.c(3003, $$2, 0);
               $$1.g(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dem.a(crv.sj, new jy() {
         private final jy c = new jy();

         @Override
         public crs a(jw $$0, crs $$1) {
            ctq $$2 = $$1.a(jr.x, ctq.a);
            if (!$$2.a(ctr.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               apu $$3 = $$0.b();
               id $$4 = $$0.c();
               id $$5 = $$0.c().a($$0.d().c(dem.b));
               if (!$$3.a_($$5).a(ave.cc)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.B) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(kn.ak, (double)$$4.u() + $$3.z.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, auo.cB, aup.e, 1.0F, 1.0F);
                  $$3.a(null, dub.z, $$4);
                  $$3.b($$5, dcj.sI.n());
                  return new crs(crv.sk);
               }
            }
         }
      });
   }

   static esj a(jw $$0, bqg<?> $$1, ij $$2) {
      return $$0.a()
         .b(
            (double)$$2.j() * (0.5000099999997474 - (double)$$1.k() / 2.0),
            (double)$$2.k() * (0.5000099999997474 - (double)$$1.l() / 2.0) - (double)$$1.l() / 2.0,
            (double)$$2.l() * (0.5000099999997474 - (double)$$1.k() / 2.0)
         );
   }
}
