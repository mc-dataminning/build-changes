import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class to {
   public static final Codec<to> a = asp.a(to.a::values).dispatch(to::c, to.a::a);
   public static final to b = new to(new BitSet(0), to.a.b);
   public static final to c = new to(new BitSet(0), to.a.a);
   public static final uh d = uh.a.a(n.i).a(new tq(tq.a.a, tl.c("chat.filtered")));
   static final Codec<to> e = Codec.unit(c);
   static final Codec<to> f = Codec.unit(b);
   static final Codec<to> g = arg.s.xmap(to::new, to::d);
   private static final char h = '#';
   private final BitSet i;
   private final to.a j;

   private to(BitSet $$0, to.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private to(BitSet $$0) {
      this.i = $$0;
      this.j = to.a.c;
   }

   public to(int $$0) {
      this(new BitSet($$0), to.a.c);
   }

   private to.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static to a(so $$0) {
      to.a $$1 = $$0.b(to.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new to($$0.y(), to.a.c);
      };
   }

   public static void a(so $$0, to $$1) {
      $$0.a($$1.j);
      if ($$1.j == to.a.c) {
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
   public tl b(String $$0) {
      return switch (this.j) {
         case a -> tl.b($$0);
         case b -> null;
         case c -> {
            ty $$1 = tl.h();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(tl.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == to.a.a;
   }

   public boolean b() {
      return this.j == to.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         to $$1 = (to)$$0;
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
      a("pass_through", () -> to.e),
      b("fully_filtered", () -> to.f),
      c("partially_filtered", () -> to.g);

      private final String d;
      private final Supplier<Codec<to>> e;

      private a(String $$0, Supplier<Codec<to>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<to> a() {
         return this.e.get();
      }
   }
}
