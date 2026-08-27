import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class lu implements lw {
   protected static final br.a a = br.a.a().a(bp.a.a().a(true));
   private static final Set<bqb<?>> b = ImmutableSet.of(bqb.bx, bqb.d, bqb.af, bqb.aR, bqb.bi);
   private final cmg c;
   private final cmg d;
   private final Map<bqb<?>, Map<ajt, enj.a>> e = Maps.newHashMap();

   protected lu(cmg $$0) {
      this($$0, $$0);
   }

   protected lu(cmg $$0, cmg $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static enj.a a(cyw $$0) {
      return enj.b().a(eni.a().a(eqv.a(1.0F)).a(enr.a($$0))).a(eni.a().a(eqv.a(1.0F)).a(enx.a(bqb.aI.j())));
   }

   public abstract void a();

   @Override
   public void generate(in.a $$0, BiConsumer<ajt, enj.a> $$1) {
      this.a();
      Set<ajt> $$2 = Sets.newHashSet();
      kr.g
         .h()
         .forEach(
            $$2x -> {
               bqb<?> $$3 = (bqb<?>)$$2x.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<ajt, enj.a> $$4 = this.e.remove($$3);
                     ajt $$5 = $$3.j();
                     if (!$$5.equals(emz.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
                        throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$5, $$2x.h().a()));
                     }

                     if ($$4 != null) {
                        $$4.forEach(($$3x, $$4x) -> {
                           if (!$$2.add($$3x)) {
                              throw new IllegalStateException(String.format(Locale.ROOT, "Duplicate loottable '%s' for '%s'", $$3x, $$2x.h().a()));
                           } else {
                              $$1.accept($$3x, $$4x);
                           }
                        });
                     }
                  } else {
                     Map<ajt, enj.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(ajt::toString).collect(Collectors.joining(",")),
                              $$2x.h().a()
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

   private static boolean a(bqb<?> $$0) {
      return b.contains($$0) || $$0.f() != bqr.h;
   }

   protected eqc.a b() {
      return epw.a(bg.a.a().b(br.a.a().a(bqb.R)));
   }

   protected eqc.a a(cco $$0) {
      return epw.a(bg.a.a().b(br.a.a().a(bqb.R).a(bs.a($$0))));
   }

   protected void a(bqb<?> $$0, enj.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(bqb<?> $$0, ajt $$1, enj.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
