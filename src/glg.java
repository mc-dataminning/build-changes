import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface glg {
   static glg.a a(fgi $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static glg.a a(SequencedMap<glq, fgi> $$0, fgi $$1) {
      return new glg.a($$1, $$0);
   }

   fgp getBuffer(glq var1);

   public static class a implements glg {
      protected final fgi a;
      protected final SequencedMap<glq, fgi> b;
      protected final Map<glq, fgg> c = new HashMap<>();
      @Nullable
      protected glq d;

      protected a(fgi $$0, SequencedMap<glq, fgi> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fgp getBuffer(glq $$0) {
         fgg $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.X()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            fgi $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fgg($$2, $$0.T(), $$0.S());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fgg(this.a, $$0.T(), $$0.S());
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

         for (glq $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(glq $$0) {
         fgg $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(glq $$0, fgg $$1) {
         fgk $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.Y()) {
               fgi $$3 = this.b.getOrDefault($$0, this.a);
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
