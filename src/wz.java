import java.util.UUID;
import java.util.function.Function;

public class wz implements uw<wo> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final UUID d;
   private final wz.c e;
   static final wz.c f = new wz.c() {
      @Override
      public wz.d a() {
         return wz.d.b;
      }

      @Override
      public void a(UUID $$0, wz.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(sh $$0) {
      }
   };

   private wz(UUID $$0, wz.c $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public wz(sh $$0) {
      this.d = $$0.o();
      wz.d $$1 = $$0.b(wz.d.class);
      this.e = $$1.g.apply($$0);
   }

   public static wz a(bge $$0) {
      return new wz($$0.i(), new wz.a($$0));
   }

   public static wz a(UUID $$0) {
      return new wz($$0, f);
   }

   public static wz b(bge $$0) {
      return new wz($$0.i(), new wz.f($$0.k()));
   }

   public static wz c(bge $$0) {
      return new wz($$0.i(), new wz.e($$0.j()));
   }

   public static wz d(bge $$0) {
      return new wz($$0.i(), new wz.h($$0.l(), $$0.m()));
   }

   public static wz e(bge $$0) {
      return new wz($$0.i(), new wz.g($$0.n(), $$0.o(), $$0.p()));
   }

   @Override
   public void a(sh $$0) {
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

   public void a(wo $$0) {
      $$0.a(this);
   }

   public void a(wz.b $$0) {
      this.e.a(this.d, $$0);
   }

   static class a implements wz.c {
      private final te a;
      private final float b;
      private final bge.a c;
      private final bge.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bge $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(sh $$0) {
         this.a = $$0.l();
         this.b = $$0.readFloat();
         this.c = $$0.b(bge.a.class);
         this.d = $$0.b(bge.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public wz.d a() {
         return wz.d.a;
      }

      @Override
      public void a(UUID $$0, wz.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(sh $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(wz.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, te $$1, float $$2, bge.a $$3, bge.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, te $$1) {
      }

      default void a(UUID $$0, bge.a $$1, bge.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      wz.d a();

      void a(UUID var1, wz.b var2);

      void a(sh var1);
   }

   static enum d {
      a(wz.a::new),
      b($$0 -> wz.f),
      c(wz.f::new),
      d(wz.e::new),
      e(wz.h::new),
      f(wz.g::new);

      final Function<sh, wz.c> g;

      private d(Function<sh, wz.c> $$0) {
         this.g = $$0;
      }
   }

   static class e implements wz.c {
      private final te a;

      e(te $$0) {
         this.a = $$0;
      }

      private e(sh $$0) {
         this.a = $$0.l();
      }

      @Override
      public wz.d a() {
         return wz.d.d;
      }

      @Override
      public void a(UUID $$0, wz.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(sh $$0) {
         $$0.a(this.a);
      }
   }

   static class f implements wz.c {
      private final float a;

      f(float $$0) {
         this.a = $$0;
      }

      private f(sh $$0) {
         this.a = $$0.readFloat();
      }

      @Override
      public wz.d a() {
         return wz.d.c;
      }

      @Override
      public void a(UUID $$0, wz.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(sh $$0) {
         $$0.a(this.a);
      }
   }

   static class g implements wz.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(sh $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public wz.d a() {
         return wz.d.f;
      }

      @Override
      public void a(UUID $$0, wz.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(sh $$0) {
         $$0.k(wz.a(this.a, this.b, this.c));
      }
   }

   static class h implements wz.c {
      private final bge.a a;
      private final bge.b b;

      h(bge.a $$0, bge.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(sh $$0) {
         this.a = $$0.b(bge.a.class);
         this.b = $$0.b(bge.b.class);
      }

      @Override
      public wz.d a() {
         return wz.d.e;
      }

      @Override
      public void a(UUID $$0, wz.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(sh $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
