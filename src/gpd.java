import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface gpd {
   static gpd.a a(fin $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static gpd.a a(SequencedMap<gpn, fin> $$0, fin $$1) {
      return new gpd.a($$1, $$0);
   }

   fiu getBuffer(gpn var1);

   public static class a implements gpd {
      protected final fin a;
      protected final SequencedMap<gpn, fin> b;
      protected final Map<gpn, fil> c = new HashMap<>();
      @Nullable
      protected gpn d;

      protected a(fin $$0, SequencedMap<gpn, fin> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fiu getBuffer(gpn $$0) {
         fil $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.X()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            fin $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fil($$2, $$0.T(), $$0.S());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fil(this.a, $$0.T(), $$0.S());
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

         for (gpn $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gpn $$0) {
         fil $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gpn $$0, fil $$1) {
         fip $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.Y()) {
               fin $$3 = this.b.getOrDefault($$0, this.a);
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
