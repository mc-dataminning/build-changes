import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.mojang.blocklist.BlockListSupplier;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.function.Predicate;

public interface gio {
   boolean a(gip var1);

   boolean a(giq var1);

   static gio a() {
      final ImmutableList<Predicate<String>> $$0 = Streams.stream(ServiceLoader.load(BlockListSupplier.class))
         .<Predicate>map(BlockListSupplier::createBlockList)
         .filter(Objects::nonNull)
         .collect(ImmutableList.toImmutableList());
      return new gio() {
         @Override
         public boolean a(gip $$0x) {
            String $$1 = $$0.a();
            String $$2 = $$0.b();
            return $$0.stream().noneMatch($$2x -> $$2x.test($$1) || $$2x.test($$2));
         }

         @Override
         public boolean a(giq $$0x) {
            String $$1 = $$0.a();
            return $$0.stream().noneMatch($$1x -> $$1x.test($$1));
         }
      };
   }
}
