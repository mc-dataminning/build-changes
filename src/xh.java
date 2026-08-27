import java.util.UUID;
import java.util.function.Function;

public class xh implements ve<wx> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final UUID d;
   private final xh.c e;
   static final xh.c f = new xh.c() {
      @Override
      public xh.d a() {
         return xh.d.b;
      }

      @Override
      public void a(UUID $$0, xh.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(sp $$0) {
      }
   };

   private xh(UUID $$0, xh.c $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public xh(sp $$0) {
      this.d = $$0.o();
      xh.d $$1 = $$0.b(xh.d.class);
      this.e = $$1.g.apply($$0);
   }

   public static xh a(bgo $$0) {
      return new xh($$0.i(), new xh.a($$0));
   }

   public static xh a(UUID $$0) {
      return new xh($$0, f);
   }

   public static xh b(bgo $$0) {
      return new xh($$0.i(), new xh.f($$0.k()));
   }

   public static xh c(bgo $$0) {
      return new xh($$0.i(), new xh.e($$0.j()));
   }

   public static xh d(bgo $$0) {
      return new xh($$0.i(), new xh.h($$0.l(), $$0.m()));
   }

   public static xh e(bgo $$0) {
      return new xh($$0.i(), new xh.g($$0.n(), $$0.o(), $$0.p()));
   }

   @Override
   public void a(sp $$0) {
      $$0.a(this.d);
      $$0.a(this.e.a());
      this.e.a($$0);
   }

   static int a(boolean $$0, boolean $$1, boolean $$2) {
      int $$3 = 0;
      if ($$0) {
         $$3 |= 1;
      }

      if ($$1) {
         $$3 |= 2;
      }

      if ($$2) {
         $$3 |= 4;
      }

      return $$3;
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public void a(xh.b $$0) {
      this.e.a(this.d, $$0);
   }

   static class a implements xh.c {
      private final tm a;
      private final float b;
      private final bgo.a c;
      private final bgo.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bgo $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(sp $$0) {
         this.a = $$0.l();
         this.b = $$0.readFloat();
         this.c = $$0.b(bgo.a.class);
         this.d = $$0.b(bgo.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public xh.d a() {
         return xh.d.a;
      }

      @Override
      public void a(UUID $$0, xh.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(sp $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(xh.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, tm $$1, float $$2, bgo.a $$3, bgo.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, tm $$1) {
      }

      default void a(UUID $$0, bgo.a $$1, bgo.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      xh.d a();

      void a(UUID var1, xh.b var2);

      void a(sp var1);
   }

   static enum d {
      a(xh.a::new),
      b($$0 -> xh.f),
      c(xh.f::new),
      d(xh.e::new),
      e(xh.h::new),
      f(xh.g::new);

      final Function<sp, xh.c> g;

      private d(Function<sp, xh.c> $$0) {
         this.g = $$0;
      }
   }

   static class e implements xh.c {
      private final tm a;

      e(tm $$0) {
         this.a = $$0;
      }

      private e(sp $$0) {
         this.a = $$0.l();
      }

      @Override
      public xh.d a() {
         return xh.d.d;
      }

      @Override
      public void a(UUID $$0, xh.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(sp $$0) {
         $$0.a(this.a);
      }
   }

   static class f implements xh.c {
      private final float a;

      f(float $$0) {
         this.a = $$0;
      }

      private f(sp $$0) {
         this.a = $$0.readFloat();
      }

      @Override
      public xh.d a() {
         return xh.d.c;
      }

      @Override
      public void a(UUID $$0, xh.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(sp $$0) {
         $$0.a(this.a);
      }
   }

   static class g implements xh.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(sp $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public xh.d a() {
         return xh.d.f;
      }

      @Override
      public void a(UUID $$0, xh.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(sp $$0) {
         $$0.k(xh.a(this.a, this.b, this.c));
      }
   }

   static class h implements xh.c {
      private final bgo.a a;
      private final bgo.b b;

      h(bgo.a $$0, bgo.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(sp $$0) {
         this.a = $$0.b(bgo.a.class);
         this.b = $$0.b(bgo.b.class);
      }

      @Override
      public xh.d a() {
         return xh.d.e;
      }

      @Override
      public void a(UUID $$0, xh.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(sp $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
