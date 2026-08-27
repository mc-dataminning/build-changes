import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class uv {
   public static final Codec<uv> a = aub.a(uv.a::values).dispatch(uv::c, uv.a::a);
   public static final uv b = new uv(new BitSet(0), uv.a.b);
   public static final uv c = new uv(new BitSet(0), uv.a.a);
   public static final vo d = vo.a.a(n.i).a(new ux(ux.a.a, ur.c("chat.filtered")));
   static final Codec<uv> e = Codec.unit(c);
   static final Codec<uv> f = Codec.unit(b);
   static final Codec<uv> g = asq.s.xmap(uv::new, uv::d);
   private static final char h = '#';
   private final BitSet i;
   private final uv.a j;

   private uv(BitSet $$0, uv.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private uv(BitSet $$0) {
      this.i = $$0;
      this.j = uv.a.c;
   }

   public uv(int $$0) {
      this(new BitSet($$0), uv.a.c);
   }

   private uv.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static uv a(tu $$0) {
      uv.a $$1 = $$0.b(uv.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new uv($$0.z(), uv.a.c);
      };
   }

   public static void a(tu $$0, uv $$1) {
      $$0.a($$1.j);
      if ($$1.j == uv.a.c) {
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
   public ur b(String $$0) {
      return switch (this.j) {
         case a -> ur.b($$0);
         case b -> null;
         case c -> {
            vf $$1 = ur.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(ur.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == uv.a.a;
   }

   public boolean b() {
      return this.j == uv.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         uv $$1 = (uv)$$0;
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

   static enum a implements aub {
      a("pass_through", () -> uv.e),
      b("fully_filtered", () -> uv.f),
      c("partially_filtered", () -> uv.g);

      private final String d;
      private final Supplier<Codec<uv>> e;

      private a(String $$0, Supplier<Codec<uv>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<uv> a() {
         return this.e.get();
      }
   }
}
