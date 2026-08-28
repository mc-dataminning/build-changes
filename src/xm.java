import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class xm {
   public static final Codec<xm> a = bag.a(xm.a::values).dispatch(xm::c, xm.a::a);
   public static final xm b = new xm(new BitSet(0), xm.a.b);
   public static final xm c = new xm(new BitSet(0), xm.a.a);
   public static final yf d = yf.a.a(n.i).a(new xo(xo.a.a, xi.c("chat.filtered")));
   static final MapCodec<xm> e = MapCodec.unit(c);
   static final MapCodec<xm> f = MapCodec.unit(b);
   static final MapCodec<xm> g = ayt.w.xmap(xm::new, xm::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final xm.a j;

   private xm(BitSet $$0, xm.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private xm(BitSet $$0) {
      this.i = $$0;
      this.j = xm.a.c;
   }

   public xm(int $$0) {
      this(new BitSet($$0), xm.a.c);
   }

   private xm.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static xm a(wf $$0) {
      xm.a $$1 = $$0.b(xm.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new xm($$0.w(), xm.a.c);
      };
   }

   public static void a(wf $$0, xm $$1) {
      $$0.a($$1.j);
      if ($$1.j == xm.a.c) {
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
   public xi b(String $$0) {
      return switch (this.j) {
         case a -> xi.b($$0);
         case b -> null;
         case c -> {
            xw $$1 = xi.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(xi.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == xm.a.a;
   }

   public boolean b() {
      return this.j == xm.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         xm $$1 = (xm)$$0;
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

   static enum a implements bag {
      a("pass_through", () -> xm.e),
      b("fully_filtered", () -> xm.f),
      c("partially_filtered", () -> xm.g);

      private final String d;
      private final Supplier<MapCodec<xm>> e;

      private a(final String $$0, final Supplier<MapCodec<xm>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<xm> a() {
         return this.e.get();
      }
   }
}
