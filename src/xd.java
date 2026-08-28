import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class xd {
   public static final Codec<xd> a = azk.a(xd.a::values).dispatch(xd::c, xd.a::a);
   public static final xd b = new xd(new BitSet(0), xd.a.b);
   public static final xd c = new xd(new BitSet(0), xd.a.a);
   public static final xw d = xw.a.a(n.i).a(new xf(xf.a.a, wz.c("chat.filtered")));
   static final MapCodec<xd> e = MapCodec.unit(c);
   static final MapCodec<xd> f = MapCodec.unit(b);
   static final MapCodec<xd> g = axw.u.xmap(xd::new, xd::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final xd.a j;

   private xd(BitSet $$0, xd.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private xd(BitSet $$0) {
      this.i = $$0;
      this.j = xd.a.c;
   }

   public xd(int $$0) {
      this(new BitSet($$0), xd.a.c);
   }

   private xd.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static xd a(vw $$0) {
      xd.a $$1 = $$0.b(xd.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new xd($$0.w(), xd.a.c);
      };
   }

   public static void a(vw $$0, xd $$1) {
      $$0.a($$1.j);
      if ($$1.j == xd.a.c) {
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
   public wz b(String $$0) {
      return switch (this.j) {
         case a -> wz.b($$0);
         case b -> null;
         case c -> {
            xn $$1 = wz.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(wz.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == xd.a.a;
   }

   public boolean b() {
      return this.j == xd.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         xd $$1 = (xd)$$0;
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

   static enum a implements azk {
      a("pass_through", () -> xd.e),
      b("fully_filtered", () -> xd.f),
      c("partially_filtered", () -> xd.g);

      private final String d;
      private final Supplier<MapCodec<xd>> e;

      private a(final String $$0, final Supplier<MapCodec<xd>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<xd> a() {
         return this.e.get();
      }
   }
}
