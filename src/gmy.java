public class gmy extends giu<gbj, fub<gbj>> {
   public gmy(ght.a $$0, boolean $$1) {
      super($$0, new fub<>($$0.a($$1 ? fvv.aW : fvv.aS), $$1), 0.5F);
      this.a(new glv<>(this, new fti($$0.a($$1 ? fvv.aX : fvv.aU)), new fti($$0.a($$1 ? fvv.aY : fvv.aV)), $$0.g()));
      this.a(new gme<>(this, $$0.d()));
      this.a(new glb<>($$0, this));
      this.a(new gll(this));
      this.a(new glf(this));
      this.a(new glk<>(this, $$0.f(), $$0.d()));
      this.a(new glo<>(this, $$0.f()));
      this.a(new gmc<>(this, $$0.f()));
      this.a(new gmn<>(this, $$0.f()));
      this.a(new glc<>(this));
   }

   public void a(gbj $$0, float $$1, float $$2, eys $$3, gck $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public euk a(gbj $$0, float $$1) {
      return $$0.ca() ? new euk(0.0, (double)($$0.ee() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(gbj $$0) {
      fub<gbj> $$1 = this.a();
      if ($$0.N_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(clx.g);
         $$1.z.k = $$0.a(clx.b);
         $$1.x.k = $$0.a(clx.e);
         $$1.y.k = $$0.a(clx.f);
         $$1.b.k = $$0.a(clx.c);
         $$1.w.k = $$0.a(clx.d);
         $$1.t = $$0.ca();
         ftj.a $$2 = a($$0, bpt.a);
         ftj.a $$3 = a($$0, bpt.b);
         if ($$2.a()) {
            $$3 = $$0.eY().e() ? ftj.a.a : ftj.a.b;
         }

         if ($$0.fu() == bsi.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static ftj.a a(gbj $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if ($$2.e()) {
         return ftj.a.a;
      } else {
         if ($$0.fw() == $$1 && $$0.fy() > 0) {
            cvj $$3 = $$2.v();
            if ($$3 == cvj.d) {
               return ftj.a.c;
            }

            if ($$3 == cvj.e) {
               return ftj.a.d;
            }

            if ($$3 == cvj.f) {
               return ftj.a.e;
            }

            if ($$3 == cvj.g && $$1 == $$0.fw()) {
               return ftj.a.f;
            }

            if ($$3 == cvj.h) {
               return ftj.a.h;
            }

            if ($$3 == cvj.i) {
               return ftj.a.i;
            }

            if ($$3 == cvj.j) {
               return ftj.a.j;
            }
         } else if (!$$0.aK && $$2.a(ctr.vT) && csb.j($$2)) {
            return ftj.a.g;
         }

         return ftj.a.b;
      }
   }

   public akm a(gbj $$0) {
      return $$0.b().a();
   }

   protected void a(gbj $$0, eys $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gbj $$0, wx $$1, eys $$2, gck $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         evo $$7 = $$0.gr();
         evg $$8 = $$7.a(evf.c);
         if ($$8 != null) {
            evk $$9 = $$7.d($$0, $$8);
            wx $$10 = evk.a($$9, $$8.a(yq.b));
            super.a($$0, wx.i().b($$10).b(ww.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(eys $$0, gck $$1, int $$2, gbj $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(eys $$0, gck $$1, int $$2, gbj $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(eys $$0, gck $$1, int $$2, gbj $$3, fvw $$4, fvw $$5) {
      fub<gbj> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      akm $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(gcs.c($$7)), $$2, gnm.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(gcs.i($$7)), $$2, gnm.d);
   }

   protected void a(gbj $$0, eys $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.g($$4);
      if ($$0.fE()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fF() + $$4;
         float $$9 = ayd.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fr()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         euk $$10 = $$0.f($$4);
         euk $$11 = $$0.E($$4);
         double $$12 = $$11.i();
         double $$13 = $$10.i();
         if ($$12 > 0.0 && $$13 > 0.0) {
            double $$14 = ($$11.c * $$10.c + $$11.e * $$10.e) / Math.sqrt($$12 * $$13);
            double $$15 = $$11.c * $$10.e - $$11.e * $$10.c;
            $$1.a(a.d.rotation((float)(Math.signum($$15) * Math.acos($$14))));
         }
      } else if ($$6 > 0.0F) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$16 = $$0.be() ? -90.0F - $$7 : -90.0F;
         float $$17 = ayd.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.cd()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
