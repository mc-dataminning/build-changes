import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class ti {
   public static final Codec<ti> a = ash.a(ti.a::values).dispatch(ti::c, ti.a::a);
   public static final ti b = new ti(new BitSet(0), ti.a.b);
   public static final ti c = new ti(new BitSet(0), ti.a.a);
   public static final ub d = ub.a.a(n.i).a(new tk(tk.a.a, tf.c("chat.filtered")));
   static final Codec<ti> e = Codec.unit(c);
   static final Codec<ti> f = Codec.unit(b);
   static final Codec<ti> g = aqy.r.xmap(ti::new, ti::d);
   private static final char h = '#';
   private final BitSet i;
   private final ti.a j;

   private ti(BitSet $$0, ti.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private ti(BitSet $$0) {
      this.i = $$0;
      this.j = ti.a.c;
   }

   public ti(int $$0) {
      this(new BitSet($$0), ti.a.c);
   }

   private ti.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static ti a(si $$0) {
      ti.a $$1 = $$0.b(ti.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new ti($$0.y(), ti.a.c);
      };
   }

   public static void a(si $$0, ti $$1) {
      $$0.a($$1.j);
      if ($$1.j == ti.a.c) {
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
   public tf b(String $$0) {
      return switch (this.j) {
         case a -> tf.b($$0);
         case b -> null;
         case c -> {
            ts $$1 = tf.h();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(tf.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == ti.a.a;
   }

   public boolean b() {
      return this.j == ti.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ti $$1 = (ti)$$0;
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

   static enum a implements ash {
      a("pass_through", () -> ti.e),
      b("fully_filtered", () -> ti.f),
      c("partially_filtered", () -> ti.g);

      private final String d;
      private final Supplier<Codec<ti>> e;

      private a(String $$0, Supplier<Codec<ti>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<ti> a() {
         return this.e.get();
      }
   }
}
