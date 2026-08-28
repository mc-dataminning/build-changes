import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class wt {
   public static final Codec<wt> a = azv.a(wt.a::values).dispatch(wt::c, wt.a::a);
   public static final wt b = new wt(new BitSet(0), wt.a.b);
   public static final wt c = new wt(new BitSet(0), wt.a.a);
   public static final xm d = xm.a.a(n.i).a(new wv.e(wp.c("chat.filtered")));
   static final MapCodec<wt> e = MapCodec.unit(c);
   static final MapCodec<wt> f = MapCodec.unit(b);
   static final MapCodec<wt> g = ayi.w.xmap(wt::new, wt::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final wt.a j;

   private wt(BitSet $$0, wt.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private wt(BitSet $$0) {
      this.i = $$0;
      this.j = wt.a.c;
   }

   public wt(int $$0) {
      this(new BitSet($$0), wt.a.c);
   }

   private wt.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static wt a(vl $$0) {
      wt.a $$1 = $$0.b(wt.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new wt($$0.w(), wt.a.c);
      };
   }

   public static void a(vl $$0, wt $$1) {
      $$0.a($$1.j);
      if ($$1.j == wt.a.c) {
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
   public wp b(String $$0) {
      return switch (this.j) {
         case a -> wp.b($$0);
         case b -> null;
         case c -> {
            xd $$1 = wp.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(wp.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == wt.a.a;
   }

   public boolean b() {
      return this.j == wt.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         wt $$1 = (wt)$$0;
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

   static enum a implements azv {
      a("pass_through", () -> wt.e),
      b("fully_filtered", () -> wt.f),
      c("partially_filtered", () -> wt.g);

      private final String d;
      private final Supplier<MapCodec<wt>> e;

      private a(final String $$0, final Supplier<MapCodec<wt>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<wt> a() {
         return this.e.get();
      }
   }
}
