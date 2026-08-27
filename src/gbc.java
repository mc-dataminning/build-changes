public class gbc extends fxd<fpy, fiz<fpy>> {
   public gbc(fwc.a $$0, boolean $$1) {
      super($$0, new fiz<>($$0.a($$1 ? fks.aQ : fks.aM), $$1), 0.5F);
      this.a(new gaa<>(this, new fig($$0.a($$1 ? fks.aR : fks.aO)), new fig($$0.a($$1 ? fks.aS : fks.aP)), $$0.g()));
      this.a(new gaj<>(this, $$0.d()));
      this.a(new fzi<>($$0, this));
      this.a(new fzq(this));
      this.a(new fzk(this));
      this.a(new fzp<>(this, $$0.f(), $$0.d()));
      this.a(new fzt<>(this, $$0.f()));
      this.a(new gah<>(this, $$0.f()));
      this.a(new gar<>(this, $$0.f()));
      this.a(new fzj<>(this));
   }

   public void a(fpy $$0, float $$1, float $$2, eob $$3, fqz $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ejz a(fpy $$0, float $$1) {
      return $$0.bX() ? new ejz(0.0, -0.125, 0.0) : super.a($$0, $$1);
   }

   private void b(fpy $$0) {
      fiz<fpy> $$1 = this.a();
      if ($$0.P_()) {
         $$1.c_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.c_(true);
         $$1.l.k = $$0.a(cea.g);
         $$1.z.k = $$0.a(cea.b);
         $$1.x.k = $$0.a(cea.e);
         $$1.y.k = $$0.a(cea.f);
         $$1.b.k = $$0.a(cea.c);
         $$1.w.k = $$0.a(cea.d);
         $$1.t = $$0.bX();
         fih.a $$2 = a($$0, bja.a);
         fih.a $$3 = a($$0, bja.b);
         if ($$2.a()) {
            $$3 = $$0.eV().b() ? fih.a.a : fih.a.b;
         }

         if ($$0.fn() == blf.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fih.a a(fpy $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      if ($$2.b()) {
         return fih.a.a;
      } else {
         if ($$0.fp() == $$1 && $$0.fr() > 0) {
            cnh $$3 = $$2.s();
            if ($$3 == cnh.d) {
               return fih.a.c;
            }

            if ($$3 == cnh.e) {
               return fih.a.d;
            }

            if ($$3 == cnh.f) {
               return fih.a.e;
            }

            if ($$3 == cnh.g && $$1 == $$0.fp()) {
               return fih.a.f;
            }

            if ($$3 == cnh.h) {
               return fih.a.h;
            }

            if ($$3 == cnh.i) {
               return fih.a.i;
            }

            if ($$3 == cnh.j) {
               return fih.a.j;
            }
         } else if (!$$0.aF && $$2.a(clr.vL) && cjw.d($$2)) {
            return fih.a.g;
         }

         return fih.a.b;
      }
   }

   public agm a(fpy $$0) {
      return $$0.b().a();
   }

   protected void a(fpy $$0, eob $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fpy $$0, uv $$1, eob $$2, fqz $$3, int $$4) {
      double $$5 = this.c.b($$0);
      $$2.a();
      if ($$5 < 100.0) {
         eky $$6 = $$0.gi();
         ekv $$7 = $$6.a(eku.c);
         if ($$7 != null) {
            ekx $$8 = $$6.c($$0.cy(), $$7);
            super.a($$0, uv.b(Integer.toString($$8.b())).b(uu.u).b($$7.d()), $$2, $$3, $$4);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public void a(eob $$0, fqz $$1, int $$2, fpy $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(eob $$0, fqz $$1, int $$2, fpy $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(eob $$0, fqz $$1, int $$2, fpy $$3, fkt $$4, fkt $$5) {
      fiz<fpy> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      agm $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(frh.c($$7)), $$2, gbq.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(frh.i($$7)), $$2, gbq.d);
   }

   protected void a(fpy $$0, eob $$1, float $$2, float $$3, float $$4) {
      float $$5 = $$0.a($$4);
      float $$6 = $$0.g($$4);
      if ($$0.fx()) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$7 = (float)$$0.fy() + $$4;
         float $$8 = atq.a($$7 * $$7 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fk()) {
            $$1.a(a.b.rotationDegrees($$8 * (-90.0F - $$6)));
         }

         ejz $$9 = $$0.f($$4);
         ejz $$10 = $$0.C($$4);
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
         float $$16 = atq.i($$5, 0.0F, $$15);
         $$1.a(a.b.rotationDegrees($$16));
         if ($$0.ca()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
