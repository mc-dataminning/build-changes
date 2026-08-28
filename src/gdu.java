import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class gdu {
   static final alg b = alg.b("spectator/close");
   static final alg c = alg.b("spectator/scroll_left");
   static final alg d = alg.b("spectator/scroll_right");
   private static final gdw e = new gdu.a();
   private static final gdw f = new gdu.b(-1, true);
   private static final gdw g = new gdu.b(1, true);
   private static final gdw h = new gdu.b(1, false);
   private static final int i = 8;
   static final wy j = wy.c("spectatorMenu.close");
   static final wy k = wy.c("spectatorMenu.previous_page");
   static final wy l = wy.c("spectatorMenu.next_page");
   public static final gdw a = new gdw() {
      @Override
      public void a(gdu $$0) {
      }

      @Override
      public wy aP_() {
         return wx.a;
      }

      @Override
      public void a(frv $$0, float $$1, float $$2) {
      }

      @Override
      public boolean aQ_() {
         return false;
      }
   };
   private final gdx m;
   private gdv n;
   private int o = -1;
   int p;

   public gdu(gdx $$0) {
      this.n = new gdt();
      this.m = $$0;
   }

   public gdw a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (gdw)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<gdw> a() {
      List<gdw> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public gdw b() {
      return this.a(this.o);
   }

   public gdv c() {
      return this.n;
   }

   public void b(int $$0) {
      gdw $$1 = this.a($$0);
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

   public void a(gdv $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public gdy f() {
      return new gdy(this.a(), this.o);
   }

   static class a implements gdw {
      @Override
      public void a(gdu $$0) {
         $$0.d();
      }

      @Override
      public wy aP_() {
         return gdu.j;
      }

      @Override
      public void a(frv $$0, float $$1, float $$2) {
         $$0.a(gqk::H, gdu.b, 0, 0, 16, 16, axw.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aQ_() {
         return true;
      }
   }

   static class b implements gdw {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(gdu $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public wy aP_() {
         return this.a < 0 ? gdu.k : gdu.l;
      }

      @Override
      public void a(frv $$0, float $$1, float $$2) {
         int $$3 = axw.a($$2, $$1, $$1, $$1);
         if (this.a < 0) {
            $$0.a(gqk::H, gdu.c, 0, 0, 16, 16, $$3);
         } else {
            $$0.a(gqk::H, gdu.d, 0, 0, 16, 16, $$3);
         }
      }

      @Override
      public boolean aQ_() {
         return this.b;
      }
   }
}
