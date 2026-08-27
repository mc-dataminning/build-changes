import java.util.UUID;
import java.util.function.Function;

public class zk implements xf<za> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final UUID d;
   private final zk.c e;
   static final zk.c f = new zk.c() {
      @Override
      public zk.d a() {
         return zk.d.b;
      }

      @Override
      public void a(UUID $$0, zk.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(ui $$0) {
      }
   };

   private zk(UUID $$0, zk.c $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public zk(ui $$0) {
      this.d = $$0.p();
      zk.d $$1 = $$0.b(zk.d.class);
      this.e = $$1.g.apply($$0);
   }

   public static zk a(bjr $$0) {
      return new zk($$0.i(), new zk.a($$0));
   }

   public static zk a(UUID $$0) {
      return new zk($$0, f);
   }

   public static zk b(bjr $$0) {
      return new zk($$0.i(), new zk.f($$0.k()));
   }

   public static zk c(bjr $$0) {
      return new zk($$0.i(), new zk.e($$0.j()));
   }

   public static zk d(bjr $$0) {
      return new zk($$0.i(), new zk.h($$0.l(), $$0.m()));
   }

   public static zk e(bjr $$0) {
      return new zk($$0.i(), new zk.g($$0.n(), $$0.o(), $$0.p()));
   }

   @Override
   public void a(ui $$0) {
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

   public void a(za $$0) {
      $$0.a(this);
   }

   public void a(zk.b $$0) {
      this.e.a(this.d, $$0);
   }

   static class a implements zk.c {
      private final vf a;
      private final float b;
      private final bjr.a c;
      private final bjr.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bjr $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(ui $$0) {
         this.a = $$0.m();
         this.b = $$0.readFloat();
         this.c = $$0.b(bjr.a.class);
         this.d = $$0.b(bjr.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public zk.d a() {
         return zk.d.a;
      }

      @Override
      public void a(UUID $$0, zk.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(ui $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(zk.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, vf $$1, float $$2, bjr.a $$3, bjr.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, vf $$1) {
      }

      default void a(UUID $$0, bjr.a $$1, bjr.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      zk.d a();

      void a(UUID var1, zk.b var2);

      void a(ui var1);
   }

   static enum d {
      a(zk.a::new),
      b($$0 -> zk.f),
      c(zk.f::new),
      d(zk.e::new),
      e(zk.h::new),
      f(zk.g::new);

      final Function<ui, zk.c> g;

      private d(Function<ui, zk.c> $$0) {
         this.g = $$0;
      }
   }

   static class e implements zk.c {
      private final vf a;

      e(vf $$0) {
         this.a = $$0;
      }

      private e(ui $$0) {
         this.a = $$0.m();
      }

      @Override
      public zk.d a() {
         return zk.d.d;
      }

      @Override
      public void a(UUID $$0, zk.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(ui $$0) {
         $$0.a(this.a);
      }
   }

   static class f implements zk.c {
      private final float a;

      f(float $$0) {
         this.a = $$0;
      }

      private f(ui $$0) {
         this.a = $$0.readFloat();
      }

      @Override
      public zk.d a() {
         return zk.d.c;
      }

      @Override
      public void a(UUID $$0, zk.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(ui $$0) {
         $$0.a(this.a);
      }
   }

   static class g implements zk.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(ui $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public zk.d a() {
         return zk.d.f;
      }

      @Override
      public void a(UUID $$0, zk.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(ui $$0) {
         $$0.k(zk.a(this.a, this.b, this.c));
      }
   }

   static class h implements zk.c {
      private final bjr.a a;
      private final bjr.b b;

      h(bjr.a $$0, bjr.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(ui $$0) {
         this.a = $$0.b(bjr.a.class);
         this.b = $$0.b(bjr.b.class);
      }

      @Override
      public zk.d a() {
         return zk.d.e;
      }

      @Override
      public void a(UUID $$0, zk.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(ui $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
