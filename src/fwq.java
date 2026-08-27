import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface fwq {
   static fwq.a a(esy $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static fwq.a a(Map<fwy, esy> $$0, esy $$1) {
      return new fwq.a($$1, $$0);
   }

   eth getBuffer(fwy var1);

   public static class a implements fwq {
      protected final esy a;
      protected final Map<fwy, esy> b;
      protected Optional<fwy> c = Optional.empty();
      protected final Set<esy> d = Sets.newHashSet();

      protected a(esy $$0, Map<fwy, esy> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public eth getBuffer(fwy $$0) {
         Optional<fwy> $$1 = $$0.P();
         esy $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.O()) {
            if (this.c.isPresent()) {
               fwy $$3 = this.c.get();
               if (!this.b.containsKey($$3)) {
                  this.a($$3);
               }
            }

            if (this.d.add($$2)) {
               $$2.a($$0.K(), $$0.J());
            }

            this.c = $$1;
         }

         return $$2;
      }

      private esy b(fwy $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            fwy $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            eth $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (fwy $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(fwy $$0) {
         esy $$1 = this.b($$0);
         boolean $$2 = Objects.equals(this.c, $$0.P());
         if ($$2 || $$1 != this.a) {
            if (this.d.remove($$1)) {
               $$0.a($$1, RenderSystem.getVertexSorting());
               if ($$2) {
                  this.c = Optional.empty();
               }
            }
         }
      }
   }
}
