import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface gdo {
   static gdo.a a(ezt $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static gdo.a a(Map<gdw, ezt> $$0, ezt $$1) {
      return new gdo.a($$1, $$0);
   }

   fac getBuffer(gdw var1);

   public static class a implements gdo {
      protected final ezt a;
      protected final Map<gdw, ezt> b;
      protected Optional<gdw> c = Optional.empty();
      protected final Set<ezt> d = Sets.newHashSet();

      protected a(ezt $$0, Map<gdw, ezt> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fac getBuffer(gdw $$0) {
         Optional<gdw> $$1 = $$0.P();
         ezt $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.O()) {
            if (this.c.isPresent()) {
               gdw $$3 = this.c.get();
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

      private ezt b(gdw $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            gdw $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            fac $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (gdw $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gdw $$0) {
         ezt $$1 = this.b($$0);
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
