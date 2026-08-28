import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class xo {
   public static final Codec<xo> a = baq.a(xo.a::values).dispatch(xo::c, xo.a::a);
   public static final xo b = new xo(new BitSet(0), xo.a.b);
   public static final xo c = new xo(new BitSet(0), xo.a.a);
   public static final yh d = yh.a.a(n.i).a(new xq(xq.a.a, xk.c("chat.filtered")));
   static final MapCodec<xo> e = MapCodec.unit(c);
   static final MapCodec<xo> f = MapCodec.unit(b);
   static final MapCodec<xo> g = azd.w.xmap(xo::new, xo::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final xo.a j;

   private xo(BitSet $$0, xo.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private xo(BitSet $$0) {
      this.i = $$0;
      this.j = xo.a.c;
   }

   public xo(int $$0) {
      this(new BitSet($$0), xo.a.c);
   }

   private xo.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static xo a(wh $$0) {
      xo.a $$1 = $$0.b(xo.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new xo($$0.w(), xo.a.c);
      };
   }

   public static void a(wh $$0, xo $$1) {
      $$0.a($$1.j);
      if ($$1.j == xo.a.c) {
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
   public xk b(String $$0) {
      return switch (this.j) {
         case a -> xk.b($$0);
         case b -> null;
         case c -> {
            xy $$1 = xk.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(xk.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == xo.a.a;
   }

   public boolean b() {
      return this.j == xo.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         xo $$1 = (xo)$$0;
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

   static enum a implements baq {
      a("pass_through", () -> xo.e),
      b("fully_filtered", () -> xo.f),
      c("partially_filtered", () -> xo.g);

      private final String d;
      private final Supplier<MapCodec<xo>> e;

      private a(final String $$0, final Supplier<MapCodec<xo>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<xo> a() {
         return this.e.get();
      }
   }
}
