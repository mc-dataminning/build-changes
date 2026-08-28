import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class hmg implements gsd {
   private final List<hmg.a> a;
   private final boolean b;
   private final hjq c;
   private final Map<eat, BitSet> d = new Reference2ObjectOpenHashMap();

   private static gsd a(List<hmg.a> $$0) {
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Model must have at least one selector");
      } else {
         return $$0.getFirst().b();
      }
   }

   public hmg(List<hmg.a> $$0) {
      this.a = $$0;
      gsd $$1 = a($$0);
      this.b = $$1.a();
      this.c = $$1.b();
   }

   @Override
   public boolean a() {
      return this.b;
   }

   @Override
   public hjq b() {
      return this.c;
   }

   @Override
   public List<grx> a(eat $$0, @Nullable jb $$1, azv $$2) {
      BitSet $$3 = this.d.get($$0);
      if ($$3 == null) {
         $$3 = new BitSet();

         for (int $$4 = 0; $$4 < this.a.size(); $$4++) {
            if (this.a.get($$4).a.test($$0)) {
               $$3.set($$4);
            }
         }

         this.d.put($$0, $$3);
      }

      List<grx> $$5 = new ArrayList<>();
      long $$6 = $$2.g();

      for (int $$7 = 0; $$7 < $$3.length(); $$7++) {
         if ($$3.get($$7)) {
            $$2.b($$6);
            $$5.addAll(this.a.get($$7).b.a($$0, $$1, $$2));
         }
      }

      return $$5;
   }

   public static record a(Predicate<eat> a, gsd b) {
   }
}
