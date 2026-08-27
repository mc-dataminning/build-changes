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
   private static final Set<bnw<?>> b = ImmutableSet.of(bnw.bw, bnw.e, bnw.ae, bnw.aQ, bnw.bh);
   private final cjw c;
   private final cjw d;
   private final Map<bnw<?>, Map<aiy, ejk.a>> e = Maps.newHashMap();

   protected lh(cjw $$0) {
      this($$0, $$0);
   }

   protected lh(cjw $$0, cjw $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static ejk.a a(cvq $$0) {
      return ejk.b().a(ejj.a().a(emu.a(1.0F)).a(ejs.a($$0))).a(ejj.a().a(emu.a(1.0F)).a(ejy.a(bnw.aH.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<aiy, ejk.a> $$0) {
      this.a();
      Set<aiy> $$1 = Sets.newHashSet();
      kf.g
         .h()
         .forEach(
            $$2 -> {
               bnw<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<aiy, ejk.a> $$4 = this.e.remove($$3);
                     aiy $$5 = $$3.j();
                     if (!$$5.equals(eja.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<aiy, ejk.a> $$6 = this.e.remove($$3);
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

   private static boolean a(bnw<?> $$0) {
      return b.contains($$0) || $$0.f() != bol.h;
   }

   protected emb.a b() {
      return elv.a(bg.a.a().b(br.a.a().a(bnw.Q)));
   }

   protected emb.a a(cai $$0) {
      return elv.a(bg.a.a().b(br.a.a().a(bnw.Q).a(bs.a($$0))));
   }

   protected void a(bnw<?> $$0, ejk.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(bnw<?> $$0, aiy $$1, ejk.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
