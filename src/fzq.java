public class fzq extends fyj<cwb> {
   private static final alg G = alg.b("container/villager/out_of_stock");
   private static final alg H = alg.b("container/villager/experience_bar_background");
   private static final alg I = alg.b("container/villager/experience_bar_current");
   private static final alg J = alg.b("container/villager/experience_bar_result");
   private static final alg K = alg.b("container/villager/scroller");
   private static final alg L = alg.b("container/villager/scroller_disabled");
   private static final alg M = alg.b("container/villager/trade_arrow_out_of_stock");
   private static final alg N = alg.b("container/villager/trade_arrow");
   private static final alg O = alg.b("container/villager/discount_strikethrough");
   private static final alg P = alg.b("textures/gui/container/villager.png");
   private static final int Q = 512;
   private static final int R = 256;
   private static final int S = 99;
   private static final int T = 136;
   private static final int U = 16;
   private static final int V = 5;
   private static final int W = 35;
   private static final int X = 68;
   private static final int Y = 6;
   private static final int Z = 7;
   private static final int aa = 5;
   private static final int ab = 20;
   private static final int ac = 88;
   private static final int ad = 27;
   private static final int ae = 6;
   private static final int af = 139;
   private static final int ag = 18;
   private static final int ah = 94;
   private static final wy ai = wy.c("merchant.trades");
   private static final wy aj = wy.c("merchant.deprecated");
   private int ak;
   private final fzq.a[] al = new fzq.a[7];
   int am;
   private boolean an;

   public fzq(cwb $$0, cqx $$1, wy $$2) {
      super($$0, $$1, $$2);
      this.s = 276;
      this.x = 107;
   }

   private void G() {
      this.z.e(this.ak);
      this.z.h(this.ak);
      this.m.L().b(new aie(this.ak));
   }

   @Override
   protected void aN_() {
      super.aN_();
      int $$0 = (this.n - this.s) / 2;
      int $$1 = (this.o - this.u) / 2;
      int $$2 = $$1 + 16 + 2;

      for (int $$3 = 0; $$3 < 7; $$3++) {
         this.al[$$3] = this.c(new fzq.a($$0 + 5, $$2, $$3, $$0x -> {
            if ($$0x instanceof fzq.a) {
               this.ak = ((fzq.a)$$0x).a() + this.am;
               this.G();
            }
         }));
         $$2 += 20;
      }
   }

   @Override
   protected void b(fro $$0, int $$1, int $$2) {
      int $$3 = this.z.n();
      if ($$3 > 0 && $$3 <= 5 && this.z.q()) {
         wy $$4 = wy.a("merchant.title", this.l, wy.c("merchant.level." + $$3));
         int $$5 = this.p.a($$4);
         int $$6 = 49 + this.s / 2 - $$5 / 2;
         $$0.a(this.p, $$4, $$6, 6, 4210752, false);
      } else {
         $$0.a(this.p, this.l, 49 + this.s / 2 - this.p.a(this.l) / 2, 6, 4210752, false);
      }

      $$0.a(this.p, this.A, this.x, this.y, 4210752, false);
      int $$7 = this.p.a(ai);
      $$0.a(this.p, ai, 5 - $$7 / 2 + 48, 6, 4210752, false);
   }

   @Override
   protected void a(fro $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gqc::H, P, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 512, 256);
      dhu $$6 = this.z.p();
      if (!$$6.isEmpty()) {
         int $$7 = this.ak;
         if ($$7 < 0 || $$7 >= $$6.size()) {
            return;
         }

         dht $$8 = $$6.get($$7);
         if ($$8.r()) {
            $$0.a(gqc::H, G, this.C + 83 + 99, this.D + 35, 28, 21);
         }
      }
   }

   private void a(fro $$0, int $$1, int $$2, dht $$3) {
      int $$4 = this.z.n();
      int $$5 = this.z.l();
      if ($$4 < 5) {
         $$0.a(gqc::H, H, $$1 + 136, $$2 + 16, 102, 5);
         int $$6 = cql.b($$4);
         if ($$5 >= $$6 && cql.d($$4)) {
            int $$7 = 102;
            float $$8 = 102.0F / (float)(cql.c($$4) - $$6);
            int $$9 = Math.min(azm.d($$8 * (float)($$5 - $$6)), 102);
            $$0.a(gqc::H, I, 102, 5, 0, 0, $$1 + 136, $$2 + 16, $$9, 5);
            int $$10 = this.z.m();
            if ($$10 > 0) {
               int $$11 = Math.min(azm.d((float)$$10 * $$8), 102 - $$9);
               $$0.a(gqc::H, J, 102, 5, $$9, 0, $$1 + 136 + $$9, $$2 + 16, $$11, 5);
            }
         }
      }
   }

   private void a(fro $$0, int $$1, int $$2, dhu $$3) {
      int $$4 = $$3.size() + 1 - 7;
      if ($$4 > 1) {
         int $$5 = 139 - (27 + ($$4 - 1) * 139 / $$4);
         int $$6 = 1 + $$5 / $$4 + 139 / $$4;
         int $$7 = 113;
         int $$8 = Math.min(113, this.am * $$6);
         if (this.am == $$4 - 1) {
            $$8 = 113;
         }

         $$0.a(gqc::H, K, $$1 + 94, $$2 + 18 + $$8, 6, 27);
      } else {
         $$0.a(gqc::H, L, $$1 + 94, $$2 + 18, 6, 27);
      }
   }

   @Override
   public void a(fro $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      dhu $$4 = this.z.p();
      if (!$$4.isEmpty()) {
         int $$5 = (this.n - this.s) / 2;
         int $$6 = (this.o - this.u) / 2;
         int $$7 = $$6 + 16 + 1;
         int $$8 = $$5 + 5 + 5;
         this.a($$0, $$5, $$6, $$4);
         int $$9 = 0;

         for (dht $$10 : $$4) {
            if (!this.a($$4.size()) || $$9 >= this.am && $$9 < 7 + this.am) {
               cyy $$11 = $$10.a();
               cyy $$12 = $$10.b();
               cyy $$13 = $$10.c();
               cyy $$14 = $$10.f();
               $$0.c().a();
               $$0.c().a(0.0F, 0.0F, 100.0F);
               int $$15 = $$7 + 2;
               this.a($$0, $$12, $$11, $$8, $$15);
               if (!$$13.f()) {
                  $$0.b($$13, $$5 + 5 + 35, $$15);
                  $$0.a(this.p, $$13, $$5 + 5 + 35, $$15);
               }

               this.a($$0, $$10, $$5, $$15);
               $$0.b($$14, $$5 + 5 + 68, $$15);
               $$0.a(this.p, $$14, $$5 + 5 + 68, $$15);
               $$0.c().b();
               $$7 += 20;
               $$9++;
            } else {
               $$9++;
            }
         }

         int $$16 = this.ak;
         dht $$17 = $$4.get($$16);
         if (this.z.q()) {
            this.a($$0, $$5, $$6, $$17);
         }

         if ($$17.r() && this.a(186, 35, 22, 21, (double)$$1, (double)$$2) && this.z.o()) {
            $$0.a(this.p, aj, $$1, $$2);
         }

         for (fzq.a $$18 : this.al) {
            if ($$18.D()) {
               $$18.a($$0, $$1, $$2);
            }

            $$18.k = $$18.a < this.z.p().size();
         }
      }

      this.a($$0, $$1, $$2);
   }

   private void a(fro $$0, dht $$1, int $$2, int $$3) {
      if ($$1.r()) {
         $$0.a(gqc::H, M, $$2 + 5 + 35 + 20, $$3 + 3, 10, 9);
      } else {
         $$0.a(gqc::H, N, $$2 + 5 + 35 + 20, $$3 + 3, 10, 9);
      }
   }

   private void a(fro $$0, cyy $$1, cyy $$2, int $$3, int $$4) {
      $$0.b($$1, $$3, $$4);
      if ($$2.M() == $$1.M()) {
         $$0.a(this.p, $$1, $$3, $$4);
      } else {
         $$0.a(this.p, $$2, $$3, $$4, $$2.M() == 1 ? "1" : null);
         $$0.a(this.p, $$1, $$3 + 14, $$4, $$1.M() == 1 ? "1" : null);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 300.0F);
         $$0.a(gqc::H, O, $$3 + 7, $$4 + 12, 9, 2);
         $$0.c().b();
      }
   }

   private boolean a(int $$0) {
      return $$0 > 7;
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (super.a($$0, $$1, $$2, $$3)) {
         return true;
      } else {
         int $$4 = this.z.p().size();
         if (this.a($$4)) {
            int $$5 = $$4 - 7;
            this.am = azm.a((int)((double)this.am - $$3), 0, $$5);
         }

         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      int $$5 = this.z.p().size();
      if (this.an) {
         int $$6 = this.D + 18;
         int $$7 = $$6 + 139;
         int $$8 = $$5 - 7;
         float $$9 = ((float)$$1 - (float)$$6 - 13.5F) / ((float)($$7 - $$6) - 27.0F);
         $$9 = $$9 * (float)$$8 + 0.5F;
         this.am = azm.a((int)$$9, 0, $$8);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.an = false;
      int $$3 = (this.n - this.s) / 2;
      int $$4 = (this.o - this.u) / 2;
      if (this.a(this.z.p().size())
         && $$0 > (double)($$3 + 94)
         && $$0 < (double)($$3 + 94 + 6)
         && $$1 > (double)($$4 + 18)
         && $$1 <= (double)($$4 + 18 + 139 + 1)) {
         this.an = true;
      }

      return super.a($$0, $$1, $$2);
   }

   class a extends fsc {
      final int a;

      public a(final int $$0, final int $$1, final int $$2, final fsc.c $$3) {
         super($$0, $$1, 88, 20, wx.a, $$3, q);
         this.a = $$2;
         this.k = false;
      }

      public int a() {
         return this.a;
      }

      public void a(fro $$0, int $$1, int $$2) {
         if (this.i && fzq.this.z.p().size() > this.a + fzq.this.am) {
            if ($$1 < this.F() + 20) {
               cyy $$3 = fzq.this.z.p().get(this.a + fzq.this.am).b();
               $$0.b(fzq.this.p, $$3, $$1, $$2);
            } else if ($$1 < this.F() + 50 && $$1 > this.F() + 30) {
               cyy $$4 = fzq.this.z.p().get(this.a + fzq.this.am).c();
               if (!$$4.f()) {
                  $$0.b(fzq.this.p, $$4, $$1, $$2);
               }
            } else if ($$1 > this.F() + 65) {
               cyy $$5 = fzq.this.z.p().get(this.a + fzq.this.am).f();
               $$0.b(fzq.this.p, $$5, $$1, $$2);
            }
         }
      }
   }
}
