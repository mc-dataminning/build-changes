import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ful extends fub {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final ful.b q = $$0 -> $$0.get();
   protected final ful.c r;
   protected final ful.b s;

   public static ful.a a(xa $$0, ful.c $$1) {
      return new ful.a($$0, $$1);
   }

   protected ful(int $$0, int $$1, int $$2, int $$3, xa $$4, ful.c $$5, ful.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xo d() {
      return this.s.createNarrationMessage(() -> super.d());
   }

   @Override
   public void a(fyi $$0) {
      this.c($$0);
   }

   public static class a {
      private final xa a;
      private final ful.c b;
      @Nullable
      private fvw c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private ful.b h = ful.q;

      public a(xa $$0, ful.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ful.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public ful.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public ful.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public ful.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public ful.a a(@Nullable fvw $$0) {
         this.c = $$0;
         return this;
      }

      public ful.a a(ful.b $$0) {
         this.h = $$0;
         return this;
      }

      public ful a() {
         ful $$0 = new ful(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xo createNarrationMessage(Supplier<xo> var1);
   }

   public interface c {
      void onPress(ful var1);
   }
}
