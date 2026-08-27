import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class mh implements mj {
   protected static final br.a a = br.a.a().a(bp.a.a().a(true));
   private static final Set<bsa<?>> b = ImmutableSet.of(bsa.by, bsa.d, bsa.af, bsa.aS, bsa.bj);
   private final coj c;
   private final coj d;
   private final Map<bsa<?>, Map<akl<epk>, epk.a>> e = Maps.newHashMap();

   protected mh(coj $$0) {
      this($$0, $$0);
   }

   protected mh(coj $$0, coj $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static epk.a a(daw $$0) {
      return epk.b().a(epj.a().a(ete.a(1.0F)).a(eps.a($$0))).a(epj.a().a(ete.a(1.0F)).a(epy.a(bsa.aJ.k())));
   }

   public abstract void a();

   @Override
   public void generate(iz.a $$0, BiConsumer<akl<epk>, epk.a> $$1) {
      this.a();
      Set<akl<epk>> $$2 = new HashSet<>();
      le.g
         .h()
         .forEach(
            $$2x -> {
               bsa<?> $$3 = (bsa<?>)$$2x.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<akl<epk>, epk.a> $$4 = this.e.remove($$3);
                     akl<epk> $$5 = $$3.k();
                     if ($$5 != epd.a && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<akl<epk>, epk.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map($$0xx -> $$0xx.a().toString()).collect(Collectors.joining(",")),
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

   private static boolean a(bsa<?> $$0) {
      return b.contains($$0) || $$0.f() != bsr.h;
   }

   protected esl.a b() {
      return esf.a(bg.a.a().b(br.a.a().a(bsa.R)));
   }

   protected esl.a a(akl<cep> $$0) {
      return esf.a(bg.a.a().b(br.a.a().a(bsa.R).a(bt.b(le.al.g($$0)))));
   }

   protected void a(bsa<?> $$0, epk.a $$1) {
      this.a($$0, $$0.k(), $$1);
   }

   protected void a(bsa<?> $$0, akl<epk> $$1, epk.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
