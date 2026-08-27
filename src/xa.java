import java.util.UUID;
import java.util.function.Function;

public class xa implements ux<wp> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final UUID d;
   private final xa.c e;
   static final xa.c f = new xa.c() {
      @Override
      public xa.d a() {
         return xa.d.b;
      }

      @Override
      public void a(UUID $$0, xa.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(si $$0) {
      }
   };

   private xa(UUID $$0, xa.c $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public xa(si $$0) {
      this.d = $$0.o();
      xa.d $$1 = $$0.b(xa.d.class);
      this.e = $$1.g.apply($$0);
   }

   public static xa a(bgg $$0) {
      return new xa($$0.i(), new xa.a($$0));
   }

   public static xa a(UUID $$0) {
      return new xa($$0, f);
   }

   public static xa b(bgg $$0) {
      return new xa($$0.i(), new xa.f($$0.k()));
   }

   public static xa c(bgg $$0) {
      return new xa($$0.i(), new xa.e($$0.j()));
   }

   public static xa d(bgg $$0) {
      return new xa($$0.i(), new xa.h($$0.l(), $$0.m()));
   }

   public static xa e(bgg $$0) {
      return new xa($$0.i(), new xa.g($$0.n(), $$0.o(), $$0.p()));
   }

   @Override
   public void a(si $$0) {
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

   public void a(wp $$0) {
      $$0.a(this);
   }

   public void a(xa.b $$0) {
      this.e.a(this.d, $$0);
   }

   static class a implements xa.c {
      private final tf a;
      private final float b;
      private final bgg.a c;
      private final bgg.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bgg $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(si $$0) {
         this.a = $$0.l();
         this.b = $$0.readFloat();
         this.c = $$0.b(bgg.a.class);
         this.d = $$0.b(bgg.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public xa.d a() {
         return xa.d.a;
      }

      @Override
      public void a(UUID $$0, xa.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(si $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(xa.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, tf $$1, float $$2, bgg.a $$3, bgg.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, tf $$1) {
      }

      default void a(UUID $$0, bgg.a $$1, bgg.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      xa.d a();

      void a(UUID var1, xa.b var2);

      void a(si var1);
   }

   static enum d {
      a(xa.a::new),
      b($$0 -> xa.f),
      c(xa.f::new),
      d(xa.e::new),
      e(xa.h::new),
      f(xa.g::new);

      final Function<si, xa.c> g;

      private d(Function<si, xa.c> $$0) {
         this.g = $$0;
      }
   }

   static class e implements xa.c {
      private final tf a;

      e(tf $$0) {
         this.a = $$0;
      }

      private e(si $$0) {
         this.a = $$0.l();
      }

      @Override
      public xa.d a() {
         return xa.d.d;
      }

      @Override
      public void a(UUID $$0, xa.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(si $$0) {
         $$0.a(this.a);
      }
   }

   static class f implements xa.c {
      private final float a;

      f(float $$0) {
         this.a = $$0;
      }

      private f(si $$0) {
         this.a = $$0.readFloat();
      }

      @Override
      public xa.d a() {
         return xa.d.c;
      }

      @Override
      public void a(UUID $$0, xa.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(si $$0) {
         $$0.a(this.a);
      }
   }

   static class g implements xa.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(si $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public xa.d a() {
         return xa.d.f;
      }

      @Override
      public void a(UUID $$0, xa.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(si $$0) {
         $$0.k(xa.a(this.a, this.b, this.c));
      }
   }

   static class h implements xa.c {
      private final bgg.a a;
      private final bgg.b b;

      h(bgg.a $$0, bgg.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(si $$0) {
         this.a = $$0.b(bgg.a.class);
         this.b = $$0.b(bgg.b.class);
      }

      @Override
      public xa.d a() {
         return xa.d.e;
      }

      @Override
      public void a(UUID $$0, xa.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(si $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
