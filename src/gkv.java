public class gkv extends ggs<fzh, fsa<fzh>> {
   public gkv(gfr.a $$0, boolean $$1) {
      super($$0, new fsa<>($$0.a($$1 ? ftu.aW : ftu.aS), $$1), 0.5F);
      this.a(new gjs<>(this, new frh($$0.a($$1 ? ftu.aX : ftu.aU)), new frh($$0.a($$1 ? ftu.aY : ftu.aV)), $$0.g()));
      this.a(new gkb<>(this, $$0.d()));
      this.a(new giy<>($$0, this));
      this.a(new gji(this));
      this.a(new gjc(this));
      this.a(new gjh<>(this, $$0.f(), $$0.d()));
      this.a(new gjl<>(this, $$0.f()));
      this.a(new gjz<>(this, $$0.f()));
      this.a(new gkk<>(this, $$0.f()));
      this.a(new giz<>(this));
   }

   public void a(fzh $$0, float $$1, float $$2, ewr $$3, gai $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public esj a(fzh $$0, float $$1) {
      return $$0.bX() ? new esj(0.0, (double)($$0.eb() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(fzh $$0) {
      fsa<fzh> $$1 = this.a();
      if ($$0.N_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(ckb.g);
         $$1.z.k = $$0.a(ckb.b);
         $$1.x.k = $$0.a(ckb.e);
         $$1.y.k = $$0.a(ckb.f);
         $$1.b.k = $$0.a(ckb.c);
         $$1.w.k = $$0.a(ckb.d);
         $$1.t = $$0.bX();
         fri.a $$2 = a($$0, boe.a);
         fri.a $$3 = a($$0, boe.b);
         if ($$2.a()) {
            $$3 = $$0.eV().d() ? fri.a.a : fri.a.b;
         }

         if ($$0.fr() == bqn.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fri.a a(fzh $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      if ($$2.d()) {
         return fri.a.a;
      } else {
         if ($$0.ft() == $$1 && $$0.fv() > 0) {
            ctk $$3 = $$2.u();
            if ($$3 == ctk.d) {
               return fri.a.c;
            }

            if ($$3 == ctk.e) {
               return fri.a.d;
            }

            if ($$3 == ctk.f) {
               return fri.a.e;
            }

            if ($$3 == ctk.g && $$1 == $$0.ft()) {
               return fri.a.f;
            }

            if ($$3 == ctk.h) {
               return fri.a.h;
            }

            if ($$3 == ctk.i) {
               return fri.a.i;
            }

            if ($$3 == ctk.j) {
               return fri.a.j;
            }
         } else if (!$$0.aI && $$2.a(crv.vR) && cqf.j($$2)) {
            return fri.a.g;
         }

         return fri.a.b;
      }
   }

   public ajv a(fzh $$0) {
      return $$0.b().a();
   }

   protected void a(fzh $$0, ewr $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fzh $$0, wi $$1, ewr $$2, gai $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         etn $$7 = $$0.go();
         etf $$8 = $$7.a(ete.c);
         if ($$8 != null) {
            etj $$9 = $$7.d($$0, $$8);
            wi $$10 = etj.a($$9, $$8.a(yb.b));
            super.a($$0, wi.i().b($$10).b(wh.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(ewr $$0, gai $$1, int $$2, fzh $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(ewr $$0, gai $$1, int $$2, fzh $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(ewr $$0, gai $$1, int $$2, fzh $$3, ftv $$4, ftv $$5) {
      fsa<fzh> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      ajv $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(gaq.c($$7)), $$2, glj.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(gaq.i($$7)), $$2, glj.d);
   }

   protected void a(fzh $$0, ewr $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.g($$4);
      if ($$0.fB()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fC() + $$4;
         float $$9 = axm.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fo()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         esj $$10 = $$0.f($$4);
         esj $$11 = $$0.E($$4);
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
         float $$17 = axm.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.ca()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
