import java.util.UUID;
import java.util.function.Function;

public class yy implements wu<yo> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final UUID d;
   private final yy.c e;
   static final yy.c f = new yy.c() {
      @Override
      public yy.d a() {
         return yy.d.b;
      }

      @Override
      public void a(UUID $$0, yy.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(ue $$0) {
      }
   };

   private yy(UUID $$0, yy.c $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public yy(ue $$0) {
      this.d = $$0.p();
      yy.d $$1 = $$0.b(yy.d.class);
      this.e = $$1.g.apply($$0);
   }

   public static yy a(bjb $$0) {
      return new yy($$0.i(), new yy.a($$0));
   }

   public static yy a(UUID $$0) {
      return new yy($$0, f);
   }

   public static yy b(bjb $$0) {
      return new yy($$0.i(), new yy.f($$0.k()));
   }

   public static yy c(bjb $$0) {
      return new yy($$0.i(), new yy.e($$0.j()));
   }

   public static yy d(bjb $$0) {
      return new yy($$0.i(), new yy.h($$0.l(), $$0.m()));
   }

   public static yy e(bjb $$0) {
      return new yy($$0.i(), new yy.g($$0.n(), $$0.o(), $$0.p()));
   }

   @Override
   public void a(ue $$0) {
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

   public void a(yo $$0) {
      $$0.a(this);
   }

   public void a(yy.b $$0) {
      this.e.a(this.d, $$0);
   }

   static class a implements yy.c {
      private final vb a;
      private final float b;
      private final bjb.a c;
      private final bjb.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bjb $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(ue $$0) {
         this.a = $$0.m();
         this.b = $$0.readFloat();
         this.c = $$0.b(bjb.a.class);
         this.d = $$0.b(bjb.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public yy.d a() {
         return yy.d.a;
      }

      @Override
      public void a(UUID $$0, yy.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(ue $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(yy.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, vb $$1, float $$2, bjb.a $$3, bjb.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, vb $$1) {
      }

      default void a(UUID $$0, bjb.a $$1, bjb.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      yy.d a();

      void a(UUID var1, yy.b var2);

      void a(ue var1);
   }

   static enum d {
      a(yy.a::new),
      b($$0 -> yy.f),
      c(yy.f::new),
      d(yy.e::new),
      e(yy.h::new),
      f(yy.g::new);

      final Function<ue, yy.c> g;

      private d(Function<ue, yy.c> $$0) {
         this.g = $$0;
      }
   }

   static class e implements yy.c {
      private final vb a;

      e(vb $$0) {
         this.a = $$0;
      }

      private e(ue $$0) {
         this.a = $$0.m();
      }

      @Override
      public yy.d a() {
         return yy.d.d;
      }

      @Override
      public void a(UUID $$0, yy.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(ue $$0) {
         $$0.a(this.a);
      }
   }

   static class f implements yy.c {
      private final float a;

      f(float $$0) {
         this.a = $$0;
      }

      private f(ue $$0) {
         this.a = $$0.readFloat();
      }

      @Override
      public yy.d a() {
         return yy.d.c;
      }

      @Override
      public void a(UUID $$0, yy.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(ue $$0) {
         $$0.a(this.a);
      }
   }

   static class g implements yy.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(ue $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public yy.d a() {
         return yy.d.f;
      }

      @Override
      public void a(UUID $$0, yy.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(ue $$0) {
         $$0.k(yy.a(this.a, this.b, this.c));
      }
   }

   static class h implements yy.c {
      private final bjb.a a;
      private final bjb.b b;

      h(bjb.a $$0, bjb.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(ue $$0) {
         this.a = $$0.b(bjb.a.class);
         this.b = $$0.b(bjb.b.class);
      }

      @Override
      public yy.d a() {
         return yy.d.e;
      }

      @Override
      public void a(UUID $$0, yy.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(ue $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
