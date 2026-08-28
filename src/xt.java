import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class xt {
   public static final Codec<xt> a = azu.a(xt.a::values).dispatch(xt::c, xt.a::a);
   public static final xt b = new xt(new BitSet(0), xt.a.b);
   public static final xt c = new xt(new BitSet(0), xt.a.a);
   public static final ym d = ym.a.a(n.i).a(new xv(xv.a.a, xp.c("chat.filtered")));
   static final MapCodec<xt> e = MapCodec.unit(c);
   static final MapCodec<xt> f = MapCodec.unit(b);
   static final MapCodec<xt> g = ayh.u.xmap(xt::new, xt::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final xt.a j;

   private xt(BitSet $$0, xt.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private xt(BitSet $$0) {
      this.i = $$0;
      this.j = xt.a.c;
   }

   public xt(int $$0) {
      this(new BitSet($$0), xt.a.c);
   }

   private xt.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static xt a(wm $$0) {
      xt.a $$1 = $$0.b(xt.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new xt($$0.w(), xt.a.c);
      };
   }

   public static void a(wm $$0, xt $$1) {
      $$0.a($$1.j);
      if ($$1.j == xt.a.c) {
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
   public xp b(String $$0) {
      return switch (this.j) {
         case a -> xp.b($$0);
         case b -> null;
         case c -> {
            yd $$1 = xp.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(xp.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == xt.a.a;
   }

   public boolean b() {
      return this.j == xt.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         xt $$1 = (xt)$$0;
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

   static enum a implements azu {
      a("pass_through", () -> xt.e),
      b("fully_filtered", () -> xt.f),
      c("partially_filtered", () -> xt.g);

      private final String d;
      private final Supplier<MapCodec<xt>> e;

      private a(final String $$0, final Supplier<MapCodec<xt>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<xt> a() {
         return this.e.get();
      }
   }
}
