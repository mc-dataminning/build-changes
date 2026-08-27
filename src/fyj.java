public class fyj extends fuk<fnf, fgk<fnf>> {
   public fyj(ftj.a $$0, boolean $$1) {
      super($$0, new fgk<>($$0.a($$1 ? fid.aQ : fid.aM), $$1), 0.5F);
      this.a(new fxh<>(this, new ffr($$0.a($$1 ? fid.aR : fid.aO)), new ffr($$0.a($$1 ? fid.aS : fid.aP)), $$0.g()));
      this.a(new fxq<>(this, $$0.d()));
      this.a(new fwp<>($$0, this));
      this.a(new fwx(this));
      this.a(new fwr(this));
      this.a(new fww<>(this, $$0.f(), $$0.d()));
      this.a(new fxa<>(this, $$0.f()));
      this.a(new fxo<>(this, $$0.f()));
      this.a(new fxy<>(this, $$0.f()));
      this.a(new fwq<>(this));
   }

   public void a(fnf $$0, float $$1, float $$2, elr $$3, fog $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ehp a(fnf $$0, float $$1) {
      return $$0.bW() ? new ehp(0.0, -0.125, 0.0) : super.a($$0, $$1);
   }

   private void b(fnf $$0) {
      fgk<fnf> $$1 = this.a();
      if ($$0.M_()) {
         $$1.c_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.c_(true);
         $$1.l.k = $$0.a(cbx.g);
         $$1.z.k = $$0.a(cbx.b);
         $$1.x.k = $$0.a(cbx.e);
         $$1.y.k = $$0.a(cbx.f);
         $$1.b.k = $$0.a(cbx.c);
         $$1.w.k = $$0.a(cbx.d);
         $$1.t = $$0.bW();
         ffs.a $$2 = a($$0, bgz.a);
         ffs.a $$3 = a($$0, bgz.b);
         if ($$2.a()) {
            $$3 = $$0.eT().b() ? ffs.a.a : ffs.a.b;
         }

         if ($$0.fl() == bjc.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static ffs.a a(fnf $$0, bgz $$1) {
      cjh $$2 = $$0.b($$1);
      if ($$2.b()) {
         return ffs.a.a;
      } else {
         if ($$0.fn() == $$1 && $$0.fp() > 0) {
            cla $$3 = $$2.s();
            if ($$3 == cla.d) {
               return ffs.a.c;
            }

            if ($$3 == cla.e) {
               return ffs.a.d;
            }

            if ($$3 == cla.f) {
               return ffs.a.e;
            }

            if ($$3 == cla.g && $$1 == $$0.fn()) {
               return ffs.a.f;
            }

            if ($$3 == cla.h) {
               return ffs.a.h;
            }

            if ($$3 == cla.i) {
               return ffs.a.i;
            }

            if ($$3 == cla.j) {
               return ffs.a.j;
            }
         } else if (!$$0.aF && $$2.a(cjk.uZ) && chp.d($$2)) {
            return ffs.a.g;
         }

         return ffs.a.b;
      }
   }

   public aey a(fnf $$0) {
      return $$0.b().a();
   }

   protected void a(fnf $$0, elr $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fnf $$0, tn $$1, elr $$2, fog $$3, int $$4) {
      double $$5 = this.c.b($$0);
      $$2.a();
      if ($$5 < 100.0) {
         eio $$6 = $$0.gg();
         eil $$7 = $$6.a(eik.c);
         if ($$7 != null) {
            ein $$8 = $$6.c($$0.cx(), $$7);
            super.a($$0, tn.b(Integer.toString($$8.b())).b(tm.u).b($$7.d()), $$2, $$3, $$4);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public void a(elr $$0, fog $$1, int $$2, fnf $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(elr $$0, fog $$1, int $$2, fnf $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(elr $$0, fog $$1, int $$2, fnf $$3, fie $$4, fie $$5) {
      fgk<fnf> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      aey $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(foo.c($$7)), $$2, fyx.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(foo.i($$7)), $$2, fyx.d);
   }

   protected void a(fnf $$0, elr $$1, float $$2, float $$3, float $$4) {
      float $$5 = $$0.a($$4);
      float $$6 = $$0.g($$4);
      if ($$0.fv()) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$7 = (float)$$0.fw() + $$4;
         float $$8 = ary.a($$7 * $$7 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fi()) {
            $$1.a(a.b.rotationDegrees($$8 * (-90.0F - $$6)));
         }

         ehp $$9 = $$0.f($$4);
         ehp $$10 = $$0.C($$4);
         double $$11 = $$10.i();
         double $$12 = $$9.i();
         if ($$11 > 0.0 && $$12 > 0.0) {
            double $$13 = ($$10.c * $$9.c + $$10.e * $$9.e) / Math.sqrt($$11 * $$12);
            double $$14 = $$10.c * $$9.e - $$10.e * $$9.c;
            $$1.a(a.d.rotation((float)(Math.signum($$14) * Math.acos($$13))));
         }
      } else if ($$5 > 0.0F) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$15 = $$0.aX() ? -90.0F - $$6 : -90.0F;
         float $$16 = ary.i($$5, 0.0F, $$15);
         $$1.a(a.b.rotationDegrees($$16));
         if ($$0.bZ()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
