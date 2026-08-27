import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class vk {
   public static final Codec<vk> a = avl.a(vk.a::values).dispatch(vk::c, vk.a::a);
   public static final vk b = new vk(new BitSet(0), vk.a.b);
   public static final vk c = new vk(new BitSet(0), vk.a.a);
   public static final wd d = wd.a.a(n.i).a(new vm(vm.a.a, vg.c("chat.filtered")));
   static final Codec<vk> e = Codec.unit(c);
   static final Codec<vk> f = Codec.unit(b);
   static final Codec<vk> g = atx.s.xmap(vk::new, vk::d);
   private static final char h = '#';
   private final BitSet i;
   private final vk.a j;

   private vk(BitSet $$0, vk.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private vk(BitSet $$0) {
      this.i = $$0;
      this.j = vk.a.c;
   }

   public vk(int $$0) {
      this(new BitSet($$0), vk.a.c);
   }

   private vk.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static vk a(uj $$0) {
      vk.a $$1 = $$0.b(vk.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new vk($$0.z(), vk.a.c);
      };
   }

   public static void a(uj $$0, vk $$1) {
      $$0.a($$1.j);
      if ($$1.j == vk.a.c) {
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
   public vg b(String $$0) {
      return switch (this.j) {
         case a -> vg.b($$0);
         case b -> null;
         case c -> {
            vu $$1 = vg.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(vg.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == vk.a.a;
   }

   public boolean b() {
      return this.j == vk.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         vk $$1 = (vk)$$0;
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

   static enum a implements avl {
      a("pass_through", () -> vk.e),
      b("fully_filtered", () -> vk.f),
      c("partially_filtered", () -> vk.g);

      private final String d;
      private final Supplier<Codec<vk>> e;

      private a(String $$0, Supplier<Codec<vk>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<vk> a() {
         return this.e.get();
      }
   }
}
