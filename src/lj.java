import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class lj implements ll {
   protected static final br.a a = br.a.a().a(bp.a.a().a(true));
   private static final Set<bol<?>> b = ImmutableSet.of(bol.bw, bol.e, bol.ae, bol.aQ, bol.bh);
   private final ckl c;
   private final ckl d;
   private final Map<bol<?>, Map<ajc, ekg.a>> e = Maps.newHashMap();

   protected lj(ckl $$0) {
      this($$0, $$0);
   }

   protected lj(ckl $$0, ckl $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static ekg.a a(cwd $$0) {
      return ekg.b().a(ekf.a().a(enq.a(1.0F)).a(eko.a($$0))).a(ekf.a().a(enq.a(1.0F)).a(eku.a(bol.aH.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<ajc, ekg.a> $$0) {
      this.a();
      Set<ajc> $$1 = Sets.newHashSet();
      kh.g
         .h()
         .forEach(
            $$2 -> {
               bol<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<ajc, ekg.a> $$4 = this.e.remove($$3);
                     ajc $$5 = $$3.j();
                     if (!$$5.equals(ejw.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<ajc, ekg.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(ajc::toString).collect(Collectors.joining(",")),
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

   private static boolean a(bol<?> $$0) {
      return b.contains($$0) || $$0.f() != bpa.h;
   }

   protected emx.a b() {
      return emr.a(bg.a.a().b(br.a.a().a(bol.Q)));
   }

   protected emx.a a(cax $$0) {
      return emr.a(bg.a.a().b(br.a.a().a(bol.Q).a(bs.a($$0))));
   }

   protected void a(bol<?> $$0, ekg.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(bol<?> $$0, ajc $$1, ekg.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
