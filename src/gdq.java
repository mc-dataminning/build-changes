import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface gdq {
   static gdq.a a(ezv $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static gdq.a a(Map<gdy, ezv> $$0, ezv $$1) {
      return new gdq.a($$1, $$0);
   }

   fae getBuffer(gdy var1);

   public static class a implements gdq {
      protected final ezv a;
      protected final Map<gdy, ezv> b;
      protected Optional<gdy> c = Optional.empty();
      protected final Set<ezv> d = Sets.newHashSet();

      protected a(ezv $$0, Map<gdy, ezv> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fae getBuffer(gdy $$0) {
         Optional<gdy> $$1 = $$0.P();
         ezv $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.O()) {
            if (this.c.isPresent()) {
               gdy $$3 = this.c.get();
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

      private ezv b(gdy $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            gdy $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            fae $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (gdy $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gdy $$0) {
         ezv $$1 = this.b($$0);
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
