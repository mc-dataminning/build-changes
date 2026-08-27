public class fyc extends fud<fmy, fgd<fmy>> {
   public fyc(ftc.a $$0, boolean $$1) {
      super($$0, new fgd<>($$0.a($$1 ? fhw.aQ : fhw.aM), $$1), 0.5F);
      this.a(new fxa<>(this, new ffk($$0.a($$1 ? fhw.aR : fhw.aO)), new ffk($$0.a($$1 ? fhw.aS : fhw.aP)), $$0.g()));
      this.a(new fxj<>(this, $$0.d()));
      this.a(new fwi<>($$0, this));
      this.a(new fwq(this));
      this.a(new fwk(this));
      this.a(new fwp<>(this, $$0.f(), $$0.d()));
      this.a(new fwt<>(this, $$0.f()));
      this.a(new fxh<>(this, $$0.f()));
      this.a(new fxr<>(this, $$0.f()));
      this.a(new fwj<>(this));
   }

   public void a(fmy $$0, float $$1, float $$2, elk $$3, fnz $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ehi a(fmy $$0, float $$1) {
      return $$0.bW() ? new ehi(0.0, -0.125, 0.0) : super.a($$0, $$1);
   }

   private void b(fmy $$0) {
      fgd<fmy> $$1 = this.a();
      if ($$0.G_()) {
         $$1.c_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.c_(true);
         $$1.l.k = $$0.a(cbq.g);
         $$1.z.k = $$0.a(cbq.b);
         $$1.x.k = $$0.a(cbq.e);
         $$1.y.k = $$0.a(cbq.f);
         $$1.b.k = $$0.a(cbq.c);
         $$1.w.k = $$0.a(cbq.d);
         $$1.t = $$0.bW();
         ffl.a $$2 = a($$0, bgs.a);
         ffl.a $$3 = a($$0, bgs.b);
         if ($$2.a()) {
            $$3 = $$0.eS().b() ? ffl.a.a : ffl.a.b;
         }

         if ($$0.fk() == biv.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static ffl.a a(fmy $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      if ($$2.b()) {
         return ffl.a.a;
      } else {
         if ($$0.fm() == $$1 && $$0.fo() > 0) {
            ckt $$3 = $$2.s();
            if ($$3 == ckt.d) {
               return ffl.a.c;
            }

            if ($$3 == ckt.e) {
               return ffl.a.d;
            }

            if ($$3 == ckt.f) {
               return ffl.a.e;
            }

            if ($$3 == ckt.g && $$1 == $$0.fm()) {
               return ffl.a.f;
            }

            if ($$3 == ckt.h) {
               return ffl.a.h;
            }

            if ($$3 == ckt.i) {
               return ffl.a.i;
            }

            if ($$3 == ckt.j) {
               return ffl.a.j;
            }
         } else if (!$$0.aF && $$2.a(cjd.uZ) && chi.d($$2)) {
            return ffl.a.g;
         }

         return ffl.a.b;
      }
   }

   public aeu a(fmy $$0) {
      return $$0.b().a();
   }

   protected void a(fmy $$0, elk $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fmy $$0, ti $$1, elk $$2, fnz $$3, int $$4) {
      double $$5 = this.c.b($$0);
      $$2.a();
      if ($$5 < 100.0) {
         eih $$6 = $$0.gf();
         eie $$7 = $$6.a(eid.c);
         if ($$7 != null) {
            eig $$8 = $$6.c($$0.cx(), $$7);
            super.a($$0, ti.b(Integer.toString($$8.b())).b(th.u).b($$7.d()), $$2, $$3, $$4);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public void a(elk $$0, fnz $$1, int $$2, fmy $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(elk $$0, fnz $$1, int $$2, fmy $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(elk $$0, fnz $$1, int $$2, fmy $$3, fhx $$4, fhx $$5) {
      fgd<fmy> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      aeu $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(foh.c($$7)), $$2, fyq.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(foh.i($$7)), $$2, fyq.d);
   }

   protected void a(fmy $$0, elk $$1, float $$2, float $$3, float $$4) {
      float $$5 = $$0.a($$4);
      float $$6 = $$0.g($$4);
      if ($$0.fu()) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$7 = (float)$$0.fv() + $$4;
         float $$8 = ars.a($$7 * $$7 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fh()) {
            $$1.a(a.b.rotationDegrees($$8 * (-90.0F - $$6)));
         }

         ehi $$9 = $$0.f($$4);
         ehi $$10 = $$0.C($$4);
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
         float $$16 = ars.i($$5, 0.0F, $$15);
         $$1.a(a.b.rotationDegrees($$16));
         if ($$0.bZ()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
