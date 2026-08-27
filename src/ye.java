import java.util.UUID;
import java.util.function.Function;

public class ye implements wb<xu> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final UUID d;
   private final ye.c e;
   static final ye.c f = new ye.c() {
      @Override
      public ye.d a() {
         return ye.d.b;
      }

      @Override
      public void a(UUID $$0, ye.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(tl $$0) {
      }
   };

   private ye(UUID $$0, ye.c $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public ye(tl $$0) {
      this.d = $$0.p();
      ye.d $$1 = $$0.b(ye.d.class);
      this.e = $$1.g.apply($$0);
   }

   public static ye a(bhr $$0) {
      return new ye($$0.i(), new ye.a($$0));
   }

   public static ye a(UUID $$0) {
      return new ye($$0, f);
   }

   public static ye b(bhr $$0) {
      return new ye($$0.i(), new ye.f($$0.k()));
   }

   public static ye c(bhr $$0) {
      return new ye($$0.i(), new ye.e($$0.j()));
   }

   public static ye d(bhr $$0) {
      return new ye($$0.i(), new ye.h($$0.l(), $$0.m()));
   }

   public static ye e(bhr $$0) {
      return new ye($$0.i(), new ye.g($$0.n(), $$0.o(), $$0.p()));
   }

   @Override
   public void a(tl $$0) {
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

   public void a(xu $$0) {
      $$0.a(this);
   }

   public void a(ye.b $$0) {
      this.e.a(this.d, $$0);
   }

   static class a implements ye.c {
      private final ui a;
      private final float b;
      private final bhr.a c;
      private final bhr.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bhr $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(tl $$0) {
         this.a = $$0.m();
         this.b = $$0.readFloat();
         this.c = $$0.b(bhr.a.class);
         this.d = $$0.b(bhr.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public ye.d a() {
         return ye.d.a;
      }

      @Override
      public void a(UUID $$0, ye.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(tl $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(ye.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, ui $$1, float $$2, bhr.a $$3, bhr.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, ui $$1) {
      }

      default void a(UUID $$0, bhr.a $$1, bhr.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      ye.d a();

      void a(UUID var1, ye.b var2);

      void a(tl var1);
   }

   static enum d {
      a(ye.a::new),
      b($$0 -> ye.f),
      c(ye.f::new),
      d(ye.e::new),
      e(ye.h::new),
      f(ye.g::new);

      final Function<tl, ye.c> g;

      private d(Function<tl, ye.c> $$0) {
         this.g = $$0;
      }
   }

   static class e implements ye.c {
      private final ui a;

      e(ui $$0) {
         this.a = $$0;
      }

      private e(tl $$0) {
         this.a = $$0.m();
      }

      @Override
      public ye.d a() {
         return ye.d.d;
      }

      @Override
      public void a(UUID $$0, ye.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(tl $$0) {
         $$0.a(this.a);
      }
   }

   static class f implements ye.c {
      private final float a;

      f(float $$0) {
         this.a = $$0;
      }

      private f(tl $$0) {
         this.a = $$0.readFloat();
      }

      @Override
      public ye.d a() {
         return ye.d.c;
      }

      @Override
      public void a(UUID $$0, ye.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(tl $$0) {
         $$0.a(this.a);
      }
   }

   static class g implements ye.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(tl $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public ye.d a() {
         return ye.d.f;
      }

      @Override
      public void a(UUID $$0, ye.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(tl $$0) {
         $$0.k(ye.a(this.a, this.b, this.c));
      }
   }

   static class h implements ye.c {
      private final bhr.a a;
      private final bhr.b b;

      h(bhr.a $$0, bhr.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(tl $$0) {
         this.a = $$0.b(bhr.a.class);
         this.b = $$0.b(bhr.b.class);
      }

      @Override
      public ye.d a() {
         return ye.d.e;
      }

      @Override
      public void a(UUID $$0, ye.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(tl $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
