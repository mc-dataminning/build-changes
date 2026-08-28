import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class xz {
   public static final Codec<xz> a = bba.a(xz.a::values).dispatch(xz::c, xz.a::a);
   public static final xz b = new xz(new BitSet(0), xz.a.b);
   public static final xz c = new xz(new BitSet(0), xz.a.a);
   public static final ys d = ys.a.a(n.i).a(new yb(yb.a.a, xv.c("chat.filtered")));
   static final MapCodec<xz> e = MapCodec.unit(c);
   static final MapCodec<xz> f = MapCodec.unit(b);
   static final MapCodec<xz> g = azn.w.xmap(xz::new, xz::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final xz.a j;

   private xz(BitSet $$0, xz.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private xz(BitSet $$0) {
      this.i = $$0;
      this.j = xz.a.c;
   }

   public xz(int $$0) {
      this(new BitSet($$0), xz.a.c);
   }

   private xz.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static xz a(ws $$0) {
      xz.a $$1 = $$0.b(xz.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new xz($$0.w(), xz.a.c);
      };
   }

   public static void a(ws $$0, xz $$1) {
      $$0.a($$1.j);
      if ($$1.j == xz.a.c) {
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
   public xv b(String $$0) {
      return switch (this.j) {
         case a -> xv.b($$0);
         case b -> null;
         case c -> {
            yj $$1 = xv.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(xv.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == xz.a.a;
   }

   public boolean b() {
      return this.j == xz.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         xz $$1 = (xz)$$0;
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

   static enum a implements bba {
      a("pass_through", () -> xz.e),
      b("fully_filtered", () -> xz.f),
      c("partially_filtered", () -> xz.g);

      private final String d;
      private final Supplier<MapCodec<xz>> e;

      private a(final String $$0, final Supplier<MapCodec<xz>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<xz> a() {
         return this.e.get();
      }
   }
}
