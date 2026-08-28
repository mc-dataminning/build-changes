import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public record gtm(gtm.a b, List<gtn> c) implements gtn {
   @Override
   public <O, S extends ebs<O, S>> Predicate<S> instantiate(ebr<O, S> $$0) {
      return this.b.a(Lists.transform(this.c, $$1 -> $$1.instantiate($$0)));
   }

   public gtm.a a() {
      return this.b;
   }

   public List<gtn> b() {
      return this.c;
   }

   public static enum a implements bax {
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

      public static final Codec<gtm.a> c = bax.a(gtm.a::values);
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
