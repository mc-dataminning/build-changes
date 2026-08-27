public class gcr extends fyp<frh, fkd<frh>> {
   public gcr(fxo.a $$0, boolean $$1) {
      super($$0, new fkd<>($$0.a($$1 ? flx.aT : flx.aP), $$1), 0.5F);
      this.a(new gbp<>(this, new fjk($$0.a($$1 ? flx.aU : flx.aR)), new fjk($$0.a($$1 ? flx.aV : flx.aS)), $$0.g()));
      this.a(new gby<>(this, $$0.d()));
      this.a(new gav<>($$0, this));
      this.a(new gbf(this));
      this.a(new gaz(this));
      this.a(new gbe<>(this, $$0.f(), $$0.d()));
      this.a(new gbi<>(this, $$0.f()));
      this.a(new gbw<>(this, $$0.f()));
      this.a(new gcg<>(this, $$0.f()));
      this.a(new gaw<>(this));
   }

   public void a(frh $$0, float $$1, float $$2, epd $$3, fsi $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public elb a(frh $$0, float $$1) {
      return $$0.bX() ? new elb(0.0, -0.125, 0.0) : super.a($$0, $$1);
   }

   private void b(frh $$0) {
      fkd<frh> $$1 = this.a();
      if ($$0.P_()) {
         $$1.c_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.c_(true);
         $$1.l.k = $$0.a(ces.g);
         $$1.z.k = $$0.a(ces.b);
         $$1.x.k = $$0.a(ces.e);
         $$1.y.k = $$0.a(ces.f);
         $$1.b.k = $$0.a(ces.c);
         $$1.w.k = $$0.a(ces.d);
         $$1.t = $$0.bX();
         fjl.a $$2 = a($$0, bjk.a);
         fjl.a $$3 = a($$0, bjk.b);
         if ($$2.a()) {
            $$3 = $$0.eU().b() ? fjl.a.a : fjl.a.b;
         }

         if ($$0.fm() == blp.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fjl.a a(frh $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      if ($$2.b()) {
         return fjl.a.a;
      } else {
         if ($$0.fo() == $$1 && $$0.fq() > 0) {
            coa $$3 = $$2.s();
            if ($$3 == coa.d) {
               return fjl.a.c;
            }

            if ($$3 == coa.e) {
               return fjl.a.d;
            }

            if ($$3 == coa.f) {
               return fjl.a.e;
            }

            if ($$3 == coa.g && $$1 == $$0.fo()) {
               return fjl.a.f;
            }

            if ($$3 == coa.h) {
               return fjl.a.h;
            }

            if ($$3 == coa.i) {
               return fjl.a.i;
            }

            if ($$3 == coa.j) {
               return fjl.a.j;
            }
         } else if (!$$0.aF && $$2.a(cmk.vM) && ckp.d($$2)) {
            return fjl.a.g;
         }

         return fjl.a.b;
      }
   }

   public agt a(frh $$0) {
      return $$0.b().a();
   }

   protected void a(frh $$0, epd $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(frh $$0, vb $$1, epd $$2, fsi $$3, int $$4) {
      double $$5 = this.c.b($$0);
      $$2.a();
      if ($$5 < 100.0) {
         ema $$6 = $$0.gh();
         elx $$7 = $$6.a(elw.c);
         if ($$7 != null) {
            elz $$8 = $$6.c($$0.cy(), $$7);
            super.a($$0, vb.b(Integer.toString($$8.b())).b(va.u).b($$7.d()), $$2, $$3, $$4);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public void a(epd $$0, fsi $$1, int $$2, frh $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(epd $$0, fsi $$1, int $$2, frh $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(epd $$0, fsi $$1, int $$2, frh $$3, fly $$4, fly $$5) {
      fkd<frh> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      agt $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(fsq.c($$7)), $$2, gdf.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(fsq.i($$7)), $$2, gdf.d);
   }

   protected void a(frh $$0, epd $$1, float $$2, float $$3, float $$4) {
      float $$5 = $$0.a($$4);
      float $$6 = $$0.g($$4);
      if ($$0.fw()) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$7 = (float)$$0.fx() + $$4;
         float $$8 = aty.a($$7 * $$7 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fj()) {
            $$1.a(a.b.rotationDegrees($$8 * (-90.0F - $$6)));
         }

         elb $$9 = $$0.f($$4);
         elb $$10 = $$0.C($$4);
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
         float $$16 = aty.i($$5, 0.0F, $$15);
         $$1.a(a.b.rotationDegrees($$16));
         if ($$0.ca()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
