import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class xg {
   public static final Codec<xg> a = bao.a(xg.a::values).dispatch(xg::c, xg.a::a);
   public static final xg b = new xg(new BitSet(0), xg.a.b);
   public static final xg c = new xg(new BitSet(0), xg.a.a);
   public static final xz d = xz.a.a(o.i).a(new xi.e(xc.c("chat.filtered")));
   static final MapCodec<xg> e = MapCodec.unit(c);
   static final MapCodec<xg> f = MapCodec.unit(b);
   static final MapCodec<xg> g = ayy.w.xmap(xg::new, xg::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final xg.a j;

   private xg(BitSet $$0, xg.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private xg(BitSet $$0) {
      this.i = $$0;
      this.j = xg.a.c;
   }

   public xg(int $$0) {
      this(new BitSet($$0), xg.a.c);
   }

   private xg.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static xg a(vy $$0) {
      xg.a $$1 = $$0.b(xg.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new xg($$0.w(), xg.a.c);
      };
   }

   public static void a(vy $$0, xg $$1) {
      $$0.a($$1.j);
      if ($$1.j == xg.a.c) {
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
   public xc b(String $$0) {
      return switch (this.j) {
         case a -> xc.b($$0);
         case b -> null;
         case c -> {
            xq $$1 = xc.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(xc.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == xg.a.a;
   }

   public boolean b() {
      return this.j == xg.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         xg $$1 = (xg)$$0;
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

   static enum a implements bao {
      a("pass_through", () -> xg.e),
      b("fully_filtered", () -> xg.f),
      c("partially_filtered", () -> xg.g);

      private final String d;
      private final Supplier<MapCodec<xg>> e;

      private a(final String $$0, final Supplier<MapCodec<xg>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<xg> a() {
         return this.e.get();
      }
   }
}
