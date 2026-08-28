import javax.annotation.Nullable;

public class fup extends fud {
   private static final alk a = alk.b("widget/checkbox_selected_highlighted");
   private static final alk b = alk.b("widget/checkbox_selected");
   private static final alk c = alk.b("widget/checkbox_highlighted");
   private static final alk d = alk.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fup.b p;
   private final fvh q;

   fup(int $$0, int $$1, int $$2, xc $$3, ftx $$4, boolean $$5, fup.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new fvh($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, xc $$1, ftx $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(ftx $$0) {
      return Math.max(a($$0), this.q.y());
   }

   static int b(xc $$0, ftx $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static fup.a a(xc $$0, ftx $$1) {
      return new fup.a($$0, $$1);
   }

   public static int a(ftx $$0) {
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
   public void a(fyk $$0) {
      $$0.a(fyj.a, this.d());
      if (this.j) {
         if (this.aN_()) {
            $$0.a(fyj.d, xc.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fyj.d, xc.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(ftz $$0, int $$1, int $$2, float $$3) {
      frf $$4 = frf.Q();
      ftx $$5 = $$4.h;
      alk $$6;
      if (this.o) {
         $$6 = this.aN_() ? a : b;
      } else {
         $$6 = this.aN_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(gsn::H, $$6, this.F(), this.G(), $$8, $$8, aya.a(this.l));
      int $$9 = this.F() + $$8 + 4;
      int $$10 = this.G() + $$8 / 2 - this.q.y() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final xc a;
      private final ftx b;
      private int c;
      private int d = 0;
      private int e = 0;
      private fup.b f = fup.b.a;
      private boolean g = false;
      @Nullable
      private fri<Boolean> h = null;
      @Nullable
      private fvy i = null;

      a(xc $$0, ftx $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fup.b($$0, $$1);
      }

      public fup.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fup.a a(fup.b $$0) {
         this.f = $$0;
         return this;
      }

      public fup.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public fup.a a(fri<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public fup.a a(fvy $$0) {
         this.i = $$0;
         return this;
      }

      public fup.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fup a() {
         fup.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         fup $$1 = new fup(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      fup.b a = ($$0, $$1) -> {
      };

      void onValueChange(fup var1, boolean var2);
   }
}
