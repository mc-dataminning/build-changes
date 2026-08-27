import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class vj {
   public static final Codec<vj> a = avk.a(vj.a::values).dispatch(vj::c, vj.a::a);
   public static final vj b = new vj(new BitSet(0), vj.a.b);
   public static final vj c = new vj(new BitSet(0), vj.a.a);
   public static final wc d = wc.a.a(n.i).a(new vl(vl.a.a, vf.c("chat.filtered")));
   static final Codec<vj> e = Codec.unit(c);
   static final Codec<vj> f = Codec.unit(b);
   static final Codec<vj> g = atw.s.xmap(vj::new, vj::d);
   private static final char h = '#';
   private final BitSet i;
   private final vj.a j;

   private vj(BitSet $$0, vj.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private vj(BitSet $$0) {
      this.i = $$0;
      this.j = vj.a.c;
   }

   public vj(int $$0) {
      this(new BitSet($$0), vj.a.c);
   }

   private vj.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static vj a(ui $$0) {
      vj.a $$1 = $$0.b(vj.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new vj($$0.z(), vj.a.c);
      };
   }

   public static void a(ui $$0, vj $$1) {
      $$0.a($$1.j);
      if ($$1.j == vj.a.c) {
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
   public vf b(String $$0) {
      return switch (this.j) {
         case a -> vf.b($$0);
         case b -> null;
         case c -> {
            vt $$1 = vf.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(vf.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == vj.a.a;
   }

   public boolean b() {
      return this.j == vj.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         vj $$1 = (vj)$$0;
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

   static enum a implements avk {
      a("pass_through", () -> vj.e),
      b("fully_filtered", () -> vj.f),
      c("partially_filtered", () -> vj.g);

      private final String d;
      private final Supplier<Codec<vj>> e;

      private a(String $$0, Supplier<Codec<vj>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<vj> a() {
         return this.e.get();
      }
   }
}
