import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface gef {
   static gef.a a(faj $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static gef.a a(Map<gen, faj> $$0, faj $$1) {
      return new gef.a($$1, $$0);
   }

   fas getBuffer(gen var1);

   public static class a implements gef {
      protected final faj a;
      protected final Map<gen, faj> b;
      protected Optional<gen> c = Optional.empty();
      protected final Set<faj> d = Sets.newHashSet();

      protected a(faj $$0, Map<gen, faj> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fas getBuffer(gen $$0) {
         Optional<gen> $$1 = $$0.P();
         faj $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.O()) {
            if (this.c.isPresent()) {
               gen $$3 = this.c.get();
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

      private faj b(gen $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            gen $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            fas $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (gen $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gen $$0) {
         faj $$1 = this.b($$0);
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
