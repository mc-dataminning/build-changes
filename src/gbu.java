public class gbu extends ftf<gbu.a> {
   static final alg a = alg.b("transferable_list/select_highlighted");
   static final alg m = alg.b("transferable_list/select");
   static final alg n = alg.b("transferable_list/unselect_highlighted");
   static final alg o = alg.b("transferable_list/unselect");
   static final alg p = alg.b("transferable_list/move_up_highlighted");
   static final alg q = alg.b("transferable_list/move_up");
   static final alg r = alg.b("transferable_list/move_down_highlighted");
   static final alg s = alg.b("transferable_list/move_down");
   static final wy u = wy.c("pack.incompatible");
   static final wy v = wy.c("pack.incompatible.confirm.title");
   private final wy w;
   final gbt x;

   public gbu(foz $$0, gbt $$1, int $$2, int $$3, wy $$4) {
      super($$0, $$2, $$3, 33, 36, (int)(9.0F * 1.5F));
      this.x = $$1;
      this.w = $$4;
      this.e = false;
   }

   @Override
   protected void a(frv $$0, int $$1, int $$2) {
      wy $$3 = wy.i().b(this.w).a(n.t, n.r);
      $$0.b(this.c.h, $$3, $$1 + this.g / 2 - this.c.h.a($$3) / 2, Math.min(this.G() + 3, $$2), -1);
   }

   @Override
   public int a() {
      return this.g;
   }

   @Override
   protected int l() {
      return this.H() - 6;
   }

   @Override
   protected void a(frv $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      if (this.j()) {
         int $$6 = 2;
         int $$7 = this.u() - 2;
         int $$8 = this.H() - 6 - 1;
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
      if (this.p() != null) {
         switch ($$0) {
            case 32:
            case 257:
               this.p().c();
               return true;
            default:
               if (fyb.t()) {
                  switch ($$0) {
                     case 264:
                        this.p().g();
                        return true;
                     case 265:
                        this.p().e();
                        return true;
                  }
               }
         }
      }

      return super.a($$0, $$1, $$2);
   }

   public static class a extends ftf.a<gbu.a> {
      private static final int b = 157;
      private static final int c = 157;
      private static final String d = "...";
      private final gbu e;
      protected final foz a;
      private final gbs.a f;
      private final ayy g;
      private final ftc h;
      private final ayy i;
      private final ftc j;

      public a(foz $$0, gbu $$1, gbs.a $$2) {
         this.a = $$0;
         this.f = $$2;
         this.e = $$1;
         this.g = a($$0, $$2.d());
         this.h = b($$0, $$2.g());
         this.i = a($$0, gbu.u);
         this.j = b($$0, $$2.b().b());
      }

      private static ayy a(foz $$0, wy $$1) {
         int $$2 = $$0.h.a($$1);
         if ($$2 > 157) {
            xd $$3 = xd.a($$0.h.a($$1, 157 - $$0.h.b("...")), xd.e("..."));
            return tu.a().a($$3);
         } else {
            return $$1.g();
         }
      }

      private static ftc b(foz $$0, wy $$1) {
         return ftc.a($$0.h, 157, 2, $$1);
      }

      @Override
      public wy a() {
         return wy.a("narrator.select", this.f.d());
      }

      @Override
      public void a(frv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         aul $$10 = this.f.b();
         if (!$$10.a()) {
            int $$11 = $$3 + $$4 - 3 - (this.e.j() ? 7 : 0);
            $$0.a($$3 - 1, $$2 - 1, $$11, $$2 + $$5 + 1, -8978432);
         }

         $$0.a(gqk::H, this.f.a(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         ayy $$12 = this.g;
         ftc $$13 = this.h;
         if (this.d() && (this.a.n.ac().c() || $$8 || this.e.p() == this && this.e.aJ_())) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            int $$15 = $$7 - $$2;
            if (!this.f.b().a()) {
               $$12 = this.i;
               $$13 = this.j;
            }

            if (this.f.o()) {
               if ($$14 < 32) {
                  $$0.a(gqk::H, gbu.a, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gqk::H, gbu.m, $$3, $$2, 32, 32);
               }
            } else {
               if (this.f.p()) {
                  if ($$14 < 16) {
                     $$0.a(gqk::H, gbu.n, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(gqk::H, gbu.o, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.q()) {
                  if ($$14 < 32 && $$14 > 16 && $$15 < 16) {
                     $$0.a(gqk::H, gbu.p, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(gqk::H, gbu.q, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.r()) {
                  if ($$14 < 32 && $$14 > 16 && $$15 > 16) {
                     $$0.a(gqk::H, gbu.r, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(gqk::H, gbu.s, $$3, $$2, 32, 32);
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
            wy $$0 = this.f.b().c();
            this.a.a(new fwz($$0x -> {
               this.a.a(this.e.x);
               if ($$0x) {
                  this.f.j();
               }
            }, gbu.v, $$0));
            return false;
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)this.e.u();
         double $$4 = $$1 - (double)this.e.d(this.e.aE_().indexOf(this));
         if (this.d() && $$3 <= 32.0) {
            this.e.x.m();
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
