import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gbo {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = clx.g();
   public static final Codec<gbo> a = Codec.PASSTHROUGH.listOf().validate($$0 -> ac.a($$0, c)).xmap(gbo::new, $$0 -> $$0.f);
   private static final DynamicOps<va> d = ur.a;
   private static final Dynamic<?> e = new Dynamic(d, (va)ctq.c.encodeStart(d, ctq.i).getOrThrow());
   private List<Dynamic<?>> f;

   private gbo(List<Dynamic<?>> $$0) {
      this.f = $$0;
   }

   public gbo() {
      this(Collections.nCopies(c, e));
   }

   public List<ctq> a(iz.a $$0) {
      return this.f
         .stream()
         .map($$1 -> ctq.c.parse(akl.a($$1, $$0)).resultOrPartial($$0xx -> b.warn("Could not parse hotbar item: {}", $$0xx)).orElse(ctq.i))
         .toList();
   }

   public void a(clx $$0, jl $$1) {
      akl<va> $$2 = $$1.a(d);
      Builder<Dynamic<?>> $$3 = ImmutableList.builderWithExpectedSize(c);

      for (int $$4 = 0; $$4 < c; $$4++) {
         ctq $$5 = $$0.a($$4);
         Optional<Dynamic<?>> $$6 = ctq.c
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
