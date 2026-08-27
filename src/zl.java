import java.util.UUID;
import java.util.function.Function;

public class zl implements xg<zb> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final UUID d;
   private final zl.c e;
   static final zl.c f = new zl.c() {
      @Override
      public zl.d a() {
         return zl.d.b;
      }

      @Override
      public void a(UUID $$0, zl.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(uj $$0) {
      }
   };

   private zl(UUID $$0, zl.c $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public zl(uj $$0) {
      this.d = $$0.p();
      zl.d $$1 = $$0.b(zl.d.class);
      this.e = $$1.g.apply($$0);
   }

   public static zl a(bjs $$0) {
      return new zl($$0.i(), new zl.a($$0));
   }

   public static zl a(UUID $$0) {
      return new zl($$0, f);
   }

   public static zl b(bjs $$0) {
      return new zl($$0.i(), new zl.f($$0.k()));
   }

   public static zl c(bjs $$0) {
      return new zl($$0.i(), new zl.e($$0.j()));
   }

   public static zl d(bjs $$0) {
      return new zl($$0.i(), new zl.h($$0.l(), $$0.m()));
   }

   public static zl e(bjs $$0) {
      return new zl($$0.i(), new zl.g($$0.n(), $$0.o(), $$0.p()));
   }

   @Override
   public void a(uj $$0) {
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

   public void a(zb $$0) {
      $$0.a(this);
   }

   public void a(zl.b $$0) {
      this.e.a(this.d, $$0);
   }

   static class a implements zl.c {
      private final vg a;
      private final float b;
      private final bjs.a c;
      private final bjs.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bjs $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(uj $$0) {
         this.a = $$0.m();
         this.b = $$0.readFloat();
         this.c = $$0.b(bjs.a.class);
         this.d = $$0.b(bjs.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public zl.d a() {
         return zl.d.a;
      }

      @Override
      public void a(UUID $$0, zl.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(uj $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(zl.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, vg $$1, float $$2, bjs.a $$3, bjs.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, vg $$1) {
      }

      default void a(UUID $$0, bjs.a $$1, bjs.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      zl.d a();

      void a(UUID var1, zl.b var2);

      void a(uj var1);
   }

   static enum d {
      a(zl.a::new),
      b($$0 -> zl.f),
      c(zl.f::new),
      d(zl.e::new),
      e(zl.h::new),
      f(zl.g::new);

      final Function<uj, zl.c> g;

      private d(Function<uj, zl.c> $$0) {
         this.g = $$0;
      }
   }

   static class e implements zl.c {
      private final vg a;

      e(vg $$0) {
         this.a = $$0;
      }

      private e(uj $$0) {
         this.a = $$0.m();
      }

      @Override
      public zl.d a() {
         return zl.d.d;
      }

      @Override
      public void a(UUID $$0, zl.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(uj $$0) {
         $$0.a(this.a);
      }
   }

   static class f implements zl.c {
      private final float a;

      f(float $$0) {
         this.a = $$0;
      }

      private f(uj $$0) {
         this.a = $$0.readFloat();
      }

      @Override
      public zl.d a() {
         return zl.d.c;
      }

      @Override
      public void a(UUID $$0, zl.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(uj $$0) {
         $$0.a(this.a);
      }
   }

   static class g implements zl.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(uj $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public zl.d a() {
         return zl.d.f;
      }

      @Override
      public void a(UUID $$0, zl.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(uj $$0) {
         $$0.k(zl.a(this.a, this.b, this.c));
      }
   }

   static class h implements zl.c {
      private final bjs.a a;
      private final bjs.b b;

      h(bjs.a $$0, bjs.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(uj $$0) {
         this.a = $$0.b(bjs.a.class);
         this.b = $$0.b(bjs.b.class);
      }

      @Override
      public zl.d a() {
         return zl.d.e;
      }

      @Override
      public void a(UUID $$0, zl.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(uj $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
