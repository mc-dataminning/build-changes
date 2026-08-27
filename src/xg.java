import java.util.UUID;
import java.util.function.Function;

public class xg implements vd<ww> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final UUID d;
   private final xg.c e;
   static final xg.c f = new xg.c() {
      @Override
      public xg.d a() {
         return xg.d.b;
      }

      @Override
      public void a(UUID $$0, xg.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(so $$0) {
      }
   };

   private xg(UUID $$0, xg.c $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public xg(so $$0) {
      this.d = $$0.o();
      xg.d $$1 = $$0.b(xg.d.class);
      this.e = $$1.g.apply($$0);
   }

   public static xg a(bgo $$0) {
      return new xg($$0.i(), new xg.a($$0));
   }

   public static xg a(UUID $$0) {
      return new xg($$0, f);
   }

   public static xg b(bgo $$0) {
      return new xg($$0.i(), new xg.f($$0.k()));
   }

   public static xg c(bgo $$0) {
      return new xg($$0.i(), new xg.e($$0.j()));
   }

   public static xg d(bgo $$0) {
      return new xg($$0.i(), new xg.h($$0.l(), $$0.m()));
   }

   public static xg e(bgo $$0) {
      return new xg($$0.i(), new xg.g($$0.n(), $$0.o(), $$0.p()));
   }

   @Override
   public void a(so $$0) {
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

   public void a(ww $$0) {
      $$0.a(this);
   }

   public void a(xg.b $$0) {
      this.e.a(this.d, $$0);
   }

   static class a implements xg.c {
      private final tl a;
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

      private a(so $$0) {
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
      public xg.d a() {
         return xg.d.a;
      }

      @Override
      public void a(UUID $$0, xg.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(so $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(xg.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, tl $$1, float $$2, bgo.a $$3, bgo.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, tl $$1) {
      }

      default void a(UUID $$0, bgo.a $$1, bgo.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      xg.d a();

      void a(UUID var1, xg.b var2);

      void a(so var1);
   }

   static enum d {
      a(xg.a::new),
      b($$0 -> xg.f),
      c(xg.f::new),
      d(xg.e::new),
      e(xg.h::new),
      f(xg.g::new);

      final Function<so, xg.c> g;

      private d(Function<so, xg.c> $$0) {
         this.g = $$0;
      }
   }

   static class e implements xg.c {
      private final tl a;

      e(tl $$0) {
         this.a = $$0;
      }

      private e(so $$0) {
         this.a = $$0.l();
      }

      @Override
      public xg.d a() {
         return xg.d.d;
      }

      @Override
      public void a(UUID $$0, xg.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(so $$0) {
         $$0.a(this.a);
      }
   }

   static class f implements xg.c {
      private final float a;

      f(float $$0) {
         this.a = $$0;
      }

      private f(so $$0) {
         this.a = $$0.readFloat();
      }

      @Override
      public xg.d a() {
         return xg.d.c;
      }

      @Override
      public void a(UUID $$0, xg.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(so $$0) {
         $$0.a(this.a);
      }
   }

   static class g implements xg.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(so $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public xg.d a() {
         return xg.d.f;
      }

      @Override
      public void a(UUID $$0, xg.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(so $$0) {
         $$0.k(xg.a(this.a, this.b, this.c));
      }
   }

   static class h implements xg.c {
      private final bgo.a a;
      private final bgo.b b;

      h(bgo.a $$0, bgo.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(so $$0) {
         this.a = $$0.b(bgo.a.class);
         this.b = $$0.b(bgo.b.class);
      }

      @Override
      public xg.d a() {
         return xg.d.e;
      }

      @Override
      public void a(UUID $$0, xg.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(so $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
