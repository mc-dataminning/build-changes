import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fwp {
   static final ali b = ali.b("spectator/close");
   static final ali c = ali.b("spectator/scroll_left");
   static final ali d = ali.b("spectator/scroll_right");
   private static final fwr e = new fwp.a();
   private static final fwr f = new fwp.b(-1, true);
   private static final fwr g = new fwp.b(1, true);
   private static final fwr h = new fwp.b(1, false);
   private static final int i = 8;
   static final xi j = xi.c("spectatorMenu.close");
   static final xi k = xi.c("spectatorMenu.previous_page");
   static final xi l = xi.c("spectatorMenu.next_page");
   public static final fwr a = new fwr() {
      @Override
      public void a(fwp $$0) {
      }

      @Override
      public xi aS_() {
         return xh.a;
      }

      @Override
      public void a(fku $$0, float $$1, float $$2) {
      }

      @Override
      public boolean aT_() {
         return false;
      }
   };
   private final fws m;
   private fwq n;
   private int o = -1;
   int p;

   public fwp(fws $$0) {
      this.n = new fwo();
      this.m = $$0;
   }

   public fwr a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fwr)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fwr> a() {
      List<fwr> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fwr b() {
      return this.a(this.o);
   }

   public fwq c() {
      return this.n;
   }

   public void b(int $$0) {
      fwr $$1 = this.a($$0);
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

   public void a(fwq $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fwt f() {
      return new fwt(this.a(), this.o);
   }

   static class a implements fwr {
      @Override
      public void a(fwp $$0) {
         $$0.d();
      }

      @Override
      public xi aS_() {
         return fwp.j;
      }

      @Override
      public void a(fku $$0, float $$1, float $$2) {
         $$0.a(gir::B, fwp.b, 0, 0, 16, 16, axv.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aT_() {
         return true;
      }
   }

   static class b implements fwr {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fwp $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public xi aS_() {
         return this.a < 0 ? fwp.k : fwp.l;
      }

      @Override
      public void a(fku $$0, float $$1, float $$2) {
         int $$3 = axv.a($$2, $$1, $$1, $$1);
         if (this.a < 0) {
            $$0.a(gir::B, fwp.c, 0, 0, 16, 16, $$3);
         } else {
            $$0.a(gir::B, fwp.d, 0, 0, 16, 16, $$3);
         }
      }

      @Override
      public boolean aT_() {
         return this.b;
      }
   }
}
