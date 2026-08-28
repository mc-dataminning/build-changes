import javax.annotation.Nullable;

public class fun extends fub {
   private static final ali a = ali.b("widget/checkbox_selected_highlighted");
   private static final ali b = ali.b("widget/checkbox_selected");
   private static final ali c = ali.b("widget/checkbox_highlighted");
   private static final ali d = ali.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fun.b p;
   private final fvf q;

   fun(int $$0, int $$1, int $$2, xa $$3, ftv $$4, boolean $$5, fun.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new fvf($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, xa $$1, ftv $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(ftv $$0) {
      return Math.max(a($$0), this.q.y());
   }

   static int b(xa $$0, ftv $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static fun.a a(xa $$0, ftv $$1) {
      return new fun.a($$0, $$1);
   }

   public static int a(ftv $$0) {
      return 9 + 8;
   }

   @Override
   public void b() {
      this.o = !this.o;
      this.p.onValueChange(this, this.o);
   }

   public boolean a() {
      return this.o;
   }

   @Override
   public void a(fyi $$0) {
      $$0.a(fyh.a, this.d());
      if (this.j) {
         if (this.aN_()) {
            $$0.a(fyh.d, xa.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fyh.d, xa.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(ftx $$0, int $$1, int $$2, float $$3) {
      frd $$4 = frd.Q();
      ftv $$5 = $$4.h;
      ali $$6;
      if (this.o) {
         $$6 = this.aN_() ? a : b;
      } else {
         $$6 = this.aN_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(gsl::H, $$6, this.F(), this.G(), $$8, $$8, axy.a(this.l));
      int $$9 = this.F() + $$8 + 4;
      int $$10 = this.G() + $$8 / 2 - this.q.y() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final xa a;
      private final ftv b;
      private int c;
      private int d = 0;
      private int e = 0;
      private fun.b f = fun.b.a;
      private boolean g = false;
      @Nullable
      private frg<Boolean> h = null;
      @Nullable
      private fvw i = null;

      a(xa $$0, ftv $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fun.b($$0, $$1);
      }

      public fun.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fun.a a(fun.b $$0) {
         this.f = $$0;
         return this;
      }

      public fun.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public fun.a a(frg<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public fun.a a(fvw $$0) {
         this.i = $$0;
         return this;
      }

      public fun.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fun a() {
         fun.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         fun $$1 = new fun(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      fun.b a = ($$0, $$1) -> {
      };

      void onValueChange(fun var1, boolean var2);
   }
}
