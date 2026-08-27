import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class vw {
   public static final Codec<vw> a = axg.a(vw.a::values).dispatch(vw::c, vw.a::a);
   public static final vw b = new vw(new BitSet(0), vw.a.b);
   public static final vw c = new vw(new BitSet(0), vw.a.a);
   public static final wp d = wp.a.a(n.i).a(new vy(vy.a.a, vs.c("chat.filtered")));
   static final Codec<vw> e = Codec.unit(c);
   static final Codec<vw> f = Codec.unit(b);
   static final Codec<vw> g = avu.s.xmap(vw::new, vw::d);
   private static final char h = '#';
   private final BitSet i;
   private final vw.a j;

   private vw(BitSet $$0, vw.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private vw(BitSet $$0) {
      this.i = $$0;
      this.j = vw.a.c;
   }

   public vw(int $$0) {
      this(new BitSet($$0), vw.a.c);
   }

   private vw.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static vw a(us $$0) {
      vw.a $$1 = $$0.b(vw.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new vw($$0.w(), vw.a.c);
      };
   }

   public static void a(us $$0, vw $$1) {
      $$0.a($$1.j);
      if ($$1.j == vw.a.c) {
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
   public vs b(String $$0) {
      return switch (this.j) {
         case a -> vs.b($$0);
         case b -> null;
         case c -> {
            wg $$1 = vs.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(vs.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == vw.a.a;
   }

   public boolean b() {
      return this.j == vw.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         vw $$1 = (vw)$$0;
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

   static enum a implements axg {
      a("pass_through", () -> vw.e),
      b("fully_filtered", () -> vw.f),
      c("partially_filtered", () -> vw.g);

      private final String d;
      private final Supplier<Codec<vw>> e;

      private a(String $$0, Supplier<Codec<vw>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<vw> a() {
         return this.e.get();
      }
   }
}
