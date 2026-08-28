import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class xh {
   public static final Codec<xh> a = azz.a(xh.a::values).dispatch(xh::c, xh.a::a);
   public static final xh b = new xh(new BitSet(0), xh.a.b);
   public static final xh c = new xh(new BitSet(0), xh.a.a);
   public static final ya d = ya.a.a(n.i).a(new xj(xj.a.a, xd.c("chat.filtered")));
   static final MapCodec<xh> e = MapCodec.unit(c);
   static final MapCodec<xh> f = MapCodec.unit(b);
   static final MapCodec<xh> g = aym.v.xmap(xh::new, xh::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final xh.a j;

   private xh(BitSet $$0, xh.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private xh(BitSet $$0) {
      this.i = $$0;
      this.j = xh.a.c;
   }

   public xh(int $$0) {
      this(new BitSet($$0), xh.a.c);
   }

   private xh.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static xh a(wa $$0) {
      xh.a $$1 = $$0.b(xh.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new xh($$0.w(), xh.a.c);
      };
   }

   public static void a(wa $$0, xh $$1) {
      $$0.a($$1.j);
      if ($$1.j == xh.a.c) {
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
   public xd b(String $$0) {
      return switch (this.j) {
         case a -> xd.b($$0);
         case b -> null;
         case c -> {
            xr $$1 = xd.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(xd.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == xh.a.a;
   }

   public boolean b() {
      return this.j == xh.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         xh $$1 = (xh)$$0;
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

   static enum a implements azz {
      a("pass_through", () -> xh.e),
      b("fully_filtered", () -> xh.f),
      c("partially_filtered", () -> xh.g);

      private final String d;
      private final Supplier<MapCodec<xh>> e;

      private a(final String $$0, final Supplier<MapCodec<xh>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<xh> a() {
         return this.e.get();
      }
   }
}
