import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class xl {
   public static final Codec<xl> a = baf.a(xl.a::values).dispatch(xl::c, xl.a::a);
   public static final xl b = new xl(new BitSet(0), xl.a.b);
   public static final xl c = new xl(new BitSet(0), xl.a.a);
   public static final ye d = ye.a.a(n.i).a(new xn(xn.a.a, xh.c("chat.filtered")));
   static final MapCodec<xl> e = MapCodec.unit(c);
   static final MapCodec<xl> f = MapCodec.unit(b);
   static final MapCodec<xl> g = ays.w.xmap(xl::new, xl::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final xl.a j;

   private xl(BitSet $$0, xl.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private xl(BitSet $$0) {
      this.i = $$0;
      this.j = xl.a.c;
   }

   public xl(int $$0) {
      this(new BitSet($$0), xl.a.c);
   }

   private xl.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static xl a(we $$0) {
      xl.a $$1 = $$0.b(xl.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new xl($$0.w(), xl.a.c);
      };
   }

   public static void a(we $$0, xl $$1) {
      $$0.a($$1.j);
      if ($$1.j == xl.a.c) {
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
   public xh b(String $$0) {
      return switch (this.j) {
         case a -> xh.b($$0);
         case b -> null;
         case c -> {
            xv $$1 = xh.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(xh.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == xl.a.a;
   }

   public boolean b() {
      return this.j == xl.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         xl $$1 = (xl)$$0;
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

   static enum a implements baf {
      a("pass_through", () -> xl.e),
      b("fully_filtered", () -> xl.f),
      c("partially_filtered", () -> xl.g);

      private final String d;
      private final Supplier<MapCodec<xl>> e;

      private a(final String $$0, final Supplier<MapCodec<xl>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<xl> a() {
         return this.e.get();
      }
   }
}
