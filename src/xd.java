import java.util.UUID;
import java.util.function.Function;

public class xd implements va<ws> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final UUID d;
   private final xd.c e;
   static final xd.c f = new xd.c() {
      @Override
      public xd.d a() {
         return xd.d.b;
      }

      @Override
      public void a(UUID $$0, xd.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(sl $$0) {
      }
   };

   private xd(UUID $$0, xd.c $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public xd(sl $$0) {
      this.d = $$0.o();
      xd.d $$1 = $$0.b(xd.d.class);
      this.e = $$1.g.apply($$0);
   }

   public static xd a(bgj $$0) {
      return new xd($$0.i(), new xd.a($$0));
   }

   public static xd a(UUID $$0) {
      return new xd($$0, f);
   }

   public static xd b(bgj $$0) {
      return new xd($$0.i(), new xd.f($$0.k()));
   }

   public static xd c(bgj $$0) {
      return new xd($$0.i(), new xd.e($$0.j()));
   }

   public static xd d(bgj $$0) {
      return new xd($$0.i(), new xd.h($$0.l(), $$0.m()));
   }

   public static xd e(bgj $$0) {
      return new xd($$0.i(), new xd.g($$0.n(), $$0.o(), $$0.p()));
   }

   @Override
   public void a(sl $$0) {
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

   public void a(ws $$0) {
      $$0.a(this);
   }

   public void a(xd.b $$0) {
      this.e.a(this.d, $$0);
   }

   static class a implements xd.c {
      private final ti a;
      private final float b;
      private final bgj.a c;
      private final bgj.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bgj $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(sl $$0) {
         this.a = $$0.l();
         this.b = $$0.readFloat();
         this.c = $$0.b(bgj.a.class);
         this.d = $$0.b(bgj.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public xd.d a() {
         return xd.d.a;
      }

      @Override
      public void a(UUID $$0, xd.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(sl $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(xd.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, ti $$1, float $$2, bgj.a $$3, bgj.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, ti $$1) {
      }

      default void a(UUID $$0, bgj.a $$1, bgj.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      xd.d a();

      void a(UUID var1, xd.b var2);

      void a(sl var1);
   }

   static enum d {
      a(xd.a::new),
      b($$0 -> xd.f),
      c(xd.f::new),
      d(xd.e::new),
      e(xd.h::new),
      f(xd.g::new);

      final Function<sl, xd.c> g;

      private d(Function<sl, xd.c> $$0) {
         this.g = $$0;
      }
   }

   static class e implements xd.c {
      private final ti a;

      e(ti $$0) {
         this.a = $$0;
      }

      private e(sl $$0) {
         this.a = $$0.l();
      }

      @Override
      public xd.d a() {
         return xd.d.d;
      }

      @Override
      public void a(UUID $$0, xd.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(sl $$0) {
         $$0.a(this.a);
      }
   }

   static class f implements xd.c {
      private final float a;

      f(float $$0) {
         this.a = $$0;
      }

      private f(sl $$0) {
         this.a = $$0.readFloat();
      }

      @Override
      public xd.d a() {
         return xd.d.c;
      }

      @Override
      public void a(UUID $$0, xd.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(sl $$0) {
         $$0.a(this.a);
      }
   }

   static class g implements xd.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(sl $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public xd.d a() {
         return xd.d.f;
      }

      @Override
      public void a(UUID $$0, xd.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(sl $$0) {
         $$0.k(xd.a(this.a, this.b, this.c));
      }
   }

   static class h implements xd.c {
      private final bgj.a a;
      private final bgj.b b;

      h(bgj.a $$0, bgj.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(sl $$0) {
         this.a = $$0.b(bgj.a.class);
         this.b = $$0.b(bgj.b.class);
      }

      @Override
      public xd.d a() {
         return xd.d.e;
      }

      @Override
      public void a(UUID $$0, xd.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(sl $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
