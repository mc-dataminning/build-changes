import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface gdp {
   static gdp.a a(ezu $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static gdp.a a(Map<gdx, ezu> $$0, ezu $$1) {
      return new gdp.a($$1, $$0);
   }

   fad getBuffer(gdx var1);

   public static class a implements gdp {
      protected final ezu a;
      protected final Map<gdx, ezu> b;
      protected Optional<gdx> c = Optional.empty();
      protected final Set<ezu> d = Sets.newHashSet();

      protected a(ezu $$0, Map<gdx, ezu> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fad getBuffer(gdx $$0) {
         Optional<gdx> $$1 = $$0.P();
         ezu $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.O()) {
            if (this.c.isPresent()) {
               gdx $$3 = this.c.get();
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

      private ezu b(gdx $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            gdx $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            fad $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (gdx $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gdx $$0) {
         ezu $$1 = this.b($$0);
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
