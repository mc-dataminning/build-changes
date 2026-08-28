import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.mojang.blocklist.BlockListSupplier;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.function.Predicate;

public interface gho {
   boolean a(ghp var1);

   boolean a(ghq var1);

   static gho a() {
      final ImmutableList<Predicate<String>> $$0 = Streams.stream(ServiceLoader.load(BlockListSupplier.class))
         .<Predicate>map(BlockListSupplier::createBlockList)
         .filter(Objects::nonNull)
         .collect(ImmutableList.toImmutableList());
      return new gho() {
         @Override
         public boolean a(ghp $$0x) {
            String $$1 = $$0.a();
            String $$2 = $$0.b();
            return $$0.stream().noneMatch($$2x -> $$2x.test($$1) || $$2x.test($$2));
         }

         @Override
         public boolean a(ghq $$0x) {
            String $$1 = $$0.a();
            return $$0.stream().noneMatch($$1x -> $$1x.test($$1));
         }
      };
   }
}
