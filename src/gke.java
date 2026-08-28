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

public class gke {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = cpn.g();
   public static final Codec<gke> a = Codec.PASSTHROUGH.listOf().validate($$0 -> ae.a($$0, c)).xmap(gke::new, $$0 -> $$0.f);
   private static final DynamicOps<vj> d = va.a;
   private static final Dynamic<?> e = new Dynamic(d, (vj)cxg.e.encodeStart(d, cxg.j).getOrThrow());
   private List<Dynamic<?>> f;

   private gke(List<Dynamic<?>> $$0) {
      this.f = $$0;
   }

   public gke() {
      this(Collections.nCopies(c, e));
   }

   public List<cxg> a(js.a $$0) {
      return this.f
         .stream()
         .map($$1 -> cxg.e.parse(aln.a($$1, $$0)).resultOrPartial($$0xx -> b.warn("Could not parse hotbar item: {}", $$0xx)).orElse(cxg.j))
         .toList();
   }

   public void a(cpn $$0, ke $$1) {
      aln<vj> $$2 = $$1.a(d);
      Builder<Dynamic<?>> $$3 = ImmutableList.builderWithExpectedSize(c);

      for (int $$4 = 0; $$4 < c; $$4++) {
         cxg $$5 = $$0.a($$4);
         Optional<Dynamic<?>> $$6 = cxg.e
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
