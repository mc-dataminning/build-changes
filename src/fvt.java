import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface fvt {
   static fvt.a a(esc $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static fvt.a a(Map<fwb, esc> $$0, esc $$1) {
      return new fvt.a($$1, $$0);
   }

   esl getBuffer(fwb var1);

   public static class a implements fvt {
      protected final esc a;
      protected final Map<fwb, esc> b;
      protected Optional<fwb> c = Optional.empty();
      protected final Set<esc> d = Sets.newHashSet();

      protected a(esc $$0, Map<fwb, esc> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public esl getBuffer(fwb $$0) {
         Optional<fwb> $$1 = $$0.N();
         esc $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.M()) {
            if (this.c.isPresent()) {
               fwb $$3 = this.c.get();
               if (!this.b.containsKey($$3)) {
                  this.a($$3);
               }
            }

            if (this.d.add($$2)) {
               $$2.a($$0.I(), $$0.H());
            }

            this.c = $$1;
         }

         return $$2;
      }

      private esc b(fwb $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            fwb $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            esl $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (fwb $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(fwb $$0) {
         esc $$1 = this.b($$0);
         boolean $$2 = Objects.equals(this.c, $$0.N());
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
