import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class ww {
   public static final Codec<ww> a = ayq.a(ww.a::values).dispatch(ww::c, ww.a::a);
   public static final ww b = new ww(new BitSet(0), ww.a.b);
   public static final ww c = new ww(new BitSet(0), ww.a.a);
   public static final xp d = xp.a.a(n.i).a(new wy(wy.a.a, ws.c("chat.filtered")));
   static final Codec<ww> e = Codec.unit(c);
   static final Codec<ww> f = Codec.unit(b);
   static final Codec<ww> g = axe.s.xmap(ww::new, ww::d);
   private static final char h = '#';
   private final BitSet i;
   private final ww.a j;

   private ww(BitSet $$0, ww.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private ww(BitSet $$0) {
      this.i = $$0;
      this.j = ww.a.c;
   }

   public ww(int $$0) {
      this(new BitSet($$0), ww.a.c);
   }

   private ww.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static ww a(vs $$0) {
      ww.a $$1 = $$0.b(ww.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new ww($$0.w(), ww.a.c);
      };
   }

   public static void a(vs $$0, ww $$1) {
      $$0.a($$1.j);
      if ($$1.j == ww.a.c) {
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
   public ws b(String $$0) {
      return switch (this.j) {
         case a -> ws.b($$0);
         case b -> null;
         case c -> {
            xg $$1 = ws.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(ws.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == ww.a.a;
   }

   public boolean b() {
      return this.j == ww.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ww $$1 = (ww)$$0;
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

   static enum a implements ayq {
      a("pass_through", () -> ww.e),
      b("fully_filtered", () -> ww.f),
      c("partially_filtered", () -> ww.g);

      private final String d;
      private final Supplier<Codec<ww>> e;

      private a(String $$0, Supplier<Codec<ww>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<ww> a() {
         return this.e.get();
      }
   }
}
