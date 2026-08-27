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

public class fzm {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = cjz.g();
   public static final Codec<fzm> a = awu.<List>b(Codec.PASSTHROUGH.listOf(), (Function<List, DataResult<List>>)($$0 -> ac.a($$0, c)))
      .xmap(fzm::new, $$0 -> $$0.f);
   private static final DynamicOps<ul> d = uc.a;
   private static final Dynamic<?> e = new Dynamic(d, (ul)ac.a(crs.c.encodeStart(d, crs.i), IllegalStateException::new));
   private List<Dynamic<?>> f;

   private fzm(List<Dynamic<?>> $$0) {
      this.f = $$0;
   }

   public fzm() {
      this(Collections.nCopies(c, e));
   }

   public List<crs> a(ip.a $$0) {
      return this.f
         .stream()
         .map($$1 -> crs.c.parse(ajt.a($$1, $$0)).resultOrPartial($$0xx -> b.warn("Could not parse hotbar item: {}", $$0xx)).orElse(crs.i))
         .toList();
   }

   public void a(cjz $$0, jb $$1) {
      ajt<ul> $$2 = $$1.a(d);
      Builder<Dynamic<?>> $$3 = ImmutableList.builderWithExpectedSize(c);

      for (int $$4 = 0; $$4 < c; $$4++) {
         crs $$5 = $$0.a($$4);
         Optional<Dynamic<?>> $$6 = crs.c
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
