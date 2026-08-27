import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class um {
   public static final Codec<um> a = atr.a(um.a::values).dispatch(um::c, um.a::a);
   public static final um b = new um(new BitSet(0), um.a.b);
   public static final um c = new um(new BitSet(0), um.a.a);
   public static final vf d = vf.a.a(n.i).a(new uo(uo.a.a, ui.c("chat.filtered")));
   static final Codec<um> e = Codec.unit(c);
   static final Codec<um> f = Codec.unit(b);
   static final Codec<um> g = asg.s.xmap(um::new, um::d);
   private static final char h = '#';
   private final BitSet i;
   private final um.a j;

   private um(BitSet $$0, um.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private um(BitSet $$0) {
      this.i = $$0;
      this.j = um.a.c;
   }

   public um(int $$0) {
      this(new BitSet($$0), um.a.c);
   }

   private um.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static um a(tl $$0) {
      um.a $$1 = $$0.b(um.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new um($$0.z(), um.a.c);
      };
   }

   public static void a(tl $$0, um $$1) {
      $$0.a($$1.j);
      if ($$1.j == um.a.c) {
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
   public ui b(String $$0) {
      return switch (this.j) {
         case a -> ui.b($$0);
         case b -> null;
         case c -> {
            uw $$1 = ui.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(ui.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == um.a.a;
   }

   public boolean b() {
      return this.j == um.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         um $$1 = (um)$$0;
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

   static enum a implements atr {
      a("pass_through", () -> um.e),
      b("fully_filtered", () -> um.f),
      c("partially_filtered", () -> um.g);

      private final String d;
      private final Supplier<Codec<um>> e;

      private a(String $$0, Supplier<Codec<um>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<um> a() {
         return this.e.get();
      }
   }
}
