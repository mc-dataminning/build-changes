import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class gdb {
   static final ale b = ale.b("spectator/close");
   static final ale c = ale.b("spectator/scroll_left");
   static final ale d = ale.b("spectator/scroll_right");
   private static final gdd e = new gdb.a();
   private static final gdd f = new gdb.b(-1, true);
   private static final gdd g = new gdb.b(1, true);
   private static final gdd h = new gdb.b(1, false);
   private static final int i = 8;
   static final ww j = ww.c("spectatorMenu.close");
   static final ww k = ww.c("spectatorMenu.previous_page");
   static final ww l = ww.c("spectatorMenu.next_page");
   public static final gdd a = new gdd() {
      @Override
      public void a(gdb $$0) {
      }

      @Override
      public ww aO_() {
         return wv.a;
      }

      @Override
      public void a(frc $$0, float $$1, float $$2) {
      }

      @Override
      public boolean aP_() {
         return false;
      }
   };
   private final gde m;
   private gdc n;
   private int o = -1;
   int p;

   public gdb(gde $$0) {
      this.n = new gda();
      this.m = $$0;
   }

   public gdd a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (gdd)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<gdd> a() {
      List<gdd> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public gdd b() {
      return this.a(this.o);
   }

   public gdc c() {
      return this.n;
   }

   public void b(int $$0) {
      gdd $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aP_()) {
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

   public void a(gdc $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public gdf f() {
      return new gdf(this.a(), this.o);
   }

   static class a implements gdd {
      @Override
      public void a(gdb $$0) {
         $$0.d();
      }

      @Override
      public ww aO_() {
         return gdb.j;
      }

      @Override
      public void a(frc $$0, float $$1, float $$2) {
         $$0.a(gpn::H, gdb.b, 0, 0, 16, 16, axu.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aP_() {
         return true;
      }
   }

   static class b implements gdd {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(gdb $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public ww aO_() {
         return this.a < 0 ? gdb.k : gdb.l;
      }

      @Override
      public void a(frc $$0, float $$1, float $$2) {
         int $$3 = axu.a($$2, $$1, $$1, $$1);
         if (this.a < 0) {
            $$0.a(gpn::H, gdb.c, 0, 0, 16, 16, $$3);
         } else {
            $$0.a(gpn::H, gdb.d, 0, 0, 16, 16, $$3);
         }
      }

      @Override
      public boolean aP_() {
         return this.b;
      }
   }
}
