import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class geg {
   static final alg b = alg.b("spectator/close");
   static final alg c = alg.b("spectator/scroll_left");
   static final alg d = alg.b("spectator/scroll_right");
   private static final gei e = new geg.a();
   private static final gei f = new geg.b(-1, true);
   private static final gei g = new geg.b(1, true);
   private static final gei h = new geg.b(1, false);
   private static final int i = 8;
   static final wy j = wy.c("spectatorMenu.close");
   static final wy k = wy.c("spectatorMenu.previous_page");
   static final wy l = wy.c("spectatorMenu.next_page");
   public static final gei a = new gei() {
      @Override
      public void a(geg $$0) {
      }

      @Override
      public wy aP_() {
         return wx.a;
      }

      @Override
      public void a(fsh $$0, float $$1, float $$2) {
      }

      @Override
      public boolean aQ_() {
         return false;
      }
   };
   private final gej m;
   private geh n;
   private int o = -1;
   int p;

   public geg(gej $$0) {
      this.n = new gef();
      this.m = $$0;
   }

   public gei a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (gei)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<gei> a() {
      List<gei> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public gei b() {
      return this.a(this.o);
   }

   public geh c() {
      return this.n;
   }

   public void b(int $$0) {
      gei $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aQ_()) {
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

   public void a(geh $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public gek f() {
      return new gek(this.a(), this.o);
   }

   static class a implements gei {
      @Override
      public void a(geg $$0) {
         $$0.d();
      }

      @Override
      public wy aP_() {
         return geg.j;
      }

      @Override
      public void a(fsh $$0, float $$1, float $$2) {
         $$0.a(gqx::H, geg.b, 0, 0, 16, 16, axw.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aQ_() {
         return true;
      }
   }

   static class b implements gei {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(geg $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public wy aP_() {
         return this.a < 0 ? geg.k : geg.l;
      }

      @Override
      public void a(fsh $$0, float $$1, float $$2) {
         int $$3 = axw.a($$2, $$1, $$1, $$1);
         if (this.a < 0) {
            $$0.a(gqx::H, geg.c, 0, 0, 16, 16, $$3);
         } else {
            $$0.a(gqx::H, geg.d, 0, 0, 16, 16, $$3);
         }
      }

      @Override
      public boolean aQ_() {
         return this.b;
      }
   }
}
