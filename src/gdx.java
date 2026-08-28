import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface gdx {
   static gdx.a a(fab $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static gdx.a a(Map<gef, fab> $$0, fab $$1) {
      return new gdx.a($$1, $$0);
   }

   fak getBuffer(gef var1);

   public static class a implements gdx {
      protected final fab a;
      protected final Map<gef, fab> b;
      protected Optional<gef> c = Optional.empty();
      protected final Set<fab> d = Sets.newHashSet();

      protected a(fab $$0, Map<gef, fab> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fak getBuffer(gef $$0) {
         Optional<gef> $$1 = $$0.P();
         fab $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.O()) {
            if (this.c.isPresent()) {
               gef $$3 = this.c.get();
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

      private fab b(gef $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            gef $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            fak $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (gef $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gef $$0) {
         fab $$1 = this.b($$0);
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
