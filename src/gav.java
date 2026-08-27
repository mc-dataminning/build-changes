import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenCustomHashMap;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class gav implements gam {
   private final List<Pair<Predicate<dfa>, gam>> g;
   protected final boolean a;
   protected final boolean b;
   protected final boolean c;
   protected final fyl d;
   protected final fou e;
   protected final fos f;
   private final Map<dfa, BitSet> h = new Object2ObjectOpenCustomHashMap(ac.k());

   public gav(List<Pair<Predicate<dfa>, gam>> $$0) {
      this.g = $$0;
      gam $$1 = (gam)$$0.iterator().next().getRight();
      this.a = $$1.a();
      this.b = $$1.b();
      this.c = $$1.c();
      this.d = $$1.e();
      this.e = $$1.f();
      this.f = $$1.g();
   }

   @Override
   public List<foh> a(@Nullable dfa $$0, @Nullable ha $$1, aru $$2) {
      if ($$0 == null) {
         return Collections.emptyList();
      } else {
         BitSet $$3 = this.h.get($$0);
         if ($$3 == null) {
            $$3 = new BitSet();

            for (int $$4 = 0; $$4 < this.g.size(); $$4++) {
               Pair<Predicate<dfa>, gam> $$5 = this.g.get($$4);
               if (((Predicate)$$5.getLeft()).test($$0)) {
                  $$3.set($$4);
               }
            }

            this.h.put($$0, $$3);
         }

         List<foh> $$6 = Lists.newArrayList();
         long $$7 = $$2.g();

         for (int $$8 = 0; $$8 < $$3.length(); $$8++) {
            if ($$3.get($$8)) {
               $$6.addAll(((gam)this.g.get($$8).getRight()).a($$0, $$1, aru.a($$7)));
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
   public fyl e() {
      return this.d;
   }

   @Override
   public fou f() {
      return this.e;
   }

   @Override
   public fos g() {
      return this.f;
   }

   public static class a {
      private final List<Pair<Predicate<dfa>, gam>> a = Lists.newArrayList();

      public void a(Predicate<dfa> $$0, gam $$1) {
         this.a.add(Pair.of($$0, $$1));
      }

      public gam a() {
         return new gav(this.a);
      }
   }
}
