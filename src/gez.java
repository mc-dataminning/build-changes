import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface gez {
   static gez.a a(fbf $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static gez.a a(SequencedMap<gfh, fbf> $$0, fbf $$1) {
      return new gez.a($$1, $$0);
   }

   fbm getBuffer(gfh var1);

   public static class a implements gez {
      protected final fbf a;
      protected final SequencedMap<gfh, fbf> b;
      protected final Map<gfh, fbd> c = new HashMap<>();
      @Nullable
      protected gfh d;

      protected a(fbf $$0, SequencedMap<gfh, fbf> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fbm getBuffer(gfh $$0) {
         fbd $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.P()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            fbf $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fbd($$2, $$0.L(), $$0.K());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fbd(this.a, $$0.L(), $$0.K());
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

         for (gfh $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gfh $$0) {
         fbd $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gfh $$0, fbd $$1) {
         fbh $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.Q()) {
               fbf $$3 = this.b.getOrDefault($$0, this.a);
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
