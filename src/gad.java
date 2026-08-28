import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class gad {
   static final akv b = akv.b("spectator/close");
   static final akv c = akv.b("spectator/scroll_left");
   static final akv d = akv.b("spectator/scroll_right");
   private static final gaf e = new gad.a();
   private static final gaf f = new gad.b(-1, true);
   private static final gaf g = new gad.b(1, true);
   private static final gaf h = new gad.b(1, false);
   private static final int i = 8;
   static final wp j = wp.c("spectatorMenu.close");
   static final wp k = wp.c("spectatorMenu.previous_page");
   static final wp l = wp.c("spectatorMenu.next_page");
   public static final gaf a = new gaf() {
      @Override
      public void a(gad $$0) {
      }

      @Override
      public wp aS_() {
         return wo.a;
      }

      @Override
      public void a(fof $$0, float $$1, float $$2) {
      }

      @Override
      public boolean aT_() {
         return false;
      }
   };
   private final gag m;
   private gae n;
   private int o = -1;
   int p;

   public gad(gag $$0) {
      this.n = new gac();
      this.m = $$0;
   }

   public gaf a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (gaf)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<gaf> a() {
      List<gaf> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public gaf b() {
      return this.a(this.o);
   }

   public gae c() {
      return this.n;
   }

   public void b(int $$0) {
      gaf $$1 = this.a($$0);
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

   public void a(gae $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public gah f() {
      return new gah(this.a(), this.o);
   }

   static class a implements gaf {
      @Override
      public void a(gad $$0) {
         $$0.d();
      }

      @Override
      public wp aS_() {
         return gad.j;
      }

      @Override
      public void a(fof $$0, float $$1, float $$2) {
         $$0.a(gmj::H, gad.b, 0, 0, 16, 16, axk.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aT_() {
         return true;
      }
   }

   static class b implements gaf {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(gad $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public wp aS_() {
         return this.a < 0 ? gad.k : gad.l;
      }

      @Override
      public void a(fof $$0, float $$1, float $$2) {
         int $$3 = axk.a($$2, $$1, $$1, $$1);
         if (this.a < 0) {
            $$0.a(gmj::H, gad.c, 0, 0, 16, 16, $$3);
         } else {
            $$0.a(gmj::H, gad.d, 0, 0, 16, 16, $$3);
         }
      }

      @Override
      public boolean aT_() {
         return this.b;
      }
   }
}
