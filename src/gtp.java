import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gtp implements gta {
   private final gtp.b a;
   private final ebq b;
   @Nullable
   private List<gta> c;

   gtp(gtp.b $$0, ebq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public hkq a() {
      return this.a.b;
   }

   @Override
   public void a(bai $$0, List<gsz> $$1) {
      if (this.c == null) {
         this.c = this.a.a(this.b);
      }

      long $$2 = $$0.g();

      for (gta $$3 : this.c) {
         $$0.b($$2);
         $$3.a($$0, $$1);
      }
   }

   public static record a<T>(Predicate<ebq> a, T b) {

      public <S> gtp.a<S> a(S $$0) {
         return new gtp.a<>(this.a, $$0);
      }
   }

   static final class b {
      private final List<gtp.a<gta>> a;
      final hkq b;
      private final Map<BitSet, List<gta>> c = new ConcurrentHashMap<>();

      private static gta a(List<gtp.a<gta>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Model must have at least one selector");
         } else {
            return $$0.getFirst().b();
         }
      }

      public b(List<gtp.a<gta>> $$0) {
         this.a = $$0;
         gta $$1 = a($$0);
         this.b = $$1.a();
      }

      public List<gta> a(ebq $$0) {
         BitSet $$1 = new BitSet();

         for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
            if (this.a.get($$2).a.test($$0)) {
               $$1.set($$2);
            }
         }

         return this.c.computeIfAbsent($$1, $$0x -> {
            Builder<gta> $$1x = ImmutableList.builder();

            for (int $$2x = 0; $$2x < this.a.size(); $$2x++) {
               if ($$0x.get($$2x)) {
                  $$1x.add(this.a.get($$2x).b);
               }
            }

            return $$1x.build();
         });
      }
   }

   public static class c implements gta.c {
      final List<gtp.a<gta.b>> a;
      private final hmz.a<gtp.b> b = new hmz.a<gtp.b>() {
         public gtp.b a(hmz $$0) {
            Builder<gtp.a<gta>> $$1 = ImmutableList.builderWithExpectedSize(c.this.a.size());

            for (gtp.a<gta.b> $$2 : c.this.a) {
               $$1.add($$2.a($$2.b.a($$0)));
            }

            return new gtp.b($$1.build());
         }
      };

      public c(List<gtp.a<gta.b>> $$0) {
         this.a = $$0;
      }

      @Override
      public Object a(ebq $$0) {
         IntList $$1 = new IntArrayList();

         for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
            if (this.a.get($$2).a.test($$0)) {
               $$1.add($$2);
            }
         }

         record a(gtp.c a, IntList b) {
         }

         return new a(this, $$1);
      }

      @Override
      public void a(hnh.a $$0) {
         this.a.forEach($$1 -> $$1.b.a($$0));
      }

      @Override
      public gta a(ebq $$0, hmz $$1) {
         gtp.b $$2 = $$1.a(this.b);
         return new gtp($$2, $$0);
      }
   }
}
