import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class lb implements ld {
   protected static final bp.a a = bp.a.a().a(bn.a.a().a(true));
   private static final Set<blj<?>> b = ImmutableSet.of(blj.bv, blj.d, blj.ad, blj.aP, blj.bg);
   private final chb c;
   private final chb d;
   private final Map<blj<?>, Map<agt, egm.a>> e = Maps.newHashMap();

   protected lb(chb $$0) {
      this($$0, $$0);
   }

   protected lb(chb $$0, chb $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static egm.a a(csx $$0) {
      return egm.b().a(egl.a().a(ejw.a(1.0F)).a(egu.a($$0))).a(egl.a().a(ejw.a(1.0F)).a(eha.a(blj.aG.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<agt, egm.a> $$0) {
      this.a();
      Set<agt> $$1 = Sets.newHashSet();
      kb.g
         .h()
         .forEach(
            $$2 -> {
               blj<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<agt, egm.a> $$4 = this.e.remove($$3);
                     agt $$5 = $$3.j();
                     if (!$$5.equals(egc.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
                        throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$5, $$2.g().a()));
                     }

                     if ($$4 != null) {
                        $$4.forEach(($$3x, $$4x) -> {
                           if (!$$1.add($$3x)) {
                              throw new IllegalStateException(String.format(Locale.ROOT, "Duplicate loottable '%s' for '%s'", $$3x, $$2.g().a()));
                           } else {
                              $$0.accept($$3x, $$4x);
                           }
                        });
                     }
                  } else {
                     Map<agt, egm.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(agt::toString).collect(Collectors.joining(",")),
                              $$2.g().a()
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

   private static boolean a(blj<?> $$0) {
      return b.contains($$0) || $$0.f() != bly.h;
   }

   protected ejd.a b() {
      return eix.a(bf.a.a().b(bp.a.a().a(blj.P)));
   }

   protected ejd.a a(bxt $$0) {
      return eix.a(bf.a.a().b(bp.a.a().a(blj.P).a(bq.a($$0))));
   }

   protected void a(blj<?> $$0, egm.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(blj<?> $$0, agt $$1, egm.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
