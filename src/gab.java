import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class gab {
   static final aku b = aku.b("spectator/close");
   static final aku c = aku.b("spectator/scroll_left");
   static final aku d = aku.b("spectator/scroll_right");
   private static final gad e = new gab.a();
   private static final gad f = new gab.b(-1, true);
   private static final gad g = new gab.b(1, true);
   private static final gad h = new gab.b(1, false);
   private static final int i = 8;
   static final wo j = wo.c("spectatorMenu.close");
   static final wo k = wo.c("spectatorMenu.previous_page");
   static final wo l = wo.c("spectatorMenu.next_page");
   public static final gad a = new gad() {
      @Override
      public void a(gab $$0) {
      }

      @Override
      public wo aS_() {
         return wn.a;
      }

      @Override
      public void a(fod $$0, float $$1, float $$2) {
      }

      @Override
      public boolean aT_() {
         return false;
      }
   };
   private final gae m;
   private gac n;
   private int o = -1;
   int p;

   public gab(gae $$0) {
      this.n = new gaa();
      this.m = $$0;
   }

   public gad a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (gad)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<gad> a() {
      List<gad> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public gad b() {
      return this.a(this.o);
   }

   public gac c() {
      return this.n;
   }

   public void b(int $$0) {
      gad $$1 = this.a($$0);
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

   public void a(gac $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public gaf f() {
      return new gaf(this.a(), this.o);
   }

   static class a implements gad {
      @Override
      public void a(gab $$0) {
         $$0.d();
      }

      @Override
      public wo aS_() {
         return gab.j;
      }

      @Override
      public void a(fod $$0, float $$1, float $$2) {
         $$0.a(gmh::H, gab.b, 0, 0, 16, 16, axk.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aT_() {
         return true;
      }
   }

   static class b implements gad {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(gab $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public wo aS_() {
         return this.a < 0 ? gab.k : gab.l;
      }

      @Override
      public void a(fod $$0, float $$1, float $$2) {
         int $$3 = axk.a($$2, $$1, $$1, $$1);
         if (this.a < 0) {
            $$0.a(gmh::H, gab.c, 0, 0, 16, 16, $$3);
         } else {
            $$0.a(gmh::H, gab.d, 0, 0, 16, 16, $$3);
         }
      }

      @Override
      public boolean aT_() {
         return this.b;
      }
   }
}
