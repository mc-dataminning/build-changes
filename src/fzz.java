import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface fzz {
   static fzz.a a(ewd $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static fzz.a a(Map<gah, ewd> $$0, ewd $$1) {
      return new fzz.a($$1, $$0);
   }

   ewm getBuffer(gah var1);

   public static class a implements fzz {
      protected final ewd a;
      protected final Map<gah, ewd> b;
      protected Optional<gah> c = Optional.empty();
      protected final Set<ewd> d = Sets.newHashSet();

      protected a(ewd $$0, Map<gah, ewd> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public ewm getBuffer(gah $$0) {
         Optional<gah> $$1 = $$0.P();
         ewd $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.O()) {
            if (this.c.isPresent()) {
               gah $$3 = this.c.get();
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

      private ewd b(gah $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            gah $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            ewm $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (gah $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gah $$0) {
         ewd $$1 = this.b($$0);
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
