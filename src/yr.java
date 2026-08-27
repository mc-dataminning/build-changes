import java.util.UUID;
import java.util.function.Function;

public class yr implements wo<yh> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final UUID d;
   private final yr.c e;
   static final yr.c f = new yr.c() {
      @Override
      public yr.d a() {
         return yr.d.b;
      }

      @Override
      public void a(UUID $$0, yr.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(ty $$0) {
      }
   };

   private yr(UUID $$0, yr.c $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public yr(ty $$0) {
      this.d = $$0.p();
      yr.d $$1 = $$0.b(yr.d.class);
      this.e = $$1.g.apply($$0);
   }

   public static yr a(bir $$0) {
      return new yr($$0.i(), new yr.a($$0));
   }

   public static yr a(UUID $$0) {
      return new yr($$0, f);
   }

   public static yr b(bir $$0) {
      return new yr($$0.i(), new yr.f($$0.k()));
   }

   public static yr c(bir $$0) {
      return new yr($$0.i(), new yr.e($$0.j()));
   }

   public static yr d(bir $$0) {
      return new yr($$0.i(), new yr.h($$0.l(), $$0.m()));
   }

   public static yr e(bir $$0) {
      return new yr($$0.i(), new yr.g($$0.n(), $$0.o(), $$0.p()));
   }

   @Override
   public void a(ty $$0) {
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

   public void a(yh $$0) {
      $$0.a(this);
   }

   public void a(yr.b $$0) {
      this.e.a(this.d, $$0);
   }

   static class a implements yr.c {
      private final uv a;
      private final float b;
      private final bir.a c;
      private final bir.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bir $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(ty $$0) {
         this.a = $$0.m();
         this.b = $$0.readFloat();
         this.c = $$0.b(bir.a.class);
         this.d = $$0.b(bir.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public yr.d a() {
         return yr.d.a;
      }

      @Override
      public void a(UUID $$0, yr.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(ty $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(yr.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, uv $$1, float $$2, bir.a $$3, bir.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, uv $$1) {
      }

      default void a(UUID $$0, bir.a $$1, bir.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      yr.d a();

      void a(UUID var1, yr.b var2);

      void a(ty var1);
   }

   static enum d {
      a(yr.a::new),
      b($$0 -> yr.f),
      c(yr.f::new),
      d(yr.e::new),
      e(yr.h::new),
      f(yr.g::new);

      final Function<ty, yr.c> g;

      private d(Function<ty, yr.c> $$0) {
         this.g = $$0;
      }
   }

   static class e implements yr.c {
      private final uv a;

      e(uv $$0) {
         this.a = $$0;
      }

      private e(ty $$0) {
         this.a = $$0.m();
      }

      @Override
      public yr.d a() {
         return yr.d.d;
      }

      @Override
      public void a(UUID $$0, yr.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(ty $$0) {
         $$0.a(this.a);
      }
   }

   static class f implements yr.c {
      private final float a;

      f(float $$0) {
         this.a = $$0;
      }

      private f(ty $$0) {
         this.a = $$0.readFloat();
      }

      @Override
      public yr.d a() {
         return yr.d.c;
      }

      @Override
      public void a(UUID $$0, yr.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(ty $$0) {
         $$0.a(this.a);
      }
   }

   static class g implements yr.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(ty $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public yr.d a() {
         return yr.d.f;
      }

      @Override
      public void a(UUID $$0, yr.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(ty $$0) {
         $$0.k(yr.a(this.a, this.b, this.c));
      }
   }

   static class h implements yr.c {
      private final bir.a a;
      private final bir.b b;

      h(bir.a $$0, bir.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(ty $$0) {
         this.a = $$0.b(bir.a.class);
         this.b = $$0.b(bir.b.class);
      }

      @Override
      public yr.d a() {
         return yr.d.e;
      }

      @Override
      public void a(UUID $$0, yr.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(ty $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
