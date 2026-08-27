import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class gki implements gjz {
   private final List<Pair<Predicate<dme>, gjz>> g;
   protected final boolean a;
   protected final boolean b;
   protected final boolean c;
   protected final ghz d;
   protected final fxz e;
   protected final fxx f;
   private final Map<dme, BitSet> h = new Reference2ObjectOpenHashMap();

   public gki(List<Pair<Predicate<dme>, gjz>> $$0) {
      this.g = $$0;
      gjz $$1 = (gjz)$$0.iterator().next().getRight();
      this.a = $$1.a();
      this.b = $$1.b();
      this.c = $$1.c();
      this.d = $$1.e();
      this.e = $$1.f();
      this.f = $$1.g();
   }

   @Override
   public List<fxn> a(@Nullable dme $$0, @Nullable ih $$1, awt $$2) {
      if ($$0 == null) {
         return Collections.emptyList();
      } else {
         BitSet $$3 = this.h.get($$0);
         if ($$3 == null) {
            $$3 = new BitSet();

            for (int $$4 = 0; $$4 < this.g.size(); $$4++) {
               Pair<Predicate<dme>, gjz> $$5 = this.g.get($$4);
               if (((Predicate)$$5.getLeft()).test($$0)) {
                  $$3.set($$4);
               }
            }

            this.h.put($$0, $$3);
         }

         List<fxn> $$6 = Lists.newArrayList();
         long $$7 = $$2.g();

         for (int $$8 = 0; $$8 < $$3.length(); $$8++) {
            if ($$3.get($$8)) {
               $$6.addAll(((gjz)this.g.get($$8).getRight()).a($$0, $$1, awt.a($$7)));
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
   public ghz e() {
      return this.d;
   }

   @Override
   public fxz f() {
      return this.e;
   }

   @Override
   public fxx g() {
      return this.f;
   }

   public static class a {
      private final List<Pair<Predicate<dme>, gjz>> a = Lists.newArrayList();

      public void a(Predicate<dme> $$0, gjz $$1) {
         this.a.add(Pair.of($$0, $$1));
      }

      public gjz a() {
         return new gki(this.a);
      }
   }
}
