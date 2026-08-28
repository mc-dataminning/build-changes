import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class xe {
   public static final Codec<xe> a = bam.a(xe.a::values).dispatch(xe::c, xe.a::a);
   public static final xe b = new xe(new BitSet(0), xe.a.b);
   public static final xe c = new xe(new BitSet(0), xe.a.a);
   public static final xx d = xx.a.a(o.i).a(new xg.e(xa.c("chat.filtered")));
   static final MapCodec<xe> e = MapCodec.unit(c);
   static final MapCodec<xe> f = MapCodec.unit(b);
   static final MapCodec<xe> g = ayw.w.xmap(xe::new, xe::d).fieldOf("value");
   private static final char h = '#';
   private final BitSet i;
   private final xe.a j;

   private xe(BitSet $$0, xe.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private xe(BitSet $$0) {
      this.i = $$0;
      this.j = xe.a.c;
   }

   public xe(int $$0) {
      this(new BitSet($$0), xe.a.c);
   }

   private xe.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static xe a(vw $$0) {
      xe.a $$1 = $$0.b(xe.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new xe($$0.w(), xe.a.c);
      };
   }

   public static void a(vw $$0, xe $$1) {
      $$0.a($$1.j);
      if ($$1.j == xe.a.c) {
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
   public xa b(String $$0) {
      return switch (this.j) {
         case a -> xa.b($$0);
         case b -> null;
         case c -> {
            xo $$1 = xa.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(xa.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == xe.a.a;
   }

   public boolean b() {
      return this.j == xe.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         xe $$1 = (xe)$$0;
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

   static enum a implements bam {
      a("pass_through", () -> xe.e),
      b("fully_filtered", () -> xe.f),
      c("partially_filtered", () -> xe.g);

      private final String d;
      private final Supplier<MapCodec<xe>> e;

      private a(final String $$0, final Supplier<MapCodec<xe>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private MapCodec<xe> a() {
         return this.e.get();
      }
   }
}
