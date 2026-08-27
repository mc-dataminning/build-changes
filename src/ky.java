import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class ky implements la {
   protected static final bq.a a = bq.a.a().a(bo.a.a().a(true));
   private static final Set<bku<?>> b = ImmutableSet.of(bku.bt, bku.d, bku.ac, bku.aO, bku.bf);
   private final cgd c;
   private final cgd d;
   private final Map<bku<?>, Map<agi, eff.a>> e = Maps.newHashMap();

   protected ky(cgd $$0) {
      this($$0, $$0);
   }

   protected ky(cgd $$0, cgd $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static eff.a a(crz $$0) {
      return eff.b().a(efe.a().a(eip.a(1.0F)).a(efn.a($$0))).a(efe.a().a(eip.a(1.0F)).a(eft.a(bku.aF.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<agi, eff.a> $$0) {
      this.a();
      Set<agi> $$1 = Sets.newHashSet();
      jy.h
         .h()
         .forEach(
            $$2 -> {
               bku<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<agi, eff.a> $$4 = this.e.remove($$3);
                     agi $$5 = $$3.j();
                     if (!$$5.equals(eev.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<agi, eff.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(agi::toString).collect(Collectors.joining(",")),
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

   private static boolean a(bku<?> $$0) {
      return b.contains($$0) || $$0.f() != blj.h;
   }

   protected ehw.a b() {
      return ehq.a(bf.a.a().b(bq.a.a().a(bku.O)));
   }

   protected ehw.a a(bxc $$0) {
      return ehq.a(bf.a.a().b(bq.a.a().a(bku.O).a(br.a($$0))));
   }

   protected void a(bku<?> $$0, eff.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(bku<?> $$0, agi $$1, eff.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
