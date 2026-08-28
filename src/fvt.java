import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fvt {
   static final ale b = ale.b("spectator/close");
   static final ale c = ale.b("spectator/scroll_left");
   static final ale d = ale.b("spectator/scroll_right");
   private static final fvv e = new fvt.a();
   private static final fvv f = new fvt.b(-1, true);
   private static final fvv g = new fvt.b(1, true);
   private static final fvv h = new fvt.b(1, false);
   private static final int i = 8;
   static final xe j = xe.c("spectatorMenu.close");
   static final xe k = xe.c("spectatorMenu.previous_page");
   static final xe l = xe.c("spectatorMenu.next_page");
   public static final fvv a = new fvv() {
      @Override
      public void a(fvt $$0) {
      }

      @Override
      public xe aT_() {
         return xd.a;
      }

      @Override
      public void a(fkb $$0, float $$1, float $$2) {
      }

      @Override
      public boolean aU_() {
         return false;
      }
   };
   private final fvw m;
   private fvu n;
   private int o = -1;
   int p;

   public fvt(fvw $$0) {
      this.n = new fvs();
      this.m = $$0;
   }

   public fvv a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fvv)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fvv> a() {
      List<fvv> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fvv b() {
      return this.a(this.o);
   }

   public fvu c() {
      return this.n;
   }

   public void b(int $$0) {
      fvv $$1 = this.a($$0);
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

   public void a(fvu $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fvx f() {
      return new fvx(this.a(), this.o);
   }

   static class a implements fvv {
      @Override
      public void a(fvt $$0) {
         $$0.d();
      }

      @Override
      public xe aT_() {
         return fvt.j;
      }

      @Override
      public void a(fkb $$0, float $$1, float $$2) {
         $$0.a(ghv::B, fvt.b, 0, 0, 16, 16, axq.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aU_() {
         return true;
      }
   }

   static class b implements fvv {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fvt $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public xe aT_() {
         return this.a < 0 ? fvt.k : fvt.l;
      }

      @Override
      public void a(fkb $$0, float $$1, float $$2) {
         int $$3 = axq.a($$2, $$1, $$1, $$1);
         if (this.a < 0) {
            $$0.a(ghv::B, fvt.c, 0, 0, 16, 16, $$3);
         } else {
            $$0.a(ghv::B, fvt.d, 0, 0, 16, 16, $$3);
         }
      }

      @Override
      public boolean aU_() {
         return this.b;
      }
   }
}
