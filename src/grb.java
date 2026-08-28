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

public class grb {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = crw.h();
   public static final Codec<grb> a = Codec.PASSTHROUGH.listOf().validate($$0 -> ag.a($$0, c)).xmap(grb::new, $$0 -> $$0.f);
   private static final DynamicOps<uy> d = un.a;
   private static final Dynamic<?> e = new Dynamic(d, (uy)czy.f.encodeStart(d, czy.k).getOrThrow());
   private List<Dynamic<?>> f;

   private grb(List<Dynamic<?>> $$0) {
      this.f = $$0;
   }

   public grb() {
      this(Collections.nCopies(c, e));
   }

   public List<czy> a(jh.a $$0) {
      return this.f
         .stream()
         .map($$1 -> czy.f.parse(alg.a($$1, $$0)).resultOrPartial($$0xx -> b.warn("Could not parse hotbar item: {}", $$0xx)).orElse(czy.k))
         .toList();
   }

   public void a(crw $$0, jt $$1) {
      alg<uy> $$2 = $$1.a(d);
      Builder<Dynamic<?>> $$3 = ImmutableList.builderWithExpectedSize(c);

      for (int $$4 = 0; $$4 < c; $$4++) {
         czy $$5 = $$0.a($$4);
         Optional<Dynamic<?>> $$6 = czy.f
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
