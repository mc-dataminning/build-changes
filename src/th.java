import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class th {
   public static final Codec<th> a = asf.a(th.a::values).dispatch(th::c, th.a::a);
   public static final th b = new th(new BitSet(0), th.a.b);
   public static final th c = new th(new BitSet(0), th.a.a);
   public static final ua d = ua.a.a(n.i).a(new tj(tj.a.a, te.c("chat.filtered")));
   static final Codec<th> e = Codec.unit(c);
   static final Codec<th> f = Codec.unit(b);
   static final Codec<th> g = aqw.r.xmap(th::new, th::d);
   private static final char h = '#';
   private final BitSet i;
   private final th.a j;

   private th(BitSet $$0, th.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private th(BitSet $$0) {
      this.i = $$0;
      this.j = th.a.c;
   }

   public th(int $$0) {
      this(new BitSet($$0), th.a.c);
   }

   private th.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static th a(sh $$0) {
      th.a $$1 = $$0.b(th.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new th($$0.y(), th.a.c);
      };
   }

   public static void a(sh $$0, th $$1) {
      $$0.a($$1.j);
      if ($$1.j == th.a.c) {
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
   public te b(String $$0) {
      return switch (this.j) {
         case a -> te.b($$0);
         case b -> null;
         case c -> {
            tr $$1 = te.h();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(te.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == th.a.a;
   }

   public boolean b() {
      return this.j == th.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         th $$1 = (th)$$0;
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

   static enum a implements asf {
      a("pass_through", () -> th.e),
      b("fully_filtered", () -> th.f),
      c("partially_filtered", () -> th.g);

      private final String d;
      private final Supplier<Codec<th>> e;

      private a(String $$0, Supplier<Codec<th>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<th> a() {
         return this.e.get();
      }
   }
}
