import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class wm {
   public static final Codec<wm> a = ayg.a(wm.a::values).dispatch(wm::c, wm.a::a);
   public static final wm b = new wm(new BitSet(0), wm.a.b);
   public static final wm c = new wm(new BitSet(0), wm.a.a);
   public static final xf d = xf.a.a(n.i).a(new wo(wo.a.a, wi.c("chat.filtered")));
   static final Codec<wm> e = Codec.unit(c);
   static final Codec<wm> f = Codec.unit(b);
   static final Codec<wm> g = awu.s.xmap(wm::new, wm::d);
   private static final char h = '#';
   private final BitSet i;
   private final wm.a j;

   private wm(BitSet $$0, wm.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private wm(BitSet $$0) {
      this.i = $$0;
      this.j = wm.a.c;
   }

   public wm(int $$0) {
      this(new BitSet($$0), wm.a.c);
   }

   private wm.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static wm a(vi $$0) {
      wm.a $$1 = $$0.b(wm.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new wm($$0.w(), wm.a.c);
      };
   }

   public static void a(vi $$0, wm $$1) {
      $$0.a($$1.j);
      if ($$1.j == wm.a.c) {
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
   public wi b(String $$0) {
      return switch (this.j) {
         case a -> wi.b($$0);
         case b -> null;
         case c -> {
            ww $$1 = wi.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(wi.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == wm.a.a;
   }

   public boolean b() {
      return this.j == wm.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         wm $$1 = (wm)$$0;
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

   static enum a implements ayg {
      a("pass_through", () -> wm.e),
      b("fully_filtered", () -> wm.f),
      c("partially_filtered", () -> wm.g);

      private final String d;
      private final Supplier<Codec<wm>> e;

      private a(String $$0, Supplier<Codec<wm>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<wm> a() {
         return this.e.get();
      }
   }
}
