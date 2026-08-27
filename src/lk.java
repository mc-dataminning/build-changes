import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class lk implements lm {
   protected static final br.a a = br.a.a().a(bp.a.a().a(true));
   private static final Set<bpc<?>> b = ImmutableSet.of(bpc.bx, bpc.e, bpc.af, bpc.aR, bpc.bi);
   private final clf c;
   private final clf d;
   private final Map<bpc<?>, Map<ajh, elc.a>> e = Maps.newHashMap();

   protected lk(clf $$0) {
      this($$0, $$0);
   }

   protected lk(clf $$0, clf $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static elc.a a(cwy $$0) {
      return elc.b().a(elb.a().a(eom.a(1.0F)).a(elk.a($$0))).a(elb.a().a(eom.a(1.0F)).a(elq.a(bpc.aI.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<ajh, elc.a> $$0) {
      this.a();
      Set<ajh> $$1 = Sets.newHashSet();
      ki.g
         .h()
         .forEach(
            $$2 -> {
               bpc<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<ajh, elc.a> $$4 = this.e.remove($$3);
                     ajh $$5 = $$3.j();
                     if (!$$5.equals(eks.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<ajh, elc.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(ajh::toString).collect(Collectors.joining(",")),
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

   private static boolean a(bpc<?> $$0) {
      return b.contains($$0) || $$0.f() != bpr.h;
   }

   protected ent.a b() {
      return enn.a(bg.a.a().b(br.a.a().a(bpc.R)));
   }

   protected ent.a a(cbo $$0) {
      return enn.a(bg.a.a().b(br.a.a().a(bpc.R).a(bs.a($$0))));
   }

   protected void a(bpc<?> $$0, elc.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(bpc<?> $$0, ajh $$1, elc.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
