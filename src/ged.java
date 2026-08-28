import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface ged {
   static ged.a a(fah $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static ged.a a(Map<gel, fah> $$0, fah $$1) {
      return new ged.a($$1, $$0);
   }

   faq getBuffer(gel var1);

   public static class a implements ged {
      protected final fah a;
      protected final Map<gel, fah> b;
      protected Optional<gel> c = Optional.empty();
      protected final Set<fah> d = Sets.newHashSet();

      protected a(fah $$0, Map<gel, fah> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public faq getBuffer(gel $$0) {
         Optional<gel> $$1 = $$0.P();
         fah $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.O()) {
            if (this.c.isPresent()) {
               gel $$3 = this.c.get();
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

      private fah b(gel $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            gel $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            faq $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (gel $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gel $$0) {
         fah $$1 = this.b($$0);
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
