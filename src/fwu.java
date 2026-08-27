import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class fwu {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = cir.g();
   public static final Codec<fwu> a = awe.<List>b(Codec.PASSTHROUGH.listOf(), (Function<List, DataResult<List>>)($$0 -> ac.a($$0, c)))
      .xmap(fwu::new, $$0 -> $$0.f);
   private static final DynamicOps<tx> d = to.a;
   private static final Dynamic<?> e = new Dynamic(d, (tx)ac.a(cqk.a.encodeStart(d, cqk.h), IllegalStateException::new));
   private List<Dynamic<?>> f;

   private fwu(List<Dynamic<?>> $$0) {
      this.f = $$0;
   }

   public fwu() {
      this(Collections.nCopies(c, e));
   }

   public List<cqk> a(in.a $$0) {
      return this.f
         .stream()
         .map($$1 -> cqk.a.parse(ajf.a($$1, $$0)).resultOrPartial($$0xx -> b.warn("Could not parse hotbar item: {}", $$0xx)).orElse(cqk.h))
         .toList();
   }

   public void a(cir $$0, iz $$1) {
      ajf<tx> $$2 = ajf.a(d, $$1);
      Builder<Dynamic<?>> $$3 = ImmutableList.builderWithExpectedSize(c);

      for (int $$4 = 0; $$4 < c; $$4++) {
         cqk $$5 = $$0.a($$4);
         Optional<Dynamic<?>> $$6 = cqk.a
            .encodeStart($$2, $$5)
            .resultOrPartial($$0x -> b.warn("Could not encode hotbar item: {}", $$0x))
            .map($$0x -> new Dynamic(d, $$0x));
         $$3.add($$6.orElse(e));
      }

      this.f = $$3.build();
   }

   public boolean a() {
      for (Dynamic<?> $$0 : this.f) {
         if (!a($$0)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(Dynamic<?> $$0) {
      return e.equals($$0);
   }
}
