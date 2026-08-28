import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class ws {
   public static final Codec<ws> a = azu.a(ws.a::values).dispatch(ws::c, ws.a::a);
   public static final ws b = new ws(new BitSet(0), ws.a.b);
   public static final ws c = new ws(new BitSet(0), ws.a.a);
   public static final xl d = xl.a.a(n.i).a(new wu(wu.a.a, wo.c("chat.filtered")));
   static final MapCodec<ws> e = MapCodec.unit(c);
   static final MapCodec<ws> f = MapCodec.unit(b);
   static final MapCodec<ws> g = ayh.w.xmap(ws::new, ws::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final ws.a j;

   private ws(BitSet $$0, ws.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private ws(BitSet $$0) {
      this.i = $$0;
      this.j = ws.a.c;
   }

   public ws(int $$0) {
      this(new BitSet($$0), ws.a.c);
   }

   private ws.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static ws a(vl $$0) {
      ws.a $$1 = $$0.b(ws.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new ws($$0.w(), ws.a.c);
      };
   }

   public static void a(vl $$0, ws $$1) {
      $$0.a($$1.j);
      if ($$1.j == ws.a.c) {
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
   public wo b(String $$0) {
      return switch (this.j) {
         case a -> wo.b($$0);
         case b -> null;
         case c -> {
            xc $$1 = wo.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(wo.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == ws.a.a;
   }

   public boolean b() {
      return this.j == ws.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ws $$1 = (ws)$$0;
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
      a("pass_through", () -> ws.e),
      b("fully_filtered", () -> ws.f),
      c("partially_filtered", () -> ws.g);

      private final String d;
      private final Supplier<MapCodec<ws>> e;

      private a(final String $$0, final Supplier<MapCodec<ws>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<ws> a() {
         return this.e.get();
      }
   }
}
