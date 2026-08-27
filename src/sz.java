import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class sz {
   public static final Codec<sz> a = apr.a(sz.a::values).dispatch(sz::c, sz.a::a);
   public static final sz b = new sz(new BitSet(0), sz.a.b);
   public static final sz c = new sz(new BitSet(0), sz.a.a);
   public static final ts d = ts.a.a(n.i).a(new tb(tb.a.a, sw.c("chat.filtered")));
   static final Codec<sz> e = Codec.unit(c);
   static final Codec<sz> f = Codec.unit(b);
   static final Codec<sz> g = aoi.r.xmap(sz::new, sz::d);
   private static final char h = '#';
   private final BitSet i;
   private final sz.a j;

   private sz(BitSet $$0, sz.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private sz(BitSet $$0) {
      this.i = $$0;
      this.j = sz.a.c;
   }

   public sz(int $$0) {
      this(new BitSet($$0), sz.a.c);
   }

   private sz.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static sz a(sf $$0) {
      sz.a $$1 = $$0.b(sz.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new sz($$0.y(), sz.a.c);
      };
   }

   public static void a(sf $$0, sz $$1) {
      $$0.a($$1.j);
      if ($$1.j == sz.a.c) {
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
   public sw b(String $$0) {
      return switch (this.j) {
         case a -> sw.b($$0);
         case b -> null;
         case c -> {
            tj $$1 = sw.h();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(sw.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == sz.a.a;
   }

   public boolean b() {
      return this.j == sz.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         sz $$1 = (sz)$$0;
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

   static enum a implements apr {
      a("pass_through", () -> sz.e),
      b("fully_filtered", () -> sz.f),
      c("partially_filtered", () -> sz.g);

      private final String d;
      private final Supplier<Codec<sz>> e;

      private a(String $$0, Supplier<Codec<sz>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<sz> a() {
         return this.e.get();
      }
   }
}
