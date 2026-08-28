import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface gdn {
   static gdn.a a(ezs $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static gdn.a a(Map<gdv, ezs> $$0, ezs $$1) {
      return new gdn.a($$1, $$0);
   }

   fab getBuffer(gdv var1);

   public static class a implements gdn {
      protected final ezs a;
      protected final Map<gdv, ezs> b;
      protected Optional<gdv> c = Optional.empty();
      protected final Set<ezs> d = Sets.newHashSet();

      protected a(ezs $$0, Map<gdv, ezs> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fab getBuffer(gdv $$0) {
         Optional<gdv> $$1 = $$0.P();
         ezs $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.O()) {
            if (this.c.isPresent()) {
               gdv $$3 = this.c.get();
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

      private ezs b(gdv $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            gdv $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            fab $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (gdv $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gdv $$0) {
         ezs $$1 = this.b($$0);
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
