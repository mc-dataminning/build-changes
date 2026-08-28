import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class gfj {
   static final alr b = alr.b("spectator/close");
   static final alr c = alr.b("spectator/scroll_left");
   static final alr d = alr.b("spectator/scroll_right");
   private static final gfl e = new gfj.a();
   private static final gfl f = new gfj.b(-1, true);
   private static final gfl g = new gfj.b(1, true);
   private static final gfl h = new gfj.b(1, false);
   private static final int i = 8;
   static final xg j = xg.c("spectatorMenu.close");
   static final xg k = xg.c("spectatorMenu.previous_page");
   static final xg l = xg.c("spectatorMenu.next_page");
   public static final gfl a = new gfl() {
      @Override
      public void a(gfj $$0) {
      }

      @Override
      public xg aU_() {
         return xf.a;
      }

      @Override
      public void a(ftk $$0, float $$1, float $$2) {
      }

      @Override
      public boolean aV_() {
         return false;
      }
   };
   private final gfm m;
   private gfk n;
   private int o = -1;
   int p;

   public gfj(gfm $$0) {
      this.n = new gfi();
      this.m = $$0;
   }

   public gfl a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (gfl)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<gfl> a() {
      List<gfl> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public gfl b() {
      return this.a(this.o);
   }

   public gfk c() {
      return this.n;
   }

   public void b(int $$0) {
      gfl $$1 = this.a($$0);
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

   public void a(gfk $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public gfn f() {
      return new gfn(this.a(), this.o);
   }

   static class a implements gfl {
      @Override
      public void a(gfj $$0) {
         $$0.d();
      }

      @Override
      public xg aU_() {
         return gfj.j;
      }

      @Override
      public void a(ftk $$0, float $$1, float $$2) {
         $$0.a(gry::H, gfj.b, 0, 0, 16, 16, ayh.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aV_() {
         return true;
      }
   }

   static class b implements gfl {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(gfj $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public xg aU_() {
         return this.a < 0 ? gfj.k : gfj.l;
      }

      @Override
      public void a(ftk $$0, float $$1, float $$2) {
         int $$3 = ayh.a($$2, $$1, $$1, $$1);
         if (this.a < 0) {
            $$0.a(gry::H, gfj.c, 0, 0, 16, 16, $$3);
         } else {
            $$0.a(gry::H, gfj.d, 0, 0, 16, 16, $$3);
         }
      }

      @Override
      public boolean aV_() {
         return this.b;
      }
   }
}
