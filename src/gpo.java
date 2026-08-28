public class gpo extends glk<gdy, fwp<gdy>> {
   public gpo(gkj.a $$0, boolean $$1) {
      super($$0, new fwp<>($$0.a($$1 ? fyj.aX : fyj.aT), $$1), 0.5F);
      this.a(new gol<>(this, new fvw($$0.a($$1 ? fyj.aY : fyj.aV)), new fvw($$0.a($$1 ? fyj.aZ : fyj.aW)), $$0.g()));
      this.a(new gou<>(this, $$0.d()));
      this.a(new gnr<>($$0, this));
      this.a(new gob(this));
      this.a(new gnv(this));
      this.a(new goa<>(this, $$0.f(), $$0.d()));
      this.a(new goe<>(this, $$0.f()));
      this.a(new gos<>(this, $$0.f()));
      this.a(new gpd<>(this, $$0.f()));
      this.a(new gns<>(this));
   }

   public void a(gdy $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public exc a(gdy $$0, float $$1) {
      return $$0.cb() ? new exc(0.0, (double)($$0.eb() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(gdy $$0) {
      fwp<gdy> $$1 = this.a();
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
         fvx.a $$2 = a($$0, bqq.a);
         fvx.a $$3 = a($$0, bqq.b);
         if ($$2.a()) {
            $$3 = $$0.eU().e() ? fvx.a.a : fvx.a.b;
         }

         if ($$0.fq() == btg.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fvx.a a(gdy $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.e()) {
         return fvx.a.a;
      } else {
         if ($$0.fs() == $$1 && $$0.fu() > 0) {
            cwo $$3 = $$2.u();
            if ($$3 == cwo.d) {
               return fvx.a.c;
            }

            if ($$3 == cwo.e) {
               return fvx.a.d;
            }

            if ($$3 == cwo.f) {
               return fvx.a.e;
            }

            if ($$3 == cwo.g && $$1 == $$0.fs()) {
               return fvx.a.f;
            }

            if ($$3 == cwo.h) {
               return fvx.a.h;
            }

            if ($$3 == cwo.i) {
               return fvx.a.i;
            }

            if ($$3 == cwo.j) {
               return fvx.a.j;
            }
         } else if (!$$0.aJ && $$2.a(cut.vW) && ctc.i($$2)) {
            return fvx.a.g;
         }

         return fvx.a.b;
      }
   }

   public akr a(gdy $$0) {
      return $$0.b().a();
   }

   protected void a(gdy $$0, fbi $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gdy $$0, wz $$1, fbi $$2, gez $$3, int $$4, float $$5) {
      double $$6 = this.d.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         eyg $$7 = $$0.gn();
         exy $$8 = $$7.a(exx.c);
         if ($$8 != null) {
            eyc $$9 = $$7.d($$0, $$8);
            wz $$10 = eyc.a($$9, $$8.a(ys.b));
            super.a($$0, wz.i().b($$10).b(wy.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(fbi $$0, gez $$1, int $$2, gdy $$3) {
      this.a($$0, $$1, $$2, $$3, this.g.n, this.g.w);
   }

   public void b(fbi $$0, gez $$1, int $$2, gdy $$3) {
      this.a($$0, $$1, $$2, $$3, this.g.o, this.g.b);
   }

   private void a(fbi $$0, gez $$1, int $$2, gdy $$3, fyk $$4, fyk $$5) {
      fwp<gdy> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      akr $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(gfh.c($$7)), $$2, gqc.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(gfh.i($$7)), $$2, gqc.d);
   }

   protected void a(gdy $$0, fbi $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.h($$4);
      if ($$0.fA()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fB() + $$4;
         float $$9 = ayo.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fn()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         exc $$10 = $$0.g($$4);
         exc $$11 = $$0.G($$4);
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
