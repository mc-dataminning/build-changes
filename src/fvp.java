import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fvp {
   static final alc b = alc.b("spectator/close");
   static final alc c = alc.b("spectator/scroll_left");
   static final alc d = alc.b("spectator/scroll_right");
   private static final fvr e = new fvp.a();
   private static final fvr f = new fvp.b(-1, true);
   private static final fvr g = new fvp.b(1, true);
   private static final fvr h = new fvp.b(1, false);
   private static final int i = 8;
   static final xd j = xd.c("spectatorMenu.close");
   static final xd k = xd.c("spectatorMenu.previous_page");
   static final xd l = xd.c("spectatorMenu.next_page");
   public static final fvr a = new fvr() {
      @Override
      public void a(fvp $$0) {
      }

      @Override
      public xd aS_() {
         return xc.a;
      }

      @Override
      public void a(fjx $$0, float $$1, float $$2) {
      }

      @Override
      public boolean aT_() {
         return false;
      }
   };
   private final fvs m;
   private fvq n;
   private int o = -1;
   int p;

   public fvp(fvs $$0) {
      this.n = new fvo();
      this.m = $$0;
   }

   public fvr a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fvr)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fvr> a() {
      List<fvr> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fvr b() {
      return this.a(this.o);
   }

   public fvq c() {
      return this.n;
   }

   public void b(int $$0) {
      fvr $$1 = this.a($$0);
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

   public void a(fvq $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fvt f() {
      return new fvt(this.a(), this.o);
   }

   static class a implements fvr {
      @Override
      public void a(fvp $$0) {
         $$0.d();
      }

      @Override
      public xd aS_() {
         return fvp.j;
      }

      @Override
      public void a(fjx $$0, float $$1, float $$2) {
         $$0.a(ghq::B, fvp.b, 0, 0, 16, 16, axo.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aT_() {
         return true;
      }
   }

   static class b implements fvr {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fvp $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public xd aS_() {
         return this.a < 0 ? fvp.k : fvp.l;
      }

      @Override
      public void a(fjx $$0, float $$1, float $$2) {
         int $$3 = axo.a($$2, $$1, $$1, $$1);
         if (this.a < 0) {
            $$0.a(ghq::B, fvp.c, 0, 0, 16, 16, $$3);
         } else {
            $$0.a(ghq::B, fvp.d, 0, 0, 16, 16, $$3);
         }
      }

      @Override
      public boolean aT_() {
         return this.b;
      }
   }
}
