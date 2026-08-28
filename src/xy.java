import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class xy {
   private final String a;
   private final List<xx> b;
   private final Int2IntFunction c;

   private xy(String $$0, List<xx> $$1, Int2IntFunction $$2) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      this.c = $$2;
   }

   public String a() {
      return this.a;
   }

   public List<aza> a(int $$0, int $$1, boolean $$2) {
      if ($$1 == 0) {
         return ImmutableList.of();
      } else {
         List<aza> $$3 = Lists.newArrayList();
         xx $$4 = this.b.get($$0);
         int $$5 = $$0;

         for (int $$6 = 1; $$6 < $$1; $$6++) {
            int $$7 = $$0 + $$6;
            xx $$8 = this.b.get($$7);
            if (!$$8.equals($$4)) {
               String $$9 = this.a.substring($$5, $$7);
               $$3.add($$2 ? aza.backward($$9, $$4, this.c) : aza.forward($$9, $$4));
               $$4 = $$8;
               $$5 = $$7;
            }
         }

         if ($$5 < $$0 + $$1) {
            String $$10 = this.a.substring($$5, $$0 + $$1);
            $$3.add($$2 ? aza.backward($$10, $$4, this.c) : aza.forward($$10, $$4));
         }

         return $$2 ? Lists.reverse($$3) : $$3;
      }
   }

   public static xy a(xf $$0) {
      return a($$0, $$0x -> $$0x, $$0x -> $$0x);
   }

   public static xy a(xf $$0, Int2IntFunction $$1, UnaryOperator<String> $$2) {
      StringBuilder $$3 = new StringBuilder();
      List<xx> $$4 = Lists.newArrayList();
      $$0.a(($$2x, $$3x) -> {
         bal.c($$3x, $$2x, ($$2xx, $$3xx, $$4x) -> {
            $$3.appendCodePoint($$4x);
            int $$5 = Character.charCount($$4x);

            for (int $$6 = 0; $$6 < $$5; $$6++) {
               $$4.add($$3xx);
            }

            return true;
         });
         return Optional.empty();
      }, xx.a);
      return new xy($$2.apply($$3.toString()), $$4, $$1);
   }
}
