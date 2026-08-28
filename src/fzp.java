import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fzp {
   static final alz b = alz.b("spectator/close");
   static final alz c = alz.b("spectator/scroll_left");
   static final alz d = alz.b("spectator/scroll_right");
   private static final fzr e = new fzp.a();
   private static final fzr f = new fzp.b(-1, true);
   private static final fzr g = new fzp.b(1, true);
   private static final fzr h = new fzp.b(1, false);
   private static final int i = 8;
   static final xv j = xv.c("spectatorMenu.close");
   static final xv k = xv.c("spectatorMenu.previous_page");
   static final xv l = xv.c("spectatorMenu.next_page");
   public static final fzr a = new fzr() {
      @Override
      public void a(fzp $$0) {
      }

      @Override
      public xv aU_() {
         return xu.a;
      }

      @Override
      public void a(fns $$0, float $$1, float $$2) {
      }

      @Override
      public boolean aV_() {
         return false;
      }
   };
   private final fzs m;
   private fzq n;
   private int o = -1;
   int p;

   public fzp(fzs $$0) {
      this.n = new fzo();
      this.m = $$0;
   }

   public fzr a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fzr)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fzr> a() {
      List<fzr> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fzr b() {
      return this.a(this.o);
   }

   public fzq c() {
      return this.n;
   }

   public void b(int $$0) {
      fzr $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aV_()) {
            $$1.a(this);
         } else {
            this.o = $$0;
         }
      }
   }

   public void d() {
      this.m.a(this);
   }

   public int e() {
      return this.o;
   }

   public void a(fzq $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fzt f() {
      return new fzt(this.a(), this.o);
   }

   static class a implements fzr {
      @Override
      public void a(fzp $$0) {
         $$0.d();
      }

      @Override
      public xv aU_() {
         return fzp.j;
      }

      @Override
      public void a(fns $$0, float $$1, float $$2) {
         $$0.a(glv::C, fzp.b, 0, 0, 16, 16, ayp.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aV_() {
         return true;
      }
   }

   static class b implements fzr {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fzp $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public xv aU_() {
         return this.a < 0 ? fzp.k : fzp.l;
      }

      @Override
      public void a(fns $$0, float $$1, float $$2) {
         int $$3 = ayp.a($$2, $$1, $$1, $$1);
         if (this.a < 0) {
            $$0.a(glv::C, fzp.c, 0, 0, 16, 16, $$3);
         } else {
            $$0.a(glv::C, fzp.d, 0, 0, 16, 16, $$3);
         }
      }

      @Override
      public boolean aV_() {
         return this.b;
      }
   }
}
