import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class xi {
   public static final Codec<xi> a = bab.a(xi.a::values).dispatch(xi::c, xi.a::a);
   public static final xi b = new xi(new BitSet(0), xi.a.b);
   public static final xi c = new xi(new BitSet(0), xi.a.a);
   public static final yb d = yb.a.a(n.i).a(new xk(xk.a.a, xe.c("chat.filtered")));
   static final MapCodec<xi> e = MapCodec.unit(c);
   static final MapCodec<xi> f = MapCodec.unit(b);
   static final MapCodec<xi> g = ayo.v.xmap(xi::new, xi::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final xi.a j;

   private xi(BitSet $$0, xi.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private xi(BitSet $$0) {
      this.i = $$0;
      this.j = xi.a.c;
   }

   public xi(int $$0) {
      this(new BitSet($$0), xi.a.c);
   }

   private xi.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static xi a(wb $$0) {
      xi.a $$1 = $$0.b(xi.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new xi($$0.w(), xi.a.c);
      };
   }

   public static void a(wb $$0, xi $$1) {
      $$0.a($$1.j);
      if ($$1.j == xi.a.c) {
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
   public xe b(String $$0) {
      return switch (this.j) {
         case a -> xe.b($$0);
         case b -> null;
         case c -> {
            xs $$1 = xe.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(xe.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == xi.a.a;
   }

   public boolean b() {
      return this.j == xi.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         xi $$1 = (xi)$$0;
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

   static enum a implements bab {
      a("pass_through", () -> xi.e),
      b("fully_filtered", () -> xi.f),
      c("partially_filtered", () -> xi.g);

      private final String d;
      private final Supplier<MapCodec<xi>> e;

      private a(final String $$0, final Supplier<MapCodec<xi>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<xi> a() {
         return this.e.get();
      }
   }
}
