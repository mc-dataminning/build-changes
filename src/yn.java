import java.util.UUID;
import java.util.function.Function;

public class yn implements wk<yd> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final UUID d;
   private final yn.c e;
   static final yn.c f = new yn.c() {
      @Override
      public yn.d a() {
         return yn.d.b;
      }

      @Override
      public void a(UUID $$0, yn.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(tu $$0) {
      }
   };

   private yn(UUID $$0, yn.c $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public yn(tu $$0) {
      this.d = $$0.p();
      yn.d $$1 = $$0.b(yn.d.class);
      this.e = $$1.g.apply($$0);
   }

   public static yn a(big $$0) {
      return new yn($$0.i(), new yn.a($$0));
   }

   public static yn a(UUID $$0) {
      return new yn($$0, f);
   }

   public static yn b(big $$0) {
      return new yn($$0.i(), new yn.f($$0.k()));
   }

   public static yn c(big $$0) {
      return new yn($$0.i(), new yn.e($$0.j()));
   }

   public static yn d(big $$0) {
      return new yn($$0.i(), new yn.h($$0.l(), $$0.m()));
   }

   public static yn e(big $$0) {
      return new yn($$0.i(), new yn.g($$0.n(), $$0.o(), $$0.p()));
   }

   @Override
   public void a(tu $$0) {
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

   public void a(yd $$0) {
      $$0.a(this);
   }

   public void a(yn.b $$0) {
      this.e.a(this.d, $$0);
   }

   static class a implements yn.c {
      private final ur a;
      private final float b;
      private final big.a c;
      private final big.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(big $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(tu $$0) {
         this.a = $$0.m();
         this.b = $$0.readFloat();
         this.c = $$0.b(big.a.class);
         this.d = $$0.b(big.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public yn.d a() {
         return yn.d.a;
      }

      @Override
      public void a(UUID $$0, yn.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(tu $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(yn.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, ur $$1, float $$2, big.a $$3, big.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, ur $$1) {
      }

      default void a(UUID $$0, big.a $$1, big.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      yn.d a();

      void a(UUID var1, yn.b var2);

      void a(tu var1);
   }

   static enum d {
      a(yn.a::new),
      b($$0 -> yn.f),
      c(yn.f::new),
      d(yn.e::new),
      e(yn.h::new),
      f(yn.g::new);

      final Function<tu, yn.c> g;

      private d(Function<tu, yn.c> $$0) {
         this.g = $$0;
      }
   }

   static class e implements yn.c {
      private final ur a;

      e(ur $$0) {
         this.a = $$0;
      }

      private e(tu $$0) {
         this.a = $$0.m();
      }

      @Override
      public yn.d a() {
         return yn.d.d;
      }

      @Override
      public void a(UUID $$0, yn.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(tu $$0) {
         $$0.a(this.a);
      }
   }

   static class f implements yn.c {
      private final float a;

      f(float $$0) {
         this.a = $$0;
      }

      private f(tu $$0) {
         this.a = $$0.readFloat();
      }

      @Override
      public yn.d a() {
         return yn.d.c;
      }

      @Override
      public void a(UUID $$0, yn.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(tu $$0) {
         $$0.a(this.a);
      }
   }

   static class g implements yn.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(tu $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public yn.d a() {
         return yn.d.f;
      }

      @Override
      public void a(UUID $$0, yn.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(tu $$0) {
         $$0.k(yn.a(this.a, this.b, this.c));
      }
   }

   static class h implements yn.c {
      private final big.a a;
      private final big.b b;

      h(big.a $$0, big.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(tu $$0) {
         this.a = $$0.b(big.a.class);
         this.b = $$0.b(big.b.class);
      }

      @Override
      public yn.d a() {
         return yn.d.e;
      }

      @Override
      public void a(UUID $$0, yn.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(tu $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
