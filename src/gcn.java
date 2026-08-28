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

public class gcn {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = cmr.g();
   public static final Codec<gcn> a = Codec.PASSTHROUGH.listOf().validate($$0 -> ac.a($$0, c)).xmap(gcn::new, $$0 -> $$0.f);
   private static final DynamicOps<vo> d = vf.a;
   private static final Dynamic<?> e = new Dynamic(d, (vo)cuk.f.encodeStart(d, cuk.l).getOrThrow());
   private List<Dynamic<?>> f;

   private gcn(List<Dynamic<?>> $$0) {
      this.f = $$0;
   }

   public gcn() {
      this(Collections.nCopies(c, e));
   }

   public List<cuk> a(jk.a $$0) {
      return this.f
         .stream()
         .map($$1 -> cuk.f.parse(akz.a($$1, $$0)).resultOrPartial($$0xx -> b.warn("Could not parse hotbar item: {}", $$0xx)).orElse(cuk.l))
         .toList();
   }

   public void a(cmr $$0, jw $$1) {
      akz<vo> $$2 = $$1.a(d);
      Builder<Dynamic<?>> $$3 = ImmutableList.builderWithExpectedSize(c);

      for (int $$4 = 0; $$4 < c; $$4++) {
         cuk $$5 = $$0.a($$4);
         Optional<Dynamic<?>> $$6 = cuk.f
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
