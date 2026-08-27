import java.util.UUID;
import java.util.function.Function;

public class xi implements vf<wy> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final UUID d;
   private final xi.c e;
   static final xi.c f = new xi.c() {
      @Override
      public xi.d a() {
         return xi.d.b;
      }

      @Override
      public void a(UUID $$0, xi.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(sq $$0) {
      }
   };

   private xi(UUID $$0, xi.c $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public xi(sq $$0) {
      this.d = $$0.o();
      xi.d $$1 = $$0.b(xi.d.class);
      this.e = $$1.g.apply($$0);
   }

   public static xi a(bgq $$0) {
      return new xi($$0.i(), new xi.a($$0));
   }

   public static xi a(UUID $$0) {
      return new xi($$0, f);
   }

   public static xi b(bgq $$0) {
      return new xi($$0.i(), new xi.f($$0.k()));
   }

   public static xi c(bgq $$0) {
      return new xi($$0.i(), new xi.e($$0.j()));
   }

   public static xi d(bgq $$0) {
      return new xi($$0.i(), new xi.h($$0.l(), $$0.m()));
   }

   public static xi e(bgq $$0) {
      return new xi($$0.i(), new xi.g($$0.n(), $$0.o(), $$0.p()));
   }

   @Override
   public void a(sq $$0) {
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

   public void a(wy $$0) {
      $$0.a(this);
   }

   public void a(xi.b $$0) {
      this.e.a(this.d, $$0);
   }

   static class a implements xi.c {
      private final tn a;
      private final float b;
      private final bgq.a c;
      private final bgq.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bgq $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(sq $$0) {
         this.a = $$0.l();
         this.b = $$0.readFloat();
         this.c = $$0.b(bgq.a.class);
         this.d = $$0.b(bgq.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public xi.d a() {
         return xi.d.a;
      }

      @Override
      public void a(UUID $$0, xi.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(sq $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(xi.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, tn $$1, float $$2, bgq.a $$3, bgq.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, tn $$1) {
      }

      default void a(UUID $$0, bgq.a $$1, bgq.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      xi.d a();

      void a(UUID var1, xi.b var2);

      void a(sq var1);
   }

   static enum d {
      a(xi.a::new),
      b($$0 -> xi.f),
      c(xi.f::new),
      d(xi.e::new),
      e(xi.h::new),
      f(xi.g::new);

      final Function<sq, xi.c> g;

      private d(Function<sq, xi.c> $$0) {
         this.g = $$0;
      }
   }

   static class e implements xi.c {
      private final tn a;

      e(tn $$0) {
         this.a = $$0;
      }

      private e(sq $$0) {
         this.a = $$0.l();
      }

      @Override
      public xi.d a() {
         return xi.d.d;
      }

      @Override
      public void a(UUID $$0, xi.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(sq $$0) {
         $$0.a(this.a);
      }
   }

   static class f implements xi.c {
      private final float a;

      f(float $$0) {
         this.a = $$0;
      }

      private f(sq $$0) {
         this.a = $$0.readFloat();
      }

      @Override
      public xi.d a() {
         return xi.d.c;
      }

      @Override
      public void a(UUID $$0, xi.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(sq $$0) {
         $$0.a(this.a);
      }
   }

   static class g implements xi.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(sq $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public xi.d a() {
         return xi.d.f;
      }

      @Override
      public void a(UUID $$0, xi.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(sq $$0) {
         $$0.k(xi.a(this.a, this.b, this.c));
      }
   }

   static class h implements xi.c {
      private final bgq.a a;
      private final bgq.b b;

      h(bgq.a $$0, bgq.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(sq $$0) {
         this.a = $$0.b(bgq.a.class);
         this.b = $$0.b(bgq.b.class);
      }

      @Override
      public xi.d a() {
         return xi.d.e;
      }

      @Override
      public void a(UUID $$0, xi.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(sq $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
