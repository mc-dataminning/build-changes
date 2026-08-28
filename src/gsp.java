import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public record gsp(gsp.a b, List<gsq> c) implements gsq {
   @Override
   public <O, S extends eav<O, S>> Predicate<S> instantiate(eau<O, S> $$0) {
      return this.b.a(Lists.transform(this.c, $$1 -> $$1.instantiate($$0)));
   }

   public gsp.a a() {
      return this.b;
   }

   public List<gsq> b() {
      return this.c;
   }

   public static enum a implements bak {
      a("AND") {
         @Override
         public <V> Predicate<V> a(List<Predicate<V>> $$0) {
            return ag.a($$0);
         }
      },
      b("OR") {
         @Override
         public <V> Predicate<V> a(List<Predicate<V>> $$0) {
            return ag.b($$0);
         }
      };

      public static final Codec<gsp.a> c = bak.a(gsp.a::values);
      private final String d;

      a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public abstract <V> Predicate<V> a(List<Predicate<V>> var1);
   }
}
