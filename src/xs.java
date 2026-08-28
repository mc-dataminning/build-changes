import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class xs {
   public static final Codec<xs> a = azs.a(xs.a::values).dispatch(xs::c, xs.a::a);
   public static final xs b = new xs(new BitSet(0), xs.a.b);
   public static final xs c = new xs(new BitSet(0), xs.a.a);
   public static final yl d = yl.a.a(n.i).a(new xu(xu.a.a, xo.c("chat.filtered")));
   static final MapCodec<xs> e = MapCodec.unit(c);
   static final MapCodec<xs> f = MapCodec.unit(b);
   static final MapCodec<xs> g = ayf.u.xmap(xs::new, xs::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final xs.a j;

   private xs(BitSet $$0, xs.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private xs(BitSet $$0) {
      this.i = $$0;
      this.j = xs.a.c;
   }

   public xs(int $$0) {
      this(new BitSet($$0), xs.a.c);
   }

   private xs.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static xs a(wl $$0) {
      xs.a $$1 = $$0.b(xs.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new xs($$0.w(), xs.a.c);
      };
   }

   public static void a(wl $$0, xs $$1) {
      $$0.a($$1.j);
      if ($$1.j == xs.a.c) {
         $$0.a($$1.i);
      }
   }

   public void a(int $$0) {
      this.i.set($$0);
   }

   @Nullable
   public String a(String $$0) {
      return switch (this.j) {
         case a -> $$0;
         case b -> null;
         case c -> {
            char[] $$1 = $$0.toCharArray();

            for (int $$2 = 0; $$2 < $$1.length && $$2 < this.i.length(); $$2++) {
               if (this.i.get($$2)) {
                  $$1[$$2] = '#';
               }
            }

            yield new String($$1);
         }
      };
   }

   @Nullable
   public xo b(String $$0) {
      return switch (this.j) {
         case a -> xo.b($$0);
         case b -> null;
         case c -> {
            yc $$1 = xo.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(xo.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
               } else {
                  $$1.f($$0.substring($$2, $$4));
               }

               $$3 = !$$3;
               $$2 = $$4;
            }
         }
      };
   }

   public boolean a() {
      return this.j == xs.a.a;
   }

   public boolean b() {
      return this.j == xs.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         xs $$1 = (xs)$$0;
         return this.i.equals($$1.i) && this.j == $$1.j;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.i.hashCode();
      return 31 * $$0 + this.j.hashCode();
   }

   static enum a implements azs {
      a("pass_through", () -> xs.e),
      b("fully_filtered", () -> xs.f),
      c("partially_filtered", () -> xs.g);

      private final String d;
      private final Supplier<MapCodec<xs>> e;

      private a(final String $$0, final Supplier<MapCodec<xs>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<xs> a() {
         return this.e.get();
      }
   }
}
