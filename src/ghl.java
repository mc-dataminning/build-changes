import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface ghl {
   static ghl.a a(fdf $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static ghl.a a(SequencedMap<ghv, fdf> $$0, fdf $$1) {
      return new ghl.a($$1, $$0);
   }

   fdm getBuffer(ghv var1);

   public static class a implements ghl {
      protected final fdf a;
      protected final SequencedMap<ghv, fdf> b;
      protected final Map<ghv, fdd> c = new HashMap<>();
      @Nullable
      protected ghv d;

      protected a(fdf $$0, SequencedMap<ghv, fdf> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fdm getBuffer(ghv $$0) {
         fdd $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.S()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            fdf $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fdd($$2, $$0.O(), $$0.N());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fdd(this.a, $$0.O(), $$0.N());
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

         for (ghv $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(ghv $$0) {
         fdd $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(ghv $$0, fdd $$1) {
         fdh $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.T()) {
               fdf $$3 = this.b.getOrDefault($$0, this.a);
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
