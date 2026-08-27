import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface fxq {
   static fxq.a a(etu $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static fxq.a a(Map<fxy, etu> $$0, etu $$1) {
      return new fxq.a($$1, $$0);
   }

   eud getBuffer(fxy var1);

   public static class a implements fxq {
      protected final etu a;
      protected final Map<fxy, etu> b;
      protected Optional<fxy> c = Optional.empty();
      protected final Set<etu> d = Sets.newHashSet();

      protected a(etu $$0, Map<fxy, etu> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public eud getBuffer(fxy $$0) {
         Optional<fxy> $$1 = $$0.P();
         etu $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.O()) {
            if (this.c.isPresent()) {
               fxy $$3 = this.c.get();
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

      private etu b(fxy $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            fxy $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            eud $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (fxy $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(fxy $$0) {
         etu $$1 = this.b($$0);
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
