import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface glj {
   static glj.a a(fgn $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static glj.a a(SequencedMap<glt, fgn> $$0, fgn $$1) {
      return new glj.a($$1, $$0);
   }

   fgu getBuffer(glt var1);

   public static class a implements glj {
      protected final fgn a;
      protected final SequencedMap<glt, fgn> b;
      protected final Map<glt, fgl> c = new HashMap<>();
      @Nullable
      protected glt d;

      protected a(fgn $$0, SequencedMap<glt, fgn> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fgu getBuffer(glt $$0) {
         fgl $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.T()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            fgn $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fgl($$2, $$0.P(), $$0.O());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fgl(this.a, $$0.P(), $$0.O());
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

         for (glt $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(glt $$0) {
         fgl $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(glt $$0, fgl $$1) {
         fgp $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.U()) {
               fgn $$3 = this.b.getOrDefault($$0, this.a);
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
