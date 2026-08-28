import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class xp {
   public static final Codec<xp> a = baj.a(xp.a::values).dispatch(xp::c, xp.a::a);
   public static final xp b = new xp(new BitSet(0), xp.a.b);
   public static final xp c = new xp(new BitSet(0), xp.a.a);
   public static final yi d = yi.a.a(n.i).a(new xr(xr.a.a, xl.c("chat.filtered")));
   static final MapCodec<xp> e = MapCodec.unit(c);
   static final MapCodec<xp> f = MapCodec.unit(b);
   static final MapCodec<xp> g = ayw.w.xmap(xp::new, xp::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final xp.a j;

   private xp(BitSet $$0, xp.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private xp(BitSet $$0) {
      this.i = $$0;
      this.j = xp.a.c;
   }

   public xp(int $$0) {
      this(new BitSet($$0), xp.a.c);
   }

   private xp.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static xp a(wi $$0) {
      xp.a $$1 = $$0.b(xp.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new xp($$0.w(), xp.a.c);
      };
   }

   public static void a(wi $$0, xp $$1) {
      $$0.a($$1.j);
      if ($$1.j == xp.a.c) {
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
   public xl b(String $$0) {
      return switch (this.j) {
         case a -> xl.b($$0);
         case b -> null;
         case c -> {
            xz $$1 = xl.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(xl.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == xp.a.a;
   }

   public boolean b() {
      return this.j == xp.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         xp $$1 = (xp)$$0;
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

   static enum a implements baj {
      a("pass_through", () -> xp.e),
      b("fully_filtered", () -> xp.f),
      c("partially_filtered", () -> xp.g);

      private final String d;
      private final Supplier<MapCodec<xp>> e;

      private a(final String $$0, final Supplier<MapCodec<xp>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<xp> a() {
         return this.e.get();
      }
   }
}
