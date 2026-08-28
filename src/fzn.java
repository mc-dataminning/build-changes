import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fzn {
   static final alz b = alz.b("spectator/close");
   static final alz c = alz.b("spectator/scroll_left");
   static final alz d = alz.b("spectator/scroll_right");
   private static final fzp e = new fzn.a();
   private static final fzp f = new fzn.b(-1, true);
   private static final fzp g = new fzn.b(1, true);
   private static final fzp h = new fzn.b(1, false);
   private static final int i = 8;
   static final xv j = xv.c("spectatorMenu.close");
   static final xv k = xv.c("spectatorMenu.previous_page");
   static final xv l = xv.c("spectatorMenu.next_page");
   public static final fzp a = new fzp() {
      @Override
      public void a(fzn $$0) {
      }

      @Override
      public xv aU_() {
         return xu.a;
      }

      @Override
      public void a(fnq $$0, float $$1, float $$2) {
      }

      @Override
      public boolean aV_() {
         return false;
      }
   };
   private final fzq m;
   private fzo n;
   private int o = -1;
   int p;

   public fzn(fzq $$0) {
      this.n = new fzm();
      this.m = $$0;
   }

   public fzp a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fzp)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fzp> a() {
      List<fzp> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fzp b() {
      return this.a(this.o);
   }

   public fzo c() {
      return this.n;
   }

   public void b(int $$0) {
      fzp $$1 = this.a($$0);
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

   public void a(fzo $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fzr f() {
      return new fzr(this.a(), this.o);
   }

   static class a implements fzp {
      @Override
      public void a(fzn $$0) {
         $$0.d();
      }

      @Override
      public xv aU_() {
         return fzn.j;
      }

      @Override
      public void a(fnq $$0, float $$1, float $$2) {
         $$0.a(glt::B, fzn.b, 0, 0, 16, 16, ayp.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aV_() {
         return true;
      }
   }

   static class b implements fzp {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fzn $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public xv aU_() {
         return this.a < 0 ? fzn.k : fzn.l;
      }

      @Override
      public void a(fnq $$0, float $$1, float $$2) {
         int $$3 = ayp.a($$2, $$1, $$1, $$1);
         if (this.a < 0) {
            $$0.a(glt::B, fzn.c, 0, 0, 16, 16, $$3);
         } else {
            $$0.a(glt::B, fzn.d, 0, 0, 16, 16, $$3);
         }
      }

      @Override
      public boolean aV_() {
         return this.b;
      }
   }
}
