import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class xc {
   public static final Codec<xc> a = azj.a(xc.a::values).dispatch(xc::c, xc.a::a);
   public static final xc b = new xc(new BitSet(0), xc.a.b);
   public static final xc c = new xc(new BitSet(0), xc.a.a);
   public static final xv d = xv.a.a(n.i).a(new xe(xe.a.a, wy.c("chat.filtered")));
   static final MapCodec<xc> e = MapCodec.unit(c);
   static final MapCodec<xc> f = MapCodec.unit(b);
   static final MapCodec<xc> g = axv.u.xmap(xc::new, xc::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final xc.a j;

   private xc(BitSet $$0, xc.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private xc(BitSet $$0) {
      this.i = $$0;
      this.j = xc.a.c;
   }

   public xc(int $$0) {
      this(new BitSet($$0), xc.a.c);
   }

   private xc.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static xc a(vv $$0) {
      xc.a $$1 = $$0.b(xc.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new xc($$0.w(), xc.a.c);
      };
   }

   public static void a(vv $$0, xc $$1) {
      $$0.a($$1.j);
      if ($$1.j == xc.a.c) {
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
   public wy b(String $$0) {
      return switch (this.j) {
         case a -> wy.b($$0);
         case b -> null;
         case c -> {
            xm $$1 = wy.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(wy.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == xc.a.a;
   }

   public boolean b() {
      return this.j == xc.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         xc $$1 = (xc)$$0;
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

   static enum a implements azj {
      a("pass_through", () -> xc.e),
      b("fully_filtered", () -> xc.f),
      c("partially_filtered", () -> xc.g);

      private final String d;
      private final Supplier<MapCodec<xc>> e;

      private a(final String $$0, final Supplier<MapCodec<xc>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<xc> a() {
         return this.e.get();
      }
   }
}
