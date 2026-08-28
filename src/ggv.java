import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface ggv {
   static ggv.a a(fcr $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static ggv.a a(SequencedMap<ghe, fcr> $$0, fcr $$1) {
      return new ggv.a($$1, $$0);
   }

   fcy getBuffer(ghe var1);

   public static class a implements ggv {
      protected final fcr a;
      protected final SequencedMap<ghe, fcr> b;
      protected final Map<ghe, fcp> c = new HashMap<>();
      @Nullable
      protected ghe d;

      protected a(fcr $$0, SequencedMap<ghe, fcr> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fcy getBuffer(ghe $$0) {
         fcp $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.T()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            fcr $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fcp($$2, $$0.P(), $$0.O());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fcp(this.a, $$0.P(), $$0.O());
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

         for (ghe $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(ghe $$0) {
         fcp $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(ghe $$0, fcp $$1) {
         fct $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.U()) {
               fcr $$3 = this.b.getOrDefault($$0, this.a);
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
