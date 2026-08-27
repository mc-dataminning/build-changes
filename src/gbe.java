import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface gbe {
   static gbe.a a(exi $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static gbe.a a(Map<gbm, exi> $$0, exi $$1) {
      return new gbe.a($$1, $$0);
   }

   exr getBuffer(gbm var1);

   public static class a implements gbe {
      protected final exi a;
      protected final Map<gbm, exi> b;
      protected Optional<gbm> c = Optional.empty();
      protected final Set<exi> d = Sets.newHashSet();

      protected a(exi $$0, Map<gbm, exi> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public exr getBuffer(gbm $$0) {
         Optional<gbm> $$1 = $$0.P();
         exi $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.O()) {
            if (this.c.isPresent()) {
               gbm $$3 = this.c.get();
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

      private exi b(gbm $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            gbm $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            exr $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (gbm $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gbm $$0) {
         exi $$1 = this.b($$0);
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
