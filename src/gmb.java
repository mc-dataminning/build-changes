public class gmb extends ghy<gan, ftg<gan>> {
   public gmb(ggx.a $$0, boolean $$1) {
      super($$0, new ftg<>($$0.a($$1 ? fva.aW : fva.aS), $$1), 0.5F);
      this.a(new gky<>(this, new fsn($$0.a($$1 ? fva.aX : fva.aU)), new fsn($$0.a($$1 ? fva.aY : fva.aV)), $$0.g()));
      this.a(new glh<>(this, $$0.d()));
      this.a(new gke<>($$0, this));
      this.a(new gko(this));
      this.a(new gki(this));
      this.a(new gkn<>(this, $$0.f(), $$0.d()));
      this.a(new gkr<>(this, $$0.f()));
      this.a(new glf<>(this, $$0.f()));
      this.a(new glq<>(this, $$0.f()));
      this.a(new gkf<>(this));
   }

   public void a(gan $$0, float $$1, float $$2, exx $$3, gbo $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public etp a(gan $$0, float $$1) {
      return $$0.bY() ? new etp(0.0, (double)($$0.ec() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(gan $$0) {
      ftg<gan> $$1 = this.a();
      if ($$0.N_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(cli.g);
         $$1.z.k = $$0.a(cli.b);
         $$1.x.k = $$0.a(cli.e);
         $$1.y.k = $$0.a(cli.f);
         $$1.b.k = $$0.a(cli.c);
         $$1.w.k = $$0.a(cli.d);
         $$1.t = $$0.bY();
         fso.a $$2 = a($$0, bpl.a);
         fso.a $$3 = a($$0, bpl.b);
         if ($$2.a()) {
            $$3 = $$0.eW().d() ? fso.a.a : fso.a.b;
         }

         if ($$0.fs() == bru.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fso.a a(gan $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if ($$2.d()) {
         return fso.a.a;
      } else {
         if ($$0.fu() == $$1 && $$0.fw() > 0) {
            cus $$3 = $$2.u();
            if ($$3 == cus.d) {
               return fso.a.c;
            }

            if ($$3 == cus.e) {
               return fso.a.d;
            }

            if ($$3 == cus.f) {
               return fso.a.e;
            }

            if ($$3 == cus.g && $$1 == $$0.fu()) {
               return fso.a.f;
            }

            if ($$3 == cus.h) {
               return fso.a.h;
            }

            if ($$3 == cus.i) {
               return fso.a.i;
            }

            if ($$3 == cus.j) {
               return fso.a.j;
            }
         } else if (!$$0.aK && $$2.a(ctc.vT) && crm.j($$2)) {
            return fso.a.g;
         }

         return fso.a.b;
      }
   }

   public akh a(gan $$0) {
      return $$0.b().a();
   }

   protected void a(gan $$0, exx $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gan $$0, wu $$1, exx $$2, gbo $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         eut $$7 = $$0.gp();
         eul $$8 = $$7.a(euk.c);
         if ($$8 != null) {
            eup $$9 = $$7.d($$0, $$8);
            wu $$10 = eup.a($$9, $$8.a(yn.b));
            super.a($$0, wu.i().b($$10).b(wt.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(exx $$0, gbo $$1, int $$2, gan $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(exx $$0, gbo $$1, int $$2, gan $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(exx $$0, gbo $$1, int $$2, gan $$3, fvb $$4, fvb $$5) {
      ftg<gan> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      akh $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(gbw.c($$7)), $$2, gmp.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(gbw.i($$7)), $$2, gmp.d);
   }

   protected void a(gan $$0, exx $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.g($$4);
      if ($$0.fC()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fD() + $$4;
         float $$9 = axz.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fp()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         etp $$10 = $$0.f($$4);
         etp $$11 = $$0.E($$4);
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
         float $$17 = axz.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.cb()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
