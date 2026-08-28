import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface gex {
   static gex.a a(fbd $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static gex.a a(SequencedMap<gff, fbd> $$0, fbd $$1) {
      return new gex.a($$1, $$0);
   }

   fbk getBuffer(gff var1);

   public static class a implements gex {
      protected final fbd a;
      protected final SequencedMap<gff, fbd> b;
      protected final Map<gff, fbb> c = new HashMap<>();
      @Nullable
      protected gff d;

      protected a(fbd $$0, SequencedMap<gff, fbd> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fbk getBuffer(gff $$0) {
         fbb $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.O()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            fbd $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fbb($$2, $$0.K(), $$0.J());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fbb(this.a, $$0.K(), $$0.J());
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

         for (gff $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gff $$0) {
         fbb $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gff $$0, fbb $$1) {
         fbf $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.P()) {
               fbd $$3 = this.b.getOrDefault($$0, this.a);
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
