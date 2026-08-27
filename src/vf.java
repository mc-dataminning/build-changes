import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class vf {
   public static final Codec<vf> a = aut.a(vf.a::values).dispatch(vf::c, vf.a::a);
   public static final vf b = new vf(new BitSet(0), vf.a.b);
   public static final vf c = new vf(new BitSet(0), vf.a.a);
   public static final vy d = vy.a.a(n.i).a(new vh(vh.a.a, vb.c("chat.filtered")));
   static final Codec<vf> e = Codec.unit(c);
   static final Codec<vf> f = Codec.unit(b);
   static final Codec<vf> g = atg.s.xmap(vf::new, vf::d);
   private static final char h = '#';
   private final BitSet i;
   private final vf.a j;

   private vf(BitSet $$0, vf.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private vf(BitSet $$0) {
      this.i = $$0;
      this.j = vf.a.c;
   }

   public vf(int $$0) {
      this(new BitSet($$0), vf.a.c);
   }

   private vf.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static vf a(ue $$0) {
      vf.a $$1 = $$0.b(vf.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new vf($$0.z(), vf.a.c);
      };
   }

   public static void a(ue $$0, vf $$1) {
      $$0.a($$1.j);
      if ($$1.j == vf.a.c) {
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
   public vb b(String $$0) {
      return switch (this.j) {
         case a -> vb.b($$0);
         case b -> null;
         case c -> {
            vp $$1 = vb.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(vb.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == vf.a.a;
   }

   public boolean b() {
      return this.j == vf.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         vf $$1 = (vf)$$0;
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

   static enum a implements aut {
      a("pass_through", () -> vf.e),
      b("fully_filtered", () -> vf.f),
      c("partially_filtered", () -> vf.g);

      private final String d;
      private final Supplier<Codec<vf>> e;

      private a(String $$0, Supplier<Codec<vf>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<vf> a() {
         return this.e.get();
      }
   }
}
