public class gif extends gec<fwr, fpk<fwr>> {
   public gif(gdb.a $$0, boolean $$1) {
      super($$0, new fpk<>($$0.a($$1 ? fre.aW : fre.aS), $$1), 0.5F);
      this.a(new ghc<>(this, new foq($$0.a($$1 ? fre.aX : fre.aU)), new foq($$0.a($$1 ? fre.aY : fre.aV)), $$0.g()));
      this.a(new ghl<>(this, $$0.d()));
      this.a(new ggi<>($$0, this));
      this.a(new ggs(this));
      this.a(new ggm(this));
      this.a(new ggr<>(this, $$0.f(), $$0.d()));
      this.a(new ggv<>(this, $$0.f()));
      this.a(new ghj<>(this, $$0.f()));
      this.a(new ghu<>(this, $$0.f()));
      this.a(new ggj<>(this));
   }

   public void a(fwr $$0, float $$1, float $$2, eub $$3, fxs $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ept a(fwr $$0, float $$1) {
      return $$0.bX() ? new ept(0.0, (double)($$0.eb() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(fwr $$0) {
      fpk<fwr> $$1 = this.a();
      if ($$0.N_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(civ.g);
         $$1.z.k = $$0.a(civ.b);
         $$1.x.k = $$0.a(civ.e);
         $$1.y.k = $$0.a(civ.f);
         $$1.b.k = $$0.a(civ.c);
         $$1.w.k = $$0.a(civ.d);
         $$1.t = $$0.bX();
         fos.a $$2 = a($$0, bnc.a);
         fos.a $$3 = a($$0, bnc.b);
         if ($$2.a()) {
            $$3 = $$0.eV().b() ? fos.a.a : fos.a.b;
         }

         if ($$0.fr() == bpj.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fos.a a(fwr $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if ($$2.b()) {
         return fos.a.a;
      } else {
         if ($$0.ft() == $$1 && $$0.fv() > 0) {
            csf $$3 = $$2.t();
            if ($$3 == csf.d) {
               return fos.a.c;
            }

            if ($$3 == csf.e) {
               return fos.a.d;
            }

            if ($$3 == csf.f) {
               return fos.a.e;
            }

            if ($$3 == csf.g && $$1 == $$0.ft()) {
               return fos.a.f;
            }

            if ($$3 == csf.h) {
               return fos.a.h;
            }

            if ($$3 == csf.i) {
               return fos.a.i;
            }

            if ($$3 == csf.j) {
               return fos.a.j;
            }
         } else if (!$$0.aI && $$2.a(cqp.vR) && cox.d($$2)) {
            return fos.a.g;
         }

         return fos.a.b;
      }
   }

   public ajh a(fwr $$0) {
      return $$0.b().a();
   }

   protected void a(fwr $$0, eub $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fwr $$0, vu $$1, eub $$2, fxs $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         eqx $$7 = $$0.go();
         eqp $$8 = $$7.a(eqo.c);
         if ($$8 != null) {
            eqt $$9 = $$7.d($$0, $$8);
            vu $$10 = eqt.a($$9, $$8.a(xn.b));
            super.a($$0, vu.i().b($$10).b(vt.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(eub $$0, fxs $$1, int $$2, fwr $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(eub $$0, fxs $$1, int $$2, fwr $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(eub $$0, fxs $$1, int $$2, fwr $$3, frf $$4, frf $$5) {
      fpk<fwr> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      ajh $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(fya.c($$7)), $$2, git.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(fya.i($$7)), $$2, git.d);
   }

   protected void a(fwr $$0, eub $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.g($$4);
      if ($$0.fB()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fC() + $$4;
         float $$9 = aww.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fo()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         ept $$10 = $$0.f($$4);
         ept $$11 = $$0.E($$4);
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
         float $$17 = aww.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.ca()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
