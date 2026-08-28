import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface gly {
   static gly.a a(ffr $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static gly.a a(SequencedMap<gmi, ffr> $$0, ffr $$1) {
      return new gly.a($$1, $$0);
   }

   ffy getBuffer(gmi var1);

   public static class a implements gly {
      protected final ffr a;
      protected final SequencedMap<gmi, ffr> b;
      protected final Map<gmi, ffp> c = new HashMap<>();
      @Nullable
      protected gmi d;

      protected a(ffr $$0, SequencedMap<gmi, ffr> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public ffy getBuffer(gmi $$0) {
         ffp $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.X()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            ffr $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new ffp($$2, $$0.T(), $$0.S());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new ffp(this.a, $$0.T(), $$0.S());
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

         for (gmi $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gmi $$0) {
         ffp $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gmi $$0, ffp $$1) {
         fft $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.Y()) {
               ffr $$3 = this.b.getOrDefault($$0, this.a);
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
