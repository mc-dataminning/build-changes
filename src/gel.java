import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class gel {
   static final alg b = alg.b("spectator/close");
   static final alg c = alg.b("spectator/scroll_left");
   static final alg d = alg.b("spectator/scroll_right");
   private static final gen e = new gel.a();
   private static final gen f = new gel.b(-1, true);
   private static final gen g = new gel.b(1, true);
   private static final gen h = new gel.b(1, false);
   private static final int i = 8;
   static final wy j = wy.c("spectatorMenu.close");
   static final wy k = wy.c("spectatorMenu.previous_page");
   static final wy l = wy.c("spectatorMenu.next_page");
   public static final gen a = new gen() {
      @Override
      public void a(gel $$0) {
      }

      @Override
      public wy aP_() {
         return wx.a;
      }

      @Override
      public void a(fsm $$0, float $$1, float $$2) {
      }

      @Override
      public boolean aQ_() {
         return false;
      }
   };
   private final geo m;
   private gem n;
   private int o = -1;
   int p;

   public gel(geo $$0) {
      this.n = new gek();
      this.m = $$0;
   }

   public gen a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (gen)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<gen> a() {
      List<gen> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public gen b() {
      return this.a(this.o);
   }

   public gem c() {
      return this.n;
   }

   public void b(int $$0) {
      gen $$1 = this.a($$0);
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

   public void a(gem $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public gep f() {
      return new gep(this.a(), this.o);
   }

   static class a implements gen {
      @Override
      public void a(gel $$0) {
         $$0.d();
      }

      @Override
      public wy aP_() {
         return gel.j;
      }

      @Override
      public void a(fsm $$0, float $$1, float $$2) {
         $$0.a(grc::H, gel.b, 0, 0, 16, 16, axw.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aQ_() {
         return true;
      }
   }

   static class b implements gen {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(gel $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public wy aP_() {
         return this.a < 0 ? gel.k : gel.l;
      }

      @Override
      public void a(fsm $$0, float $$1, float $$2) {
         int $$3 = axw.a($$2, $$1, $$1, $$1);
         if (this.a < 0) {
            $$0.a(grc::H, gel.c, 0, 0, 16, 16, $$3);
         } else {
            $$0.a(grc::H, gel.d, 0, 0, 16, 16, $$3);
         }
      }

      @Override
      public boolean aQ_() {
         return this.b;
      }
   }
}
