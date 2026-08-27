import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class vu {
   public static final Codec<vu> a = axc.a(vu.a::values).dispatch(vu::c, vu.a::a);
   public static final vu b = new vu(new BitSet(0), vu.a.b);
   public static final vu c = new vu(new BitSet(0), vu.a.a);
   public static final wn d = wn.a.a(n.i).a(new vw(vw.a.a, vq.c("chat.filtered")));
   static final Codec<vu> e = Codec.unit(c);
   static final Codec<vu> f = Codec.unit(b);
   static final Codec<vu> g = avq.s.xmap(vu::new, vu::d);
   private static final char h = '#';
   private final BitSet i;
   private final vu.a j;

   private vu(BitSet $$0, vu.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private vu(BitSet $$0) {
      this.i = $$0;
      this.j = vu.a.c;
   }

   public vu(int $$0) {
      this(new BitSet($$0), vu.a.c);
   }

   private vu.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static vu a(uq $$0) {
      vu.a $$1 = $$0.b(vu.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new vu($$0.y(), vu.a.c);
      };
   }

   public static void a(uq $$0, vu $$1) {
      $$0.a($$1.j);
      if ($$1.j == vu.a.c) {
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
   public vq b(String $$0) {
      return switch (this.j) {
         case a -> vq.b($$0);
         case b -> null;
         case c -> {
            we $$1 = vq.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(vq.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == vu.a.a;
   }

   public boolean b() {
      return this.j == vu.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         vu $$1 = (vu)$$0;
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

   static enum a implements axc {
      a("pass_through", () -> vu.e),
      b("fully_filtered", () -> vu.f),
      c("partially_filtered", () -> vu.g);

      private final String d;
      private final Supplier<Codec<vu>> e;

      private a(String $$0, Supplier<Codec<vu>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<vu> a() {
         return this.e.get();
      }
   }
}
