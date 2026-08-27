import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class wk {
   public static final Codec<wk> a = aye.a(wk.a::values).dispatch(wk::c, wk.a::a);
   public static final wk b = new wk(new BitSet(0), wk.a.b);
   public static final wk c = new wk(new BitSet(0), wk.a.a);
   public static final xd d = xd.a.a(n.i).a(new wm(wm.a.a, wg.c("chat.filtered")));
   static final Codec<wk> e = Codec.unit(c);
   static final Codec<wk> f = Codec.unit(b);
   static final Codec<wk> g = aws.s.xmap(wk::new, wk::d);
   private static final char h = '#';
   private final BitSet i;
   private final wk.a j;

   private wk(BitSet $$0, wk.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private wk(BitSet $$0) {
      this.i = $$0;
      this.j = wk.a.c;
   }

   public wk(int $$0) {
      this(new BitSet($$0), wk.a.c);
   }

   private wk.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static wk a(vg $$0) {
      wk.a $$1 = $$0.b(wk.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new wk($$0.w(), wk.a.c);
      };
   }

   public static void a(vg $$0, wk $$1) {
      $$0.a($$1.j);
      if ($$1.j == wk.a.c) {
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
   public wg b(String $$0) {
      return switch (this.j) {
         case a -> wg.b($$0);
         case b -> null;
         case c -> {
            wu $$1 = wg.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(wg.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == wk.a.a;
   }

   public boolean b() {
      return this.j == wk.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         wk $$1 = (wk)$$0;
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

   static enum a implements aye {
      a("pass_through", () -> wk.e),
      b("fully_filtered", () -> wk.f),
      c("partially_filtered", () -> wk.g);

      private final String d;
      private final Supplier<Codec<wk>> e;

      private a(String $$0, Supplier<Codec<wk>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<wk> a() {
         return this.e.get();
      }
   }
}
