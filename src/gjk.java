import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class gjk implements gjb {
   private final List<Pair<Predicate<dlj>, gjb>> g;
   protected final boolean a;
   protected final boolean b;
   protected final boolean c;
   protected final ghb d;
   protected final fxc e;
   protected final fxa f;
   private final Map<dlj, BitSet> h = new Reference2ObjectOpenHashMap();

   public gjk(List<Pair<Predicate<dlj>, gjb>> $$0) {
      this.g = $$0;
      gjb $$1 = (gjb)$$0.iterator().next().getRight();
      this.a = $$1.a();
      this.b = $$1.b();
      this.c = $$1.c();
      this.d = $$1.e();
      this.e = $$1.f();
      this.f = $$1.g();
   }

   @Override
   public List<fwq> a(@Nullable dlj $$0, @Nullable ie $$1, awp $$2) {
      if ($$0 == null) {
         return Collections.emptyList();
      } else {
         BitSet $$3 = this.h.get($$0);
         if ($$3 == null) {
            $$3 = new BitSet();

            for (int $$4 = 0; $$4 < this.g.size(); $$4++) {
               Pair<Predicate<dlj>, gjb> $$5 = this.g.get($$4);
               if (((Predicate)$$5.getLeft()).test($$0)) {
                  $$3.set($$4);
               }
            }

            this.h.put($$0, $$3);
         }

         List<fwq> $$6 = Lists.newArrayList();
         long $$7 = $$2.g();

         for (int $$8 = 0; $$8 < $$3.length(); $$8++) {
            if ($$3.get($$8)) {
               $$6.addAll(((gjb)this.g.get($$8).getRight()).a($$0, $$1, awp.a($$7)));
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
   public ghb e() {
      return this.d;
   }

   @Override
   public fxc f() {
      return this.e;
   }

   @Override
   public fxa g() {
      return this.f;
   }

   public static class a {
      private final List<Pair<Predicate<dlj>, gjb>> a = Lists.newArrayList();

      public void a(Predicate<dlj> $$0, gjb $$1) {
         this.a.add(Pair.of($$0, $$1));
      }

      public gjb a() {
         return new gjk(this.a);
      }
   }
}
