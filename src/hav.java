import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class hav extends haj {
   private final List<hav.a> b;
   private final Map<dvj, BitSet> c = new Reference2ObjectOpenHashMap();

   private static haf a(List<hav.a> $$0) {
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Model must have at least one selector");
      } else {
         return $$0.getFirst().b();
      }
   }

   public hav(List<hav.a> $$0) {
      super(a($$0));
      this.b = $$0;
   }

   @Override
   public List<gjo> a(@Nullable dvj $$0, @Nullable jm $$1, azs $$2) {
      if ($$0 == null) {
         return Collections.emptyList();
      } else {
         BitSet $$3 = this.c.get($$0);
         if ($$3 == null) {
            $$3 = new BitSet();

            for (int $$4 = 0; $$4 < this.b.size(); $$4++) {
               if (this.b.get($$4).a.test($$0)) {
                  $$3.set($$4);
               }
            }

            this.c.put($$0, $$3);
         }

         List<gjo> $$5 = new ArrayList<>();
         long $$6 = $$2.g();

         for (int $$7 = 0; $$7 < $$3.length(); $$7++) {
            if ($$3.get($$7)) {
               $$2.b($$6);
               $$5.addAll(this.b.get($$7).b.a($$0, $$1, $$2));
            }
         }

         return $$5;
      }
   }

   public static record a(Predicate<dvj> a, haf b) {
   }
}
