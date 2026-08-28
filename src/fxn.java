import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fxn {
   static final alj b = alj.b("spectator/close");
   static final alj c = alj.b("spectator/scroll_left");
   static final alj d = alj.b("spectator/scroll_right");
   private static final fxp e = new fxn.a();
   private static final fxp f = new fxn.b(-1, true);
   private static final fxp g = new fxn.b(1, true);
   private static final fxp h = new fxn.b(1, false);
   private static final int i = 8;
   static final xj j = xj.c("spectatorMenu.close");
   static final xj k = xj.c("spectatorMenu.previous_page");
   static final xj l = xj.c("spectatorMenu.next_page");
   public static final fxp a = new fxp() {
      @Override
      public void a(fxn $$0) {
      }

      @Override
      public xj aS_() {
         return xi.a;
      }

      @Override
      public void a(flq $$0, float $$1, float $$2) {
      }

      @Override
      public boolean aT_() {
         return false;
      }
   };
   private final fxq m;
   private fxo n;
   private int o = -1;
   int p;

   public fxn(fxq $$0) {
      this.n = new fxm();
      this.m = $$0;
   }

   public fxp a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fxp)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fxp> a() {
      List<fxp> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fxp b() {
      return this.a(this.o);
   }

   public fxo c() {
      return this.n;
   }

   public void b(int $$0) {
      fxp $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aT_()) {
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

   public void a(fxo $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fxr f() {
      return new fxr(this.a(), this.o);
   }

   static class a implements fxp {
      @Override
      public void a(fxn $$0) {
         $$0.d();
      }

      @Override
      public xj aS_() {
         return fxn.j;
      }

      @Override
      public void a(flq $$0, float $$1, float $$2) {
         $$0.a(gjq::B, fxn.b, 0, 0, 16, 16, axx.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aT_() {
         return true;
      }
   }

   static class b implements fxp {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fxn $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public xj aS_() {
         return this.a < 0 ? fxn.k : fxn.l;
      }

      @Override
      public void a(flq $$0, float $$1, float $$2) {
         int $$3 = axx.a($$2, $$1, $$1, $$1);
         if (this.a < 0) {
            $$0.a(gjq::B, fxn.c, 0, 0, 16, 16, $$3);
         } else {
            $$0.a(gjq::B, fxn.d, 0, 0, 16, 16, $$3);
         }
      }

      @Override
      public boolean aT_() {
         return this.b;
      }
   }
}
