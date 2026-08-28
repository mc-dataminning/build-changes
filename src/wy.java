import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class wy {
   public static final Codec<wy> a = azc.a(wy.a::values).dispatch(wy::c, wy.a::a);
   public static final wy b = new wy(new BitSet(0), wy.a.b);
   public static final wy c = new wy(new BitSet(0), wy.a.a);
   public static final xr d = xr.a.a(n.i).a(new xa(xa.a.a, wu.c("chat.filtered")));
   static final MapCodec<wy> e = MapCodec.unit(c);
   static final MapCodec<wy> f = MapCodec.unit(b);
   static final MapCodec<wy> g = axo.u.xmap(wy::new, wy::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final wy.a j;

   private wy(BitSet $$0, wy.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private wy(BitSet $$0) {
      this.i = $$0;
      this.j = wy.a.c;
   }

   public wy(int $$0) {
      this(new BitSet($$0), wy.a.c);
   }

   private wy.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static wy a(vr $$0) {
      wy.a $$1 = $$0.b(wy.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new wy($$0.w(), wy.a.c);
      };
   }

   public static void a(vr $$0, wy $$1) {
      $$0.a($$1.j);
      if ($$1.j == wy.a.c) {
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
   public wu b(String $$0) {
      return switch (this.j) {
         case a -> wu.b($$0);
         case b -> null;
         case c -> {
            xi $$1 = wu.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(wu.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == wy.a.a;
   }

   public boolean b() {
      return this.j == wy.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         wy $$1 = (wy)$$0;
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

   static enum a implements azc {
      a("pass_through", () -> wy.e),
      b("fully_filtered", () -> wy.f),
      c("partially_filtered", () -> wy.g);

      private final String d;
      private final Supplier<MapCodec<wy>> e;

      private a(final String $$0, final Supplier<MapCodec<wy>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<wy> a() {
         return this.e.get();
      }
   }
}
