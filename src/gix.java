import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface gix {
   static gix.a a(feh $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static gix.a a(SequencedMap<gjh, feh> $$0, feh $$1) {
      return new gix.a($$1, $$0);
   }

   feo getBuffer(gjh var1);

   public static class a implements gix {
      protected final feh a;
      protected final SequencedMap<gjh, feh> b;
      protected final Map<gjh, fef> c = new HashMap<>();
      @Nullable
      protected gjh d;

      protected a(feh $$0, SequencedMap<gjh, feh> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public feo getBuffer(gjh $$0) {
         fef $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.S()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            feh $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fef($$2, $$0.O(), $$0.N());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fef(this.a, $$0.O(), $$0.N());
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

         for (gjh $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gjh $$0) {
         fef $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gjh $$0, fef $$1) {
         fej $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.T()) {
               feh $$3 = this.b.getOrDefault($$0, this.a);
               $$2.a($$3, RenderSystem.getVertexSorting());
            }

            $$0.a($$2);
         }

         if ($$0.equals(this.d)) {
            this.d = null;
         }
      }
   }
}
