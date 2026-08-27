import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface gfg {
   static gfg.a a(fax $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static gfg.a a(Map<gfo, fax> $$0, fax $$1) {
      return new gfg.a($$1, $$0);
   }

   fbg getBuffer(gfo var1);

   public static class a implements gfg {
      protected final fax a;
      protected final Map<gfo, fax> b;
      protected Optional<gfo> c = Optional.empty();
      protected final Set<fax> d = Sets.newHashSet();

      protected a(fax $$0, Map<gfo, fax> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fbg getBuffer(gfo $$0) {
         Optional<gfo> $$1 = $$0.Q();
         fax $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.P()) {
            if (this.c.isPresent()) {
               gfo $$3 = this.c.get();
               if (!this.b.containsKey($$3)) {
                  this.a($$3);
               }
            }

            if (this.d.add($$2)) {
               $$2.a($$0.L(), $$0.K());
            }

            this.c = $$1;
         }

         return $$2;
      }

      private fax b(gfo $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            gfo $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            fbg $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (gfo $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gfo $$0) {
         fax $$1 = this.b($$0);
         boolean $$2 = Objects.equals(this.c, $$0.Q());
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
