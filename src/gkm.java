public class gkm extends ggj<fyy, frr<fyy>> {
   public gkm(gfi.a $$0, boolean $$1) {
      super($$0, new frr<>($$0.a($$1 ? ftl.aW : ftl.aS), $$1), 0.5F);
      this.a(new gjj<>(this, new fqy($$0.a($$1 ? ftl.aX : ftl.aU)), new fqy($$0.a($$1 ? ftl.aY : ftl.aV)), $$0.g()));
      this.a(new gjs<>(this, $$0.d()));
      this.a(new gip<>($$0, this));
      this.a(new giz(this));
      this.a(new git(this));
      this.a(new giy<>(this, $$0.f(), $$0.d()));
      this.a(new gjc<>(this, $$0.f()));
      this.a(new gjq<>(this, $$0.f()));
      this.a(new gkb<>(this, $$0.f()));
      this.a(new giq<>(this));
   }

   public void a(fyy $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public esa a(fyy $$0, float $$1) {
      return $$0.bX() ? new esa(0.0, (double)($$0.eb() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(fyy $$0) {
      frr<fyy> $$1 = this.a();
      if ($$0.N_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(cju.g);
         $$1.z.k = $$0.a(cju.b);
         $$1.x.k = $$0.a(cju.e);
         $$1.y.k = $$0.a(cju.f);
         $$1.b.k = $$0.a(cju.c);
         $$1.w.k = $$0.a(cju.d);
         $$1.t = $$0.bX();
         fqz.a $$2 = a($$0, bnz.a);
         fqz.a $$3 = a($$0, bnz.b);
         if ($$2.a()) {
            $$3 = $$0.eV().d() ? fqz.a.a : fqz.a.b;
         }

         if ($$0.fr() == bqi.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fqz.a a(fyy $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if ($$2.d()) {
         return fqz.a.a;
      } else {
         if ($$0.ft() == $$1 && $$0.fv() > 0) {
            ctb $$3 = $$2.u();
            if ($$3 == ctb.d) {
               return fqz.a.c;
            }

            if ($$3 == ctb.e) {
               return fqz.a.d;
            }

            if ($$3 == ctb.f) {
               return fqz.a.e;
            }

            if ($$3 == ctb.g && $$1 == $$0.ft()) {
               return fqz.a.f;
            }

            if ($$3 == ctb.h) {
               return fqz.a.h;
            }

            if ($$3 == ctb.i) {
               return fqz.a.i;
            }

            if ($$3 == ctb.j) {
               return fqz.a.j;
            }
         } else if (!$$0.aI && $$2.a(crm.vR) && cpw.j($$2)) {
            return fqz.a.g;
         }

         return fqz.a.b;
      }
   }

   public ajt a(fyy $$0) {
      return $$0.b().a();
   }

   protected void a(fyy $$0, ewi $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fyy $$0, wg $$1, ewi $$2, fzz $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         ete $$7 = $$0.go();
         esw $$8 = $$7.a(esv.c);
         if ($$8 != null) {
            eta $$9 = $$7.d($$0, $$8);
            wg $$10 = eta.a($$9, $$8.a(xz.b));
            super.a($$0, wg.i().b($$10).b(wf.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(ewi $$0, fzz $$1, int $$2, fyy $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(ewi $$0, fzz $$1, int $$2, fyy $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(ewi $$0, fzz $$1, int $$2, fyy $$3, ftm $$4, ftm $$5) {
      frr<fyy> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      ajt $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(gah.c($$7)), $$2, gla.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(gah.i($$7)), $$2, gla.d);
   }

   protected void a(fyy $$0, ewi $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.g($$4);
      if ($$0.fB()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fC() + $$4;
         float $$9 = axk.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fo()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         esa $$10 = $$0.f($$4);
         esa $$11 = $$0.E($$4);
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
         float $$17 = axk.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.ca()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
