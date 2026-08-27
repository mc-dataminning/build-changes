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

public class gas {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = clg.g();
   public static final Codec<gas> a = axh.<List>b(Codec.PASSTHROUGH.listOf(), (Function<List, DataResult<List>>)($$0 -> ac.a($$0, c)))
      .xmap(gas::new, $$0 -> $$0.f);
   private static final DynamicOps<ux> d = uo.a;
   private static final Dynamic<?> e = new Dynamic(d, (ux)ac.a(csz.c.encodeStart(d, csz.i), IllegalStateException::new));
   private List<Dynamic<?>> f;

   private gas(List<Dynamic<?>> $$0) {
      this.f = $$0;
   }

   public gas() {
      this(Collections.nCopies(c, e));
   }

   public List<csz> a(iy.a $$0) {
      return this.f
         .stream()
         .map($$1 -> csz.c.parse(akf.a($$1, $$0)).resultOrPartial($$0xx -> b.warn("Could not parse hotbar item: {}", $$0xx)).orElse(csz.i))
         .toList();
   }

   public void a(clg $$0, jk $$1) {
      akf<ux> $$2 = $$1.a(d);
      Builder<Dynamic<?>> $$3 = ImmutableList.builderWithExpectedSize(c);

      for (int $$4 = 0; $$4 < c; $$4++) {
         csz $$5 = $$0.a($$4);
         Optional<Dynamic<?>> $$6 = csz.c
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
