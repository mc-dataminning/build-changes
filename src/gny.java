import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface gny {
   static gny.a a(fhl $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static gny.a a(SequencedMap<goi, fhl> $$0, fhl $$1) {
      return new gny.a($$1, $$0);
   }

   fhs getBuffer(goi var1);

   public static class a implements gny {
      protected final fhl a;
      protected final SequencedMap<goi, fhl> b;
      protected final Map<goi, fhj> c = new HashMap<>();
      @Nullable
      protected goi d;

      protected a(fhl $$0, SequencedMap<goi, fhl> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fhs getBuffer(goi $$0) {
         fhj $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.X()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            fhl $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fhj($$2, $$0.T(), $$0.S());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fhj(this.a, $$0.T(), $$0.S());
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

         for (goi $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(goi $$0) {
         fhj $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(goi $$0, fhj $$1) {
         fhn $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.Y()) {
               fhl $$3 = this.b.getOrDefault($$0, this.a);
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
