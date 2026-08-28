import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fun extends fud {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fun.b q = $$0 -> $$0.get();
   protected final fun.c r;
   protected final fun.b s;

   public static fun.a a(xc $$0, fun.c $$1) {
      return new fun.a($$0, $$1);
   }

   protected fun(int $$0, int $$1, int $$2, int $$3, xc $$4, fun.c $$5, fun.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xq d() {
      return this.s.createNarrationMessage(() -> super.d());
   }

   @Override
   public void a(fyk $$0) {
      this.c($$0);
   }

   public static class a {
      private final xc a;
      private final fun.c b;
      @Nullable
      private fvy c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fun.b h = fun.q;

      public a(xc $$0, fun.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fun.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fun.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fun.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fun.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fun.a a(@Nullable fvy $$0) {
         this.c = $$0;
         return this;
      }

      public fun.a a(fun.b $$0) {
         this.h = $$0;
         return this;
      }

      public fun a() {
         fun $$0 = new fun(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xq createNarrationMessage(Supplier<xq> var1);
   }

   public interface c {
      void onPress(fun var1);
   }
}
