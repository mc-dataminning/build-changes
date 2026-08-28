import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fxf {
   static final all b = all.b("spectator/close");
   static final all c = all.b("spectator/scroll_left");
   static final all d = all.b("spectator/scroll_right");
   private static final fxh e = new fxf.a();
   private static final fxh f = new fxf.b(-1, true);
   private static final fxh g = new fxf.b(1, true);
   private static final fxh h = new fxf.b(1, false);
   private static final int i = 8;
   static final xl j = xl.c("spectatorMenu.close");
   static final xl k = xl.c("spectatorMenu.previous_page");
   static final xl l = xl.c("spectatorMenu.next_page");
   public static final fxh a = new fxh() {
      @Override
      public void a(fxf $$0) {
      }

      @Override
      public xl aT_() {
         return xk.a;
      }

      @Override
      public void a(flj $$0, float $$1, float $$2) {
      }

      @Override
      public boolean aU_() {
         return false;
      }
   };
   private final fxi m;
   private fxg n;
   private int o = -1;
   int p;

   public fxf(fxi $$0) {
      this.n = new fxe();
      this.m = $$0;
   }

   public fxh a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fxh)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fxh> a() {
      List<fxh> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fxh b() {
      return this.a(this.o);
   }

   public fxg c() {
      return this.n;
   }

   public void b(int $$0) {
      fxh $$1 = this.a($$0);
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

   public void a(fxg $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fxj f() {
      return new fxj(this.a(), this.o);
   }

   static class a implements fxh {
      @Override
      public void a(fxf $$0) {
         $$0.d();
      }

      @Override
      public xl aT_() {
         return fxf.j;
      }

      @Override
      public void a(flj $$0, float $$1, float $$2) {
         $$0.a(gjh::B, fxf.b, 0, 0, 16, 16, axy.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aU_() {
         return true;
      }
   }

   static class b implements fxh {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fxf $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public xl aT_() {
         return this.a < 0 ? fxf.k : fxf.l;
      }

      @Override
      public void a(flj $$0, float $$1, float $$2) {
         int $$3 = axy.a($$2, $$1, $$1, $$1);
         if (this.a < 0) {
            $$0.a(gjh::B, fxf.c, 0, 0, 16, 16, $$3);
         } else {
            $$0.a(gjh::B, fxf.d, 0, 0, 16, 16, $$3);
         }
      }

      @Override
      public boolean aU_() {
         return this.b;
      }
   }
}
