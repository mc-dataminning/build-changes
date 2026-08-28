public class gol extends gkh<gcw, fvn<gcw>> {
   public gol(gjg.a $$0, boolean $$1) {
      super($$0, new fvn<>($$0.a($$1 ? fxh.aW : fxh.aS), $$1), 0.5F);
      this.a(new gni<>(this, new fuu($$0.a($$1 ? fxh.aX : fxh.aU)), new fuu($$0.a($$1 ? fxh.aY : fxh.aV)), $$0.g()));
      this.a(new gnr<>(this, $$0.d()));
      this.a(new gmo<>($$0, this));
      this.a(new gmy(this));
      this.a(new gms(this));
      this.a(new gmx<>(this, $$0.f(), $$0.d()));
      this.a(new gnb<>(this, $$0.f()));
      this.a(new gnp<>(this, $$0.f()));
      this.a(new goa<>(this, $$0.f()));
      this.a(new gmp<>(this));
   }

   public void a(gcw $$0, float $$1, float $$2, fag $$3, gdx $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public evz a(gcw $$0, float $$1) {
      return $$0.ca() ? new evz(0.0, (double)($$0.eb() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(gcw $$0) {
      fvn<gcw> $$1 = this.a();
      if ($$0.N_()) {
         $$1.c_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.c_(true);
         $$1.l.k = $$0.a(cmi.g);
         $$1.z.k = $$0.a(cmi.b);
         $$1.x.k = $$0.a(cmi.e);
         $$1.y.k = $$0.a(cmi.f);
         $$1.b.k = $$0.a(cmi.c);
         $$1.w.k = $$0.a(cmi.d);
         $$1.t = $$0.ca();
         fuv.a $$2 = a($$0, bqc.a);
         fuv.a $$3 = a($$0, bqc.b);
         if ($$2.a()) {
            $$3 = $$0.eU().e() ? fuv.a.a : fuv.a.b;
         }

         if ($$0.fq() == bss.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fuv.a a(gcw $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if ($$2.e()) {
         return fuv.a.a;
      } else {
         if ($$0.fs() == $$1 && $$0.fu() > 0) {
            cvv $$3 = $$2.u();
            if ($$3 == cvv.d) {
               return fuv.a.c;
            }

            if ($$3 == cvv.e) {
               return fuv.a.d;
            }

            if ($$3 == cvv.f) {
               return fuv.a.e;
            }

            if ($$3 == cvv.g && $$1 == $$0.fs()) {
               return fuv.a.f;
            }

            if ($$3 == cvv.h) {
               return fuv.a.h;
            }

            if ($$3 == cvv.i) {
               return fuv.a.i;
            }

            if ($$3 == cvv.j) {
               return fuv.a.j;
            }
         } else if (!$$0.aJ && $$2.a(cud.vW) && csn.i($$2)) {
            return fuv.a.g;
         }

         return fuv.a.b;
      }
   }

   public akk a(gcw $$0) {
      return $$0.b().a();
   }

   protected void a(gcw $$0, fag $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gcw $$0, wu $$1, fag $$2, gdx $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         exd $$7 = $$0.gn();
         ewv $$8 = $$7.a(ewu.c);
         if ($$8 != null) {
            ewz $$9 = $$7.d($$0, $$8);
            wu $$10 = ewz.a($$9, $$8.a(yn.b));
            super.a($$0, wu.i().b($$10).b(wt.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(fag $$0, gdx $$1, int $$2, gcw $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(fag $$0, gdx $$1, int $$2, gcw $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(fag $$0, gdx $$1, int $$2, gcw $$3, fxi $$4, fxi $$5) {
      fvn<gcw> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      akk $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(gef.c($$7)), $$2, goz.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(gef.i($$7)), $$2, goz.d);
   }

   protected void a(gcw $$0, fag $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.h($$4);
      if ($$0.fA()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fB() + $$4;
         float $$9 = aye.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fn()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         evz $$10 = $$0.g($$4);
         evz $$11 = $$0.F($$4);
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
         float $$17 = aye.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.cd()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
