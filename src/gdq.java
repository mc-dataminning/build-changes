public class gdq extends fzo<fsg, flc<fsg>> {
   public gdq(fyn.a $$0, boolean $$1) {
      super($$0, new flc<>($$0.a($$1 ? fmw.aT : fmw.aP), $$1), 0.5F);
      this.a(new gco<>(this, new fkj($$0.a($$1 ? fmw.aU : fmw.aR)), new fkj($$0.a($$1 ? fmw.aV : fmw.aS)), $$0.g()));
      this.a(new gcx<>(this, $$0.d()));
      this.a(new gbu<>($$0, this));
      this.a(new gce(this));
      this.a(new gby(this));
      this.a(new gcd<>(this, $$0.f(), $$0.d()));
      this.a(new gch<>(this, $$0.f()));
      this.a(new gcv<>(this, $$0.f()));
      this.a(new gdf<>(this, $$0.f()));
      this.a(new gbv<>(this));
   }

   public void a(fsg $$0, float $$1, float $$2, eqb $$3, fth $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public elt a(fsg $$0, float $$1) {
      return $$0.bX() ? new elt(0.0, -0.125, 0.0) : super.a($$0, $$1);
   }

   private void b(fsg $$0) {
      flc<fsg> $$1 = this.a();
      if ($$0.P_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(cfj.g);
         $$1.z.k = $$0.a(cfj.b);
         $$1.x.k = $$0.a(cfj.e);
         $$1.y.k = $$0.a(cfj.f);
         $$1.b.k = $$0.a(cfj.c);
         $$1.w.k = $$0.a(cfj.d);
         $$1.t = $$0.bX();
         fkk.a $$2 = a($$0, bka.a);
         fkk.a $$3 = a($$0, bka.b);
         if ($$2.a()) {
            $$3 = $$0.eU().b() ? fkk.a.a : fkk.a.b;
         }

         if ($$0.fm() == bmf.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fkk.a a(fsg $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      if ($$2.b()) {
         return fkk.a.a;
      } else {
         if ($$0.fo() == $$1 && $$0.fq() > 0) {
            cos $$3 = $$2.s();
            if ($$3 == cos.d) {
               return fkk.a.c;
            }

            if ($$3 == cos.e) {
               return fkk.a.d;
            }

            if ($$3 == cos.f) {
               return fkk.a.e;
            }

            if ($$3 == cos.g && $$1 == $$0.fo()) {
               return fkk.a.f;
            }

            if ($$3 == cos.h) {
               return fkk.a.h;
            }

            if ($$3 == cos.i) {
               return fkk.a.i;
            }

            if ($$3 == cos.j) {
               return fkk.a.j;
            }
         } else if (!$$0.aF && $$2.a(cnb.vM) && clg.d($$2)) {
            return fkk.a.g;
         }

         return fkk.a.b;
      }
   }

   public ahg a(fsg $$0) {
      return $$0.b().a();
   }

   protected void a(fsg $$0, eqb $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fsg $$0, vf $$1, eqb $$2, fth $$3, int $$4) {
      double $$5 = this.c.b($$0);
      $$2.a();
      if ($$5 < 100.0) {
         emx $$6 = $$0.gh();
         emp $$7 = $$6.a(emo.c);
         if ($$7 != null) {
            emt $$8 = $$6.d($$0, $$7);
            vf $$9 = emt.a($$8, $$7.a(wy.b));
            super.a($$0, vf.i().b($$9).b(ve.u).b($$7.d()), $$2, $$3, $$4);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public void a(eqb $$0, fth $$1, int $$2, fsg $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(eqb $$0, fth $$1, int $$2, fsg $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(eqb $$0, fth $$1, int $$2, fsg $$3, fmx $$4, fmx $$5) {
      flc<fsg> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      ahg $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(ftp.c($$7)), $$2, gee.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(ftp.i($$7)), $$2, gee.d);
   }

   protected void a(fsg $$0, eqb $$1, float $$2, float $$3, float $$4) {
      float $$5 = $$0.a($$4);
      float $$6 = $$0.g($$4);
      if ($$0.fw()) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$7 = (float)$$0.fx() + $$4;
         float $$8 = auo.a($$7 * $$7 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fj()) {
            $$1.a(a.b.rotationDegrees($$8 * (-90.0F - $$6)));
         }

         elt $$9 = $$0.f($$4);
         elt $$10 = $$0.C($$4);
         double $$11 = $$10.i();
         double $$12 = $$9.i();
         if ($$11 > 0.0 && $$12 > 0.0) {
            double $$13 = ($$10.c * $$9.c + $$10.e * $$9.e) / Math.sqrt($$11 * $$12);
            double $$14 = $$10.c * $$9.e - $$10.e * $$9.c;
            $$1.a(a.d.rotation((float)(Math.signum($$14) * Math.acos($$13))));
         }
      } else if ($$5 > 0.0F) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$15 = $$0.aZ() ? -90.0F - $$6 : -90.0F;
         float $$16 = auo.i($$5, 0.0F, $$15);
         $$1.a(a.b.rotationDegrees($$16));
         if ($$0.ca()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
