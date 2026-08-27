public class gax extends fwy<fpt, fiu<fpt>> {
   public gax(fvx.a $$0, boolean $$1) {
      super($$0, new fiu<>($$0.a($$1 ? fkn.aQ : fkn.aM), $$1), 0.5F);
      this.a(new fzv<>(this, new fib($$0.a($$1 ? fkn.aR : fkn.aO)), new fib($$0.a($$1 ? fkn.aS : fkn.aP)), $$0.g()));
      this.a(new gae<>(this, $$0.d()));
      this.a(new fzd<>($$0, this));
      this.a(new fzl(this));
      this.a(new fzf(this));
      this.a(new fzk<>(this, $$0.f(), $$0.d()));
      this.a(new fzo<>(this, $$0.f()));
      this.a(new gac<>(this, $$0.f()));
      this.a(new gam<>(this, $$0.f()));
      this.a(new fze<>(this));
   }

   public void a(fpt $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public eju a(fpt $$0, float $$1) {
      return $$0.bX() ? new eju(0.0, -0.125, 0.0) : super.a($$0, $$1);
   }

   private void b(fpt $$0) {
      fiu<fpt> $$1 = this.a();
      if ($$0.O_()) {
         $$1.c_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.c_(true);
         $$1.l.k = $$0.a(cdv.g);
         $$1.z.k = $$0.a(cdv.b);
         $$1.x.k = $$0.a(cdv.e);
         $$1.y.k = $$0.a(cdv.f);
         $$1.b.k = $$0.a(cdv.c);
         $$1.w.k = $$0.a(cdv.d);
         $$1.t = $$0.bX();
         fic.a $$2 = a($$0, biw.a);
         fic.a $$3 = a($$0, biw.b);
         if ($$2.a()) {
            $$3 = $$0.eV().b() ? fic.a.a : fic.a.b;
         }

         if ($$0.fn() == bla.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fic.a a(fpt $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      if ($$2.b()) {
         return fic.a.a;
      } else {
         if ($$0.fp() == $$1 && $$0.fr() > 0) {
            cnc $$3 = $$2.s();
            if ($$3 == cnc.d) {
               return fic.a.c;
            }

            if ($$3 == cnc.e) {
               return fic.a.d;
            }

            if ($$3 == cnc.f) {
               return fic.a.e;
            }

            if ($$3 == cnc.g && $$1 == $$0.fp()) {
               return fic.a.f;
            }

            if ($$3 == cnc.h) {
               return fic.a.h;
            }

            if ($$3 == cnc.i) {
               return fic.a.i;
            }

            if ($$3 == cnc.j) {
               return fic.a.j;
            }
         } else if (!$$0.aF && $$2.a(clm.vL) && cjr.d($$2)) {
            return fic.a.g;
         }

         return fic.a.b;
      }
   }

   public agi a(fpt $$0) {
      return $$0.b().a();
   }

   protected void a(fpt $$0, enw $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fpt $$0, ur $$1, enw $$2, fqu $$3, int $$4) {
      double $$5 = this.c.b($$0);
      $$2.a();
      if ($$5 < 100.0) {
         ekt $$6 = $$0.gi();
         ekq $$7 = $$6.a(ekp.c);
         if ($$7 != null) {
            eks $$8 = $$6.c($$0.cy(), $$7);
            super.a($$0, ur.b(Integer.toString($$8.b())).b(uq.u).b($$7.d()), $$2, $$3, $$4);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public void a(enw $$0, fqu $$1, int $$2, fpt $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(enw $$0, fqu $$1, int $$2, fpt $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(enw $$0, fqu $$1, int $$2, fpt $$3, fko $$4, fko $$5) {
      fiu<fpt> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      agi $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(frc.c($$7)), $$2, gbl.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(frc.i($$7)), $$2, gbl.d);
   }

   protected void a(fpt $$0, enw $$1, float $$2, float $$3, float $$4) {
      float $$5 = $$0.a($$4);
      float $$6 = $$0.g($$4);
      if ($$0.fx()) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$7 = (float)$$0.fy() + $$4;
         float $$8 = atm.a($$7 * $$7 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fk()) {
            $$1.a(a.b.rotationDegrees($$8 * (-90.0F - $$6)));
         }

         eju $$9 = $$0.f($$4);
         eju $$10 = $$0.C($$4);
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
         float $$16 = atm.i($$5, 0.0F, $$15);
         $$1.a(a.b.rotationDegrees($$16));
         if ($$0.ca()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
