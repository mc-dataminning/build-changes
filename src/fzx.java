import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fzx extends fzh<fzx.b> {
   private static final alg G = alg.b("container/creative_inventory/scroller");
   private static final alg H = alg.b("container/creative_inventory/scroller_disabled");
   private static final alg[] I = new alg[]{
      alg.b("container/creative_inventory/tab_top_unselected_1"),
      alg.b("container/creative_inventory/tab_top_unselected_2"),
      alg.b("container/creative_inventory/tab_top_unselected_3"),
      alg.b("container/creative_inventory/tab_top_unselected_4"),
      alg.b("container/creative_inventory/tab_top_unselected_5"),
      alg.b("container/creative_inventory/tab_top_unselected_6"),
      alg.b("container/creative_inventory/tab_top_unselected_7")
   };
   private static final alg[] J = new alg[]{
      alg.b("container/creative_inventory/tab_top_selected_1"),
      alg.b("container/creative_inventory/tab_top_selected_2"),
      alg.b("container/creative_inventory/tab_top_selected_3"),
      alg.b("container/creative_inventory/tab_top_selected_4"),
      alg.b("container/creative_inventory/tab_top_selected_5"),
      alg.b("container/creative_inventory/tab_top_selected_6"),
      alg.b("container/creative_inventory/tab_top_selected_7")
   };
   private static final alg[] K = new alg[]{
      alg.b("container/creative_inventory/tab_bottom_unselected_1"),
      alg.b("container/creative_inventory/tab_bottom_unselected_2"),
      alg.b("container/creative_inventory/tab_bottom_unselected_3"),
      alg.b("container/creative_inventory/tab_bottom_unselected_4"),
      alg.b("container/creative_inventory/tab_bottom_unselected_5"),
      alg.b("container/creative_inventory/tab_bottom_unselected_6"),
      alg.b("container/creative_inventory/tab_bottom_unselected_7")
   };
   private static final alg[] L = new alg[]{
      alg.b("container/creative_inventory/tab_bottom_selected_1"),
      alg.b("container/creative_inventory/tab_bottom_selected_2"),
      alg.b("container/creative_inventory/tab_bottom_selected_3"),
      alg.b("container/creative_inventory/tab_bottom_selected_4"),
      alg.b("container/creative_inventory/tab_bottom_selected_5"),
      alg.b("container/creative_inventory/tab_bottom_selected_6"),
      alg.b("container/creative_inventory/tab_bottom_selected_7")
   };
   private static final int M = 5;
   private static final int N = 9;
   private static final int O = 26;
   private static final int P = 32;
   private static final int Q = 12;
   private static final int R = 15;
   static final bun S = new bun(45);
   private static final wy T = wy.c("inventory.binSlot");
   private static final int U = 16777215;
   private static cye V = cyf.b();
   private float W;
   private boolean X;
   private ftj Y;
   @Nullable
   private List<cxc> Z;
   @Nullable
   private cxc aa;
   private fzw ab;
   private boolean ac;
   private boolean ad;
   private final Set<axr<czj>> ae = new HashSet<>();
   private final boolean af;
   private final gaa ag;

   public fzx(gpo $$0, cuw $$1, boolean $$2) {
      super(new fzx.b($$0), $$0.gi(), wx.a);
      $$0.bR = this.z;
      this.u = 136;
      this.s = 195;
      this.af = $$2;
      this.a($$0.j.D(), $$1, this.a($$0), $$0.dU().F_());
      this.ag = new gaa(this);
   }

   private boolean a(crm $$0) {
      return $$0.gF() && this.af;
   }

   private void a(cuw $$0, boolean $$1, jh.a $$2) {
      gkr $$3 = this.m.L();
      if (this.a($$3 != null ? $$3.D() : null, $$0, $$1, $$2)) {
         for (cye $$4 : cyf.d()) {
            Collection<czn> $$5 = $$4.l();
            if ($$4 == V) {
               if ($$4.k() == cye.h.a && $$5.isEmpty()) {
                  this.a(cyf.b());
               } else {
                  this.a($$5);
               }
            }
         }
      }
   }

   private boolean a(@Nullable gli $$0, cuw $$1, boolean $$2, jh.a $$3) {
      if (!cyf.a($$1, $$2, $$3)) {
         return false;
      } else {
         if ($$0 != null) {
            List<czn> $$4 = List.copyOf(cyf.e().l());
            $$0.a($$3, $$4);
            $$0.a($$4);
         }

         return true;
      }
   }

   private void a(Collection<czn> $$0) {
      int $$1 = this.z.a(this.W);
      this.z.m.clear();
      if (V.k() == cye.h.d) {
         this.H();
      } else {
         this.z.m.addAll($$0);
      }

      this.W = this.z.e($$1);
      this.z.b(this.W);
   }

   @Override
   public void E() {
      super.E();
      if (this.m != null) {
         gpo $$0 = this.m.t;
         if ($$0 != null) {
            this.a($$0.j.y(), this.a($$0), $$0.dU().F_());
            if (!$$0.fU()) {
               this.m.a(new gai($$0));
            }
         }
      }
   }

   @Override
   protected void a(@Nullable cxc $$0, int $$1, int $$2, cvq $$3) {
      if (this.a($$0)) {
         this.Y.c(false);
         this.Y.o(0);
      }

      boolean $$4 = $$3 == cvq.b;
      $$3 = $$1 == -999 && $$3 == cvq.a ? cvq.e : $$3;
      if ($$3 != cvq.e || this.m.t.gm()) {
         this.a($$0, $$3);
         if ($$0 == null && V.k() != cye.h.b && $$3 != cvq.f) {
            if (!this.z.g().f() && this.ad) {
               if (!this.m.t.gm()) {
                  return;
               }

               if ($$2 == 0) {
                  this.m.t.a(this.z.g(), true);
                  this.m.r.a(this.z.g());
                  this.z.b(czn.k);
               }

               if ($$2 == 1) {
                  czn $$17 = this.z.g().a(1);
                  this.m.t.a($$17, true);
                  this.m.r.a($$17);
               }
            }
         } else {
            if ($$0 != null && !$$0.a(this.m.t)) {
               return;
            }

            if ($$0 == this.aa && $$4) {
               for (int $$5 = 0; $$5 < this.m.t.bQ.c().size(); $$5++) {
                  this.m.t.bQ.b($$5).f(czn.k);
                  this.m.r.a(czn.k, $$5);
               }
            } else if (V.k() == cye.h.b) {
               if ($$0 == this.aa) {
                  this.z.b(czn.k);
               } else if ($$3 == cvq.e && $$0 != null && $$0.h()) {
                  czn $$6 = $$0.a($$2 == 0 ? 1 : $$0.g().k());
                  czn $$7 = $$0.g();
                  this.m.t.a($$6, true);
                  this.m.r.a($$6);
                  this.m.r.a($$7, ((fzx.c)$$0).a.d);
               } else if ($$3 == cvq.e && $$1 == -999 && !this.z.g().f()) {
                  this.m.t.a(this.z.g(), true);
                  this.m.r.a(this.z.g());
                  this.z.b(czn.k);
               } else {
                  this.m.t.bQ.a($$0 == null ? $$1 : ((fzx.c)$$0).a.d, $$2, $$3, this.m.t);
                  this.m.t.bQ.d();
               }
            } else if ($$3 != cvq.f && $$0.c == S) {
               czn $$8 = this.z.g();
               czn $$9 = $$0.g();
               if ($$3 == cvq.c) {
                  if (!$$9.f()) {
                     this.m.t.gi().a($$2, $$9.c($$9.k()));
                     this.m.t.bQ.d();
                  }

                  return;
               }

               if ($$3 == cvq.d) {
                  if (this.z.g().f() && $$0.h()) {
                     czn $$10 = $$0.g();
                     this.z.b($$10.c($$10.k()));
                  }

                  return;
               }

               if ($$3 == cvq.e) {
                  if (!$$9.f()) {
                     czn $$11 = $$9.c($$2 == 0 ? 1 : $$9.k());
                     this.m.t.a($$11, true);
                     this.m.r.a($$11);
                  }

                  return;
               }

               if (!$$8.f() && !$$9.f() && czn.c($$8, $$9)) {
                  if ($$2 == 0) {
                     if ($$4) {
                        $$8.e($$8.k());
                     } else if ($$8.M() < $$8.k()) {
                        $$8.g(1);
                     }
                  } else {
                     $$8.h(1);
                  }
               } else if (!$$9.f() && $$8.f()) {
                  int $$12 = $$4 ? $$9.k() : $$9.M();
                  this.z.b($$9.c($$12));
               } else if ($$2 == 0) {
                  this.z.b(czn.k);
               } else if (!this.z.g().f()) {
                  this.z.g().h(1);
               }
            } else if (this.z != null) {
               czn $$13 = $$0 == null ? czn.k : this.z.b($$0.d).g();
               this.z.a($$0 == null ? $$1 : $$0.d, $$2, $$3, this.m.t);
               if (cvf.d($$2) == 2) {
                  for (int $$14 = 0; $$14 < 9; $$14++) {
                     this.m.r.a(this.z.b(45 + $$14).g(), 36 + $$14);
                  }
               } else if ($$0 != null && crl.e($$0.i()) && V.k() != cye.h.b) {
                  if ($$3 == cvq.e && !$$13.f() && !this.z.g().f()) {
                     int $$15 = $$2 == 0 ? 1 : $$13.M();
                     czn $$16 = $$13.c($$15);
                     $$13.h($$15);
                     this.m.t.a($$16, true);
                     this.m.r.a($$16);
                  }

                  this.m.t.bQ.d();
               }
            }
         }
      }
   }

   private boolean a(@Nullable cxc $$0) {
      return $$0 != null && $$0.c == S;
   }

   @Override
   protected void aO_() {
      if (this.m.t.fU()) {
         super.aO_();
         this.Y = new ftj(this.p, this.C + 82, this.D + 6, 80, 9, wy.c("itemGroup.search"));
         this.Y.f(50);
         this.Y.d(false);
         this.Y.g(false);
         this.Y.m(16777215);
         this.d(this.Y);
         cye $$0 = V;
         V = cyf.b();
         this.a($$0);
         this.m.t.bQ.b(this.ab);
         this.ab = new fzw(this.m);
         this.m.t.bQ.a(this.ab);
         if (!V.i()) {
            this.a(cyf.b());
         }
      } else {
         this.m.a(new gai(this.m.t));
      }
   }

   @Override
   public void a(fpt $$0, int $$1, int $$2) {
      int $$3 = this.z.a(this.W);
      String $$4 = this.Y.a();
      this.b($$0, $$1, $$2);
      this.Y.a($$4);
      if (!this.Y.a().isEmpty()) {
         this.H();
      }

      this.W = this.z.e($$3);
      this.z.b(this.W);
   }

   @Override
   public void aF_() {
      super.aF_();
      if (this.m.t != null && this.m.t.gi() != null) {
         this.m.t.bQ.b(this.ab);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.ac) {
         return false;
      } else if (V.k() != cye.h.d) {
         return false;
      } else {
         String $$2 = this.Y.a();
         if (this.Y.a($$0, $$1)) {
            if (!Objects.equals($$2, this.Y.a())) {
               this.H();
            }

            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      this.ac = false;
      if (V.k() != cye.h.d) {
         if (this.m.n.I.a($$0, $$1)) {
            this.ac = true;
            this.a(cyf.e());
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         boolean $$3 = !this.a(this.B) || this.B.h();
         boolean $$4 = fiu.a($$0, $$1).e().isPresent();
         if ($$3 && $$4 && this.a($$0, $$1)) {
            this.ac = true;
            return true;
         } else {
            String $$5 = this.Y.a();
            if (this.Y.a($$0, $$1, $$2)) {
               if (!Objects.equals($$5, this.Y.a())) {
                  this.H();
               }

               return true;
            } else {
               return this.Y.aJ_() && this.Y.i() && $$0 != 256 ? true : super.a($$0, $$1, $$2);
            }
         }
      }
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      this.ac = false;
      return super.c($$0, $$1, $$2);
   }

   private void H() {
      this.z.m.clear();
      this.ae.clear();
      String $$0 = this.Y.a();
      if ($$0.isEmpty()) {
         this.z.m.addAll(V.l());
      } else {
         gkr $$1 = this.m.L();
         if ($$1 != null) {
            gli $$2 = $$1.D();
            hny<czn> $$3;
            if ($$0.startsWith("#")) {
               $$0 = $$0.substring(1);
               $$3 = $$2.c();
               this.a($$0);
            } else {
               $$3 = $$2.d();
            }

            this.z.m.addAll($$3.search($$0.toLowerCase(Locale.ROOT)));
         }
      }

      this.W = 0.0F;
      this.z.b(0.0F);
   }

   private void a(String $$0) {
      int $$1 = $$0.indexOf(58);
      Predicate<alg> $$2;
      if ($$1 == -1) {
         $$2 = $$1x -> $$1x.a().contains($$0);
      } else {
         String $$3 = $$0.substring(0, $$1).trim();
         String $$4 = $$0.substring($$1 + 1).trim();
         $$2 = $$2x -> $$2x.b().contains($$3) && $$2x.a().contains($$4);
      }

      mg.g.l().map(jj.c::h).filter($$1x -> $$2.test($$1x.b())).forEach(this.ae::add);
   }

   @Override
   protected void b(fsm $$0, int $$1, int $$2) {
      if (V.d()) {
         $$0.a(this.p, V.a(), 8, 6, 4210752, false);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.C;
         double $$4 = $$1 - (double)this.D;

         for (cye $$5 : cyf.c()) {
            if (this.a($$5, $$3, $$4)) {
               return true;
            }
         }

         if (V.k() != cye.h.b && this.b($$0, $$1)) {
            this.X = this.I();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.C;
         double $$4 = $$1 - (double)this.D;
         this.X = false;

         for (cye $$5 : cyf.c()) {
            if (this.a($$5, $$3, $$4)) {
               this.a($$5);
               return true;
            }
         }
      }

      return super.b($$0, $$1, $$2);
   }

   private boolean I() {
      return V.e() && this.z.m();
   }

   private void a(cye $$0) {
      cye $$1 = V;
      V = $$0;
      this.E.clear();
      this.z.m.clear();
      this.m();
      if (V.k() == cye.h.c) {
         fpo $$2 = this.m.aD();

         for (int $$3 = 0; $$3 < 9; $$3++) {
            gpq $$4 = $$2.a($$3);
            if ($$4.a()) {
               for (int $$5 = 0; $$5 < 9; $$5++) {
                  if ($$5 == $$3) {
                     czn $$6 = new czn(czr.rE);
                     $$6.b(kk.s, bau.a);
                     wy $$7 = this.m.n.S[$$3].k();
                     wy $$8 = this.m.n.T.k();
                     $$6.b(kk.h, wy.a("inventory.hotbarInfo", $$8, $$7));
                     this.z.m.add($$6);
                  } else {
                     this.z.m.add(czn.k);
                  }
               }
            } else {
               this.z.m.addAll($$4.a(this.m.s.F_()));
            }
         }
      } else if (V.k() == cye.h.a) {
         this.z.m.addAll(V.l());
      }

      if (V.k() == cye.h.b) {
         cvf $$9 = this.m.t.bQ;
         if (this.Z == null) {
            this.Z = ImmutableList.copyOf(this.z.k);
         }

         this.z.k.clear();

         for (int $$10 = 0; $$10 < $$9.k.size(); $$10++) {
            int $$14;
            int $$15;
            if ($$10 >= 5 && $$10 < 9) {
               int $$11 = $$10 - 5;
               int $$12 = $$11 / 2;
               int $$13 = $$11 % 2;
               $$14 = 54 + $$12 * 54;
               $$15 = 6 + $$13 * 27;
            } else if ($$10 >= 0 && $$10 < 5) {
               $$14 = -2000;
               $$15 = -2000;
            } else if ($$10 == 45) {
               $$14 = 35;
               $$15 = 20;
            } else {
               int $$20 = $$10 - 9;
               int $$21 = $$20 % 9;
               int $$22 = $$20 / 9;
               $$14 = 9 + $$21 * 18;
               if ($$10 >= 36) {
                  $$15 = 112;
               } else {
                  $$15 = 54 + $$22 * 18;
               }
            }

            cxc $$26 = new fzx.c($$9.k.get($$10), $$10, $$14, $$15);
            this.z.k.add($$26);
         }

         this.aa = new cxc(S, 0, 173, 112);
         this.z.k.add(this.aa);
      } else if ($$1.k() == cye.h.b) {
         this.z.k.clear();
         this.z.k.addAll(this.Z);
         this.Z = null;
      }

      if (V.k() == cye.h.d) {
         this.Y.g(true);
         this.Y.f(false);
         this.Y.a(true);
         if ($$1 != $$0) {
            this.Y.a("");
         }

         this.H();
      } else {
         this.Y.g(false);
         this.Y.f(true);
         this.Y.a(false);
         this.Y.a("");
      }

      this.W = 0.0F;
      this.z.b(0.0F);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (super.a($$0, $$1, $$2, $$3)) {
         return true;
      } else if (!this.I()) {
         return false;
      } else {
         this.W = this.z.a(this.W, $$3);
         this.z.b(this.W);
         return true;
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.s) || $$1 >= (double)($$3 + this.u);
      this.ad = $$5 && !this.a(V, $$0, $$1);
      return this.ad;
   }

   protected boolean b(double $$0, double $$1) {
      int $$2 = this.C;
      int $$3 = this.D;
      int $$4 = $$2 + 175;
      int $$5 = $$3 + 18;
      int $$6 = $$4 + 14;
      int $$7 = $$5 + 112;
      return $$0 >= (double)$$4 && $$1 >= (double)$$5 && $$0 < (double)$$6 && $$1 < (double)$$7;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.X) {
         int $$5 = this.D + 18;
         int $$6 = $$5 + 112;
         this.W = ((float)$$1 - (float)$$5 - 7.5F) / ((float)($$6 - $$5) - 15.0F);
         this.W = azm.a(this.W, 0.0F, 1.0F);
         this.z.b(this.W);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(fsm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.ag.a($$0, $$1, $$2, $$3);

      for (cye $$4 : cyf.c()) {
         if (this.a($$0, $$4, $$1, $$2)) {
            break;
         }
      }

      if (this.aa != null && V.k() == cye.h.b && this.a(this.aa.e, this.aa.f, 16, 16, (double)$$1, (double)$$2)) {
         $$0.a(this.p, T, $$1, $$2);
      }

      this.a($$0, $$1, $$2);
   }

   @Override
   public boolean C() {
      return this.ag.a();
   }

   @Override
   public List<wy> a(czn $$0) {
      boolean $$1 = this.B != null && this.B instanceof fzx.a;
      boolean $$2 = V.k() == cye.h.a;
      boolean $$3 = V.k() == cye.h.d;
      dbc.a $$4 = this.m.n.m ? dbc.a.b : dbc.a.a;
      dbc $$5 = $$1 ? $$4.c() : $$4;
      List<wy> $$6 = $$0.a(czj.b.a(this.m.s), this.m.t, $$5);
      if ($$6.isEmpty()) {
         return $$6;
      } else if ($$2 && $$1) {
         return $$6;
      } else {
         List<wy> $$7 = Lists.newArrayList($$6);
         if ($$3 && $$1) {
            this.ae.forEach($$2x -> {
               if ($$0.a($$2x)) {
                  $$7.add(1, wy.b("#" + $$2x.b()).a(o.f));
               }
            });
         }

         int $$8 = 1;

         for (cye $$9 : cyf.c()) {
            if ($$9.k() != cye.h.d && $$9.a($$0)) {
               $$7.add($$8++, $$9.a().f().a(o.j));
            }
         }

         return $$7;
      }
   }

   @Override
   protected void a(fsm $$0, float $$1, int $$2, int $$3) {
      for (cye $$4 : cyf.c()) {
         if ($$4 != V) {
            this.a($$0, $$4);
         }
      }

      $$0.a(grc::H, V.c(), this.C, this.D, 0.0F, 0.0F, this.s, this.u, 256, 256);
      this.Y.a($$0, $$2, $$3, $$1);
      int $$5 = this.C + 175;
      int $$6 = this.D + 18;
      int $$7 = $$6 + 112;
      if (V.e()) {
         alg $$8 = this.I() ? G : H;
         $$0.a(grc::H, $$8, $$5, $$6 + (int)((float)($$7 - $$6 - 17) * this.W), 12, 15);
      }

      this.a($$0, V);
      if (V.k() == cye.h.b) {
         gai.a($$0, this.C + 73, this.D + 6, this.C + 105, this.D + 49, 20, 0.0625F, (float)$$2, (float)$$3, this.m.t);
      }
   }

   private int b(cye $$0) {
      int $$1 = $$0.f();
      int $$2 = 27;
      int $$3 = 27 * $$1;
      if ($$0.j()) {
         $$3 = this.s - 27 * (7 - $$1) + 1;
      }

      return $$3;
   }

   private int c(cye $$0) {
      int $$1 = 0;
      if ($$0.g() == cye.f.a) {
         $$1 -= 32;
      } else {
         $$1 += this.u;
      }

      return $$1;
   }

   protected boolean a(cye $$0, double $$1, double $$2) {
      int $$3 = this.b($$0);
      int $$4 = this.c($$0);
      return $$1 >= (double)$$3 && $$1 <= (double)($$3 + 26) && $$2 >= (double)$$4 && $$2 <= (double)($$4 + 32);
   }

   protected boolean a(fsm $$0, cye $$1, int $$2, int $$3) {
      int $$4 = this.b($$1);
      int $$5 = this.c($$1);
      if (this.a($$4 + 3, $$5 + 3, 21, 27, (double)$$2, (double)$$3)) {
         $$0.a(this.p, $$1.a(), $$2, $$3);
         return true;
      } else {
         return false;
      }
   }

   protected void a(fsm $$0, cye $$1) {
      boolean $$2 = $$1 == V;
      boolean $$3 = $$1.g() == cye.f.a;
      int $$4 = $$1.f();
      int $$5 = this.C + this.b($$1);
      int $$6 = this.D - ($$3 ? 28 : -(this.u - 4));
      alg[] $$7;
      if ($$3) {
         $$7 = $$2 ? J : I;
      } else {
         $$7 = $$2 ? L : K;
      }

      $$0.a(grc::H, $$7[azm.a($$4, 0, $$7.length)], $$5, $$6, 26, 32);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$5 += 5;
      $$6 += 8 + ($$3 ? 1 : -1);
      czn $$9 = $$1.b();
      $$0.a($$9, $$5, $$6);
      $$0.a(this.p, $$9, $$5, $$6);
      $$0.c().b();
   }

   public boolean G() {
      return V.k() == cye.h.b;
   }

   public static void a(fpt $$0, int $$1, boolean $$2, boolean $$3) {
      gpo $$4 = $$0.t;
      jt $$5 = $$4.dU().F_();
      fpo $$6 = $$0.aD();
      gpq $$7 = $$6.a($$1);
      if ($$2) {
         List<czn> $$8 = $$7.a($$5);

         for (int $$9 = 0; $$9 < crl.h(); $$9++) {
            czn $$10 = $$8.get($$9);
            $$4.gi().a($$9, $$10);
            $$0.r.a($$10, 36 + $$9);
         }

         $$4.bQ.d();
      } else if ($$3) {
         $$7.a($$4.gi(), $$5);
         wy $$11 = $$0.n.S[$$1].k();
         wy $$12 = $$0.n.U.k();
         wy $$13 = wy.a("inventory.hotbarSaved", $$12, $$11);
         $$0.m.a($$13, false);
         $$0.aY().c($$13);
         $$6.a();
      }
   }

   static class a extends cxc {
      public a(btz $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(crm $$0) {
         czn $$1 = this.g();
         return super.a($$0) && !$$1.f() ? $$1.a($$0.dU().K()) && !$$1.c(kk.s) : $$1.f();
      }
   }

   public static class b extends cvf {
      public final jo<czn> m = jo.a();
      private final cvf n;

      public b(crm $$0) {
         super(null, 0);
         this.n = $$0.bQ;
         crl $$1 = $$0.gi();

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               this.a(new fzx.a(fzx.S, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
            }
         }

         this.a($$1, 9, 112);
         this.b(0.0F);
      }

      @Override
      public boolean b(crm $$0) {
         return true;
      }

      protected int l() {
         return azm.e(this.m.size(), 9) - 5;
      }

      protected int a(float $$0) {
         return Math.max((int)((double)($$0 * (float)this.l()) + 0.5), 0);
      }

      protected float e(int $$0) {
         return azm.a((float)$$0 / (float)this.l(), 0.0F, 1.0F);
      }

      protected float a(float $$0, double $$1) {
         return azm.a($$0 - (float)($$1 / (double)this.l()), 0.0F, 1.0F);
      }

      public void b(float $$0) {
         int $$1 = this.a($$0);

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               int $$4 = $$3 + ($$2 + $$1) * 9;
               if ($$4 >= 0 && $$4 < this.m.size()) {
                  fzx.S.a($$3 + $$2 * 9, this.m.get($$4));
               } else {
                  fzx.S.a($$3 + $$2 * 9, czn.k);
               }
            }
         }
      }

      public boolean m() {
         return this.m.size() > 45;
      }

      @Override
      public czn b(crm $$0, int $$1) {
         if ($$1 >= this.k.size() - 9 && $$1 < this.k.size()) {
            cxc $$2 = this.k.get($$1);
            if ($$2 != null && $$2.h()) {
               $$2.e(czn.k);
            }
         }

         return czn.k;
      }

      @Override
      public boolean a(czn $$0, cxc $$1) {
         return $$1.c != fzx.S;
      }

      @Override
      public boolean b(cxc $$0) {
         return $$0.c != fzx.S;
      }

      @Override
      public czn g() {
         return this.n.g();
      }

      @Override
      public void b(czn $$0) {
         this.n.b($$0);
      }
   }

   static class c extends cxc {
      final cxc a;

      public c(cxc $$0, int $$1, int $$2, int $$3) {
         super($$0.c, $$1, $$2, $$3);
         this.a = $$0;
      }

      @Override
      public void a(crm $$0, czn $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public boolean a(czn $$0) {
         return this.a.a($$0);
      }

      @Override
      public czn g() {
         return this.a.g();
      }

      @Override
      public boolean h() {
         return this.a.h();
      }

      @Override
      public void a(czn $$0, czn $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public void f(czn $$0) {
         this.a.f($$0);
      }

      @Override
      public void d() {
         this.a.d();
      }

      @Override
      public int a() {
         return this.a.a();
      }

      @Override
      public int b_(czn $$0) {
         return this.a.b_($$0);
      }

      @Nullable
      @Override
      public alg c() {
         return this.a.c();
      }

      @Override
      public czn a(int $$0) {
         return this.a.a($$0);
      }

      @Override
      public boolean b() {
         return this.a.b();
      }

      @Override
      public boolean a(crm $$0) {
         return this.a.a($$0);
      }
   }
}
