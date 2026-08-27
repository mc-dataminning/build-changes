import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class xb {
   public static final Codec<xb> a = ayx.a(xb.a::values).dispatch(xb::c, xb.a::a);
   public static final xb b = new xb(new BitSet(0), xb.a.b);
   public static final xb c = new xb(new BitSet(0), xb.a.a);
   public static final xu d = xu.a.a(n.i).a(new xd(xd.a.a, wx.c("chat.filtered")));
   static final MapCodec<xb> e = MapCodec.unit(c);
   static final MapCodec<xb> f = MapCodec.unit(b);
   static final MapCodec<xb> g = axm.s.xmap(xb::new, xb::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final xb.a j;

   private xb(BitSet $$0, xb.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private xb(BitSet $$0) {
      this.i = $$0;
      this.j = xb.a.c;
   }

   public xb(int $$0) {
      this(new BitSet($$0), xb.a.c);
   }

   private xb.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static xb a(vx $$0) {
      xb.a $$1 = $$0.b(xb.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new xb($$0.w(), xb.a.c);
      };
   }

   public static void a(vx $$0, xb $$1) {
      $$0.a($$1.j);
      if ($$1.j == xb.a.c) {
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
   public wx b(String $$0) {
      return switch (this.j) {
         case a -> wx.b($$0);
         case b -> null;
         case c -> {
            xl $$1 = wx.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(wx.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == xb.a.a;
   }

   public boolean b() {
      return this.j == xb.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         xb $$1 = (xb)$$0;
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

   static enum a implements ayx {
      a("pass_through", () -> xb.e),
      b("fully_filtered", () -> xb.f),
      c("partially_filtered", () -> xb.g);

      private final String d;
      private final Supplier<MapCodec<xb>> e;

      private a(String $$0, Supplier<MapCodec<xb>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<xb> a() {
         return this.e.get();
      }
   }
}
