import java.util.UUID;
import java.util.function.Function;

public class zh implements xd<yx> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final UUID d;
   private final zh.c e;
   static final zh.c f = new zh.c() {
      @Override
      public zh.d a() {
         return zh.d.b;
      }

      @Override
      public void a(UUID $$0, zh.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(ug $$0) {
      }
   };

   private zh(UUID $$0, zh.c $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public zh(ug $$0) {
      this.d = $$0.p();
      zh.d $$1 = $$0.b(zh.d.class);
      this.e = $$1.g.apply($$0);
   }

   public static zh a(bjl $$0) {
      return new zh($$0.i(), new zh.a($$0));
   }

   public static zh a(UUID $$0) {
      return new zh($$0, f);
   }

   public static zh b(bjl $$0) {
      return new zh($$0.i(), new zh.f($$0.k()));
   }

   public static zh c(bjl $$0) {
      return new zh($$0.i(), new zh.e($$0.j()));
   }

   public static zh d(bjl $$0) {
      return new zh($$0.i(), new zh.h($$0.l(), $$0.m()));
   }

   public static zh e(bjl $$0) {
      return new zh($$0.i(), new zh.g($$0.n(), $$0.o(), $$0.p()));
   }

   @Override
   public void a(ug $$0) {
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

   public void a(yx $$0) {
      $$0.a(this);
   }

   public void a(zh.b $$0) {
      this.e.a(this.d, $$0);
   }

   static class a implements zh.c {
      private final vd a;
      private final float b;
      private final bjl.a c;
      private final bjl.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bjl $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(ug $$0) {
         this.a = $$0.m();
         this.b = $$0.readFloat();
         this.c = $$0.b(bjl.a.class);
         this.d = $$0.b(bjl.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public zh.d a() {
         return zh.d.a;
      }

      @Override
      public void a(UUID $$0, zh.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(ug $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(zh.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, vd $$1, float $$2, bjl.a $$3, bjl.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, vd $$1) {
      }

      default void a(UUID $$0, bjl.a $$1, bjl.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      zh.d a();

      void a(UUID var1, zh.b var2);

      void a(ug var1);
   }

   static enum d {
      a(zh.a::new),
      b($$0 -> zh.f),
      c(zh.f::new),
      d(zh.e::new),
      e(zh.h::new),
      f(zh.g::new);

      final Function<ug, zh.c> g;

      private d(Function<ug, zh.c> $$0) {
         this.g = $$0;
      }
   }

   static class e implements zh.c {
      private final vd a;

      e(vd $$0) {
         this.a = $$0;
      }

      private e(ug $$0) {
         this.a = $$0.m();
      }

      @Override
      public zh.d a() {
         return zh.d.d;
      }

      @Override
      public void a(UUID $$0, zh.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(ug $$0) {
         $$0.a(this.a);
      }
   }

   static class f implements zh.c {
      private final float a;

      f(float $$0) {
         this.a = $$0;
      }

      private f(ug $$0) {
         this.a = $$0.readFloat();
      }

      @Override
      public zh.d a() {
         return zh.d.c;
      }

      @Override
      public void a(UUID $$0, zh.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(ug $$0) {
         $$0.a(this.a);
      }
   }

   static class g implements zh.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(ug $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public zh.d a() {
         return zh.d.f;
      }

      @Override
      public void a(UUID $$0, zh.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(ug $$0) {
         $$0.k(zh.a(this.a, this.b, this.c));
      }
   }

   static class h implements zh.c {
      private final bjl.a a;
      private final bjl.b b;

      h(bjl.a $$0, bjl.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(ug $$0) {
         this.a = $$0.b(bjl.a.class);
         this.b = $$0.b(bjl.b.class);
      }

      @Override
      public zh.d a() {
         return zh.d.e;
      }

      @Override
      public void a(UUID $$0, zh.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(ug $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
