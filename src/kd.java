import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class kd implements kf {
   protected static final bq.a a = bq.a.a().a(bo.a.a().a(true));
   private static final Set<bip<?>> b = ImmutableSet.of(bip.bt, bip.d, bip.ac, bip.aO, bip.bf);
   private final cdx c;
   private final cdx d;
   private final Map<bip<?>, Map<aeu, ect.a>> e = Maps.newHashMap();

   protected kd(cdx $$0) {
      this($$0, $$0);
   }

   protected kd(cdx $$0, cdx $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static ect.a a(cpp $$0) {
      return ect.b().a(ecs.a().a(egd.a(1.0F)).a(edb.a($$0))).a(ecs.a().a(egd.a(1.0F)).a(edh.a(bip.aF.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<aeu, ect.a> $$0) {
      this.a();
      Set<aeu> $$1 = Sets.newHashSet();
      jd.h
         .h()
         .forEach(
            $$2 -> {
               bip<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<aeu, ect.a> $$4 = this.e.remove($$3);
                     aeu $$5 = $$3.j();
                     if (!$$5.equals(ecj.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<aeu, ect.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(aeu::toString).collect(Collectors.joining(",")),
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

   private static boolean a(bip<?> $$0) {
      return b.contains($$0) || $$0.f() != bje.h;
   }

   protected efk.a b() {
      return efe.a(bf.a.a().b(bq.a.a().a(bip.O)));
   }

   protected efk.a a(bux $$0) {
      return efe.a(bf.a.a().b(bq.a.a().a(bip.O).a(br.a($$0))));
   }

   protected void a(bip<?> $$0, ect.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(bip<?> $$0, aeu $$1, ect.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
