import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface gdj {
   static gdj.a a(ezo $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static gdj.a a(Map<gdr, ezo> $$0, ezo $$1) {
      return new gdj.a($$1, $$0);
   }

   ezx getBuffer(gdr var1);

   public static class a implements gdj {
      protected final ezo a;
      protected final Map<gdr, ezo> b;
      protected Optional<gdr> c = Optional.empty();
      protected final Set<ezo> d = Sets.newHashSet();

      protected a(ezo $$0, Map<gdr, ezo> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public ezx getBuffer(gdr $$0) {
         Optional<gdr> $$1 = $$0.P();
         ezo $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.O()) {
            if (this.c.isPresent()) {
               gdr $$3 = this.c.get();
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

      private ezo b(gdr $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            gdr $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            ezx $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (gdr $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gdr $$0) {
         ezo $$1 = this.b($$0);
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
