import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class tq {
   public static final Codec<tq> a = asr.a(tq.a::values).dispatch(tq::c, tq.a::a);
   public static final tq b = new tq(new BitSet(0), tq.a.b);
   public static final tq c = new tq(new BitSet(0), tq.a.a);
   public static final uj d = uj.a.a(n.i).a(new ts(ts.a.a, tn.c("chat.filtered")));
   static final Codec<tq> e = Codec.unit(c);
   static final Codec<tq> f = Codec.unit(b);
   static final Codec<tq> g = arh.s.xmap(tq::new, tq::d);
   private static final char h = '#';
   private final BitSet i;
   private final tq.a j;

   private tq(BitSet $$0, tq.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private tq(BitSet $$0) {
      this.i = $$0;
      this.j = tq.a.c;
   }

   public tq(int $$0) {
      this(new BitSet($$0), tq.a.c);
   }

   private tq.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static tq a(sq $$0) {
      tq.a $$1 = $$0.b(tq.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new tq($$0.y(), tq.a.c);
      };
   }

   public static void a(sq $$0, tq $$1) {
      $$0.a($$1.j);
      if ($$1.j == tq.a.c) {
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
   public tn b(String $$0) {
      return switch (this.j) {
         case a -> tn.b($$0);
         case b -> null;
         case c -> {
            ua $$1 = tn.h();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(tn.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == tq.a.a;
   }

   public boolean b() {
      return this.j == tq.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         tq $$1 = (tq)$$0;
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

   static enum a implements asr {
      a("pass_through", () -> tq.e),
      b("fully_filtered", () -> tq.f),
      c("partially_filtered", () -> tq.g);

      private final String d;
      private final Supplier<Codec<tq>> e;

      private a(String $$0, Supplier<Codec<tq>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<tq> a() {
         return this.e.get();
      }
   }
}
