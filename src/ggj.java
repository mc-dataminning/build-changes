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

public class ggj {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = cnw.g();
   public static final Codec<ggj> a = Codec.PASSTHROUGH.listOf().validate($$0 -> ad.a($$0, c)).xmap(ggj::new, $$0 -> $$0.f);
   private static final DynamicOps<vd> d = uu.a;
   private static final Dynamic<?> e = new Dynamic(d, (vd)cvs.f.encodeStart(d, cvs.k).getOrThrow());
   private List<Dynamic<?>> f;

   private ggj(List<Dynamic<?>> $$0) {
      this.f = $$0;
   }

   public ggj() {
      this(Collections.nCopies(c, e));
   }

   public List<cvs> a(jq.a $$0) {
      return this.f
         .stream()
         .map($$1 -> cvs.f.parse(alc.a($$1, $$0)).resultOrPartial($$0xx -> b.warn("Could not parse hotbar item: {}", $$0xx)).orElse(cvs.k))
         .toList();
   }

   public void a(cnw $$0, kc $$1) {
      alc<vd> $$2 = $$1.a(d);
      Builder<Dynamic<?>> $$3 = ImmutableList.builderWithExpectedSize(c);

      for (int $$4 = 0; $$4 < c; $$4++) {
         cvs $$5 = $$0.a($$4);
         Optional<Dynamic<?>> $$6 = cvs.f
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
