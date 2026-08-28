import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class wz {
   public static final Codec<wz> a = bag.a(wz.a::values).dispatch(wz::c, wz.a::a);
   public static final wz b = new wz(new BitSet(0), wz.a.b);
   public static final wz c = new wz(new BitSet(0), wz.a.a);
   public static final xs d = xs.a.a(n.i).a(new xb.e(wv.c("chat.filtered")));
   static final MapCodec<wz> e = MapCodec.unit(c);
   static final MapCodec<wz> f = MapCodec.unit(b);
   static final MapCodec<wz> g = ays.w.xmap(wz::new, wz::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final wz.a j;

   private wz(BitSet $$0, wz.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private wz(BitSet $$0) {
      this.i = $$0;
      this.j = wz.a.c;
   }

   public wz(int $$0) {
      this(new BitSet($$0), wz.a.c);
   }

   private wz.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static wz a(vr $$0) {
      wz.a $$1 = $$0.b(wz.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new wz($$0.w(), wz.a.c);
      };
   }

   public static void a(vr $$0, wz $$1) {
      $$0.a($$1.j);
      if ($$1.j == wz.a.c) {
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
   public wv b(String $$0) {
      return switch (this.j) {
         case a -> wv.b($$0);
         case b -> null;
         case c -> {
            xj $$1 = wv.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(wv.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == wz.a.a;
   }

   public boolean b() {
      return this.j == wz.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         wz $$1 = (wz)$$0;
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
      a("pass_through", () -> wz.e),
      b("fully_filtered", () -> wz.f),
      c("partially_filtered", () -> wz.g);

      private final String d;
      private final Supplier<MapCodec<wz>> e;

      private a(final String $$0, final Supplier<MapCodec<wz>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<wz> a() {
         return this.e.get();
      }
   }
}
