import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class lh implements lj {
   protected static final br.a a = br.a.a().a(bp.a.a().a(true));
   private static final Set<bnu<?>> b = ImmutableSet.of(bnu.bw, bnu.e, bnu.ae, bnu.aQ, bnu.bh);
   private final cjs c;
   private final cjs d;
   private final Map<bnu<?>, Map<aiy, ejd.a>> e = Maps.newHashMap();

   protected lh(cjs $$0) {
      this($$0, $$0);
   }

   protected lh(cjs $$0, cjs $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static ejd.a a(cvm $$0) {
      return ejd.b().a(ejc.a().a(emn.a(1.0F)).a(ejl.a($$0))).a(ejc.a().a(emn.a(1.0F)).a(ejr.a(bnu.aH.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<aiy, ejd.a> $$0) {
      this.a();
      Set<aiy> $$1 = Sets.newHashSet();
      kf.g
         .h()
         .forEach(
            $$2 -> {
               bnu<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<aiy, ejd.a> $$4 = this.e.remove($$3);
                     aiy $$5 = $$3.j();
                     if (!$$5.equals(eit.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
                        throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$5, $$2.h().a()));
                     }

                     if ($$4 != null) {
                        $$4.forEach(($$3x, $$4x) -> {
                           if (!$$1.add($$3x)) {
                              throw new IllegalStateException(String.format(Locale.ROOT, "Duplicate loottable '%s' for '%s'", $$3x, $$2.h().a()));
                           } else {
                              $$0.accept($$3x, $$4x);
                           }
                        });
                     }
                  } else {
                     Map<aiy, ejd.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(aiy::toString).collect(Collectors.joining(",")),
                              $$2.h().a()
                           )
                        );
                     }
                  }
               }
            }
         );
      if (!this.e.isEmpty()) {
         throw new IllegalStateException("Created loot tables for entities not supported by datapack: " + this.e.keySet());
      }
   }

   private static boolean a(bnu<?> $$0) {
      return b.contains($$0) || $$0.f() != boj.h;
   }

   protected elu.a b() {
      return elo.a(bg.a.a().b(br.a.a().a(bnu.Q)));
   }

   protected elu.a a(cae $$0) {
      return elo.a(bg.a.a().b(br.a.a().a(bnu.Q).a(bs.a($$0))));
   }

   protected void a(bnu<?> $$0, ejd.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(bnu<?> $$0, aiy $$1, ejd.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
