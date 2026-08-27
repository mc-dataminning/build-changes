import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface gck {
   static gck.a a(eyp $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static gck.a a(Map<gcs, eyp> $$0, eyp $$1) {
      return new gck.a($$1, $$0);
   }

   eyy getBuffer(gcs var1);

   public static class a implements gck {
      protected final eyp a;
      protected final Map<gcs, eyp> b;
      protected Optional<gcs> c = Optional.empty();
      protected final Set<eyp> d = Sets.newHashSet();

      protected a(eyp $$0, Map<gcs, eyp> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public eyy getBuffer(gcs $$0) {
         Optional<gcs> $$1 = $$0.P();
         eyp $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.O()) {
            if (this.c.isPresent()) {
               gcs $$3 = this.c.get();
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

      private eyp b(gcs $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            gcs $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            eyy $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (gcs $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gcs $$0) {
         eyp $$1 = this.b($$0);
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
