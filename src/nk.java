import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class nk implements nm {
   protected final ji.a a;
   private final cvj b;
   private final cvj c;
   private final Map<bxe<?>, Map<alj<fao>, fao.a>> d = Maps.newHashMap();

   protected final fdg.a a() {
      ji.b<dgn> $$0 = this.a.e(mi.aR);
      return fdg.a(
         fdv.a(faj.b.a, bz.a.a().a(bx.a.a().b(true))),
         fdv.a(faj.b.c, bz.a.a().a(bw.a.a().f(cn.a.a().a(bo.a.a().a(kv.b, kw.a(List.of(new bu($$0.b(axi.p), cx.d.c)))).b()))))
      );
   }

   protected nk(cvj $$0, ji.a $$1) {
      this($$0, $$0, $$1);
   }

   protected nk(cvj $$0, cvj $$1, ji.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static fan.a a(Map<cyy, alj<fao>> $$0) {
      faq.a $$1 = faq.a();

      for (Entry<cyy, alj<fao>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(fbc.a($$2.getValue()).a(fdv.a(faj.b.a, bz.a.a().a(bo.a.a().a(kf.a(kl.aR, $$2.getKey())).b()).a(dj.b()))));
      }

      return fan.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<alj<fao>, fao.a> $$0) {
      this.b();
      Set<alj<fao>> $$1 = new HashSet<>();
      mh.f
         .c()
         .forEach(
            $$2 -> {
               bxe<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<alj<fao>> $$4 = $$3.j();
                  if ($$4.isPresent()) {
                     Map<alj<fao>, fao.a> $$5 = this.d.remove($$3);
                     if ($$3.a(this.c) && ($$5 == null || !$$5.containsKey($$4.get()))) {
                        throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$4.get(), $$2.h().a()));
                     }

                     if ($$5 != null) {
                        $$5.forEach(($$3x, $$4x) -> {
                           if (!$$1.add($$3x)) {
                              throw new IllegalStateException(String.format(Locale.ROOT, "Duplicate loottable '%s' for '%s'", $$3x, $$2.h().a()));
                           } else {
                              $$0.accept($$3x, $$4x);
                           }
                        });
                     }
                  } else {
                     Map<alj<fao>, fao.a> $$6 = this.d.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map($$0xx -> $$0xx.a().toString()).collect(Collectors.joining(",")),
                              $$2.h().a()
                           )
                        );
                     }
                  }
               }
            }
         );
      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created loot tables for entities not supported by datapack: " + this.d.keySet());
      }
   }

   protected fds.a a(jh<bxe<?>> $$0) {
      return fdl.a(bn.a.a().b(bz.a.a().a($$0, bxe.ac)));
   }

   protected fds.a a(jh<bxe<?>> $$0, jh<cll> $$1, alj<cll> $$2) {
      return fdl.a(bn.a.a().b(bz.a.a().a($$0, bxe.ac).a(bo.a.a().a(kf.a(kl.aK, $$1.b($$2))).b())));
   }

   protected void a(bxe<?> $$0, fao.a $$1) {
      this.a($$0, $$0.j().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(bxe<?> $$0, alj<fao> $$1, fao.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
