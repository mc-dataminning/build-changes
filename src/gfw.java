import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class gfw {
   static final ali b = ali.b("spectator/close");
   static final ali c = ali.b("spectator/scroll_left");
   static final ali d = ali.b("spectator/scroll_right");
   private static final gfy e = new gfw.a();
   private static final gfy f = new gfw.b(-1, true);
   private static final gfy g = new gfw.b(1, true);
   private static final gfy h = new gfw.b(1, false);
   private static final int i = 8;
   static final xa j = xa.c("spectatorMenu.close");
   static final xa k = xa.c("spectatorMenu.previous_page");
   static final xa l = xa.c("spectatorMenu.next_page");
   public static final gfy a = new gfy() {
      @Override
      public void a(gfw $$0) {
      }

      @Override
      public xa aT_() {
         return wz.a;
      }

      @Override
      public void a(ftx $$0, float $$1, float $$2) {
      }

      @Override
      public boolean aU_() {
         return false;
      }
   };
   private final gfz m;
   private gfx n;
   private int o = -1;
   int p;

   public gfw(gfz $$0) {
      this.n = new gfv();
      this.m = $$0;
   }

   public gfy a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (gfy)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<gfy> a() {
      List<gfy> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public gfy b() {
      return this.a(this.o);
   }

   public gfx c() {
      return this.n;
   }

   public void b(int $$0) {
      gfy $$1 = this.a($$0);
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

   public void a(gfx $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public gga f() {
      return new gga(this.a(), this.o);
   }

   static class a implements gfy {
      @Override
      public void a(gfw $$0) {
         $$0.d();
      }

      @Override
      public xa aT_() {
         return gfw.j;
      }

      @Override
      public void a(ftx $$0, float $$1, float $$2) {
         $$0.a(gsl::H, gfw.b, 0, 0, 16, 16, axy.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aU_() {
         return true;
      }
   }

   static class b implements gfy {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(gfw $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public xa aT_() {
         return this.a < 0 ? gfw.k : gfw.l;
      }

      @Override
      public void a(ftx $$0, float $$1, float $$2) {
         int $$3 = axy.a($$2, $$1, $$1, $$1);
         if (this.a < 0) {
            $$0.a(gsl::H, gfw.c, 0, 0, 16, 16, $$3);
         } else {
            $$0.a(gsl::H, gfw.d, 0, 0, 16, 16, $$3);
         }
      }

      @Override
      public boolean aU_() {
         return this.b;
      }
   }
}
