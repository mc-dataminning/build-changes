import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class lf implements lh {
   protected static final bp.a a = bp.a.a().a(bn.a.a().a(true));
   private static final Set<blz<?>> b = ImmutableSet.of(blz.bv, blz.d, blz.ad, blz.aP, blz.bg);
   private final chs c;
   private final chs d;
   private final Map<blz<?>, Map<ahg, ehe.a>> e = Maps.newHashMap();

   protected lf(chs $$0) {
      this($$0, $$0);
   }

   protected lf(chs $$0, chs $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static ehe.a a(cto $$0) {
      return ehe.b().a(ehd.a().a(eko.a(1.0F)).a(ehm.a($$0))).a(ehd.a().a(eko.a(1.0F)).a(ehs.a(blz.aG.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<ahg, ehe.a> $$0) {
      this.a();
      Set<ahg> $$1 = Sets.newHashSet();
      kd.g
         .h()
         .forEach(
            $$2 -> {
               blz<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<ahg, ehe.a> $$4 = this.e.remove($$3);
                     ahg $$5 = $$3.j();
                     if (!$$5.equals(egu.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<ahg, ehe.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(ahg::toString).collect(Collectors.joining(",")),
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

   private static boolean a(blz<?> $$0) {
      return b.contains($$0) || $$0.f() != bmo.h;
   }

   protected ejv.a b() {
      return ejp.a(bf.a.a().b(bp.a.a().a(blz.P)));
   }

   protected ejv.a a(byj $$0) {
      return ejp.a(bf.a.a().b(bp.a.a().a(blz.P).a(bq.a($$0))));
   }

   protected void a(blz<?> $$0, ehe.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(blz<?> $$0, ahg $$1, ehe.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
