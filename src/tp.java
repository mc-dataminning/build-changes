import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class tp {
   public static final Codec<tp> a = asp.a(tp.a::values).dispatch(tp::c, tp.a::a);
   public static final tp b = new tp(new BitSet(0), tp.a.b);
   public static final tp c = new tp(new BitSet(0), tp.a.a);
   public static final ui d = ui.a.a(n.i).a(new tr(tr.a.a, tm.c("chat.filtered")));
   static final Codec<tp> e = Codec.unit(c);
   static final Codec<tp> f = Codec.unit(b);
   static final Codec<tp> g = arg.s.xmap(tp::new, tp::d);
   private static final char h = '#';
   private final BitSet i;
   private final tp.a j;

   private tp(BitSet $$0, tp.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private tp(BitSet $$0) {
      this.i = $$0;
      this.j = tp.a.c;
   }

   public tp(int $$0) {
      this(new BitSet($$0), tp.a.c);
   }

   private tp.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static tp a(sp $$0) {
      tp.a $$1 = $$0.b(tp.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new tp($$0.y(), tp.a.c);
      };
   }

   public static void a(sp $$0, tp $$1) {
      $$0.a($$1.j);
      if ($$1.j == tp.a.c) {
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
   public tm b(String $$0) {
      return switch (this.j) {
         case a -> tm.b($$0);
         case b -> null;
         case c -> {
            tz $$1 = tm.h();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(tm.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == tp.a.a;
   }

   public boolean b() {
      return this.j == tp.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         tp $$1 = (tp)$$0;
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

   static enum a implements asp {
      a("pass_through", () -> tp.e),
      b("fully_filtered", () -> tp.f),
      c("partially_filtered", () -> tp.g);

      private final String d;
      private final Supplier<Codec<tp>> e;

      private a(String $$0, Supplier<Codec<tp>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<tp> a() {
         return this.e.get();
      }
   }
}
