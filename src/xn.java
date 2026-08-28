import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class xn {
   public static final Codec<xn> a = bai.a(xn.a::values).dispatch(xn::c, xn.a::a);
   public static final xn b = new xn(new BitSet(0), xn.a.b);
   public static final xn c = new xn(new BitSet(0), xn.a.a);
   public static final yg d = yg.a.a(n.i).a(new xp(xp.a.a, xj.c("chat.filtered")));
   static final MapCodec<xn> e = MapCodec.unit(c);
   static final MapCodec<xn> f = MapCodec.unit(b);
   static final MapCodec<xn> g = ayv.w.xmap(xn::new, xn::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final xn.a j;

   private xn(BitSet $$0, xn.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private xn(BitSet $$0) {
      this.i = $$0;
      this.j = xn.a.c;
   }

   public xn(int $$0) {
      this(new BitSet($$0), xn.a.c);
   }

   private xn.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static xn a(wg $$0) {
      xn.a $$1 = $$0.b(xn.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new xn($$0.w(), xn.a.c);
      };
   }

   public static void a(wg $$0, xn $$1) {
      $$0.a($$1.j);
      if ($$1.j == xn.a.c) {
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
   public xj b(String $$0) {
      return switch (this.j) {
         case a -> xj.b($$0);
         case b -> null;
         case c -> {
            xx $$1 = xj.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(xj.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == xn.a.a;
   }

   public boolean b() {
      return this.j == xn.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         xn $$1 = (xn)$$0;
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

   static enum a implements bai {
      a("pass_through", () -> xn.e),
      b("fully_filtered", () -> xn.f),
      c("partially_filtered", () -> xn.g);

      private final String d;
      private final Supplier<MapCodec<xn>> e;

      private a(final String $$0, final Supplier<MapCodec<xn>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<xn> a() {
         return this.e.get();
      }
   }
}
