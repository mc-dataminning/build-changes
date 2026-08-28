import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface glz {
   static glz.a a(ffs $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static glz.a a(SequencedMap<gmj, ffs> $$0, ffs $$1) {
      return new glz.a($$1, $$0);
   }

   ffz getBuffer(gmj var1);

   public static class a implements glz {
      protected final ffs a;
      protected final SequencedMap<gmj, ffs> b;
      protected final Map<gmj, ffq> c = new HashMap<>();
      @Nullable
      protected gmj d;

      protected a(ffs $$0, SequencedMap<gmj, ffs> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public ffz getBuffer(gmj $$0) {
         ffq $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.X()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            ffs $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new ffq($$2, $$0.T(), $$0.S());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new ffq(this.a, $$0.T(), $$0.S());
               this.d = $$0;
            }

            this.c.put($$0, $$1);
            return $$1;
         }
      }

      public void a() {
         if (this.d != null) {
            this.a(this.d);
            this.d = null;
         }
      }

      public void b() {
         this.a();

         for (gmj $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gmj $$0) {
         ffq $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gmj $$0, ffq $$1) {
         ffu $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.Y()) {
               ffs $$3 = this.b.getOrDefault($$0, this.a);
               $$2.a($$3, RenderSystem.getProjectionType().a());
            }

            $$0.a($$2);
         }

         if ($$0.equals(this.d)) {
            this.d = null;
         }
      }
   }
}
