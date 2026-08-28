public class fxp extends fpc<fxp.a> {
   static final alz a = alz.b("transferable_list/select_highlighted");
   static final alz m = alz.b("transferable_list/select");
   static final alz n = alz.b("transferable_list/unselect_highlighted");
   static final alz o = alz.b("transferable_list/unselect");
   static final alz p = alz.b("transferable_list/move_up_highlighted");
   static final alz q = alz.b("transferable_list/move_up");
   static final alz r = alz.b("transferable_list/move_down_highlighted");
   static final alz s = alz.b("transferable_list/move_down");
   static final xv u = xv.c("pack.incompatible");
   static final xv v = xv.c("pack.incompatible.confirm.title");
   private final xv w;
   final fxo x;

   public fxp(fmg $$0, fxo $$1, int $$2, int $$3, xv $$4) {
      super($$0, $$2, $$3, 33, 36);
      this.x = $$1;
      this.w = $$4;
      this.e = false;
      this.a(true, (int)(9.0F * 1.5F));
   }

   @Override
   protected void a(fns $$0, int $$1, int $$2) {
      xv $$3 = xv.i().b(this.w).a(n.t, n.r);
      $$0.a(this.c.h, $$3, $$1 + this.g / 2 - this.c.h.a($$3) / 2, Math.min(this.E() + 3, $$2), -1, false);
   }

   @Override
   public int a() {
      return this.g;
   }

   @Override
   protected int q() {
      return this.F() - 6;
   }

   @Override
   protected void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      if (this.m()) {
         int $$6 = 2;
         int $$7 = this.s() - 2;
         int $$8 = this.F() - 6 - 1;
         int $$9 = $$1 - 2;
         int $$10 = $$1 + $$3 + 2;
         $$0.a($$7, $$9, $$8, $$10, $$4);
         $$0.a($$7 + 1, $$9 + 1, $$8 - 1, $$10 - 1, $$5);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.g() != null) {
         switch ($$0) {
            case 32:
            case 257:
               this.g().c();
               return true;
            default:
               if (fty.s()) {
                  switch ($$0) {
                     case 264:
                        this.g().g();
                        return true;
                     case 265:
                        this.g().e();
                        return true;
                  }
               }
         }
      }

      return super.a($$0, $$1, $$2);
   }

   public static class a extends fpc.a<fxp.a> {
      private static final int b = 157;
      private static final int c = 157;
      private static final String d = "...";
      private final fxp e;
      protected final fmg a;
      private final fxn.a f;
      private final azq g;
      private final foz h;
      private final azq i;
      private final foz j;

      public a(fmg $$0, fxp $$1, fxn.a $$2) {
         this.a = $$0;
         this.f = $$2;
         this.e = $$1;
         this.g = a($$0, $$2.d());
         this.h = b($$0, $$2.g());
         this.i = a($$0, fxp.u);
         this.j = b($$0, $$2.b().b());
      }

      private static azq a(fmg $$0, xv $$1) {
         int $$2 = $$0.h.a($$1);
         if ($$2 > 157) {
            ya $$3 = ya.a($$0.h.a($$1, 157 - $$0.h.b("...")), ya.e("..."));
            return us.a().a($$3);
         } else {
            return $$1.g();
         }
      }

      private static foz b(fmg $$0, xv $$1) {
         return foz.a($$0.h, 157, 2, $$1);
      }

      @Override
      public xv a() {
         return xv.a("narrator.select", this.f.d());
      }

      @Override
      public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         ave $$10 = this.f.b();
         if (!$$10.a()) {
            int $$11 = $$3 + $$4 - 3 - (this.e.m() ? 7 : 0);
            $$0.a($$3 - 1, $$2 - 1, $$11, $$2 + $$5 + 1, -8978432);
         }

         $$0.a(glv::C, this.f.a(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         azq $$12 = this.g;
         foz $$13 = this.h;
         if (this.d() && (this.a.n.ac().c() || $$8 || this.e.g() == this && this.e.aN_())) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            int $$15 = $$7 - $$2;
            if (!this.f.b().a()) {
               $$12 = this.i;
               $$13 = this.j;
            }

            if (this.f.o()) {
               if ($$14 < 32) {
                  $$0.a(glv::C, fxp.a, $$3, $$2, 32, 32);
               } else {
                  $$0.a(glv::C, fxp.m, $$3, $$2, 32, 32);
               }
            } else {
               if (this.f.p()) {
                  if ($$14 < 16) {
                     $$0.a(glv::C, fxp.n, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(glv::C, fxp.o, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.q()) {
                  if ($$14 < 32 && $$14 > 16 && $$15 < 16) {
                     $$0.a(glv::C, fxp.p, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(glv::C, fxp.q, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.r()) {
                  if ($$14 < 32 && $$14 > 16 && $$15 > 16) {
                     $$0.a(glv::C, fxp.r, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(glv::C, fxp.s, $$3, $$2, 32, 32);
                  }
               }
            }
         }

         $$0.b(this.a.h, $$12, $$3 + 32 + 2, $$2 + 1, 16777215);
         $$13.b($$0, $$3 + 32 + 2, $$2 + 12, 10, -8355712);
      }

      public String b() {
         return this.f.c();
      }

      private boolean d() {
         return !this.f.h() || !this.f.i();
      }

      public void c() {
         if (this.f.o() && this.h()) {
            this.e.x.a(this.e);
         } else if (this.f.p()) {
            this.f.k();
            this.e.x.a(this.e);
         }
      }

      void e() {
         if (this.f.q()) {
            this.f.l();
         }
      }

      void g() {
         if (this.f.r()) {
            this.f.m();
         }
      }

      private boolean h() {
         if (this.f.b().a()) {
            this.f.j();
            return true;
         } else {
            xv $$0 = this.f.b().c();
            this.a.a(new fsw($$0x -> {
               this.a.a(this.e.x);
               if ($$0x) {
                  this.f.j();
               }
            }, fxp.v, $$0));
            return false;
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)this.e.s();
         double $$4 = $$1 - (double)this.e.e(this.e.aI_().indexOf(this));
         if (this.d() && $$3 <= 32.0) {
            this.e.x.l();
            if (this.f.o()) {
               this.h();
               return true;
            }

            if ($$3 < 16.0 && this.f.p()) {
               this.f.k();
               return true;
            }

            if ($$3 > 16.0 && $$4 < 16.0 && this.f.q()) {
               this.f.l();
               return true;
            }

            if ($$3 > 16.0 && $$4 > 16.0 && this.f.r()) {
               this.f.m();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }
   }
}
