import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class grk implements grb {
   private final List<Pair<Predicate<dsd>, grb>> g;
   protected final boolean a;
   protected final boolean b;
   protected final boolean c;
   protected final gpa d;
   protected final gey e;
   protected final gew f;
   private final Map<dsd, BitSet> h = new Reference2ObjectOpenHashMap();

   public grk(List<Pair<Predicate<dsd>, grb>> $$0) {
      this.g = $$0;
      grb $$1 = (grb)$$0.iterator().next().getRight();
      this.a = $$1.a();
      this.b = $$1.b();
      this.c = $$1.c();
      this.d = $$1.e();
      this.e = $$1.f();
      this.f = $$1.g();
   }

   @Override
   public List<gem> a(@Nullable dsd $$0, @Nullable je $$1, azh $$2) {
      if ($$0 == null) {
         return Collections.emptyList();
      } else {
         BitSet $$3 = this.h.get($$0);
         if ($$3 == null) {
            $$3 = new BitSet();

            for (int $$4 = 0; $$4 < this.g.size(); $$4++) {
               Pair<Predicate<dsd>, grb> $$5 = this.g.get($$4);
               if (((Predicate)$$5.getLeft()).test($$0)) {
                  $$3.set($$4);
               }
            }

            this.h.put($$0, $$3);
         }

         List<gem> $$6 = Lists.newArrayList();
         long $$7 = $$2.g();

         for (int $$8 = 0; $$8 < $$3.length(); $$8++) {
            if ($$3.get($$8)) {
               $$6.addAll(((grb)this.g.get($$8).getRight()).a($$0, $$1, azh.a($$7)));
            }
         }

         return $$6;
      }
   }

   @Override
   public boolean a() {
      return this.a;
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.c;
   }

   @Override
   public boolean d() {
      return false;
   }

   @Override
   public gpa e() {
      return this.d;
   }

   @Override
   public gey f() {
      return this.e;
   }

   @Override
   public gew g() {
      return this.f;
   }

   public static class a {
      private final List<Pair<Predicate<dsd>, grb>> a = Lists.newArrayList();

      public void a(Predicate<dsd> $$0, grb $$1) {
         this.a.add(Pair.of($$0, $$1));
      }

      public grb a() {
         return new grk(this.a);
      }
   }
}
