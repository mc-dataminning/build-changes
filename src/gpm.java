public class gpm extends gli<gdw, fwn<gdw>> {
   public gpm(gkh.a $$0, boolean $$1) {
      super($$0, new fwn<>($$0.a($$1 ? fyh.aX : fyh.aT), $$1), 0.5F);
      this.a(new goj<>(this, new fvu($$0.a($$1 ? fyh.aY : fyh.aV)), new fvu($$0.a($$1 ? fyh.aZ : fyh.aW)), $$0.g()));
      this.a(new gos<>(this, $$0.d()));
      this.a(new gnp<>($$0, this));
      this.a(new gnz(this));
      this.a(new gnt(this));
      this.a(new gny<>(this, $$0.f(), $$0.d()));
      this.a(new goc<>(this, $$0.f()));
      this.a(new goq<>(this, $$0.f()));
      this.a(new gpb<>(this, $$0.f()));
      this.a(new gnq<>(this));
   }

   public void a(gdw $$0, float $$1, float $$2, fbg $$3, gex $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public exa a(gdw $$0, float $$1) {
      return $$0.cb() ? new exa(0.0, (double)($$0.ec() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(gdw $$0) {
      fwn<gdw> $$1 = this.a();
      if ($$0.R_()) {
         $$1.c_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.c_(true);
         $$1.l.k = $$0.a(cmy.g);
         $$1.z.k = $$0.a(cmy.b);
         $$1.x.k = $$0.a(cmy.e);
         $$1.y.k = $$0.a(cmy.f);
         $$1.b.k = $$0.a(cmy.c);
         $$1.w.k = $$0.a(cmy.d);
         $$1.t = $$0.cb();
         fvv.a $$2 = a($$0, bqq.a);
         fvv.a $$3 = a($$0, bqq.b);
         if ($$2.a()) {
            $$3 = $$0.eV().e() ? fvv.a.a : fvv.a.b;
         }

         if ($$0.fr() == btg.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fvv.a a(gdw $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.e()) {
         return fvv.a.a;
      } else {
         if ($$0.ft() == $$1 && $$0.fv() > 0) {
            cwo $$3 = $$2.u();
            if ($$3 == cwo.d) {
               return fvv.a.c;
            }

            if ($$3 == cwo.e) {
               return fvv.a.d;
            }

            if ($$3 == cwo.f) {
               return fvv.a.e;
            }

            if ($$3 == cwo.g && $$1 == $$0.ft()) {
               return fvv.a.f;
            }

            if ($$3 == cwo.h) {
               return fvv.a.h;
            }

            if ($$3 == cwo.i) {
               return fvv.a.i;
            }

            if ($$3 == cwo.j) {
               return fvv.a.j;
            }
         } else if (!$$0.aJ && $$2.a(cut.vW) && ctc.i($$2)) {
            return fvv.a.g;
         }

         return fvv.a.b;
      }
   }

   public akr a(gdw $$0) {
      return $$0.b().a();
   }

   protected void a(gdw $$0, fbg $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gdw $$0, wz $$1, fbg $$2, gex $$3, int $$4, float $$5) {
      double $$6 = this.d.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         eye $$7 = $$0.go();
         exw $$8 = $$7.a(exv.c);
         if ($$8 != null) {
            eya $$9 = $$7.d($$0, $$8);
            wz $$10 = eya.a($$9, $$8.a(ys.b));
            super.a($$0, wz.i().b($$10).b(wy.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(fbg $$0, gex $$1, int $$2, gdw $$3) {
      this.a($$0, $$1, $$2, $$3, this.g.n, this.g.w);
   }

   public void b(fbg $$0, gex $$1, int $$2, gdw $$3) {
      this.a($$0, $$1, $$2, $$3, this.g.o, this.g.b);
   }

   private void a(fbg $$0, gex $$1, int $$2, gdw $$3, fyi $$4, fyi $$5) {
      fwn<gdw> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      akr $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(gff.c($$7)), $$2, gqa.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(gff.i($$7)), $$2, gqa.d);
   }

   protected void a(gdw $$0, fbg $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.h($$4);
      if ($$0.fB()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fC() + $$4;
         float $$9 = ayo.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fo()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         exa $$10 = $$0.g($$4);
         exa $$11 = $$0.G($$4);
         double $$12 = $$11.i();
         double $$13 = $$10.i();
         if ($$12 > 0.0 && $$13 > 0.0) {
            double $$14 = ($$11.c * $$10.c + $$11.e * $$10.e) / Math.sqrt($$12 * $$13);
            double $$15 = $$11.c * $$10.e - $$11.e * $$10.c;
            $$1.a(a.d.rotation((float)(Math.signum($$15) * Math.acos($$14))));
         }
      } else if ($$6 > 0.0F) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$16 = $$0.bf() ? -90.0F - $$7 : -90.0F;
         float $$17 = ayo.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.ce()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
