public class glr extends gho<gad, fsw<gad>> {
   public glr(ggn.a $$0, boolean $$1) {
      super($$0, new fsw<>($$0.a($$1 ? fuq.aW : fuq.aS), $$1), 0.5F);
      this.a(new gko<>(this, new fsd($$0.a($$1 ? fuq.aX : fuq.aU)), new fsd($$0.a($$1 ? fuq.aY : fuq.aV)), $$0.g()));
      this.a(new gkx<>(this, $$0.d()));
      this.a(new gju<>($$0, this));
      this.a(new gke(this));
      this.a(new gjy(this));
      this.a(new gkd<>(this, $$0.f(), $$0.d()));
      this.a(new gkh<>(this, $$0.f()));
      this.a(new gkv<>(this, $$0.f()));
      this.a(new glg<>(this, $$0.f()));
      this.a(new gjv<>(this));
   }

   public void a(gad $$0, float $$1, float $$2, exn $$3, gbe $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public etf a(gad $$0, float $$1) {
      return $$0.bY() ? new etf(0.0, (double)($$0.ec() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(gad $$0) {
      fsw<gad> $$1 = this.a();
      if ($$0.N_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(ckm.g);
         $$1.z.k = $$0.a(ckm.b);
         $$1.x.k = $$0.a(ckm.e);
         $$1.y.k = $$0.a(ckm.f);
         $$1.b.k = $$0.a(ckm.c);
         $$1.w.k = $$0.a(ckm.d);
         $$1.t = $$0.bY();
         fse.a $$2 = a($$0, bop.a);
         fse.a $$3 = a($$0, bop.b);
         if ($$2.a()) {
            $$3 = $$0.eW().d() ? fse.a.a : fse.a.b;
         }

         if ($$0.fs() == bqy.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fse.a a(gad $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if ($$2.d()) {
         return fse.a.a;
      } else {
         if ($$0.fu() == $$1 && $$0.fw() > 0) {
            ctw $$3 = $$2.u();
            if ($$3 == ctw.d) {
               return fse.a.c;
            }

            if ($$3 == ctw.e) {
               return fse.a.d;
            }

            if ($$3 == ctw.f) {
               return fse.a.e;
            }

            if ($$3 == ctw.g && $$1 == $$0.fu()) {
               return fse.a.f;
            }

            if ($$3 == ctw.h) {
               return fse.a.h;
            }

            if ($$3 == ctw.i) {
               return fse.a.i;
            }

            if ($$3 == ctw.j) {
               return fse.a.j;
            }
         } else if (!$$0.aK && $$2.a(csg.vT) && cqq.j($$2)) {
            return fse.a.g;
         }

         return fse.a.b;
      }
   }

   public akf a(gad $$0) {
      return $$0.b().a();
   }

   protected void a(gad $$0, exn $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gad $$0, ws $$1, exn $$2, gbe $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         euj $$7 = $$0.gp();
         eub $$8 = $$7.a(eua.c);
         if ($$8 != null) {
            euf $$9 = $$7.d($$0, $$8);
            ws $$10 = euf.a($$9, $$8.a(yl.b));
            super.a($$0, ws.i().b($$10).b(wr.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(exn $$0, gbe $$1, int $$2, gad $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(exn $$0, gbe $$1, int $$2, gad $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(exn $$0, gbe $$1, int $$2, gad $$3, fur $$4, fur $$5) {
      fsw<gad> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      akf $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(gbm.c($$7)), $$2, gmf.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(gbm.i($$7)), $$2, gmf.d);
   }

   protected void a(gad $$0, exn $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.g($$4);
      if ($$0.fC()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fD() + $$4;
         float $$9 = axw.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fp()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         etf $$10 = $$0.f($$4);
         etf $$11 = $$0.E($$4);
         double $$12 = $$11.i();
         double $$13 = $$10.i();
         if ($$12 > 0.0 && $$13 > 0.0) {
            double $$14 = ($$11.c * $$10.c + $$11.e * $$10.e) / Math.sqrt($$12 * $$13);
            double $$15 = $$11.c * $$10.e - $$11.e * $$10.c;
            $$1.a(a.d.rotation((float)(Math.signum($$15) * Math.acos($$14))));
         }
      } else if ($$6 > 0.0F) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$16 = $$0.bc() ? -90.0F - $$7 : -90.0F;
         float $$17 = axw.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.cb()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
