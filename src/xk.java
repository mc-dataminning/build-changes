import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class xk {
   public static final Codec<xk> a = bax.a(xk.a::values).dispatch(xk::c, xk.a::a);
   public static final xk b = new xk(new BitSet(0), xk.a.b);
   public static final xk c = new xk(new BitSet(0), xk.a.a);
   public static final yd d = yd.a.a(o.i).a(new xm.e(xg.c("chat.filtered")));
   static final MapCodec<xk> e = MapCodec.unit(c);
   static final MapCodec<xk> f = MapCodec.unit(b);
   static final MapCodec<xk> g = azg.w.xmap(xk::new, xk::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final xk.a j;

   private xk(BitSet $$0, xk.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private xk(BitSet $$0) {
      this.i = $$0;
      this.j = xk.a.c;
   }

   public xk(int $$0) {
      this(new BitSet($$0), xk.a.c);
   }

   private xk.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static xk a(vy $$0) {
      xk.a $$1 = $$0.b(xk.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new xk($$0.w(), xk.a.c);
      };
   }

   public static void a(vy $$0, xk $$1) {
      $$0.a($$1.j);
      if ($$1.j == xk.a.c) {
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
   public xg b(String $$0) {
      return switch (this.j) {
         case a -> xg.b($$0);
         case b -> null;
         case c -> {
            xu $$1 = xg.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(xg.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == xk.a.a;
   }

   public boolean b() {
      return this.j == xk.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         xk $$1 = (xk)$$0;
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

   static enum a implements bax {
      a("pass_through", () -> xk.e),
      b("fully_filtered", () -> xk.f),
      c("partially_filtered", () -> xk.g);

      private final String d;
      private final Supplier<MapCodec<xk>> e;

      private a(final String $$0, final Supplier<MapCodec<xk>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<xk> a() {
         return this.e.get();
      }
   }
}
