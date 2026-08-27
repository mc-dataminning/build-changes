import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class tl {
   public static final Codec<tl> a = ask.a(tl.a::values).dispatch(tl::c, tl.a::a);
   public static final tl b = new tl(new BitSet(0), tl.a.b);
   public static final tl c = new tl(new BitSet(0), tl.a.a);
   public static final ue d = ue.a.a(n.i).a(new tn(tn.a.a, ti.c("chat.filtered")));
   static final Codec<tl> e = Codec.unit(c);
   static final Codec<tl> f = Codec.unit(b);
   static final Codec<tl> g = arb.r.xmap(tl::new, tl::d);
   private static final char h = '#';
   private final BitSet i;
   private final tl.a j;

   private tl(BitSet $$0, tl.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private tl(BitSet $$0) {
      this.i = $$0;
      this.j = tl.a.c;
   }

   public tl(int $$0) {
      this(new BitSet($$0), tl.a.c);
   }

   private tl.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static tl a(sl $$0) {
      tl.a $$1 = $$0.b(tl.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new tl($$0.y(), tl.a.c);
      };
   }

   public static void a(sl $$0, tl $$1) {
      $$0.a($$1.j);
      if ($$1.j == tl.a.c) {
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
   public ti b(String $$0) {
      return switch (this.j) {
         case a -> ti.b($$0);
         case b -> null;
         case c -> {
            tv $$1 = ti.h();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(ti.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == tl.a.a;
   }

   public boolean b() {
      return this.j == tl.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         tl $$1 = (tl)$$0;
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

   static enum a implements ask {
      a("pass_through", () -> tl.e),
      b("fully_filtered", () -> tl.f),
      c("partially_filtered", () -> tl.g);

      private final String d;
      private final Supplier<Codec<tl>> e;

      private a(String $$0, Supplier<Codec<tl>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<tl> a() {
         return this.e.get();
      }
   }
}
