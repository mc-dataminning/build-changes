import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class vh {
   public static final Codec<vh> a = ave.a(vh.a::values).dispatch(vh::c, vh.a::a);
   public static final vh b = new vh(new BitSet(0), vh.a.b);
   public static final vh c = new vh(new BitSet(0), vh.a.a);
   public static final wa d = wa.a.a(n.i).a(new vj(vj.a.a, vd.c("chat.filtered")));
   static final Codec<vh> e = Codec.unit(c);
   static final Codec<vh> f = Codec.unit(b);
   static final Codec<vh> g = atq.s.xmap(vh::new, vh::d);
   private static final char h = '#';
   private final BitSet i;
   private final vh.a j;

   private vh(BitSet $$0, vh.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   private vh(BitSet $$0) {
      this.i = $$0;
      this.j = vh.a.c;
   }

   public vh(int $$0) {
      this(new BitSet($$0), vh.a.c);
   }

   private vh.a c() {
      return this.j;
   }

   private BitSet d() {
      return this.i;
   }

   public static vh a(ug $$0) {
      vh.a $$1 = $$0.b(vh.a.class);

      return switch ($$1) {
         case a -> c;
         case b -> b;
         case c -> new vh($$0.z(), vh.a.c);
      };
   }

   public static void a(ug $$0, vh $$1) {
      $$0.a($$1.j);
      if ($$1.j == vh.a.c) {
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
   public vd b(String $$0) {
      return switch (this.j) {
         case a -> vd.b($$0);
         case b -> null;
         case c -> {
            vr $$1 = vd.i();
            int $$2 = 0;
            boolean $$3 = this.i.get(0);

            while (true) {
               int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
               $$4 = $$4 < 0 ? $$0.length() : $$4;
               if ($$4 == $$2) {
                  yield $$1;
               }

               if ($$3) {
                  $$1.b(vd.b(StringUtils.repeat('#', $$4 - $$2)).c(d));
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
      return this.j == vh.a.a;
   }

   public boolean b() {
      return this.j == vh.a.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         vh $$1 = (vh)$$0;
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

   static enum a implements ave {
      a("pass_through", () -> vh.e),
      b("fully_filtered", () -> vh.f),
      c("partially_filtered", () -> vh.g);

      private final String d;
      private final Supplier<Codec<vh>> e;

      private a(String $$0, Supplier<Codec<vh>> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public String c() {
         return this.d;
      }

      private Codec<vh> a() {
         return this.e.get();
      }
   }
}
