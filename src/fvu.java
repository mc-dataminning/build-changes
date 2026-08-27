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

public class fvu {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = chz.g();
   public static final Codec<fvu> a = avu.<List>a(Codec.PASSTHROUGH.listOf(), (Function<List, DataResult<List>>)($$0 -> ac.a($$0, c)))
      .xmap(fvu::new, $$0 -> $$0.f);
   private static final DynamicOps<tv> d = tm.a;
   private static final Dynamic<?> e = new Dynamic(d, (tv)ac.a(cpq.a.encodeStart(d, cpq.h), IllegalStateException::new));
   private List<Dynamic<?>> f;

   private fvu(List<Dynamic<?>> $$0) {
      this.f = $$0;
   }

   public fvu() {
      this(Collections.nCopies(c, e));
   }

   public List<cpq> a(in.a $$0) {
      return this.f
         .stream()
         .map($$1 -> cpq.a.parse(aja.a($$1, $$0)).resultOrPartial($$0xx -> b.warn("Could not parse hotbar item: {}", $$0xx)).orElse(cpq.h))
         .toList();
   }

   public void a(chz $$0, iy $$1) {
      aja<tv> $$2 = aja.a(d, $$1);
      Builder<Dynamic<?>> $$3 = ImmutableList.builderWithExpectedSize(c);

      for (int $$4 = 0; $$4 < c; $$4++) {
         cpq $$5 = $$0.a($$4);
         Optional<Dynamic<?>> $$6 = cpq.a
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
