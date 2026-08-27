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
   private static final Set<bjx<?>> b = ImmutableSet.of(bjx.bt, bjx.d, bjx.ac, bjx.aO, bjx.bf);
   private final cfg c;
   private final cfg d;
   private final Map<bjx<?>, Map<afw, edq.a>> e = Maps.newHashMap();

   protected ky(cfg $$0) {
      this($$0, $$0);
   }

   protected ky(cfg $$0, cfg $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static edq.a a(cqy $$0) {
      return edq.b().a(edp.a().a(eha.a(1.0F)).a(edy.a($$0))).a(edp.a().a(eha.a(1.0F)).a(eee.a(bjx.aF.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<afw, edq.a> $$0) {
      this.a();
      Set<afw> $$1 = Sets.newHashSet();
      jy.h
         .h()
         .forEach(
            $$2 -> {
               bjx<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<afw, edq.a> $$4 = this.e.remove($$3);
                     afw $$5 = $$3.j();
                     if (!$$5.equals(edg.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<afw, edq.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(afw::toString).collect(Collectors.joining(",")),
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

   private static boolean a(bjx<?> $$0) {
      return b.contains($$0) || $$0.f() != bkm.h;
   }

   protected egh.a b() {
      return egb.a(bf.a.a().b(bq.a.a().a(bjx.O)));
   }

   protected egh.a a(bwf $$0) {
      return egb.a(bf.a.a().b(bq.a.a().a(bjx.O).a(br.a($$0))));
   }

   protected void a(bjx<?> $$0, edq.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(bjx<?> $$0, afw $$1, edq.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
