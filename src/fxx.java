public class fxx extends fty<fmt, ffy<fmt>> {
   public fxx(fsx.a $$0, boolean $$1) {
      super($$0, new ffy<>($$0.a($$1 ? fhr.aQ : fhr.aM), $$1), 0.5F);
      this.a(new fwv<>(this, new fff($$0.a($$1 ? fhr.aR : fhr.aO)), new fff($$0.a($$1 ? fhr.aS : fhr.aP)), $$0.g()));
      this.a(new fxe<>(this, $$0.d()));
      this.a(new fwd<>($$0, this));
      this.a(new fwl(this));
      this.a(new fwf(this));
      this.a(new fwk<>(this, $$0.f(), $$0.d()));
      this.a(new fwo<>(this, $$0.f()));
      this.a(new fxc<>(this, $$0.f()));
      this.a(new fxm<>(this, $$0.f()));
      this.a(new fwe<>(this));
   }

   public void a(fmt $$0, float $$1, float $$2, elf $$3, fnu $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ehd a(fmt $$0, float $$1) {
      return $$0.bW() ? new ehd(0.0, -0.125, 0.0) : super.a($$0, $$1);
   }

   private void b(fmt $$0) {
      ffy<fmt> $$1 = this.a();
      if ($$0.G_()) {
         $$1.c_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.c_(true);
         $$1.l.k = $$0.a(cbn.g);
         $$1.z.k = $$0.a(cbn.b);
         $$1.x.k = $$0.a(cbn.e);
         $$1.y.k = $$0.a(cbn.f);
         $$1.b.k = $$0.a(cbn.c);
         $$1.w.k = $$0.a(cbn.d);
         $$1.t = $$0.bW();
         ffg.a $$2 = a($$0, bgp.a);
         ffg.a $$3 = a($$0, bgp.b);
         if ($$2.a()) {
            $$3 = $$0.eS().b() ? ffg.a.a : ffg.a.b;
         }

         if ($$0.fk() == bis.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static ffg.a a(fmt $$0, bgp $$1) {
      cix $$2 = $$0.b($$1);
      if ($$2.b()) {
         return ffg.a.a;
      } else {
         if ($$0.fm() == $$1 && $$0.fo() > 0) {
            ckq $$3 = $$2.s();
            if ($$3 == ckq.d) {
               return ffg.a.c;
            }

            if ($$3 == ckq.e) {
               return ffg.a.d;
            }

            if ($$3 == ckq.f) {
               return ffg.a.e;
            }

            if ($$3 == ckq.g && $$1 == $$0.fm()) {
               return ffg.a.f;
            }

            if ($$3 == ckq.h) {
               return ffg.a.h;
            }

            if ($$3 == ckq.i) {
               return ffg.a.i;
            }

            if ($$3 == ckq.j) {
               return ffg.a.j;
            }
         } else if (!$$0.aF && $$2.a(cja.uZ) && chf.d($$2)) {
            return ffg.a.g;
         }

         return ffg.a.b;
      }
   }

   public aer a(fmt $$0) {
      return $$0.b().a();
   }

   protected void a(fmt $$0, elf $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fmt $$0, tf $$1, elf $$2, fnu $$3, int $$4) {
      double $$5 = this.c.b($$0);
      $$2.a();
      if ($$5 < 100.0) {
         eic $$6 = $$0.gf();
         ehz $$7 = $$6.a(ehy.c);
         if ($$7 != null) {
            eib $$8 = $$6.c($$0.cx(), $$7);
            super.a($$0, tf.b(Integer.toString($$8.b())).b(te.u).b($$7.d()), $$2, $$3, $$4);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public void a(elf $$0, fnu $$1, int $$2, fmt $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(elf $$0, fnu $$1, int $$2, fmt $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(elf $$0, fnu $$1, int $$2, fmt $$3, fhs $$4, fhs $$5) {
      ffy<fmt> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      aer $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(foc.c($$7)), $$2, fyl.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(foc.i($$7)), $$2, fyl.d);
   }

   protected void a(fmt $$0, elf $$1, float $$2, float $$3, float $$4) {
      float $$5 = $$0.a($$4);
      float $$6 = $$0.g($$4);
      if ($$0.fu()) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$7 = (float)$$0.fv() + $$4;
         float $$8 = arp.a($$7 * $$7 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fh()) {
            $$1.a(a.b.rotationDegrees($$8 * (-90.0F - $$6)));
         }

         ehd $$9 = $$0.f($$4);
         ehd $$10 = $$0.C($$4);
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
         float $$16 = arp.i($$5, 0.0F, $$15);
         $$1.a(a.b.rotationDegrees($$16));
         if ($$0.bZ()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
