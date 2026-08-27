import java.util.UUID;
import java.util.function.Function;

public class vc implements uo<ur> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final UUID d;
   private final vc.c e;
   static final vc.c f = new vc.c() {
      @Override
      public vc.d a() {
         return vc.d.b;
      }

      @Override
      public void a(UUID $$0, vc.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(sf $$0) {
      }
   };

   private vc(UUID $$0, vc.c $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public vc(sf $$0) {
      this.d = $$0.o();
      vc.d $$1 = $$0.b(vc.d.class);
      this.e = $$1.g.apply($$0);
   }

   public static vc a(bdn $$0) {
      return new vc($$0.i(), new vc.a($$0));
   }

   public static vc a(UUID $$0) {
      return new vc($$0, f);
   }

   public static vc b(bdn $$0) {
      return new vc($$0.i(), new vc.f($$0.k()));
   }

   public static vc c(bdn $$0) {
      return new vc($$0.i(), new vc.e($$0.j()));
   }

   public static vc d(bdn $$0) {
      return new vc($$0.i(), new vc.h($$0.l(), $$0.m()));
   }

   public static vc e(bdn $$0) {
      return new vc($$0.i(), new vc.g($$0.n(), $$0.o(), $$0.p()));
   }

   @Override
   public void a(sf $$0) {
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

   public void a(ur $$0) {
      $$0.a(this);
   }

   public void a(vc.b $$0) {
      this.e.a(this.d, $$0);
   }

   static class a implements vc.c {
      private final sw a;
      private final float b;
      private final bdn.a c;
      private final bdn.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bdn $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(sf $$0) {
         this.a = $$0.l();
         this.b = $$0.readFloat();
         this.c = $$0.b(bdn.a.class);
         this.d = $$0.b(bdn.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public vc.d a() {
         return vc.d.a;
      }

      @Override
      public void a(UUID $$0, vc.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(sf $$0) {
         $$0.a(this.a);
         $$0.writeFloat(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.writeByte(vc.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, sw $$1, float $$2, bdn.a $$3, bdn.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, sw $$1) {
      }

      default void a(UUID $$0, bdn.a $$1, bdn.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      vc.d a();

      void a(UUID var1, vc.b var2);

      void a(sf var1);
   }

   static enum d {
      a(vc.a::new),
      b($$0 -> vc.f),
      c(vc.f::new),
      d(vc.e::new),
      e(vc.h::new),
      f(vc.g::new);

      final Function<sf, vc.c> g;

      private d(Function<sf, vc.c> $$0) {
         this.g = $$0;
      }
   }

   static class e implements vc.c {
      private final sw a;

      e(sw $$0) {
         this.a = $$0;
      }

      private e(sf $$0) {
         this.a = $$0.l();
      }

      @Override
      public vc.d a() {
         return vc.d.d;
      }

      @Override
      public void a(UUID $$0, vc.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(sf $$0) {
         $$0.a(this.a);
      }
   }

   static class f implements vc.c {
      private final float a;

      f(float $$0) {
         this.a = $$0;
      }

      private f(sf $$0) {
         this.a = $$0.readFloat();
      }

      @Override
      public vc.d a() {
         return vc.d.c;
      }

      @Override
      public void a(UUID $$0, vc.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(sf $$0) {
         $$0.writeFloat(this.a);
      }
   }

   static class g implements vc.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(sf $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public vc.d a() {
         return vc.d.f;
      }

      @Override
      public void a(UUID $$0, vc.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(sf $$0) {
         $$0.writeByte(vc.a(this.a, this.b, this.c));
      }
   }

   static class h implements vc.c {
      private final bdn.a a;
      private final bdn.b b;

      h(bdn.a $$0, bdn.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(sf $$0) {
         this.a = $$0.b(bdn.a.class);
         this.b = $$0.b(bdn.b.class);
      }

      @Override
      public vc.d a() {
         return vc.d.e;
      }

      @Override
      public void a(UUID $$0, vc.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(sf $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
