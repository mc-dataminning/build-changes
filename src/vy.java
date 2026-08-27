import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class vy {
   public static final Codec<vy> a = axq.a(vy.a::values).dispatch(vy::c, vy.a::a);
   public static final vy b = new vy(new BitSet(0), vy.a.b);
   public static final vy c = new vy(new BitSet(0), vy.a.a);
   public static final wr d = wr.a.a(n.i).a(new wa(wa.a.a, vu.c("chat.filtered")));
   static final Codec<vy> e = Codec.unit(c);
   static final Codec<vy> f = Codec.unit(b);
   static final Codec<vy> g = awe.t.xmap(vy::new, vy::d);
   private static final char h = '#';
   private final BitSet i;
   private final vy.a j;

   private vy(BitSet $$0, vy.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private vy(BitSet $$0) {
      this.i = $$0;
      this.j = vy.a.c;
   }

   public vy(int $$0) {
      this(new BitSet($$0), vy.a.c);
   }

   private vy.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static vy a(uu $$0) {
      vy.a $$1 = $$0.b(vy.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new vy($$0.w(), vy.a.c);
      };
   }

   public static void a(uu $$0, vy $$1) {
      $$0.a($$1.j);
      if ($$1.j == vy.a.c) {
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
   public vu b(String $$0) {
      return switch (this.j) {
         case a -> vu.b($$0);
         case b -> null;
         case c -> {
            wi $$1 = vu.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(vu.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == vy.a.a;
   }

   public boolean b() {
      return this.j == vy.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         vy $$1 = (vy)$$0;
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

   static enum a implements axq {
      a("pass_through", () -> vy.e),
      b("fully_filtered", () -> vy.f),
      c("partially_filtered", () -> vy.g);

      private final String d;
      private final Supplier<Codec<vy>> e;

      private a(String $$0, Supplier<Codec<vy>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<vy> a() {
         return this.e.get();
      }
   }
}
