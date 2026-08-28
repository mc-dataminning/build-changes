import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface glx {
   static glx.a a(ffq $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static glx.a a(SequencedMap<gmh, ffq> $$0, ffq $$1) {
      return new glx.a($$1, $$0);
   }

   ffx getBuffer(gmh var1);

   public static class a implements glx {
      protected final ffq a;
      protected final SequencedMap<gmh, ffq> b;
      protected final Map<gmh, ffo> c = new HashMap<>();
      @Nullable
      protected gmh d;

      protected a(ffq $$0, SequencedMap<gmh, ffq> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public ffx getBuffer(gmh $$0) {
         ffo $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.X()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            ffq $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new ffo($$2, $$0.T(), $$0.S());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new ffo(this.a, $$0.T(), $$0.S());
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

         for (gmh $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gmh $$0) {
         ffo $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gmh $$0, ffo $$1) {
         ffs $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.Y()) {
               ffq $$3 = this.b.getOrDefault($$0, this.a);
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
