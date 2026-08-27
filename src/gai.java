import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface gai {
   static gai.a a(ewm $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static gai.a a(Map<gaq, ewm> $$0, ewm $$1) {
      return new gai.a($$1, $$0);
   }

   ewv getBuffer(gaq var1);

   public static class a implements gai {
      protected final ewm a;
      protected final Map<gaq, ewm> b;
      protected Optional<gaq> c = Optional.empty();
      protected final Set<ewm> d = Sets.newHashSet();

      protected a(ewm $$0, Map<gaq, ewm> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public ewv getBuffer(gaq $$0) {
         Optional<gaq> $$1 = $$0.P();
         ewm $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.O()) {
            if (this.c.isPresent()) {
               gaq $$3 = this.c.get();
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

      private ewm b(gaq $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            gaq $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            ewv $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (gaq $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gaq $$0) {
         ewm $$1 = this.b($$0);
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
