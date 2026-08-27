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

public class fzd {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = cjs.g();
   public static final Codec<fzd> a = aws.<List>b(Codec.PASSTHROUGH.listOf(), (Function<List, DataResult<List>>)($$0 -> ac.a($$0, c)))
      .xmap(fzd::new, $$0 -> $$0.f);
   private static final DynamicOps<uj> d = ua.a;
   private static final Dynamic<?> e = new Dynamic(d, (uj)ac.a(crj.b.encodeStart(d, crj.i), IllegalStateException::new));
   private List<Dynamic<?>> f;

   private fzd(List<Dynamic<?>> $$0) {
      this.f = $$0;
   }

   public fzd() {
      this(Collections.nCopies(c, e));
   }

   public List<crj> a(in.a $$0) {
      return this.f
         .stream()
         .map($$1 -> crj.b.parse(ajr.a($$1, $$0)).resultOrPartial($$0xx -> b.warn("Could not parse hotbar item: {}", $$0xx)).orElse(crj.i))
         .toList();
   }

   public void a(cjs $$0, iz $$1) {
      ajr<uj> $$2 = $$1.a(d);
      Builder<Dynamic<?>> $$3 = ImmutableList.builderWithExpectedSize(c);

      for (int $$4 = 0; $$4 < c; $$4++) {
         crj $$5 = $$0.a($$4);
         Optional<Dynamic<?>> $$6 = crj.b
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
