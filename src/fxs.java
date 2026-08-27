import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface fxs {
   static fxs.a a(etw $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static fxs.a a(Map<fya, etw> $$0, etw $$1) {
      return new fxs.a($$1, $$0);
   }

   euf getBuffer(fya var1);

   public static class a implements fxs {
      protected final etw a;
      protected final Map<fya, etw> b;
      protected Optional<fya> c = Optional.empty();
      protected final Set<etw> d = Sets.newHashSet();

      protected a(etw $$0, Map<fya, etw> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public euf getBuffer(fya $$0) {
         Optional<fya> $$1 = $$0.P();
         etw $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.O()) {
            if (this.c.isPresent()) {
               fya $$3 = this.c.get();
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

      private etw b(fya $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            fya $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            euf $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (fya $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(fya $$0) {
         etw $$1 = this.b($$0);
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
