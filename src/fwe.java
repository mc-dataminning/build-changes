import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fwe {
   static final alh b = alh.b("spectator/close");
   static final alh c = alh.b("spectator/scroll_left");
   static final alh d = alh.b("spectator/scroll_right");
   private static final fwg e = new fwe.a();
   private static final fwg f = new fwe.b(-1, true);
   private static final fwg g = new fwe.b(1, true);
   private static final fwg h = new fwe.b(1, false);
   private static final int i = 8;
   static final xh j = xh.c("spectatorMenu.close");
   static final xh k = xh.c("spectatorMenu.previous_page");
   static final xh l = xh.c("spectatorMenu.next_page");
   public static final fwg a = new fwg() {
      @Override
      public void a(fwe $$0) {
      }

      @Override
      public xh aT_() {
         return xg.a;
      }

      @Override
      public void a(fkm $$0, float $$1, float $$2) {
      }

      @Override
      public boolean aU_() {
         return false;
      }
   };
   private final fwh m;
   private fwf n;
   private int o = -1;
   int p;

   public fwe(fwh $$0) {
      this.n = new fwd();
      this.m = $$0;
   }

   public fwg a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fwg)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fwg> a() {
      List<fwg> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fwg b() {
      return this.a(this.o);
   }

   public fwf c() {
      return this.n;
   }

   public void b(int $$0) {
      fwg $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aU_()) {
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

   public void a(fwf $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fwi f() {
      return new fwi(this.a(), this.o);
   }

   static class a implements fwg {
      @Override
      public void a(fwe $$0) {
         $$0.d();
      }

      @Override
      public xh aT_() {
         return fwe.j;
      }

      @Override
      public void a(fkm $$0, float $$1, float $$2) {
         $$0.a(gig::B, fwe.b, 0, 0, 16, 16, axu.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aU_() {
         return true;
      }
   }

   static class b implements fwg {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fwe $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public xh aT_() {
         return this.a < 0 ? fwe.k : fwe.l;
      }

      @Override
      public void a(fkm $$0, float $$1, float $$2) {
         int $$3 = axu.a($$2, $$1, $$1, $$1);
         if (this.a < 0) {
            $$0.a(gig::B, fwe.c, 0, 0, 16, 16, $$3);
         } else {
            $$0.a(gig::B, fwe.d, 0, 0, 16, 16, $$3);
         }
      }

      @Override
      public boolean aU_() {
         return this.b;
      }
   }
}
